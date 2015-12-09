// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.util.ViewUtils;
import java.util.concurrent.atomic.AtomicBoolean;

public class NetflixAlertDialog extends NetflixDialogFrag
{
    private static class ActionButtonDescriptor
    {

        private final String buttonId;
        private final String label;

        public String getButtonId()
        {
            return buttonId;
        }

        public String getLabel()
        {
            return label;
        }

        public String toString()
        {
            return (new StringBuilder()).append("ActionButtonDescriptor [labelResourceId=").append(label).append(", buttonId=").append(buttonId).append("]").toString();
        }

        public ActionButtonDescriptor(String s, String s1)
        {
            if (s1 == null || s == null)
            {
                throw new IllegalArgumentException("Button ID and label can not be null!");
            } else
            {
                label = s;
                buttonId = s1;
                return;
            }
        }
    }

    public static class AlertDialogDescriptor
    {

        public static final String ACTION_ID_NEGATIVE_BUTTON_CLICKED = "nflx_negative_button_clicked";
        public static final String ACTION_ID_NEUTRAL_BUTTON_CLICKED = "nflx_neutral_button_clicked";
        public static final String ACTION_ID_POSITIVE_BUTTON_CLICKED = "nflx_positive_button_clicked";
        private final boolean mCancelOnBack;
        private final boolean mCancelOnTouchOutside;
        private final Context mContext;
        private final String mDialogId;
        private final String mMessage;
        private ActionButtonDescriptor mNegativeButton;
        private ActionButtonDescriptor mNeutralButton;
        private ActionButtonDescriptor mPositiveButton;

        public String getDialogId()
        {
            return mDialogId;
        }

        public String getMessage()
        {
            return mMessage;
        }

        public ActionButtonDescriptor getNegativeButton()
        {
            return mNegativeButton;
        }

        public ActionButtonDescriptor getNeutralButton()
        {
            return mNeutralButton;
        }

        public ActionButtonDescriptor getPositiveButton()
        {
            return mPositiveButton;
        }

        public boolean isCancelOnBack()
        {
            return mCancelOnBack;
        }

        public boolean isCancelOnTouchOutside()
        {
            return mCancelOnTouchOutside;
        }

        public void setNegativeButton()
        {
            mNegativeButton = new ActionButtonDescriptor(mContext.getString(0x7f0c0101), "nflx_negative_button_clicked");
        }

        public void setNegativeButton(String s)
        {
            mNegativeButton = new ActionButtonDescriptor(mContext.getString(0x7f0c0101), s);
        }

        public void setNegativeButton(String s, String s1)
        {
            mNegativeButton = new ActionButtonDescriptor(s, s1);
        }

        public void setNeutralButton(String s)
        {
            mNeutralButton = new ActionButtonDescriptor(s, "nflx_neutral_button_clicked");
        }

        public void setNeutralButton(String s, String s1)
        {
            mNeutralButton = new ActionButtonDescriptor(s, s1);
        }

        public void setPositiveButton()
        {
            mPositiveButton = new ActionButtonDescriptor(mContext.getString(0x7f0c0071), "nflx_positive_button_clicked");
        }

        public void setPositiveButton(String s)
        {
            mPositiveButton = new ActionButtonDescriptor(mContext.getString(0x7f0c0071), s);
        }

        public void setPositiveButton(String s, String s1)
        {
            mPositiveButton = new ActionButtonDescriptor(s, s1);
        }

        public AlertDialogDescriptor(Context context, String s, String s1, boolean flag, boolean flag1)
        {
            if (s1 == null)
            {
                throw new IllegalArgumentException("Message can not be null!");
            }
            if (context == null)
            {
                throw new IllegalArgumentException("Context can not be null!");
            }
            if (s == null)
            {
                throw new IllegalArgumentException("Dialog id can not be null!");
            } else
            {
                mDialogId = s;
                mMessage = s1;
                mCancelOnTouchOutside = flag;
                mCancelOnBack = flag1;
                mContext = context;
                return;
            }
        }
    }

    private class AlertDialogOnClickListener
        implements android.view.View.OnClickListener
    {

        private final String mActionId;
        final NetflixAlertDialog this$0;

        public void onClick(View view)
        {
            if (Log.isLoggable("dialog", 3))
            {
                Log.d("dialog", (new StringBuilder()).append("Clicked on ").append(mActionId).toString());
            }
            view = getActivity();
            if (view == null)
            {
                Log.e("dialog", "Activity is NULL, we can update rating!");
                return;
            }
            synchronized (mClicked)
            {
                if (!mClicked.get())
                {
                    break MISSING_BLOCK_LABEL_97;
                }
                Log.w("dialog", "Already clicked!");
            }
            return;
            view;
            atomicboolean;
            JVM INSTR monitorexit ;
            throw view;
            mClicked.set(true);
            atomicboolean;
            JVM INSTR monitorexit ;
            Intent intent = new Intent("nflx_button_selected");
            intent.putExtra("nflx_action_selected", mActionId);
            intent.putExtra("nflx_dialog_id", mDialogId);
            intent.addCategory("LocalIntentNflxUi");
            LocalBroadcastManager.getInstance(getActivity()).sendBroadcast(intent);
            LocalBroadcastManager.getInstance(view).sendBroadcast(intent);
            dismissAllowingStateLoss();
            getFragmentManager().beginTransaction().remove(NetflixAlertDialog.this).commit();
            return;
        }

        public AlertDialogOnClickListener(String s)
        {
            this$0 = NetflixAlertDialog.this;
            super();
            mActionId = s;
        }
    }


    public static final String EXTRA_PARAM_ACTION_ID = "nflx_action_selected";
    public static final String EXTRA_PARAM_DIALOG_ID = "nflx_dialog_id";
    public static final String INTENT_NAME_BUTTON_CANCELED = "nflx_button_canceled";
    public static final String INTENT_NAME_BUTTON_SELECTED = "nflx_button_selected";
    public static final String PARAM_CANCEL_ON_TOUCH_OUTSIDE = "nflx_CancelableOnTouchOutside";
    public static final String PARAM_DIALOG_ID = "nflx_DialogId";
    public static final String PARAM_MESSAGE = "nflx_Message";
    public static final String PARAM_NEGATIVE_BUTTON_ID = "nflx_NegativeButtonId";
    public static final String PARAM_NEGATIVE_BUTTON_LABEL = "nflx_NegativeButtonLabel";
    public static final String PARAM_NEGATIVE_BUTTON_USED = "nflx_NegativeButtonUsed";
    public static final String PARAM_NEUTRAL_BUTTON_ID = "nflx_NeutralButtonId";
    public static final String PARAM_NEUTRAL_BUTTON_LABEL = "nflx_NeutralButtonLabel";
    public static final String PARAM_NEUTRAL_BUTTON_USED = "nflx_NeutralButtonUsed";
    public static final String PARAM_POSITIVE_BUTTON_ID = "nflx_PositiveButtonId";
    public static final String PARAM_POSITIVE_BUTTON_LABEL = "nflx_PositiveButtonLabel";
    public static final String PARAM_POSITIVE_BUTTON_USED = "nflx_PositiveButtonUsed";
    private static final String TAG = "dialog";
    private boolean mCancelableOnTouchOutside;
    private final AtomicBoolean mClicked = new AtomicBoolean(false);
    private String mDialogId;
    private String mMessage;
    private TextView mMessageView;
    private Button mNegativeButton;
    private String mNegativeButtonId;
    private String mNegativeButtonLabel;
    private boolean mNegativeButtonUsed;
    private View mNegativeDivider;
    private Button mNeutralButton;
    private String mNeutralButtonId;
    private String mNeutralButtonLabel;
    private boolean mNeutralButtonUsed;
    private View mNeutralDivider;
    private Button mPositiveButton;
    private String mPositiveButtonId;
    private String mPositiveButtonLabel;
    private boolean mPositiveButtonUsed;

    public NetflixAlertDialog()
    {
        mPositiveButtonId = "nflx_positive_button_clicked";
        mNegativeButtonId = "nflx_negative_button_clicked";
        mNeutralButtonId = "nflx_neutral_button_clicked";
    }

    public static NetflixAlertDialog newInstance(AlertDialogDescriptor alertdialogdescriptor)
    {
        boolean flag1 = true;
        if (alertdialogdescriptor == null)
        {
            throw new IllegalArgumentException("Dialog metadata can not be null!");
        }
        NetflixAlertDialog netflixalertdialog = new NetflixAlertDialog();
        netflixalertdialog.setStyle(1, 0x7f0d00cb);
        netflixalertdialog.setCancelable(alertdialogdescriptor.isCancelOnBack());
        Bundle bundle = new Bundle();
        netflixalertdialog.setArguments(bundle);
        bundle.putString("nflx_Message", alertdialogdescriptor.getMessage());
        bundle.putBoolean("nflx_CancelableOnTouchOutside", alertdialogdescriptor.isCancelOnTouchOutside());
        bundle.putString("nflx_DialogId", alertdialogdescriptor.getMessage());
        if (alertdialogdescriptor.getPositiveButton() == null && alertdialogdescriptor.getNegativeButton() == null && alertdialogdescriptor.getNeutralButton() == null)
        {
            alertdialogdescriptor.setPositiveButton();
        }
        boolean flag;
        if (alertdialogdescriptor.getPositiveButton() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.putBoolean("nflx_PositiveButtonUsed", flag);
        if (alertdialogdescriptor.getPositiveButton() != null)
        {
            bundle.putString("nflx_PositiveButtonLabel", alertdialogdescriptor.getPositiveButton().getLabel());
            bundle.putString("nflx_PositiveButtonId", alertdialogdescriptor.getPositiveButton().getButtonId());
        }
        if (alertdialogdescriptor.getNegativeButton() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.putBoolean("nflx_NegativeButtonUsed", flag);
        if (alertdialogdescriptor.getNegativeButton() != null)
        {
            bundle.putString("nflx_NegativeButtonLabel", alertdialogdescriptor.getNegativeButton().getLabel());
            bundle.putString("nflx_NegativeButtonId", alertdialogdescriptor.getNegativeButton().getButtonId());
        }
        if (alertdialogdescriptor.getNeutralButton() != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        bundle.putBoolean("nflx_NeutralButtonUsed", flag);
        if (alertdialogdescriptor.getNeutralButton() != null)
        {
            bundle.putString("nflx_NeutralButtonLabel", alertdialogdescriptor.getNeutralButton().getLabel());
            bundle.putString("nflx_NeutralButtonId", alertdialogdescriptor.getNeutralButton().getButtonId());
        }
        return netflixalertdialog;
    }

    public boolean isCancelableOnTouchOutside()
    {
        return mCancelableOnTouchOutside;
    }

    public boolean isLoadingData()
    {
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mCancelableOnTouchOutside = getArguments().getBoolean("nflx_CancelableOnTouchOutside");
        mMessage = getArguments().getString("nflx_Message");
        mPositiveButtonUsed = getArguments().getBoolean("nflx_PositiveButtonUsed", false);
        mPositiveButtonId = getArguments().getString("nflx_PositiveButtonId");
        mPositiveButtonLabel = getArguments().getString("nflx_PositiveButtonLabel");
        mNegativeButtonUsed = getArguments().getBoolean("nflx_NegativeButtonUsed", false);
        mNegativeButtonId = getArguments().getString("nflx_NegativeButtonId");
        mNegativeButtonLabel = getArguments().getString("nflx_NegativeButtonLabel");
        mNeutralButtonUsed = getArguments().getBoolean("nflx_NeutralButtonUsed", false);
        mNeutralButtonId = getArguments().getString("nflx_NeutralButtonId");
        mNeutralButtonLabel = getArguments().getString("nflx_NeutralButtonLabel");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030019, viewgroup, false);
        mMessageView = (TextView)layoutinflater.findViewById(0x7f070065);
        mPositiveButton = (Button)layoutinflater.findViewById(0x7f07006a);
        mNegativeButton = (Button)layoutinflater.findViewById(0x7f070066);
        mNeutralButton = (Button)layoutinflater.findViewById(0x7f070068);
        mNegativeDivider = layoutinflater.findViewById(0x7f070067);
        mNeutralDivider = layoutinflater.findViewById(0x7f070069);
        mMessageView.setText(mMessage);
        if (mNeutralButtonUsed)
        {
            mNeutralButton.setText(mNeutralButtonLabel);
            mNeutralButton.setOnClickListener(new AlertDialogOnClickListener(mNeutralButtonId));
        } else
        {
            ViewUtils.setVisibility(mNeutralButton, com.netflix.mediaclient.util.ViewUtils.Visibility.GONE);
            ViewUtils.setVisibility(mNeutralDivider, com.netflix.mediaclient.util.ViewUtils.Visibility.GONE);
        }
        if (mNegativeButtonUsed)
        {
            mNegativeButton.setText(mNegativeButtonLabel);
            mNegativeButton.setOnClickListener(new AlertDialogOnClickListener(mNegativeButtonId));
        } else
        {
            ViewUtils.setVisibility(mNegativeButton, com.netflix.mediaclient.util.ViewUtils.Visibility.GONE);
            ViewUtils.setVisibility(mNegativeDivider, com.netflix.mediaclient.util.ViewUtils.Visibility.GONE);
        }
        if (mPositiveButtonUsed)
        {
            mPositiveButton.setText(mPositiveButtonLabel);
            mPositiveButton.setOnClickListener(new AlertDialogOnClickListener(mPositiveButtonId));
            return layoutinflater;
        } else
        {
            ViewUtils.setVisibility(mPositiveButton, com.netflix.mediaclient.util.ViewUtils.Visibility.GONE);
            return layoutinflater;
        }
    }


}

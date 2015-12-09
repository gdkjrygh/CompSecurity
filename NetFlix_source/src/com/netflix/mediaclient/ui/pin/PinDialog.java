// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.pin;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.util.DeviceUtils;

// Referenced classes of package com.netflix.mediaclient.ui.pin:
//            PinDialogVault, PinVerifier

public class PinDialog extends NetflixDialogFrag
{
    private class OnPinVerifiedCallback extends LoggingManagerCallback
    {

        final PinDialog this$0;

        public void onPinVerified(boolean flag, int i)
        {
            super.onPinVerified(flag, i);
            showProgress(false);
            Log.d("nf_pin", String.format("onPinVerified isPinValid:%b, statusCode:%d", new Object[] {
                Boolean.valueOf(flag), Integer.valueOf(i)
            }));
            if (i == 0 && !flag)
            {
                retryOnPinFailure();
                return;
            }
            dismissDialog();
            if (i == 0)
            {
                PinVerifier.getInstance().registerPinVerifyEvent();
                PinDialog.notifyCallerPinVerified((NetflixActivity)getActivity(), mVault);
                return;
            } else
            {
                PinDialog.showConnectivityErrorDialog((NetflixActivity)getActivity(), i);
                return;
            }
        }

        public OnPinVerifiedCallback()
        {
            this$0 = PinDialog.this;
            super("nf_pin");
        }
    }

    public static interface PinDialogCallback
    {

        public abstract void pinCancelled();

        public abstract void pinVerified(boolean flag);
    }

    private class PinDialogOnCancel
        implements android.view.View.OnClickListener
    {

        final PinDialog this$0;

        public void onClick(View view)
        {
            dismissAndNotifyCallers();
        }

        private PinDialogOnCancel()
        {
            this$0 = PinDialog.this;
            super();
        }

    }

    private class PinDialogOnDone
        implements android.widget.TextView.OnEditorActionListener
    {

        final PinDialog this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (i != 6)
            {
                return false;
            }
            textview = textview.getText().toString();
            if (textview.length() < PinDialog.PIN_LENGTH.intValue())
            {
                return true;
            }
            if (getServiceManager() == null)
            {
                Log.d("nf_pin", "serviceManager is null");
                return false;
            } else
            {
                processUserInputPin(textview);
                return false;
            }
        }

        private PinDialogOnDone()
        {
            this$0 = PinDialog.this;
            super();
        }

    }

    private class PinDialogOnKeyPress
        implements android.view.View.OnKeyListener
    {

        final PinDialog this$0;

        public boolean onKey(View view, int i, KeyEvent keyevent)
        {
            if (i != 67)
            {
                mPinEditText.setError(null, null);
                showErrorIcon(false);
                view = ((EditText)view).getText().toString();
                if (view.length() >= PinDialog.PIN_LENGTH.intValue())
                {
                    if (getServiceManager() == null)
                    {
                        Log.d("nf_pin", "serviceManager is null");
                        return false;
                    } else
                    {
                        processUserInputPin(view);
                        return false;
                    }
                }
            }
            return false;
        }

        private PinDialogOnKeyPress()
        {
            this$0 = PinDialog.this;
            super();
        }

    }


    private static final int PIN_DIALOG_WIDTH_PHONE_DP = 320;
    private static final int PIN_DIALOG_WIDTH_TABLET_DP = 400;
    private static final Integer PIN_LENGTH = Integer.valueOf(4);
    private static final String TAG = "nf_pin";
    private int mDialogWidthInDp;
    private ImageView mErrorIcon;
    private EditText mPinEditText;
    private TextView mPinForgotView;
    private TextView mPinMessage;
    private ProgressBar mSpinner;
    private PinDialogVault mVault;

    public PinDialog()
    {
    }

    protected static PinDialog createPinDialog(NetflixActivity netflixactivity, PinDialogVault pindialogvault)
    {
        netflixactivity = new PinDialog();
        Bundle bundle = new Bundle();
        bundle.putParcelable(PinDialogVault.NAME, pindialogvault);
        netflixactivity.setArguments(bundle);
        netflixactivity.setStyle(1, 0x7f0d00cb);
        return netflixactivity;
    }

    private void dismissAndNotifyCallers()
    {
        dismissDialog();
        notifyCallerPinCancelled();
    }

    private InputMethodManager getIMM(ServiceManager servicemanager)
    {
        if (servicemanager == null || servicemanager.getActivity() == null)
        {
            return null;
        } else
        {
            return (InputMethodManager)servicemanager.getActivity().getSystemService("input_method");
        }
    }

    private ServiceManager getServiceManager()
    {
        return ((NetflixActivity)getActivity()).getServiceManager();
    }

    private void hideSoftKeyboard(ServiceManager servicemanager, EditText edittext)
    {
        servicemanager = getIMM(servicemanager);
        if (servicemanager != null)
        {
            servicemanager.hideSoftInputFromWindow(edittext.getWindowToken(), 0);
        }
    }

    private void notifyCallerPinCancelled()
    {
        Log.d("nf_pin", String.format("%s onPinCancelled vault: %s", new Object[] {
            com/netflix/mediaclient/android/activity/NetflixActivity.getSimpleName(), mVault
        }));
        if (mVault == null)
        {
            Log.d("nf_pin", "mValut is null - cannot start playback");
        } else
        if (PinDialogVault.PinInvokedFrom.MDX.getValue().equals(mVault.getInvokeLocation()))
        {
            android.content.Intent intent = com.netflix.mediaclient.service.mdx.MdxAgent.Utils.createIntent(getActivity(), "com.netflix.mediaclient.intent.action.MDX_PINCANCELLED", mVault.getUuid());
            getActivity().startService(intent);
            return;
        }
    }

    protected static void notifyCallerPinVerified(NetflixActivity netflixactivity, PinDialogVault pindialogvault)
    {
        if (pindialogvault == null)
        {
            Log.d("nf_pin", "mValut is null - cannot start playback");
        } else
        {
            Log.d("nf_pin", String.format("%s onPinVerified  , vault: %s", new Object[] {
                com/netflix/mediaclient/android/activity/NetflixActivity.getSimpleName(), pindialogvault
            }));
            if (PinDialogVault.PinInvokedFrom.PLAY_LAUNCHER.getValue().equals(pindialogvault.getInvokeLocation()))
            {
                PlaybackLauncher.startPlaybackOnPINSuccess(netflixactivity, pindialogvault.getAsset(), pindialogvault.isRemotePlayback());
                return;
            }
            if (PinDialogVault.PinInvokedFrom.MDX.getValue().equals(pindialogvault.getInvokeLocation()))
            {
                netflixactivity.startService(com.netflix.mediaclient.service.mdx.MdxAgent.Utils.createIntent(netflixactivity, "com.netflix.mediaclient.intent.action.MDX_PINCONFIRMED", pindialogvault.getUuid()));
                return;
            }
            if (PinDialogVault.PinInvokedFrom.PLAYER.getValue().equals(pindialogvault.getInvokeLocation()))
            {
                netflixactivity.onPinVerified(pindialogvault);
                return;
            }
        }
    }

    private void processUserInputPin(String s)
    {
        showProgress(true);
        showErrorIcon(false);
        hideSoftKeyboard(getServiceManager(), mPinEditText);
        Log.d("nf_pin", (new StringBuilder()).append("onEditorAction gotDone! password: ").append(s).toString());
        getServiceManager().verifyPin(s, new OnPinVerifiedCallback());
    }

    private void setDialogWindowSize()
    {
        android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams();
        layoutparams.copyFrom(getDialog().getWindow().getAttributes());
        layoutparams.width = (int)(0.5F + TypedValue.applyDimension(1, mDialogWidthInDp, getResources().getDisplayMetrics()));
        getDialog().getWindow().setAttributes(layoutparams);
    }

    private static void showConnectivityErrorDialog(NetflixActivity netflixactivity, int i)
    {
        (new android.app.AlertDialog.Builder(netflixactivity)).setCancelable(false).setMessage(String.format("%s (%d)", new Object[] {
            netflixactivity.getString(0x7f0c0197), Integer.valueOf(i)
        })).setPositiveButton(0x7f0c0071, new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int j)
            {
                dialoginterface.dismiss();
            }

        }).show();
    }

    private void showErrorIcon(boolean flag)
    {
        ImageView imageview = mErrorIcon;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
    }

    private void showProgress(boolean flag)
    {
        byte byte0 = 8;
        Object obj = mSpinner;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ProgressBar) (obj)).setVisibility(i);
        obj = mPinEditText;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((EditText) (obj)).setVisibility(i);
        obj = mPinForgotView;
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        ((TextView) (obj)).setVisibility(i);
        if (flag)
        {
            mPinMessage.setText(0x7f0c01cd);
        }
    }

    private void showSoftKeyboard(ServiceManager servicemanager, EditText edittext)
    {
        servicemanager = getIMM(servicemanager);
        if (servicemanager != null)
        {
            servicemanager.showSoftInput(edittext, 1);
        }
    }

    private void showSoftKeyboardOnStart()
    {
        if (getDialog() != null && getDialog().getWindow() != null)
        {
            getDialog().getWindow().setSoftInputMode(5);
        }
    }

    protected void dismissDialog()
    {
        Log.d("nf_pin", "dismissing dialog");
        try
        {
            dismissAllowingStateLoss();
            PinVerifier.getInstance().pinDialogDismissed();
            return;
        }
        catch (Exception exception)
        {
            Log.d("nf_pin", "app in backgound. cannot dismiss - retry on next start");
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        Log.d("nf_pin", "onCancel");
        notifyCallerPinCancelled();
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        super.onCreate(bundle);
        mVault = (PinDialogVault)getArguments().getParcelable(PinDialogVault.NAME);
        bundle = new android.app.AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(0x7f030062, null);
        mSpinner = (ProgressBar)view.findViewById(0x7f07013e);
        mPinEditText = (EditText)view.findViewById(0x7f07013b);
        mPinEditText.setOnEditorActionListener(new PinDialogOnDone());
        mPinEditText.setOnKeyListener(new PinDialogOnKeyPress());
        mPinMessage = (TextView)view.findViewById(0x7f07013a);
        mPinForgotView = (TextView)view.findViewById(0x7f07013d);
        mPinForgotView.setMovementMethod(new LinkMovementMethod() {

            final PinDialog this$0;

            public boolean onTouchEvent(TextView textview, Spannable spannable, MotionEvent motionevent)
            {
                mPinForgotView.setLinkTextColor(getResources().getColor(0x7f09007f));
                return super.onTouchEvent(textview, spannable, motionevent);
            }

            
            {
                this$0 = PinDialog.this;
                super();
            }
        });
        mPinForgotView.setFocusable(false);
        ((Button)view.findViewById(0x7f07013f)).setOnClickListener(new PinDialogOnCancel());
        mErrorIcon = (ImageView)view.findViewById(0x7f07013c);
        showErrorIcon(false);
        int i;
        if (DeviceUtils.isTabletByContext(getActivity()))
        {
            i = 400;
        } else
        {
            i = 320;
        }
        mDialogWidthInDp = i;
        showProgress(false);
        bundle.setView(view);
        bundle = bundle.create();
        bundle.setCanceledOnTouchOutside(false);
        return bundle;
    }

    public void onResume()
    {
        super.onResume();
        mPinForgotView.setLinkTextColor(-1);
        setDialogWindowSize();
        showSoftKeyboardOnStart();
    }

    public void onStart()
    {
        super.onStart();
        if (PinVerifier.getInstance().toDismissDialog())
        {
            Log.d("nf_pin", "onStart - dismissOnForeground");
            dismissAndNotifyCallers();
        }
    }

    public void retryOnPinFailure()
    {
        mPinMessage.setText(0x7f0c01d0);
        mPinEditText.getText().clear();
        showErrorIcon(true);
        showSoftKeyboard(getServiceManager(), mPinEditText);
    }











}

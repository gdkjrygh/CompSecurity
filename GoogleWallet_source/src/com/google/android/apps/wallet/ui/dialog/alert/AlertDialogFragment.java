// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.ui.dialog.alert;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.common.inject.FragmentInjectHelper;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.view.Views;
import java.util.List;

public class AlertDialogFragment extends DialogFragment
    implements android.content.DialogInterface.OnClickListener
{
    public static class Builder
    {

        private final Bundle arguments = new Bundle();
        private final Class clazz;

        private Builder setIcon(int i)
        {
            arguments.putInt("KEY_ICON_RES_ID", i);
            return this;
        }

        public final AlertDialogFragment build()
        {
            AlertDialogFragment alertdialogfragment;
            try
            {
                alertdialogfragment = (AlertDialogFragment)clazz.newInstance();
                alertdialogfragment.setArguments(arguments);
            }
            catch (Exception exception)
            {
                throw new RuntimeException("unable to instantiate, do you have a public empty constructor in your dialog fragment?", exception);
            }
            return alertdialogfragment;
        }

        public final Bundle getArguments()
        {
            return arguments;
        }

        public final Builder setCancelable(boolean flag)
        {
            arguments.putBoolean("KEY_CANCELABLE_BOOL", flag);
            return this;
        }

        public final Builder setDismissDialogOnClickNegativeButton()
        {
            arguments.putBoolean("KEY_DISMISS_DIALOG_ON_CLICK_NEGATIVE_BUTTON", true);
            return this;
        }

        public final Builder setDismissDialogOnClickPositiveButton()
        {
            arguments.putBoolean("KEY_DISMISS_DIALOG_ON_CLICK_POSITIVE_BUTTON", true);
            return this;
        }

        public final Builder setFinishActivityOnClick()
        {
            arguments.putBoolean("KEY_FINISH_ACTIVITY_ON_CLICK", true);
            return this;
        }

        public final Builder setFinishActivityOnDismiss()
        {
            arguments.putBoolean("KEY_FINISH_ACTIVITY_ON_DISMISS", true);
            return this;
        }

        public final Builder setLayout(int i)
        {
            arguments.putInt("KEY_LAYOUT_RES_ID", i);
            return this;
        }

        public final Builder setMessage(int i)
        {
            arguments.putInt("KEY_MESSAGE_RES_ID", i);
            return this;
        }

        public final Builder setMessage(String s)
        {
            arguments.putString("KEY_MESSAGE_STRING", s);
            return this;
        }

        public final Builder setNegativeButton(int i)
        {
            arguments.putInt("KEY_NEGATIVE_BUTTON_RES_ID", i);
            return this;
        }

        public final Builder setNegativeButton(String s)
        {
            arguments.putString("KEY_NEGATIVE_BUTTON_STRING", s);
            return this;
        }

        public final Builder setNegativeButtonActionUri(Uri uri)
        {
            arguments.putString("KEY_NEGATIVE_ACTION_URI", uri.toString());
            return this;
        }

        public final Builder setPositiveButton(int i)
        {
            if (i == 0)
            {
                arguments.remove("KEY_POSITIVE_BUTTON_RES_ID");
                return this;
            } else
            {
                arguments.putInt("KEY_POSITIVE_BUTTON_RES_ID", i);
                return this;
            }
        }

        public final Builder setPositiveButton(String s)
        {
            arguments.putString("KEY_POSITIVE_BUTTON_STRING", s);
            return this;
        }

        public final Builder setPositiveButtonActionUri(Uri uri)
        {
            arguments.putString("KEY_POSITIVE_ACTION_URI", uri.toString());
            return this;
        }

        public final Builder setPositiveButtonAnalyticsLinkTapField(String s)
        {
            arguments.putString("KEY_POSITIVE_ACTION_ANALYTICS_LINKTAP_FIELD", s);
            return this;
        }

        public final Builder setSingleChoiceItems(String as[], int i)
        {
            arguments.putStringArray("KEY_STRING_ARRAY", as);
            arguments.putInt("KEY_STRING_ARRAY_SELECTED", i);
            return this;
        }

        public final Builder setTitle(int i)
        {
            arguments.putInt("KEY_TITLE_RES_ID", i);
            return this;
        }

        public final Builder setTitle(String s)
        {
            arguments.putString("KEY_TITLE_STRING", s);
            return this;
        }

        public final Builder setTitleLayout(int i)
        {
            arguments.putInt("KEY_TITLE_LAYOUT_RES_ID", i);
            return this;
        }

        protected Builder(Class class1)
        {
            clazz = class1;
            setPositiveButton(AlertDialogFragment.DEFAULT_DIALOG_POSITIVE_BUTTON);
            setDismissDialogOnClickPositiveButton();
            setIcon(0);
        }
    }


    private static final int DEFAULT_DIALOG_POSITIVE_BUTTON;
    private static final String TAG = com/google/android/apps/wallet/ui/dialog/alert/AlertDialogFragment.getSimpleName();
    public AnalyticsUtil analyticsUtil;
    private android.content.DialogInterface.OnCancelListener onCancelListener;
    private android.content.DialogInterface.OnClickListener onClickListener;

    public AlertDialogFragment()
    {
    }

    protected AlertDialogFragment(Builder builder)
    {
        setArguments(builder.getArguments());
    }

    public static Builder newBuilder()
    {
        return new Builder(com/google/android/apps/wallet/ui/dialog/alert/AlertDialogFragment);
    }

    protected void configureAlertDialog(android.app.AlertDialog.Builder builder)
    {
        Bundle bundle = getArguments();
        if (bundle.containsKey("KEY_TITLE_RES_ID"))
        {
            builder.setTitle(bundle.getInt("KEY_TITLE_RES_ID"));
        } else
        if (bundle.containsKey("KEY_TITLE_STRING"))
        {
            builder.setTitle(bundle.getString("KEY_TITLE_STRING"));
        } else
        {
            builder.setTitle(com.google.android.apps.walletnfcrel.R.string.error_generic_problem_title);
        }
        if (bundle.containsKey("KEY_TITLE_LAYOUT_RES_ID"))
        {
            builder.setCustomTitle(getActivity().getLayoutInflater().inflate(bundle.getInt("KEY_TITLE_LAYOUT_RES_ID"), null));
        }
        if (bundle.containsKey("KEY_ICON_RES_ID"))
        {
            builder.setIcon(bundle.getInt("KEY_ICON_RES_ID"));
        }
        if (bundle.containsKey("KEY_POSITIVE_BUTTON_RES_ID"))
        {
            builder.setPositiveButton(bundle.getInt("KEY_POSITIVE_BUTTON_RES_ID"), this);
        }
        if (bundle.containsKey("KEY_POSITIVE_BUTTON_STRING"))
        {
            builder.setPositiveButton(bundle.getString("KEY_POSITIVE_BUTTON_STRING"), this);
        }
        if (bundle.containsKey("KEY_NEGATIVE_BUTTON_RES_ID"))
        {
            builder.setNegativeButton(bundle.getInt("KEY_NEGATIVE_BUTTON_RES_ID"), this);
        }
        if (bundle.containsKey("KEY_NEGATIVE_BUTTON_STRING"))
        {
            builder.setNegativeButton(bundle.getString("KEY_NEGATIVE_BUTTON_STRING"), this);
        }
        if (bundle.containsKey("KEY_STRING_ARRAY"))
        {
            if (bundle.containsKey("KEY_STRING_ARRAY_SELECTED"))
            {
                builder.setSingleChoiceItems(bundle.getStringArray("KEY_STRING_ARRAY"), bundle.getInt("KEY_STRING_ARRAY_SELECTED"), this);
            } else
            {
                builder.setItems(bundle.getStringArray("KEY_STRING_ARRAY"), this);
            }
        }
        if (bundle.containsKey("KEY_CANCELABLE_BOOL"))
        {
            setCancelable(bundle.getBoolean("KEY_CANCELABLE_BOOL"));
        }
        if (bundle.containsKey("KEY_LAYOUT_RES_ID"))
        {
            builder.setView(getActivity().getLayoutInflater().inflate(bundle.getInt("KEY_LAYOUT_RES_ID"), null));
        }
        if (bundle.containsKey("KEY_MESSAGE_STRING"))
        {
            builder.setMessage(Html.fromHtml(bundle.getString("KEY_MESSAGE_STRING")));
        }
        if (bundle.containsKey("KEY_MESSAGE_RES_ID"))
        {
            builder.setMessage(Html.fromHtml(getString(bundle.getInt("KEY_MESSAGE_RES_ID"))));
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if (onCancelListener == null) goto _L2; else goto _L1
_L1:
        onCancelListener.onCancel(dialoginterface);
_L4:
        super.onCancel(dialoginterface);
        return;
_L2:
        if (getArguments().getBoolean("KEY_FINISH_ACTIVITY_ON_DISMISS"))
        {
            getActivity().finish();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (onClickListener == null) goto _L2; else goto _L1
_L1:
        onClickListener.onClick(dialoginterface, i);
_L4:
        if (getArguments().getBoolean("KEY_FINISH_ACTIVITY_ON_CLICK"))
        {
            getActivity().finish();
        }
        return;
_L2:
        if (i == -1)
        {
            if (getArguments().getString("KEY_POSITIVE_ACTION_ANALYTICS_LINKTAP_FIELD") != null)
            {
                analyticsUtil.sendLinkTap(getArguments().getString("KEY_POSITIVE_ACTION_ANALYTICS_LINKTAP_FIELD"), new AnalyticsCustomDimension[0]);
            }
            if (getArguments().getString("KEY_POSITIVE_ACTION_URI") != null)
            {
                Object obj = UriIntents.create(getActivity(), getArguments().getString("KEY_POSITIVE_ACTION_URI"));
                if (!getActivity().getPackageManager().queryIntentActivities(((Intent) (obj)), 0x10000).isEmpty())
                {
                    getActivity().startActivity(((Intent) (obj)));
                } else
                {
                    dialoginterface = TAG;
                    obj = String.valueOf(((Intent) (obj)).getData());
                    WLog.w(dialoginterface, (new StringBuilder(String.valueOf(obj).length() + 24)).append("No activities to handle ").append(((String) (obj))).toString());
                }
            } else
            if (getArguments().getBoolean("KEY_DISMISS_DIALOG_ON_CLICK_POSITIVE_BUTTON") && !getArguments().getBoolean("KEY_FINISH_ACTIVITY_ON_CLICK"))
            {
                dialoginterface.dismiss();
            }
        } else
        if (i == -2)
        {
            if (getArguments().getString("KEY_NEGATIVE_ACTION_URI") != null)
            {
                Object obj1 = UriIntents.create(getActivity(), getArguments().getString("KEY_NEGATIVE_ACTION_URI"));
                if (!getActivity().getPackageManager().queryIntentActivities(((Intent) (obj1)), 0x10000).isEmpty())
                {
                    getActivity().startActivity(((Intent) (obj1)));
                } else
                {
                    dialoginterface = TAG;
                    obj1 = String.valueOf(((Intent) (obj1)).getData());
                    WLog.w(dialoginterface, (new StringBuilder(String.valueOf(obj1).length() + 24)).append("No activities to handle ").append(((String) (obj1))).toString());
                }
            } else
            if (getArguments().getBoolean("KEY_DISMISS_DIALOG_ON_CLICK_NEGATIVE_BUTTON") && !getArguments().getBoolean("KEY_FINISH_ACTIVITY_ON_CLICK"))
            {
                dialoginterface.dismiss();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        FragmentInjectHelper.inject(this);
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        configureAlertDialog(bundle);
        return bundle.create();
    }

    public final void onStart()
    {
        super.onStart();
        if (getDialog() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        Object obj1;
        obj1 = getArguments();
        obj = null;
        if (((Bundle) (obj1)).containsKey("KEY_MESSAGE_STRING"))
        {
            obj = ((Bundle) (obj1)).getString("KEY_MESSAGE_STRING");
        }
        if (((Bundle) (obj1)).containsKey("KEY_MESSAGE_RES_ID"))
        {
            obj = getString(((Bundle) (obj1)).getInt("KEY_MESSAGE_RES_ID"));
        }
        TextView textview = (TextView)getDialog().findViewById(0x102000b);
        if (textview != null)
        {
            if (obj != null)
            {
                Views.setHtml(textview, ((String) (obj)));
            }
            textview.setMovementMethod(LinkMovementMethod.getInstance());
        }
        int i = getResources().getIdentifier("titleDivider", "id", "android");
        obj = getDialog().findViewById(i);
        if (((Bundle) (obj1)).containsKey("KEY_TITLE_LAYOUT_RES_ID"))
        {
            continue; /* Loop/switch isn't completed */
        }
        i = getResources().getIdentifier("alertTitle", "id", "android");
        obj1 = (TextView)getDialog().findViewById(i);
        if (obj1 == null || obj == null) goto _L1; else goto _L3
_L3:
        int j = getResources().getColor(com.google.android.apps.walletnfcrel.R.color.primary);
        ((TextView) (obj1)).setTextColor(j);
        ((View) (obj)).setBackgroundColor(j);
        return;
        if (obj == null) goto _L1; else goto _L4
_L4:
        ((View) (obj)).setVisibility(8);
        return;
    }

    protected final void setMessage(String s)
    {
        getArguments().putString("KEY_MESSAGE_STRING", s);
    }

    protected final void setNegativeButton(int i)
    {
        getArguments().putInt("KEY_NEGATIVE_BUTTON_RES_ID", i);
    }

    public final void setOnCancelListener(android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        onCancelListener = oncancellistener;
    }

    public final void setOnClickListener(android.content.DialogInterface.OnClickListener onclicklistener)
    {
        onClickListener = onclicklistener;
    }

    protected final void setPositiveButton(int i)
    {
        if (i == 0)
        {
            getArguments().remove("KEY_POSITIVE_BUTTON_RES_ID");
            return;
        } else
        {
            getArguments().putInt("KEY_POSITIVE_BUTTON_RES_ID", i);
            return;
        }
    }

    protected final void setTitle(int i)
    {
        getArguments().putInt("KEY_TITLE_RES_ID", i);
    }

    public final void show(FragmentManager fragmentmanager)
    {
        show(fragmentmanager, null);
    }

    static 
    {
        DEFAULT_DIALOG_POSITIVE_BUTTON = com.google.android.apps.walletnfcrel.R.string.button_ok;
    }

}

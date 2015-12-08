// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.util.ViewUtil;

public class ProgressSpinnerDialogFragment extends SkypeDialogFragment
{

    private static final int ANIMATION_DELAY = 500;
    private static final String EXTRA_LAYOUT_ID = "layout_id";
    private static final String EXTRA_MESSAGE_PRIMARY = "message_primary";
    private static final String EXTRA_MESSAGE_SECONDARY = "message_secondary";
    private static final String EXTRA_SHOW_SPINNER = "show_spinner";
    private static final int MAX_DOTS = 2;
    private int animationCount;
    private Runnable animationRunnable;
    private boolean deviceCanDisplaySpinner;
    private Handler handler;
    private TextView progressMessagePrimary;

    public ProgressSpinnerDialogFragment()
    {
        animationCount = 0;
    }

    public static transient ProgressSpinnerDialogFragment create(int i, boolean flag, String as[])
    {
        ProgressSpinnerDialogFragment progressspinnerdialogfragment = new ProgressSpinnerDialogFragment();
        Bundle bundle = new Bundle();
        boolean flag1 = true;
        StringBuilder stringbuilder = new StringBuilder();
        int k = as.length;
        int j = 0;
        while (j < k) 
        {
            String s = as[j];
            if (flag1)
            {
                bundle.putString("message_primary", s);
                flag1 = false;
            } else
            {
                stringbuilder.append(s).append('\n');
            }
            j++;
        }
        bundle.putString("message_secondary", stringbuilder.toString().trim());
        bundle.putInt("layout_id", i);
        bundle.putBoolean("show_spinner", flag);
        progressspinnerdialogfragment.setArguments(bundle);
        return progressspinnerdialogfragment;
    }

    private void modifyProgressSpinnerDisplay(final Dialog modifiedMessage)
    {
        modifiedMessage = modifiedMessage.findViewById(0x7f1004d0);
        if (modifiedMessage != null)
        {
            modifiedMessage.setVisibility(8);
        }
        if (progressMessagePrimary != null)
        {
            progressMessagePrimary.setVisibility(0);
            String s = (String)progressMessagePrimary.getText();
            int i = s.indexOf('\u2026');
            modifiedMessage = s;
            if (i > 0)
            {
                modifiedMessage = s.substring(0, i);
            }
            animationCount = 0;
            progressMessagePrimary.setText((new StringBuilder()).append(modifiedMessage).append(".  ").toString());
            handler.removeCallbacks(animationRunnable);
            animationRunnable = new Runnable() {

                final ProgressSpinnerDialogFragment this$0;
                final String val$modifiedMessage;

                public final void run()
                {
                    Object obj = ProgressSpinnerDialogFragment.this;
                    TextView textview;
                    StringBuilder stringbuilder;
                    int j;
                    if (animationCount < 2)
                    {
                        j = int i = ((StringBuilder) (this)).StringBuilder + 1;
                    } else
                    {
                        j = 0;
                    }
                    obj.animationCount = j;
                    textview = progressMessagePrimary;
                    stringbuilder = (new StringBuilder()).append(modifiedMessage);
                    if (animationCount == 0)
                    {
                        obj = ".  ";
                    } else
                    if (animationCount == 1)
                    {
                        obj = ".. ";
                    } else
                    {
                        obj = "...";
                    }
                    textview.setText(stringbuilder.append(((String) (obj))).toString());
                    handler.postDelayed(this, 500L);
                }

            
            {
                this$0 = ProgressSpinnerDialogFragment.this;
                modifiedMessage = s;
                super();
            }
            };
            handler.postDelayed(animationRunnable, 500L);
        }
    }

    private void setDeviceCanDisplaySpinner(boolean flag)
    {
        deviceCanDisplaySpinner = flag;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        handler = new Handler();
        Object obj = getActivity();
        bundle = new Dialog(((android.content.Context) (obj)), 0x7f090165);
        obj = ((Activity) (obj)).getLayoutInflater();
        int j = getArguments().getInt("layout_id");
        int i = j;
        if (j == 0)
        {
            i = 0x7f0300eb;
        }
        obj = ((LayoutInflater) (obj)).inflate(i, null);
        bundle.setContentView(((View) (obj)));
        String s = getArguments().getString("message_primary");
        if (!TextUtils.isEmpty(s))
        {
            progressMessagePrimary = (TextView)ViewUtil.a(((View) (obj)), 0x7f1004d1);
            progressMessagePrimary.setText(s);
            progressMessagePrimary.setVisibility(0);
            progressMessagePrimary.setContentDescription(s);
        }
        s = getArguments().getString("message_secondary");
        if (!TextUtils.isEmpty(s))
        {
            obj = (TextView)ViewUtil.a(((View) (obj)), 0x7f1004d6);
            ((TextView) (obj)).setText(s);
            ((TextView) (obj)).setVisibility(0);
            ((TextView) (obj)).setContentDescription(s);
        }
        setDeviceCanDisplaySpinner(getArguments().getBoolean("show_spinner", true));
        if (!deviceCanDisplaySpinner)
        {
            modifyProgressSpinnerDisplay(bundle);
        }
        return bundle;
    }

    public void stopAnimation()
    {
        if (!deviceCanDisplaySpinner)
        {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void updateMessage(String s)
    {
        if (progressMessagePrimary != null)
        {
            progressMessagePrimary.setText(s);
            if (!deviceCanDisplaySpinner)
            {
                modifyProgressSpinnerDisplay(getDialog());
            }
        }
    }



/*
    static int access$002(ProgressSpinnerDialogFragment progressspinnerdialogfragment, int i)
    {
        progressspinnerdialogfragment.animationCount = i;
        return i;
    }

*/


/*
    static int access$004(ProgressSpinnerDialogFragment progressspinnerdialogfragment)
    {
        int i = progressspinnerdialogfragment.animationCount + 1;
        progressspinnerdialogfragment.animationCount = i;
        return i;
    }

*/


}

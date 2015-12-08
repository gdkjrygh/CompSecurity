// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class NationalAlertsWizardFragment1 extends Fragment
{
    public static interface NaWizardCallback1
    {

        public abstract void onCloseClicked();

        public abstract void onNextClicked();
    }


    private static final String ARG_SHOW_CLOSE_MESSAGE = "ARG_SHOW_CLOSE_MESSAGE";
    private NaWizardCallback1 mCallback;
    private TextView mInstructions;
    private Button mNext;
    private boolean mShowCloseMessage;
    private TextView mWelcomeView;

    public NationalAlertsWizardFragment1()
    {
    }

    public static NationalAlertsWizardFragment1 newInstance(boolean flag)
    {
        NationalAlertsWizardFragment1 nationalalertswizardfragment1 = new NationalAlertsWizardFragment1();
        Bundle bundle = new Bundle();
        bundle.putBoolean("ARG_SHOW_CLOSE_MESSAGE", flag);
        nationalalertswizardfragment1.setArguments(bundle);
        return nationalalertswizardfragment1;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            mCallback = (NaWizardCallback1)activity;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement NaWizardCallback1").toString());
        }
    }

    public void onCreate(Bundle bundle)
    {
        mShowCloseMessage = getArguments().getBoolean("ARG_SHOW_CLOSE_MESSAGE", false);
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f04002f, viewgroup, false);
        mNext = (Button)layoutinflater.findViewById(0x7f0f0098);
        mWelcomeView = (TextView)layoutinflater.findViewById(0x7f0f0096);
        mInstructions = (TextView)layoutinflater.findViewById(0x7f0f0097);
        return layoutinflater;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (mShowCloseMessage)
        {
            mNext.setText(0x7f0700b3);
            mWelcomeView.setText(0x7f0701af);
            mInstructions.setText(0x7f07017d);
            mNext.setEnabled(true);
        }
        mNext.setOnClickListener(new android.view.View.OnClickListener() {

            final NationalAlertsWizardFragment1 this$0;

            public void onClick(View view1)
            {
                if (mShowCloseMessage)
                {
                    mCallback.onCloseClicked();
                    return;
                } else
                {
                    mCallback.onNextClicked();
                    return;
                }
            }

            
            {
                this$0 = NationalAlertsWizardFragment1.this;
                super();
            }
        });
    }

    public void setNextButtonEnabled(boolean flag)
    {
        if (mNext != null)
        {
            mNext.setEnabled(flag);
        }
    }


}

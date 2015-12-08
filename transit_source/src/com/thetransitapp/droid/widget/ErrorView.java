// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.github.rtyley.android.sherlock.roboguice.fragment.RoboSherlockFragment;

public class ErrorView extends RoboSherlockFragment
{
    public static interface OnErrorButtonClickListener
    {

        public abstract void onErrorButtonClick();
    }


    private Button button;
    private TextView message;
    private TextView title;

    public ErrorView()
    {
    }

    public void displayError(String s, String s1)
    {
        displayError(s, s1, null, null);
    }

    public void displayError(String s, String s1, String s2, final OnErrorButtonClickListener listener)
    {
        super.getView().setVisibility(0);
        title.setText(s);
        message.setText(s1);
        if (s2 != null && listener != null)
        {
            button.setText(s2);
            button.setVisibility(0);
            button.setOnClickListener(new android.view.View.OnClickListener() {

                final ErrorView this$0;
                private final OnErrorButtonClickListener val$listener;

                public void onClick(View view)
                {
                    listener.onErrorButtonClick();
                }

            
            {
                this$0 = ErrorView.this;
                listener = onerrorbuttonclicklistener;
                super();
            }
            });
            return;
        } else
        {
            button.setVisibility(8);
            return;
        }
    }

    public void hideError()
    {
        super.getView().setVisibility(8);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03002a, viewgroup, false);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        super.getView().setVisibility(8);
    }
}

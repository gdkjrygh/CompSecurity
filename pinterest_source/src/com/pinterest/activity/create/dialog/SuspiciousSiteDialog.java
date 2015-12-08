// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.dialog;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.pinterest.activity.task.dialog.BaseDialog;

public class SuspiciousSiteDialog extends BaseDialog
{

    public SuspiciousSiteDialog()
    {
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setContent(LayoutInflater.from(getActivity()).inflate(0x7f030095, null));
        setTitle(0x7f07057d);
        bundle = (TextView)_customView.findViewById(0x7f0f0096);
        bundle.setMovementMethod(LinkMovementMethod.getInstance());
        bundle.setText(0x7f070075);
        setPositiveButton(0x7f0702d7, new _cls1());
        setNegativeButton(0x7f0703d3, new _cls2());
        addOnDismissListener(new _cls3());
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final SuspiciousSiteDialog this$0;

        public void onClick(View view)
        {
            dismiss();
            if (getActivity() != null)
            {
                ActivityHelper.goHome(getActivity());
            }
        }

        _cls1()
        {
            this$0 = SuspiciousSiteDialog.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final SuspiciousSiteDialog this$0;

        public void onClick(View view)
        {
            dismiss();
        }

        _cls2()
        {
            this$0 = SuspiciousSiteDialog.this;
            super();
        }
    }


    private class _cls3
        implements com.pinterest.activity.task.dialog.BaseDialog.OnDismissListener
    {

        final SuspiciousSiteDialog this$0;

        public void onDismiss(BaseDialog basedialog)
        {
            if (getActivity() != null)
            {
                getActivity().finish();
            }
        }

        _cls3()
        {
            this$0 = SuspiciousSiteDialog.this;
            super();
        }
    }

}

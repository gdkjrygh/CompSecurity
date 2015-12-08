// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.os.Handler;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app:
//            ProgressSpinnerDialogFragment

final class val.modifiedMessage
    implements Runnable
{

    final ProgressSpinnerDialogFragment this$0;
    final String val$modifiedMessage;

    public final void run()
    {
        Object obj = ProgressSpinnerDialogFragment.this;
        TextView textview;
        StringBuilder stringbuilder;
        int i;
        if (ProgressSpinnerDialogFragment.access$000(ProgressSpinnerDialogFragment.this) < 2)
        {
            i = ProgressSpinnerDialogFragment.access$004(ProgressSpinnerDialogFragment.this);
        } else
        {
            i = 0;
        }
        ProgressSpinnerDialogFragment.access$002(((ProgressSpinnerDialogFragment) (obj)), i);
        textview = ProgressSpinnerDialogFragment.access$100(ProgressSpinnerDialogFragment.this);
        stringbuilder = (new StringBuilder()).append(val$modifiedMessage);
        if (ProgressSpinnerDialogFragment.access$000(ProgressSpinnerDialogFragment.this) == 0)
        {
            obj = ".  ";
        } else
        if (ProgressSpinnerDialogFragment.access$000(ProgressSpinnerDialogFragment.this) == 1)
        {
            obj = ".. ";
        } else
        {
            obj = "...";
        }
        textview.setText(stringbuilder.append(((String) (obj))).toString());
        ProgressSpinnerDialogFragment.access$200(ProgressSpinnerDialogFragment.this).postDelayed(this, 500L);
    }

    ()
    {
        this$0 = final_progressspinnerdialogfragment;
        val$modifiedMessage = String.this;
        super();
    }
}

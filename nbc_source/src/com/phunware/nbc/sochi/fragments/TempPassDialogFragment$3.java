// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.os.CountDownTimer;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            TempPassDialogFragment

class this._cls0 extends CountDownTimer
{

    final TempPassDialogFragment this$0;

    public void onFinish()
    {
        if (getDialog() == null)
        {
            return;
        } else
        {
            dismiss();
            return;
        }
    }

    public void onTick(long l)
    {
        TempPassDialogFragment.access$000(TempPassDialogFragment.this, l);
    }

    (long l, long l1)
    {
        this$0 = TempPassDialogFragment.this;
        super(l, l1);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            TempPassDialogFragment

class val.target extends DebouncingOnClickListener
{

    final val.target this$0;
    final TempPassDialogFragment val$target;

    public void doClick(View view)
    {
        val$target.onFaq();
    }

    ()
    {
        this$0 = final_;
        val$target = TempPassDialogFragment.this;
        super();
    }
}

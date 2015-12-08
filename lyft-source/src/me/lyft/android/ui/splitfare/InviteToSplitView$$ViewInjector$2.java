// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            InviteToSplitView

class val.target extends DebouncingOnClickListener
{

    final val.target this$0;
    final InviteToSplitView val$target;

    public void doClick(View view)
    {
        val$target.sendInvites();
    }

    ()
    {
        this$0 = final_;
        val$target = InviteToSplitView.this;
        super();
    }
}

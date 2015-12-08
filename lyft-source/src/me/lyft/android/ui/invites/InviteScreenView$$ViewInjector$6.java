// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package me.lyft.android.ui.invites:
//            InviteScreenView

class val.target extends DebouncingOnClickListener
{

    final val.target this$0;
    final InviteScreenView val$target;

    public void doClick(View view)
    {
        val$target.shareWithEmail();
    }

    A()
    {
        this$0 = final_a;
        val$target = InviteScreenView.this;
        super();
    }
}

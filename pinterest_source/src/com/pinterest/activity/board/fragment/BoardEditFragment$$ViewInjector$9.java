// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BoardEditFragment

final class val.target extends DebouncingOnClickListener
{

    final BoardEditFragment val$target;

    public final void doClick(View view)
    {
        val$target.onLeaveClicked();
    }

    ()
    {
        val$target = boardeditfragment;
        super();
    }
}

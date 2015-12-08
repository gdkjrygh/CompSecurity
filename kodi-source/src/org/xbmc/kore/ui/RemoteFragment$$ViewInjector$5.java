// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package org.xbmc.kore.ui:
//            RemoteFragment

class init> extends DebouncingOnClickListener
{

    final d this$0;
    final RemoteFragment val$target;

    public void doClick(View view)
    {
        val$target.onPicturesClicked(view);
    }

    ()
    {
        this$0 = final_;
        val$target = RemoteFragment.this;
        super();
    }
}

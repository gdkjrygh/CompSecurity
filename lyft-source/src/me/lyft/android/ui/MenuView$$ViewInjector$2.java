// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package me.lyft.android.ui:
//            MenuView

class er extends DebouncingOnClickListener
{

    final ed this$0;
    final MenuView val$target;

    public void doClick(View view)
    {
        val$target.onMenuItemSelected(view);
    }

    er()
    {
        this$0 = final_er;
        val$target = MenuView.this;
        super();
    }
}

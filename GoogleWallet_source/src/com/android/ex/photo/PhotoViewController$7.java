// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.android.ex.photo:
//            PhotoViewController

final class val.base
    implements android.view.balLayoutListener
{

    final PhotoViewController this$0;
    final View val$base;

    public final void onGlobalLayout()
    {
        if (android.os.lobalLayoutListener >= 16)
        {
            val$base.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else
        {
            val$base.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
        PhotoViewController.access$300(PhotoViewController.this);
    }

    tListener()
    {
        this$0 = final_photoviewcontroller;
        val$base = View.this;
        super();
    }
}

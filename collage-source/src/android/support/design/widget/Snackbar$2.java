// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.View;

// Referenced classes of package android.support.design.widget:
//            Snackbar

class val.listener
    implements android.view.kListener
{

    final Snackbar this$0;
    final android.view.kListener val$listener;

    public void onClick(View view)
    {
        val$listener.onClick(view);
        Snackbar.access$000(Snackbar.this, 1);
    }

    ()
    {
        this$0 = final_snackbar;
        val$listener = android.view.kListener.this;
        super();
    }
}

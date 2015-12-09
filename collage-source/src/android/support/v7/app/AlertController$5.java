// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AlertController

class val.bottom
    implements Runnable
{

    final AlertController this$0;
    final View val$bottom;
    final View val$top;

    public void run()
    {
        AlertController.access$800(AlertController.access$1000(AlertController.this), val$top, val$bottom);
    }

    ()
    {
        this$0 = final_alertcontroller;
        val$top = view;
        val$bottom = View.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.widget.NestedScrollView;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AlertController

class val.bottom
    implements android.support.v4.widget.nScrollChangeListener
{

    final AlertController this$0;
    final View val$bottom;
    final View val$top;

    public void onScrollChange(NestedScrollView nestedscrollview, int i, int j, int k, int l)
    {
        AlertController.access$800(nestedscrollview, val$top, val$bottom);
    }

    w()
    {
        this$0 = final_alertcontroller;
        val$top = view;
        val$bottom = View.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.View;
import android.widget.AbsListView;

// Referenced classes of package android.support.v7.app:
//            AlertController

class val.bottom
    implements android.widget.llListener
{

    final AlertController this$0;
    final View val$bottom;
    final View val$top;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        AlertController.access$800(abslistview, val$top, val$bottom);
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }

    er()
    {
        this$0 = final_alertcontroller;
        val$top = view;
        val$bottom = View.this;
        super();
    }
}

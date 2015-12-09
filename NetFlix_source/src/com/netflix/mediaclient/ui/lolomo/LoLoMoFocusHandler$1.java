// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lolomo;

import android.widget.AbsListView;

// Referenced classes of package com.netflix.mediaclient.ui.lolomo:
//            LoLoMoFocusHandler

class this._cls0
    implements android.widget.istener
{

    final LoLoMoFocusHandler this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (LoLoMoFocusHandler.access$000(LoLoMoFocusHandler.this))
        {
            return;
        } else
        {
            LoLoMoFocusHandler.access$100(LoLoMoFocusHandler.this);
            return;
        }
    }

    ()
    {
        this$0 = LoLoMoFocusHandler.this;
        super();
    }
}

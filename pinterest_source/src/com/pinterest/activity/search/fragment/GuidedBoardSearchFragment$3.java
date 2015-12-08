// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;


// Referenced classes of package com.pinterest.activity.search.fragment:
//            GuidedBoardSearchFragment

class this._cls0
    implements com.pinterest.ui.tab.dSearchFragment._cls3
{

    final GuidedBoardSearchFragment this$0;

    public void onTabReselected(int i)
    {
    }

    public void onTabSelected(int i)
    {
        GuidedBoardSearchFragment.access$202(GuidedBoardSearchFragment.this, i);
        reload(GuidedBoardSearchFragment.access$300(GuidedBoardSearchFragment.this));
    }

    ()
    {
        this$0 = GuidedBoardSearchFragment.this;
        super();
    }
}

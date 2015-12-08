// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import org.lucasr.twowayview.TwoWayView;

// Referenced classes of package com.pinterest.activity.library.fragment:
//            LibraryAllPinsFragment

class this._cls0
    implements org.lucasr.twowayview.er
{

    final LibraryAllPinsFragment this$0;

    public void onScroll(TwoWayView twowayview, int i, int j, int k)
    {
        if (i != 0)
        {
            LibraryAllPinsFragment.access$500(LibraryAllPinsFragment.this);
            return;
        } else
        {
            LibraryAllPinsFragment.access$000(LibraryAllPinsFragment.this);
            return;
        }
    }

    public void onScrollStateChanged(TwoWayView twowayview, int i)
    {
    }

    ()
    {
        this$0 = LibraryAllPinsFragment.this;
        super();
    }
}

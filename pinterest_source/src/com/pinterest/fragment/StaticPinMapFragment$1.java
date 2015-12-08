// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import com.pinterest.activity.board.fragment.BoardMapFragment;

// Referenced classes of package com.pinterest.fragment:
//            StaticPinMapFragment

class this._cls0
    implements this._cls0
{

    final StaticPinMapFragment this$0;

    public void onReady()
    {
        if (StaticPinMapFragment.access$000(StaticPinMapFragment.this) != null && StaticPinMapFragment.access$000(StaticPinMapFragment.this).getMap() != null)
        {
            StaticPinMapFragment.access$000(StaticPinMapFragment.this).setPinFeed(StaticPinMapFragment.access$100(StaticPinMapFragment.this));
        }
    }

    Fragment()
    {
        this$0 = StaticPinMapFragment.this;
        super();
    }
}

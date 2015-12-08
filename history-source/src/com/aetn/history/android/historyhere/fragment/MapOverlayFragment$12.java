// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;


// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapOverlayFragment, MapOverlayDetailFragment

class nt
    implements Runnable
{

    final MapOverlayFragment this$0;
    final MapOverlayDetailFragment val$frag;

    public void run()
    {
        val$frag.animateInMainLayout();
    }

    nt()
    {
        this$0 = final_mapoverlayfragment;
        val$frag = MapOverlayDetailFragment.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import com.cardinalblue.android.piccollage.controller.d;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            ah

class a
    implements android.support.v7.widget.hView.OnQueryTextListener
{

    final ah a;

    public boolean onQueryTextChange(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            d.a().c(new <init>(null));
        }
        a.a = s;
        return false;
    }

    public boolean onQueryTextSubmit(String s)
    {
        ah.a(a).getCurrentItem();
        JVM INSTR tableswitch 0 1: default 32
    //                   0 42
    //                   1 49;
           goto _L1 _L2 _L3
_L1:
        ah.a(a, s);
        return false;
_L2:
        com.cardinalblue.android.piccollage.a.b.ar(s);
        continue; /* Loop/switch isn't completed */
_L3:
        com.cardinalblue.android.piccollage.a.b.aq(s);
        if (true) goto _L1; else goto _L4
_L4:
    }

    (ah ah1)
    {
        a = ah1;
        super();
    }
}

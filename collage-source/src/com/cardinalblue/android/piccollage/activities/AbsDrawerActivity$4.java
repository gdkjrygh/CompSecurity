// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.view.MenuItem;
import com.cardinalblue.android.piccollage.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            AbsDrawerActivity

class a
    implements android.support.design.widget.igationItemSelectedListener
{

    final AbsDrawerActivity a;

    public boolean onNavigationItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 2131755742 2131755749: default 52
    //                   2131755742 67
    //                   2131755743 78
    //                   2131755744 91
    //                   2131755745 107
    //                   2131755746 52
    //                   2131755747 115
    //                   2131755748 126
    //                   2131755749 137;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7 _L8
_L1:
        return a.a(menuitem.getItemId(), null);
_L2:
        b.ay("My Collage");
        b.bq();
        continue; /* Loop/switch isn't completed */
_L3:
        b.ay("Explorer");
        b.aA("drawer");
        continue; /* Loop/switch isn't completed */
_L4:
        b.ay("Activity Feed");
        b.az("drawer");
        b.a();
        continue; /* Loop/switch isn't completed */
_L5:
        b.aB("drawer");
        continue; /* Loop/switch isn't completed */
_L6:
        b.ay("Find Friends");
        b.bs();
        continue; /* Loop/switch isn't completed */
_L7:
        b.ay("Setting");
        b.bt();
        continue; /* Loop/switch isn't completed */
_L8:
        b.ay("FAQ");
        b.bu();
        if (true) goto _L1; else goto _L9
_L9:
    }

    edListener(AbsDrawerActivity absdraweractivity)
    {
        a = absdraweractivity;
        super();
    }
}

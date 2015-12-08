// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.view.View;

// Referenced classes of package com.arist.activity:
//            MainActivity

final class ac
    implements android.view.View.OnClickListener
{

    final MainActivity a;

    ac(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public final void onClick(View view)
    {
        view.getId();
        JVM INSTR lookupswitch 4: default 48
    //                   2131099801: 146
    //                   2131099805: 129
    //                   2131099809: 95
    //                   2131099813: 112;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        int i = ((Integer)view.getTag()).intValue();
        if (i == 0)
        {
            a.b = 0;
            a.c = 1;
        } else
        {
            a.b = 3;
            a.c = i - 1;
        }
_L7:
        MainActivity.a(a, false);
        MainActivity.d(a);
        return;
_L4:
        a.b = 4;
        MainActivity.a(a, true);
        return;
_L5:
        a.b = 1;
        MainActivity.a(a, true);
        return;
_L3:
        a.b = 2;
        MainActivity.a(a, true);
        return;
_L2:
        a.b = 0;
        a.c = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }
}

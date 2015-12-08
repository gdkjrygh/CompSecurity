// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.widget.RadioGroup;

// Referenced classes of package com.pandora.android.activity:
//            HomeDrawerActivity

class a
    implements android.widget.hangeListener
{

    final HomeDrawerActivity a;

    public void onCheckedChanged(RadioGroup radiogroup, int i)
    {
        radiogroup = null;
        i;
        JVM INSTR tableswitch 2131755413 2131755416: default 32
    //                   2131755413 41
    //                   2131755414 48
    //                   2131755415 55
    //                   2131755416 62;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        a.a(radiogroup);
        return;
_L2:
        radiogroup = a;
        continue; /* Loop/switch isn't completed */
_L3:
        radiogroup = a;
        continue; /* Loop/switch isn't completed */
_L4:
        radiogroup = a;
        continue; /* Loop/switch isn't completed */
_L5:
        radiogroup = a;
        if (true) goto _L1; else goto _L6
_L6:
    }

    (HomeDrawerActivity homedraweractivity)
    {
        a = homedraweractivity;
        super();
    }
}

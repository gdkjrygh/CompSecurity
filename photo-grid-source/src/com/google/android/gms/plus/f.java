// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.plus:
//            g

final class f
    implements g
{

    private Context a;

    private f(Context context)
    {
        a = context;
    }

    f(Context context, byte byte0)
    {
        this(context);
    }

    public final Drawable a(int i)
    {
        i;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 64
    //                   1 70
    //                   2 76;
           goto _L1 _L2 _L3 _L4
_L1:
        String s = "ic_plusone_standard_off_client";
_L6:
        i = a.getResources().getIdentifier(s, "drawable", a.getPackageName());
        return a.getResources().getDrawable(i);
_L2:
        s = "ic_plusone_small_off_client";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "ic_plusone_medium_off_client";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "ic_plusone_tall_off_client";
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean a()
    {
        int i = a.getResources().getIdentifier("ic_plusone_small_off_client", "drawable", a.getPackageName());
        int j = a.getResources().getIdentifier("ic_plusone_medium_off_client", "drawable", a.getPackageName());
        int k = a.getResources().getIdentifier("ic_plusone_tall_off_client", "drawable", a.getPackageName());
        int l = a.getResources().getIdentifier("ic_plusone_standard_off_client", "drawable", a.getPackageName());
        return i != 0 && j != 0 && k != 0 && l != 0;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.a.a.a;
import com.google.a.b;
import java.util.Date;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal:
//            z

public final class bl
{

    public static a a(z z1)
    {
        b b1;
        HashSet hashset;
        Date date;
        if (z1.f != null)
        {
            hashset = new HashSet(z1.f);
        } else
        {
            hashset = null;
        }
        date = new Date(z1.c);
        z1.e;
        JVM INSTR tableswitch 1 2: default 56
    //                   1 87
    //                   2 80;
           goto _L1 _L2 _L3
_L1:
        b1 = b.a;
_L5:
        return new a(date, b1, hashset, z1.g);
_L3:
        b1 = b.c;
        continue; /* Loop/switch isn't completed */
_L2:
        b1 = b.b;
        if (true) goto _L5; else goto _L4
_L4:
    }
}

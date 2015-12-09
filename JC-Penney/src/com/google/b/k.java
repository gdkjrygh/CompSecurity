// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.b.a.c;
import com.google.b.e.d;
import com.google.b.e.f;
import com.google.b.e.i;
import com.google.b.e.n;
import com.google.b.e.t;
import com.google.b.g.b;
import java.util.Map;

// Referenced classes of package com.google.b:
//            u, l, a

public final class k
    implements u
{

    public k()
    {
    }

    public com.google.b.b.b a(String s, a a1, int j, int i1, Map map)
    {
        l.a[a1.ordinal()];
        JVM INSTR tableswitch 1 11: default 68
    //                   1 95
    //                   2 119
    //                   3 131
    //                   4 143
    //                   5 155
    //                   6 167
    //                   7 179
    //                   8 191
    //                   9 203
    //                   10 215
    //                   11 227;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("No encoder available for format ").append(a1).toString());
_L2:
        Object obj = new com.google.b.e.k();
_L14:
        return ((u) (obj)).a(s, a1, j, i1, map);
_L3:
        obj = new i();
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new t();
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new b();
        continue; /* Loop/switch isn't completed */
_L6:
        obj = new f();
        continue; /* Loop/switch isn't completed */
_L7:
        obj = new d();
        continue; /* Loop/switch isn't completed */
_L8:
        obj = new n();
        continue; /* Loop/switch isn't completed */
_L9:
        obj = new com.google.b.f.d();
        continue; /* Loop/switch isn't completed */
_L10:
        obj = new com.google.b.e.b();
        continue; /* Loop/switch isn't completed */
_L11:
        obj = new com.google.b.c.b();
        continue; /* Loop/switch isn't completed */
_L12:
        obj = new c();
        if (true) goto _L14; else goto _L13
_L13:
    }
}

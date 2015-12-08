// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.c;

import com.android.b.ac;
import com.android.b.w;
import com.android.slyce.k.h;

// Referenced classes of package com.android.slyce.c:
//            a

class b
    implements w
{

    final StringBuilder a;
    final a b;

    b(a a1, StringBuilder stringbuilder)
    {
        b = a1;
        a = stringbuilder;
        super();
    }

    public void a(ac ac)
    {
        h.b(com.android.slyce.c.a.a(), (new StringBuilder()).append("Error on UPC resolution: ").append(a.toString()).toString());
    }
}

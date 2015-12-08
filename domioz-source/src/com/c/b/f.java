// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            az, aw, ba

final class f extends az
{

    f()
    {
    }

    public final boolean a(aw aw)
    {
        return true;
    }

    public final ba b(aw aw)
    {
        throw new IllegalStateException((new StringBuilder("Unrecognized type of request: ")).append(aw).toString());
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;


// Referenced classes of package com.google.android.gms.common.internal:
//            b

final class e extends b
{

    final char p;

    e(char c)
    {
        p = c;
        super();
    }

    public b a(b b1)
    {
        if (b1.b(p))
        {
            return b1;
        } else
        {
            return super.a(b1);
        }
    }

    public boolean b(char c)
    {
        return c == p;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;


// Referenced classes of package com.google.android.gms.common.internal:
//            j

final class m extends j
{

    final char p;

    m(char c)
    {
        p = c;
        super();
    }

    public final j a(j j1)
    {
        if (j1.a(p))
        {
            return j1;
        } else
        {
            return super.a(j1);
        }
    }

    public final boolean a(char c)
    {
        return c == p;
    }
}

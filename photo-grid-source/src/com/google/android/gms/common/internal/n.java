// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;


// Referenced classes of package com.google.android.gms.common.internal:
//            j

final class n extends j
{

    final char p;
    final char q;

    n(char c, char c1)
    {
        p = c;
        q = c1;
        super();
    }

    public final boolean a(char c)
    {
        return c == p || c == q;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.a;

import com.microsoft.onlineid.b.a;
import java.util.Locale;

public final class b extends a
{

    private final String a;
    private final String b;
    private final String c;

    public b(String s, String s1, String s2, String s3)
    {
        super(s);
        a = s1;
        b = s2;
        c = s3;
    }

    public final String toString()
    {
        return String.format(Locale.US, "Inline flow error to be resolved at '%s': %s (code = %s, extended = %s)", new Object[] {
            a, getMessage(), b, c
        });
    }
}

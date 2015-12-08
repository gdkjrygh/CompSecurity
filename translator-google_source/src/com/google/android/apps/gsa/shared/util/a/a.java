// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util.a;


// Referenced classes of package com.google.android.apps.gsa.shared.util.a:
//            c

public class a
{

    private final int a;
    private final int b;
    private final String c;
    private final String d;
    private final Class e;
    private String f;

    protected a(String s, int i, int j)
    {
        this(s, i, j, (byte)0);
    }

    private a(String s, int i, int j, byte byte0)
    {
        d = null;
        e = getClass();
        c = s;
        a = i;
        b = j;
    }

    public String toString()
    {
        if (f == null)
        {
            f = com.google.android.apps.gsa.shared.util.a.c.a(e, d, c);
        }
        return f;
    }
}

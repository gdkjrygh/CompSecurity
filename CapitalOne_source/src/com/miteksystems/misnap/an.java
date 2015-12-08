// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;


// Referenced classes of package com.miteksystems.misnap:
//            am

final class an
{

    long a;
    int b;
    String c;
    final am d;

    an(am am, String s, long l, int i)
    {
        d = am;
        super();
        a = l;
        c = s;
        b = i;
    }

    public final String toString()
    {
        return (new StringBuilder(String.valueOf(c))).append(" at ").append(a).append(" of value ").append(b).append("; ").toString();
    }
}

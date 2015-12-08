// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.a;


// Referenced classes of package com.google.android.m4b.maps.a:
//            k

final class b
    implements Runnable
{

    private String a;
    private long b;
    private k c;

    public final void run()
    {
        k.a(c).a(a, b);
        k.a(c).a(toString());
    }

    (k k1, String s, long l)
    {
        c = k1;
        a = s;
        b = l;
        super();
    }
}

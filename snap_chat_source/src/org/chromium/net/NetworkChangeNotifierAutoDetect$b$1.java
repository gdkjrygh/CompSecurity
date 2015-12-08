// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;


// Referenced classes of package org.chromium.net:
//            NetworkChangeNotifierAutoDetect

final class b
    implements Runnable
{

    private int a;
    private int b;
    private b c;

    public final void run()
    {
        NetworkChangeNotifierAutoDetect.b(c.c).a(a, b);
    }

    rver(rver rver, int i, int j)
    {
        c = rver;
        a = i;
        b = j;
        super();
    }
}

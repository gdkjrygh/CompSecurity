// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt;


// Referenced classes of package com.facebook.mqtt:
//            x, b

class f
    implements Runnable
{

    final String a;
    final byte b[];
    final x c;
    final boolean d;
    final int e;
    final b f;

    f(b b1, String s, byte abyte0[], x x1, boolean flag, int i)
    {
        f = b1;
        a = s;
        b = abyte0;
        c = x1;
        d = flag;
        e = i;
        super();
    }

    public void run()
    {
        com.facebook.mqtt.b.a(f, a, b, c.getValue(), d, e);
    }
}

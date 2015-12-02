// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.m;

import java.net.InetAddress;

// Referenced classes of package com.facebook.common.m:
//            b, d

public class a
{

    public a()
    {
    }

    public static InetAddress a(String s, long l)
    {
        s = new b(s);
        Thread thread = new Thread(s);
        thread.start();
        Object obj;
        try
        {
            thread.join(l);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        obj = s.a();
        thread.interrupt();
        if (obj == null)
        {
            throw new d(s.b());
        } else
        {
            return ((InetAddress) (obj));
        }
    }
}

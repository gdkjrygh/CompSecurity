// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import java.lang.reflect.Field;
import javax.net.ssl.SSLEngine;

// Referenced classes of package com.android.slyce.a.c:
//            ab, l

class bq
    implements ab
{

    Field a;
    Field b;
    Field c;
    Field d;

    public bq(Class class1)
    {
        try
        {
            a = class1.getSuperclass().getDeclaredField("peerHost");
            a.setAccessible(true);
            b = class1.getSuperclass().getDeclaredField("peerPort");
            b.setAccessible(true);
            c = class1.getDeclaredField("sslParameters");
            c.setAccessible(true);
            d = c.getType().getDeclaredField("useSni");
            d.setAccessible(true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return;
        }
    }

    public void a(SSLEngine sslengine, l l, String s, int i)
    {
        if (d == null)
        {
            return;
        }
        try
        {
            a.set(sslengine, s);
            b.set(sslengine, Integer.valueOf(i));
            sslengine = ((SSLEngine) (c.get(sslengine)));
            d.set(sslengine, Boolean.valueOf(true));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SSLEngine sslengine)
        {
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;


// Referenced classes of package org.chromium.net:
//            NetworkChangeNotifierAutoDetect

public static abstract class I
{

    static final boolean b;
    NetworkChangeNotifierAutoDetect a;

    protected final void a()
    {
        if (!b && a == null)
        {
            throw new AssertionError();
        } else
        {
            a.b();
            return;
        }
    }

    protected void a(NetworkChangeNotifierAutoDetect networkchangenotifierautodetect)
    {
        a = networkchangenotifierautodetect;
    }

    protected abstract void b();

    static 
    {
        boolean flag;
        if (!org/chromium/net/NetworkChangeNotifierAutoDetect.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }

    public I()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.util.Printer;

// Referenced classes of package org.chromium.base:
//            TraceEvent

static class <init>
    implements Printer
{

    private static boolean a;

    void a(String s)
    {
        if (TraceEvent.a())
        {
            TraceEvent.b();
        }
    }

    void b(String s)
    {
        if (TraceEvent.a())
        {
            TraceEvent.c();
        }
    }

    public void println(String s)
    {
        if (s.startsWith(">"))
        {
            a(s);
            return;
        }
        if (!a && !s.startsWith("<"))
        {
            throw new AssertionError();
        } else
        {
            b(s);
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!org/chromium/base/TraceEvent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}

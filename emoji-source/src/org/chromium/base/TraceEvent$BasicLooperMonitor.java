// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.util.Printer;

// Referenced classes of package org.chromium.base:
//            TraceEvent

private static class <init>
    implements Printer
{

    static final boolean $assertionsDisabled;

    void beginHandling(String s)
    {
        if (TraceEvent.access$000())
        {
            TraceEvent.access$100();
        }
    }

    void endHandling(String s)
    {
        if (TraceEvent.access$000())
        {
            TraceEvent.access$200();
        }
    }

    public void println(String s)
    {
        if (s.startsWith(">"))
        {
            beginHandling(s);
            return;
        }
        if (!$assertionsDisabled && !s.startsWith("<"))
        {
            throw new AssertionError();
        } else
        {
            endHandling(s);
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
        $assertionsDisabled = flag;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}

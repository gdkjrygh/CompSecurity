// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import com.google.common.base.Strings;
import java.util.Comparator;

// Referenced classes of package com.facebook.orca.threads:
//            ThreadSummary

public class w
    implements Comparator
{

    public w()
    {
    }

    public int a(ThreadSummary threadsummary, ThreadSummary threadsummary1)
    {
        if (threadsummary.l() > threadsummary1.l())
        {
            return -1;
        }
        if (threadsummary1.l() > threadsummary.l())
        {
            return 1;
        } else
        {
            return Strings.nullToEmpty(threadsummary.a()).compareTo(Strings.nullToEmpty(threadsummary1.a()));
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ThreadSummary)obj, (ThreadSummary)obj1);
    }
}

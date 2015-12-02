// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.logger;

import android.util.SparseIntArray;
import com.facebook.tools.dextr.bridge.constants.FilterType;
import java.util.Arrays;
import java.util.EnumSet;

// Referenced classes of package com.facebook.loom.logger:
//            LogWriter, AsyncColors, LogEntry, Closeables

public class FilteringLogWriter extends LogWriter
    implements AsyncColors.ColorListener
{

    private static final LogEntry.EntryType a[];
    private final LogWriter b;
    private final AsyncColors c;
    private final SparseIntArray d;
    private int e;
    private final boolean f;

    private FilteringLogWriter(LogWriter logwriter, AsyncColors asynccolors, EnumSet enumset)
    {
        e = 0x80000000;
        b = logwriter;
        c = asynccolors;
        d = new SparseIntArray(10);
        c.a(this);
        f = enumset.contains(FilterType.ASYNC);
    }

    public FilteringLogWriter(LogWriter logwriter, EnumSet enumset)
    {
        this(logwriter, new AsyncColors(10), enumset);
    }

    public final long a(LogEntry logentry)
    {
        if (f)
        {
            e = 0x80000000;
            int i = c.a(logentry);
            boolean flag;
            if (d.indexOfKey(i) >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (e != 0x80000000)
            {
                d.delete(e);
            }
            if (flag)
            {
                return b.a(logentry);
            } else
            {
                return (long)logentry.a();
            }
        } else
        {
            return b.a(logentry);
        }
    }

    public final void a(int i)
    {
        e = i;
    }

    public final void a(LogEntry.EntryType entrytype, int i)
    {
        if (Arrays.binarySearch(a, entrytype) >= 0)
        {
            d.put(i, entrytype.ordinal());
        }
    }

    public void close()
    {
        Closeables.a(b);
        c.a(null);
    }

    static 
    {
        LogEntry.EntryType aentrytype[] = new LogEntry.EntryType[7];
        aentrytype[0] = LogEntry.EntryType.UI_INPUT_START;
        aentrytype[1] = LogEntry.EntryType.LIFECYCLE_APPLICATION_START;
        aentrytype[2] = LogEntry.EntryType.LIFECYCLE_ACTIVITY_START;
        aentrytype[3] = LogEntry.EntryType.LIFECYCLE_SERVICE_START;
        aentrytype[4] = LogEntry.EntryType.LIFECYCLE_BROADCAST_RECEIVER_START;
        aentrytype[5] = LogEntry.EntryType.LIFECYCLE_FRAGMENT_START;
        aentrytype[6] = LogEntry.EntryType.LIFECYCLE_VIEW_START;
        a = aentrytype;
        Arrays.sort(aentrytype);
    }
}

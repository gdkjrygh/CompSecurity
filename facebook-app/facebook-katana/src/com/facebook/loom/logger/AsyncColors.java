// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.logger;

import android.util.SparseIntArray;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.facebook.loom.logger:
//            LogEntry

public class AsyncColors
{

    static final AtomicInteger a = new AtomicInteger(0x80000001);
    private SparseIntArray b;
    private SparseIntArray c;
    private SparseIntArray d;
    private ColorListener e;

    public AsyncColors(int i)
    {
        b = new SparseIntArray(i);
        c = new SparseIntArray(i);
        d = new SparseIntArray(i);
    }

    private void a(int i)
    {
        int l = c.get(i, 0);
        int j = l;
        if (l > 0)
        {
            j = l - 1;
            c.put(i, j);
        }
        if (j == 0)
        {
            int k = b.get(i, 0x80000000);
            b.put(i, 0x80000000);
            if (e != null && b.indexOfValue(k) < 0 && d.indexOfValue(k) < 0)
            {
                e.a(k);
            }
        }
    }

    private void a(int i, LogEntry.EntryType entrytype)
    {
        if (b.get(i, 0x80000000) == 0x80000000)
        {
            int j = a.getAndIncrement();
            b.put(i, j);
            if (e != null)
            {
                e.a(entrytype, j);
            }
        }
        int k = c.get(i, 0);
        c.put(i, k + 1);
    }

    public final int a(LogEntry logentry)
    {
        int k = logentry.d();
        LogEntry.EntryType entrytype = logentry.b();
        int j = logentry.a();
        int i = logentry.f();
        int l = d.indexOfKey(i);
        if (l >= 0)
        {
            b.put(k, d.valueAt(l));
            d.delete(i);
        }
        if (LogEntry.EntryType.isBlockStart(entrytype))
        {
            a(k, entrytype);
            i = b.get(k, 0x80000000);
        } else
        if (LogEntry.EntryType.isBlockEnd(entrytype))
        {
            i = b.get(k, 0x80000000);
            a(k);
        } else
        {
            a(k, entrytype);
            i = b.get(k, 0x80000000);
            a(k);
        }
        if (LogEntry.EntryType.isAsyncCall(entrytype))
        {
            d.put(j, i);
        }
        return i;
    }

    public final void a(ColorListener colorlistener)
    {
        e = colorlistener;
    }


    private class ColorListener
    {

        public abstract void a(int i);

        public abstract void a(LogEntry.EntryType entrytype, int i);
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import android.support.v4.util.LruCache;
import com.facebook.cache.common.CacheKey;
import com.facebook.ui.media.cache.MediaCacheKey;
import com.facebook.ui.media.cache.Range;
import com.google.common.collect.ImmutableList;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BytesViewedTracking
{

    private final Object a = new Object();
    private final LruCache b = new LruCache(300);
    private long c;
    private long d;
    private long e;
    private long f;

    public BytesViewedTracking()
    {
    }

    private static long a(Iterable iterable, int i)
    {
        iterable = iterable.iterator();
        long l;
        for (l = 0L; iterable.hasNext(); l = ((Range)iterable.next()).a() + l) { }
        return ((long)i * l) / 8000L;
    }

    private void a(long l)
    {
        c = c + l;
    }

    private void a(String s, long l, long l1, int i)
    {
        Range range = new Range(l, l1);
        if (s != null && i > 0)
        {
            Object obj1 = (List)b.a(s);
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = ImmutableList.of();
            }
            obj1 = range.b(((Iterable) (obj)));
            obj = range.c(((Iterable) (obj)));
            b.a(s, obj);
            a(a(((Iterable) (obj1)), i));
        }
        b(range.a());
    }

    private void b(long l)
    {
        e = e + l;
    }

    public final long a()
    {
        long l;
        long l1;
        synchronized (a)
        {
            l = c;
            l1 = d;
            d = c;
        }
        return l - l1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(MediaCacheKey mediacachekey, long l, long l1, int i)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (l < l1) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
_L6:
        a(((String) (mediacachekey)), l, l1, i);
        obj;
        JVM INSTR monitorexit ;
        return;
        mediacachekey;
        obj;
        JVM INSTR monitorexit ;
        throw mediacachekey;
_L4:
        mediacachekey = mediacachekey.a().toString();
        continue; /* Loop/switch isn't completed */
_L2:
        if (mediacachekey != null) goto _L4; else goto _L3
_L3:
        mediacachekey = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(DataInputStream datainputstream)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        int k;
        c = datainputstream.readLong();
        d = datainputstream.readLong();
        e = datainputstream.readLong();
        f = datainputstream.readLong();
        k = datainputstream.readInt();
        int i = 0;
_L6:
        if (i >= k) goto _L2; else goto _L1
_L1:
        String s;
        int l;
        s = datainputstream.readUTF();
        l = datainputstream.readInt();
        int j = 0;
_L4:
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        a(s, datainputstream.readLong(), datainputstream.readLong(), 0);
        j++;
        if (true) goto _L4; else goto _L3
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        datainputstream;
        obj;
        JVM INSTR monitorexit ;
        throw datainputstream;
_L3:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(DataOutputStream dataoutputstream)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        dataoutputstream.writeLong(c);
        dataoutputstream.writeLong(d);
        dataoutputstream.writeLong(e);
        dataoutputstream.writeLong(f);
        Object obj1 = b.d();
        dataoutputstream.writeInt(((Map) (obj1)).size());
        for (obj1 = ((Map) (obj1)).entrySet().iterator(); ((Iterator) (obj1)).hasNext();)
        {
            Object obj2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
            dataoutputstream.writeUTF((String)((java.util.Map.Entry) (obj2)).getKey());
            obj2 = (List)((java.util.Map.Entry) (obj2)).getValue();
            dataoutputstream.writeInt(((List) (obj2)).size());
            obj2 = ((List) (obj2)).iterator();
            while (((Iterator) (obj2)).hasNext()) 
            {
                Range range = (Range)((Iterator) (obj2)).next();
                dataoutputstream.writeLong(range.a);
                dataoutputstream.writeLong(range.b);
            }
        }

        break MISSING_BLOCK_LABEL_183;
        dataoutputstream;
        obj;
        JVM INSTR monitorexit ;
        throw dataoutputstream;
        obj;
        JVM INSTR monitorexit ;
    }

    public final long b()
    {
        long l;
        long l1;
        synchronized (a)
        {
            l = e;
            l1 = f;
            f = e;
        }
        return l - l1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}

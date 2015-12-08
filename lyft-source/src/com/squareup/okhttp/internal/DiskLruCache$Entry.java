// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import com.squareup.okhttp.internal.io.FileSystem;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import okio.BufferedSink;
import okio.Source;

// Referenced classes of package com.squareup.okhttp.internal:
//            DiskLruCache, Util

final class <init>
{

    private final File cleanFiles[];
    private  currentEditor;
    private final File dirtyFiles[];
    private final String key;
    private final long lengths[];
    private boolean readable;
    private long sequenceNumber;
    final DiskLruCache this$0;

    private IOException invalidLengths(String as[])
    {
        throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(Arrays.toString(as)).toString());
    }

    private void setLengths(String as[])
    {
        if (as.length != DiskLruCache.access$2300(DiskLruCache.this))
        {
            throw invalidLengths(as);
        }
        int i = 0;
        do
        {
            try
            {
                if (i >= as.length)
                {
                    break;
                }
                lengths[i] = Long.parseLong(as[i]);
            }
            catch (NumberFormatException numberformatexception)
            {
                throw invalidLengths(as);
            }
            i++;
        } while (true);
    }

    ot snapshot()
    {
        Source asource[];
        long al[];
        int i;
        boolean flag;
        flag = false;
        if (!Thread.holdsLock(DiskLruCache.this))
        {
            throw new AssertionError();
        }
        asource = new Source[DiskLruCache.access$2300(DiskLruCache.this)];
        al = (long[])lengths.clone();
        i = 0;
_L2:
        if (i >= DiskLruCache.access$2300(DiskLruCache.this))
        {
            break; /* Loop/switch isn't completed */
        }
        asource[i] = DiskLruCache.access$2400(DiskLruCache.this).source(cleanFiles[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        ot ot = new ot(DiskLruCache.this, key, sequenceNumber, asource, al, null);
        return ot;
_L4:
        for (; i < DiskLruCache.access$2300(DiskLruCache.this) && asource[i] != null; i++)
        {
            Util.closeQuietly(asource[i]);
        }

        return null;
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        i = ((flag) ? 1 : 0);
        if (true) goto _L4; else goto _L3
_L3:
    }

    void writeLengths(BufferedSink bufferedsink)
    {
        long al[] = lengths;
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            long l = al[i];
            bufferedsink.writeByte(32).writeDecimalLong(l);
        }

    }








/*
    static long access$1602(ot ot, long l)
    {
        ot.sequenceNumber = l;
        return l;
    }

*/



/*
    static boolean access$802(sequenceNumber sequencenumber, boolean flag)
    {
        sequencenumber.readable = flag;
        return flag;
    }

*/



/*
    static  access$902( ,  1)
    {
        .currentEditor = 1;
        return 1;
    }

*/

    private currentEditor(String s)
    {
        this$0 = DiskLruCache.this;
        super();
        key = s;
        lengths = new long[DiskLruCache.access$2300(DiskLruCache.this)];
        cleanFiles = new File[DiskLruCache.access$2300(DiskLruCache.this)];
        dirtyFiles = new File[DiskLruCache.access$2300(DiskLruCache.this)];
        s = (new StringBuilder(s)).append('.');
        int j = s.length();
        for (int i = 0; i < DiskLruCache.access$2300(DiskLruCache.this); i++)
        {
            s.append(i);
            cleanFiles[i] = new File(DiskLruCache.access$2800(DiskLruCache.this), s.toString());
            s.append(".tmp");
            dirtyFiles[i] = new File(DiskLruCache.access$2800(DiskLruCache.this), s.toString());
            s.setLength(j);
        }

    }

    ._cls2800(String s, ._cls2800 _pcls2800)
    {
        this(s);
    }
}

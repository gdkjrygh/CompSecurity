// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import c.ad;
import c.i;
import com.squareup.okhttp.internal.io.FileSystem;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

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
        int j = 0;
        do
        {
            try
            {
                if (j >= as.length)
                {
                    break;
                }
                lengths[j] = Long.parseLong(as[j]);
            }
            catch (NumberFormatException numberformatexception)
            {
                throw invalidLengths(as);
            }
            j++;
        } while (true);
    }

    ot snapshot()
    {
        ad aad[];
        long al[];
        int j;
        boolean flag;
        flag = false;
        if (!Thread.holdsLock(DiskLruCache.this))
        {
            throw new AssertionError();
        }
        aad = new ad[DiskLruCache.access$2300(DiskLruCache.this)];
        al = (long[])lengths.clone();
        j = 0;
_L2:
        if (j >= DiskLruCache.access$2300(DiskLruCache.this))
        {
            break; /* Loop/switch isn't completed */
        }
        aad[j] = DiskLruCache.access$2400(DiskLruCache.this).source(cleanFiles[j]);
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        ot ot = new ot(DiskLruCache.this, key, sequenceNumber, aad, al, null);
        return ot;
_L4:
        for (; j < DiskLruCache.access$2300(DiskLruCache.this) && aad[j] != null; j++)
        {
            Util.closeQuietly(aad[j]);
        }

        return null;
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        j = ((flag) ? 1 : 0);
        if (true) goto _L4; else goto _L3
_L3:
    }

    void writeLengths(i j)
    {
        long al[] = lengths;
        int l = al.length;
        for (int k = 0; k < l; k++)
        {
            long l1 = al[k];
            j.i(32).k(l1);
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
        int k = s.length();
        for (int j = 0; j < DiskLruCache.access$2300(DiskLruCache.this); j++)
        {
            s.append(j);
            cleanFiles[j] = new File(DiskLruCache.access$2800(DiskLruCache.this), s.toString());
            s.append(".tmp");
            dirtyFiles[j] = new File(DiskLruCache.access$2800(DiskLruCache.this), s.toString());
            s.setLength(k);
        }

    }

    ._cls2800(String s, ._cls2800 _pcls2800)
    {
        this(s);
    }
}

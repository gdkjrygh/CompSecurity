// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import cv;
import cx;
import fF;
import ft;
import fx;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class TimeToSampleBox extends ft
{
    public static class Entry
    {

        long count;
        long delta;

        public long getCount()
        {
            return count;
        }

        public long getDelta()
        {
            return delta;
        }

        public void setCount(long l)
        {
            count = l;
        }

        public void setDelta(long l)
        {
            delta = l;
        }

        public String toString()
        {
            return (new StringBuilder("Entry{count=")).append(count).append(", delta=").append(delta).append('}').toString();
        }

        public Entry(long l, long l1)
        {
            count = l;
            delta = l1;
        }
    }


    static final boolean $assertionsDisabled;
    public static final String TYPE = "stts";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    static Map cache = new WeakHashMap();
    List entries;

    public TimeToSampleBox()
    {
        super("stts");
        entries = Collections.emptyList();
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("TimeToSampleBox.java", com/coremedia/iso/boxes/TimeToSampleBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.util.List"), 79);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "", "void"), 83);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.lang.String"), 87);
    }

    public static long[] blowupTimeToSamples(List list)
    {
        com/coremedia/iso/boxes/TimeToSampleBox;
        JVM INSTR monitorenter ;
        Object obj = (SoftReference)cache.get(list);
        if (obj == null) goto _L2; else goto _L1
_L1:
        long al[] = (long[])((SoftReference) (obj)).get();
        if (al == null) goto _L2; else goto _L3
_L3:
        list = al;
_L5:
        com/coremedia/iso/boxes/TimeToSampleBox;
        JVM INSTR monitorexit ;
        return list;
_L2:
        al = list.iterator();
        long l = 0L;
_L4:
        if (al.hasNext())
        {
            break MISSING_BLOCK_LABEL_87;
        }
        if ($assertionsDisabled || l <= 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        throw new AssertionError();
        list;
        com/coremedia/iso/boxes/TimeToSampleBox;
        JVM INSTR monitorexit ;
        throw list;
        l = ((Entry)al.next()).getCount() + l;
          goto _L4
        Iterator iterator;
        al = new long[(int)l];
        iterator = list.iterator();
        int i = 0;
_L6:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_155;
        }
        cache.put(list, new SoftReference(al));
        list = al;
          goto _L5
        Entry entry = (Entry)iterator.next();
        int j = 0;
_L9:
        if ((long)j < entry.getCount()) goto _L7; else goto _L6
_L7:
        al[i] = entry.getDelta();
        j++;
        i++;
        if (true) goto _L9; else goto _L8
_L8:
          goto _L6
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        int j = fF.a(cv.a(bytebuffer));
        entries = new ArrayList(j);
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            entries.add(new Entry(cv.a(bytebuffer), cv.a(bytebuffer)));
            i++;
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.b(bytebuffer, entries.size());
        Iterator iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            Entry entry = (Entry)iterator.next();
            cx.b(bytebuffer, entry.getCount());
            cx.b(bytebuffer, entry.getDelta());
        } while (true);
    }

    protected long getContentSize()
    {
        return (long)((entries.size() << 3) + 8);
    }

    public List getEntries()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return entries;
    }

    public void setEntries(List list)
    {
        akp akp = akN.a(ajc$tjp_1, this, list);
        fx.a();
        fx.a(akp);
        entries = list;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("TimeToSampleBox[entryCount=")).append(entries.size()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
        boolean flag;
        if (!com/coremedia/iso/boxes/TimeToSampleBox.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

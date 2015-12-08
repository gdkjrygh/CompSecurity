// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import cv;
import cx;
import ft;
import fx;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProgressiveDownloadInformationBox extends ft
{
    public static class Entry
    {

        long initialDelay;
        long rate;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Entry)obj;
                if (initialDelay != ((Entry) (obj)).initialDelay)
                {
                    return false;
                }
                if (rate != ((Entry) (obj)).rate)
                {
                    return false;
                }
            }
            return true;
        }

        public long getInitialDelay()
        {
            return initialDelay;
        }

        public long getRate()
        {
            return rate;
        }

        public int hashCode()
        {
            return (int)(rate ^ rate >>> 32) * 31 + (int)(initialDelay ^ initialDelay >>> 32);
        }

        public void setInitialDelay(long l)
        {
            initialDelay = l;
        }

        public void setRate(long l)
        {
            rate = l;
        }

        public String toString()
        {
            return (new StringBuilder("Entry{rate=")).append(rate).append(", initialDelay=").append(initialDelay).append('}').toString();
        }

        public Entry(long l, long l1)
        {
            rate = l;
            initialDelay = l1;
        }
    }


    public static final String TYPE = "pdin";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    List entries;

    public ProgressiveDownloadInformationBox()
    {
        super("pdin");
        entries = Collections.emptyList();
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("ProgressiveDownloadInformationBox.java", com/coremedia/iso/boxes/ProgressiveDownloadInformationBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getEntries", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "", "", "", "java.util.List"), 38);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setEntries", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "java.util.List", "entries", "", "void"), 42);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "", "", "", "java.lang.String"), 112);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        entries = new LinkedList();
        do
        {
            if (bytebuffer.remaining() < 8)
            {
                return;
            }
            Entry entry = new Entry(cv.a(bytebuffer), cv.a(bytebuffer));
            entries.add(entry);
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        Iterator iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            Entry entry = (Entry)iterator.next();
            cx.b(bytebuffer, entry.getRate());
            cx.b(bytebuffer, entry.getInitialDelay());
        } while (true);
    }

    protected long getContentSize()
    {
        return (long)((entries.size() << 3) + 4);
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
        return (new StringBuilder("ProgressiveDownloadInfoBox{entries=")).append(entries).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}

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
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EditListBox extends ft
{
    public static class Entry
    {

        EditListBox editListBox;
        private double mediaRate;
        private long mediaTime;
        private long segmentDuration;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Entry)obj;
                if (mediaTime != ((Entry) (obj)).mediaTime)
                {
                    return false;
                }
                if (segmentDuration != ((Entry) (obj)).segmentDuration)
                {
                    return false;
                }
            }
            return true;
        }

        public void getContent(ByteBuffer bytebuffer)
        {
            if (editListBox.getVersion() == 1)
            {
                cx.a(bytebuffer, segmentDuration);
                bytebuffer.putLong(mediaTime);
            } else
            {
                cx.b(bytebuffer, fF.a(segmentDuration));
                bytebuffer.putInt(fF.a(mediaTime));
            }
            cx.a(bytebuffer, mediaRate);
        }

        public double getMediaRate()
        {
            return mediaRate;
        }

        public long getMediaTime()
        {
            return mediaTime;
        }

        public long getSegmentDuration()
        {
            return segmentDuration;
        }

        public int hashCode()
        {
            return (int)(segmentDuration ^ segmentDuration >>> 32) * 31 + (int)(mediaTime ^ mediaTime >>> 32);
        }

        public void setMediaRate(double d)
        {
            mediaRate = d;
        }

        public void setMediaTime(long l)
        {
            mediaTime = l;
        }

        public void setSegmentDuration(long l)
        {
            segmentDuration = l;
        }

        public String toString()
        {
            return (new StringBuilder("Entry{segmentDuration=")).append(segmentDuration).append(", mediaTime=").append(mediaTime).append(", mediaRate=").append(mediaRate).append('}').toString();
        }

        public Entry(EditListBox editlistbox, long l, long l1, double d)
        {
            segmentDuration = l;
            mediaTime = l1;
            mediaRate = d;
            editListBox = editlistbox;
        }

        public Entry(EditListBox editlistbox, ByteBuffer bytebuffer)
        {
            if (editlistbox.getVersion() == 1)
            {
                segmentDuration = cv.f(bytebuffer);
                mediaTime = bytebuffer.getLong();
                mediaRate = cv.g(bytebuffer);
            } else
            {
                segmentDuration = cv.a(bytebuffer);
                mediaTime = bytebuffer.getInt();
                mediaRate = cv.g(bytebuffer);
            }
            editListBox = editlistbox;
        }
    }


    public static final String TYPE = "elst";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private List entries;

    public EditListBox()
    {
        super("elst");
        entries = new LinkedList();
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("EditListBox.java", com/coremedia/iso/boxes/EditListBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getEntries", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.util.List"), 68);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setEntries", "com.coremedia.iso.boxes.EditListBox", "java.util.List", "entries", "", "void"), 72);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.lang.String"), 108);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        int j = fF.a(cv.a(bytebuffer));
        entries = new LinkedList();
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            entries.add(new Entry(this, bytebuffer));
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
            ((Entry)iterator.next()).getContent(bytebuffer);
        } while (true);
    }

    protected long getContentSize()
    {
        if (getVersion() == 1)
        {
            return (long)(entries.size() * 20) + 8L;
        } else
        {
            return (long)(entries.size() * 12) + 8L;
        }
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
        return (new StringBuilder("EditListBox{entries=")).append(entries).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}

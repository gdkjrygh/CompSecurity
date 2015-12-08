// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.fragment;

import akL;
import akN;
import cv;
import cw;
import cx;
import cy;
import ft;
import fx;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TrackFragmentRandomAccessBox extends ft
{
    public static class Entry
    {

        private long moofOffset;
        private long sampleNumber;
        private long time;
        private long trafNumber;
        private long trunNumber;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Entry)obj;
                if (moofOffset != ((Entry) (obj)).moofOffset)
                {
                    return false;
                }
                if (sampleNumber != ((Entry) (obj)).sampleNumber)
                {
                    return false;
                }
                if (time != ((Entry) (obj)).time)
                {
                    return false;
                }
                if (trafNumber != ((Entry) (obj)).trafNumber)
                {
                    return false;
                }
                if (trunNumber != ((Entry) (obj)).trunNumber)
                {
                    return false;
                }
            }
            return true;
        }

        public long getMoofOffset()
        {
            return moofOffset;
        }

        public long getSampleNumber()
        {
            return sampleNumber;
        }

        public long getTime()
        {
            return time;
        }

        public long getTrafNumber()
        {
            return trafNumber;
        }

        public long getTrunNumber()
        {
            return trunNumber;
        }

        public int hashCode()
        {
            return ((((int)(time ^ time >>> 32) * 31 + (int)(moofOffset ^ moofOffset >>> 32)) * 31 + (int)(trafNumber ^ trafNumber >>> 32)) * 31 + (int)(trunNumber ^ trunNumber >>> 32)) * 31 + (int)(sampleNumber ^ sampleNumber >>> 32);
        }

        public void setMoofOffset(long l)
        {
            moofOffset = l;
        }

        public void setSampleNumber(long l)
        {
            sampleNumber = l;
        }

        public void setTime(long l)
        {
            time = l;
        }

        public void setTrafNumber(long l)
        {
            trafNumber = l;
        }

        public void setTrunNumber(long l)
        {
            trunNumber = l;
        }

        public String toString()
        {
            return (new StringBuilder("Entry{time=")).append(time).append(", moofOffset=").append(moofOffset).append(", trafNumber=").append(trafNumber).append(", trunNumber=").append(trunNumber).append(", sampleNumber=").append(sampleNumber).append('}').toString();
        }











        public Entry()
        {
        }

        public Entry(long l, long l1, long l2, long l3, long l4)
        {
            moofOffset = l1;
            sampleNumber = l4;
            time = l;
            trafNumber = l2;
            trunNumber = l3;
        }
    }


    public static final String TYPE = "tfra";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_10;
    private static final akp.a ajc$tjp_11;
    private static final akp.a ajc$tjp_12;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private static final akp.a ajc$tjp_6;
    private static final akp.a ajc$tjp_7;
    private static final akp.a ajc$tjp_8;
    private static final akp.a ajc$tjp_9;
    private List entries;
    private int lengthSizeOfSampleNum;
    private int lengthSizeOfTrafNum;
    private int lengthSizeOfTrunNum;
    private int reserved;
    private long trackId;

    public TrackFragmentRandomAccessBox()
    {
        super("tfra");
        lengthSizeOfTrafNum = 2;
        lengthSizeOfTrunNum = 2;
        lengthSizeOfSampleNum = 2;
        entries = Collections.emptyList();
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("TrackFragmentRandomAccessBox.java", com/coremedia/iso/boxes/fragment/TrackFragmentRandomAccessBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "long", "trackId", "", "void"), 145);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrafNum", "", "void"), 149);
        ajc$tjp_10 = akn.a("method-execution", akn.a("1", "getEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.util.List"), 185);
        ajc$tjp_11 = akn.a("method-execution", akn.a("1", "setEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "java.util.List", "entries", "", "void"), 189);
        ajc$tjp_12 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.lang.String"), 290);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "setLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrunNum", "", "void"), 153);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "setLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfSampleNum", "", "void"), 157);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "long"), 161);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "getReserved", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 165);
        ajc$tjp_6 = akn.a("method-execution", akn.a("1", "getLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 169);
        ajc$tjp_7 = akn.a("method-execution", akn.a("1", "getLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 173);
        ajc$tjp_8 = akn.a("method-execution", akn.a("1", "getLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 177);
        ajc$tjp_9 = akn.a("method-execution", akn.a("1", "getNumberOfEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "long"), 181);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        trackId = cv.a(bytebuffer);
        long l = cv.a(bytebuffer);
        reserved = (int)(l >> 6);
        lengthSizeOfTrafNum = ((int)(63L & l) >> 4) + 1;
        lengthSizeOfTrunNum = ((int)(12L & l) >> 2) + 1;
        lengthSizeOfSampleNum = (int)(l & 3L) + 1;
        l = cv.a(bytebuffer);
        entries = new ArrayList();
        int i = 0;
        do
        {
            if ((long)i >= l)
            {
                return;
            }
            Entry entry = new Entry();
            if (getVersion() == 1)
            {
                entry.time = cv.f(bytebuffer);
                entry.moofOffset = cv.f(bytebuffer);
            } else
            {
                entry.time = cv.a(bytebuffer);
                entry.moofOffset = cv.a(bytebuffer);
            }
            entry.trafNumber = cw.a(bytebuffer, lengthSizeOfTrafNum);
            entry.trunNumber = cw.a(bytebuffer, lengthSizeOfTrunNum);
            entry.sampleNumber = cw.a(bytebuffer, lengthSizeOfSampleNum);
            entries.add(entry);
            i++;
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.b(bytebuffer, trackId);
        cx.b(bytebuffer, (long)(reserved << 6) | (long)((lengthSizeOfTrafNum - 1 & 3) << 4) | (long)((lengthSizeOfTrunNum - 1 & 3) << 2) | (long)(lengthSizeOfSampleNum - 1 & 3));
        cx.b(bytebuffer, entries.size());
        Iterator iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            Entry entry = (Entry)iterator.next();
            if (getVersion() == 1)
            {
                cx.a(bytebuffer, entry.time);
                cx.a(bytebuffer, entry.moofOffset);
            } else
            {
                cx.b(bytebuffer, entry.time);
                cx.b(bytebuffer, entry.moofOffset);
            }
            cy.a(entry.trafNumber, bytebuffer, lengthSizeOfTrafNum);
            cy.a(entry.trunNumber, bytebuffer, lengthSizeOfTrunNum);
            cy.a(entry.sampleNumber, bytebuffer, lengthSizeOfSampleNum);
        } while (true);
    }

    protected long getContentSize()
    {
        long l;
        if (getVersion() == 1)
        {
            l = (long)(entries.size() * 16) + 16L;
        } else
        {
            l = (long)(entries.size() * 8) + 16L;
        }
        return l + (long)(lengthSizeOfTrafNum * entries.size()) + (long)(lengthSizeOfTrunNum * entries.size()) + (long)(lengthSizeOfSampleNum * entries.size());
    }

    public List getEntries()
    {
        akp akp = akN.a(ajc$tjp_10, this);
        fx.a();
        fx.a(akp);
        return Collections.unmodifiableList(entries);
    }

    public int getLengthSizeOfSampleNum()
    {
        akp akp = akN.a(ajc$tjp_8, this);
        fx.a();
        fx.a(akp);
        return lengthSizeOfSampleNum;
    }

    public int getLengthSizeOfTrafNum()
    {
        akp akp = akN.a(ajc$tjp_6, this);
        fx.a();
        fx.a(akp);
        return lengthSizeOfTrafNum;
    }

    public int getLengthSizeOfTrunNum()
    {
        akp akp = akN.a(ajc$tjp_7, this);
        fx.a();
        fx.a(akp);
        return lengthSizeOfTrunNum;
    }

    public long getNumberOfEntries()
    {
        akp akp = akN.a(ajc$tjp_9, this);
        fx.a();
        fx.a(akp);
        return (long)entries.size();
    }

    public int getReserved()
    {
        akp akp = akN.a(ajc$tjp_5, this);
        fx.a();
        fx.a(akp);
        return reserved;
    }

    public long getTrackId()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        return trackId;
    }

    public void setEntries(List list)
    {
        akp akp = akN.a(ajc$tjp_11, this, list);
        fx.a();
        fx.a(akp);
        entries = list;
    }

    public void setLengthSizeOfSampleNum(int i)
    {
        akp akp = akN.a(ajc$tjp_3, this, akL.a(i));
        fx.a();
        fx.a(akp);
        lengthSizeOfSampleNum = i;
    }

    public void setLengthSizeOfTrafNum(int i)
    {
        akp akp = akN.a(ajc$tjp_1, this, akL.a(i));
        fx.a();
        fx.a(akp);
        lengthSizeOfTrafNum = i;
    }

    public void setLengthSizeOfTrunNum(int i)
    {
        akp akp = akN.a(ajc$tjp_2, this, akL.a(i));
        fx.a();
        fx.a(akp);
        lengthSizeOfTrunNum = i;
    }

    public void setTrackId(long l)
    {
        akp akp = akN.a(ajc$tjp_0, this, akL.a(l));
        fx.a();
        fx.a(akp);
        trackId = l;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_12, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("TrackFragmentRandomAccessBox{trackId=")).append(trackId).append(", entries=").append(entries).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SampleDependencyTypeBox extends ft
{
    public static class Entry
    {

        private int value;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Entry)obj;
                if (value != ((Entry) (obj)).value)
                {
                    return false;
                }
            }
            return true;
        }

        public int getReserved()
        {
            return value >> 6 & 3;
        }

        public int getSampleDependsOn()
        {
            return value >> 4 & 3;
        }

        public int getSampleHasRedundancy()
        {
            return value & 3;
        }

        public int getSampleIsDependentOn()
        {
            return value >> 2 & 3;
        }

        public int hashCode()
        {
            return value;
        }

        public void setReserved(int i)
        {
            value = (i & 3) << 6 | value & 0x3f;
        }

        public void setSampleDependsOn(int i)
        {
            value = (i & 3) << 4 | value & 0xcf;
        }

        public void setSampleHasRedundancy(int i)
        {
            value = i & 3 | value & 0xfc;
        }

        public void setSampleIsDependentOn(int i)
        {
            value = (i & 3) << 2 | value & 0xf3;
        }

        public String toString()
        {
            return (new StringBuilder("Entry{reserved=")).append(getReserved()).append(", sampleDependsOn=").append(getSampleDependsOn()).append(", sampleIsDependentOn=").append(getSampleIsDependentOn()).append(", sampleHasRedundancy=").append(getSampleHasRedundancy()).append('}').toString();
        }


        public Entry(int i)
        {
            value = i;
        }
    }


    public static final String TYPE = "sdtp";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private List entries;

    public SampleDependencyTypeBox()
    {
        super("sdtp");
        entries = new ArrayList();
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("SampleDependencyTypeBox.java", com/coremedia/iso/boxes/SampleDependencyTypeBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getEntries", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "", "", "", "java.util.List"), 139);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setEntries", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "java.util.List", "entries", "", "void"), 143);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "", "", "", "java.lang.String"), 148);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        do
        {
            if (bytebuffer.remaining() <= 0)
            {
                return;
            }
            entries.add(new Entry(cv.d(bytebuffer)));
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
            cx.c(bytebuffer, ((Entry)iterator.next()).value);
        } while (true);
    }

    protected long getContentSize()
    {
        return (long)(entries.size() + 4);
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
        Object obj = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(((akp) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("SampleDependencyTypeBox");
        ((StringBuilder) (obj)).append("{entries=").append(entries);
        ((StringBuilder) (obj)).append('}');
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}

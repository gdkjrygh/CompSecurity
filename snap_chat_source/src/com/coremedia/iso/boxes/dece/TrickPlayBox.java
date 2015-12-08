// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.dece;

import akN;
import cv;
import cx;
import ft;
import fx;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TrickPlayBox extends ft
{
    public static class Entry
    {

        private int value;

        public int getDependencyLevel()
        {
            return value & 0x3f;
        }

        public int getPicType()
        {
            return value >> 6 & 3;
        }

        public void setDependencyLevel(int i)
        {
            value = i & 0x3f | value;
        }

        public void setPicType(int i)
        {
            value = value & 0x1f;
            value = (i & 3) << 6 | value;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Entry");
            stringbuilder.append("{picType=").append(getPicType());
            stringbuilder.append(",dependencyLevel=").append(getDependencyLevel());
            stringbuilder.append('}');
            return stringbuilder.toString();
        }


        public Entry()
        {
        }

        public Entry(int i)
        {
            value = i;
        }
    }


    public static final String TYPE = "trik";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private List entries;

    public TrickPlayBox()
    {
        super("trik");
        entries = new ArrayList();
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("TrickPlayBox.java", com/coremedia/iso/boxes/dece/TrickPlayBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "setEntries", "com.coremedia.iso.boxes.dece.TrickPlayBox", "java.util.List", "entries", "", "void"), 32);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getEntries", "com.coremedia.iso.boxes.dece.TrickPlayBox", "", "", "", "java.util.List"), 36);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.dece.TrickPlayBox", "", "", "", "java.lang.String"), 103);
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
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return entries;
    }

    public void setEntries(List list)
    {
        akp akp = akN.a(ajc$tjp_0, this, list);
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
        ((StringBuilder) (obj)).append("TrickPlayBox");
        ((StringBuilder) (obj)).append("{entries=").append(entries);
        ((StringBuilder) (obj)).append('}');
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}

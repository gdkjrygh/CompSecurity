// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akL;
import akN;
import cu;
import cv;
import cx;
import fr;
import fx;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FileTypeBox extends fr
{

    public static final String TYPE = "ftyp";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private List compatibleBrands;
    private String majorBrand;
    private long minorVersion;

    public FileTypeBox()
    {
        super("ftyp");
        compatibleBrands = Collections.emptyList();
    }

    public FileTypeBox(String s, long l, List list)
    {
        super("ftyp");
        compatibleBrands = Collections.emptyList();
        majorBrand = s;
        minorVersion = l;
        compatibleBrands = list;
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("FileTypeBox.java", com/coremedia/iso/boxes/FileTypeBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.lang.String"), 85);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "", "void"), 94);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "int", "minorVersion", "", "void"), 103);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "long"), 113);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.util.List"), 122);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "", "void"), 126);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        majorBrand = cv.k(bytebuffer);
        minorVersion = cv.a(bytebuffer);
        int j = bytebuffer.remaining() / 4;
        compatibleBrands = new LinkedList();
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            compatibleBrands.add(cv.k(bytebuffer));
            i++;
        } while (true);
    }

    public List getCompatibleBrands()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        return compatibleBrands;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer.put(cu.a(majorBrand));
        cx.b(bytebuffer, minorVersion);
        Iterator iterator = compatibleBrands.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            bytebuffer.put(cu.a((String)iterator.next()));
        } while (true);
    }

    protected long getContentSize()
    {
        return (long)((compatibleBrands.size() << 2) + 8);
    }

    public String getMajorBrand()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return majorBrand;
    }

    public long getMinorVersion()
    {
        akp akp = akN.a(ajc$tjp_3, this);
        fx.a();
        fx.a(akp);
        return minorVersion;
    }

    public void setCompatibleBrands(List list)
    {
        akp akp = akN.a(ajc$tjp_5, this, list);
        fx.a();
        fx.a(akp);
        compatibleBrands = list;
    }

    public void setMajorBrand(String s)
    {
        akp akp = akN.a(ajc$tjp_1, this, s);
        fx.a();
        fx.a(akp);
        majorBrand = s;
    }

    public void setMinorVersion(int i)
    {
        akp akp = akN.a(ajc$tjp_2, this, akL.a(i));
        fx.a();
        fx.a(akp);
        minorVersion = i;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("FileTypeBox[");
        stringbuilder.append("majorBrand=").append(getMajorBrand());
        stringbuilder.append(";");
        stringbuilder.append("minorVersion=").append(getMinorVersion());
        Iterator iterator = compatibleBrands.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                stringbuilder.append("]");
                return stringbuilder.toString();
            }
            String s = (String)iterator.next();
            stringbuilder.append(";");
            stringbuilder.append("compatibleBrand=").append(s);
        } while (true);
    }

    static 
    {
        ajc$preClinit();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.b.b.a.a;
import org.b.b.b.b;

public class FileTypeBox extends AbstractBox
{

    public static final String TYPE = "ftyp";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
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
        b b1 = new b("FileTypeBox.java", com/coremedia/iso/boxes/FileTypeBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.lang.String"), 85);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "", "void"), 94);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "int", "minorVersion", "", "void"), 103);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "long"), 113);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.util.List"), 122);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "", "void"), 126);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        majorBrand = IsoTypeReader.read4cc(bytebuffer);
        minorVersion = IsoTypeReader.readUInt32(bytebuffer);
        int j = bytebuffer.remaining() / 4;
        compatibleBrands = new LinkedList();
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            compatibleBrands.add(IsoTypeReader.read4cc(bytebuffer));
            i++;
        } while (true);
    }

    public List getCompatibleBrands()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return compatibleBrands;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer.put(IsoFile.fourCCtoBytes(majorBrand));
        IsoTypeWriter.writeUInt32(bytebuffer, minorVersion);
        Iterator iterator = compatibleBrands.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            bytebuffer.put(IsoFile.fourCCtoBytes((String)iterator.next()));
        } while (true);
    }

    protected long getContentSize()
    {
        return (long)(compatibleBrands.size() * 4 + 8);
    }

    public String getMajorBrand()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return majorBrand;
    }

    public long getMinorVersion()
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return minorVersion;
    }

    public void setCompatibleBrands(List list)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(a1);
        compatibleBrands = list;
    }

    public void setMajorBrand(String s)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a1);
        majorBrand = s;
    }

    public void setMinorVersion(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
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

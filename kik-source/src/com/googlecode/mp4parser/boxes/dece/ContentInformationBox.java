// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.dece;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.b.b.b.b;

public class ContentInformationBox extends AbstractFullBox
{
    public static class BrandEntry
    {

        String iso_brand;
        String version;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (BrandEntry)obj;
                if (iso_brand == null ? ((BrandEntry) (obj)).iso_brand != null : !iso_brand.equals(((BrandEntry) (obj)).iso_brand))
                {
                    return false;
                }
                if (version == null ? ((BrandEntry) (obj)).version != null : !version.equals(((BrandEntry) (obj)).version))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (iso_brand != null)
            {
                i = iso_brand.hashCode();
            } else
            {
                i = 0;
            }
            if (version != null)
            {
                j = version.hashCode();
            }
            return i * 31 + j;
        }

        public BrandEntry(String s, String s1)
        {
            iso_brand = s;
            version = s1;
        }
    }


    public static final String TYPE = "cinf";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_10;
    private static final org.b.a.a.a ajc$tjp_11;
    private static final org.b.a.a.a ajc$tjp_12;
    private static final org.b.a.a.a ajc$tjp_13;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private static final org.b.a.a.a ajc$tjp_9;
    Map brandEntries;
    String codecs;
    Map idEntries;
    String languages;
    String mimeSubtypeName;
    String profileLevelIdc;
    String protection;

    public ContentInformationBox()
    {
        super("cinf");
        brandEntries = new LinkedHashMap();
        idEntries = new LinkedHashMap();
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("ContentInformationBox.java", com/googlecode/mp4parser/boxes/dece/ContentInformationBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getMimeSubtypeName", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 144);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setMimeSubtypeName", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "mimeSubtypeName", "", "void"), 148);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "getBrandEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.util.Map"), 184);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "setBrandEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.util.Map", "brandEntries", "", "void"), 188);
        ajc$tjp_12 = b1.a("method-execution", b1.a("1", "getIdEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.util.Map"), 192);
        ajc$tjp_13 = b1.a("method-execution", b1.a("1", "setIdEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.util.Map", "idEntries", "", "void"), 196);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getProfileLevelIdc", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 152);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setProfileLevelIdc", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "profileLevelIdc", "", "void"), 156);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getCodecs", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 160);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setCodecs", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "codecs", "", "void"), 164);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getProtection", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 168);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "setProtection", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "protection", "", "void"), 172);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "getLanguages", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 176);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "setLanguages", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "languages", "", "void"), 180);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        int i;
        parseVersionAndFlags(bytebuffer);
        mimeSubtypeName = IsoTypeReader.readString(bytebuffer);
        profileLevelIdc = IsoTypeReader.readString(bytebuffer);
        codecs = IsoTypeReader.readString(bytebuffer);
        protection = IsoTypeReader.readString(bytebuffer);
        languages = IsoTypeReader.readString(bytebuffer);
        i = IsoTypeReader.readUInt8(bytebuffer);
_L3:
        if (i > 0) goto _L2; else goto _L1
_L1:
        i = IsoTypeReader.readUInt8(bytebuffer);
_L4:
        if (i <= 0)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_90;
_L2:
        brandEntries.put(IsoTypeReader.readString(bytebuffer), IsoTypeReader.readString(bytebuffer));
        i--;
          goto _L3
        idEntries.put(IsoTypeReader.readString(bytebuffer), IsoTypeReader.readString(bytebuffer));
        i--;
          goto _L4
    }

    public Map getBrandEntries()
    {
        org.b.a.a a = b.a(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return brandEntries;
    }

    public String getCodecs()
    {
        org.b.a.a a = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return codecs;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        Iterator iterator;
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeZeroTermUtf8String(bytebuffer, mimeSubtypeName);
        IsoTypeWriter.writeZeroTermUtf8String(bytebuffer, profileLevelIdc);
        IsoTypeWriter.writeZeroTermUtf8String(bytebuffer, codecs);
        IsoTypeWriter.writeZeroTermUtf8String(bytebuffer, protection);
        IsoTypeWriter.writeZeroTermUtf8String(bytebuffer, languages);
        IsoTypeWriter.writeUInt8(bytebuffer, brandEntries.size());
        iterator = brandEntries.entrySet().iterator();
_L3:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        IsoTypeWriter.writeUInt8(bytebuffer, idEntries.size());
        iterator = idEntries.entrySet().iterator();
_L4:
        if (!iterator.hasNext())
        {
            return;
        }
        break MISSING_BLOCK_LABEL_159;
_L2:
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
        IsoTypeWriter.writeZeroTermUtf8String(bytebuffer, (String)entry.getKey());
        IsoTypeWriter.writeZeroTermUtf8String(bytebuffer, (String)entry.getValue());
          goto _L3
        java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
        IsoTypeWriter.writeZeroTermUtf8String(bytebuffer, (String)entry1.getKey());
        IsoTypeWriter.writeZeroTermUtf8String(bytebuffer, (String)entry1.getValue());
          goto _L4
    }

    protected long getContentSize()
    {
        Iterator iterator;
        long l;
        l = Utf8.utf8StringLengthInBytes(mimeSubtypeName) + 1;
        long l1 = Utf8.utf8StringLengthInBytes(profileLevelIdc) + 1;
        long l4 = Utf8.utf8StringLengthInBytes(codecs) + 1;
        long l5 = Utf8.utf8StringLengthInBytes(protection) + 1;
        long l6 = Utf8.utf8StringLengthInBytes(languages) + 1;
        iterator = brandEntries.entrySet().iterator();
        l = 4L + l + l1 + l4 + l5 + l6 + 1L;
_L3:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        iterator = idEntries.entrySet().iterator();
        l++;
_L4:
        if (!iterator.hasNext())
        {
            return l;
        }
        break MISSING_BLOCK_LABEL_184;
_L2:
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
        long l2 = Utf8.utf8StringLengthInBytes((String)entry.getKey()) + 1;
        l = (long)(Utf8.utf8StringLengthInBytes((String)entry.getValue()) + 1) + (l + l2);
          goto _L3
        java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
        long l3 = Utf8.utf8StringLengthInBytes((String)entry1.getKey()) + 1;
        l = (long)(Utf8.utf8StringLengthInBytes((String)entry1.getValue()) + 1) + (l + l3);
          goto _L4
    }

    public Map getIdEntries()
    {
        org.b.a.a a = b.a(ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return idEntries;
    }

    public String getLanguages()
    {
        org.b.a.a a = b.a(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return languages;
    }

    public String getMimeSubtypeName()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return mimeSubtypeName;
    }

    public String getProfileLevelIdc()
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return profileLevelIdc;
    }

    public String getProtection()
    {
        org.b.a.a a = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return protection;
    }

    public void setBrandEntries(Map map)
    {
        org.b.a.a a = b.a(ajc$tjp_11, this, this, map);
        RequiresParseDetailAspect.aspectOf().before(a);
        brandEntries = map;
    }

    public void setCodecs(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_5, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        codecs = s;
    }

    public void setIdEntries(Map map)
    {
        org.b.a.a a = b.a(ajc$tjp_13, this, this, map);
        RequiresParseDetailAspect.aspectOf().before(a);
        idEntries = map;
    }

    public void setLanguages(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_9, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        languages = s;
    }

    public void setMimeSubtypeName(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        mimeSubtypeName = s;
    }

    public void setProfileLevelIdc(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        profileLevelIdc = s;
    }

    public void setProtection(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_7, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        protection = s;
    }

    static 
    {
        ajc$preClinit();
    }
}

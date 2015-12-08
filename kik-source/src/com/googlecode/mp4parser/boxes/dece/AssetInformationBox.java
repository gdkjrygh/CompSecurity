// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.dece;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.b.b;

public class AssetInformationBox extends AbstractFullBox
{
    public static class Entry
    {

        public String assetId;
        public String namespace;
        public String profileLevelIdc;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Entry)obj;
                if (!assetId.equals(((Entry) (obj)).assetId))
                {
                    return false;
                }
                if (!namespace.equals(((Entry) (obj)).namespace))
                {
                    return false;
                }
                if (!profileLevelIdc.equals(((Entry) (obj)).profileLevelIdc))
                {
                    return false;
                }
            }
            return true;
        }

        public int getSize()
        {
            return Utf8.utf8StringLengthInBytes(namespace) + 3 + Utf8.utf8StringLengthInBytes(profileLevelIdc) + Utf8.utf8StringLengthInBytes(assetId);
        }

        public int hashCode()
        {
            return (namespace.hashCode() * 31 + profileLevelIdc.hashCode()) * 31 + assetId.hashCode();
        }

        public String toString()
        {
            return (new StringBuilder("{namespace='")).append(namespace).append('\'').append(", profileLevelIdc='").append(profileLevelIdc).append('\'').append(", assetId='").append(assetId).append('\'').append('}').toString();
        }

        public Entry(String s, String s1, String s2)
        {
            namespace = s;
            profileLevelIdc = s1;
            assetId = s2;
        }
    }


    static final boolean $assertionsDisabled;
    public static final String TYPE = "ainf";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    String apid;
    String profileVersion;

    public AssetInformationBox()
    {
        super("ainf");
        apid = "";
        profileVersion = "0000";
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("AssetInformationBox.java", com/googlecode/mp4parser/boxes/dece/AssetInformationBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getApid", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "", "", "", "java.lang.String"), 131);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setApid", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "java.lang.String", "apid", "", "void"), 135);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getProfileVersion", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "", "", "", "java.lang.String"), 139);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setProfileVersion", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "java.lang.String", "profileVersion", "", "void"), 143);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        profileVersion = IsoTypeReader.readString(bytebuffer, 4);
        apid = IsoTypeReader.readString(bytebuffer);
    }

    public String getApid()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return apid;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        if (getVersion() == 0)
        {
            bytebuffer.put(Utf8.convert(profileVersion), 0, 4);
            bytebuffer.put(Utf8.convert(apid));
            bytebuffer.put((byte)0);
            return;
        } else
        {
            throw new RuntimeException((new StringBuilder("Unknown ainf version ")).append(getVersion()).toString());
        }
    }

    protected long getContentSize()
    {
        return (long)(Utf8.utf8StringLengthInBytes(apid) + 9);
    }

    public String getProfileVersion()
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return profileVersion;
    }

    public boolean isHidden()
    {
        return (getFlags() & 1) == 1;
    }

    public void setApid(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        apid = s;
    }

    public void setHidden(boolean flag)
    {
        int i;
label0:
        {
            i = getFlags();
            if (isHidden() ^ flag)
            {
                if (!flag)
                {
                    break label0;
                }
                setFlags(i | 1);
            }
            return;
        }
        setFlags(i & 0xfffffe);
    }

    public void setProfileVersion(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        if (!$assertionsDisabled && (s == null || s.length() != 4))
        {
            throw new AssertionError();
        } else
        {
            profileVersion = s;
            return;
        }
    }

    static 
    {
        ajc$preClinit();
        boolean flag;
        if (!com/googlecode/mp4parser/boxes/dece/AssetInformationBox.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

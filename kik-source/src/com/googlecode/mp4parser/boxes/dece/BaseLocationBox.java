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

public class BaseLocationBox extends AbstractFullBox
{

    public static final String TYPE = "bloc";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    String baseLocation;
    String purchaseLocation;

    public BaseLocationBox()
    {
        super("bloc");
        baseLocation = "";
        purchaseLocation = "";
    }

    public BaseLocationBox(String s, String s1)
    {
        super("bloc");
        baseLocation = "";
        purchaseLocation = "";
        baseLocation = s;
        purchaseLocation = s1;
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("BaseLocationBox.java", com/googlecode/mp4parser/boxes/dece/BaseLocationBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getBaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setBaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "java.lang.String", "baseLocation", "", "void"), 48);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getPurchaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 52);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setPurchaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "java.lang.String", "purchaseLocation", "", "void"), 56);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "equals", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "java.lang.Object", "o", "", "boolean"), 86);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "hashCode", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "int"), 100);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "toString", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 107);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        baseLocation = IsoTypeReader.readString(bytebuffer);
        bytebuffer.get(new byte[256 - Utf8.utf8StringLengthInBytes(baseLocation) - 1]);
        purchaseLocation = IsoTypeReader.readString(bytebuffer);
        bytebuffer.get(new byte[256 - Utf8.utf8StringLengthInBytes(purchaseLocation) - 1]);
        bytebuffer.get(new byte[512]);
    }

    public boolean equals(Object obj)
    {
        org.b.a.a a = b.a(ajc$tjp_4, this, this, obj);
        RequiresParseDetailAspect.aspectOf().before(a);
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (BaseLocationBox)obj;
            if (baseLocation == null ? ((BaseLocationBox) (obj)).baseLocation != null : !baseLocation.equals(((BaseLocationBox) (obj)).baseLocation))
            {
                return false;
            }
            if (purchaseLocation == null ? ((BaseLocationBox) (obj)).purchaseLocation != null : !purchaseLocation.equals(((BaseLocationBox) (obj)).purchaseLocation))
            {
                return false;
            }
        }
        return true;
    }

    public String getBaseLocation()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return baseLocation;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.put(Utf8.convert(baseLocation));
        bytebuffer.put(new byte[256 - Utf8.utf8StringLengthInBytes(baseLocation)]);
        bytebuffer.put(Utf8.convert(purchaseLocation));
        bytebuffer.put(new byte[256 - Utf8.utf8StringLengthInBytes(purchaseLocation)]);
        bytebuffer.put(new byte[512]);
    }

    protected long getContentSize()
    {
        return 1028L;
    }

    public String getPurchaseLocation()
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return purchaseLocation;
    }

    public int hashCode()
    {
        int j = 0;
        org.b.a.a a = b.a(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        int i;
        if (baseLocation != null)
        {
            i = baseLocation.hashCode();
        } else
        {
            i = 0;
        }
        if (purchaseLocation != null)
        {
            j = purchaseLocation.hashCode();
        }
        return i * 31 + j;
    }

    public void setBaseLocation(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        baseLocation = s;
    }

    public void setPurchaseLocation(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        purchaseLocation = s;
    }

    public String toString()
    {
        org.b.a.a a = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return (new StringBuilder("BaseLocationBox{baseLocation='")).append(baseLocation).append('\'').append(", purchaseLocation='").append(purchaseLocation).append('\'').append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.threegpp26244;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

public class LocationInformationBox extends AbstractFullBox
{

    public static final String TYPE = "loci";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_10;
    private static final org.b.a.a.a ajc$tjp_11;
    private static final org.b.a.a.a ajc$tjp_12;
    private static final org.b.a.a.a ajc$tjp_13;
    private static final org.b.a.a.a ajc$tjp_14;
    private static final org.b.a.a.a ajc$tjp_15;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private static final org.b.a.a.a ajc$tjp_9;
    private String additionalNotes;
    private double altitude;
    private String astronomicalBody;
    private String language;
    private double latitude;
    private double longitude;
    private String name;
    private int role;

    public LocationInformationBox()
    {
        super("loci");
        name = "";
        astronomicalBody = "";
        additionalNotes = "";
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("LocationInformationBox.java", com/coremedia/iso/boxes/threegpp26244/LocationInformationBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 30);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "language", "", "void"), 34);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "getAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 70);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "setAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "altitude", "", "void"), 74);
        ajc$tjp_12 = b1.a("method-execution", b1.a("1", "getAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 78);
        ajc$tjp_13 = b1.a("method-execution", b1.a("1", "setAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "astronomicalBody", "", "void"), 82);
        ajc$tjp_14 = b1.a("method-execution", b1.a("1", "getAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 86);
        ajc$tjp_15 = b1.a("method-execution", b1.a("1", "setAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "additionalNotes", "", "void"), 90);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 38);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "name", "", "void"), 42);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "int"), 46);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "int", "role", "", "void"), 50);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 54);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "setLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "longitude", "", "void"), 58);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "getLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 62);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "setLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "latitude", "", "void"), 66);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        language = IsoTypeReader.readIso639(bytebuffer);
        name = IsoTypeReader.readString(bytebuffer);
        role = IsoTypeReader.readUInt8(bytebuffer);
        longitude = IsoTypeReader.readFixedPoint1616(bytebuffer);
        latitude = IsoTypeReader.readFixedPoint1616(bytebuffer);
        altitude = IsoTypeReader.readFixedPoint1616(bytebuffer);
        astronomicalBody = IsoTypeReader.readString(bytebuffer);
        additionalNotes = IsoTypeReader.readString(bytebuffer);
    }

    public String getAdditionalNotes()
    {
        org.b.a.a a1 = b.a(ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return additionalNotes;
    }

    public double getAltitude()
    {
        org.b.a.a a1 = b.a(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return altitude;
    }

    public String getAstronomicalBody()
    {
        org.b.a.a a1 = b.a(ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return astronomicalBody;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeIso639(bytebuffer, language);
        bytebuffer.put(Utf8.convert(name));
        bytebuffer.put((byte)0);
        IsoTypeWriter.writeUInt8(bytebuffer, role);
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, longitude);
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, latitude);
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, altitude);
        bytebuffer.put(Utf8.convert(astronomicalBody));
        bytebuffer.put((byte)0);
        bytebuffer.put(Utf8.convert(additionalNotes));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(Utf8.convert(name).length + 22 + Utf8.convert(astronomicalBody).length + Utf8.convert(additionalNotes).length);
    }

    public String getLanguage()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return language;
    }

    public double getLatitude()
    {
        org.b.a.a a1 = b.a(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return latitude;
    }

    public double getLongitude()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return longitude;
    }

    public String getName()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return name;
    }

    public int getRole()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return role;
    }

    public void setAdditionalNotes(String s)
    {
        org.b.a.a a1 = b.a(ajc$tjp_15, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a1);
        additionalNotes = s;
    }

    public void setAltitude(double d)
    {
        org.b.a.a a1 = b.a(ajc$tjp_11, this, this, a.a(d));
        RequiresParseDetailAspect.aspectOf().before(a1);
        altitude = d;
    }

    public void setAstronomicalBody(String s)
    {
        org.b.a.a a1 = b.a(ajc$tjp_13, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a1);
        astronomicalBody = s;
    }

    public void setLanguage(String s)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a1);
        language = s;
    }

    public void setLatitude(double d)
    {
        org.b.a.a a1 = b.a(ajc$tjp_9, this, this, a.a(d));
        RequiresParseDetailAspect.aspectOf().before(a1);
        latitude = d;
    }

    public void setLongitude(double d)
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this, a.a(d));
        RequiresParseDetailAspect.aspectOf().before(a1);
        longitude = d;
    }

    public void setName(String s)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a1);
        name = s;
    }

    public void setRole(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        role = i;
    }

    static 
    {
        ajc$preClinit();
    }
}

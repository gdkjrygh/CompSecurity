// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.threegpp26244;

import akL;
import akN;
import cA;
import cv;
import cx;
import ft;
import fx;
import java.nio.ByteBuffer;

public class LocationInformationBox extends ft
{

    public static final String TYPE = "loci";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_10;
    private static final akp.a ajc$tjp_11;
    private static final akp.a ajc$tjp_12;
    private static final akp.a ajc$tjp_13;
    private static final akp.a ajc$tjp_14;
    private static final akp.a ajc$tjp_15;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private static final akp.a ajc$tjp_6;
    private static final akp.a ajc$tjp_7;
    private static final akp.a ajc$tjp_8;
    private static final akp.a ajc$tjp_9;
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
        akN akn = new akN("LocationInformationBox.java", com/coremedia/iso/boxes/threegpp26244/LocationInformationBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 30);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "language", "", "void"), 34);
        ajc$tjp_10 = akn.a("method-execution", akn.a("1", "getAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 70);
        ajc$tjp_11 = akn.a("method-execution", akn.a("1", "setAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "altitude", "", "void"), 74);
        ajc$tjp_12 = akn.a("method-execution", akn.a("1", "getAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 78);
        ajc$tjp_13 = akn.a("method-execution", akn.a("1", "setAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "astronomicalBody", "", "void"), 82);
        ajc$tjp_14 = akn.a("method-execution", akn.a("1", "getAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 86);
        ajc$tjp_15 = akn.a("method-execution", akn.a("1", "setAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "additionalNotes", "", "void"), 90);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "getName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 38);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "setName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "name", "", "void"), 42);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "getRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "int"), 46);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "setRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "int", "role", "", "void"), 50);
        ajc$tjp_6 = akn.a("method-execution", akn.a("1", "getLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 54);
        ajc$tjp_7 = akn.a("method-execution", akn.a("1", "setLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "longitude", "", "void"), 58);
        ajc$tjp_8 = akn.a("method-execution", akn.a("1", "getLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 62);
        ajc$tjp_9 = akn.a("method-execution", akn.a("1", "setLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "latitude", "", "void"), 66);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        language = cv.j(bytebuffer);
        name = cv.e(bytebuffer);
        role = cv.d(bytebuffer);
        longitude = cv.g(bytebuffer);
        latitude = cv.g(bytebuffer);
        altitude = cv.g(bytebuffer);
        astronomicalBody = cv.e(bytebuffer);
        additionalNotes = cv.e(bytebuffer);
    }

    public String getAdditionalNotes()
    {
        akp akp = akN.a(ajc$tjp_14, this);
        fx.a();
        fx.a(akp);
        return additionalNotes;
    }

    public double getAltitude()
    {
        akp akp = akN.a(ajc$tjp_10, this);
        fx.a();
        fx.a(akp);
        return altitude;
    }

    public String getAstronomicalBody()
    {
        akp akp = akN.a(ajc$tjp_12, this);
        fx.a();
        fx.a(akp);
        return astronomicalBody;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.a(bytebuffer, language);
        bytebuffer.put(cA.a(name));
        bytebuffer.put((byte)0);
        cx.c(bytebuffer, role);
        cx.a(bytebuffer, longitude);
        cx.a(bytebuffer, latitude);
        cx.a(bytebuffer, altitude);
        bytebuffer.put(cA.a(astronomicalBody));
        bytebuffer.put((byte)0);
        bytebuffer.put(cA.a(additionalNotes));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(cA.a(name).length + 22 + cA.a(astronomicalBody).length + cA.a(additionalNotes).length);
    }

    public String getLanguage()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return language;
    }

    public double getLatitude()
    {
        akp akp = akN.a(ajc$tjp_8, this);
        fx.a();
        fx.a(akp);
        return latitude;
    }

    public double getLongitude()
    {
        akp akp = akN.a(ajc$tjp_6, this);
        fx.a();
        fx.a(akp);
        return longitude;
    }

    public String getName()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return name;
    }

    public int getRole()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        return role;
    }

    public void setAdditionalNotes(String s)
    {
        akp akp = akN.a(ajc$tjp_15, this, s);
        fx.a();
        fx.a(akp);
        additionalNotes = s;
    }

    public void setAltitude(double d)
    {
        akp akp = akN.a(ajc$tjp_11, this, akL.a(d));
        fx.a();
        fx.a(akp);
        altitude = d;
    }

    public void setAstronomicalBody(String s)
    {
        akp akp = akN.a(ajc$tjp_13, this, s);
        fx.a();
        fx.a(akp);
        astronomicalBody = s;
    }

    public void setLanguage(String s)
    {
        akp akp = akN.a(ajc$tjp_1, this, s);
        fx.a();
        fx.a(akp);
        language = s;
    }

    public void setLatitude(double d)
    {
        akp akp = akN.a(ajc$tjp_9, this, akL.a(d));
        fx.a();
        fx.a(akp);
        latitude = d;
    }

    public void setLongitude(double d)
    {
        akp akp = akN.a(ajc$tjp_7, this, akL.a(d));
        fx.a();
        fx.a(akp);
        longitude = d;
    }

    public void setName(String s)
    {
        akp akp = akN.a(ajc$tjp_3, this, s);
        fx.a();
        fx.a(akp);
        name = s;
    }

    public void setRole(int i)
    {
        akp akp = akN.a(ajc$tjp_5, this, akL.a(i));
        fx.a();
        fx.a(akp);
        role = i;
    }

    static 
    {
        ajc$preClinit();
    }
}

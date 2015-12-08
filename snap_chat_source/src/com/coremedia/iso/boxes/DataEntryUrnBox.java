// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import cA;
import cv;
import ft;
import fx;
import java.nio.ByteBuffer;

public class DataEntryUrnBox extends ft
{

    public static final String TYPE = "urn ";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private String location;
    private String name;

    public DataEntryUrnBox()
    {
        super("urn ");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("DataEntryUrnBox.java", com/coremedia/iso/boxes/DataEntryUrnBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getName", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getLocation", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 67);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        name = cv.e(bytebuffer);
        location = cv.e(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer.put(cA.a(name));
        bytebuffer.put((byte)0);
        bytebuffer.put(cA.a(location));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(cA.b(name) + 1 + cA.b(location) + 1);
    }

    public String getLocation()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return location;
    }

    public String getName()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return name;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("DataEntryUrlBox[name=")).append(getName()).append(";location=").append(getLocation()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}

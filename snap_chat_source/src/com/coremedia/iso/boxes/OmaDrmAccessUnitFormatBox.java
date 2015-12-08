// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akL;
import akN;
import cv;
import cx;
import ft;
import fx;
import java.nio.ByteBuffer;

public final class OmaDrmAccessUnitFormatBox extends ft
{

    public static final String TYPE = "odaf";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private byte allBits;
    private int initVectorLength;
    private int keyIndicatorLength;
    private boolean selectiveEncryption;

    public OmaDrmAccessUnitFormatBox()
    {
        super("odaf");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("OmaDrmAccessUnitFormatBox.java", com/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "isSelectiveEncryption", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", "boolean"), 46);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getKeyIndicatorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", "int"), 50);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "getInitVectorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", "int"), 54);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "setInitVectorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "int", "initVectorLength", "", "void"), 58);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "setKeyIndicatorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "int", "keyIndicatorLength", "", "void"), 62);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "setAllBits", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "byte", "allBits", "", "void"), 66);
    }

    public final void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        allBits = (byte)cv.d(bytebuffer);
        boolean flag;
        if ((allBits & 0x80) == 128)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        selectiveEncryption = flag;
        keyIndicatorLength = cv.d(bytebuffer);
        initVectorLength = cv.d(bytebuffer);
    }

    protected final void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.c(bytebuffer, allBits);
        cx.c(bytebuffer, keyIndicatorLength);
        cx.c(bytebuffer, initVectorLength);
    }

    protected final long getContentSize()
    {
        return 7L;
    }

    public final int getInitVectorLength()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return initVectorLength;
    }

    public final int getKeyIndicatorLength()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return keyIndicatorLength;
    }

    public final boolean isSelectiveEncryption()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return selectiveEncryption;
    }

    public final void setAllBits(byte byte0)
    {
        akp akp = akN.a(ajc$tjp_5, this, new Byte(byte0));
        fx.a();
        fx.a(akp);
        allBits = byte0;
        boolean flag;
        if ((byte0 & 0x80) == 128)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        selectiveEncryption = flag;
    }

    public final void setInitVectorLength(int i)
    {
        akp akp = akN.a(ajc$tjp_3, this, akL.a(i));
        fx.a();
        fx.a(akp);
        initVectorLength = i;
    }

    public final void setKeyIndicatorLength(int i)
    {
        akp akp = akN.a(ajc$tjp_4, this, akL.a(i));
        fx.a();
        fx.a(akp);
        keyIndicatorLength = i;
    }

    static 
    {
        ajc$preClinit();
    }
}

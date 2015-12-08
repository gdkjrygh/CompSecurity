// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.apple;

import akN;
import cv;
import cx;
import ft;
import fx;
import java.nio.ByteBuffer;

public class AppleDataRateBox extends ft
{

    public static final String TYPE = "rmdr";
    private static final akp.a ajc$tjp_0;
    private long dataRate;

    public AppleDataRateBox()
    {
        super("rmdr");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("AppleDataRateBox.java", com/coremedia/iso/boxes/apple/AppleDataRateBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getDataRate", "com.coremedia.iso.boxes.apple.AppleDataRateBox", "", "", "", "long"), 53);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        dataRate = cv.a(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.b(bytebuffer, dataRate);
    }

    protected long getContentSize()
    {
        return 8L;
    }

    public long getDataRate()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return dataRate;
    }

    static 
    {
        ajc$preClinit();
    }
}

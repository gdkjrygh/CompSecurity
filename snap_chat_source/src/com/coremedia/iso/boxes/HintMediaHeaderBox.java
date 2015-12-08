// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import cv;
import cx;
import fx;
import java.nio.ByteBuffer;

// Referenced classes of package com.coremedia.iso.boxes:
//            AbstractMediaHeaderBox

public class HintMediaHeaderBox extends AbstractMediaHeaderBox
{

    public static final String TYPE = "hmhd";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private long avgBitrate;
    private int avgPduSize;
    private long maxBitrate;
    private int maxPduSize;

    public HintMediaHeaderBox()
    {
        super("hmhd");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("HintMediaHeaderBox.java", com/coremedia/iso/boxes/HintMediaHeaderBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getMaxPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "int"), 42);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getAvgPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "int"), 46);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "getMaxBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "long"), 50);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "getAvgBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "long"), 54);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "java.lang.String"), 84);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        maxPduSize = cv.c(bytebuffer);
        avgPduSize = cv.c(bytebuffer);
        maxBitrate = cv.a(bytebuffer);
        avgBitrate = cv.a(bytebuffer);
        cv.a(bytebuffer);
    }

    public long getAvgBitrate()
    {
        akp akp = akN.a(ajc$tjp_3, this);
        fx.a();
        fx.a(akp);
        return avgBitrate;
    }

    public int getAvgPduSize()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return avgPduSize;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.b(bytebuffer, maxPduSize);
        cx.b(bytebuffer, avgPduSize);
        cx.b(bytebuffer, maxBitrate);
        cx.b(bytebuffer, avgBitrate);
        cx.b(bytebuffer, 0L);
    }

    protected long getContentSize()
    {
        return 20L;
    }

    public long getMaxBitrate()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return maxBitrate;
    }

    public int getMaxPduSize()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return maxPduSize;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("HintMediaHeaderBox{maxPduSize=")).append(maxPduSize).append(", avgPduSize=").append(avgPduSize).append(", maxBitrate=").append(maxBitrate).append(", avgBitrate=").append(avgBitrate).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}

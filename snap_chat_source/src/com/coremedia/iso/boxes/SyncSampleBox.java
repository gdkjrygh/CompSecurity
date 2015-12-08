// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import cv;
import cx;
import fF;
import ft;
import fx;
import java.nio.ByteBuffer;

public class SyncSampleBox extends ft
{

    public static final String TYPE = "stss";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private long sampleNumber[];

    public SyncSampleBox()
    {
        super("stss");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("SyncSampleBox.java", com/coremedia/iso/boxes/SyncSampleBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "[J"), 46);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "java.lang.String"), 77);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "", "void"), 81);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        int j = fF.a(cv.a(bytebuffer));
        sampleNumber = new long[j];
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            sampleNumber[i] = cv.a(bytebuffer);
            i++;
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.b(bytebuffer, sampleNumber.length);
        long al[] = sampleNumber;
        int j = al.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            cx.b(bytebuffer, al[i]);
            i++;
        } while (true);
    }

    protected long getContentSize()
    {
        return (long)((sampleNumber.length << 2) + 8);
    }

    public long[] getSampleNumber()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return sampleNumber;
    }

    public void setSampleNumber(long al[])
    {
        akp akp = akN.a(ajc$tjp_2, this, al);
        fx.a();
        fx.a(akp);
        sampleNumber = al;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("SyncSampleBox[entryCount=")).append(sampleNumber.length).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}

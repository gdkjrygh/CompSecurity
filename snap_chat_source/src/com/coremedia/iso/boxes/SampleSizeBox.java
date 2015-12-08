// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akL;
import akN;
import cv;
import cx;
import fF;
import ft;
import fx;
import java.nio.ByteBuffer;

public class SampleSizeBox extends ft
{

    public static final String TYPE = "stsz";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private static final akp.a ajc$tjp_6;
    int sampleCount;
    private long sampleSize;
    private long sampleSizes[];

    public SampleSizeBox()
    {
        super("stsz");
        sampleSizes = new long[0];
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("SampleSizeBox.java", com/coremedia/iso/boxes/SampleSizeBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 50);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "", "void"), 54);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "", "long"), 59);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 67);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "[J"), 76);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "", "void"), 80);
        ajc$tjp_6 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "java.lang.String"), 119);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        sampleSize = cv.a(bytebuffer);
        sampleCount = fF.a(cv.a(bytebuffer));
        if (sampleSize != 0L) goto _L2; else goto _L1
_L1:
        int i;
        sampleSizes = new long[sampleCount];
        i = 0;
_L5:
        if (i < sampleCount) goto _L3; else goto _L2
_L2:
        return;
_L3:
        sampleSizes[i] = cv.a(bytebuffer);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.b(bytebuffer, sampleSize);
        if (sampleSize == 0L)
        {
            cx.b(bytebuffer, sampleSizes.length);
            long al[] = sampleSizes;
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
        } else
        {
            cx.b(bytebuffer, sampleCount);
            return;
        }
    }

    protected long getContentSize()
    {
        int i;
        if (sampleSize == 0L)
        {
            i = sampleSizes.length << 2;
        } else
        {
            i = 0;
        }
        return (long)(i + 12);
    }

    public long getSampleCount()
    {
        akp akp = akN.a(ajc$tjp_3, this);
        fx.a();
        fx.a(akp);
        if (sampleSize > 0L)
        {
            return (long)sampleCount;
        } else
        {
            return (long)sampleSizes.length;
        }
    }

    public long getSampleSize()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return sampleSize;
    }

    public long getSampleSizeAtIndex(int i)
    {
        akp akp = akN.a(ajc$tjp_2, this, akL.a(i));
        fx.a();
        fx.a(akp);
        if (sampleSize > 0L)
        {
            return sampleSize;
        } else
        {
            return sampleSizes[i];
        }
    }

    public long[] getSampleSizes()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        return sampleSizes;
    }

    public void setSampleSize(long l)
    {
        akp akp = akN.a(ajc$tjp_1, this, akL.a(l));
        fx.a();
        fx.a(akp);
        sampleSize = l;
    }

    public void setSampleSizes(long al[])
    {
        akp akp = akN.a(ajc$tjp_5, this, al);
        fx.a();
        fx.a(akp);
        sampleSizes = al;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_6, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("SampleSizeBox[sampleSize=")).append(getSampleSize()).append(";sampleCount=").append(getSampleCount()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}

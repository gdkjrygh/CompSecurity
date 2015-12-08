// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import org.b.b.b.b;

public class SyncSampleBox extends AbstractFullBox
{

    public static final String TYPE = "stss";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private long sampleNumber[];

    public SyncSampleBox()
    {
        super("stss");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("SyncSampleBox.java", com/coremedia/iso/boxes/SyncSampleBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "[J"), 46);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "java.lang.String"), 77);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "", "void"), 81);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        int j = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
        sampleNumber = new long[j];
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            sampleNumber[i] = IsoTypeReader.readUInt32(bytebuffer);
            i++;
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt32(bytebuffer, sampleNumber.length);
        long al[] = sampleNumber;
        int j = al.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            IsoTypeWriter.writeUInt32(bytebuffer, al[i]);
            i++;
        } while (true);
    }

    protected long getContentSize()
    {
        return (long)(sampleNumber.length * 4 + 8);
    }

    public long[] getSampleNumber()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return sampleNumber;
    }

    public void setSampleNumber(long al[])
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this, al);
        RequiresParseDetailAspect.aspectOf().before(a);
        sampleNumber = al;
    }

    public String toString()
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return (new StringBuilder("SyncSampleBox[entryCount=")).append(sampleNumber.length).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}

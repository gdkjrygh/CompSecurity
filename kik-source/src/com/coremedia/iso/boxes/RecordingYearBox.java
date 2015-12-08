// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

public class RecordingYearBox extends AbstractFullBox
{

    public static final String TYPE = "yrrc";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    int recordingYear;

    public RecordingYearBox()
    {
        super("yrrc");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("RecordingYearBox.java", com/coremedia/iso/boxes/RecordingYearBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getRecordingYear", "com.coremedia.iso.boxes.RecordingYearBox", "", "", "", "int"), 42);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setRecordingYear", "com.coremedia.iso.boxes.RecordingYearBox", "int", "recordingYear", "", "void"), 46);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        recordingYear = IsoTypeReader.readUInt16(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt16(bytebuffer, recordingYear);
    }

    protected long getContentSize()
    {
        return 6L;
    }

    public int getRecordingYear()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return recordingYear;
    }

    public void setRecordingYear(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        recordingYear = i;
    }

    static 
    {
        ajc$preClinit();
    }
}

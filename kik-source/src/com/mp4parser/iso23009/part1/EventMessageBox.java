// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso23009.part1;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

public class EventMessageBox extends AbstractFullBox
{

    public static final String TYPE = "emsg";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_10;
    private static final org.b.a.a.a ajc$tjp_11;
    private static final org.b.a.a.a ajc$tjp_12;
    private static final org.b.a.a.a ajc$tjp_13;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private static final org.b.a.a.a ajc$tjp_9;
    long eventDuration;
    long id;
    byte messageData[];
    long presentationTimeDelta;
    String schemeIdUri;
    long timescale;
    String value;

    public EventMessageBox()
    {
        super("emsg");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("EventMessageBox.java", com/mp4parser/iso23009/part1/EventMessageBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getSchemeIdUri", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "java.lang.String"), 59);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setSchemeIdUri", "com.mp4parser.iso23009.part1.EventMessageBox", "java.lang.String", "schemeIdUri", "", "void"), 63);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "getId", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "long"), 99);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "setId", "com.mp4parser.iso23009.part1.EventMessageBox", "long", "id", "", "void"), 103);
        ajc$tjp_12 = b1.a("method-execution", b1.a("1", "getMessageData", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "[B"), 107);
        ajc$tjp_13 = b1.a("method-execution", b1.a("1", "setMessageData", "com.mp4parser.iso23009.part1.EventMessageBox", "[B", "messageData", "", "void"), 111);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getValue", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "java.lang.String"), 67);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setValue", "com.mp4parser.iso23009.part1.EventMessageBox", "java.lang.String", "value", "", "void"), 71);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getTimescale", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "long"), 75);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setTimescale", "com.mp4parser.iso23009.part1.EventMessageBox", "long", "timescale", "", "void"), 79);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getPresentationTimeDelta", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "long"), 83);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "setPresentationTimeDelta", "com.mp4parser.iso23009.part1.EventMessageBox", "long", "presentationTimeDelta", "", "void"), 87);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "getEventDuration", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "long"), 91);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "setEventDuration", "com.mp4parser.iso23009.part1.EventMessageBox", "long", "eventDuration", "", "void"), 95);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        schemeIdUri = IsoTypeReader.readString(bytebuffer);
        value = IsoTypeReader.readString(bytebuffer);
        timescale = IsoTypeReader.readUInt32(bytebuffer);
        presentationTimeDelta = IsoTypeReader.readUInt32(bytebuffer);
        eventDuration = IsoTypeReader.readUInt32(bytebuffer);
        id = IsoTypeReader.readUInt32(bytebuffer);
        messageData = new byte[bytebuffer.remaining()];
        bytebuffer.get(messageData);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUtf8String(bytebuffer, schemeIdUri);
        IsoTypeWriter.writeUtf8String(bytebuffer, value);
        IsoTypeWriter.writeUInt32(bytebuffer, timescale);
        IsoTypeWriter.writeUInt32(bytebuffer, presentationTimeDelta);
        IsoTypeWriter.writeUInt32(bytebuffer, eventDuration);
        IsoTypeWriter.writeUInt32(bytebuffer, id);
        bytebuffer.put(messageData);
    }

    protected long getContentSize()
    {
        return (long)(Utf8.utf8StringLengthInBytes(schemeIdUri) + 22 + Utf8.utf8StringLengthInBytes(value) + messageData.length);
    }

    public long getEventDuration()
    {
        org.b.a.a a1 = b.a(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return eventDuration;
    }

    public long getId()
    {
        org.b.a.a a1 = b.a(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return id;
    }

    public byte[] getMessageData()
    {
        org.b.a.a a1 = b.a(ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return messageData;
    }

    public long getPresentationTimeDelta()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return presentationTimeDelta;
    }

    public String getSchemeIdUri()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return schemeIdUri;
    }

    public long getTimescale()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return timescale;
    }

    public String getValue()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return value;
    }

    public void setEventDuration(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_9, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        eventDuration = l;
    }

    public void setId(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_11, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        id = l;
    }

    public void setMessageData(byte abyte0[])
    {
        org.b.a.a a1 = b.a(ajc$tjp_13, this, this, abyte0);
        RequiresParseDetailAspect.aspectOf().before(a1);
        messageData = abyte0;
    }

    public void setPresentationTimeDelta(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        presentationTimeDelta = l;
    }

    public void setSchemeIdUri(String s)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a1);
        schemeIdUri = s;
    }

    public void setTimescale(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        timescale = l;
    }

    public void setValue(String s)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a1);
        value = s;
    }

    static 
    {
        ajc$preClinit();
    }
}

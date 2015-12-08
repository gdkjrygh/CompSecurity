// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.b.b.b.b;

// Referenced classes of package com.googlecode.mp4parser.boxes.apple:
//            AppleDataBox

public class AppleRecordingYearBox extends AppleDataBox
{

    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    Date date;
    DateFormat df;

    public AppleRecordingYearBox()
    {
        super("\251day", 1);
        date = new Date();
        df = new SimpleDateFormat("yyyy-MM-dd'T'kk:mm:ssZ");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("AppleRecordingYearBox.java", com/googlecode/mp4parser/boxes/apple/AppleRecordingYearBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getDate", "com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox", "", "", "", "java.util.Date"), 27);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setDate", "com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox", "java.util.Date", "date", "", "void"), 31);
    }

    protected static String iso8601toRfc822Date(String s)
    {
        return s.replaceAll("Z$", "+0000").replaceAll("([0-9][0-9]):([0-9][0-9])$", "$1$2");
    }

    protected static String rfc822toIso8601Date(String s)
    {
        return s.replaceAll("\\+0000$", "Z");
    }

    protected int getDataLength()
    {
        return Utf8.convert(rfc822toIso8601Date(df.format(date))).length;
    }

    public Date getDate()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return date;
    }

    protected void parseData(ByteBuffer bytebuffer)
    {
        bytebuffer = IsoTypeReader.readString(bytebuffer, bytebuffer.remaining());
        try
        {
            date = df.parse(iso8601toRfc822Date(bytebuffer));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            throw new RuntimeException(bytebuffer);
        }
    }

    public void setDate(Date date1)
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this, date1);
        RequiresParseDetailAspect.aspectOf().before(a);
        date = date1;
    }

    protected byte[] writeData()
    {
        return Utf8.convert(rfc822toIso8601Date(df.format(date)));
    }

    static 
    {
        ajc$preClinit();
    }
}

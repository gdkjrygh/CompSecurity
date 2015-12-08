// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso14496.part30;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.b.b;

public class WebVTTSourceLabelBox extends AbstractBox
{

    public static final String TYPE = "vlab";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    String sourceLabel;

    public WebVTTSourceLabelBox()
    {
        super("vlab");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("WebVTTSourceLabelBox.java", com/mp4parser/iso14496/part30/WebVTTSourceLabelBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getSourceLabel", "com.mp4parser.iso14496.part30.WebVTTSourceLabelBox", "", "", "", "java.lang.String"), 37);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setSourceLabel", "com.mp4parser.iso14496.part30.WebVTTSourceLabelBox", "java.lang.String", "sourceLabel", "", "void"), 41);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        sourceLabel = IsoTypeReader.readString(bytebuffer, bytebuffer.remaining());
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer.put(Utf8.convert(sourceLabel));
    }

    protected long getContentSize()
    {
        return (long)Utf8.utf8StringLengthInBytes(sourceLabel);
    }

    public String getSourceLabel()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return sourceLabel;
    }

    public void setSourceLabel(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        sourceLabel = s;
    }

    static 
    {
        ajc$preClinit();
    }
}

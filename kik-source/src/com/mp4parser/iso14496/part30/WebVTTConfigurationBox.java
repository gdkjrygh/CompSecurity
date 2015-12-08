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

public class WebVTTConfigurationBox extends AbstractBox
{

    public static final String TYPE = "vttC";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    String config;

    public WebVTTConfigurationBox()
    {
        super("vttC");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("WebVTTConfigurationBox.java", com/mp4parser/iso14496/part30/WebVTTConfigurationBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getConfig", "com.mp4parser.iso14496.part30.WebVTTConfigurationBox", "", "", "", "java.lang.String"), 36);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setConfig", "com.mp4parser.iso14496.part30.WebVTTConfigurationBox", "java.lang.String", "config", "", "void"), 40);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        config = IsoTypeReader.readString(bytebuffer, bytebuffer.remaining());
    }

    public String getConfig()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return config;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer.put(Utf8.convert(config));
    }

    protected long getContentSize()
    {
        return (long)Utf8.utf8StringLengthInBytes(config);
    }

    public void setConfig(String s)
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(a);
        config = s;
    }

    static 
    {
        ajc$preClinit();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.b.b;

// Referenced classes of package com.coremedia.iso.boxes:
//            AbstractMediaHeaderBox

public class SubtitleMediaHeaderBox extends AbstractMediaHeaderBox
{

    public static final String TYPE = "sthd";
    private static final org.b.a.a.a ajc$tjp_0;

    public SubtitleMediaHeaderBox()
    {
        super("sthd");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("SubtitleMediaHeaderBox.java", com/coremedia/iso/boxes/SubtitleMediaHeaderBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.SubtitleMediaHeaderBox", "", "", "", "java.lang.String"), 30);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
    }

    protected long getContentSize()
    {
        return 4L;
    }

    public String toString()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return "SubtitleMediaHeaderBox";
    }

    static 
    {
        ajc$preClinit();
    }
}

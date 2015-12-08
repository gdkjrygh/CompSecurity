// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import fx;
import java.nio.ByteBuffer;

// Referenced classes of package com.coremedia.iso.boxes:
//            AbstractMediaHeaderBox

public class SubtitleMediaHeaderBox extends AbstractMediaHeaderBox
{

    public static final String TYPE = "sthd";
    private static final akp.a ajc$tjp_0;

    public SubtitleMediaHeaderBox()
    {
        super("sthd");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("SubtitleMediaHeaderBox.java", com/coremedia/iso/boxes/SubtitleMediaHeaderBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.SubtitleMediaHeaderBox", "", "", "", "java.lang.String"), 30);
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
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return "SubtitleMediaHeaderBox";
    }

    static 
    {
        ajc$preClinit();
    }
}

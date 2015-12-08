// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;

// Referenced classes of package com.coremedia.iso.boxes:
//            AbstractMediaHeaderBox

public class NullMediaHeaderBox extends AbstractMediaHeaderBox
{

    public static final String TYPE = "nmhd";

    public NullMediaHeaderBox()
    {
        super("nmhd");
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
}

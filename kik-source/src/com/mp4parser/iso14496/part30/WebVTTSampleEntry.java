// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso14496.part30;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.util.Path;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.mp4parser.iso14496.part30:
//            WebVTTConfigurationBox, WebVTTSourceLabelBox

public class WebVTTSampleEntry extends AbstractSampleEntry
{

    public static final String TYPE = "wvtt";

    public WebVTTSampleEntry()
    {
        super("wvtt");
    }

    public void getBox(WritableByteChannel writablebytechannel)
    {
        writablebytechannel.write(getHeader());
        writeContainer(writablebytechannel);
    }

    public WebVTTConfigurationBox getConfig()
    {
        return (WebVTTConfigurationBox)Path.getPath(this, "vttC");
    }

    public WebVTTSourceLabelBox getSourceLabel()
    {
        return (WebVTTSourceLabelBox)Path.getPath(this, "vlab");
    }

    public void parse(DataSource datasource, ByteBuffer bytebuffer, long l, BoxParser boxparser)
    {
        initContainer(datasource, l, boxparser);
    }
}

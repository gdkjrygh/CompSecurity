// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso14496.part30;

import com.coremedia.iso.Utf8;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.mp4parser.iso14496.part30:
//            WebVTTSampleEntry, WebVTTConfigurationBox, WebVTTSourceLabelBox

public class WebVTTTrack extends AbstractTrack
{

    WebVTTSampleEntry sampleEntry;
    List samples;
    String subs[];

    public WebVTTTrack(DataSource datasource)
    {
        int i;
        super(datasource.toString());
        samples = new ArrayList();
        sampleEntry = new WebVTTSampleEntry();
        sampleEntry.addBox(new WebVTTConfigurationBox());
        sampleEntry.addBox(new WebVTTSourceLabelBox());
        ByteBuffer bytebuffer = datasource.map(0L, CastUtils.l2i(datasource.size()));
        datasource = new byte[CastUtils.l2i(datasource.size())];
        bytebuffer.get(datasource);
        subs = Utf8.convert(datasource).split("\\r?\\n");
        datasource = "";
        i = 0;
_L6:
        if (i < subs.length) goto _L2; else goto _L1
_L1:
        int j = i;
_L4:
        while (j < subs.length && subs[j].isEmpty()) 
        {
            j++;
        }
        return;
_L2:
        datasource = (new StringBuilder(String.valueOf(datasource))).append(subs[i]).append("\n").toString();
        if (!subs[i + 1].isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (subs[i + 2].isEmpty()) goto _L4; else goto _L3
_L3:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void close()
    {
    }

    public String getHandler()
    {
        return null;
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        return null;
    }

    public long[] getSampleDurations()
    {
        return new long[0];
    }

    public List getSamples()
    {
        return null;
    }

    public TrackMetaData getTrackMetaData()
    {
        return null;
    }
}

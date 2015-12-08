// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SilenceTrackImpl
    implements Track
{

    long decodingTimes[];
    String name;
    List samples;
    Track source;

    public SilenceTrackImpl(Track track, long l)
    {
        samples = new LinkedList();
        source = track;
        name = (new StringBuilder()).append(l).append("ms silence").toString();
        if ("mp4a".equals(track.getSampleDescriptionBox().getSampleEntry().getType()))
        {
            int i = CastUtils.l2i((getTrackMetaData().getTimescale() * l) / 1000L / 1024L);
            decodingTimes = new long[i];
            Arrays.fill(decodingTimes, (getTrackMetaData().getTimescale() * l) / (long)i / 1000L);
            do
            {
                if (i <= 0)
                {
                    return;
                }
                samples.add(new SampleImpl((ByteBuffer)ByteBuffer.wrap(new byte[] {
                    33, 16, 4, 96, -116, 28
                }).rewind()));
                i--;
            } while (true);
        } else
        {
            throw new RuntimeException((new StringBuilder("Tracks of type ")).append(track.getClass().getSimpleName()).append(" are not supported").toString());
        }
    }

    public void close()
    {
    }

    public List getCompositionTimeEntries()
    {
        return null;
    }

    public long getDuration()
    {
        long l = 0L;
        long al[] = decodingTimes;
        int j = al.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return l;
            }
            l += al[i];
            i++;
        } while (true);
    }

    public List getEdits()
    {
        return null;
    }

    public String getHandler()
    {
        return source.getHandler();
    }

    public String getName()
    {
        return name;
    }

    public List getSampleDependencies()
    {
        return null;
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        return source.getSampleDescriptionBox();
    }

    public long[] getSampleDurations()
    {
        return decodingTimes;
    }

    public Map getSampleGroups()
    {
        return source.getSampleGroups();
    }

    public List getSamples()
    {
        return samples;
    }

    public SubSampleInformationBox getSubsampleInformationBox()
    {
        return null;
    }

    public long[] getSyncSamples()
    {
        return null;
    }

    public TrackMetaData getTrackMetaData()
    {
        return source.getTrackMetaData();
    }
}

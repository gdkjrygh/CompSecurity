// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MultiplyTimeScaleTrack
    implements Track
{

    Track source;
    private int timeScaleFactor;

    public MultiplyTimeScaleTrack(Track track, int i)
    {
        source = track;
        timeScaleFactor = i;
    }

    static List adjustCtts(List list, int i)
    {
        if (list != null)
        {
            ArrayList arraylist = new ArrayList(list.size());
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    return arraylist;
                }
                com.coremedia.iso.boxes.CompositionTimeToSample.Entry entry = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry)list.next();
                arraylist.add(new com.coremedia.iso.boxes.CompositionTimeToSample.Entry(entry.getCount(), entry.getOffset() * i));
            } while (true);
        } else
        {
            return null;
        }
    }

    public void close()
    {
        source.close();
    }

    public List getCompositionTimeEntries()
    {
        return adjustCtts(source.getCompositionTimeEntries(), timeScaleFactor);
    }

    public long getDuration()
    {
        return source.getDuration() * (long)timeScaleFactor;
    }

    public List getEdits()
    {
        return source.getEdits();
    }

    public String getHandler()
    {
        return source.getHandler();
    }

    public String getName()
    {
        return (new StringBuilder("timscale(")).append(source.getName()).append(")").toString();
    }

    public List getSampleDependencies()
    {
        return source.getSampleDependencies();
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        return source.getSampleDescriptionBox();
    }

    public long[] getSampleDurations()
    {
        long al[] = new long[source.getSampleDurations().length];
        int i = 0;
        do
        {
            if (i >= source.getSampleDurations().length)
            {
                return al;
            }
            al[i] = source.getSampleDurations()[i] * (long)timeScaleFactor;
            i++;
        } while (true);
    }

    public Map getSampleGroups()
    {
        return source.getSampleGroups();
    }

    public List getSamples()
    {
        return source.getSamples();
    }

    public SubSampleInformationBox getSubsampleInformationBox()
    {
        return source.getSubsampleInformationBox();
    }

    public long[] getSyncSamples()
    {
        return source.getSyncSamples();
    }

    public TrackMetaData getTrackMetaData()
    {
        TrackMetaData trackmetadata = (TrackMetaData)source.getTrackMetaData().clone();
        trackmetadata.setTimescale(source.getTrackMetaData().getTimescale() * (long)timeScaleFactor);
        return trackmetadata;
    }

    public String toString()
    {
        return (new StringBuilder("MultiplyTimeScaleTrack{source=")).append(source).append('}').toString();
    }
}

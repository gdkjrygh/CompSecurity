// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.googlecode.mp4parser.authoring:
//            Track, TrackMetaData

public class WrappingTrack
    implements Track
{

    Track parent;

    public WrappingTrack(Track track)
    {
        parent = track;
    }

    public void close()
    {
        parent.close();
    }

    public List getCompositionTimeEntries()
    {
        return parent.getCompositionTimeEntries();
    }

    public long getDuration()
    {
        return parent.getDuration();
    }

    public List getEdits()
    {
        return parent.getEdits();
    }

    public String getHandler()
    {
        return parent.getHandler();
    }

    public String getName()
    {
        return (new StringBuilder(String.valueOf(parent.getName()))).append("'").toString();
    }

    public List getSampleDependencies()
    {
        return parent.getSampleDependencies();
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        return parent.getSampleDescriptionBox();
    }

    public long[] getSampleDurations()
    {
        return parent.getSampleDurations();
    }

    public Map getSampleGroups()
    {
        return parent.getSampleGroups();
    }

    public List getSamples()
    {
        return parent.getSamples();
    }

    public SubSampleInformationBox getSubsampleInformationBox()
    {
        return parent.getSubsampleInformationBox();
    }

    public long[] getSyncSamples()
    {
        return parent.getSyncSamples();
    }

    public TrackMetaData getTrackMetaData()
    {
        return parent.getTrackMetaData();
    }
}

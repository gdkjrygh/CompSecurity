// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import java.io.Closeable;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.googlecode.mp4parser.authoring:
//            TrackMetaData

public interface Track
    extends Closeable
{

    public abstract List getCompositionTimeEntries();

    public abstract long getDuration();

    public abstract List getEdits();

    public abstract String getHandler();

    public abstract String getName();

    public abstract List getSampleDependencies();

    public abstract SampleDescriptionBox getSampleDescriptionBox();

    public abstract long[] getSampleDurations();

    public abstract Map getSampleGroups();

    public abstract List getSamples();

    public abstract SubSampleInformationBox getSubsampleInformationBox();

    public abstract long[] getSyncSamples();

    public abstract TrackMetaData getTrackMetaData();
}

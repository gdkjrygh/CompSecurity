// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.SubSampleInformationBox;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.googlecode.mp4parser.authoring:
//            Track

public abstract class AbstractTrack
    implements Track
{

    List edits;
    String name;
    Map sampleGroups;

    public AbstractTrack(String s)
    {
        edits = new ArrayList();
        sampleGroups = new HashMap();
        name = s;
    }

    public List getCompositionTimeEntries()
    {
        return null;
    }

    public long getDuration()
    {
        long l = 0L;
        long al[] = getSampleDurations();
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
        return edits;
    }

    public String getName()
    {
        return name;
    }

    public List getSampleDependencies()
    {
        return null;
    }

    public Map getSampleGroups()
    {
        return sampleGroups;
    }

    public SubSampleInformationBox getSubsampleInformationBox()
    {
        return null;
    }

    public long[] getSyncSamples()
    {
        return null;
    }
}

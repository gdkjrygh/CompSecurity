// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import fs;
import fv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.coremedia.iso.boxes.fragment:
//            TrackFragmentBox, TrackFragmentHeaderBox, TrackRunBox

public class MovieFragmentBox extends fs
{

    public static final String TYPE = "moof";

    public MovieFragmentBox()
    {
        super("moof");
    }

    public fv getFileChannel()
    {
        return dataSource;
    }

    public List getSyncSamples(SampleDependencyTypeBox sampledependencytypebox)
    {
        ArrayList arraylist = new ArrayList();
        sampledependencytypebox = sampledependencytypebox.getEntries().iterator();
        long l = 1L;
        do
        {
            if (!sampledependencytypebox.hasNext())
            {
                return arraylist;
            }
            if (((com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry)sampledependencytypebox.next()).getSampleDependsOn() == 2)
            {
                arraylist.add(Long.valueOf(l));
            }
            l++;
        } while (true);
    }

    public int getTrackCount()
    {
        return getBoxes(com/coremedia/iso/boxes/fragment/TrackFragmentBox, false).size();
    }

    public List getTrackFragmentHeaderBoxes()
    {
        return getBoxes(com/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox, true);
    }

    public long[] getTrackNumbers()
    {
        List list = getBoxes(com/coremedia/iso/boxes/fragment/TrackFragmentBox, false);
        long al[] = new long[list.size()];
        int i = 0;
        do
        {
            if (i >= list.size())
            {
                return al;
            }
            al[i] = ((TrackFragmentBox)list.get(i)).getTrackFragmentHeaderBox().getTrackId();
            i++;
        } while (true);
    }

    public List getTrackRunBoxes()
    {
        return getBoxes(com/coremedia/iso/boxes/fragment/TrackRunBox, true);
    }
}

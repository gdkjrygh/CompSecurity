// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import fs;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.coremedia.iso.boxes:
//            Box, MovieHeaderBox, TrackBox, TrackHeaderBox

public class MovieBox extends fs
{

    public static final String TYPE = "moov";

    public MovieBox()
    {
        super("moov");
    }

    public MovieHeaderBox getMovieHeaderBox()
    {
        Iterator iterator = getBoxes().iterator();
        Box box;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            box = (Box)iterator.next();
        } while (!(box instanceof MovieHeaderBox));
        return (MovieHeaderBox)box;
    }

    public int getTrackCount()
    {
        return getBoxes(com/coremedia/iso/boxes/TrackBox).size();
    }

    public long[] getTrackNumbers()
    {
        List list = getBoxes(com/coremedia/iso/boxes/TrackBox);
        long al[] = new long[list.size()];
        int i = 0;
        do
        {
            if (i >= list.size())
            {
                return al;
            }
            al[i] = ((TrackBox)list.get(i)).getTrackHeaderBox().getTrackId();
            i++;
        } while (true);
    }
}

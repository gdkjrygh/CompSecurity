// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.builder;

import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.googlecode.mp4parser.authoring.builder:
//            FragmentIntersectionFinder

public class TwoSecondIntersectionFinder
    implements FragmentIntersectionFinder
{

    private int fragmentLength;
    private Movie movie;

    public TwoSecondIntersectionFinder(Movie movie1, int i)
    {
        fragmentLength = 2;
        movie = movie1;
        fragmentLength = i;
    }

    public long[] sampleNumbers(Track track)
    {
        double d;
        long al[];
        al = movie.getTracks().iterator();
        d = 0.0D;
_L5:
        if (al.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        int i;
        int j;
        int k;
        long l1;
        j = Math.min((int)Math.ceil(d / (double)fragmentLength) - 1, track.getSamples().size());
        i = j;
        if (j <= 0)
        {
            i = 1;
        }
        al = new long[i];
        Arrays.fill(al, -1L);
        al[0] = 1L;
        l1 = 0L;
        i = 0;
        obj = track.getSampleDurations();
        k = obj.length;
        j = 0;
_L7:
        if (j < k) goto _L4; else goto _L3
_L3:
        l1 = i + 1;
        i = al.length - 1;
_L8:
        if (i < 0)
        {
            return al;
        }
        break MISSING_BLOCK_LABEL_253;
_L2:
        obj = (Track)al.next();
        double d1 = ((Track) (obj)).getDuration() / ((Track) (obj)).getTrackMetaData().getTimescale();
        if (d < d1)
        {
            d = d1;
        }
          goto _L5
_L4:
        int l;
        long l2;
        l2 = obj[j];
        l = (int)(l1 / track.getTrackMetaData().getTimescale() / (long)fragmentLength) + 1;
        if (l >= al.length) goto _L3; else goto _L6
_L6:
        al[l] = i + 1;
        l1 += l2;
        j++;
        i++;
          goto _L7
        if (al[i] == -1L)
        {
            al[i] = l1;
        }
        l1 = al[i];
        i--;
          goto _L8
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.builder;

import com.googlecode.mp4parser.authoring.Track;
import java.util.Map;

// Referenced classes of package com.googlecode.mp4parser.authoring.builder:
//            FragmentIntersectionFinder

public class StaticFragmentIntersectionFinderImpl
    implements FragmentIntersectionFinder
{

    Map sampleNumbers;

    public StaticFragmentIntersectionFinderImpl(Map map)
    {
        sampleNumbers = map;
    }

    public long[] sampleNumbers(Track track)
    {
        return (long[])sampleNumbers.get(track);
    }
}

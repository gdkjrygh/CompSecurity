// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import java.util.Arrays;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.explore:
//            ExploreGenresSections, GenreSection

final class 
    implements f
{

    public final volatile Object call(Object obj)
    {
        return call((ExploreGenresSections)obj);
    }

    public final b call(ExploreGenresSections exploregenressections)
    {
        return b.from(Arrays.asList(new GenreSection[] {
            new GenreSection(1, 0x7f070133, exploregenressections.getMusic()), new GenreSection(0, 0x7f070132, exploregenressections.getAudio())
        }));
    }

    ()
    {
    }
}

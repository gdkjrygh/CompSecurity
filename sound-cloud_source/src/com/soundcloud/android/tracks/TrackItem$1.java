// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackItem

final class t
    implements f
{

    public final TrackItem call(PropertySet propertyset)
    {
        return TrackItem.from(propertyset);
    }

    public final volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    t()
    {
    }
}

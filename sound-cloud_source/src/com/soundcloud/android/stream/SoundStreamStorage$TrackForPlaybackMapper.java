// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

// Referenced classes of package com.soundcloud.android.stream:
//            SoundStreamStorage

private static final class <init> extends RxResultMapper
{

    public final PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = PropertySet.from(new PropertyBinding[] {
            TrackProperty.URN.bind(Urn.forTrack(cursorreader.getLong("sound_id")))
        });
        if (cursorreader.isNotNull("reposter_id"))
        {
            propertyset.put(PostProperty.REPOSTER_URN, Urn.forUser(cursorreader.getLong("reposter_id")));
        }
        return propertyset;
    }

    public final volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}

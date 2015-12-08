// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.collections.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import rx.b.f;

final class 
    implements f
{

    public final volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public final List call(List list)
    {
        java.util.HashSet hashset = Sets.newHashSetWithExpectedSize(list.size());
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            Urn urn = (Urn)((PropertySet)iterator.next()).get(PlaylistProperty.URN);
            if (hashset.contains(urn))
            {
                iterator.remove();
            } else
            {
                hashset.add(urn);
            }
        }

        return list;
    }

    ()
    {
    }
}

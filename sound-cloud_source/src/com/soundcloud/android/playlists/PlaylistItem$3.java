// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.api.model.ApiPlaylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistItem

final class 
    implements f
{

    public final volatile Object call(Object obj)
    {
        return call((Iterable)obj);
    }

    public final List call(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add(PlaylistItem.from(((ApiPlaylist)iterable.next()).toPropertySet()))) { }
        return arraylist;
    }

    ()
    {
    }
}

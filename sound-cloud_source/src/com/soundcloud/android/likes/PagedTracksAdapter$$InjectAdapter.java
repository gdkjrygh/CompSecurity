// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.tracks.DownloadableTrackItemRenderer;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.likes:
//            PagedTracksAdapter

public final class  extends b
    implements a, Provider
{

    private b supertype;
    private b trackRenderer;

    public final void attach(l l1)
    {
        trackRenderer = l1.a("com.soundcloud.android.tracks.DownloadableTrackItemRenderer", com/soundcloud/android/likes/PagedTracksAdapter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.PagingListItemAdapter", com/soundcloud/android/likes/PagedTracksAdapter, getClass().getClassLoader(), false);
    }

    public final PagedTracksAdapter get()
    {
        PagedTracksAdapter pagedtracksadapter = new PagedTracksAdapter((DownloadableTrackItemRenderer)trackRenderer.get());
        injectMembers(pagedtracksadapter);
        return pagedtracksadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(trackRenderer);
        set1.add(supertype);
    }

    public final void injectMembers(PagedTracksAdapter pagedtracksadapter)
    {
        supertype.injectMembers(pagedtracksadapter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PagedTracksAdapter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.likes.PagedTracksAdapter", "members/com.soundcloud.android.likes.PagedTracksAdapter", false, com/soundcloud/android/likes/PagedTracksAdapter);
    }
}

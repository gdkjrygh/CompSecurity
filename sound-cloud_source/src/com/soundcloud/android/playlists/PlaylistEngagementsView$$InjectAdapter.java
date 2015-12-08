// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.Context;
import com.soundcloud.android.offline.DownloadableHeaderView;
import com.soundcloud.android.util.CondensedNumberFormatter;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistEngagementsView

public final class  extends b
    implements Provider
{

    private b context;
    private b downloadableHeaderView;
    private b numberFormatter;
    private b popupMenuWrapperFactory;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/playlists/PlaylistEngagementsView, getClass().getClassLoader());
        numberFormatter = l1.a("com.soundcloud.android.util.CondensedNumberFormatter", com/soundcloud/android/playlists/PlaylistEngagementsView, getClass().getClassLoader());
        popupMenuWrapperFactory = l1.a("com.soundcloud.android.view.menu.PopupMenuWrapper$Factory", com/soundcloud/android/playlists/PlaylistEngagementsView, getClass().getClassLoader());
        downloadableHeaderView = l1.a("com.soundcloud.android.offline.DownloadableHeaderView", com/soundcloud/android/playlists/PlaylistEngagementsView, getClass().getClassLoader());
    }

    public final PlaylistEngagementsView get()
    {
        return new PlaylistEngagementsView((Context)context.get(), (CondensedNumberFormatter)numberFormatter.get(), (com.soundcloud.android.view.menu.numberFormatter)popupMenuWrapperFactory.get(), (DownloadableHeaderView)downloadableHeaderView.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(numberFormatter);
        set.add(popupMenuWrapperFactory);
        set.add(downloadableHeaderView);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.PlaylistEngagementsView", "members/com.soundcloud.android.playlists.PlaylistEngagementsView", false, com/soundcloud/android/playlists/PlaylistEngagementsView);
    }
}

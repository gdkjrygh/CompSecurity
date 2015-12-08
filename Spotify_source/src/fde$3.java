// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.view.View;
import android.widget.AdapterView;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.playlist.activity.CreateRenamePlaylistActivity;
import com.spotify.mobile.android.spotlets.playlist.util.PlaylistLogger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;

final class ang.Object
    implements android.widget.rView.OnItemClickListener
{

    private fde a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        int j = a.a.b(i);
        if (j == 1)
        {
            if (fde.d(a))
            {
                adapterview = CreateRenamePlaylistActivity.a(a.k(), fde.e(a), fde.f(a), fde.g(a), fde.h(a));
            } else
            {
                adapterview = CreateRenamePlaylistActivity.a(a.k(), fde.e(a), fde.g(a), fde.h(a));
            }
            fde.j(a).a("create-new-playlist", null, 0L, fde.i(a), null);
            a.a(adapterview);
            a.k().finish();
        } else
        {
            if (j == 0)
            {
                CollectionService.a(a.k(), fde.e(a), ViewUri.az.toString(), fde.h(a), com.spotify.mobile.android.spotlets.collection.service.tionService.Messaging.c);
                fde.j(a).a("add-to-collection", null, 0L, fde.i(a), null);
                a.k().finish();
                return;
            }
            ContentValues contentvalues = new ContentValues();
            adapterview = (new SpotifyLink(fde.e(a))).c;
            boolean flag1;
            if (adapterview == com.spotify.mobile.android.util.yLink.LinkType.aT)
            {
                contentvalues.put("uri", fde.e(a));
                flag1 = false;
            } else
            if (adapterview == com.spotify.mobile.android.util.yLink.LinkType.c)
            {
                contentvalues.put("uri", fde.e(a));
                flag1 = true;
            } else
            {
                Assertion.a((new StringBuilder("Unknown link type: ")).append(adapterview).toString());
                return;
            }
            adapterview = ((AdapterView) (view.getTag()));
            if (adapterview instanceof doc)
            {
                view = (doc)adapterview;
                if (view.m())
                {
                    adapterview = a.m().a();
                    adapterview.a(0x7f1100ff, fde.a(view.a(), fde.e(a), fde.g(a), fde.h(a), fde.k(a), fde.l(a)));
                    adapterview.b();
                    adapterview.c();
                    return;
                }
                boolean flag;
                if (j == 2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                j = a.a.a(i, j);
                if (!flag)
                {
                    i = fde.m(a).getCount();
                } else
                {
                    i = 0;
                }
                i += j;
                if (flag)
                {
                    fde.j(a).a("add-to-playlist", "recently-changed-playlists", i, fde.i(a), view.a());
                } else
                {
                    PlaylistLogger playlistlogger = fde.j(a);
                    flag2 = fde.d(a);
                    l = i;
                    long l1 = fde.i(a);
                    String s = view.a();
                    if (flag2)
                    {
                        adapterview = PlaylistLogger.b;
                    } else
                    {
                        adapterview = PlaylistLogger.a;
                    }
                    playlistlogger.a(adapterview, "all-playlists", l, l1, s);
                }
                if (view.j() != 0)
                {
                    fnt.a();
                    adapterview = a;
                    boolean flag2;
                    if (view.j() == 1)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    fde.a(adapterview, flag1, flag2, contentvalues, view);
                    return;
                } else
                {
                    fde.a(a, contentvalues, view, false);
                    return;
                }
            }
        }
    }

    (fde fde1)
    {
        a = fde1;
        super();
    }
}

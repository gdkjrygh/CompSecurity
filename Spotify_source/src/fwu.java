// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.show.model.Covers;
import com.spotify.mobile.android.spotlets.socialchart.model.InfluencerModel;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanBrowseAlbum;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanBrowseArtist;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanRemoveFromCollection;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanRemoveTrack;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.ShowRemoveFromQueue;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.util.List;

public final class fwu extends fvd
{

    private final Context a;
    private final Verified b;
    private final Flags c;
    private final CanBrowseAlbum d;
    private final CanBrowseArtist e;
    private final CanRemoveFromCollection f;
    private final CanRemoveTrack g;
    private fuk h;
    private final SpotifyContextMenu i;
    private final Optional j;
    private final boolean k;
    private ShowRemoveFromQueue l;
    private Optional m;
    private final InfluencerModel n[];
    private final int o;

    public fwu(Context context, Verified verified, SpotifyContextMenu spotifycontextmenu, CanBrowseAlbum canbrowsealbum, CanBrowseArtist canbrowseartist, CanRemoveFromCollection canremovefromcollection, CanRemoveTrack canremovetrack, 
            Optional optional, Flags flags, boolean flag, fxe fxe1, InfluencerModel ainfluencermodel[], int i1, ShowRemoveFromQueue showremovefromqueue, 
            Optional optional1)
    {
        super(spotifycontextmenu);
        a = context;
        b = verified;
        c = flags;
        d = (CanBrowseAlbum)ctz.a(canbrowsealbum);
        e = (CanBrowseArtist)ctz.a(canbrowseartist);
        f = (CanRemoveFromCollection)ctz.a(canremovefromcollection);
        g = (CanRemoveTrack)ctz.a(canremovetrack);
        i = spotifycontextmenu;
        h = new fuk(a, b, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, spotifycontextmenu, (fxe)ctz.a(fxe1));
        j = optional;
        k = flag;
        n = ainfluencermodel;
        o = i1;
        l = (ShowRemoveFromQueue)ctz.a(showremovefromqueue);
        m = optional1;
    }

    protected final fui a(String s, fxu fxu)
    {
        return new fxm(a, s, fxu);
    }

    protected final fxn a(String s)
    {
        return new fxn(s, "", "", SpotifyIcon.ac, false);
    }

    protected final void b(fxr fxr1)
    {
        ctz.a(fxr1.a());
        Context context = a;
        enw enw1 = (enw)fxr1.b();
        enr enr1 = enw1.getAlbum();
        ent ent1 = (ent)enw1.getArtists().get(0);
        i.a();
        int i1;
        boolean flag;
        if (enr1.getCovers() != null)
        {
            fxr1 = enr1.getCovers().getImageUri(com.spotify.mobile.android.spotlets.show.model.Covers.Size.a);
        } else
        {
            fxr1 = "";
        }
        i.a = new fxn(enw1.getName(), enr1.getName(), fxr1, SpotifyIcon.ac, false);
        if (g == CanRemoveTrack.a)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (enw1.inCollection() || enw1.canAddToCollection())
        {
            fxr1 = h;
            boolean flag2 = enw1.inCollection();
            String s;
            InfluencerModel ainfluencermodel[];
            long l1;
            boolean flag1;
            if (f == CanRemoveFromCollection.a)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            fxr1.a(flag2, flag1, flag, enw1.getUri(), c);
        }
        if (flag)
        {
            Assertion.a(m.b(), "A row id is needed for showing the \"Remove from this playlist\" context menu.");
            fxr1 = h;
            s = (String)j.a("");
            l1 = ((Integer)m.c()).intValue();
            fxr1.a(0x7f110036, 0x7f08022b, SpotifyIcon.ai).d = new fuk._cls2(fxr1, s, l1);
        }
        if (k)
        {
            h.a(enw1.getUri(), gei.b(ent1.getName(), enw1.getName()), 0x7f080207, c);
        } else
        {
            h.a(enw1.getUri(), gei.b(ent1.getName(), enw1.getName()), c);
        }
        if (n.length > 0)
        {
            fxr1 = h;
            s = enw1.getUri();
            i1 = o;
            ainfluencermodel = n;
            ctz.a(s);
            ctz.a(ainfluencermodel);
            fxr1.a(0x7f110032, 0x7f080222, SpotifyIcon.t).d = new fuk._cls31(fxr1, i1, s, ainfluencermodel);
        }
        if (enw1.isAvailable())
        {
            h.a(enw1.getUri(), c);
        }
        if (l == ShowRemoveFromQueue.a)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            Assertion.a(m.b(), "A row id is needed for showing the \"remove from queue\" context menu.");
            h.a(((Integer)m.c()).intValue(), com.spotify.mobile.android.util.SpotifyLink.LinkType.aT);
        }
        if (d == CanBrowseAlbum.a)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0 && !enw1.isLocal())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            h.a(enr1.getUri(), enr1.getName());
        }
        if (e == CanBrowseArtist.a)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0 && !enw1.isLocal())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            h.b(ent1.getUri(), ent1.getName());
        }
        h.a(enw1.getName(), context.getString(0x7f0804c1, new Object[] {
            ent1.getName()
        }), enw1.getUri());
        if (!enw1.isLocal())
        {
            h.a(enw1.getName(), c, new String[] {
                enw1.getUri()
            });
        }
    }
}

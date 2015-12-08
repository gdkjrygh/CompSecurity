// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.show.model.Show;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanAddToCollection;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanBrowseShow;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanChangePlayedState;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanDownload;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.ShowRemoveFromQueue;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.util.Map;

public final class fwr extends fvd
{

    final Context a;
    final Verified b;
    final boolean c;
    final Flags d;
    final fxe e;
    fio f;
    private final SpotifyContextMenu g;
    private final CanDownload h;
    private final CanBrowseShow i;
    private final CanAddToCollection j;
    private final CanChangePlayedState k;
    private final ShowRemoveFromQueue l;
    private final Integer m;
    private fuk n;
    private fiz o;
    private fxe p;

    public fwr(Context context, Verified verified, SpotifyContextMenu spotifycontextmenu, CanDownload candownload, CanBrowseShow canbrowseshow, CanAddToCollection canaddtocollection, CanChangePlayedState canchangeplayedstate, 
            ShowRemoveFromQueue showremovefromqueue, Integer integer, Flags flags, fxe fxe1, boolean flag)
    {
        super(spotifycontextmenu);
        p = new fxe() {

            private fwr b;

            public final void a(com.spotify.mobile.android.util.ClientEvent.Event event)
            {
                b.e.a(event);
                if (com.spotify.mobile.android.util.ClientEvent.Event.j.equals(event))
                {
                    if (!b.f.o().g())
                    {
                        CollectionService.a(b.a, b.f.o().b(), b.b.toString(), b.d, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.a);
                        dmz.a(fop);
                        fop.a(b.a, b.b, ClientEventFactory.a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a.toString(), com.spotify.mobile.android.util.ClientEvent.SubEvent.bH, null, null));
                    }
                    if (!b.c)
                    {
                        event = (ggc)dmz.a(ggc);
                        Context context1 = b.a;
                        Flags flags1 = b.d;
                        SpotifyIcon spotifyicon = SpotifyIcon.i;
                        int i1;
                        if (fiy.a(flags1))
                        {
                            i1 = 0x7f080548;
                        } else
                        {
                            i1 = 0x7f080547;
                        }
                        event.a(context1, spotifyicon, i1);
                    }
                } else
                if (com.spotify.mobile.android.util.ClientEvent.Event.l.equals(event) && !b.c)
                {
                    ((ggc)dmz.a(ggc)).a(b.a, b.d);
                    return;
                }
            }

            
            {
                b = fwr.this;
                super();
            }
        };
        a = context;
        b = verified;
        g = spotifycontextmenu;
        h = (CanDownload)ctz.a(candownload);
        i = (CanBrowseShow)ctz.a(canbrowseshow);
        j = (CanAddToCollection)ctz.a(canaddtocollection);
        k = (CanChangePlayedState)ctz.a(canchangeplayedstate);
        l = (ShowRemoveFromQueue)ctz.a(showremovefromqueue);
        e = (fxe)ctz.a(fxe1);
        m = integer;
        c = flag;
        n = new fuk(context, b, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, spotifycontextmenu, p);
        d = flags;
        o = new fiz(a);
    }

    protected final fui a(String s, fxu fxu)
    {
        return new fxk(a, s, fxu);
    }

    protected final fxn a(String s)
    {
        SpotifyIcon spotifyicon;
        if (g.c == com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu.HeaderViewType.b)
        {
            spotifyicon = SpotifyIcon.bk;
        } else
        {
            spotifyicon = SpotifyIcon.aX;
        }
        return new fxn(s, "", "", spotifyicon, false);
    }

    protected final void b(fxr fxr1)
    {
        ctz.a(fxr1.a());
        fio fio1 = (fio)fxr1.b();
        f = fio1;
        Show show = fio1.o();
        g.a();
        String s1 = fit.a(fio1.c(), fio1.d(), fio1.o(), com.spotify.mobile.android.spotlets.show.model.Covers.Size.a);
        String s = o.a(fio1).a(true).b();
        boolean flag;
        if (fio1.s() == com.spotify.mobile.android.spotlets.show.model.Show.MediaType.c)
        {
            fxr1 = SpotifyIcon.bk;
        } else
        {
            fxr1 = SpotifyIcon.aX;
        }
        fxr1 = new fxn(fio1.a(), s, s1, fxr1, false);
        fxr1.c = fiw.a(fio1.e());
        fxr1.d = a.getString(0x7f080295, new Object[] {
            show.a(), show.d()
        });
        fxr1.h = a.getResources().getInteger(0x7f0e0019);
        g.b = s;
        g.a = fxr1;
        if (j == CanAddToCollection.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Assertion.a(fiy.d(d), "An episode cannot be added to collection without the proper feature flag set.");
            n.a(fio1.g(), true, false, fio1.b(), d);
        }
        if (fio1.s() == com.spotify.mobile.android.spotlets.show.model.Show.MediaType.b && fiy.a(d))
        {
            Object obj;
            Object obj1;
            Flags flags;
            if (h == CanDownload.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && (fio1.j() || !com.spotify.mobile.android.provider.Metadata.OfflineSync.a(fio1.p())))
            {
                n.a(fio1.b(), com.spotify.mobile.android.util.SpotifyLink.LinkType.P, fio1.p(), fio1.q());
            }
        }
        if (k == CanChangePlayedState.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            fxr1 = fio1.l();
            if (fxr1 == null || fxr1.intValue() > 0)
            {
                fxr1 = n;
                obj = fio1.b();
                ctz.a(obj);
                fxr1.a(0x7f1100b1, 0x7f080223, SpotifyIcon.aK).d = new fuk._cls29(fxr1, ((String) (obj)));
            }
        }
        if (fio1.j() && !((Boolean)d.a(fys.j)).booleanValue())
        {
            fxr1 = fio1.r();
            fxr1.put("entity_uri", b.toString());
            fxr1 = PlayerTrack.create(fio1.b(), fxr1);
            obj = n;
            obj1 = a;
            flags = d;
            ((fuk) (obj)).a(0x7f110033, 0x7f080226, SpotifyIcon.I).d = new fuk._cls4(((fuk) (obj)), ((Context) (obj1)), fxr1, flags);
        }
        if (l == ShowRemoveFromQueue.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            n.a(m.intValue(), com.spotify.mobile.android.util.SpotifyLink.LinkType.P);
        }
        if (i == CanBrowseShow.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            fxr1 = n;
            obj = show.b();
            obj1 = show.a();
            fxr1.a(0x7f11002d, 0x7f08020e, SpotifyIcon.aX).d = new fuk._cls30(fxr1, ((String) (obj)), ((String) (obj1)));
        }
        if (fiy.d(d))
        {
            n.a(fio1.a(), a.getString(0x7f0804ce, new Object[] {
                show.a()
            }), fio1.b());
        }
    }
}

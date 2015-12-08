// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanDownload;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanRemovePlaylist;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public final class fws extends fvd
{

    private final Flags a;
    private final Context b;
    private final Verified c;
    private final CanDownload d;
    private final CanRemovePlaylist e;
    private final SpotifyContextMenu f;
    private fuk g;

    fws(Context context, Verified verified, SpotifyContextMenu spotifycontextmenu, CanDownload candownload, CanRemovePlaylist canremoveplaylist, Flags flags, fxe fxe1)
    {
        super(spotifycontextmenu);
        b = context;
        c = verified;
        f = spotifycontextmenu;
        g = new fuk(context, verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, spotifycontextmenu, (fxe)ctz.a(fxe1));
        d = (CanDownload)ctz.a(candownload);
        e = (CanRemovePlaylist)ctz.a(canremoveplaylist);
        a = flags;
    }

    protected final fui a(String s, fxu fxu)
    {
        return new fxv(b, s, fxu);
    }

    protected final fxn a(String s)
    {
        return new fxn(s, "", "", SpotifyIcon.E, false);
    }

    protected final void b(fxr fxr1)
    {
        Context context;
        doc doc1;
        ctz.a(fxr1.a());
        context = b;
        doc1 = (doc)fxr1.b();
        f.a();
        f.a = new fxn(doc1.b(), doc1.c(), doc1.d(), SpotifyIcon.E, false);
        if (!doc1.t() || TextUtils.isEmpty(fxr1.a)) goto _L2; else goto _L1
_L1:
        int i;
        Object obj;
        if (!doc1.n() && !doc1.m())
        {
            Object obj1 = g;
            Object obj2 = fxr1.a;
            boolean flag = doc1.l();
            SpotifyLink spotifylink;
            if (flag)
            {
                i = 0x7f08023c;
            } else
            {
                i = 0x7f080236;
            }
            if (flag)
            {
                obj = SpotifyIcon.ai;
            } else
            {
                obj = SpotifyIcon.H;
            }
            ((fuk) (obj1)).a(0x7f110040, i, ((SpotifyIcon) (obj))).d = new fuk._cls23(((fuk) (obj1)), flag, ((String) (obj2)));
        }
        if (d == CanDownload.a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0 && doc1.o())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            g.a(dtt.a(fxr1.a), (new SpotifyLink(fxr1.a)).c, doc1.h(), doc1.i());
        }
        if (doc1.n() && !doc1.m())
        {
            if (((Integer)a.a(fys.D)).intValue() == 0)
            {
                obj = g;
                obj1 = fxr1.a;
                obj2 = a;
                ((fuk) (obj)).a(0x7f110037, 0x7f08022c, SpotifyIcon.aA).d = new fuk._cls37(((fuk) (obj)), ((String) (obj1)), ((Flags) (obj2)));
            } else
            {
                obj = g;
                String s = fxr1.a;
                ((fuk) (obj)).a(0x7f110037, 0x7f080217, SpotifyIcon.aA).d = new fuk._cls38(((fuk) (obj)), s);
            }
        }
        if (doc1.n() && !doc1.r() && !doc1.m())
        {
            obj1 = g;
            obj2 = fxr1.a;
            flag = doc1.s();
            if (flag)
            {
                i = 0x7f08023b;
            } else
            {
                i = 0x7f080225;
            }
            if (flag)
            {
                obj = SpotifyIcon.y;
            } else
            {
                obj = SpotifyIcon.am;
            }
            ((fuk) (obj1)).a(0x7f110043, i, ((SpotifyIcon) (obj))).d = new fuk._cls27(((fuk) (obj1)), flag, ((String) (obj2)));
        }
        if (doc1.n() && !doc1.m())
        {
            obj = g;
            obj1 = fxr1.a;
            flag = doc1.r();
            if (flag)
            {
                i = 0x7f080237;
            } else
            {
                i = 0x7f080210;
            }
            ((fuk) (obj)).a(0x7f110042, i, SpotifyIcon.n).d = new fuk._cls25(((fuk) (obj)), flag, ((String) (obj1)));
        }
        if (e == CanRemovePlaylist.a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0 || !doc1.n() || doc1.m()) goto _L4; else goto _L3
_L3:
        obj = g;
        obj1 = doc1.b();
        obj2 = fxr1.a;
        spotifylink = new SpotifyLink(((String) (obj2)));
        fuk._cls33.a[spotifylink.c.ordinal()];
        JVM INSTR tableswitch 1 3: default 612
    //                   1 882
    //                   2 890
    //                   3 890;
           goto _L5 _L6 _L7 _L7
_L7:
        break MISSING_BLOCK_LABEL_890;
_L5:
        Assertion.a((new StringBuilder("Trying to add 'Remove Playlist or Folder' for other link type: ")).append(spotifylink.c).toString());
        i = -1;
_L8:
        boolean flag1;
        if (i >= 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assertion.a(flag1, "Unsupported uri type.");
        ((fuk) (obj)).a(0x7f11002f, i, SpotifyIcon.ai).d = new fuk._cls39(((fuk) (obj)), ((String) (obj1)), ((String) (obj2)));
_L4:
        if (!doc1.m())
        {
            g.a(doc1.b(), context.getString(0x7f0804c2, new Object[] {
                doc1.c()
            }), fxr1.a);
        }
        if (doc1.q())
        {
            g.a(fxr1.b, a, new String[] {
                fxr1.a
            });
        }
        if (c == ViewUri.bj)
        {
            g.b(fxr1.a);
        }
_L2:
        return;
_L6:
        i = 0x7f080212;
          goto _L8
        i = 0x7f080213;
          goto _L8
    }
}

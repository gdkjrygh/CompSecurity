// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class fic
{

    fib a;
    private u b;
    private Verified c;

    public fic(u u1, Verified verified)
    {
        this(u1, verified, new fib(u1));
    }

    public fic(u u1, Verified verified, fib fib1)
    {
        b = u1;
        c = verified;
        a = fib1;
    }

    public final void a(String s, String s1, String s2, String s3, fxe fxe)
    {
        SpotifyContextMenu spotifycontextmenu = new SpotifyContextMenu();
        spotifycontextmenu.a(s);
        spotifycontextmenu.a.b = s1;
        spotifycontextmenu.b(s2);
        SpotifyLink spotifylink = new SpotifyLink(s3);
        boolean flag;
        if (spotifylink.c.equals(com.spotify.mobile.android.util.SpotifyLink.LinkType.g) || spotifylink.c.equals(com.spotify.mobile.android.util.SpotifyLink.LinkType.as))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        spotifycontextmenu.a.g = flag;
        fxe = new fuk(b, c, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, spotifycontextmenu, fxe, a);
        fxe.a(0x7f11003b, 0x7f0804e3, SpotifyIcon.aV).d = new fuk._cls8(fxe, s3, s, s1, s2);
        fxe.a(0x7f11003e, 0x7f08046e, SpotifyIcon.aU).d = new fuk._cls9(fxe, s, s1, s3);
        s = (u)((fuk) (fxe)).b;
        ((fuk) (fxe)).e.a(0x7f110039, ((fuk) (fxe)).b.getText(0x7f0804cb)).d = new fuk._cls10(fxe, s, s3);
        s = fud.a(spotifycontextmenu, b);
        if (s != null)
        {
            s.ab = new fue(s3) {

                private String a;
                private fic b;

                public final void a()
                {
                    fib fib1 = b.a;
                    String s4 = a;
                    if (!fib1.a)
                    {
                        fib1.a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.Q, com.spotify.mobile.android.util.ClientEvent.SubEvent.cK, s4);
                    }
                    fib1.a = false;
                }

            
            {
                b = fic.this;
                a = s;
                super();
            }
            };
        }
        a.a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.Q, s3);
    }
}

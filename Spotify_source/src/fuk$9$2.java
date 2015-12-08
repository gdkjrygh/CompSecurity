// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.share.util.AppInfoHelper;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanSendToFacebookRecipient;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanSendToRecipient;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class g.Object
    implements fue
{

    private g.String a;

    public final void a()
    {
        fib fib1 = a.a.g;
        String s = a.a;
        if (!fib1.a)
        {
            fib1.a(com.spotify.mobile.android.util.viewuri.SubView.S, com.spotify.mobile.android.util.ent.SubEvent.cx, s);
        }
        fib1.a = false;
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class fuk$9

/* anonymous class */
    public final class fuk._cls9
        implements fxo
    {

        final String a;
        final String b;
        final String c;
        final fuk d;

        public final void a(fxp fxp)
        {
            fud.a(d.b, new fuk._cls9._cls1(), c).ab = new fuk._cls9._cls2(this);
            fxp = d.g;
            String s = c;
            fxp.a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.Q, com.spotify.mobile.android.util.ClientEvent.SubEvent.cO, s);
            fxp = d.g;
            s = c;
            fxp.a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.S, s);
        }

            public 
            {
                d = fuk1;
                a = s;
                b = s1;
                c = s2;
                super();
            }

        // Unreferenced inner class fuk$9$1

/* anonymous class */
        final class fuk._cls9._cls1
            implements fuj
        {

            private fuk._cls9 a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                Object obj2 = (String)obj;
                Object obj4 = fve.a(a.d.b);
                Object obj3 = a.a;
                Object obj1 = a.b;
                obj = a.d.e.a.e;
                obj4 = ((fve) (obj4)).a;
                Object obj5 = new fvz();
                obj5.a = ((Context) (obj4));
                obj4 = new fwd(((fvz) (obj5)), (byte)0);
                ((fwd) (obj4)).a.b = fxr.a(((String) (obj2)), ((String) (obj3)), new SpotifyLink(((String) (obj2))));
                obj2 = new fwe(((fwd) (obj4)).a, (byte)0);
                ((fwe) (obj2)).a.c = ((String) (obj1));
                obj1 = new fwc(((fwe) (obj2)).a, (byte)0);
                ((fwc) (obj1)).a.d = ((String) (obj));
                obj = new fwf(((fwc) (obj1)).a, (byte)0);
                obj1 = a.d.c;
                ((fwf) (obj)).a.e = ((Verified) (obj1));
                obj = new fwb(((fwf) (obj)).a, (byte)0);
                ((fwb) (obj)).a.f = CanSendToRecipient.a;
                obj = new fwa(((fwb) (obj)).a, (byte)0);
                ((fwa) (obj)).a.g = CanSendToFacebookRecipient.b;
                obj1 = ((fwa) (obj)).a;
                obj1.h = Optional.b(a.d.f);
                obj = new fwg((Context)ctz.a(((fvz) (obj1)).a), (String)ctz.a(((fvz) (obj1)).c), (String)ctz.a(((fvz) (obj1)).d), (Verified)ctz.a(((fvz) (obj1)).e), (CanSendToRecipient)ctz.a(((fvz) (obj1)).f), (CanSendToFacebookRecipient)ctz.a(((fvz) (obj1)).g), (SpotifyContextMenu)ctz.a(spotifycontextmenu), (fxe)((fvz) (obj1)).h.a(fxe.a));
                spotifycontextmenu = ((fvz) (obj1)).b;
                ((fwg) (obj)).f.a();
                obj1 = (SpotifyLink)spotifycontextmenu.b();
                obj2 = ((SpotifyLink) (obj1)).c;
                spotifycontextmenu = ((fxr) (spotifycontextmenu)).b;
                ((fwg) (obj)).f.a = new fxn(spotifycontextmenu, ((fwg) (obj)).b, ((fwg) (obj)).c, SpotifyIcon.E, ((com.spotify.mobile.android.util.SpotifyLink.LinkType) (obj2)).equals(com.spotify.mobile.android.util.SpotifyLink.LinkType.g));
                obj3 = (new StringBuilder()).append(spotifycontextmenu).append(" ").append(((fwg) (obj)).b).toString();
                obj2 = (new StringBuilder()).append(((fwg) (obj)).a(((SpotifyLink) (obj1)), true)).append(" ").append(fwg.a(((SpotifyLink) (obj1)), ((String) (obj3)))).toString();
                Object obj6;
                String s;
                int i;
                if (((fwg) (obj)).d == CanSendToRecipient.a)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i != 0)
                {
                    obj4 = ((fwg) (obj)).g;
                    obj5 = ((SpotifyLink) (obj1)).d();
                    ((fuk) (obj4)).a(0x7f11003d, 0x7f08022d, SpotifyIcon.ag).d = new fuk._cls11(((fuk) (obj4)), spotifycontextmenu, ((String) (obj5)));
                }
                if (((fwg) (obj)).e == CanSendToFacebookRecipient.a)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i != 0)
                {
                    obj4 = ((fwg) (obj)).g;
                    obj5 = ((SpotifyLink) (obj1)).d();
                    ((fuk) (obj4)).a(0x7f11003c, 0x7f080219, SpotifyIcon.ag).d = new fuk._cls13(((fuk) (obj4)), spotifycontextmenu, ((String) (obj5)));
                }
                obj4 = ((fwg) (obj)).g;
                obj5 = ((SpotifyLink) (obj1)).d();
                obj6 = ((fwg) (obj)).a(((SpotifyLink) (obj1)), false);
                spotifycontextmenu = "";
                fwg._cls1.a[((SpotifyLink) (obj1)).c.ordinal()];
                JVM INSTR tableswitch 1 10: default 680
            //                           1 1012
            //                           2 1012
            //                           3 1012
            //                           4 1012
            //                           5 1012
            //                           6 1012
            //                           7 1012
            //                           8 1012
            //                           9 1026
            //                           10 1026;
                   goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L3 _L3
_L1:
                Assertion.a((new StringBuilder("Unsupported link type ")).append(((SpotifyLink) (obj1)).c).toString());
_L5:
                spotifycontextmenu = (new StringBuilder()).append(spotifycontextmenu).append(" ").append(fwg.a(((SpotifyLink) (obj1)), ((String) (obj3)))).toString();
                ((fuk) (obj4)).a(0x7f11003a, 0x7f080218, SpotifyIcon.aD).d = new fuk._cls14(((fuk) (obj4)), ((String) (obj6)), spotifycontextmenu, ((String) (obj5)));
                spotifycontextmenu = ((fwg) (obj)).g;
                obj3 = ((SpotifyLink) (obj1)).d();
                spotifycontextmenu.a(0x7f11003f, 0x7f080230, SpotifyIcon.aF).d = new fuk._cls15(spotifycontextmenu, ((String) (obj2)), ((String) (obj3)));
                obj3 = Arrays.asList(new com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App[] {
                    com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App.j, com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App.b, com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App.g
                }).iterator();
                do
                {
                    if (!((Iterator) (obj3)).hasNext())
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    obj4 = (com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App)((Iterator) (obj3)).next();
                    if (((fwg) (obj)).h.a(((com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App) (obj4))))
                    {
                        obj5 = ((fwg) (obj)).h.b(((com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App) (obj4)));
                        if (obj5 != null)
                        {
                            obj6 = ((fwg) (obj)).g;
                            s = ((SpotifyLink) (obj1)).d();
                            i = ((fuk) (obj6)).b.getResources().getDimensionPixelSize(0x7f0c013f);
                            spotifycontextmenu = ((BitmapDrawable)((fia) (obj5)).b.loadIcon(((fia) (obj5)).a)).getBitmap();
                            if (spotifycontextmenu != null)
                            {
                                spotifycontextmenu = new BitmapDrawable(((fuk) (obj6)).b.getResources(), Bitmap.createScaledBitmap(spotifycontextmenu, i, i, false));
                            } else
                            {
                                spotifycontextmenu = null;
                            }
                            ((fuk) (obj6)).a(((com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App) (obj4)).mId, ((com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App) (obj4)).mNameStringResId, spotifycontextmenu).d = new fuk._cls16(((fuk) (obj6)), ((fia) (obj5)), ((String) (obj2)), ((com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App) (obj4)), s);
                        }
                    }
                } while (true);
_L2:
                spotifycontextmenu = ((fwg) (obj)).a.getString(0x7f0804d6);
                continue; /* Loop/switch isn't completed */
_L3:
                spotifycontextmenu = ((fwg) (obj)).a.getString(0x7f0804dc);
                if (true) goto _L5; else goto _L4
_L4:
            }

                    
                    {
                        a = fuk._cls9.this;
                        super();
                    }
        }

    }

}

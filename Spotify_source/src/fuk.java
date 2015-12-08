// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.collection.util.CollectionState;
import com.spotify.mobile.android.spotlets.playlist.activity.AddToPlaylistActivity;
import com.spotify.mobile.android.spotlets.playlist.activity.CreateRenamePlaylistActivity;
import com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedService;
import com.spotify.mobile.android.spotlets.share.util.AppInfoHelper;
import com.spotify.mobile.android.spotlets.show.service.PlayedStateService;
import com.spotify.mobile.android.spotlets.socialchart.model.InfluencerModel;
import com.spotify.mobile.android.ui.activity.ConfirmDeletionActivity;
import com.spotify.mobile.android.ui.activity.ShareToSpotifyActivity;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanSendToFacebookRecipient;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanSendToRecipient;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.radio.service.RadioActionsService;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class fuk
{

    final QueueManager a;
    public final Context b;
    final Verified c;
    final com.spotify.mobile.android.util.viewuri.ViewUri.SubView d;
    public final SpotifyContextMenu e;
    final fxe f;
    fib g;
    private final ObjectMapper h;

    public fuk(Context context, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, SpotifyContextMenu spotifycontextmenu)
    {
        this(context, verified, subview, spotifycontextmenu, fxe.a);
    }

    public fuk(Context context, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, SpotifyContextMenu spotifycontextmenu, fxe fxe1)
    {
        this(context, verified, subview, spotifycontextmenu, fxe1, new fib(context));
    }

    public fuk(Context context, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, SpotifyContextMenu spotifycontextmenu, fxe fxe1, fib fib1)
    {
        dmz.a(fop);
        dmz.a(fos);
        b = context;
        c = verified;
        d = subview;
        e = spotifycontextmenu;
        f = fxe1;
        g = fib1;
        h = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        a = new QueueManager(Cosmos.getResolver(context), h);
    }

    private Drawable a(SpotifyIcon spotifyicon, int i)
    {
        spotifyicon = new dfz(b, spotifyicon);
        spotifyicon.a(i);
        spotifyicon.a(b.getResources().getDimensionPixelSize(0x7f0c00c7));
        return spotifyicon;
    }

    static void a(fuk fuk1, com.spotify.mobile.android.util.ClientEvent.Event event)
    {
        fuk1.a(event);
        fuk1.b(event);
    }

    protected static Intent c(String s)
    {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", s);
        return intent;
    }

    public final fxp a(int i, int j, Drawable drawable)
    {
        fxp fxp1 = e.a(i, b.getText(j));
        fxp1.b = drawable;
        return fxp1;
    }

    public final fxp a(int i, int j, SpotifyIcon spotifyicon)
    {
        fxp fxp1 = e.a(i, b.getText(j));
        fxp1.b = a(spotifyicon, gcg.b(b, 0x7f0f007c));
        return fxp1;
    }

    public final void a(long l, com.spotify.mobile.android.util.SpotifyLink.LinkType linktype)
    {
        a(0x7f110030, 0x7f080215, SpotifyIcon.ai).d = new fxo(l, linktype) {

            private long a;
            private com.spotify.mobile.android.util.SpotifyLink.LinkType b;
            private fuk c;

            public final void a(fxp fxp1)
            {
                fuk.a(c, com.spotify.mobile.android.util.ClientEvent.Event.C);
                dmz.a(for);
                for.b(c.b, a);
                if (b == com.spotify.mobile.android.util.SpotifyLink.LinkType.P)
                {
                    dmz.a(ggc);
                    ggc.a(c.b, 0x7f080566, 1, new Object[0]);
                    return;
                } else
                {
                    dmz.a(ggc);
                    ggc.a(c.b, 0x7f080567, 1, new Object[0]);
                    return;
                }
            }

            
            {
                c = fuk.this;
                a = l;
                b = linktype;
                super();
            }
        };
    }

    public final void a(Uri uri, com.spotify.mobile.android.util.SpotifyLink.LinkType linktype, int i, int j)
    {
        a(uri.toString(), linktype, i, j);
    }

    public final void a(CollectionState collectionstate, boolean flag, boolean flag1, String s, Flags flags)
    {
        com.spotify.mobile.android.util.SpotifyLink.LinkType linktype;
        linktype = (new SpotifyLink(s)).c;
        if (linktype == com.spotify.mobile.android.util.SpotifyLink.LinkType.aT || linktype == com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ || linktype == com.spotify.mobile.android.util.SpotifyLink.LinkType.P)
        {
            Assertion.b(collectionstate, CollectionState.b);
        }
        public final class _cls33
        {

            public static final int a[];
            static final int b[];
            static final int c[];

            static 
            {
                c = new int[CollectionState.values().length];
                try
                {
                    c[CollectionState.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    c[CollectionState.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    c[CollectionState.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                b = new int[com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager.QueueObserver.ErrorCause.values().length];
                try
                {
                    b[com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager.QueueObserver.ErrorCause.UNSUPPORTED_MEDIA_TPYE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                a = new int[com.spotify.mobile.android.util.SpotifyLink.LinkType.values().length];
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.T.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.an.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls33.c[collectionstate.ordinal()];
        JVM INSTR tableswitch 1 3: default 80
    //                   1 81
    //                   2 127
    //                   3 127;
           goto _L1 _L2 _L3 _L3
_L1:
        return;
_L2:
        int i = 0x7f080206;
        if (linktype == com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ)
        {
            i = 0x7f08021a;
        }
        a(0x7f110028, i, SpotifyIcon.H).d = new fxo(s, flags) {

            private String a;
            private Flags b;
            private fuk c;

            public final void a(fxp fxp1)
            {
                fuk.a(c, com.spotify.mobile.android.util.ClientEvent.Event.K);
                CollectionService.a(c.b, a, c.c.toString(), b, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.c);
                dmz.a(gcm);
            }

            
            {
                c = fuk.this;
                a = s;
                b = flags;
                super();
            }
        };
        return;
_L3:
        if (collectionstate == CollectionState.b)
        {
            a(0x7f110027, 0x7f080211, SpotifyIcon.H).d = new fxo(s, flags) {

                private String a;
                private Flags b;
                private fuk c;

                public final void a(fxp fxp1)
                {
                    fuk.a(c, com.spotify.mobile.android.util.ClientEvent.Event.L);
                    CollectionService.a(c.b, a, c.c.toString(), b, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.c);
                    dmz.a(gcm);
                }

            
            {
                c = fuk.this;
                a = s;
                b = flags;
                super();
            }
            };
        }
        if (flag)
        {
            int j = 0x7f080227;
            if (flag1)
            {
                if (fiy.a(flags))
                {
                    j = 0x7f080229;
                } else
                {
                    j = 0x7f080228;
                }
            }
            if (linktype == com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ)
            {
                j = 0x7f080239;
            }
            a(0x7f110034, j, SpotifyIcon.ai).d = new fxo(s, flags) {

                private String a;
                private Flags b;
                private fuk c;

                public final void a(fxp fxp1)
                {
                    fuk.a(c, com.spotify.mobile.android.util.ClientEvent.Event.M);
                    CollectionService.b(c.b, a, c.c.toString(), b, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.c);
                    dmz.a(gcm);
                }

            
            {
                c = fuk.this;
                a = s;
                b = flags;
                super();
            }
            };
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    final void a(com.spotify.mobile.android.util.ClientEvent.Event event)
    {
        f.a(event);
    }

    public final void a(String s)
    {
        a(0x7f1100af, 0x7f080214, SpotifyIcon.ai).d = new fxo(s) {

            private String a;
            private fuk b;

            public final void a(fxp fxp1)
            {
                b.a(com.spotify.mobile.android.util.ClientEvent.Event.w);
                b.b.startService(RadioActionsService.a(b.b, a, b.c, b.d));
            }

            
            {
                b = fuk.this;
                a = s;
                super();
            }
        };
    }

    public final void a(String s, Flags flags)
    {
        a(0x7f110033, 0x7f080226, SpotifyIcon.I).d = new fxo(s, flags) {

            private String a;
            private Flags b;
            private fuk c;

            public final void a(fxp fxp1)
            {
                fuk.a(c, com.spotify.mobile.android.util.ClientEvent.Event.p);
                dmz.a(fos);
                fos.b(c.b, a);
                dmz.a(ggc);
                ggc.a(c.b, a, b);
            }

            
            {
                c = fuk.this;
                a = s;
                b = flags;
                super();
            }
        };
    }

    public final transient void a(String s, Flags flags, String as[])
    {
        ctz.a(true);
        SpotifyLink spotifylink = new SpotifyLink(as[0]);
        int i;
        if (gpl.a(flags))
        {
            i = gpl.b(spotifylink);
        } else
        {
            i = gpl.a(spotifylink);
        }
        a(0x7f1100b2, i, SpotifyIcon.K).d = new fxo(flags, as, s) {

            private Flags a;
            private String b[];
            private String c;
            private fuk d;

            public final void a(fxp fxp1)
            {
                if (gpl.a(a))
                {
                    fxp1 = gms.a(d.b, gpl.b(b[0])).a(c).a;
                    d.b.startActivity(fxp1);
                    return;
                } else
                {
                    fuk.a(d, com.spotify.mobile.android.util.ClientEvent.Event.v);
                    fos.a(d.b, b, d.c, d.d);
                    return;
                }
            }

            
            {
                d = fuk.this;
                a = flags;
                b = as;
                c = s;
                super();
            }
        };
    }

    public final void a(String s, com.spotify.mobile.android.util.SpotifyLink.LinkType linktype, int i, int j)
    {
        Drawable drawable = a(SpotifyIcon.q, gcg.b(b, 0x7f0f0087));
        Drawable drawable1 = a(SpotifyIcon.q, gcg.b(b, 0x7f0f007c));
        if (com.spotify.mobile.android.provider.Metadata.OfflineSync.c(i) || com.spotify.mobile.android.provider.Metadata.OfflineSync.a(i, j) || com.spotify.mobile.android.provider.Metadata.OfflineSync.b(i, j))
        {
            a(0x7f110031, 0x7f080238, drawable).d = new fxo(s, linktype) {

                private String a;
                private com.spotify.mobile.android.util.SpotifyLink.LinkType b;
                private fuk c;

                public final void a(fxp fxp1)
                {
                    fuk.a(c, com.spotify.mobile.android.util.ClientEvent.Event.l);
                    dmz.a(for);
                    for.d(c.b, a, false);
                    if (b != com.spotify.mobile.android.util.SpotifyLink.LinkType.P)
                    {
                        dmz.a(ggc);
                        ggc.f(c.b);
                    }
                }

            
            {
                c = fuk.this;
                a = s;
                b = linktype;
                super();
            }
            };
        } else
        if (com.spotify.mobile.android.provider.Metadata.OfflineSync.a(i))
        {
            a(0x7f110031, 0x7f080216, drawable1).d = new fxo(s) {

                private String a;
                private fuk b;

                public final void a(fxp fxp1)
                {
                    fuk.a(b, com.spotify.mobile.android.util.ClientEvent.Event.j);
                    dmz.a(for);
                    for.d(b.b, a, true);
                }

            
            {
                b = fuk.this;
                a = s;
                super();
            }
            };
            return;
        }
    }

    public final void a(String s, String s1)
    {
        a(s, s1, 0x7f080209);
    }

    public final void a(String s, String s1, int i)
    {
        a(0x7f11002a, i, SpotifyIcon.b).d = new fxo(s, s1) {

            private String a;
            private String b;
            private fuk c;

            public final void a(fxp fxp1)
            {
                fuk.a(c, com.spotify.mobile.android.util.ClientEvent.Event.q);
                c.b.startActivity(gms.a(c.b, a).a(b).a);
            }

            
            {
                c = fuk.this;
                a = s;
                b = s1;
                super();
            }
        };
    }

    public final void a(String s, String s1, int i, Flags flags)
    {
        a(0x7f110029, i, SpotifyIcon.aj).d = new fxo(s, s1, flags) {

            private String a;
            private String b;
            private Flags c;
            private fuk d;

            public final void a(fxp fxp1)
            {
                d.a(com.spotify.mobile.android.util.ClientEvent.Event.n);
                d.b(com.spotify.mobile.android.util.ClientEvent.Event.n);
                d.b.startActivity(AddToPlaylistActivity.a(d.b, a, b, c, d.c, com.spotify.mobile.android.spotlets.playlist.util.PlaylistLogger.SourceAction.a));
            }

            
            {
                d = fuk.this;
                a = s;
                b = s1;
                c = flags;
                super();
            }
        };
    }

    public final void a(String s, String s1, Flags flags)
    {
        a(s, s1, 0x7f080208, flags);
    }

    public final void a(String s, String s1, String s2)
    {
        if (b instanceof u)
        {
            u u1 = (u)b;
            a(0x7f110038, 0x7f08022e, SpotifyIcon.P).d = new fxo(u1, s, s1, s2) {

                private u a;
                private String b;
                private String c;
                private String d;
                private fuk e;

                public final void a(fxp fxp1)
                {
                    (new fic(a, e.c, e.g)).a(b, c, e.e.a.e, d, e.f);
                }

            
            {
                e = fuk.this;
                a = u1;
                b = s;
                c = s1;
                d = s2;
                super();
            }
            };
        }
    }

    public final void a(boolean flag, boolean flag1, boolean flag2, String s, Flags flags)
    {
        CollectionState collectionstate;
        if (flag)
        {
            collectionstate = CollectionState.a;
        } else
        {
            collectionstate = CollectionState.c;
        }
        a(collectionstate, flag1, flag2, s, flags);
    }

    final void b(com.spotify.mobile.android.util.ClientEvent.Event event)
    {
        fop.a(b, c, d, new ClientEvent(event, com.spotify.mobile.android.util.ClientEvent.SubEvent.E));
    }

    public final void b(String s)
    {
        ctz.a(s);
        a(0x7f1100b0, 0x7f080221, SpotifyIcon.e).d = new fxo(s) {

            private String a;
            private fuk b;

            public final void a(fxp fxp1)
            {
                fuk.a(b, com.spotify.mobile.android.util.ClientEvent.Event.al);
                RecentlyPlayedService.a(b.b, a);
            }

            
            {
                b = fuk.this;
                a = s;
                super();
            }
        };
    }

    public final void b(String s, String s1)
    {
        b(s, s1, 0x7f08020a);
    }

    public final void b(String s, String s1, int i)
    {
        a(0x7f11002b, i, SpotifyIcon.d).d = new fxo(s, s1) {

            private String a;
            private String b;
            private fuk c;

            public final void a(fxp fxp1)
            {
                fuk.a(c, com.spotify.mobile.android.util.ClientEvent.Event.r);
                c.b.startActivity(gms.a(c.b, a).a(b).a);
            }

            
            {
                c = fuk.this;
                a = s;
                b = s1;
                super();
            }
        };
    }

    // Unreferenced inner class fuk$10

/* anonymous class */
    public final class _cls10
        implements fxo
    {

        private u a;
        private String b;
        private fuk c;

        public final void a(fxp fxp1)
        {
            c.a(com.spotify.mobile.android.util.ClientEvent.Event.o);
            ((ClipboardManager)a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(a.getString(0x7f0804cc), (new SpotifyLink(b)).e()));
            dmz.a(ggc);
            ggc.a(a, 0x7f08054c, 1, new Object[0]);
            fxp1 = c.g;
            String s = b;
            fxp1.a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.Q, com.spotify.mobile.android.util.ClientEvent.SubEvent.cL, s);
        }

            public 
            {
                c = fuk.this;
                a = u1;
                b = s;
                super();
            }
    }


    // Unreferenced inner class fuk$11

/* anonymous class */
    public final class _cls11
        implements fxo
    {

        private String a;
        private String b;
        private fuk c;

        public final void a(fxp fxp1)
        {
            c.a(com.spotify.mobile.android.util.ClientEvent.Event.o);
            c.b.startActivity(ShareToSpotifyActivity.a(c.b, com.spotify.mobile.android.ui.activity.ShareToSpotifyActivity.ShareType.a, a, fuk.c(b)));
            c.g.b(b);
        }

            public 
            {
                c = fuk.this;
                a = s;
                b = s1;
                super();
            }
    }


    // Unreferenced inner class fuk$13

/* anonymous class */
    public final class _cls13
        implements fxo
    {

        private String a;
        private String b;
        private fuk c;

        public final void a(fxp fxp1)
        {
            c.a(com.spotify.mobile.android.util.ClientEvent.Event.o);
            c.b.startActivity(ShareToSpotifyActivity.a(c.b, com.spotify.mobile.android.ui.activity.ShareToSpotifyActivity.ShareType.a, a, fuk.c(b)));
            c.g.b(b);
        }

            public 
            {
                c = fuk.this;
                a = s;
                b = s1;
                super();
            }
    }


    // Unreferenced inner class fuk$14

/* anonymous class */
    public final class _cls14
        implements fxo
    {

        private String a;
        private String b;
        private String c;
        private fuk d;

        public final void a(fxp fxp1)
        {
            d.a(com.spotify.mobile.android.util.ClientEvent.Event.o);
            fxp1 = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:").buildUpon().appendQueryParameter("subject", a).appendQueryParameter("body", b).build());
            d.b.startActivity(Intent.createChooser(fxp1, d.b.getString(0x7f0804c3)));
            fxp1 = d.g;
            String s = c;
            fxp1.a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.S, com.spotify.mobile.android.util.ClientEvent.SubEvent.cM, s);
        }

            public 
            {
                d = fuk.this;
                a = s;
                b = s1;
                c = s2;
                super();
            }
    }


    // Unreferenced inner class fuk$15

/* anonymous class */
    public final class _cls15
        implements fxo
    {

        private String a;
        private String b;
        private fuk c;

        public final void a(fxp fxp1)
        {
            c.a(com.spotify.mobile.android.util.ClientEvent.Event.o);
            fxp1 = a;
            Assertion.a("");
            Assertion.a(fxp1);
            Object obj = new Intent("android.intent.action.VIEW");
            ((Intent) (obj)).setData(Uri.parse((new StringBuilder("sms:")).append("").toString()));
            ((Intent) (obj)).putExtra("sms_body", fxp1);
            c.b.startActivity(Intent.createChooser(((Intent) (obj)), c.b.getString(0x7f0804c4)));
            fxp1 = c.g;
            obj = b;
            fxp1.a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.S, com.spotify.mobile.android.util.ClientEvent.SubEvent.cQ, ((String) (obj)));
        }

            public 
            {
                c = fuk.this;
                a = s;
                b = s1;
                super();
            }
    }


    // Unreferenced inner class fuk$16

/* anonymous class */
    public final class _cls16
        implements fxo
    {

        private fia a;
        private String b;
        private com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App c;
        private String d;
        private fuk e;

        public final void a(fxp fxp1)
        {
            e.a(com.spotify.mobile.android.util.ClientEvent.Event.o);
            fxp1 = a;
            Object obj = new Intent();
            ((Intent) (obj)).setPackage(((fia) (fxp1)).b.packageName);
            Intent intent = new Intent(((Intent) (obj)));
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", b);
            intent.setType("text/plain");
            fxp1 = e;
            obj = c;
            try
            {
                ((fuk) (fxp1)).b.startActivity(intent);
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                obj = ((fuk) (fxp1)).b.getString(((com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App) (obj)).mNameStringResId);
                dmz.a(ggc);
                ggc.c(((fuk) (fxp1)).b, ((String) (obj)));
                Assertion.b((new StringBuilder("Could not start share Activity for ")).append(((String) (obj))).toString());
            }
            e.g.a(a.b.packageName, d, false);
        }

            public 
            {
                e = fuk.this;
                a = fia1;
                b = s;
                c = app;
                d = s1;
                super();
            }
    }


    // Unreferenced inner class fuk$17

/* anonymous class */
    public final class _cls17
        implements fxo
    {

        private String a;
        private String b;
        private fuk c;

        public final void a(fxp fxp1)
        {
            fuk.a(c, com.spotify.mobile.android.util.ClientEvent.Event.u);
            c.b.startActivity(gms.a(c.b, a).a(b).a);
        }

            public 
            {
                c = fuk.this;
                a = s;
                b = s1;
                super();
            }
    }


    // Unreferenced inner class fuk$2

/* anonymous class */
    public final class _cls2
        implements fxo
    {

        private String a;
        private long b;
        private fuk c;

        public final void a(fxp fxp1)
        {
            fuk.a(c, com.spotify.mobile.android.util.ClientEvent.Event.m);
            dmz.a(for);
            for.a(c.b, a, b);
            dmz.a(ggc);
            ggc.a(c.b, 0x7f080572, 1, new Object[0]);
        }

            public 
            {
                c = fuk.this;
                a = s;
                b = l;
                super();
            }
    }


    // Unreferenced inner class fuk$20

/* anonymous class */
    public final class _cls20
        implements fxo
    {

        private String a;
        private fuk b;

        public final void a(fxp fxp1)
        {
            b.a(com.spotify.mobile.android.util.ClientEvent.Event.y);
            b.b.startService(RadioActionsService.b(b.b, a, b.c, b.d));
        }

            public 
            {
                b = fuk.this;
                a = s;
                super();
            }
    }


    // Unreferenced inner class fuk$23

/* anonymous class */
    public final class _cls23
        implements fxo
    {

        private boolean a;
        private String b;
        private fuk c;

        public final void a(fxp fxp1)
        {
            boolean flag1 = true;
            Object obj = c;
            boolean flag;
            if (a)
            {
                fxp1 = com.spotify.mobile.android.util.ClientEvent.Event.m;
            } else
            {
                fxp1 = com.spotify.mobile.android.util.ClientEvent.Event.i;
            }
            fuk.a(((fuk) (obj)), fxp1);
            dmz.a(for);
            fxp1 = c.b;
            obj = b;
            if (!a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            for.a(fxp1, ((String) (obj)), flag);
            fxp1 = (ggc)dmz.a(ggc);
            obj = c.b;
            if (!a)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            fxp1.a(((Context) (obj)), flag);
        }

            public 
            {
                c = fuk.this;
                a = flag;
                b = s;
                super();
            }
    }


    // Unreferenced inner class fuk$25

/* anonymous class */
    public final class _cls25
        implements fxo
    {

        private boolean a;
        private String b;
        private fuk c;

        public final void a(fxp fxp1)
        {
            boolean flag1 = true;
            Object obj = c;
            boolean flag;
            if (a)
            {
                fxp1 = com.spotify.mobile.android.util.ClientEvent.Event.D;
            } else
            {
                fxp1 = com.spotify.mobile.android.util.ClientEvent.Event.E;
            }
            fuk.a(((fuk) (obj)), fxp1);
            dmz.a(for);
            fxp1 = c.b;
            obj = b;
            if (!a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            for.b(fxp1, ((String) (obj)), flag);
            dmz.a(ggc);
            fxp1 = c.b;
            if (!a)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            ggc.b(fxp1, flag);
        }

            public 
            {
                c = fuk.this;
                a = flag;
                b = s;
                super();
            }
    }


    // Unreferenced inner class fuk$26

/* anonymous class */
    public final class _cls26
        implements fxo
    {

        private long a;
        private fuk b;

        public final void a(fxp fxp1)
        {
            fuk.a(b, com.spotify.mobile.android.util.ClientEvent.Event.m);
            b.b.getContentResolver().delete(ContentUris.withAppendedId(dtp.b, a), null, null);
            dmz.a(ggc);
            ggc.a(b.b, 0x7f080565, 1, new Object[0]);
        }

            public 
            {
                b = fuk.this;
                a = l;
                super();
            }
    }


    // Unreferenced inner class fuk$27

/* anonymous class */
    public final class _cls27
        implements fxo
    {

        private boolean a;
        private String b;
        private fuk c;

        public final void a(fxp fxp1)
        {
            boolean flag1 = true;
            Object obj = c;
            boolean flag;
            if (a)
            {
                fxp1 = com.spotify.mobile.android.util.ClientEvent.Event.F;
            } else
            {
                fxp1 = com.spotify.mobile.android.util.ClientEvent.Event.G;
            }
            fuk.a(((fuk) (obj)), fxp1);
            dmz.a(for);
            fxp1 = c.b;
            obj = b;
            if (!a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            for.c(fxp1, ((String) (obj)), flag);
            dmz.a(ggc);
            fxp1 = c.b;
            if (!a)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            ggc.c(fxp1, flag);
        }

            public 
            {
                c = fuk.this;
                a = flag;
                b = s;
                super();
            }
    }


    // Unreferenced inner class fuk$29

/* anonymous class */
    public final class _cls29
        implements fxo
    {

        private String a;
        private fuk b;

        public final void a(fxp fxp1)
        {
            fuk.a(b, com.spotify.mobile.android.util.ClientEvent.Event.ar);
            PlayedStateService.a(b.b, a);
        }

            public 
            {
                b = fuk.this;
                a = s;
                super();
            }
    }


    // Unreferenced inner class fuk$30

/* anonymous class */
    public final class _cls30
        implements fxo
    {

        private String a;
        private String b;
        private fuk c;

        public final void a(fxp fxp1)
        {
            fuk.a(c, com.spotify.mobile.android.util.ClientEvent.Event.t);
            c.b.startActivity(gms.a(c.b, a).a(b).a);
        }

            public 
            {
                c = fuk.this;
                a = s;
                b = s1;
                super();
            }
    }


    // Unreferenced inner class fuk$31

/* anonymous class */
    public final class _cls31
        implements fxo
    {

        private int a;
        private String b;
        private InfluencerModel c[];
        private fuk d;

        public final void a(fxp fxp1)
        {
            fxp1 = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.cd);
            fxp1.a("index", String.valueOf(a));
            fxp1.a("target_uri", b);
            fop.a(d.b, ViewUri.o, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, fxp1);
            fxp1 = new Bundle();
            fxp1.putParcelableArray("extra_influencers", c);
            d.b.startActivity(gms.a(d.b, "spotify:internal:social-chart:listeners").a(fxp1).a);
        }

            public 
            {
                d = fuk.this;
                a = i;
                b = s;
                c = ainfluencermodel;
                super();
            }
    }


    // Unreferenced inner class fuk$32

/* anonymous class */
    final class _cls32
        implements android.content.DialogInterface.OnClickListener
    {

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface.dismiss();
        }

    }


    // Unreferenced inner class fuk$36

/* anonymous class */
    public final class _cls36
        implements fxo
    {

        private String a;
        private String b;
        private fuk c;

        public final void a(fxp fxp1)
        {
            fuk.a(c, com.spotify.mobile.android.util.ClientEvent.Event.s);
            c.b.startActivity(gms.a(c.b, a).a(b).a);
        }

            public 
            {
                c = fuk.this;
                a = s;
                b = s1;
                super();
            }
    }


    // Unreferenced inner class fuk$37

/* anonymous class */
    public final class _cls37
        implements fxo
    {

        private String a;
        private Flags b;
        private fuk c;

        public final void a(fxp fxp1)
        {
            fuk.a(c, com.spotify.mobile.android.util.ClientEvent.Event.B);
            c.b.startActivity(CreateRenamePlaylistActivity.a(c.b, a, b));
        }

            public 
            {
                c = fuk.this;
                a = s;
                b = flags;
                super();
            }
    }


    // Unreferenced inner class fuk$38

/* anonymous class */
    public final class _cls38
        implements fxo
    {

        private String a;
        private fuk b;

        public final void a(fxp fxp1)
        {
            fuk.a(b, com.spotify.mobile.android.util.ClientEvent.Event.aj);
            b.b.startActivity((new fcv(b.b)).a(a).a);
        }

            public 
            {
                b = fuk.this;
                a = s;
                super();
            }
    }


    // Unreferenced inner class fuk$39

/* anonymous class */
    public final class _cls39
        implements fxo
    {

        private String a;
        private String b;
        private fuk c;

        public final void a(fxp fxp1)
        {
            fuk.a(c, com.spotify.mobile.android.util.ClientEvent.Event.m);
            c.b.startActivity(ConfirmDeletionActivity.a(c.b, a, b));
        }

            public 
            {
                c = fuk.this;
                a = s;
                b = s1;
                super();
            }
    }


    // Unreferenced inner class fuk$4

/* anonymous class */
    public final class _cls4
        implements fxo
    {

        final Context a;
        final PlayerTrack b;
        final Flags c;
        final fuk d;

        public final void a(fxp fxp1)
        {
            fuk.a(d, com.spotify.mobile.android.util.ClientEvent.Event.p);
            d.a.addTrack(a, b, new com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager.QueueObserver(this) {

                final _cls4 a;

                public final void onError(com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager.QueueObserver.ErrorCause errorcause)
                {
                    (new Handler(Looper.getMainLooper())).post(new Runnable(this, errorcause) {

                        private com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager.QueueObserver.ErrorCause a;
                        private _cls1 b;

                        public final void run()
                        {
    public final class _cls4
        implements fxo
    {
                            dfj dfj1;
                            switch (_cls33.b[a.ordinal()])
                            {
                            default:
                                dmz.a(ggc);
                                Context context = b.a.d.b;
                                b.a.b.uri();
                                ggc.a(context, 0x7f08054b, 1, new Object[0]);
                                return;

                            case 1: // '\001'
                                dfj1 = new dfj(b.a.a, 0x7f0b017f);
                                break;
                            }
                            dfj1.a(0x7f080276);
                            dfj1.b(0x7f080274);
                            dfj1.a(0x7f080275, new android.content.DialogInterface.OnClickListener()     final class _cls32
        implements android.content.DialogInterface.OnClickListener
    {

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface.dismiss();
        }

    });
                            dfj1.b().show();
                        }

            
            {
                b = _pcls1;
                a = errorcause;
                super();
            }
                    });
                }

                public final void onSuccess()
                {
                    (new Handler(Looper.getMainLooper())).post(new Runnable(this) {

                        private _cls1 a;

                        public final void run()
                        {
                            dmz.a(ggc);
                            ggc.a(a.a.d.b, a.a.b.uri(), a.a.c);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                }

            
            {
                a = _pcls4;
                super();
            }
            });
        }

            public 
            {
                d = fuk.this;
                a = context;
                b = playertrack;
                c = flags;
                super();
            }
    }


    // Unreferenced inner class fuk$8

/* anonymous class */
    public final class _cls8
        implements fxo
    {

        private String a;
        private String b;
        private String c;
        private String d;
        private fuk e;

        public final void a(fxp fxp1)
        {
            e.a(com.spotify.mobile.android.util.ClientEvent.Event.o);
            fxp1 = e.g;
            Object obj = a;
            fxp1.a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.Q, com.spotify.mobile.android.util.ClientEvent.SubEvent.cN, ((String) (obj)));
            fxp1 = e.b;
            obj = new fhm(e.b);
            String s = b;
            ((fhm) (obj)).b.putExtra("spotify:share:posttitle", s);
            s = c;
            ((fhm) (obj)).b.putExtra("spotify:share:postsubtitle", s);
            s = d;
            ((fhm) (obj)).b.putExtra("spotify:share:postimage_uri", s);
            s = a;
            ((fhm) (obj)).b.putExtra("spotify:share:posturi", s);
            ((fhm) (obj)).a.putExtra("android.intent.extra.INTENT", ((fhm) (obj)).b);
            fxp1.startActivity(((fhm) (obj)).a);
        }

            public 
            {
                e = fuk.this;
                a = s;
                b = s1;
                c = s2;
                d = s3;
                super();
            }
    }


    // Unreferenced inner class fuk$9

/* anonymous class */
    public final class _cls9
        implements fxo
    {

        final String a;
        final String b;
        final String c;
        final fuk d;

        public final void a(fxp fxp1)
        {
            fud.a(d.b, new fuj(this) {

                private _cls9 a;

                public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
                {
                    Object obj2 = (String)obj;
    public final class _cls9
        implements fxo
    {
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
                        ((fuk) (obj4)).a(0x7f11003d, 0x7f08022d, SpotifyIcon.ag).d = ((_cls11) (obj4)). new fxo(spotifycontextmenu, ((String) (obj5)))     public final class _cls11
        implements fxo
    {

        private String a;
        private String b;
        private fuk c;

        public final void a(fxp fxp1)
        {
            c.a(com.spotify.mobile.android.util.ClientEvent.Event.o);
            c.b.startActivity(ShareToSpotifyActivity.a(c.b, com.spotify.mobile.android.ui.activity.ShareToSpotifyActivity.ShareType.a, a, fuk.c(b)));
            c.g.b(b);
        }

            public 
            {
                c = fuk.this;
                a = s;
                b = s1;
                super();
            }
    };
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
                        ((fuk) (obj4)).a(0x7f11003c, 0x7f080219, SpotifyIcon.ag).d = ((_cls13) (obj4)). new fxo(spotifycontextmenu, ((String) (obj5)))     public final class _cls13
        implements fxo
    {

        private String a;
        private String b;
        private fuk c;

        public final void a(fxp fxp1)
        {
            c.a(com.spotify.mobile.android.util.ClientEvent.Event.o);
            c.b.startActivity(ShareToSpotifyActivity.a(c.b, com.spotify.mobile.android.ui.activity.ShareToSpotifyActivity.ShareType.a, a, fuk.c(b)));
            c.g.b(b);
        }

            public 
            {
                c = fuk.this;
                a = s;
                b = s1;
                super();
            }
    };
                    }
                    obj4 = ((fwg) (obj)).g;
                    obj5 = ((SpotifyLink) (obj1)).d();
                    obj6 = ((fwg) (obj)).a(((SpotifyLink) (obj1)), false);
                    spotifycontextmenu = "";
                    fwg._cls1.a[((SpotifyLink) (obj1)).c.ordinal()];
                    JVM INSTR tableswitch 1 10: default 680
                //                               1 1012
                //                               2 1012
                //                               3 1012
                //                               4 1012
                //                               5 1012
                //                               6 1012
                //                               7 1012
                //                               8 1012
                //                               9 1026
                //                               10 1026;
                       goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L3 _L3
_L1:
                    Assertion.a((new StringBuilder("Unsupported link type ")).append(((SpotifyLink) (obj1)).c).toString());
_L5:
                    spotifycontextmenu = (new StringBuilder()).append(spotifycontextmenu).append(" ").append(fwg.a(((SpotifyLink) (obj1)), ((String) (obj3)))).toString();
                    ((fuk) (obj4)).a(0x7f11003a, 0x7f080218, SpotifyIcon.aD).d = ((_cls14) (obj4)). new fxo(((String) (obj6)), spotifycontextmenu, ((String) (obj5)))     public final class _cls14
        implements fxo
    {

        private String a;
        private String b;
        private String c;
        private fuk d;

        public final void a(fxp fxp1)
        {
            d.a(com.spotify.mobile.android.util.ClientEvent.Event.o);
            fxp1 = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:").buildUpon().appendQueryParameter("subject", a).appendQueryParameter("body", b).build());
            d.b.startActivity(Intent.createChooser(fxp1, d.b.getString(0x7f0804c3)));
            fxp1 = d.g;
            String s = c;
            fxp1.a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.S, com.spotify.mobile.android.util.ClientEvent.SubEvent.cM, s);
        }

            public 
            {
                d = fuk.this;
                a = s;
                b = s1;
                c = s2;
                super();
            }
    };
                    spotifycontextmenu = ((fwg) (obj)).g;
                    obj3 = ((SpotifyLink) (obj1)).d();
                    spotifycontextmenu.a(0x7f11003f, 0x7f080230, SpotifyIcon.aF).d = spotifycontextmenu. new fxo(((String) (obj2)), ((String) (obj3)))     public final class _cls15
        implements fxo
    {

        private String a;
        private String b;
        private fuk c;

        public final void a(fxp fxp1)
        {
            c.a(com.spotify.mobile.android.util.ClientEvent.Event.o);
            fxp1 = a;
            Assertion.a("");
            Assertion.a(fxp1);
            Object obj = new Intent("android.intent.action.VIEW");
            ((Intent) (obj)).setData(Uri.parse((new StringBuilder("sms:")).append("").toString()));
            ((Intent) (obj)).putExtra("sms_body", fxp1);
            c.b.startActivity(Intent.createChooser(((Intent) (obj)), c.b.getString(0x7f0804c4)));
            fxp1 = c.g;
            obj = b;
            fxp1.a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.S, com.spotify.mobile.android.util.ClientEvent.SubEvent.cQ, ((String) (obj)));
        }

            public 
            {
                c = fuk.this;
                a = s;
                b = s1;
                super();
            }
    };
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
                                ((fuk) (obj6)).a(((com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App) (obj4)).mId, ((com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App) (obj4)).mNameStringResId, spotifycontextmenu).d = ((_cls16) (obj6)). new fxo(((fia) (obj5)), ((String) (obj2)), ((com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App) (obj4)), s)     public final class _cls16
        implements fxo
    {

        private fia a;
        private String b;
        private com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App c;
        private String d;
        private fuk e;

        public final void a(fxp fxp1)
        {
            e.a(com.spotify.mobile.android.util.ClientEvent.Event.o);
            fxp1 = a;
            Object obj = new Intent();
            ((Intent) (obj)).setPackage(((fia) (fxp1)).b.packageName);
            Intent intent = new Intent(((Intent) (obj)));
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", b);
            intent.setType("text/plain");
            fxp1 = e;
            obj = c;
            try
            {
                ((fuk) (fxp1)).b.startActivity(intent);
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                obj = ((fuk) (fxp1)).b.getString(((com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App) (obj)).mNameStringResId);
                dmz.a(ggc);
                ggc.c(((fuk) (fxp1)).b, ((String) (obj)));
                Assertion.b((new StringBuilder("Could not start share Activity for ")).append(((String) (obj))).toString());
            }
            e.g.a(a.b.packageName, d, false);
        }

            public 
            {
                e = fuk.this;
                a = fia1;
                b = s;
                c = app;
                d = s1;
                super();
            }
    };
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
                a = _pcls9;
                super();
            }
            }, c).ab = new fue(this) {

                private _cls9 a;

                public final void a()
                {
                    fib fib1 = a.d.g;
                    String s = a.c;
                    if (!fib1.a)
                    {
                        fib1.a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.S, com.spotify.mobile.android.util.ClientEvent.SubEvent.cx, s);
                    }
                    fib1.a = false;
                }

            
            {
                a = _pcls9;
                super();
            }
            };
            fxp1 = d.g;
            String s = c;
            fxp1.a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.Q, com.spotify.mobile.android.util.ClientEvent.SubEvent.cO, s);
            fxp1 = d.g;
            s = c;
            fxp1.a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.S, s);
        }

            public 
            {
                d = fuk.this;
                a = s;
                b = s1;
                c = s2;
                super();
            }
    }

}

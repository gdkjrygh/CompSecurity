// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.collection.util.CollectionState;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.spotlets.playlist.activity.AddToPlaylistActivity;
import com.spotify.mobile.android.spotlets.playlist.activity.CreateRenamePlaylistActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class fzt
{

    private static boolean a;

    public static void a(Context context, Menu menu, Verified verified, int i, int j, android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener, android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener1)
    {
        if (!a(context))
        {
            if (com.spotify.mobile.android.provider.Metadata.OfflineSync.c(i) || com.spotify.mobile.android.provider.Metadata.OfflineSync.a(i, j) || com.spotify.mobile.android.provider.Metadata.OfflineSync.b(i, j))
            {
                menu.add(0, 0x7f1100d7, 0, 0x7f0803b0).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener(context, verified, onmenuitemclicklistener1) {

                    private Context a;
                    private Verified b;
                    private android.view.MenuItem.OnMenuItemClickListener c;

                    public final boolean onMenuItemClick(MenuItem menuitem)
                    {
                        fzt.a(a, b, com.spotify.mobile.android.util.ClientEvent.Event.l);
                        return c.onMenuItemClick(menuitem);
                    }

            
            {
                a = context;
                b = verified;
                c = onmenuitemclicklistener;
                super();
            }
                });
                return;
            }
            if (com.spotify.mobile.android.provider.Metadata.OfflineSync.a(i))
            {
                menu.add(0, 0x7f1100d7, 0, 0x7f0803a3).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener(context, verified, onmenuitemclicklistener) {

                    private Context a;
                    private Verified b;
                    private android.view.MenuItem.OnMenuItemClickListener c;

                    public final boolean onMenuItemClick(MenuItem menuitem)
                    {
                        fzt.a(a, b, com.spotify.mobile.android.util.ClientEvent.Event.j);
                        return c.onMenuItemClick(menuitem);
                    }

            
            {
                a = context;
                b = verified;
                c = onmenuitemclicklistener;
                super();
            }
                });
                return;
            }
        }
    }

    public static void a(Context context, Menu menu, Verified verified, int i, int j, com.spotify.mobile.android.util.ClientEvent.Event event, String s, String s1)
    {
        if (a(context))
        {
            return;
        } else
        {
            menu.add(0, i, 0, j).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener(context, verified, event, s, s1) {

                private Context a;
                private Verified b;
                private com.spotify.mobile.android.util.ClientEvent.Event c;
                private String d;
                private String e;

                public final boolean onMenuItemClick(MenuItem menuitem)
                {
                    fzt.a(a, b, c);
                    a.startActivity(gms.a(a, d).a(e).a);
                    return true;
                }

            
            {
                a = context;
                b = verified;
                c = event;
                d = s;
                e = s1;
                super();
            }
            });
            return;
        }
    }

    public static void a(Context context, Menu menu, Verified verified, Uri uri, int i, int j, Optional optional)
    {
        uri = uri.toString();
        android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener = new android.view.MenuItem.OnMenuItemClickListener(context, uri) {

            private Context a;
            private String b;

            public final boolean onMenuItemClick(MenuItem menuitem)
            {
                dmz.a(for);
                for.d(a, b, false);
                dmz.a(ggc);
                ggc.f(a);
                return true;
            }

            
            {
                a = context;
                b = s;
                super();
            }
        };
        a(context, menu, verified, i, j, new android.view.MenuItem.OnMenuItemClickListener(context, uri, optional) {

            private Context a;
            private String b;
            private Optional c;

            public final boolean onMenuItemClick(MenuItem menuitem)
            {
                dmz.a(for);
                for.d(a, b, true);
                if (c.b())
                {
                    ((ewa)c.c()).a();
                }
                return true;
            }

            
            {
                a = context;
                b = s;
                c = optional;
                super();
            }
        }, onmenuitemclicklistener);
    }

    public static void a(Context context, Menu menu, Verified verified, CollectionState collectionstate, boolean flag, String s, Flags flags)
    {
        if (a(context))
        {
            return;
        }
        com.spotify.mobile.android.util.SpotifyLink.LinkType linktype = (new SpotifyLink(s)).c;
        if (linktype != com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ && linktype != com.spotify.mobile.android.util.SpotifyLink.LinkType.c && linktype != com.spotify.mobile.android.util.SpotifyLink.LinkType.v)
        {
            Assertion.a((new StringBuilder("Unsupported link type ")).append(linktype).toString());
        }
        if (linktype == com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ)
        {
            Assertion.b(collectionstate, CollectionState.b);
        }
        final class _cls10
        {

            static final int a[];

            static 
            {
                a = new int[CollectionState.values().length];
                try
                {
                    a[CollectionState.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[CollectionState.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[CollectionState.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls10.a[collectionstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            int i = 0x7f08039d;
            if (linktype == com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ)
            {
                i = 0x7f0803a7;
            }
            menu.add(0, 0x7f1100d1, 0, i).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener(context, verified, s, flags) {

                private Context a;
                private Verified b;
                private String c;
                private Flags d;

                public final boolean onMenuItemClick(MenuItem menuitem)
                {
                    fzt.a(a, b, com.spotify.mobile.android.util.ClientEvent.Event.K);
                    CollectionService.a(a, c, b.toString(), d, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.c);
                    return true;
                }

            
            {
                a = context;
                b = verified;
                c = s;
                d = flags;
                super();
            }
            });
            return;

        case 2: // '\002'
        case 3: // '\003'
            break;
        }
        if (collectionstate == CollectionState.b && flag)
        {
            menu.add(0, 0x7f1100d1, 0, 0x7f0803a2).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener(context, verified, s, flags) {

                private Context a;
                private Verified b;
                private String c;
                private Flags d;

                public final boolean onMenuItemClick(MenuItem menuitem)
                {
                    fzt.a(a, b, com.spotify.mobile.android.util.ClientEvent.Event.L);
                    CollectionService.a(a, c, b.toString(), d, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.c);
                    return true;
                }

            
            {
                a = context;
                b = verified;
                c = s;
                d = flags;
                super();
            }
            });
        }
        int j = 0x7f0803ab;
        if (linktype == com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ)
        {
            j = 0x7f0803b1;
        }
        menu.add(0, 0x7f1100db, 0, j).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener(context, verified, s, flags) {

            private Context a;
            private Verified b;
            private String c;
            private Flags d;

            public final boolean onMenuItemClick(MenuItem menuitem)
            {
                fzt.a(a, b, com.spotify.mobile.android.util.ClientEvent.Event.M);
                CollectionService.b(a, c, b.toString(), d, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.c);
                return true;
            }

            
            {
                a = context;
                b = verified;
                c = s;
                d = flags;
                super();
            }
        });
    }

    public static void a(Context context, Menu menu, Verified verified, fzs fzs)
    {
        a(context, menu, verified, fzs, 0x7f0803a4);
    }

    public static void a(Context context, Menu menu, Verified verified, fzs fzs, int i)
    {
        if (a(context))
        {
            return;
        } else
        {
            menu.add(0, 0x7f1100d8, 0, i).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener(context, verified, fzs) {

                private Context a;
                private Verified b;
                private fzs c;

                public final boolean onMenuItemClick(MenuItem menuitem)
                {
                    fzt.a(a, b, com.spotify.mobile.android.util.ClientEvent.Event.aj);
                    c.a();
                    return true;
                }

            
            {
                a = context;
                b = verified;
                c = fzs1;
                super();
            }
            });
            return;
        }
    }

    public static void a(Context context, Menu menu, Verified verified, String s, Flags flags)
    {
        if (a(context))
        {
            return;
        } else
        {
            menu.add(0, 0x7f1100da, 0, 0x7f0803aa).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener(context, verified, s, flags) {

                private Context a;
                private Verified b;
                private String c;
                private Flags d;

                public final boolean onMenuItemClick(MenuItem menuitem)
                {
                    fzt.a(a, b, com.spotify.mobile.android.util.ClientEvent.Event.p);
                    dmz.a(fos);
                    fos.b(a, c);
                    dmz.a(ggc);
                    ggc.a(a, c, d);
                    return true;
                }

            
            {
                a = context;
                b = verified;
                c = s;
                d = flags;
                super();
            }
            });
            return;
        }
    }

    public static void a(Context context, Menu menu, Verified verified, String s, String s1)
    {
        if (a(context))
        {
            return;
        } else
        {
            a(context, menu, verified, 0x7f1100d4, 0x7f0803a0, com.spotify.mobile.android.util.ClientEvent.Event.r, s, s1);
            return;
        }
    }

    static void a(Context context, Verified verified, com.spotify.mobile.android.util.ClientEvent.Event event)
    {
        dmz.a(fop);
        fop.a(context, verified, new ClientEvent(event, com.spotify.mobile.android.util.ClientEvent.SubEvent.F));
    }

    public static boolean a(Context context)
    {
        if (context == null)
        {
            if (!a)
            {
                Assertion.b("OptionsMenuHelper.* called with a null context");
                a = true;
            }
            return true;
        } else
        {
            return false;
        }
    }

    // Unreferenced inner class fzt$14

/* anonymous class */
    public final class _cls14
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        private Context a;
        private Verified b;
        private boolean c;
        private String d;

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            boolean flag1 = false;
            Object obj = a;
            Verified verified = b;
            boolean flag;
            if (c)
            {
                menuitem = com.spotify.mobile.android.util.ClientEvent.Event.m;
            } else
            {
                menuitem = com.spotify.mobile.android.util.ClientEvent.Event.i;
            }
            fzt.a(((Context) (obj)), verified, menuitem);
            dmz.a(for);
            menuitem = a;
            obj = d;
            if (!c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            for.a(menuitem, ((String) (obj)), flag);
            menuitem = (ggc)dmz.a(ggc);
            obj = a;
            flag = flag1;
            if (!c)
            {
                flag = true;
            }
            menuitem.a(((Context) (obj)), flag);
            return true;
        }

            public 
            {
                a = context;
                b = verified;
                c = flag;
                d = s;
                super();
            }
    }


    // Unreferenced inner class fzt$16

/* anonymous class */
    public final class _cls16
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        private Context a;
        private Verified b;
        private String c;
        private String d;
        private Flags e;

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            fzt.a(a, b, com.spotify.mobile.android.util.ClientEvent.Event.n);
            a.startActivity(AddToPlaylistActivity.a(a, c, d, e, b, com.spotify.mobile.android.spotlets.playlist.util.PlaylistLogger.SourceAction.a));
            return true;
        }

            public 
            {
                a = context;
                b = verified;
                c = s;
                d = s1;
                e = flags;
                super();
            }
    }


    // Unreferenced inner class fzt$17

/* anonymous class */
    public final class _cls17
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        private Context a;
        private Verified b;
        private String c;
        private Flags d;

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            fzt.a(a, b, com.spotify.mobile.android.util.ClientEvent.Event.B);
            a.startActivity(CreateRenamePlaylistActivity.a(a, c, d));
            return true;
        }

            public 
            {
                a = context;
                b = verified;
                c = s;
                d = flags;
                super();
            }
    }


    // Unreferenced inner class fzt$2

/* anonymous class */
    public final class _cls2
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        private Context a;
        private Verified b;
        private boolean c;
        private String d;

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            boolean flag1 = false;
            Object obj = a;
            Verified verified = b;
            boolean flag;
            if (c)
            {
                menuitem = com.spotify.mobile.android.util.ClientEvent.Event.D;
            } else
            {
                menuitem = com.spotify.mobile.android.util.ClientEvent.Event.E;
            }
            fzt.a(((Context) (obj)), verified, menuitem);
            dmz.a(for);
            menuitem = a;
            obj = d;
            if (!c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            for.b(menuitem, ((String) (obj)), flag);
            dmz.a(ggc);
            menuitem = a;
            flag = flag1;
            if (!c)
            {
                flag = true;
            }
            ggc.b(menuitem, flag);
            return true;
        }

            public 
            {
                a = context;
                b = verified;
                c = flag;
                d = s;
                super();
            }
    }


    // Unreferenced inner class fzt$3

/* anonymous class */
    public final class _cls3
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        private Context a;
        private Verified b;
        private boolean c;
        private String d;

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            boolean flag1 = false;
            Object obj = a;
            Verified verified = b;
            boolean flag;
            if (c)
            {
                menuitem = com.spotify.mobile.android.util.ClientEvent.Event.F;
            } else
            {
                menuitem = com.spotify.mobile.android.util.ClientEvent.Event.G;
            }
            fzt.a(((Context) (obj)), verified, menuitem);
            dmz.a(for);
            menuitem = a;
            obj = d;
            if (!c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            for.c(menuitem, ((String) (obj)), flag);
            dmz.a(ggc);
            menuitem = a;
            flag = flag1;
            if (!c)
            {
                flag = true;
            }
            ggc.c(menuitem, flag);
            return true;
        }

            public 
            {
                a = context;
                b = verified;
                c = flag;
                d = s;
                super();
            }
    }


    // Unreferenced inner class fzt$7

/* anonymous class */
    public final class _cls7
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        private Context a;
        private Verified b;
        private boolean c;
        private String d;

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            Object obj = a;
            Verified verified = b;
            boolean flag;
            if (c)
            {
                menuitem = com.spotify.mobile.android.util.ClientEvent.Event.ad;
            } else
            {
                menuitem = com.spotify.mobile.android.util.ClientEvent.Event.ac;
            }
            fzt.a(((Context) (obj)), verified, menuitem);
            menuitem = (FollowManager)dmz.a(com/spotify/mobile/android/spotlets/follow/FollowManager);
            obj = d;
            if (!c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            menuitem.a(((String) (obj)), flag);
            return true;
        }

            public 
            {
                a = context;
                b = verified;
                c = flag;
                d = s;
                super();
            }
    }


    // Unreferenced inner class fzt$8

/* anonymous class */
    public final class _cls8
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        private Context a;
        private Verified b;
        private String c;

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            fzt.a(a, b, com.spotify.mobile.android.util.ClientEvent.Event.ai);
            menuitem = new Intent("android.intent.action.VIEW");
            menuitem.setData(Uri.parse(c));
            a.startActivity(menuitem);
            return true;
        }

            public 
            {
                a = context;
                b = verified;
                c = s;
                super();
            }
    }

}

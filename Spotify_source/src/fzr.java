// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.findfriends.FindFriendsActivity;
import com.spotify.mobile.android.spotlets.playlist.activity.CreateRenamePlaylistActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.Locale;

public final class fzr
{

    private static boolean a;

    public static View a(Context context, Menu menu, int i, int j, SpotifyIcon spotifyicon, android.view.View.OnClickListener onclicklistener)
    {
        return a(context, menu, context.getString(i), j, spotifyicon, onclicklistener);
    }

    public static View a(Context context, Menu menu, android.view.View.OnClickListener onclicklistener)
    {
        return a(context, menu, 0x7f080047, 0x7f110010, SpotifyIcon.B, onclicklistener);
    }

    public static View a(Context context, Menu menu, Verified verified, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1, Uri uri)
    {
        return a(context, menu, new android.view.View.OnClickListener(context, verified, featureidentifier, featureidentifier1, uri) {

            private Context a;
            private Verified b;
            private FeatureIdentifier c;
            private FeatureIdentifier d;
            private Uri e;

            public final void onClick(View view)
            {
                dmz.a(fop);
                fop.a(a, b, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.ab, com.spotify.mobile.android.util.ClientEvent.SubEvent.G));
                dmz.a(fos);
                fos.a(a, b, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, c, d, e);
            }

            
            {
                a = context;
                b = verified;
                c = featureidentifier;
                d = featureidentifier1;
                e = uri;
                super();
            }
        });
    }

    public static View a(Context context, Menu menu, String s, int i, SpotifyIcon spotifyicon, android.view.View.OnClickListener onclicklistener)
    {
        if (a(context))
        {
            return null;
        } else
        {
            menu = menu.add(0, i, 0, s);
            ji.a(menu, 2);
            Resources resources = context.getResources();
            Button button = dgp.d(context, null);
            spotifyicon = new dfz(context, spotifyicon);
            spotifyicon.a(button.getTextColors());
            spotifyicon.a(resources.getDimensionPixelSize(0x7f0c0078));
            button.setPadding(resources.getDimensionPixelSize(0x7f0c0079), 0, resources.getDimensionPixelSize(0x7f0c007a), 0);
            button.setCompoundDrawablesWithIntrinsicBounds(spotifyicon, null, null, null);
            button.setCompoundDrawablePadding(resources.getDimensionPixelOffset(0x7f0c0077));
            button.setText(s.toUpperCase(Locale.getDefault()));
            button.setOnClickListener(onclicklistener);
            context = new FrameLayout(context);
            context.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            s = new android.widget.FrameLayout.LayoutParams(-2, -2);
            i = resources.getDimensionPixelSize(0x7f0c0076);
            s.setMargins(i, 0, i, 0);
            button.setLayoutParams(s);
            context.addView(button);
            ji.a(menu, context);
            return button;
        }
    }

    public static void a(Activity activity, Menu menu, Flags flags)
    {
        if (a(((Context) (activity))))
        {
            return;
        } else
        {
            dfz dfz1 = new dfz(activity, SpotifyIcon.aT);
            dfz1.a(dft.b(24F, activity.getResources()));
            ji.a(menu.add(0, 0x7f110007, 0, activity.getString(0x7f0802e1)).setIcon(dfz1).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener(activity, flags) {

                private Activity a;
                private Flags b;

                public final boolean onMenuItemClick(MenuItem menuitem)
                {
                    menuitem = FindFriendsActivity.a(a, b);
                    a.startActivity(menuitem);
                    return true;
                }

            
            {
                a = activity;
                b = flags;
                super();
            }
            }), 1);
            return;
        }
    }

    public static void a(Context context, Menu menu, Verified verified, Flags flags)
    {
        if (a(context))
        {
            return;
        } else
        {
            a(context, menu, verified, null, flags);
            return;
        }
    }

    public static void a(Context context, Menu menu, Verified verified, fzs fzs)
    {
        dfz dfz1 = new dfz(context, SpotifyIcon.i);
        dfz1.a(dft.b(24F, context.getResources()));
        ji.a(menu.add(0, 0x7f110006, 0, 0x7f080043).setIcon(dfz1).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener(context, verified, fzs) {

            private Context a;
            private Verified b;
            private fzs c;

            public final boolean onMenuItemClick(MenuItem menuitem)
            {
                dmz.a(fop);
                fop.a(a, b, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.au, com.spotify.mobile.android.util.ClientEvent.SubEvent.G));
                c.a();
                return true;
            }

            
            {
                a = context;
                b = verified;
                c = fzs1;
                super();
            }
        }), 1);
    }

    public static void a(Context context, Menu menu, Verified verified, String s, Flags flags)
    {
        if (a(context))
        {
            return;
        } else
        {
            dfz dfz1 = new dfz(context, SpotifyIcon.aj);
            dfz1.a(dft.b(24F, context.getResources()));
            ji.a(menu.add(0, 0x7f110004, 0, context.getString(0x7f080042)).setIcon(dfz1).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener(context, verified, s, flags) {

                private Context a;
                private Verified b;
                private String c;
                private Flags d;

                public final boolean onMenuItemClick(MenuItem menuitem)
                {
                    dmz.a(fop);
                    fop.a(a, b, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.z, com.spotify.mobile.android.util.ClientEvent.SubEvent.G));
                    menuitem = CreateRenamePlaylistActivity.b(a, c, d);
                    a.startActivity(menuitem);
                    return true;
                }

            
            {
                a = context;
                b = verified;
                c = s;
                d = flags;
                super();
            }
            }), 1);
            return;
        }
    }

    public static void a(Context context, Menu menu, Verified verified, String s, String s1, Flags flags)
    {
        if (a(context))
        {
            return;
        }
        SpotifyLink spotifylink = new SpotifyLink(s);
        int i;
        if (gpl.a(flags))
        {
            i = gpl.b(spotifylink);
        } else
        {
            i = gpl.a(spotifylink);
        }
        ji.a(menu.add(0, 0x7f11000a, 0, context.getString(i)).setIcon(0x7f020216).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener(flags, context, s, s1, verified) {

            private Flags a;
            private Context b;
            private String c;
            private String d;
            private Verified e;

            public final boolean onMenuItemClick(MenuItem menuitem)
            {
                if (gpl.a(a))
                {
                    menuitem = gms.a(b, gpl.b(c)).a(d).a;
                    b.startActivity(menuitem);
                } else
                {
                    dmz.a(fop);
                    fop.a(b, e, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.v, com.spotify.mobile.android.util.ClientEvent.SubEvent.G));
                    dmz.a(fos);
                    fos.a(b, c, e);
                }
                return true;
            }

            
            {
                a = flags;
                b = context;
                c = s;
                d = s1;
                e = verified;
                super();
            }
        }), 0);
    }

    public static void a(Context context, Menu menu, Verified verified, String s, String s1, String s2, String s3)
    {
        while (a(context) || !(context instanceof u)) 
        {
            return;
        }
        u u1 = (u)context;
        ji.a(menu.add(0, 0x7f11000f, 0, context.getString(0x7f080046)).setIcon(0x7f020219).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener(u1, verified, s, s1, s2, s3) {

            private u a;
            private Verified b;
            private String c;
            private String d;
            private String e;
            private String f;

            public final boolean onMenuItemClick(MenuItem menuitem)
            {
                (new fic(a, b)).a(c, d, e, f, fxe.a);
                return true;
            }

            
            {
                a = u1;
                b = verified;
                c = s;
                d = s1;
                e = s2;
                f = s3;
                super();
            }
        }), 0);
    }

    public static boolean a(Context context)
    {
        if (context == null)
        {
            if (!a)
            {
                Assertion.b("ActionbarMenuHelper.* called with a null context");
                a = true;
            }
            return true;
        } else
        {
            return false;
        }
    }

    // Unreferenced inner class fzr$6

/* anonymous class */
    public final class _cls6
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        private Context a;
        private Verified b;

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            dmz.a(fop);
            fop.a(a, b, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.A, com.spotify.mobile.android.util.ClientEvent.SubEvent.G));
            menuitem = gms.a(a, ViewUri.T.toString()).a;
            menuitem.putExtra("start_radio", true);
            menuitem.putExtra("close_search_on_click", true);
            a.startActivity(menuitem);
            return true;
        }

            public 
            {
                a = context;
                b = verified;
                super();
            }
    }


    // Unreferenced inner class fzr$7

/* anonymous class */
    public final class _cls7
        implements android.view.View.OnClickListener
    {

        private Context a;
        private Verified b;

        public final void onClick(View view)
        {
            dmz.a(fop);
            fop.a(a, b, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.A, com.spotify.mobile.android.util.ClientEvent.SubEvent.G));
            view = gms.a(a, ViewUri.T.toString()).a;
            view.putExtra("start_radio", true);
            view.putExtra("close_search_on_click", true);
            a.startActivity(view);
        }

            public 
            {
                a = context;
                b = verified;
                super();
            }
    }

}

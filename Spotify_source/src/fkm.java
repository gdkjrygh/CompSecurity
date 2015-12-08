// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.prettylist.StickyListView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.activityfeed.ActivityFeedFragment;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager;
import com.spotify.mobile.android.spotlets.user.InvitationCodeModel;
import com.spotify.mobile.android.spotlets.user.PlaylistModel;
import com.spotify.mobile.android.spotlets.user.ProfileModel;
import com.spotify.mobile.android.spotlets.user.ProfileV2Model;
import com.spotify.mobile.android.spotlets.user.ProfileV2VolatileModel;
import com.spotify.mobile.android.spotlets.user.TopArtistModel;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.Arrays;
import java.util.Locale;

public final class fkm extends al
    implements NavigationItem, dod, esp, fxy, gck
{

    private ToggleButton Y;
    private ftg Z;
    private fkq aa;
    private fkk ab;
    private ftm ac;
    private fkf ad;
    private String ae;
    private String af;
    private String ag;
    private ggl ah;
    private Resolver ai;
    private ProfileModel aj;
    private ProfileV2Model ak;
    private ProfileV2VolatileModel al;
    private TextView am;
    private TextView an;
    private TextView ao;
    private View ap;
    private View aq;
    private View ar;
    private ListView as;
    private NotAvailableViewManager at;
    private dja au;
    private gjf av;
    private Parcelable aw;
    private Flags ax;
    private gbf ay;
    private boolean b;

    public fkm()
    {
    }

    static ProfileV2Model a(fkm fkm1, ProfileV2Model profilev2model)
    {
        fkm1.ak = profilev2model;
        return profilev2model;
    }

    static ProfileV2VolatileModel a(fkm fkm1, ProfileV2VolatileModel profilev2volatilemodel)
    {
        fkm1.al = profilev2volatilemodel;
        return profilev2volatilemodel;
    }

    public static fkm a(String s, String s1, String s2, Flags flags)
    {
        Bundle bundle = new Bundle();
        bundle.putString("user_uri", s);
        bundle.putString("currentusername", s1);
        bundle.putString("title", s2);
        s = new fkm();
        s.f(bundle);
        fyw.a(s, flags);
        return s;
    }

    static String a(fkm fkm1)
    {
        return fkm1.ae;
    }

    private static void a(View view, TextView textview, int j)
    {
        textview.setText(String.valueOf(j));
        boolean flag;
        if (j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setClickable(flag);
    }

    static ToggleButton b(fkm fkm1)
    {
        return fkm1.Y;
    }

    static Flags c(fkm fkm1)
    {
        return fkm1.ax;
    }

    static String d(fkm fkm1)
    {
        return fkm1.ag;
    }

    static void e(fkm fkm1)
    {
        if (fkm1.ak != null && fkm1.al != null)
        {
            fkm1.aj = ProfileModel.create(fkm1.al, fkm1.ak);
            ((FollowManager)dmz.a(com/spotify/mobile/android/spotlets/follow/FollowManager)).a(fkm1.aj.getFollowData());
            a(fkm1.ar, fkm1.ao, fkm1.aj.getPlaylistCount());
            Object obj = fkm1.aj.getDisplayName();
            ((djq)fkm1.au.a()).a(((CharSequence) (obj)));
            dmz.a(gjj);
            gji gji1 = gjj.a(fkm1.k());
            obj = fkm1.aj.getImageHttpUrl();
            if (obj != null && !((String) (obj)).endsWith(".gif"))
            {
                gji1.a(fkm1.au.d(), dto.a(((String) (obj))));
            }
            ImageView imageview = fkm1.au.c();
            Uri uri = dto.a(((String) (obj)));
            if (fkm1.aj.isVerified())
            {
                obj = fkm1.ay;
            } else
            {
                obj = dfo.a();
            }
            gji1.a(imageview, uri, dff.f(gji1.a), ((dfv) (obj)));
            fkm1.au.c().setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            fkm1.Z.notifyDataSetChanged();
            if (!fkm1.av.d())
            {
                fkm1.av.b();
            }
            if (fkm1.aj.getPlaylists() != null)
            {
                fkm1.ab.a(fkm1.aj.getPlaylists());
                fkm1.Z.d(1);
                fkm1.Z.a(new int[] {
                    2
                });
            }
            if (fkm1.aj.getTopArtists() != null)
            {
                obj = fkm1.aj.getTopArtists();
                obj = (TopArtistModel[])Arrays.copyOfRange(((Object []) (obj)), 0, Math.min(3, obj.length));
                fkm1.aa.a(((Object []) (obj)));
                fkm1.Z.d(0);
                fkm1.Z.a(new int[] {
                    2
                });
            }
            if (fkm1.aj.getInvitationCodes() != null && fkm1.aj.getInvitationCodes().length > 0 && ((Boolean)fkm1.ax.a(fys.Q)).booleanValue())
            {
                obj = fkm1.ad;
                boolean flag = fkm1.aj.hasMoreInvitationCodes();
                if (flag != ((ftv) (obj)).b)
                {
                    obj.b = flag;
                    ((ftv) (obj)).notifyDataSetChanged();
                }
                fkm1.ad.a(fkm1.aj.getInvitationCodes());
                fkm1.Z.d(3);
                fkm1.Z.a(new int[] {
                    2
                });
            }
            if (fkm1.aj.hasRecentShares())
            {
                fkm1.Z.d(4);
                fkm1.Z.a(new int[] {
                    2
                });
            }
            fkm1.as.post(fkm1. new Runnable() {

                private fkm a;

                public final void run()
                {
                    if (fkm.g(a) != null)
                    {
                        fkm.h(a).onRestoreInstanceState(fkm.g(a));
                        fkm.i(a);
                    }
                }

            
            {
                a = fkm.this;
                super();
            }
            });
            fkm1.at.a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.d);
        }
    }

    static NotAvailableViewManager f(fkm fkm1)
    {
        return fkm1.at;
    }

    static Parcelable g(fkm fkm1)
    {
        return fkm1.aw;
    }

    static ListView h(fkm fkm1)
    {
        return fkm1.as;
    }

    static Parcelable i(fkm fkm1)
    {
        fkm1.aw = null;
        return null;
    }

    public final void A()
    {
        super.A();
        ah.b();
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.l;
    }

    public final void B()
    {
        ai.destroy();
        ((FollowManager)dmz.a(com/spotify/mobile/android/spotlets/follow/FollowManager)).b(ae, this);
        super.B();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return (new StringBuilder("profile:")).append(g().getString("user_uri")).toString();
    }

    public final Uri a()
    {
        return Uri.parse(ae);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        aa = new fkq(k(), (byte)0);
        ab = new fkk(k(), (byte)0);
        ad = new fkf(k());
        Z = new ftg(k());
        Z.a(ad, b(0x7f08042b), 3, null);
        Z.a(aa, b(0x7f08042e), 0, null);
        Z.a(ab, b(0x7f08042c), 1, null);
        viewgroup = new edi(k());
        Z.a(viewgroup, b(0x7f08042d), 4, null);
        viewgroup = Z;
        Object obj = k();
        bundle = new EmptyView(((Context) (obj)));
        bundle.b().setSingleLine(false);
        bundle.b().setEllipsize(null);
        bundle.c().setSingleLine(false);
        bundle.c().setEllipsize(null);
        bundle.a(((Context) (obj)).getString(0x7f080429));
        bundle.b(((Context) (obj)).getString(0x7f080428));
        boolean flag = ((Boolean)ax.a(fys.N)).booleanValue();
        android.view.View.OnClickListener onclicklistener;
        int j;
        if (flag)
        {
            j = 0x7f0803e0;
        } else
        {
            j = 0x7f080427;
        }
        onclicklistener = new android.view.View.OnClickListener(flag) {

            private boolean a;
            private fkm b;

            public final void onClick(View view)
            {
                u u1 = b.k();
                u u2 = b.k();
                if (a)
                {
                    view = "spotify:hub:music";
                } else
                {
                    view = "spotify:app:browse";
                }
                u1.startActivity(gms.a(u2, view).a);
            }

            
            {
                b = fkm.this;
                a = flag;
                super();
            }
        };
        obj = dgp.b(((Context) (obj)), bundle);
        ((Button) (obj)).setId(0x7f110022);
        ((Button) (obj)).setText(j);
        ((Button) (obj)).setSingleLine(true);
        ((Button) (obj)).setEllipsize(android.text.TextUtils.TruncateAt.END);
        bundle.a(((View) (obj)));
        ((Button) (obj)).setOnClickListener(onclicklistener);
        ac = new ftm(bundle, false);
        viewgroup.a(ac, null, 2);
        Z.a(new int[] {
            3, 0, 1, 4
        });
        if (!b)
        {
            viewgroup = k();
            bundle = viewgroup.getResources();
            String s = bundle.getString(0x7f0802f8).toUpperCase(Locale.getDefault());
            Y = dgp.a(viewgroup, bundle.getString(0x7f0802f9).toUpperCase(Locale.getDefault()), s);
            Y.setId(0x7f11004f);
            Y.setOnClickListener(new android.view.View.OnClickListener() {

                private fkm a;

                public final void onClick(View view)
                {
                    view = (FollowManager)dmz.a(com/spotify/mobile/android/spotlets/follow/FollowManager);
                    String s1 = fkm.a(a);
                    boolean flag1 = fkm.b(a).isChecked();
                    fkm.c(a);
                    view.a(s1, flag1);
                }

            
            {
                a = fkm.this;
                super();
            }
            });
            ((EmptyView)ac.getView(0, null, null)).c().setVisibility(8);
            ((EmptyView)ac.getView(0, null, null)).e().setVisibility(8);
        }
        viewgroup = k();
        if (ggi.b(viewgroup))
        {
            au = dja.b(viewgroup).b().a(Y, 1).a(this);
        } else
        {
            au = dja.a(viewgroup).b().a(Y, 1).a(this);
        }
        au.a(dgo.b(viewgroup, 0x7f0101c6));
        as = au.e().a();
        viewgroup = layoutinflater.inflate(0x7f030122, null);
        as.addHeaderView(viewgroup, null, false);
        as.setAdapter(Z);
        au.c().setImageDrawable(dff.f(k()));
        bundle = new FrameLayout(k());
        bundle.setBackgroundColor(dgo.b(k(), 0x1010054));
        bundle.addView(au.b());
        at = new NotAvailableViewManager(k(), layoutinflater, au.b(), bundle);
        at.a = 0x7f08042a;
        ap = viewgroup.findViewById(0x7f1104a6);
        aq = viewgroup.findViewById(0x7f1104a9);
        ar = viewgroup.findViewById(0x7f1104a3);
        am = (TextView)viewgroup.findViewById(0x7f1104a7);
        an = (TextView)viewgroup.findViewById(0x7f1104aa);
        ao = (TextView)viewgroup.findViewById(0x7f1104a4);
        ar.setOnClickListener(new android.view.View.OnClickListener() {

            private fkm a;

            public final void onClick(View view)
            {
                view = fko.d(fkm.d(a));
                String s1 = a.l().getString(0x7f0803fc);
                a.a(gms.a(a.k(), view).a(s1).a);
            }

            
            {
                a = fkm.this;
                super();
            }
        });
        ap.setOnClickListener(new android.view.View.OnClickListener() {

            private fkm a;

            public final void onClick(View view)
            {
                view = fko.a(fkm.d(a));
                String s1 = a.l().getString(0x7f080425);
                a.a(gms.a(a.k(), view).a(s1).a);
            }

            
            {
                a = fkm.this;
                super();
            }
        });
        aq.setOnClickListener(new android.view.View.OnClickListener() {

            private fkm a;

            public final void onClick(View view)
            {
                view = a.l().getString(0x7f080426);
                String s1 = fko.b(fkm.d(a));
                a.a(gms.a(a.k(), s1).a(view).a);
            }

            
            {
                a = fkm.this;
                super();
            }
        });
        return bundle;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f08042f);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ae = g().getString("user_uri");
        af = g().getString("title");
        Object obj = g().getString("currentusername");
        ax = fyw.a(this);
        ag = (new SpotifyLink(ae)).a();
        b = TextUtils.equals(ag, ((CharSequence) (obj)));
        obj = ViewUri.ai.a(ae);
        av = gjf.a(k(), ((Verified) (obj)).toString());
        av.c(bundle);
        if (bundle != null && bundle.containsKey("list"))
        {
            aw = bundle.getParcelable("list");
        }
        ah = ggn.a(k(), ((Verified) (obj)));
        ai = Cosmos.getResolver(k());
        ay = new gbf(k().getApplicationContext());
        a(true);
    }

    public final void a(Menu menu)
    {
        menu.clear();
        if (b)
        {
            fzr.a(k(), menu, ax);
        }
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        a(((View) (z_())));
        ((FollowManager)dmz.a(com/spotify/mobile/android/spotlets/follow/FollowManager)).a(ae, this);
    }

    public final void a(ListView listview, View view, int j, long l)
    {
        j -= z_().getHeaderViewsCount();
        int k = Z.b(j);
        switch (k)
        {
        case 2: // '\002'
        default:
            Assertion.a(String.format(Locale.US, "Missing case for section id %d for position %d", new Object[] {
                Integer.valueOf(k), Integer.valueOf(j)
            }));
            return;

        case 0: // '\0'
            listview = (TopArtistModel)view.getTag();
            if (listview == null)
            {
                listview = new Bundle();
                listview.putParcelableArray("artists-json", aj.getTopArtists());
                a(gms.a(k(), fko.f(ae)).a(listview).a);
                return;
            } else
            {
                a(gms.a(k(), listview.getUri()).a);
                return;
            }

        case 1: // '\001'
            listview = k();
            view = ((View) (view.getTag()));
            if (view != null)
            {
                view = (PlaylistModel)view;
                a(gms.a(listview, view.getUri()).a(view.getName()).a);
                return;
            } else
            {
                a(gms.a(listview, fko.e(ae)).a);
                return;
            }

        case 3: // '\003'
            listview = (InvitationCodeModel)view.getTag();
            if (listview != null)
            {
                fke.a(k(), listview, ax);
                return;
            } else
            {
                a(gms.a(k(), fko.g(ae)).a);
                return;
            }

        case 4: // '\004'
            listview = (String)ActivityFeedFragment.a.get(com.spotify.mobile.android.spotlets.activityfeed.ActivityFeedFragment.Type.b.mIndex);
            view = new Bundle();
            view.putString("com.spotify.activity_feed.type.profile_username", ag);
            a(gms.a(k(), listview).a(view).a);
            return;
        }
    }

    public final void a(eso eso1)
    {
        a(ap, am, eso1.c);
        a(aq, an, eso1.b);
        if (Y != null)
        {
            Y.setChecked(eso1.d);
        }
    }

    public final void c()
    {
        super.c();
        ai.connect();
        av.a();
        u().a(0x7f110096, null, new gcj(k(), this));
    }

    public final void d()
    {
        super.d();
        av.c();
        ai.disconnect();
        u().a(0x7f110096);
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        if (af == null)
        {
            af = k().getString(0x7f08042f);
        }
        ((fpe)k()).a(this, af);
    }

    public final void d(boolean flag)
    {
        at.a(flag);
        if (flag)
        {
            if (!at.a().booleanValue())
            {
                at.a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.b);
                Object obj = String.format("hm://user-profile-view/v2/android/profile/%s", new Object[] {
                    Uri.encode(ag)
                });
                Handler handler = new Handler(Looper.getMainLooper());
                obj = RequestBuilder.get(((String) (obj))).build();
                ai.resolve(((com.spotify.cosmos.router.Request) (obj)), new JsonCallbackReceiver(handler, com/spotify/mobile/android/spotlets/user/ProfileV2Model) {

                    private fkm a;

                    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                    {
                        Logger.b(throwable, "Profile failed to load", new Object[0]);
                        fkm.f(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.c);
                    }

                    protected final void onResolved(Response response, Object obj2)
                    {
                        response = (ProfileV2Model)obj2;
                        if (a.o())
                        {
                            fkm.a(a, response);
                            fkm.e(a);
                        }
                    }

            
            {
                a = fkm.this;
                super(handler, class1);
            }
                });
            }
            Object obj1 = String.format("hm://user-profile-view/v2/android/profile/%s/volatile", new Object[] {
                Uri.encode(ag)
            });
            Handler handler1 = new Handler(Looper.getMainLooper());
            obj1 = RequestBuilder.get(((String) (obj1))).build();
            ai.resolve(((com.spotify.cosmos.router.Request) (obj1)), new JsonCallbackReceiver(handler1, com/spotify/mobile/android/spotlets/user/ProfileV2VolatileModel) {

                private fkm a;

                protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                {
                    Logger.b(throwable, "ProfileVolatile failed to load", new Object[0]);
                    fkm.f(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.c);
                }

                protected final void onResolved(Response response, Object obj2)
                {
                    response = (ProfileV2VolatileModel)obj2;
                    if (a.o())
                    {
                        fkm.a(a, response);
                        fkm.e(a);
                    }
                }

            
            {
                a = fkm.this;
                super(handler, class1);
            }
            });
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        av.a(bundle);
        if (as != null)
        {
            bundle.putParcelable("list", as.onSaveInstanceState());
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.at;
    }

    public final volatile ListAdapter w_()
    {
        return Z;
    }

    public final void z()
    {
        super.z();
        ah.a();
    }
}

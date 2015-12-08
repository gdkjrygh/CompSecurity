// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager;
import com.spotify.mobile.android.spotlets.user.TopArtistModel;
import com.spotify.mobile.android.spotlets.user.TopArtistsListModel;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class fkr extends al
    implements fxy, gck
{

    private TopArtistModel Y[];
    private String Z;
    private boolean aa;
    private fkq ab;
    private ListView ac;
    private Parcelable ad;
    private NotAvailableViewManager ae;
    private Resolver b;

    public fkr()
    {
    }

    private void H()
    {
        com.spotify.cosmos.router.Request request = RequestBuilder.get(String.format("hm://user-profile-view/v1/android/profile/%s/most-played-artists", new Object[] {
            Z
        })).build();
        b.resolve(request, new JsonCallbackReceiver(new Handler(Looper.getMainLooper()), com/spotify/mobile/android/spotlets/user/TopArtistsListModel) {

            final fkr a;

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                fkr.e(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.c);
            }

            protected final void onResolved(Response response, Object obj)
            {
                response = (TopArtistsListModel)obj;
                fkr.a(a).a(response.getTopArtists());
                fkr.c(a).post(new Runnable(this) {

                    private _cls1 a;

                    public final void run()
                    {
                        if (fkr.b(a.a) != null)
                        {
                            fkr.c(a.a).onRestoreInstanceState(fkr.b(a.a));
                            fkr.d(a.a);
                        }
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
                fkr.e(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.d);
            }

            
            {
                a = fkr.this;
                super(handler, class1);
            }
        });
    }

    static fkq a(fkr fkr1)
    {
        return fkr1.ab;
    }

    public static fkr a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("user-uri", s);
        s = new fkr();
        s.f(bundle);
        return s;
    }

    static Parcelable b(fkr fkr1)
    {
        return fkr1.ad;
    }

    static ListView c(fkr fkr1)
    {
        return fkr1.ac;
    }

    static Parcelable d(fkr fkr1)
    {
        fkr1.ad = null;
        return null;
    }

    static NotAvailableViewManager e(fkr fkr1)
    {
        return fkr1.ae;
    }

    public final void B()
    {
        super.B();
        if (b != null)
        {
            b.destroy();
        }
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "com:spotify:user:artists";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300ce, null);
        ac = (ListView)viewgroup.findViewById(0x102000a);
        ae = new NotAvailableViewManager(k(), layoutinflater, ac, viewgroup);
        return viewgroup;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getResources().getString(0x7f08042e);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        b = Cosmos.getResolver(k());
        if (!g().containsKey("artists-json")) goto _L2; else goto _L1
_L1:
        Parcelable aparcelable[] = g().getParcelableArray("artists-json");
        TopArtistModel atopartistmodel[] = new TopArtistModel[aparcelable.length];
        for (int i = 0; i < aparcelable.length; i++)
        {
            atopartistmodel[i] = (TopArtistModel)aparcelable[i];
        }

        Y = atopartistmodel;
_L4:
        if (bundle != null && bundle.containsKey("list"))
        {
            ad = bundle.getParcelable("list");
        }
        return;
_L2:
        if (g().containsKey("user-uri"))
        {
            Z = (new SpotifyLink(g().getString("user-uri"))).a();
            aa = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        ab = new fkq(k());
        a(((android.widget.ListAdapter) (ab)));
        if (Y != null)
        {
            ab.a(Y);
            ae.a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.d);
            return;
        }
        if (aa)
        {
            ae.a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.b);
            u().a(0x7f11009d, null, new gcj(k(), this));
            H();
            return;
        } else
        {
            ae.a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.c);
            return;
        }
    }

    public final void a(ListView listview, View view, int i, long l)
    {
        listview = (TopArtistModel)listview.getItemAtPosition(i);
        a(gms.a(k(), listview.getUri()).a);
    }

    public final void c()
    {
        super.c();
        b.connect();
    }

    public final void d()
    {
        super.d();
        b.disconnect();
    }

    public final void d(boolean flag)
    {
        ae.a(flag);
        if (flag && aa)
        {
            H();
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (ac != null)
        {
            bundle.putParcelable("list", ac.onSaveInstanceState());
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.av;
    }
}

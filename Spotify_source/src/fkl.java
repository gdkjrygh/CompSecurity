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
import com.spotify.mobile.android.spotlets.user.PlaylistListModel;
import com.spotify.mobile.android.spotlets.user.PlaylistModel;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.Locale;

public final class fkl extends al
    implements fxy, gck
{

    private String Y;
    private fkk Z;
    private ListView aa;
    private Parcelable ab;
    private NotAvailableViewManager ac;
    private Resolver b;

    public fkl()
    {
    }

    static fkk a(fkl fkl1)
    {
        return fkl1.Z;
    }

    public static fkl a(String s)
    {
        fkl fkl1 = new fkl();
        Bundle bundle = new Bundle();
        bundle.putString("username", (new SpotifyLink(s)).a());
        fkl1.f(bundle);
        return fkl1;
    }

    static Parcelable b(fkl fkl1)
    {
        return fkl1.ab;
    }

    static ListView c(fkl fkl1)
    {
        return fkl1.aa;
    }

    static Parcelable d(fkl fkl1)
    {
        fkl1.ab = null;
        return null;
    }

    static NotAvailableViewManager e(fkl fkl1)
    {
        return fkl1.ac;
    }

    public final void B()
    {
        b.destroy();
        super.B();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "spotify:user:playlists";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300ce, null);
        aa = (ListView)viewgroup.findViewById(0x102000a);
        ac = new NotAvailableViewManager(k(), layoutinflater, aa, viewgroup);
        return viewgroup;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getResources().getString(0x7f080401);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        Y = g().getString("username");
        b = Cosmos.getResolver(k());
        if (bundle != null && bundle.containsKey("list"))
        {
            ab = bundle.getParcelable("list");
        }
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        Z = new fkk(k());
        a(((android.widget.ListAdapter) (Z)));
        ac.a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.b);
        view = RequestBuilder.get(String.format(Locale.US, "hm://user-profile-view/v1/android/profile/%s/playlists", new Object[] {
            Uri.encode(Y)
        })).build();
        b.resolve(view, new JsonCallbackReceiver(new Handler(Looper.getMainLooper()), com/spotify/mobile/android/spotlets/user/PlaylistListModel) {

            final fkl a;

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                fkl.e(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.c);
            }

            protected final void onResolved(Response response, Object obj)
            {
                obj = (PlaylistListModel)obj;
                if (response.getStatus() == 200)
                {
                    response = ((PlaylistListModel) (obj)).getPlaylists();
                    if (response != null)
                    {
                        fkl.a(a).a(response);
                        fkl.c(a).post(new Runnable(this) {

                            private _cls1 a;

                            public final void run()
                            {
                                if (fkl.b(a.a) != null)
                                {
                                    fkl.c(a.a).onRestoreInstanceState(fkl.b(a.a));
                                    fkl.d(a.a);
                                }
                            }

            
            {
                a = _pcls1;
                super();
            }
                        });
                        fkl.e(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.d);
                        return;
                    } else
                    {
                        fkl.e(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.c);
                        return;
                    }
                } else
                {
                    fkl.e(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.c);
                    return;
                }
            }

            
            {
                a = fkl.this;
                super(handler, class1);
            }
        });
    }

    public final void a(ListView listview, View view, int i, long l)
    {
        listview = (PlaylistModel)listview.getItemAtPosition(i);
        a(gms.a(k(), listview.getUri()).a);
    }

    public final void c()
    {
        super.c();
        b.connect();
        u().a(0x7f11009b, null, new gcj(k(), this));
    }

    public final void d()
    {
        super.d();
        b.disconnect();
        u().a(0x7f11009b);
    }

    public final void d(boolean flag)
    {
        ac.a(flag);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (aa != null)
        {
            bundle.putParcelable("list", aa.onSaveInstanceState());
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.as;
    }
}

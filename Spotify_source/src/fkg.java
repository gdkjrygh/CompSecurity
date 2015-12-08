// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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
import com.spotify.mobile.android.spotlets.user.InvitationCodeListModel;
import com.spotify.mobile.android.spotlets.user.InvitationCodeModel;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.Locale;

public final class fkg extends al
    implements fxy, gck
{

    private fkf Y;
    private Resolver Z;
    private boolean aa;
    private String ab;
    private Flags ac;
    private NotAvailableViewManager b;

    public fkg()
    {
    }

    public static fkg a(SpotifyLink spotifylink, Flags flags)
    {
        fkg fkg1 = new fkg();
        Bundle bundle = new Bundle();
        bundle.putString("username", spotifylink.a());
        fkg1.f(bundle);
        fyw.a(fkg1, flags);
        return fkg1;
    }

    static boolean a(fkg fkg1)
    {
        return fkg1.aa;
    }

    static fkf b(fkg fkg1)
    {
        return fkg1.Y;
    }

    static NotAvailableViewManager c(fkg fkg1)
    {
        return fkg1.b;
    }

    public final void B()
    {
        if (Z != null)
        {
            Z.destroy();
        }
        aa = true;
        super.B();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "spotify:user:invitationcodes";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ac = fyw.a(this);
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300ce, viewgroup, false);
        bundle = (ViewGroup)viewgroup.findViewById(0x102000a);
        b = new NotAvailableViewManager(k(), layoutinflater, bundle, viewgroup);
        return viewgroup;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f08042b);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ab = g().getString("username");
        Z = Cosmos.getResolver(k());
        Z.connect();
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        Y = new fkf(k());
        a(((android.widget.ListAdapter) (Y)));
        u().a(0x7f110097, null, new gcj(k(), this));
        b.a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.b);
        view = RequestBuilder.get(String.format(Locale.US, "hm://user-profile-view/v1/android/profile/%s/invitationcodes", new Object[] {
            Uri.encode(ab)
        })).build();
        Z.resolve(view, new JsonCallbackReceiver(new Handler(Looper.getMainLooper()), com/spotify/mobile/android/spotlets/user/InvitationCodeListModel) {

            private fkg a;

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                fkg.c(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.c);
            }

            protected final void onResolved(Response response, Object obj)
            {
label0:
                {
label1:
                    {
                        obj = (InvitationCodeListModel)obj;
                        if (!fkg.a(a))
                        {
                            if (response.getStatus() != 200)
                            {
                                break label0;
                            }
                            response = ((InvitationCodeListModel) (obj)).getInvitationCodes();
                            if (response == null)
                            {
                                break label1;
                            }
                            fkg.b(a).a(response);
                            fkg.c(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.d);
                        }
                        return;
                    }
                    fkg.c(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.c);
                    return;
                }
                fkg.c(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.c);
            }

            
            {
                a = fkg.this;
                super(handler, class1);
            }
        });
    }

    public final void a(ListView listview, View view, int i, long l)
    {
        listview = (InvitationCodeModel)listview.getItemAtPosition(i);
        fke.a(k(), listview, ac);
    }

    public final void d(boolean flag)
    {
        b.a(flag);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.ar;
    }
}

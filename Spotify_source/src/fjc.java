// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.spotify.mobile.android.spotlets.socialchart.model.InfluencerModel;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.Arrays;

public final class fjc extends al
    implements fxy
{

    private InfluencerModel Y[];
    private fjj b;

    public fjc()
    {
    }

    public static fjc b(Intent intent)
    {
        android.os.Parcelable aparcelable[] = intent.getParcelableArrayExtra("extra_influencers");
        Assertion.a(aparcelable);
        intent = new Bundle();
        intent.putParcelableArray("influencers", aparcelable);
        fjc fjc1 = new fjc();
        fjc1.f(intent);
        return fjc1;
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "spotify:internal:social-chart:listeners";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300ce, viewgroup, false);
    }

    public final String a(Context context, Flags flags)
    {
        return "";
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a(true);
        bundle = g().getParcelableArray("influencers");
        Assertion.a(bundle);
        Y = (InfluencerModel[])Arrays.copyOf(bundle, bundle.length, [Lcom/spotify/mobile/android/spotlets/socialchart/model/InfluencerModel;);
        b = new fjj(k());
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        view = new fjf(k());
        view.a(Y);
        a(((android.widget.ListAdapter) (view)));
        view = k().getResources().getQuantityString(0x7f090021, Y.length, new Object[] {
            Integer.valueOf(Y.length)
        });
        ((fpe)k()).a(this, view);
    }

    public final void a(ListView listview, View view, int i, long l)
    {
        listview = (InfluencerModel)view.getTag();
        a(gms.a(k(), listview.getUri()).a);
        view = b;
        i = (int)l;
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.cc);
        clientevent.a("index", String.valueOf(i));
        clientevent.a("target_uri", listview.getUri());
        fop.a(((fjj) (view)).a, ViewUri.o, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.M, clientevent);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.D;
    }
}

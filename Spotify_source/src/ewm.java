// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.cosmos.android.RxCosmos;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.RxTypedResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.spotlets.onboarding.taste.TasteActivity;
import com.spotify.mobile.android.spotlets.onboarding.taste.model.ArtistQuestionnaire;
import com.spotify.mobile.android.spotlets.onboarding.taste.model.GenreQuestionnaire;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.common.AbstractContentFragment;

public final class ewm extends gnp
    implements exd
{

    private GenreQuestionnaire Y;
    private ewp a;
    private ewz b;

    public ewm()
    {
    }

    static ewz a(ewm ewm1)
    {
        return ewm1.b;
    }

    public final void H()
    {
        super.ab.a();
    }

    public final String I()
    {
        return ViewUri.E.toString();
    }

    public final String a(Context context, Flags flags)
    {
        return "";
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        Y = (GenreQuestionnaire)g().getParcelable("key_genre_questionnaire");
        if (bundle == null)
        {
            dmz.a(fop);
            bundle = j();
            String s = ViewUri.E.toString();
            gcf gcf1 = gcf.a;
            fop.a(bundle, new dnn(s, 0L, 0L, "PAGE", gcf.a()));
        }
    }

    protected final volatile void a(Parcelable parcelable, View view)
    {
        parcelable = (ArtistQuestionnaire)parcelable;
        b.e = parcelable;
        a.a(((ArtistQuestionnaire) (parcelable)).questions);
    }

    public final void a(ArtistQuestionnaire artistquestionnaire)
    {
        super.ab.a(artistquestionnaire);
    }

    public final void a(GenreQuestionnaire genrequestionnaire, ArtistQuestionnaire artistquestionnaire)
    {
        TasteActivity tasteactivity = (TasteActivity)k();
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_genre_questionnaire", (Parcelable)ctz.a(genrequestionnaire));
        bundle.putParcelable("key_artist_questionnaire", (Parcelable)ctz.a(artistquestionnaire));
        genrequestionnaire = new ewo();
        genrequestionnaire.f(bundle);
        tasteactivity.a(genrequestionnaire);
    }

    protected final void a(gaa gaa1)
    {
        gaa1.a(0x7f0802ad, 0x7f0802ac).b(SpotifyIcon.aI, 0x7f0802a1, 0x7f0802a0).b(0x7f0802a1, 0x7f0802a0);
    }

    protected final void a(gnn gnn1)
    {
        gnn1 = b;
        Request request = new Request("GET", String.format("hm://taste-onboarding-view/v0/questionnaire/dense/%s/artists?genres=%s", new Object[] {
            ((ewz) (gnn1)).d.id, gnn1.a()
        }));
        if (((ewz) (gnn1)).c != null)
        {
            ((ewz) (gnn1)).c.unsubscribe();
        }
        gnn1.c = ((ewz) (gnn1)).b.resolve(request).a(((dup)dmz.a(dup)).c()).a(new ewz._cls1(gnn1));
    }

    public final void c()
    {
        super.c();
        b = new ewz(this, new RxTypedResolver(new RxResolver(RxCosmos.getRouter(k())), com/spotify/mobile/android/spotlets/onboarding/taste/model/ArtistQuestionnaire), Y);
    }

    protected final View d(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = k();
        a = new ewp();
        layoutinflater = (RelativeLayout)layoutinflater.inflate(0x7f03009b, viewgroup, false);
        ((TextView)layoutinflater.findViewById(0x7f1102ce)).setText(0x7f080381);
        layoutinflater.findViewById(0x7f1103c6).setVisibility(0);
        viewgroup = (RecyclerView)layoutinflater.findViewById(0x7f110398);
        viewgroup.a(new exc(bundle));
        viewgroup.a(a);
        viewgroup = (Button)layoutinflater.findViewById(0x7f11025e);
        viewgroup.setText(0x7f080382);
        viewgroup.setOnClickListener(new android.view.View.OnClickListener() {

            private ewm a;

            public final void onClick(View view)
            {
                view = ewm.a(a);
                ((ewz) (view)).a.a(((ewz) (view)).d, ((ewz) (view)).e);
            }

            
            {
                a = ewm.this;
                super();
            }
        });
        return layoutinflater;
    }

    public final void d()
    {
        super.d();
        ewz ewz1 = b;
        ewz1.a = null;
        if (ewz1.c != null)
        {
            ewz1.c.unsubscribe();
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.ao;
    }

    public final Verified v_()
    {
        return ViewUri.E;
    }
}

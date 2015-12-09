// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.spotlets.onboarding.taste.model.Answers;
import com.spotify.mobile.android.spotlets.onboarding.taste.model.ArtistQuestionnaire;
import com.spotify.mobile.android.spotlets.onboarding.taste.model.GenreQuestionnaire;
import com.spotify.mobile.android.spotlets.onboarding.taste.model.Question;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.common.AbstractContentFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ewo extends gnp
    implements exf
{

    private exb Y;
    private GenreQuestionnaire a;
    private long aa;
    private Handler ag;
    private ArtistQuestionnaire b;

    public ewo()
    {
        ag = new Handler();
    }

    public final void H()
    {
        super.ab.a();
    }

    public final String I()
    {
        return ViewUri.F.toString();
    }

    public final void J()
    {
        ag.removeCallbacksAndMessages(null);
        ag.postDelayed(new Runnable() {

            private ewo a;

            public final void run()
            {
                a.k().setResult(-1);
                a.k().finish();
            }

            
            {
                a = ewo.this;
                super();
            }
        }, Math.max(0L, 2000L - (System.currentTimeMillis() - aa)));
    }

    public final String a(Context context, Flags flags)
    {
        return "";
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a = (GenreQuestionnaire)g().getParcelable("key_genre_questionnaire");
        b = (ArtistQuestionnaire)g().getParcelable("key_artist_questionnaire");
        if (bundle == null)
        {
            dmz.a(fop);
            bundle = j();
            String s = ViewUri.F.toString();
            gcf gcf1 = gcf.a;
            fop.a(bundle, new dnn(s, 0L, 0L, "PAGE", gcf.a()));
        }
    }

    protected final void a(Parcelable parcelable, View view)
    {
    }

    protected final void a(gaa gaa1)
    {
        gaa1.a(0x7f0802ad, 0x7f0802ac).b(SpotifyIcon.aI, 0x7f0802a1, 0x7f0802a0).b(0x7f0802a1, 0x7f0802a0);
    }

    protected final void a(gnn gnn1)
    {
        gnn1 = Y;
        Object obj = ((exb) (gnn1)).b;
        Object obj1 = ((exb) (gnn1)).c.id;
        ObjectMapper objectmapper = ((exb) (gnn1)).e;
        Object obj2 = new ArrayList();
        Iterator iterator = cuv.c(ImmutableList.a(((exb) (gnn1)).c.questions, ((exb) (gnn1)).d.questions)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Question question = (Question)iterator.next();
            if (question.isSelected)
            {
                ((List) (obj2)).add(new com.spotify.mobile.android.spotlets.onboarding.taste.model.Answers.Answer(question.id, "selected"));
            }
        } while (true);
        try
        {
            byte abyte0[] = objectmapper.writeValueAsBytes(new Answers(((List) (obj2))));
            obj2 = new exb._cls1(gnn1);
            obj1 = new Request("POST", String.format("hm://taste-onboarding-view/v0/answers/dense/%s", new Object[] {
                obj1
            }));
            ((Request) (obj1)).setBody(abyte0);
            ((ewx) (obj)).a.resolve(((Request) (obj1)), new ewx._cls1(((ewx) (obj)).b, ((ewy) (obj2))));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((exb) (gnn1)).a.H();
        }
        while (true) 
        {
            super.ab.a(new Bundle());
            aa = System.currentTimeMillis();
            ag.postDelayed(new Runnable() {

                private ewo a;

                public final void run()
                {
                    a.k().setResult(0);
                    a.k().finish();
                }

            
            {
                a = ewo.this;
                super();
            }
            }, 3000L);
            return;
        }
    }

    public final void c()
    {
        super.c();
        Y = new exb(this, new ewx(super.Z), a, b);
    }

    protected final View d(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03009a, viewgroup, false);
    }

    public final void d()
    {
        super.d();
        Object obj = Y;
        obj.a = null;
        obj = ((exb) (obj)).b;
        ((ewx) (obj)).b.removeCallbacksAndMessages(null);
        ((ewx) (obj)).a.destroy();
        ag.removeCallbacksAndMessages(null);
    }

    protected final void s_()
    {
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.ap;
    }

    public final Verified v_()
    {
        return ViewUri.F;
    }
}

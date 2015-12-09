// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.cosmos.android.RxCosmos;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.RxTypedResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.spotlets.onboarding.taste.TasteActivity;
import com.spotify.mobile.android.spotlets.onboarding.taste.model.GenreQuestionnaire;
import com.spotify.mobile.android.spotlets.onboarding.taste.model.Question;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.common.AbstractContentFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public final class ewn extends gnp
    implements ewv, exe
{

    ImageView Y;
    View a;
    private ewr aa;
    private exa ag;
    private View ah;
    private View ai;
    private TextView aj;
    View b;

    public ewn()
    {
    }

    static View a(ewn ewn1)
    {
        return ewn1.b;
    }

    static exa b(ewn ewn1)
    {
        return ewn1.ag;
    }

    static TextView c(ewn ewn1)
    {
        return ewn1.aj;
    }

    static View d(ewn ewn1)
    {
        return ewn1.ai;
    }

    static View e(ewn ewn1)
    {
        return ((AbstractContentFragment) (ewn1)).ad;
    }

    public final void H()
    {
        super.ab.a();
    }

    public final String I()
    {
        return ViewUri.D.toString();
    }

    public final String a(Context context, Flags flags)
    {
        return "";
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle == null)
        {
            dmz.a(fop);
            bundle = j();
            String s = ViewUri.D.toString();
            gcf gcf1 = gcf.a;
            fop.a(bundle, new dnn(s, 0L, 0L, "PAGE", gcf.a()));
        }
    }

    protected final void a(Parcelable parcelable, View view)
    {
        parcelable = (GenreQuestionnaire)parcelable;
        view = ag;
        view.e = parcelable;
        ((exa) (view)).d.clear();
        Iterator iterator = ((exa) (view)).e.questions.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Question question = (Question)iterator.next();
            if (question.isSelected)
            {
                ((exa) (view)).d.add(question);
            }
        } while (true);
        aa.a(((GenreQuestionnaire) (parcelable)).questions);
    }

    public final void a(GenreQuestionnaire genrequestionnaire)
    {
        TasteActivity tasteactivity = (TasteActivity)k();
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_genre_questionnaire", (Parcelable)ctz.a(genrequestionnaire));
        genrequestionnaire = new ewm();
        genrequestionnaire.f(bundle);
        tasteactivity.d.add(genrequestionnaire);
        tasteactivity.a_().a().a(0x7f1100ff, genrequestionnaire).c();
    }

    public final void a(Question question)
    {
        exa exa1 = ag;
        boolean flag;
        if (question.isSelected)
        {
            exa1.d.add(question);
        } else
        {
            exa1.d.remove(question);
        }
        question = exa1.a;
        if (exa1.d.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        question.d(flag);
    }

    protected final void a(gaa gaa1)
    {
        gaa1.a(0x7f0802ad, 0x7f0802ac).b(SpotifyIcon.aI, 0x7f0802a1, 0x7f0802a0).b(0x7f0802a1, 0x7f0802a0);
    }

    protected final void a(gnn gnn1)
    {
        gnn1 = ag;
        if (((exa) (gnn1)).c != null)
        {
            ((exa) (gnn1)).c.unsubscribe();
        }
        gnn1.c = ((exa) (gnn1)).b.resolve(new Request("GET", "hm://taste-onboarding-view/v0/questionnaire/dense/genres")).a(((dup)dmz.a(dup)).c()).a(new exa._cls1(gnn1));
    }

    public final void b(GenreQuestionnaire genrequestionnaire)
    {
        super.ab.a(genrequestionnaire);
    }

    public final void c()
    {
        super.c();
        ag = new exa(this, new RxTypedResolver(new RxResolver(RxCosmos.getRouter(k())), com/spotify/mobile/android/spotlets/onboarding/taste/model/GenreQuestionnaire));
    }

    protected final View d(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = k();
        Point point = new Point();
        k().getWindowManager().getDefaultDisplay().getSize(point);
        int i = Math.min(point.x, point.y);
        layoutinflater = (FrameLayout)layoutinflater.inflate(0x7f030099, viewgroup, false);
        aj = (TextView)layoutinflater.findViewById(0x7f1102ce);
        aj.setAlpha(0.0F);
        aj.setText(0x7f080383);
        Y = (ImageView)layoutinflater.findViewById(0x7f1103c3);
        Y.setImageDrawable(new dfz(bundle, SpotifyIcon.k));
        int j = aj.getLayoutParams().height;
        a = layoutinflater.findViewById(0x7f1103c1);
        ((android.view.ViewGroup.MarginLayoutParams)a.getLayoutParams()).topMargin = j;
        i = j + i;
        b = layoutinflater.findViewById(0x7f1103c4);
        b.setTranslationY(i);
        b.setClickable(false);
        ai = layoutinflater.findViewById(0x7f1103c5);
        viewgroup = new GestureDetector(j(), new android.view.GestureDetector.SimpleOnGestureListener(i) {

            private int a;
            private ewn b;

            public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
            {
                f = Math.min(a, Math.max(0.0F, ewn.a(b).getTranslationY() - f1));
                motionevent = b;
                f1 = a;
                ((ewn) (motionevent)).b.setTranslationY(f);
                ((ewn) (motionevent)).a.setTranslationY(f - f1);
                return true;
            }

            
            {
                b = ewn.this;
                a = i;
                super();
            }
        });
        ai.setOnTouchListener(new android.view.View.OnTouchListener(viewgroup) {

            private GestureDetector a;
            private ewn b;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                a.onTouchEvent(motionevent);
                if (motionevent.getAction() == 1)
                {
                    view = b;
                    ((ewn) (view)).Y.setVisibility(4);
                    long l = (long)((((ewn) (view)).b.getTranslationY() / (float)((ewn) (view)).a.getMeasuredHeight()) * 500F);
                    ((ewn) (view)).a.animate().setDuration(l).translationY(-((ewn) (view)).a.getHeight());
                    km.q(((ewn) (view)).b).a(l).c(0.0F).a(view. new Runnable() {

                        private ewn a;

                        public final void run()
                        {
                            ewn.c(a).animate().setDuration(200L).alpha(1.0F);
                            ewn.a(a).setClickable(true);
                            ((FrameLayout)ewn.e(a)).removeView(ewn.d(a));
                        }

            
            {
                a = ewn.this;
                super();
            }
                    });
                }
                return true;
            }

            
            {
                b = ewn.this;
                a = gesturedetector;
                super();
            }
        });
        aa = new ewr(this);
        viewgroup = (RecyclerView)layoutinflater.findViewById(0x7f110398);
        viewgroup.a(new exc(bundle));
        viewgroup.a(aa);
        ah = layoutinflater.findViewById(0x7f1103c6);
        viewgroup = (Button)layoutinflater.findViewById(0x7f11025e);
        viewgroup.setText(0x7f080385);
        viewgroup.setOnClickListener(new android.view.View.OnClickListener() {

            private ewn a;

            public final void onClick(View view)
            {
                view = ewn.b(a);
                if (((exa) (view)).e == null)
                {
                    throw new IllegalStateException("GenreQuestionnaire is not loaded.");
                } else
                {
                    ((exa) (view)).a.a(((exa) (view)).e);
                    return;
                }
            }

            
            {
                a = ewn.this;
                super();
            }
        });
        return layoutinflater;
    }

    public final void d()
    {
        super.d();
        exa exa1 = ag;
        exa1.a = null;
        if (exa1.c != null)
        {
            exa1.c.unsubscribe();
        }
        exa1.d.clear();
        exa1.e = null;
    }

    public final void d(boolean flag)
    {
        View view = ah;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.an;
    }

    public final Verified v_()
    {
        return ViewUri.D;
    }
}

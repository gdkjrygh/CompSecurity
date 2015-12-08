// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.database.DataSetObservable;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.photos.stories.StoryEditService;
import com.google.android.apps.photos.stories.StoryElementPickerActivity;
import com.google.android.apps.photos.stories.StoryLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class inl extends omp
    implements android.view.View.OnClickListener, android.view.View.OnSystemUiVisibilityChangeListener, fpl, imx, ioi, ire, irg, irh, iri, iry, mmj, moy, mso, msr, mti, oip
{

    private static final oni e = new oni("debug.stories.layout");
    public boolean a;
    private imw aA;
    private iul aB;
    private final Runnable aC = new inm(this);
    private final Runnable aD = new ino(this);
    private final ca aE = new inp(this);
    private mtj ag;
    private pev ah;
    private StoryLayout ai;
    private irq aj;
    private int ak;
    private pex al;
    private boolean am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private pew aq[];
    private boolean ar;
    private boolean as;
    private TextView at;
    private iui au;
    private ekq av;
    private iuj aw;
    private boolean ax;
    private boolean ay;
    private boolean az;
    public boolean b;
    public boolean c;
    public dhk d;
    private final mot f;
    private mmr g;
    private lzq h;

    public inl()
    {
        f = new mot(this, af, this);
        ak = 0;
        a = false;
        am = false;
        an = false;
        ao = false;
        ap = false;
        new ioh(this, af, this);
        new nuu(af, new inz(this));
        new nuu(af, new inx(this));
        new nuu(af, new iny(this));
        new nuu(af, new ioa(this));
        new nuu(af, new ioc(this));
        new nuu(af, new iob(this));
        new fpk(af, this);
        (new hzg(af)).a(ae);
    }

    private void A()
    {
        am = true;
        if (B() && ax)
        {
            View view = super.R.findViewById(s.bp);
            View view1 = super.R.findViewById(s.bs);
            if (view.getVisibility() != 0)
            {
                view.setVisibility(0);
                view.setTranslationY(view.getHeight());
                view.animate().setInterpolator(new DecelerateInterpolator()).translationY(0.0F).setDuration(350L).setStartDelay(600L).setListener(null).start();
                view1.setVisibility(0);
                view1.setAlpha(0.0F);
                view1.animate().alpha(1.0F).setDuration(350L).setStartDelay(600L).setListener(null).start();
                return;
            }
        }
    }

    private boolean B()
    {
        return ah != null && c(ah.b.b);
    }

    private boolean C()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (ah != null)
        {
            flag = flag1;
            if (b.a(ah.i, false))
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean D()
    {
        return ag.a("GetStoryTask");
    }

    private Point E()
    {
        if (super.R == null)
        {
            return null;
        }
        float f2 = g().getDisplayMetrics().density;
        float f1 = f2;
        if (f2 == 0.0F)
        {
            f1 = 1.0F;
        }
        return new Point((int)((float)super.R.getWidth() / f1 + 0.5F), (int)((float)super.R.getHeight() / f1 + 0.5F));
    }

    private void F()
    {
        hfu.a(null, a(q.bn), false).a(super.B, "dialog_pending");
    }

    private void G()
    {
        Object obj;
        if (super.B != null)
        {
            obj = super.B.a("dialog_pending");
        } else
        {
            obj = null;
        }
        obj = (al)obj;
        if (obj != null)
        {
            ((al) (obj)).a(false);
        }
    }

    private void H()
    {
        if (ite.a(ah) > 5)
        {
            pew pew1 = new pew();
            pew1.a = 1;
            pew1.d = al;
            al = null;
            a(new pew[] {
                pew1
            });
            return;
        } else
        {
            oio.a(null, g().getQuantityString(b.AV, 5, new Object[] {
                Integer.valueOf(5)
            }), a(q.aH), null).a(super.B, "dialog_alert");
            return;
        }
    }

    private Bundle I()
    {
        boolean flag = true;
        int i1 = 1;
        Bundle bundle = new Bundle();
        if (ah != null && ah.g != null && ah.g.b != null)
        {
            bundle.putInt("story_status", 3);
        }
        Object obj = super.q.getString("owner_id");
        if (ah != null)
        {
            if (!B())
            {
                i1 = 2;
            }
            bundle.putInt("story_viewer_relationship", i1);
        } else
        if (obj != null)
        {
            int j1;
            if (c(((String) (obj))))
            {
                j1 = ((flag) ? 1 : 0);
            } else
            {
                j1 = 2;
            }
            bundle.putInt("story_viewer_relationship", j1);
        } else
        {
            bundle.putInt("story_viewer_relationship", 0);
        }
        if (ah != null)
        {
            obj = ai;
            bundle.putDouble("story_fraction_complete", (double)((StoryLayout) (obj)).d.l() / (double)((StoryLayout) (obj)).d.o());
        }
        if (ah != null && ah.c != null)
        {
            bundle.putInt("story_num_moments", b.a(ah.c.e));
        }
        return bundle;
    }

    private void J()
    {
        super.R.postDelayed(new inn(this), 100L);
    }

    static int a(inl inl1, int i1)
    {
        inl1.ak = i1;
        return i1;
    }

    static iui a(inl inl1, iui iui1)
    {
        inl1.au = iui1;
        return iui1;
    }

    static pev a(inl inl1, pev pev1)
    {
        inl1.ah = pev1;
        return pev1;
    }

    private void a(int i1, int j1)
    {
        a(null, i1, j1, 0);
    }

    private void a(View view, boolean flag)
    {
        al = (pex)view.getTag(s.bL);
        int ai1[];
        Object obj;
        Object obj1;
        String s1;
        Object obj2;
        Rect rect1;
        ekp ekp1;
        if (Boolean.valueOf(b.a((Boolean)view.getTag(s.bH), false)).booleanValue())
        {
            obj1 = (String)view.getTag(s.bF);
        } else
        {
            obj1 = null;
        }
        obj2 = (Boolean)view.getTag(s.bI);
        ai1 = new int[2];
        view.getLocationOnScreen(ai1);
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            Rect rect = new Rect();
            O_().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            ai1[1] = ai1[1] - rect.top;
        }
        s1 = (String)view.getTag(s.bQ);
        ekp1 = au.a(s1);
        rect1 = new Rect(ai1[0], ai1[1], ai1[0] + view.getWidth(), ai1[1] + view.getHeight());
        if (ekp1 != null)
        {
            obj = new iub(ekp1, av, rect1, B());
            obj.j = ((Boolean) (obj2));
            boolean flag1;
            if (ekp1.b(hdv) != null && ((hdv)ekp1.b(hdv)).m())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj.f = Boolean.valueOf(flag1);
        } else
        {
            peq peq1 = (peq)ite.a(ah, al, peq);
            obj = euv.a(ite.a(peq1.d));
            boolean flag2 = b.b(peq1.d);
            if (obj == euv.c)
            {
                obj = new iub(new gat(peq1.d.d.c.b.a, g.d()), ((euv) (obj)), peq1.d, rect1, B());
                obj.j = ((Boolean) (obj2));
            } else
            {
                gat gat1 = new gat(peq1.d.d.b.a.a, g.d());
                if (peq1.d.e != null)
                {
                    obj = euv.e;
                } else
                {
                    obj = euv.b;
                }
                if (flag2)
                {
                    obj = new iub(gat1, ((euv) (obj)), peq1.d, rect1, B());
                    obj.j = ((Boolean) (obj2));
                    obj.f = Boolean.valueOf(true);
                } else
                {
                    obj = new iub(gat1, ((euv) (obj)), rect1, B());
                    obj.j = ((Boolean) (obj2));
                }
            }
        }
        obj.h = ((String) (obj1));
        obj.k = Boolean.valueOf(flag);
        obj2 = new Bundle();
        if (((iub) (obj)).h != null)
        {
            ((Bundle) (obj2)).putString("initial_narrative_text", ((iub) (obj)).h);
        }
        p.a(((iub) (obj)).c);
        p.a(((iub) (obj)).e);
        p.a(((iub) (obj)).g);
        obj1 = new itf();
        itf.a(((itf) (obj1)), ((iub) (obj)).e);
        ((itf) (obj1)).f(((Bundle) (obj2)));
        itf.a(((itf) (obj1)), ((iub) (obj)).c);
        obj1.a = ((iub) (obj)).g;
        itf.a(((itf) (obj1)), ((iub) (obj)).a);
        itf.a(((itf) (obj1)), ((iub) (obj)).b);
        itf.b(((itf) (obj1)), ((iub) (obj)).i);
        itf.c(((itf) (obj1)), ((iub) (obj)).k.booleanValue());
        if (((iub) (obj)).j != null)
        {
            itf.d(((itf) (obj1)), ((iub) (obj)).j.booleanValue());
        }
        if (((iub) (obj)).f != null)
        {
            itf.e(((itf) (obj1)), ((iub) (obj)).f.booleanValue());
        }
        itf.a(((itf) (obj1)), ((iub) (obj)).d);
        ((itf) (obj1)).a(this, 9);
        obj = ((am) (obj1)).q;
        obj2 = new Bundle();
        ((Bundle) (obj2)).putString("media_key", s1);
        ((Bundle) (obj)).putBundle("passthrough_data", ((Bundle) (obj2)));
        O_().c().a().a(s.aY, ((am) (obj1)), "whitebox").a("whitebox").b();
        ai.r = true;
        obj = (isb)view.getTag(s.bz);
        ai.a(((isb) (obj)).a().getBytes());
        c = true;
        a(true);
        dfo.a(Boolean.valueOf(false), view);
    }

    static void a(inl inl1)
    {
        inl1.A();
    }

    static void a(inl inl1, String s1, String s2)
    {
        if (!b.w(inl1.ad))
        {
            Bundle bundle = new Bundle();
            bundle.putString("extra_media_key", s1);
            bundle.putString("extra_caption_text", s2);
            inl1 = inl1.h();
            s1 = new nuq();
            s1.a = nup.x;
            s1.c = "OfflineRetryTagEditStoryCaption";
            s1.b = bundle;
            s1.e = true;
            nuo.a(inl1, s1);
            return;
        } else
        {
            Bundle bundle1 = new Bundle();
            Bundle bundle2 = new Bundle();
            bundle2.putString("media_key", s1);
            bundle1.putBundle("passthrough_data", bundle2);
            bundle1.putString("text", s2);
            bundle1.putString("placeholder", inl1.a(q.aV));
            bundle1.putInt("max_length", 2048);
            bundle1.putBoolean("allow_empty", true);
            s1 = new iqf();
            s1.f(bundle1);
            s1.a(inl1, 4);
            s1.a(inl1.O_().c(), "StoryEditTextFragment");
            return;
        }
    }

    static void a(inl inl1, pew apew[])
    {
        inl1.b(apew);
    }

    private void a(String s1, int i1, int j1, int k1)
    {
        String s2 = a(i1);
        Object obj;
        Object obj1;
        if (j1 == 0)
        {
            obj = null;
        } else
        {
            obj = a(j1);
        }
        if (k1 == 0)
        {
            obj1 = null;
        } else
        {
            obj1 = a(k1);
        }
        obj = oio.a(null, s2, ((String) (obj)), ((String) (obj1)));
        if (s1 != null)
        {
            ((oio) (obj)).a(this, 0);
        }
        obj1 = super.B;
        if (s1 == null)
        {
            s1 = "dialog_alert";
        }
        ((oio) (obj)).a(((ay) (obj1)), s1);
    }

    private void a(String s1, String s2)
    {
        (new oce(3)).b(ad);
        F();
        ay = true;
        aB.a = null;
        Intent intent = new Intent(O_(), com/google/android/apps/photos/stories/StoryEditService);
        intent.putExtra("edit_type", "edit_type_photo_caption");
        intent.putExtra("account_id", g.d());
        intent.putExtra("story_ref", aw);
        intent.putExtra("includes_visible_moments", ah.f.a);
        intent.putExtra("includes_hidden_moments", ah.f.b);
        intent.putExtra("story_render_sizes_dp", ite.a(E()));
        intent.putExtra("media_key", s1);
        intent.putExtra("photo_caption", s2);
        intent.putExtra("auth_key", super.q.getString("auth_key"));
        O_().startService(intent);
    }

    private void a(pew apew[])
    {
        aq = apew;
        if (ah == null)
        {
            ar = true;
            return;
        } else
        {
            F();
            b(apew);
            return;
        }
    }

    static boolean a(inl inl1, String s1)
    {
        return inl1.c(s1);
    }

    static boolean a(inl inl1, boolean flag)
    {
        inl1.ar = false;
        return false;
    }

    private static pew[] a(Collection collection, boolean flag)
    {
        pew apew[] = new pew[collection.size()];
        collection = collection.iterator();
        int i1 = 0;
        while (collection.hasNext()) 
        {
            pex pex1 = (pex)collection.next();
            pew pew1 = new pew();
            int j1;
            if (flag)
            {
                j1 = 1;
            } else
            {
                j1 = 2;
            }
            pew1.a = j1;
            pew1.d = pex1;
            apew[i1] = pew1;
            i1++;
        }
        return apew;
    }

    static void b(inl inl1)
    {
        View view = ((am) (inl1)).R.findViewById(s.aX);
        View view1 = ((am) (inl1)).R.findViewById(s.aW);
        if (inl1.ap && inl1.am && view.getVisibility() != 0)
        {
            view.setVisibility(0);
            view.setAlpha(0.0F);
            int i1 = view1.getMinimumHeight() / 2;
            view.setTranslationY(view.getTranslationY() - (float)i1);
            view.animate().alpha(1.0F).translationYBy(i1).setDuration(750L).setListener(null);
        }
    }

    static void b(inl inl1, String s1)
    {
        inl1.b(s1);
    }

    static void b(inl inl1, boolean flag)
    {
        inl1.i(flag);
    }

    private void b(String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("text", s1);
        if (!b.w(ad))
        {
            s1 = h();
            nuq nuq1 = new nuq();
            nuq1.a = nup.y;
            nuq1.c = "OfflineRetryTagEditStoryTitle";
            nuq1.b = bundle;
            nuq1.e = true;
            nuo.a(s1, nuq1);
            return;
        } else
        {
            bundle.putString("placeholder", a(q.bl));
            bundle.putInt("max_length", 200);
            bundle.putBoolean("allow_empty", false);
            s1 = new iqf();
            s1.f(bundle);
            s1.a(this, 3);
            s1.a(O_().c(), "StoryEditTextFragment");
            return;
        }
    }

    private void b(pew apew[])
    {
        (new oce(3)).b(ad);
        apew = new iqa(O_(), g.d(), apew, aw, ah.a.c, ite.a(E()));
        boolean flag = ah.f.b.booleanValue();
        ((iqa) (apew)).a.putExtra("includes_hidden_moments", flag);
        flag = ah.f.a.booleanValue();
        ((iqa) (apew)).a.putExtra("includes_visible_moments", flag);
        apew = ((iqa) (apew)).a;
        aB.a = null;
        O_().startService(apew);
        ay = true;
    }

    static pew[] b(inl inl1, pew apew[])
    {
        inl1.aq = null;
        return null;
    }

    static olm c(inl inl1)
    {
        return inl1.ae;
    }

    static boolean c(inl inl1, boolean flag)
    {
        inl1.am = false;
        return false;
    }

    private boolean c(String s1)
    {
        return s1 != null && s1.equals(g.g().b("gaia_id"));
    }

    static mmr d(inl inl1)
    {
        return inl1.g;
    }

    static iuj e(inl inl1)
    {
        return inl1.aw;
    }

    static Point f(inl inl1)
    {
        return inl1.E();
    }

    static ekq g(inl inl1)
    {
        return inl1.av;
    }

    static StoryLayout h(inl inl1)
    {
        return inl1.ai;
    }

    static olm i(inl inl1)
    {
        return inl1.ae;
    }

    private void i(boolean flag)
    {
        if (!b.w(ad))
        {
            Bundle bundle = new Bundle();
            bundle.putBoolean("extra_finish_activity", flag);
            ay ay1 = h();
            nuq nuq1 = new nuq();
            nuq1.a = nup.r;
            nuq1.c = "OfflineRetryTagSaveStory";
            nuq1.b = bundle;
            nuq1.e = true;
            nuo.a(ay1, nuq1);
            return;
        } else
        {
            az = flag;
            gsm gsm1 = new gsm(av);
            ag.a(gsm1);
            f.a();
            hfu.a(null, a(q.aT), false).a(super.B, "dialog_pending");
            return;
        }
    }

    static irq j(inl inl1)
    {
        return inl1.aj;
    }

    private void j(boolean flag)
    {
        Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            if ((obj = O_()) != null && (obj = ((Activity) (obj)).getWindow()) != null && (obj = ((Window) (obj)).getDecorView()) != null)
            {
                if (flag)
                {
                    ((View) (obj)).setSystemUiVisibility(1796);
                    return;
                } else
                {
                    ((View) (obj)).setSystemUiVisibility(3846);
                    a = true;
                    return;
                }
            }
        }
    }

    static boolean k(inl inl1)
    {
        return inl1.an;
    }

    static boolean l(inl inl1)
    {
        return inl1.am;
    }

    static boolean m(inl inl1)
    {
        return inl1.b;
    }

    static boolean n(inl inl1)
    {
        return inl1.ar;
    }

    static pew[] o(inl inl1)
    {
        return inl1.aq;
    }

    static void p(inl inl1)
    {
        if (!inl1.D())
        {
            inl1.ag.a(new inh(inl1.g.d(), inl1.aw, ((am) (inl1)).q.getString("auth_key"), ((am) (inl1)).q.getString("gpinv"), true, false, ite.a(inl1.E()), inl1.aB));
            inl1.f.a();
        }
    }

    static void q(inl inl1)
    {
        inl1.G();
    }

    static mot r(inl inl1)
    {
        return inl1.f;
    }

    static pev s(inl inl1)
    {
        return inl1.ah;
    }

    static boolean t(inl inl1)
    {
        return inl1.D();
    }

    static pex u(inl inl1)
    {
        return inl1.al;
    }

    static iui v(inl inl1)
    {
        return inl1.au;
    }

    static olq w(inl inl1)
    {
        return inl1.ad;
    }

    private void w()
    {
        if (!b.w(ad))
        {
            ay ay1 = h();
            nuq nuq1 = new nuq();
            nuq1.a = nup.u;
            nuq1.c = "OfflineRetryTagDeleteStory";
            nuq1.e = true;
            nuo.a(ay1, nuq1);
            return;
        } else
        {
            d.a(pwr.f);
            iol iol1 = new iol();
            iol1.a(this, 6);
            iol1.a(O_().c(), "RemoveStoryFragment");
            return;
        }
    }

    private void x()
    {
        Parcelable aparcelable[];
        Object obj2;
        aparcelable = null;
        obj2 = null;
        if (!b.w(ad))
        {
            ay ay1 = h();
            aparcelable = new nuq();
            aparcelable.a = nup.t;
            aparcelable.c = "OfflineRetryTagEditStory";
            aparcelable.e = true;
            nuo.a(ay1, aparcelable);
            return;
        }
        d.a(pxa.l);
        if (ai.d.p() != 0) goto _L2; else goto _L1
_L1:
        Object obj4 = ad;
        int i1 = g.d();
        iuj iuj1 = aw;
        aparcelable = ite.a(E());
        ekq ekq1 = av;
        obj4 = new Intent(((android.content.Context) (obj4)), com/google/android/apps/photos/stories/StoryElementPickerActivity);
        ((Intent) (obj4)).putExtra("account_id", i1);
        ((Intent) (obj4)).putExtra("story_ref", iuj1);
        ((Intent) (obj4)).putExtra("story_render_sizes", aparcelable);
        ((Intent) (obj4)).putExtra("story_media_collection", ekq1);
        if (obj2 != null)
        {
            ((Intent) (obj4)).putExtra("story_element_ref", new mvf(((qlw) (obj2))));
        }
        a(((Intent) (obj4)), 2);
        return;
_L2:
        Object obj;
        Object obj3;
        pfp apfp[];
        int j1;
        int k1;
        int l1;
        if (aj == null)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        irq irq1 = aj;
        k1 = ai.d.p();
        obj3 = new ArrayList();
        obj = obj3;
        if (irq1.e == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = obj3;
        if (irq1.f == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        apfp = irq1.e.h[irq1.f].c;
        l1 = apfp.length;
        j1 = 0;
_L4:
        obj = obj3;
        if (j1 >= l1)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = apfp[j1];
        if (((pfp) (obj)).f != null)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.w("StoryLayoutAdapter", "Layout element with no layout element ref");
_L6:
        j1++;
        if (true) goto _L4; else goto _L3
_L3:
        if (b.a(((pfp) (obj)).e) < k1 || ((pfp) (obj)).c == null || ((pfp) (obj)).c.b == null) goto _L6; else goto _L5
_L5:
        ((List) (obj3)).add(((pfp) (obj)).c.b);
          goto _L6
        obj = null;
        if (obj == null) goto _L1; else goto _L7
_L7:
        obj3 = ((List) (obj)).iterator();
        obj = aparcelable;
_L10:
        obj2 = obj;
        if (!((Iterator) (obj3)).hasNext()) goto _L1; else goto _L8
_L8:
        obj2 = (pex)((Iterator) (obj3)).next();
        Object obj1;
        if (((pex) (obj2)).a == 3)
        {
            if (ite.b((peq)ite.a(ah, ((pex) (obj2)), peq)))
            {
                obj = obj2;
            }
            obj1 = obj;
        } else
        {
            obj1 = obj;
            if (((pex) (obj2)).a == 4)
            {
                obj1 = obj;
                if (ite.a((peh)ite.a(ah, ((pex) (obj2)), peh)))
                {
                    obj1 = obj2;
                }
            }
        }
        obj2 = obj1;
        if (obj1 != null) goto _L1; else goto _L9
_L9:
        obj = obj1;
          goto _L10
    }

    static void x(inl inl1)
    {
        inl1.w();
    }

    private void y()
    {
        if (!b.w(ad))
        {
            ay ay1 = h();
            nuq nuq1 = new nuq();
            nuq1.a = nup.D;
            nuq1.c = "OfflineRetryTagShareStory";
            nuq1.e = true;
            nuo.a(ay1, nuq1);
        } else
        {
            Object obj1 = O_();
            int i1 = g.d();
            Object obj = (ekq)super.q.getParcelable("story_media_collection");
            obj1 = new ifx(((android.content.Context) (obj1)), i1);
            obj1.b = ((ekq) (obj));
            obj = ((ifx) (obj1)).a();
            if (obj != null)
            {
                a(((Intent) (obj)), 5);
                O_().overridePendingTransition(s.aH, 0);
                return;
            }
        }
    }

    static void y(inl inl1)
    {
        inl1.x();
    }

    static void z(inl inl1)
    {
        inl1.y();
    }

    private boolean z()
    {
        return ah == null;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.AI, null);
        ai = (StoryLayout)layoutinflater.findViewById(s.by);
        aj = new irq(ad, g.d(), this, this);
        an = true;
        if (bundle != null)
        {
            an = bundle.getBoolean("story_title_card");
            if (bundle.getBoolean("story_end_card"))
            {
                if (B() && ax)
                {
                    layoutinflater.findViewById(s.bp).setVisibility(0);
                    layoutinflater.findViewById(s.bs).setVisibility(0);
                }
                am = true;
                ap = bundle.getBoolean("story_show_promo");
                if (ap)
                {
                    layoutinflater.findViewById(s.aX).setVisibility(0);
                }
            }
            ao = bundle.getBoolean("has_seen_end_card");
        }
        viewgroup = O_().getWindow().getDecorView();
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            viewgroup.setOnSystemUiVisibilityChangeListener(this);
        }
        ai.a(aj);
        ai.i = this;
        ai.j = this;
        ai.k = this;
        ai.l = this;
        if (c)
        {
            ai.r = true;
            ai.m = new inq(this);
        }
        viewgroup = layoutinflater.findViewById(s.bq);
        b.a(viewgroup, new msm(pxa.n));
        viewgroup.setOnClickListener(new msj(this));
        layoutinflater.findViewById(s.aW).setOnClickListener(this);
        if (!b)
        {
            boolean flag;
            if (!am && !an)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag);
        }
        return layoutinflater;
    }

    public final void a(int i1, int j1, Intent intent)
    {
        i1;
        JVM INSTR tableswitch 1 10: default 56
    //                   1 76
    //                   2 762
    //                   3 885
    //                   4 940
    //                   5 1043
    //                   6 985
    //                   7 1061
    //                   8 1074
    //                   9 1383
    //                   10 57;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        return;
_L11:
        if (j1 == -1)
        {
            i(true);
            return;
        } else
        {
            O_().finish();
            return;
        }
_L2:
        b = false;
        if (a)
        {
            j(false);
        }
        if (at != null)
        {
            at.setSelected(false);
        }
        if (j1 == -1)
        {
            i1 = intent.getIntExtra("stories_edit_type", 0);
            if (i1 == 1)
            {
                ioj ioj1 = (ioj)intent.getParcelableExtra("stories_edit_place");
                pew pew1 = new pew();
                pew1.a = 9;
                pew1.d = al;
                al = null;
                if (!ioj1.a() && !ioj1.b() && !ioj1.c())
                {
                    Log.e("StoryLocationUtils", "Invalid locations");
                    intent = null;
                } else
                {
                    intent = new pet();
                    intent.a = new pry();
                    ((pet) (intent)).a.a = Integer.valueOf(ioj1.b);
                    ((pet) (intent)).a.b = Integer.valueOf(ioj1.c);
                    if (ioj1.a())
                    {
                        intent.b = 1;
                        ((pet) (intent)).a.e = new prz();
                        ((pet) (intent)).a.e.a = ioj1.f;
                        ((pet) (intent)).a.e.b = ioj1.g;
                        ((pet) (intent)).a.d = ioj1.e;
                        ((pet) (intent)).a.c = ioj1.d;
                    } else
                    if (ioj1.c())
                    {
                        intent.b = 5;
                        intent.e = ioj1.h;
                        ((pet) (intent)).a.d = ioj1.e;
                        ((pet) (intent)).a.c = ioj1.d;
                    } else
                    if (ioj1.b())
                    {
                        intent.b = 4;
                        intent.d = new pqb();
                        ((pet) (intent)).d.a = ioj1.i;
                        ((pet) (intent)).d.b = ioj1.j;
                        ((pet) (intent)).d.c = Boolean.valueOf(ioj1.k);
                        ((pet) (intent)).d.d = Boolean.valueOf(ioj1.l);
                    }
                }
                pew1.c = intent;
                if (pew1.c != null)
                {
                    a(new pew[] {
                        pew1
                    });
                    return;
                } else
                {
                    Log.e("HostedStoryFragment", "Invalid place location.");
                    return;
                }
            }
            if (i1 == 2)
            {
                intent = new pew();
                intent.a = 1;
                intent.d = al;
                al = null;
                a(new pew[] {
                    intent
                });
                return;
            }
            if (i1 == 3)
            {
                Object obj = (ioj)intent.getParcelableExtra("stories_edit_place");
                intent = (mdx)ae.a(mdx);
                i1 = ((ioj) (obj)).b;
                j1 = ((ioj) (obj)).c;
                obj = new ArrayList();
                ((List) (obj)).add(new meo((double)i1 / 10000000D - 0.0074999998323619366D, (((double)j1 / 10000000D - 0.0074999998323619366D) + 180D) % 360D - 180D));
                ((List) (obj)).add(new meo((double)i1 / 10000000D + 0.0074999998323619366D, ((double)j1 / 10000000D + 0.0074999998323619366D + 180D) % 360D - 180D));
                intent.a(((meq)ae.a(meq)).a(((List) (obj))));
                intent = intent.a(O_());
                if (intent == null)
                {
                    Toast.makeText(ad, q.aZ, 0).show();
                    return;
                } else
                {
                    a(intent, 8);
                    return;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (j1 == -1)
        {
            Object obj1 = (iqs)intent.getParcelableExtra("element_selection");
            if (obj1 != null)
            {
                intent = ((iqs) (obj1)).a(true);
                obj1 = ((iqs) (obj1)).a(false);
                if (!intent.isEmpty() || !((Collection) (obj1)).isEmpty())
                {
                    intent = a(((Collection) (intent)), true);
                    pew apew[] = a(((Collection) (obj1)), false);
                    ArrayList arraylist = new ArrayList();
                    arraylist.addAll(Arrays.asList(intent));
                    arraylist.addAll(Arrays.asList(apew));
                    a((pew[])arraylist.toArray(new pew[0]));
                    return;
                }
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
        J();
        if (j1 == -1)
        {
            pew pew2 = new pew();
            pew2.a = 5;
            pew2.b = intent.getStringExtra("text");
            a(new pew[] {
                pew2
            });
            return;
        }
        if (j1 == 0)
        {
            return;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        J();
        if (j1 == -1)
        {
            Bundle bundle = intent.getBundleExtra("passthrough_data");
            intent = intent.getStringExtra("text");
            a(bundle.getString("media_key"), ((String) (intent)));
            return;
        }
        if (j1 == 0)
        {
            return;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (j1 == -1)
        {
            intent = new imv(g.d(), aw, super.q.getString("auth_key"), 0);
            ag.b.a(intent, false);
            ag.a(intent);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (j1 == -1)
        {
            as = true;
            f.a();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (!am)
        {
            a(true);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (j1 == -1)
        {
            mdw mdw1 = (mdw)ae.a(mdw);
            mdw1.a(O_(), intent);
            intent = new pew();
            intent.a = 9;
            intent.d = al;
            al = null;
            pet pet1 = new pet();
            if (mdw1 != null)
            {
                pet1.a = new pry();
                pet1.b = 5;
                if (!TextUtils.isEmpty(mdw1.a()))
                {
                    pet1.e = mdw1.a();
                }
                mdw1.d();
                pry pry1 = pet1.a;
                Double double1 = Double.valueOf(mdw1.d().a);
                double d1;
                if (double1 == null)
                {
                    d1 = 0.0D;
                } else
                {
                    d1 = double1.doubleValue();
                }
                pry1.a = Integer.valueOf((int)(d1 * 10000000D));
                pry1 = pet1.a;
                double1 = Double.valueOf(mdw1.d().b);
                if (double1 == null)
                {
                    d1 = 0.0D;
                } else
                {
                    d1 = double1.doubleValue();
                }
                pry1.b = Integer.valueOf((int)(d1 * 10000000D));
                if (!TextUtils.isEmpty(mdw1.b()))
                {
                    pet1.a.d = mdw1.b();
                }
                if (!TextUtils.isEmpty(mdw1.c()))
                {
                    pet1.a.c = mdw1.c();
                }
            }
            intent.c = pet1;
            a(new pew[] {
                intent
            });
            return;
        }
        if (true) goto _L1; else goto _L10
_L10:
        am am1 = O_().c().a("whitebox");
        if (am1 != null)
        {
            O_().c().a().a(am1).b();
        }
        ai.r = false;
        a(true);
        ai.a(null);
        ai.m = null;
        c = false;
        if (intent != null && intent.getBooleanExtra("hide_moment", false))
        {
            H();
            return;
        }
        if (intent != null && intent.getBooleanExtra("set_cover_photo", false))
        {
            String s1 = intent.getBundleExtra("passthrough_data").getString("media_key");
            pew pew3 = new pew();
            pew3.a = 14;
            intent = ah;
            if (((pev) (intent)).c != null && ((pev) (intent)).c.d.length > 0)
            {
                intent = ((pev) (intent)).c.d[0];
            } else
            {
                intent = null;
            }
            if (intent != null && ((qgg) (intent)).b != null)
            {
                intent = ((qgg) (intent)).b.a;
            } else
            {
                intent = null;
            }
            if (intent != null)
            {
                i1 = 2;
            } else
            {
                i1 = 1;
            }
            pew3.e = new String[i1];
            pew3.e[0] = String.valueOf(s1);
            if (intent != null)
            {
                pew3.e[1] = intent;
            }
            a(new pew[] {
                pew3
            });
            return;
        }
        if (intent != null && intent.getStringExtra("changed_narrative") != null)
        {
            a(intent.getBundleExtra("passthrough_data").getString("media_key"), intent.getStringExtra("changed_narrative"));
            return;
        }
        if (true) goto _L1; else goto _L12
_L12:
    }

    public final void a(Activity activity)
    {
        super.a(activity);
        aw = iuj.a(super.q.getString("story_media_key"));
    }

    public final void a(Bundle bundle)
    {
        int i1 = 0;
        super.a(bundle);
        ag.a(this);
        av = (ekq)super.q.getParcelable("story_media_collection");
        k().a(0, null, aE);
        aA.a = this;
        if (bundle == null)
        {
            boolean flag;
            if (av != null)
            {
                bundle = (gsn)av.b(gsn);
            } else
            {
                bundle = null;
            }
            if (bundle != null && bundle.a())
            {
                flag = false;
            } else
            {
                flag = true;
            }
            ax = flag;
            I().putParcelable("device_info", new mvf(msu.a(O_())));
        } else
        {
            ax = bundle.getBoolean("story_saved");
            ak = bundle.getInt("story_load");
            b = bundle.getBoolean("showing_location_picker");
            if (b)
            {
                a = true;
            }
            if (bundle.getParcelable("story_editable_element") != null)
            {
                al = (pex)((mvf)bundle.getParcelable("story_editable_element")).a(new pex());
            }
            if (bundle.getParcelableArray("story_edits") != null)
            {
                Parcelable aparcelable[] = bundle.getParcelableArray("story_edits");
                aq = new pew[aparcelable.length];
                for (; i1 < aparcelable.length; i1++)
                {
                    aq[i1] = (pew)((mvf)aparcelable[i1]).a(new pew());
                }

            }
            ar = bundle.getBoolean("story_pending_edits");
            as = bundle.getBoolean("story_force_shared_badge");
            c = bundle.getBoolean("showing_whitebox");
        }
        bundle = ((mbc)ae.a(mbc)).a();
        h = ((lzs)ae.a(lzs)).a(ad).a(bundle).a();
    }

    public final void a(View view)
    {
        if (view == ai)
        {
            Object obj = k().b(0);
            ((isz)obj).l = ite.a(E());
            if (ak == 1)
            {
                ((ei) (obj)).e();
            }
            a(false, false);
            obj = super.R;
            int i1;
            if (((View) (obj)).getMeasuredWidth() == view.getMeasuredWidth() && ((View) (obj)).getMeasuredHeight() == view.getMeasuredHeight())
            {
                i1 = 0;
            } else
            {
                i1 = 0xff000000;
            }
            ((View) (obj)).setBackgroundColor(i1);
        }
    }

    public final void a(fpj fpj1, Rect rect)
    {
        super.R.findViewById(s.aZ).setPadding(0, 0, fpj1.a.right, fpj1.a.bottom);
    }

    protected final void a(CharSequence charsequence)
    {
        if (z())
        {
            View view = super.R.findViewById(0x1020004);
            view.setVisibility(0);
            TextView textview = (TextView)view.findViewById(s.bb);
            textview.setText(charsequence);
            textview.setVisibility(0);
            view.findViewById(s.ba).setVisibility(8);
        }
    }

    public final void a(String s1)
    {
        if (s1.equals("edit_conflict"))
        {
            s1 = (isz)k().b(0);
            s1.m = true;
            s1.h();
        } else
        if (s1.equals("edit_error"))
        {
            if (aq == null)
            {
                Log.e("HostedStoryFragment", "mEdits is null while attempting to editStory() in onDialogPositiveClick, EDIT_REQUEST_ERROR_TAG branch.");
                return;
            } else
            {
                a(aq);
                return;
            }
        }
    }

    public final void a(String s1, mue mue1, mua mua1)
    {
        mua1.c = false;
        if (!s1.equals("GetStoryTask")) goto _L2; else goto _L1
_L1:
        G();
        f.a();
        if (mue.a(mue1))
        {
            Toast.makeText(ad, q.bc, 0).show();
        }
_L4:
        return;
_L2:
        if (s1.equals("DeleteStoryTask"))
        {
            G();
            if (!mue.a(mue1))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (mue1.a().getInt("delete_type") == 0)
            {
                a(q.be, q.aH);
                return;
            }
        } else
        {
            if (s1.equals("ReportStoryAbuseTask"))
            {
                int i1;
                if (mue.a(mue1))
                {
                    i1 = q.bh;
                } else
                {
                    i1 = q.bi;
                }
                a(i1, q.aH);
                return;
            }
            if (s1.equals("AddPendingMedia"))
            {
                G();
                if (!mue.a(mue1))
                {
                    ax = true;
                } else
                {
                    Toast.makeText(ad, q.bj, 0).show();
                }
                f.a();
                if (az)
                {
                    O_().finish();
                    return;
                }
                if (am)
                {
                    A();
                    return;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
        if (mue1 == null) goto _L4; else goto _L3
_L3:
        O_().finish();
        return;
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void a(moz moz1)
    {
        moz1.a("");
        if (ah == null)
        {
            return;
        }
        if (D())
        {
            moz1.a(s.bg);
        }
        if (b.a(ah.i, false))
        {
            moz1.a(s.bd);
        }
        boolean flag;
        if (as)
        {
            flag = true;
        } else
        {
            hjp hjp1;
            if (av != null)
            {
                hjp1 = (hjp)av.b(hjp);
            } else
            {
                hjp1 = null;
            }
            if (hjp1 == null)
            {
                flag = false;
            } else
            {
                flag = hjp1.a.c;
            }
        }
        if (flag)
        {
            moz1.a(s.bf);
        }
        if (B())
        {
            if (ax)
            {
                moz1.a(s.bk);
                moz1.a(s.bh);
                return;
            } else
            {
                moz1.a(s.bj);
                moz1.b(s.bj).getActionView().setOnClickListener(new inr(this));
                return;
            }
        } else
        {
            moz1.a(s.bi);
            return;
        }
    }

    public final void a(rv rv1)
    {
        rv1.a(true);
        rv1.b(true);
    }

    public final void a(boolean flag)
    {
        Object obj;
        a = flag;
        obj = O_();
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((obj = ((Activity) (obj)).getWindow()) == null || (obj = ((Window) (obj)).getDecorView()) == null) goto _L4; else goto _L3
_L3:
        rv rv1 = ((rz)O_()).e().a();
        if (!flag) goto _L6; else goto _L5
_L5:
        boolean flag1;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            ((View) (obj)).setSystemUiVisibility(3846);
        } else
        {
            ((View) (obj)).setSystemUiVisibility(1);
        }
        if (rv1.f())
        {
            rv1.e();
        }
_L7:
        if (!flag && !c)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (super.R != null)
        {
            obj = super.R.findViewById(s.bC);
            if (flag1)
            {
                ((View) (obj)).setVisibility(0);
                ((View) (obj)).setAlpha(0.0F);
                ((View) (obj)).animate().alpha(1.0F).setDuration(300L).setListener(null).start();
                return;
            } else
            {
                ((View) (obj)).animate().alpha(0.0F).setDuration(300L).setListener(new ins(this, ((View) (obj)))).start();
                return;
            }
        }
_L4:
        if (true) goto _L1; else goto _L6
_L6:
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            if (!c)
            {
                ((View) (obj)).setSystemUiVisibility(1792);
            } else
            {
                ((View) (obj)).setSystemUiVisibility(3844);
            }
        } else
        {
            ((View) (obj)).setSystemUiVisibility(0);
        }
        if (!rv1.f() && !c)
        {
            rv1.d();
        }
          goto _L7
    }

    public final void a(boolean flag, boolean flag1)
    {
        if (ah != null) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if (((Point) (obj = E())).x == 0 || ((Point) (obj)).y == 0) goto _L1; else goto _L3
_L3:
        float f1;
        float f2;
        float f7;
        pey apey[];
        int i1;
        int k1;
        int i2;
        int k2;
        pev pev1 = ah;
        f7 = ((Point) (obj)).x * ((Point) (obj)).y;
        i1 = -1;
        f1 = 1.401298E-45F;
        f2 = 3.402823E+38F;
        k1 = 0;
        apey = pev1.h;
        k2 = apey.length;
        i2 = 0;
_L5:
        if (i2 >= k2)
        {
            break; /* Loop/switch isn't completed */
        }
        pgf pgf1 = apey[i2].d;
        if (pgf1 == null)
        {
            break MISSING_BLOCK_LABEL_1367;
        }
        float f6 = Math.min(1.0F, Math.min((float)((Point) (obj)).x / pgf1.a.floatValue(), (float)((Point) (obj)).y / pgf1.b.floatValue()));
        float f3 = pgf1.a.floatValue();
        f3 = Math.abs(f7 - pgf1.b.floatValue() * f6 * (f3 * f6));
        if (f3 > f2 || f6 < f1)
        {
            break MISSING_BLOCK_LABEL_1367;
        }
        f2 = f6;
        i1 = k1;
        f1 = f3;
_L12:
        k1++;
        i2++;
        float f4 = f2;
        f2 = f1;
        f1 = f4;
        if (true) goto _L5; else goto _L4
_L4:
        i2 = i1;
        if (k1 > 0)
        {
            i2 = i1;
            if (i1 == -1)
            {
                i2 = 0;
            }
        }
        obj = ah.h[i2].d;
        f1 = ((pgf) (obj)).a.floatValue() / ((pgf) (obj)).b.floatValue();
        int l2 = super.R.getWidth();
        k1 = super.R.getHeight();
        i1 = k1;
        if ((float)l2 / f1 < (float)k1)
        {
            i1 = (int)((float)l2 / f1);
        }
        if (!flag && aj.h != null && aj.h.b == i1) goto _L1; else goto _L6
_L6:
        StoryLayout storylayout;
        isa isa2;
        obj = aj;
        if (((irq) (obj)).f != i2 || ((irq) (obj)).g != i1)
        {
            obj.f = i2;
            obj.g = i1;
            obj.h = new isa(((irq) (obj)).e.h[((irq) (obj)).f], ((irq) (obj)).g, ((irq) (obj)).b());
            ((irq) (obj)).j.clear();
            ((irq) (obj)).a(((irq) (obj)).e.h[((irq) (obj)).f].c);
            ((irq) (obj)).b.notifyChanged();
        }
        isa2 = aj.h;
        storylayout = ai;
        storylayout.c = isa2;
        storylayout.setBackgroundColor(storylayout.c.a.a.h.a.intValue());
        if (isa2.a.e != null && isa2.a.e.a != null && isa2.a.e.a.length != 0) goto _L8; else goto _L7
_L7:
        obj = null;
_L10:
        storylayout.a = ((Point [][]) (obj));
        storylayout.e = storylayout.a[isa2.a.e.c.intValue()];
        obj = isa2.a();
        msx amsx[][] = storylayout.c.d;
        storylayout.d = new iot(storylayout.getContext(), ((float [][]) (obj)), storylayout.a, amsx, storylayout.getWidth(), storylayout.getHeight());
        storylayout.d.a(storylayout);
        storylayout.p = new irj(storylayout, storylayout.d, (int)((float)storylayout.getWidth() / 5F));
        if (storylayout.q != -1L)
        {
            storylayout.p.a(storylayout.q);
        }
        storylayout.b();
        if (isa2.b())
        {
            storylayout.f.setColor(storylayout.c.a.b.a.g.a.intValue());
        }
        isa isa1;
        int j1;
        if (storylayout.g != null && !storylayout.g.isEmpty())
        {
            obj = storylayout.b;
            int l1 = ((irq) (obj)).a(storylayout.g);
            Point apoint[][];
            pgd apgd[];
            Object obj1;
            int j2;
            int i3;
            int j3;
            int k3;
            if (l1 != -1)
            {
                pfp apfp[] = ((irq) (obj)).e.h[((irq) (obj)).f].c;
                j1 = l1;
                if (flag1)
                {
                    j1 = l1;
                    if (l1 < apfp.length - 1)
                    {
                        j1 = l1 + 1;
                    }
                }
                j1 = ((irq) (obj)).e.h[((irq) (obj)).f].c[j1].e.intValue();
            } else
            if (((irq) (obj)).e != null && ((irq) (obj)).f != -1 && ((irq) (obj)).e.h[((irq) (obj)).f].c.length > 0)
            {
                j1 = ((irq) (obj)).e.h[((irq) (obj)).f].c[0].e.intValue();
            } else
            {
                j1 = -1;
            }
        } else
        {
            j1 = -1;
        }
        if (j1 == -1)
        {
            break MISSING_BLOCK_LABEL_1241;
        }
        storylayout.d.d(j1);
        obj = new ArrayList();
        for (l1 = 0; l1 <= j1; l1++)
        {
            ((List) (obj)).add(Integer.valueOf(l1));
        }

        break MISSING_BLOCK_LABEL_1215;
_L8:
        apoint = (Point[][])Array.newInstance(android/graphics/Point, new int[] {
            isa2.a.e.a.length, isa2.a.e.a[0].a.length
        });
        apgd = isa2.a.e.a;
        j3 = apgd.length;
        l1 = 0;
        j1 = 0;
_L11:
        obj = apoint;
        if (l1 >= j3) goto _L10; else goto _L9
_L9:
        obj = apgd[l1];
        j2 = 0;
        obj = ((pgd) (obj)).a;
        k3 = obj.length;
        for (i3 = 0; i3 < k3;)
        {
            obj1 = obj[i3];
            apoint[j1][j2] = new Point(Math.round(((pge) (obj1)).a.a.floatValue() * (float)isa2.b), Math.round(((pge) (obj1)).a.b.floatValue() * (float)isa2.b));
            i3++;
            j2++;
        }

        l1++;
        j1++;
          goto _L11
          goto _L10
        storylayout.h.d.addAll(((Collection) (obj)));
        storylayout.d.a(((Collection) (obj)));
        if (storylayout.c.b())
        {
            obj = storylayout.f;
            isa1 = storylayout.c;
            f1 = b.a(isa1.a.b.a.u, 0.0F);
            ((Paint) (obj)).setStrokeWidth(Math.round((float)isa1.b * f1));
        }
        storylayout.n = new iro(storylayout, storylayout.getContext(), storylayout.d.j(), storylayout.getWidth(), storylayout.getHeight());
        storylayout.n.g = storylayout.c.e;
        storylayout.computeScroll();
        return;
        float f5 = f1;
        f1 = f2;
        f2 = f5;
          goto _L12
    }

    public final boolean a(MenuItem menuitem)
    {
        int i1 = menuitem.getItemId();
        if (i1 == s.bd)
        {
            x();
            return true;
        }
        if (i1 == s.bk)
        {
            d.a(pwr.y);
            y();
            return true;
        }
        if (i1 == s.bi)
        {
            (new ioo()).a(h(), "ReportStoryAbuseDialog");
        } else
        if (i1 == s.bh)
        {
            w();
            return true;
        }
        return false;
    }

    public final void aj_()
    {
        super.aj_();
        h.b();
    }

    public final void ak_()
    {
        super.ak_();
        Object obj = ai;
        if (((StoryLayout) (obj)).n != null)
        {
            obj = ((StoryLayout) (obj)).n;
            irp irp1;
            for (Iterator iterator = ((iro) (obj)).e.iterator(); iterator.hasNext(); ((iro) (obj)).d.a(irp1.a))
            {
                irp1 = (irp)iterator.next();
            }

            ((iro) (obj)).e.clear();
            Bitmap bitmap;
            for (Iterator iterator1 = ((iro) (obj)).f.iterator(); iterator1.hasNext(); ((iro) (obj)).d.a(bitmap))
            {
                bitmap = (Bitmap)iterator1.next();
            }

            ((iro) (obj)).f.clear();
        }
    }

    public final void au_()
    {
        super.au_();
        h.a();
    }

    public final void b(int i1)
    {
        if (i1 == 1)
        {
            I().putParcelable("device_info", new mvf(msu.a(O_())));
        }
    }

    public final void b(View view)
    {
        view.setOnCreateContextMenuListener(this);
    }

    public final void b(boolean flag)
    {
        if (!ao)
        {
            ao = true;
        }
        if (flag)
        {
            ai.postDelayed(aC, 1500L);
            ai.postDelayed(aD, 3500L);
            return;
        } else
        {
            ai.postDelayed(aC, 500L);
            ai.postDelayed(aD, 750L);
            return;
        }
    }

    public final boolean b(MenuItem menuitem)
    {
        if (menuitem.getItemId() == s.be)
        {
            H();
            return true;
        } else
        {
            return false;
        }
    }

    public final void c(int i1)
    {
        ioq ioq1 = new ioq(g.d(), i1, aw, ah.a.c);
        ag.b.a(ioq1, false);
        ag.a(ioq1);
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        ag = (mtj)ae.a(mtj);
        ae.a(msr, this);
        g = (mmr)ae.a(mmr);
        d = (dhk)ae.a(dhk);
        ae.a(mmj, this);
        ae.a(mso, this);
        ae.a(dxz);
        aA = (imw)ae.a(imw);
        aB = (iul)ae.a(iul);
    }

    public final void c(View view)
    {
        view.setOnCreateContextMenuListener(null);
    }

    public final void d_(Bundle bundle)
    {
        G();
        int i1 = bundle.getInt("task_result_error_code", -1);
        Exception exception = (Exception)bundle.getSerializable("task_result_exception");
        boolean flag = bundle.getBoolean("edit_succeeded", false);
        bundle = new mue(i1, exception, null);
        bundle.a().putBoolean("edit_succeeded", flag);
        (new oce(4)).b(ad);
        if (!mue.a(bundle))
        {
            aq = null;
            return;
        }
        if (flag)
        {
            aq = null;
            aj.a(null);
            ak = 2;
            a(a(q.bc));
            return;
        }
        int j1 = ((mue) (bundle)).b;
        if (((mue) (bundle)).c != null)
        {
            bundle = ((mue) (bundle)).c.getMessage();
        } else
        {
            bundle = "null";
        }
        bundle = String.valueOf(bundle);
        Log.w("HostedStoryFragment", (new StringBuilder(String.valueOf(bundle).length() + 41)).append("Story edit failed with code ").append(j1).append(": ").append(bundle).toString());
        switch (i1)
        {
        default:
            if (i1 / 100 == 4)
            {
                a(q.aX, q.aH);
                return;
            } else
            {
                a("edit_error", q.aY, q.bm, q.aA);
                return;
            }

        case 409: 
            a("edit_conflict", q.aW, q.aK, 0);
            return;
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("story_saved", ax);
        bundle.putInt("story_load", ak);
        bundle.putBoolean("story_title_card", an);
        bundle.putBoolean("story_end_card", am);
        bundle.putBoolean("has_seen_end_card", ao);
        bundle.putBoolean("story_show_promo", ap);
        bundle.putBoolean("showing_location_picker", b);
        bundle.putBoolean("showing_whitebox", c);
        if (al != null)
        {
            bundle.putParcelable("story_editable_element", new mvf(al));
        }
        if (aq != null)
        {
            Parcelable aparcelable[] = new Parcelable[aq.length];
            for (int i1 = 0; i1 < aq.length; i1++)
            {
                aparcelable[i1] = new mvf(aq[i1]);
            }

            bundle.putParcelableArray("story_edits", aparcelable);
            bundle.putBoolean("story_pending_edits", ar);
        }
        bundle.putBoolean("story_force_shared_badge", as);
    }

    public final void h(boolean flag)
    {
        if (am)
        {
            return;
        }
        if (flag || !a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    public final void l()
    {
        super.l();
        if (ak != 2) goto _L2; else goto _L1
_L1:
        a(a(q.bc));
_L4:
        if (!a && !am && !an)
        {
            a(true);
        }
        if (b)
        {
            j(true);
        }
        return;
_L2:
        if (ah == null && z())
        {
            View view = super.R.findViewById(0x1020004);
            view.setVisibility(0);
            view.findViewById(s.bb).setVisibility(8);
            view.findViewById(s.ba).setVisibility(0);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void n()
    {
        aA.a = null;
        super.n();
    }

    public final void onClick(View view)
    {
        if (view.getTag(s.bE) == null) goto _L2; else goto _L1
_L1:
        b.a((Integer)view.getTag(s.bE));
        JVM INSTR tableswitch 0 3: default 52
    //                   0 72
    //                   1 95
    //                   2 138
    //                   3 168;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        boolean flag = false;
_L8:
        if (flag)
        {
            ai.o.a = true;
        }
        return;
_L4:
        b.b(O_(), (Uri)view.getTag(s.bN));
        flag = true;
          goto _L8
_L5:
        Intent intent = new Intent("android.intent.action.WEB_SEARCH");
        intent.putExtra("query", (String)view.getTag(s.bX));
        O_().startActivity(intent);
        flag = true;
          goto _L8
_L6:
        view = ai;
        ((StoryLayout) (view)).d.a(true);
        ((StoryLayout) (view)).p.a();
        view.invalidate();
        flag = true;
          goto _L8
_L7:
        if (O_().c().a("StoryEditLocationFragment") != null)
        {
            flag = true;
        } else
        if (!b.w(ad))
        {
            view = h();
            nuq nuq1 = new nuq();
            nuq1.a = nup.z;
            nuo.a(view, nuq1);
            flag = true;
        } else
        {
            if (a)
            {
                j(true);
            }
            b = true;
            at = (TextView)view;
            at.setSelected(true);
            ioj aioj[] = (ioj[])view.getTag(s.bU);
            ioj ioj1 = (ioj)view.getTag(s.bK);
            al = (pex)view.getTag(s.bL);
            view = new Bundle();
            view.putParcelableArray("stories_edit_place", aioj);
            view.putParcelable("stories_current_place", ioj1);
            ipu ipu1 = new ipu();
            ipu1.f(view);
            ipu1.a(this, 1);
            view = O_().c().a();
            view.b(s.bu, ipu1, "StoryEditLocationFragment");
            view.a(null);
            view.b();
            flag = true;
        }
          goto _L8
_L2:
        if (view.getId() == s.bB && C())
        {
            view = (TextView)view;
            b.a(view, new msm(pxa.v));
            b(view.getText().toString());
            flag = true;
        } else
        if (view.getId() == s.aM || view.getId() == s.bm && C())
        {
            a((itd)ai.a(((pex)view.getTag(s.bL)).d, itd), true);
            flag = true;
        } else
        if (view.getId() == s.bm || view.getId() == s.bB)
        {
            iue iue1 = new iue();
            Bundle bundle = new Bundle();
            bundle.putString("text", ((TextView)view).getText().toString());
            iue1.f(bundle);
            iue1.a(this, 7);
            iue1.a(O_().c(), "TextDisplayFragment");
            flag = true;
        } else
        if (view.getId() == s.bl)
        {
            a(view, false);
            flag = true;
        } else
        {
            if (view.getId() != s.bq)
            {
                continue; /* Loop/switch isn't completed */
            }
            y();
            flag = true;
        }
          goto _L8
        if (view.getId() != s.aW) goto _L3; else goto _L9
_L9:
        flag = true;
          goto _L8
        if (true) goto _L3; else goto _L10
_L10:
    }

    public final void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
        if (contextmenu.size() == 0)
        {
            contextmenuinfo = O_().getMenuInflater();
            al = (pex)view.getTag(s.bL);
            contextmenuinfo.inflate(c.fn, contextmenu);
            if (!b.a((Boolean)view.getTag(s.bJ), false))
            {
                contextmenu.removeItem(s.be);
                return;
            }
        }
    }

    public final void onSystemUiVisibilityChange(int i1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            if ((i1 & 4) == 0)
            {
                a(false);
            }
        } else
        if ((i1 & 1) == 0)
        {
            a(false);
            return;
        }
    }

    public final msm r()
    {
        if (av != null)
        {
            return b.a(ad, pxa.w, av);
        }
        String s1;
        if (aw != null && aw.a != null)
        {
            s1 = aw.a;
        } else
        {
            s1 = "";
        }
        return new ogu(pxa.w, new String[] {
            s1
        });
    }

    public boolean s()
    {
        if (ay && !ax)
        {
            imq imq1 = new imq();
            imq1.a(this, 10);
            imq1.a(O_().c(), "CheckSaveStoryFragment");
            return true;
        } else
        {
            return false;
        }
    }

    public final void t()
    {
        a(true);
        ai.removeCallbacks(aC);
        View view;
        if (!B() || !ax)
        {
            am = false;
        } else
        {
            View view1 = super.R.findViewById(s.bp);
            View view2 = super.R.findViewById(s.bs);
            a(true);
            view2.animate().setStartDelay(0L).alpha(0.0F).setDuration(250L).setListener(new int(this, view2)).start();
            view1.animate().setInterpolator(new AccelerateInterpolator()).setStartDelay(0L).translationY(view1.getHeight()).setDuration(250L).setListener(new inu(this, view1)).start();
        }
        view = super.R.findViewById(s.aX);
        if (view.getVisibility() == 0)
        {
            view.setVisibility(0);
            view.animate().alpha(0.0F).setDuration(350L).setListener(new inv(this, view));
        }
    }

    public final void u()
    {
        an = true;
        a(false);
    }

    public final void v()
    {
        an = false;
        a(true);
    }

}

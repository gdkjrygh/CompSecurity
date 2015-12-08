// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.b.a;
import android.support.v4.view.b.b;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.b.a.d;
import com.facebook.a.e;
import com.tinder.activities.ActivityCredits;
import com.tinder.activities.ActivityMain;
import com.tinder.adapters.ActivityMainPagerAdapter;
import com.tinder.adapters.x;
import com.tinder.e.ad;
import com.tinder.e.au;
import com.tinder.events.EventLoggedOut;
import com.tinder.events.match.EventMatchesLoaded;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ab;
import com.tinder.managers.g;
import com.tinder.managers.i;
import com.tinder.managers.l;
import com.tinder.model.SparksEvent;
import com.tinder.utils.o;
import com.tinder.utils.v;
import com.tinder.views.CustomDrawerLayout;
import com.tinder.views.MatchListLayout;
import com.tinder.views.ScalableLine;
import com.tinder.views.SkippableViewPager;
import de.greenrobot.event.c;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.tinder.fragments:
//            aj, bd

public final class ac extends Fragment
    implements android.support.v4.view.ViewPager.f, android.view.View.OnClickListener, ad
{
    public static interface a
    {

        public abstract void D();

        public abstract void E();
    }


    public e A;
    public boolean B;
    public com.tinder.adapters.l C;
    public int D;
    com.tinder.managers.g.b E;
    private View F;
    private float G;
    private Hashtable H;
    private int I;
    private int J;
    private int K;
    private float L;
    private int M;
    private ObjectAnimator N;
    private boolean O;
    private boolean P;
    private a Q;
    ScalableLine a;
    public SkippableViewPager b;
    View c;
    ImageButton d;
    ImageButton e;
    FrameLayout f;
    ImageButton g;
    ImageButton h;
    View i;
    ImageButton j;
    RelativeLayout k;
    ImageButton l;
    public ImageButton m;
    EditText n;
    View o;
    View p;
    i q;
    ab r;
    com.tinder.managers.ad s;
    com.tinder.managers.d t;
    g u;
    c v;
    com.tinder.d.a w;
    public View x;
    public View y;
    public boolean z;

    public ac()
    {
        H = new Hashtable(5);
        O = false;
        P = false;
        E = new com.tinder.managers.g.b() {

            final ac a;

            public final void a()
            {
                com.tinder.fragments.ac.a(a);
                a.r.c();
                a.u.a(this);
                a.E = null;
            }

            public final void b()
            {
                com.tinder.utils.v.b("Ping failed, not allowing recs call.");
                a.u.a(this);
                a.E = null;
            }

            public final void c()
            {
                com.tinder.fragments.ac.a(a);
                a.r.c();
                a.u.a(this);
                a.E = null;
            }

            
            {
                a = ac.this;
                super();
            }
        };
    }

    static float a(ac ac1, float f1)
    {
        ac1.L = f1;
        return f1;
    }

    static int a(ac ac1, int i1)
    {
        ac1.I = i1;
        return i1;
    }

    private void a(int i1, float f1)
    {
        if (i1 == 0)
        {
            a.setLength(com.tinder.utils.o.a(f1, 0.0F, I, 1.0F, k.getWidth()), false);
            float f2 = f.getWidth() + K;
            float f3 = com.tinder.utils.o.a(f1, 0.0F, 0.0F, 1.0F, f2);
            (new StringBuilder("diffBtweenIcons=")).append(f2).append(", offset=").append(f3);
            a.setX(f3 + f.getX());
            e.setTranslationX(-com.tinder.utils.o.a(f1, 0.0F, 0.0F, 1.0F, G));
            e.setAlpha(Math.max(0.0F, com.tinder.utils.o.a(f1, 0.0F, 1.0F, 1.0F, 0.0F)));
            f3 = com.tinder.utils.o.a(f1, 0.0F, 0.0F, 1.0F, 1.0F);
            f2 = f3;
            if (f3 < 0.0F)
            {
                f2 = 0.0F;
            }
            g.setAlpha(f2);
            h.setAlpha(1.0F - f2);
            f2 = com.tinder.utils.o.a(f1, 0.1F, 0.02F * (float)J, 1.0F, 0.0F);
            f3 = com.tinder.utils.o.a(f1, 0.1F, -(0.43F * (float)J), 1.0F, 0.0F);
            f.setTranslationX(f2);
            f.setTranslationY(f3);
            f2 = com.tinder.utils.o.a(f1, 0.0F, 0.27F, 1.0F, 1.0F);
            com.tinder.utils.ad.c(f, f2);
            f2 = -com.tinder.utils.o.a(f1, 0.0F, 0.0F, 1.0F, L);
            if (com.tinder.utils.ad.a())
            {
                android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)k.getLayoutParams();
                layoutparams.leftMargin = (int)(f2 + (float)M);
                k.setLayoutParams(layoutparams);
            } else
            {
                k.setTranslationX(f2);
            }
            f1 = Math.max(0.0F, com.tinder.utils.o.a(f1, 0.0F, 1.0F, 1.0F, 0.0F));
            j.setAlpha(f1);
            l.setAlpha(1.0F - f1);
        }
    }

    static boolean a(ac ac1)
    {
        ac1.O = true;
        return true;
    }

    static float b(ac ac1, float f1)
    {
        ac1.G = f1;
        return f1;
    }

    static int b(ac ac1)
    {
        return ac1.J;
    }

    static int b(ac ac1, int i1)
    {
        ac1.J = i1;
        return i1;
    }

    static boolean b(String s1)
    {
        return s1.toLowerCase().contains("don't swipe and drive") || s1.toLowerCase().contains("don't swipe & drive");
    }

    static int c(ac ac1)
    {
        return ac1.K;
    }

    static int c(ac ac1, int i1)
    {
        ac1.K = i1;
        return i1;
    }

    static void c(ac ac1, float f1)
    {
        ac1.a(0, f1);
    }

    private static boolean c(String s1)
    {
        return s1 != null && "fragment recommendations".equals(s1);
    }

    static int d(ac ac1)
    {
        return ac1.I;
    }

    static boolean e(ac ac1)
    {
        return ac1.B;
    }

    static com.tinder.adapters.l f(ac ac1)
    {
        return ac1.C;
    }

    static void g(ac ac1)
    {
        com.tinder.utils.ad.a(ac1.getView().getWindowToken(), ac1.getActivity());
        ac1.startActivity(new Intent(ac1.getActivity(), com/tinder/activities/ActivityCredits));
    }

    static Hashtable h(ac ac1)
    {
        return ac1.H;
    }

    static View i(ac ac1)
    {
        return ac1.y;
    }

    private void i()
    {
        if (com.b.a.d.a(q.a).b(com.tinder.managers.l.a()))
        {
            i.setVisibility(0);
            return;
        } else
        {
            i.setVisibility(4);
            return;
        }
    }

    static View j(ac ac1)
    {
        return ac1.F;
    }

    static View k(ac ac1)
    {
        return ac1.x;
    }

    static boolean l(ac ac1)
    {
        ac1.z = false;
        return false;
    }

    public final void a()
    {
        B = true;
        b.setPagingEnabled(false);
        float f1 = com.tinder.utils.ad.a(m).x - getResources().getDimensionPixelOffset(0x7f0901a1);
        N = ObjectAnimator.ofFloat(m, "translationX", new float[] {
            -f1
        });
        AnimatorSet animatorset = new AnimatorSet();
        H.put(d, Float.valueOf(d.getTranslationX()));
        H.put(f, Float.valueOf(f.getTranslationX()));
        H.put(k, Float.valueOf(k.getTranslationX()));
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(d, "translationX", new float[] {
            (float)(-d.getRight())
        });
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(f, "translationX", new float[] {
            (float)(-f.getRight())
        });
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(k, "translationX", new float[] {
            (float)(-k.getRight())
        });
        a.setVisibility(8);
        o.setVisibility(0);
        animatorset.addListener(new AnimatorListenerAdapter() {

            final ac a;

            public final void onAnimationEnd(Animator animator)
            {
                animator = String.format(a.getString(0x7f0601c5), new Object[] {
                    Integer.valueOf(a.q.j())
                });
                a.n.setHint(animator);
                a.n.setVisibility(0);
                a.p.setVisibility(0);
                a.m.setOnClickListener(new android.view.View.OnClickListener(this) {

                    final _cls10 a;

                    public final void onClick(View view)
                    {
                        a.a.a(true);
                    }

            
            {
                a = _pcls10;
                super();
            }
                });
                com.tinder.utils.ad.a(a.getActivity(), a.n);
            }

            
            {
                a = ac.this;
                super();
            }
        });
        aj aj1 = C.d;
        if (aj1 != null)
        {
            aj1.j = true;
            (new SparksEvent("Match.StartSearch")).put("numMatches", Integer.valueOf(aj1.c.j())).put("numMessages", Long.valueOf(aj1.c.d())).put("numUnreadMessages", Long.valueOf(aj1.c.e())).put("numUnreadMatches", Long.valueOf(aj1.c.h())).fire();
            ObjectAnimator objectanimator3 = ObjectAnimator.ofFloat(aj1.g, "alpha", new float[] {
                0.0F, 1.0F
            });
            objectanimator3.addListener(new aj._cls2(aj1));
            objectanimator3.start();
            aj1.f.hideCounters();
            boolean flag;
            if (aj1.c.i())
            {
                aj1.e();
                aj1.f.scrollToBeginningOfNewMatchList();
                flag = true;
            } else
            {
                flag = false;
            }
            if (aj1.c.f())
            {
                aj1.f.scrollToTopOfMatchList();
            }
            if (flag)
            {
                aj1.f.resetHeaderTranslation();
            }
        }
        animatorset.setDuration(160L);
        animatorset.setInterpolator(new android.support.v4.view.b.a());
        animatorset.playTogether(new Animator[] {
            N, objectanimator, objectanimator1, objectanimator2
        });
        animatorset.start();
    }

    public final void a(int i1)
    {
        if (i1 == 1 || i1 == 2)
        {
            try
            {
                com.tinder.utils.ad.a(b, true);
                return;
            }
            catch (NullPointerException nullpointerexception)
            {
                com.tinder.utils.v.a("Failed to dissalow intercept touch event", nullpointerexception);
            }
            return;
        }
        try
        {
            com.tinder.utils.ad.a(b, false);
            return;
        }
        catch (NullPointerException nullpointerexception1)
        {
            com.tinder.utils.v.a("Null pointer attempting to set disallow intercept touch event on pager", nullpointerexception1);
        }
    }

    public final void a(int i1, float f1, int j1)
    {
        a(i1, f1);
    }

    public final void a(String s1)
    {
        if (isVisible() && !com.tinder.adapters.l.a().equals(s1))
        {
            com.tinder.adapters.l l1 = C;
            if (l1.c == null || !com.tinder.adapters.l.a.equals(s1))
            {
                com.tinder.adapters.l.a = s1;
                l1.notifyDataSetChanged();
                return;
            } else
            {
                (new StringBuilder("not adding ")).append(s1).append(" while ").append(com.tinder.adapters.l.a);
                return;
            }
        } else
        {
            com.tinder.utils.v.b((new StringBuilder("Attempted to change the main fragment when !isVisbile() or already set. ")).append(s1).toString());
            return;
        }
    }

    public final void a(boolean flag)
    {
        if (B)
        {
            B = false;
            if (N != null)
            {
                N.cancel();
            }
            b.setPagingEnabled(true);
            n.setText(null);
            n.setVisibility(8);
            p.setVisibility(8);
            Object obj = C.d;
            AnimatorSet animatorset;
            if (obj != null)
            {
                obj.j = false;
                (new SparksEvent("Match.StopSearch")).put("numMatches", Integer.valueOf(((aj) (obj)).c.j())).put("numMessages", Long.valueOf(((aj) (obj)).c.d())).put("numUnreadMessages", Long.valueOf(((aj) (obj)).c.e())).put("numUnreadMatches", Long.valueOf(((aj) (obj)).c.h())).fire();
                if (((aj) (obj)).g.getVisibility() == 0)
                {
                    ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((aj) (obj)).g, "alpha", new float[] {
                        1.0F, 0.0F
                    });
                    objectanimator.addListener(new aj._cls3(((aj) (obj))));
                    objectanimator.start();
                }
                if (((aj) (obj)).h.getVisibility() == 0)
                {
                    ((aj) (obj)).a(((aj) (obj)).h, new View[] {
                        ((aj) (obj)).f
                    });
                }
                ((aj) (obj)).b();
                ((aj) (obj)).c();
                ((aj) (obj)).f.showCounters();
                if (((aj) (obj)).c.i())
                {
                    ((aj) (obj)).e();
                    ((aj) (obj)).a(((aj) (obj)).c.g());
                    ((aj) (obj)).f.scrollToBeginningOfNewMatchList();
                }
                if (((aj) (obj)).c.f())
                {
                    ((aj) (obj)).e.a(((aj) (obj)).c.c());
                    ((aj) (obj)).f.scrollToTopOfMatchList();
                }
                ((aj) (obj)).f.resetHeaderTranslation();
                ObjectAnimator objectanimator1;
                ObjectAnimator objectanimator2;
                ObjectAnimator objectanimator3;
                if (((aj) (obj)).i && ((aj) (obj)).c.i())
                {
                    ((aj) (obj)).e();
                } else
                {
                    obj.i = false;
                }
                ((aj) (obj)).d();
            }
            obj = ObjectAnimator.ofFloat(d, "translationX", new float[] {
                ((Float)H.get(d)).floatValue()
            });
            objectanimator1 = ObjectAnimator.ofFloat(f, "translationX", new float[] {
                ((Float)H.get(f)).floatValue()
            });
            objectanimator2 = ObjectAnimator.ofFloat(k, "translationX", new float[] {
                ((Float)H.get(k)).floatValue()
            });
            animatorset = new AnimatorSet();
            objectanimator3 = ObjectAnimator.ofFloat(m, "translationX", new float[] {
                m.getTranslationX(), 0.0F
            });
            if (flag)
            {
                animatorset.setDuration(160L);
            } else
            {
                animatorset.setDuration(0L);
            }
            animatorset.addListener(new AnimatorListenerAdapter() {

                final ac a;

                public final void onAnimationEnd(Animator animator)
                {
                    ac.h(a).clear();
                    a.o.setVisibility(8);
                    a.a.setVisibility(0);
                    a.m.setOnClickListener(new android.view.View.OnClickListener(this) {

                        final _cls11 a;

                        public final void onClick(View view)
                        {
                            a.a.a();
                        }

            
            {
                a = _pcls11;
                super();
            }
                    });
                }

            
            {
                a = ac.this;
                super();
            }
            });
            animatorset.setInterpolator(new b());
            animatorset.playTogether(new Animator[] {
                objectanimator3, obj, objectanimator1, objectanimator2
            });
            animatorset.start();
            com.tinder.utils.ad.a(n.getWindowToken(), getActivity());
        }
    }

    public final void animateIconOn(View view)
    {
        view.setVisibility(0);
        view.animate().scaleX(1.0F).scaleY(1.0F).alpha(1.0F).setInterpolator(new OvershootInterpolator()).setListener(new au(view) {

            final View a;
            final ac b;

            public final void onAnimationEnd(Animator animator)
            {
                a.setVisibility(0);
            }

            
            {
                b = ac.this;
                a = view;
                super();
            }
        }).setDuration(250L).start();
    }

    public final void b()
    {
        Fragment fragment = C.c;
        if (s.k) goto _L2; else goto _L1
_L1:
        a("discover off");
_L4:
        return;
_L2:
        if (!s.b)
        {
            break; /* Loop/switch isn't completed */
        }
        s.d(false);
        r.a.clear();
        if (O)
        {
            r.b(true);
        }
        a("fragment recommendations");
        if (fragment != null)
        {
            ((bd)fragment).l();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (s.l)
        {
            s.e(false);
            a("fragment recommendations");
            if (fragment != null)
            {
                ((bd)fragment).l();
            }
            r.a.clear();
            r.b(true);
            return;
        }
        if (!r.e())
        {
            break; /* Loop/switch isn't completed */
        }
        a("fragment recommendations");
        if (fragment != null)
        {
            ((bd)fragment).l();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (!r.a.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        if (r.e)
        {
            a("fragment recommendations");
            if (fragment != null)
            {
                ((bd)fragment).m();
                return;
            }
        } else
        {
            a("fragment recommendations");
            if (O)
            {
                r.c();
            }
            if (fragment != null)
            {
                ((bd)fragment).l();
                return;
            }
        }
        if (true) goto _L4; else goto _L6
_L6:
        a("fragment recommendations");
        if (fragment != null)
        {
            ((bd)fragment).a(false);
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public final void b(int i1)
    {
        if (D == 0)
        {
            com.tinder.managers.a.a("Recs.End");
        }
        D = i1;
        if (i1 > 0)
        {
            Fragment fragment = C.c;
            if (fragment instanceof bd)
            {
                ((bd)fragment).o();
            }
        }
        if (i1 == 0)
        {
            a(false);
            (new Handler()).postDelayed(new Runnable() {

                final ac a;

                public final void run()
                {
                    com.tinder.fragments.ac.c(a, 0.0F);
                }

            
            {
                a = ac.this;
                super();
            }
            }, 200L);
            ImageButton imagebutton = m;
            imagebutton.setVisibility(0);
            imagebutton.animate().scaleX(0.0F).scaleY(0.0F).alpha(0.0F).setInterpolator(new AnticipateInterpolator()).setListener(new au(imagebutton) {

                final View a;
                final ac b;

                public final void onAnimationEnd(Animator animator)
                {
                    a.setVisibility(4);
                }

            
            {
                b = ac.this;
                a = view;
                super();
            }
            }).setDuration(250L).start();
            com.tinder.managers.a.a("Recs.Start");
        } else
        if (i1 == 1)
        {
            w.i();
            (new SparksEvent("Match.List")).put("numMatches", Integer.valueOf(q.j())).put("numMessages", Long.valueOf(q.d())).put("numUnreadMessages", Long.valueOf(q.e())).put("numUnreadMatches", Long.valueOf(q.h())).fire();
            (new Handler()).postDelayed(new Runnable() {

                final ac a;

                public final void run()
                {
                    com.tinder.fragments.ac.c(a, 1.0F);
                }

            
            {
                a = ac.this;
                super();
            }
            }, 200L);
            if (q.a())
            {
                animateIconOn(m);
                return;
            }
        }
    }

    public final void b(boolean flag)
    {
        bd bd1 = (bd)C.c;
        if (bd1 != null)
        {
            bd1.b(flag);
        }
    }

    public final void c()
    {
        if (c(com.tinder.adapters.l.a()))
        {
            b();
        }
    }

    public final void d()
    {
        if (c(com.tinder.adapters.l.a()) && r.a.size() == 0 && C.c != null)
        {
            ((bd)C.c).m();
        }
    }

    public final void e()
    {
    }

    public final void f()
    {
        if (com.tinder.adapters.l.a().equals("fragment recommendations"))
        {
            bd bd1 = (bd)C.c;
            if (bd1 != null)
            {
                bd1.a();
            }
        }
    }

    public final void g()
    {
        t.e();
    }

    public final bd h()
    {
        Fragment fragment = C.c;
        if (fragment instanceof bd)
        {
            return (bd)fragment;
        } else
        {
            return null;
        }
    }

    public final void init(View view)
    {
        M = (int)getResources().getDimension(0x7f090111);
        view.post(new Runnable() {

            final ac a;

            public final void run()
            {
                if (a.isAdded() || a.isInLayout())
                {
                    com.tinder.fragments.ac.a(a, a.e.getWidth());
                    com.tinder.fragments.ac.b(a, a.f.getWidth());
                    com.tinder.fragments.ac.c(a, ManagerApp.c().getResources().getDimensionPixelSize(0x7f0900d6));
                    a.a.setX(a.e.getLeft());
                    com.tinder.fragments.ac.a(a, a.k.getX() - (a.f.getX() + (float)com.tinder.fragments.ac.b(a) + (float)com.tinder.fragments.ac.c(a)));
                    com.tinder.fragments.ac.b(a, (float)com.tinder.fragments.ac.d(a) * 0.7F);
                    com.tinder.fragments.ac.c(a, 0.0F);
                }
            }

            
            {
                a = ac.this;
                super();
            }
        });
        C = new com.tinder.adapters.l(getChildFragmentManager());
        com.tinder.utils.ad.a(b, 400);
        b.setOnPageChangeListener(this);
        b.setAdapter(C);
        b.setOffscreenPageLimit(2);
        view.findViewById(0x7f0e029f).setOnClickListener(this);
        d.setOnClickListener(this);
        j.setOnClickListener(this);
        g.setOnClickListener(this);
        m.setOnClickListener(new android.view.View.OnClickListener() {

            final ac a;

            public final void onClick(View view1)
            {
                a.a();
            }

            
            {
                a = ac.this;
                super();
            }
        });
        p.setOnClickListener(new android.view.View.OnClickListener() {

            final ac a;

            public final void onClick(View view1)
            {
                a.a(true);
            }

            
            {
                a = ac.this;
                super();
            }
        });
        n.addTextChangedListener(new TextWatcher() {

            final ac a;

            public final void afterTextChanged(Editable editable)
            {
                if (!com.tinder.fragments.ac.e(a)) goto _L2; else goto _L1
_L1:
                editable = editable.toString();
                if (!TextUtils.isEmpty(editable)) goto _L4; else goto _L3
_L3:
                editable = ac.f(a).d;
                if (editable == null) goto _L2; else goto _L5
_L5:
                editable.a(null);
                if (!((aj) (editable)).i || !((aj) (editable)).c.i()) goto _L7; else goto _L6
_L6:
                editable.e();
_L2:
                return;
_L7:
                editable.i = false;
                return;
_L4:
                if (com.tinder.fragments.ac.b(editable))
                {
                    com.tinder.fragments.ac.g(a);
                }
                aj aj1 = ac.f(a).d;
                if (aj1 != null)
                {
                    aj1.a(editable);
                    return;
                }
                if (true) goto _L2; else goto _L8
_L8:
            }

            public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            
            {
                a = ac.this;
                super();
            }
        });
    }

    public final void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        com.tinder.utils.o.a(this, i1, j1, intent);
    }

    public final void onAttach(Context context)
    {
        super.onAttach(context);
        ManagerApp.h().a(this);
        if (context instanceof ActivityMain)
        {
            ActivityMain activitymain = (ActivityMain)context;
            if (activitymain.i != null)
            {
                activitymain.i.b = this;
            }
        } else
        {
            com.tinder.utils.v.b((new StringBuilder("FragmentMain is designed to be attached to ActivityMain, however we attached to ")).append(context.getClass()).append(" instead").toString());
        }
        if (context instanceof a)
        {
            Q = (a)context;
            if (P)
            {
                Q.D();
            }
        }
    }

    public final void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131624598 2131624607: default 60
    //                   2131624598 82
    //                   2131624599 61
    //                   2131624600 60
    //                   2131624601 60
    //                   2131624602 101
    //                   2131624603 60
    //                   2131624604 60
    //                   2131624605 91
    //                   2131624606 60
    //                   2131624607 61;
           goto _L1 _L2 _L3 _L1 _L1 _L4 _L1 _L1 _L5 _L1 _L3
_L1:
        return;
_L3:
        if (!B)
        {
            ((ActivityMain)getActivity()).j.openDrawer();
            return;
        }
          goto _L1
_L2:
        b.setCurrentItem(0);
        return;
_L5:
        b.setCurrentItem(1, true);
        return;
_L4:
        b.setCurrentItem(0, true);
        return;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030099, viewgroup, false);
        a = (ScalableLine)layoutinflater.findViewById(0x7f0e02a6);
        b = (SkippableViewPager)layoutinflater.findViewById(0x7f0e02a7);
        c = layoutinflater.findViewById(0x7f0e0295);
        d = (ImageButton)layoutinflater.findViewById(0x7f0e0297);
        e = (ImageButton)layoutinflater.findViewById(0x7f0e0296);
        f = (FrameLayout)layoutinflater.findViewById(0x7f0e0298);
        g = (ImageButton)layoutinflater.findViewById(0x7f0e029a);
        h = (ImageButton)layoutinflater.findViewById(0x7f0e0299);
        i = layoutinflater.findViewById(0x7f0e029e);
        j = (ImageButton)layoutinflater.findViewById(0x7f0e029d);
        k = (RelativeLayout)layoutinflater.findViewById(0x7f0e029b);
        l = (ImageButton)layoutinflater.findViewById(0x7f0e029c);
        m = (ImageButton)layoutinflater.findViewById(0x7f0e02a1);
        n = (EditText)layoutinflater.findViewById(0x7f0e0193);
        o = layoutinflater.findViewById(0x7f0e02a0);
        p = layoutinflater.findViewById(0x7f0e0192);
        F = layoutinflater.findViewById(0x7f0e02a3);
        x = layoutinflater.findViewById(0x7f0e02a4);
        y = layoutinflater.findViewById(0x7f0e02a5);
        return layoutinflater;
    }

    public final void onDetach()
    {
        super.onDetach();
        if (getActivity() instanceof a)
        {
            Q = (a)getActivity();
            Q.E();
        }
    }

    public final void onEvent(EventLoggedOut eventloggedout)
    {
        ManagerApp.h().a(this);
    }

    public final void onEventMainThread(EventMatchesLoaded eventmatchesloaded)
    {
        i();
    }

    public final void onPause()
    {
        b.getCurrentItem();
        JVM INSTR tableswitch 0 0: default 24
    //                   0 105;
           goto _L1 _L2
_L1:
        ab ab1;
        Iterator iterator;
        if (E != null)
        {
            u.a(E);
        }
        v.b(this);
        ab1 = r;
        iterator = ab1.b.iterator();
_L4:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        WeakReference weakreference = (WeakReference)iterator.next();
        if (!com.tinder.utils.o.a(weakreference))
        {
            ab1.b.remove(weakreference);
        } else
        if (weakreference.get() == this)
        {
            ab1.b.remove(weakreference);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((C.c instanceof bd) && !com.tinder.fragments.bd.c)
        {
            com.tinder.managers.a.a("Recs.End");
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        super.onPause();
        return;
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void onResume()
    {
        super.onResume();
        b.getCurrentItem();
        JVM INSTR tableswitch 0 0: default 28
    //                   0 83;
           goto _L1 _L2
_L1:
        Fragment fragment;
        if (u.c())
        {
            O = true;
            E = null;
        } else
        {
            g g1 = u;
            com.tinder.managers.g.b b1 = E;
            if (g1.d == null)
            {
                g1.d = new ArrayList(1);
            }
            g1.d.add(new SoftReference(b1));
        }
        v.a(this, false);
        r.b.add(new WeakReference(this));
        i();
        return;
_L2:
        fragment = C.c;
        if (fragment != null && (fragment instanceof bd) && !com.tinder.fragments.bd.c)
        {
            com.tinder.managers.a.a("Recs.Start");
        }
          goto _L1
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        init(view);
    }

    public final void setUserVisibleHint(boolean flag)
    {
        P = flag;
        super.setUserVisibleHint(flag);
    }

    // Unreferenced inner class com/tinder/fragments/ac$12

/* anonymous class */
    public final class _cls12 extends au
    {

        final ac a;

        public final void onAnimationStart(Animator animator)
        {
            com.tinder.fragments.ac.i(a).setVisibility(0);
        }

            public 
            {
                a = ac.this;
                super();
            }
    }


    // Unreferenced inner class com/tinder/fragments/ac$13

/* anonymous class */
    public final class _cls13 extends com.facebook.a.d
    {

        final ac a;

        public final void onSpringActivate(e e1)
        {
            ac.j(a).setAlpha(1.0F);
            ac.j(a).setVisibility(0);
            ac.k(a).setVisibility(0);
            ac.k(a).setRotation(20F);
        }

        public final void onSpringAtRest(e e1)
        {
            ac.j(a).animate().alpha(0.0F).setDuration(200L).setStartDelay(300L).setListener(new au(this) {

                final _cls13 a;

                public final void onAnimationEnd(Animator animator)
                {
    public final class _cls13 extends com.facebook.a.d
    {
                    ac.j(a.a).setVisibility(4);
                }

            
            {
                a = _pcls13;
                super();
            }
            }).start();
            com.tinder.fragments.ac.l(a);
        }

        public final void onSpringUpdate(e e1)
        {
            float f1 = (float)e1.d.a;
            com.tinder.utils.ad.c(ac.k(a), f1);
            ac.k(a).setRotation(20F - f1 * 20F);
        }

            public 
            {
                a = ac.this;
                super();
            }
    }

}

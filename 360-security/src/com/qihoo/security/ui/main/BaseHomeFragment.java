// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewStub;
import com.nineoldandroids.a.k;
import com.nineoldandroids.b.a;
import com.qihoo.security.recommend.RecommendHelper;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.fragment.BaseFragment;
import com.qihoo.security.ui.fragment.utils.FragmentAction;
import java.util.Observable;

// Referenced classes of package com.qihoo.security.ui.main:
//            c, FragmentsObservable, HomeActivity

public class BaseHomeFragment extends BaseFragment
    implements com.qihoo.security.recommend.a.a, FragmentsObservable.a, c
{

    private c a;
    protected com.qihoo.security.recommend.a b;
    k c;
    k j;
    private com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus k;
    private FragmentsObservable l;
    private View m;
    private View n;
    private float o;

    public BaseHomeFragment()
    {
        k = com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT;
        c = null;
        j = null;
    }

    static View a(BaseHomeFragment basehomefragment)
    {
        return basehomefragment.m;
    }

    private void a(boolean flag)
    {
        if (c != null)
        {
            c.b();
        }
        if (j != null)
        {
            j.b();
        }
        if (flag)
        {
            com.nineoldandroids.b.a.a(n, 0.0F);
            m.setVisibility(0);
            n.setVisibility(8);
            return;
        } else
        {
            com.nineoldandroids.b.a.a(n, 1.0F);
            m.setVisibility(8);
            n.setVisibility(0);
            return;
        }
    }

    private boolean a(boolean flag, boolean flag1, FragmentsObservable.Action action)
    {
        if (m == null || n == null)
        {
            return false;
        }
        if (!(b.a() ^ flag))
        {
            a(flag);
            return false;
        }
        b.a(flag);
        if (!flag1)
        {
            a(flag);
        } else
        {
            b(flag, action);
        }
        return true;
    }

    static View b(BaseHomeFragment basehomefragment)
    {
        return basehomefragment.n;
    }

    private void b(boolean flag, FragmentsObservable.Action action)
    {
        int i1 = 0;
        n.setVisibility(0);
        if (flag)
        {
            m.setVisibility(8);
            c = com.nineoldandroids.a.k.a(m, "translationY", new float[] {
                o, 0.0F
            });
            c.c(600L);
            c.a(new com.nineoldandroids.a.b() {

                final BaseHomeFragment a;

                public void a(com.nineoldandroids.a.a a1)
                {
                    com.qihoo.security.ui.main.BaseHomeFragment.a(a).setVisibility(0);
                }

                public void b(com.nineoldandroids.a.a a1)
                {
                    com.qihoo.security.ui.main.BaseHomeFragment.a(a).clearAnimation();
                }

                public void c(com.nineoldandroids.a.a a1)
                {
                    super.c(a1);
                    com.nineoldandroids.b.a.a(com.qihoo.security.ui.main.BaseHomeFragment.b(a), 1.0F);
                    com.qihoo.security.ui.main.BaseHomeFragment.b(a).setVisibility(0);
                    com.qihoo.security.ui.main.BaseHomeFragment.a(a).setVisibility(8);
                }

            
            {
                a = BaseHomeFragment.this;
                super();
            }
            });
            i1 = 550;
            n.setVisibility(8);
            com.nineoldandroids.b.a.a(n, 0.0F);
        } else
        {
            m.setVisibility(0);
            c = com.nineoldandroids.a.k.a(m, "translationY", new float[] {
                0.0F, o
            });
            c.c(400L);
            c.a(new com.nineoldandroids.a.b(action) {

                final FragmentsObservable.Action a;
                final BaseHomeFragment b;

                public void b(com.nineoldandroids.a.a a1)
                {
                    com.qihoo.security.ui.main.BaseHomeFragment.a(b).setVisibility(8);
                    b.b(a);
                    com.qihoo.security.ui.main.BaseHomeFragment.a(b).clearAnimation();
                }

            
            {
                b = BaseHomeFragment.this;
                a = action;
                super();
            }
            });
            j = com.nineoldandroids.a.k.a(n, "alpha", new float[] {
                0.0F, 1.0F
            });
            j.a(new com.nineoldandroids.a.b() {

                final BaseHomeFragment a;

                public void b(com.nineoldandroids.a.a a1)
                {
                    com.qihoo.security.ui.main.BaseHomeFragment.b(a).clearAnimation();
                }

            
            {
                a = BaseHomeFragment.this;
                super();
            }
            });
            j.c(400L);
            j.a(500);
            j.a();
        }
        c.a(i1);
        c.a();
    }

    public void a()
    {
    }

    protected void a(Intent intent)
    {
    }

    public void a(Bundle bundle)
    {
    }

    public void a(com.nineoldandroids.a.a.a a1)
    {
        if (getActivity() != null && a != null)
        {
            a.a(a1);
        }
    }

    public void a(com.nineoldandroids.a.a.a a1, boolean flag)
    {
        if (getActivity() != null && a != null)
        {
            a.a(a1, flag);
        }
    }

    public void a(com.qihoo.security.recommend.RecommendHelper.RecommendType recommendtype)
    {
        a(true, FragmentsObservable.Action.HideRecmdOther);
        com.qihoo.security.support.b.b(recommendtype.recommendAction.cancel);
    }

    public void a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus, boolean flag)
    {
        k = examstatus;
        if (getActivity() != null && a != null && a(((Fragment) (this))))
        {
            a.a(examstatus, flag);
        }
    }

    public void a(FragmentAction fragmentaction, Bundle bundle)
    {
    }

    public void a(FragmentsObservable.Action action)
    {
        if (l != null)
        {
            l.a(action);
        }
    }

    public void a(FragmentsObservable fragmentsobservable)
    {
        l = fragmentsobservable;
    }

    public void a(FragmentsObservable fragmentsobservable, FragmentsObservable.Action action)
    {
        static class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[FragmentsObservable.Action.values().length];
                try
                {
                    a[FragmentsObservable.Action.HideRecmdClean.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[FragmentsObservable.Action.HideRecmdOther.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[FragmentsObservable.Action.HideRecmdBoost.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[FragmentsObservable.Action.HideRecmdAin.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.qihoo.security.ui.main._cls4.a[action.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            a(true, action);
            break;
        }
    }

    public void a(c.a a1)
    {
        if (getActivity() != null && a != null)
        {
            a.a(a1);
        }
    }

    protected void a(boolean flag, FragmentsObservable.Action action)
    {
        if (e())
        {
            a(false, flag, action);
        }
    }

    public boolean a(Fragment fragment)
    {
        if (getActivity() != null && a != null)
        {
            return a.a(this);
        } else
        {
            return false;
        }
    }

    public void a_(String s)
    {
        if (getActivity() != null && a != null)
        {
            a.a_(s);
        }
    }

    protected void b(Intent intent)
    {
    }

    public void b(com.nineoldandroids.a.a.a a1)
    {
        if (getActivity() != null && a != null)
        {
            a.b(a1);
        }
    }

    public void b(com.nineoldandroids.a.a.a a1, boolean flag)
    {
        if (getActivity() != null && a != null)
        {
            a.b(a1, flag);
        }
    }

    public void b(com.qihoo.security.recommend.RecommendHelper.RecommendType recommendtype)
    {
        a(false, FragmentsObservable.Action.HideRecmdOther);
        if (recommendtype == null)
        {
            return;
        } else
        {
            com.qihoo.security.support.b.b(recommendtype.recommendAction.click);
            Bundle bundle = new Bundle();
            bundle.putInt("index", recommendtype.ordinal());
            e.a(FragmentAction.ChangeTab, bundle);
            return;
        }
    }

    protected void b(FragmentsObservable.Action action)
    {
    }

    public boolean b()
    {
        return false;
    }

    public void b_(int i1)
    {
        if (getActivity() != null && a != null)
        {
            a.b_(i1);
        }
    }

    public void c()
    {
    }

    protected boolean c(com.qihoo.security.recommend.RecommendHelper.RecommendType recommendtype)
    {
        HomeActivity homeactivity = (HomeActivity)getActivity();
        boolean flag;
        if (homeactivity == null || homeactivity.isFinishing())
        {
            flag = false;
        } else
        {
            Object obj = RecommendHelper.a();
            if (((RecommendHelper) (obj)).b() != recommendtype)
            {
                return false;
            }
            ((RecommendHelper) (obj)).d(null);
            recommendtype = ((RecommendHelper) (obj)).c(recommendtype);
            if (recommendtype == null)
            {
                return false;
            }
            Object obj1 = (ViewStub)getView().findViewById(0x7f0b00c1);
            if (obj1 != null)
            {
                m = ((ViewStub) (obj1)).inflate();
                b = new com.qihoo.security.recommend.a();
                b.a(this);
                b.a(m);
                n = getView().findViewById(0x7f0b00bb);
                o = n.getMeasuredHeight();
                obj1 = com.nineoldandroids.b.b.a(m);
                m.setVisibility(8);
                ((com.nineoldandroids.b.b) (obj1)).b(o);
                ((com.nineoldandroids.b.b) (obj1)).a(0L);
                ((com.nineoldandroids.b.b) (obj1)).a();
            }
            ((RecommendHelper) (obj)).a(recommendtype);
            obj = (String)((RecommendHelper) (obj)).a((new StringBuilder()).append("RecommendType.").append(recommendtype.name()).toString());
            b.a(recommendtype, ((String) (obj)));
            boolean flag1 = a(true, true, null);
            flag = flag1;
            if (flag1)
            {
                com.qihoo.security.support.b.b(recommendtype.recommendAction.show);
                return flag1;
            }
        }
        return flag;
    }

    public void c_()
    {
        if (getActivity() != null && a != null)
        {
            a.c_();
        }
    }

    public void d_()
    {
        if (getActivity() != null && a != null)
        {
            a.d_();
        }
    }

    public com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus g()
    {
        if (k == null)
        {
            k = com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT;
        }
        return k;
    }

    public void h()
    {
    }

    public void i()
    {
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            a = (c)activity;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return;
        }
    }

    public void onStop()
    {
        super.onStop();
        a(false, FragmentsObservable.Action.HideRecmdOther);
    }

    public void update(Observable observable, Object obj)
    {
        if ((obj instanceof FragmentsObservable.Action) && (observable instanceof FragmentsObservable))
        {
            a((FragmentsObservable)observable, (FragmentsObservable.Action)obj);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewAnimator;
import com.aviary.android.feather.cds.billing.util.Purchase;
import com.aviary.android.feather.cds.h;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.b.b;
import com.aviary.android.feather.library.services.LocalDataService;
import com.aviary.android.feather.sdk.AviaryMainController;
import com.aviary.android.feather.sdk.FeatherActivity;
import java.util.HashMap;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            b, IAPDialogList, IAPDialogDetail

public class f
    implements IAPDialogList.d, b.a
{
    public static class a
        implements Cloneable
    {

        private long a;
        private com.aviary.android.feather.cds.a.b b;
        private String c;
        private long d;
        private HashMap e;

        static long a(a a1, long l1)
        {
            a1.a = l1;
            return l1;
        }

        static com.aviary.android.feather.cds.a.b a(a a1, com.aviary.android.feather.cds.a.b b1)
        {
            a1.b = b1;
            return b1;
        }

        static String a(a a1, String s)
        {
            a1.c = s;
            return s;
        }

        static HashMap a(a a1)
        {
            return a1.e;
        }

        static long b(a a1)
        {
            return a1.a;
        }

        static long b(a a1, long l1)
        {
            a1.d = l1;
            return l1;
        }

        static com.aviary.android.feather.cds.a.b c(a a1)
        {
            return a1.b;
        }

        static String d(a a1)
        {
            return a1.c;
        }

        public long a()
        {
            return a;
        }

        public long b()
        {
            return d;
        }

        public com.aviary.android.feather.cds.a.b c()
        {
            return b;
        }

        public Object clone()
        {
            a a1 = new a();
            a1.a = a;
            a1.b = b;
            a1.d = d;
            return a1;
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof a)
            {
                obj = (a)obj;
                return ((a) (obj)).a == a && ((a) (obj)).b == b;
            } else
            {
                return super.equals(obj);
            }
        }

        public String toString()
        {
            return (new StringBuilder()).append("IAPUpdater{packType: ").append(b).append(", packId: ").append(a).append(", featuredPackId: ").append(d).append("}").toString();
        }

        public a()
        {
            a = -1L;
            b = null;
            c = null;
            d = -1L;
            e = new HashMap();
        }
    }

    public static class a.a
    {

        a a;

        public a.a a(long l1)
        {
            com.aviary.android.feather.sdk.widget.a.a(a, l1);
            return this;
        }

        public a.a a(com.aviary.android.feather.cds.a.b b1)
        {
            com.aviary.android.feather.sdk.widget.a.a(a, b1);
            return this;
        }

        public a.a a(String s)
        {
            com.aviary.android.feather.sdk.widget.a.a(a, s);
            return this;
        }

        public a.a a(String s, String s1)
        {
            com.aviary.android.feather.sdk.widget.a.a(a).put(s, s1);
            return this;
        }

        public a a()
        {
            return a;
        }

        public a.a b(long l1)
        {
            com.aviary.android.feather.sdk.widget.a.b(a, l1);
            return this;
        }

        public a.a()
        {
            a = new a();
        }
    }

    public static interface b
    {
    }


    static com.aviary.android.feather.common.a.a.c d;
    HashMap a;
    HashMap b;
    com.aviary.android.feather.cds.billing.util.f c;
    b e;
    ViewGroup f;
    a g;
    ViewAnimator h;
    AviaryMainController i;
    com.aviary.android.feather.sdk.widget.b j;
    private LocalDataService k;
    private Runnable l;

    public f(ViewGroup viewgroup)
    {
        a = new HashMap();
        b = new HashMap();
        l = new IAPDialogMain._cls2();
        f = viewgroup;
        f.setTag(this);
        j = new com.aviary.android.feather.sdk.widget.b(this);
        g();
    }

    private static ViewGroup a(ViewGroup viewgroup, int i1)
    {
        ViewGroup viewgroup1 = (ViewGroup)LayoutInflater.from(viewgroup.getContext()).inflate(com.aviary.android.feather.sdk.R.layout.aviary_iap_dialog_container, viewgroup, false);
        viewgroup1.setFocusable(true);
        if (i1 > -1)
        {
            viewgroup.addView(viewgroup1, i1);
            return viewgroup1;
        } else
        {
            viewgroup.addView(viewgroup1);
            return viewgroup1;
        }
    }

    public static f a(com.aviary.android.feather.sdk.AviaryMainController.a a1, a a2)
    {
        d.b("create");
        a1 = a1.e();
        ViewGroup viewgroup = (ViewGroup)a1.findViewById(com.aviary.android.feather.sdk.R.id.aviary_main_iap_dialog_container);
        if (viewgroup == null)
        {
            a1 = new f(a(((ViewGroup) (a1)), -1));
            a1.a(a2, true);
            return a1;
        } else
        {
            a1 = (f)viewgroup.getTag();
            a1.a(a2, false);
            return a1;
        }
    }

    static void a(f f1)
    {
        f1.p();
    }

    static boolean b(f f1)
    {
        return f1.o();
    }

    private void n()
    {
        if (i == null)
        {
            if (f.getContext() instanceof FeatherActivity)
            {
                i = ((FeatherActivity)f.getContext()).A();
            }
            return;
        } else
        {
            d.a((new StringBuilder()).append("controller: ").append(i).toString());
            return;
        }
    }

    private boolean o()
    {
        d.b("removeFromParent");
        if (f != null)
        {
            ViewGroup viewgroup = (ViewGroup)f.getParent();
            if (viewgroup != null)
            {
                viewgroup.removeView(f);
                h();
                return true;
            }
        }
        return false;
    }

    private void p()
    {
        d.b("handleHide");
        if (!j())
        {
            return;
        } else
        {
            Animation animation = AnimationUtils.loadAnimation(f.getContext(), com.aviary.android.feather.sdk.R.anim.aviary_iap_close_animation);
            animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final f a;

                public void onAnimationEnd(Animation animation1)
                {
                    com.aviary.android.feather.sdk.widget.f.b(a);
                }

                public void onAnimationRepeat(Animation animation1)
                {
                }

                public void onAnimationStart(Animation animation1)
                {
                }

            
            {
                a = f.this;
                super();
            }
            });
            f.startAnimation(animation);
            return;
        }
    }

    public void a()
    {
        d.b("onServiceFinished");
        if (j())
        {
            IAPDialogList iapdialoglist = d();
            IAPDialogDetail iapdialogdetail = e();
            if (iapdialoglist != null && iapdialoglist.getData() != null)
            {
                iapdialoglist.b();
            }
            if (iapdialogdetail != null && iapdialogdetail.getData() != null && h.getDisplayedChild() == 1)
            {
                iapdialogdetail.a();
                return;
            }
        }
    }

    void a(int i1, boolean flag)
    {
        int j1 = h.getDisplayedChild();
        if (flag && i1 == 0)
        {
            h.setAnimateFirstView(true);
        }
        if (i1 == 0)
        {
            h.setInAnimation(l(), com.aviary.android.feather.sdk.R.anim.aviary_slide_in_left);
            h.setOutAnimation(l(), com.aviary.android.feather.sdk.R.anim.aviary_slide_out_right);
        } else
        {
            h.setInAnimation(l(), com.aviary.android.feather.sdk.R.anim.aviary_slide_in_right);
            h.setOutAnimation(l(), com.aviary.android.feather.sdk.R.anim.aviary_slide_out_left);
        }
        if (j1 != i1)
        {
            h.setDisplayedChild(i1);
        }
        h.getInAnimation().setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final f a;

            public void onAnimationEnd(Animation animation)
            {
                f.d.b("onAnimationEnd");
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
                f.d.b("onAnimationStart");
            }

            
            {
                a = f.this;
                super();
            }
        });
    }

    public void a(long l1, com.aviary.android.feather.cds.a.b b1, String s)
    {
        d.b((new StringBuilder()).append("onPackSelected: ").append(l1).toString());
        a((new a.a()).a(l1).a(b1).a("shop_details: opened").a("pack", s).a("from", "shop_list").a());
    }

    public void a(long l1, String s, int i1)
    {
        d.c("onDownloadStatusChanged: %d - %s - %d", new Object[] {
            Long.valueOf(l1), s, Integer.valueOf(i1)
        });
        if (j())
        {
            a.put(Long.valueOf(l1), com.aviary.android.feather.cds.h.a.a(i1));
            IAPDialogList iapdialoglist = d();
            IAPDialogDetail iapdialogdetail = e();
            if (iapdialoglist != null && iapdialoglist.getData() != null)
            {
                iapdialoglist.a(l1, s, i1);
            }
            if (iapdialogdetail != null && iapdialogdetail.getData() != null && h.getDisplayedChild() == 1)
            {
                iapdialogdetail.a(l1, s, i1);
                return;
            }
        }
    }

    public void a(long l1, String s, Purchase purchase)
    {
        if (j())
        {
            d.c("onPurchaseSuccess(%d, %s)", new Object[] {
                Long.valueOf(l1), s
            });
            if (c != null)
            {
                c.a(purchase);
            }
            IAPDialogList iapdialoglist = d();
            IAPDialogDetail iapdialogdetail = e();
            if (iapdialoglist != null && iapdialoglist.getData() != null)
            {
                iapdialoglist.a(l1, s, purchase);
            }
            if (iapdialogdetail != null && iapdialogdetail.getData() != null && h.getDisplayedChild() == 1)
            {
                iapdialogdetail.a(l1, s, purchase);
                return;
            }
        }
    }

    public void a(Configuration configuration)
    {
        d.b("onConfigurationChanged");
        if (!j())
        {
            return;
        }
        configuration = (ViewGroup)f.getParent();
        if (configuration != null)
        {
            int i1 = configuration.indexOfChild(f);
            o();
            f = a(((ViewGroup) (configuration)), i1);
            configuration = (ViewGroup)f.findViewById(com.aviary.android.feather.sdk.R.id.aviary_main_iap_dialog);
            if (configuration != null)
            {
                configuration.setLayoutAnimation(null);
            }
            g();
            a((a)g.clone());
            return;
        } else
        {
            d.d("parent is null");
            return;
        }
    }

    public void a(a a1)
    {
        a(a1, false);
    }

    public void a(a a1, boolean flag)
    {
        d.b("update");
        if (a1 != null && j())
        {
            g = a1;
            n();
            if (com.aviary.android.feather.sdk.widget.a.b(a1) < 0L && a.c(a1) == null)
            {
                d.d("invalid updater instance");
                return;
            }
            h.getDisplayedChild();
            int i1;
            if (a1.a() < 0L)
            {
                i1 = 0;
            } else
            {
                i1 = 1;
            }
            if (a.d(g) != null)
            {
                if (com.aviary.android.feather.sdk.widget.a.a(g) != null)
                {
                    b().h().a(a.d(g), com.aviary.android.feather.sdk.widget.a.a(g));
                } else
                {
                    b().h().a(a.d(g));
                }
            }
            a(i1, flag);
            if (i1 == 0)
            {
                IAPDialogList iapdialoglist = (IAPDialogList)h.getChildAt(i1);
                a a2 = iapdialoglist.getData();
                if (a1 != null && !a1.equals(a2))
                {
                    iapdialoglist.a(a1, this);
                }
                iapdialoglist.setOnPackSelectedListener(this);
                return;
            }
            IAPDialogDetail iapdialogdetail = (IAPDialogDetail)h.getChildAt(i1);
            a a3 = iapdialogdetail.getData();
            if (a1 != null && !a1.equals(a3))
            {
                iapdialogdetail.a(a1, this);
                return;
            }
        }
    }

    public void a(b b1)
    {
        e = b1;
    }

    void a(String s)
    {
        String s1 = (String)k.a("extra-api-key-secret", "");
        String s2 = (String)k.a("extra-billing-public-key", "");
        s = com.aviary.android.feather.common.a.a(l(), s1, s2, s);
        l().startActivity(s);
    }

    public void a(String s, int i1)
    {
        d.c("onSubscriptionPurchased: %s - %d", new Object[] {
            s, Integer.valueOf(i1)
        });
        if (j())
        {
            IAPDialogList iapdialoglist = d();
            IAPDialogDetail iapdialogdetail = e();
            if (iapdialoglist != null && iapdialoglist.getData() != null)
            {
                iapdialoglist.a(s, i1);
            }
            if (iapdialogdetail != null && iapdialogdetail.getData() != null && h.getDisplayedChild() == 1)
            {
                iapdialogdetail.a(s, i1);
                return;
            }
        }
    }

    public void a(boolean flag)
    {
        d.b((new StringBuilder()).append("dismiss, animate: ").append(flag).toString());
        d().setOnPackSelectedListener(null);
        j.b();
        j.c();
        a(((b) (null)));
        if (flag)
        {
            i();
            return;
        } else
        {
            o();
            return;
        }
    }

    public AviaryMainController b()
    {
        return i;
    }

    public void b(long l1, String s, int i1)
    {
        d.c("onPackInstalled: %d - %s - %d", new Object[] {
            Long.valueOf(l1), s, Integer.valueOf(i1)
        });
        if (j()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a.remove(Long.valueOf(l1));
        if (i1 != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        b.put(Long.valueOf(l1), com.aviary.android.feather.cds.h.a.e);
_L4:
        IAPDialogList iapdialoglist = d();
        IAPDialogDetail iapdialogdetail = e();
        if (iapdialoglist != null && iapdialoglist.getData() != null)
        {
            iapdialoglist.b(l1, s, i1);
        }
        if (iapdialogdetail != null && iapdialogdetail.getData() != null && h.getDisplayedChild() == 1)
        {
            iapdialogdetail.b(l1, s, i1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        b.remove(Long.valueOf(l1));
        com.aviary.android.feather.cds.h.a a1 = com.aviary.android.feather.cds.h.a(l(), com.aviary.android.feather.cds.h.c(l(), l1));
        if (a1 != com.aviary.android.feather.cds.h.a.g)
        {
            b.put(Long.valueOf(l1), a1);
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public boolean c()
    {
        if (h.getDisplayedChild() == 0)
        {
            return false;
        }
        IAPDialogList iapdialoglist = (IAPDialogList)h.getChildAt(0);
        if (iapdialoglist != null && iapdialoglist.getData() != null)
        {
            a(0, false);
            return true;
        } else
        {
            return false;
        }
    }

    IAPDialogList d()
    {
        return (IAPDialogList)h.getChildAt(0);
    }

    IAPDialogDetail e()
    {
        if (h.getChildCount() > 0)
        {
            return (IAPDialogDetail)h.getChildAt(1);
        } else
        {
            return null;
        }
    }

    public a f()
    {
        return g;
    }

    protected void g()
    {
        d.b("onAttachedToWindow");
        h = (ViewAnimator)f.findViewById(com.aviary.android.feather.sdk.R.id.aviary_view_animator);
        k = (LocalDataService)((FeatherActivity)l()).A().a(com/aviary/android/feather/library/services/LocalDataService);
        j.a((FeatherActivity)l());
        j.a();
    }

    protected void h()
    {
        d.b("onDetachedFromWindow");
    }

    protected void i()
    {
        d.b("hide");
        if (!j())
        {
            return;
        } else
        {
            f.post(l);
            return;
        }
    }

    public boolean j()
    {
        return f != null && f.getWindowToken() != null;
    }

    public ViewParent k()
    {
        if (f != null)
        {
            return f.getParent();
        } else
        {
            return null;
        }
    }

    public Context l()
    {
        if (f != null)
        {
            return f.getContext();
        } else
        {
            return null;
        }
    }

    public com.aviary.android.feather.sdk.widget.b m()
    {
        return j;
    }

    static 
    {
        d = com.aviary.android.feather.common.a.a.a("IAPDialogMain", com.aviary.android.feather.common.a.a.d.a);
    }

    // Unreferenced inner class com/aviary/android/feather/sdk/widget/IAPDialogMain$2

/* anonymous class */
    class IAPDialogMain._cls2
        implements Runnable
    {

        final f a;

        public void run()
        {
            com.aviary.android.feather.sdk.widget.f.a(a);
        }

            
            {
                a = f.this;
                super();
            }
    }

}

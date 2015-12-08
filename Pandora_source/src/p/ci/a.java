// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ci;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.pandora.android.artist.FeaturedTrackLayout;
import com.pandora.android.provider.b;
import com.pandora.android.util.ThumbImageButton;
import com.pandora.android.util.ae;
import com.pandora.android.util.s;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import com.pandora.radio.data.c;
import p.al.f;
import p.an.k;
import p.cn.e;
import p.l.d;
import p.l.g;
import p.l.i;
import p.l.j;

public class p.ci.a extends BaseAdapter
    implements com.pandora.android.view.AlbumArtsGallery.a
{
    static class a
    {

        public boolean a;
        public View b;
        public ThumbImageButton c;
        public ThumbImageButton d;
        public View e;
        public ImageView f;
        public FeaturedTrackLayout g;
        public String h;
        public aa i;
        public View j;
        public TextView k;
        public TextView l;

        a()
        {
        }
    }


    protected static String a;
    protected static String b;
    private LayoutInflater c;
    private final Context d;
    private e e;
    private int f;
    private ViewPropertyAnimator g;
    private final boolean h;

    public p.ci.a(Context context, boolean flag)
    {
        e = p.cn.e.a();
        d = context;
        c = (LayoutInflater)d.getSystemService("layout_inflater");
        h = flag;
        a = d.getString(0x7f0800c8);
        b = d.getString(0x7f0800c9);
        notifyDataSetInvalidated();
    }

    static ViewPropertyAnimator a(p.ci.a a1)
    {
        return a1.g;
    }

    static ViewPropertyAnimator a(p.ci.a a1, ViewPropertyAnimator viewpropertyanimator)
    {
        a1.g = viewpropertyanimator;
        return viewpropertyanimator;
    }

    private void a(View view, boolean flag)
    {
        byte byte0 = 8;
        if (view.getVisibility() == 8 && flag)
        {
            view.setAlpha(0.0F);
        }
        if (flag)
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
        if (flag)
        {
            view.animate().alpha(1.0F).setStartDelay(0L).setListener(new android.animation.Animator.AnimatorListener(view) {

                final View a;
                final p.ci.a b;

                public void onAnimationCancel(Animator animator)
                {
                }

                public void onAnimationEnd(Animator animator)
                {
                    if (p.ci.a.a(b) != null)
                    {
                        p.ci.a.a(b).cancel();
                    }
                    p.ci.a.a(b, a.animate().alpha(0.7F).setStartDelay(4000L));
                }

                public void onAnimationRepeat(Animator animator)
                {
                }

                public void onAnimationStart(Animator animator)
                {
                }

            
            {
                b = p.ci.a.this;
                a = view;
                super();
            }
            }).start();
            return;
        } else
        {
            view.clearAnimation();
            view.setAlpha(1.0F);
            return;
        }
    }

    private void a(aa aa1, ImageView imageview, FeaturedTrackLayout featuredtracklayout, boolean flag)
    {
        if (featuredtracklayout != null)
        {
            featuredtracklayout.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener(featuredtracklayout, imageview, flag) {

                final FeaturedTrackLayout a;
                final ImageView b;
                final boolean c;
                final p.ci.a d;

                public void onGlobalLayout()
                {
                    if (android.os.Build.VERSION.SDK_INT < 16)
                    {
                        a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    } else
                    {
                        a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                    a.a(b, c);
                }

            
            {
                d = p.ci.a.this;
                a = featuredtracklayout;
                b = imageview;
                c = flag;
                super();
            }
            });
        }
    }

    private void a(aa aa1, a a1, View view)
    {
        a1.j = view.findViewById(0x7f1000d1);
        a1.k = (TextView)view.findViewById(0x7f1000da);
        a1.l = (TextView)view.findViewById(0x7f1000db);
        if (a1.j != null)
        {
            boolean flag;
            int k;
            if (aa1.l() == ac.c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view = a1.j;
            if (flag)
            {
                k = 0;
            } else
            {
                k = 8;
            }
            view.setVisibility(k);
            view = a1.k;
            if (flag)
            {
                k = 0;
            } else
            {
                k = 8;
            }
            view.setVisibility(k);
            a1.l.setVisibility(8);
            if (flag)
            {
                aa1 = (c)aa1;
                a1.k.setText(aa1.t());
                if (aa1.r_())
                {
                    a1.l.setText(aa1.d());
                    a1.l.setVisibility(0);
                    a1.l.setOnClickListener(new android.view.View.OnClickListener(aa1) {

                        final c a;
                        final p.ci.a b;

                        public void onClick(View view1)
                        {
                            if (view1.getId() == 0x7f1000db && a.r_())
                            {
                                com.pandora.android.artist.a.a(a, com.pandora.android.artist.a.e);
                                com.pandora.android.artist.a.b(b.b(), a);
                            }
                        }

            
            {
                b = p.ci.a.this;
                a = c1;
                super();
            }
                    });
                    return;
                }
            }
        }
    }

    static void a(p.ci.a a1, aa aa1, ImageView imageview, FeaturedTrackLayout featuredtracklayout, boolean flag)
    {
        a1.a(aa1, imageview, featuredtracklayout, flag);
    }

    LayoutInflater a()
    {
        return c;
    }

    public void a(int k)
    {
        f = k;
    }

    public void a(int k, View view, boolean flag)
    {
        boolean flag1 = false;
        view = (a)view.getTag();
        View view1 = ((a) (view)).e;
        if (h)
        {
            boolean flag2;
            if (!b(k) && ((a) (view)).a && f == k)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            ((a) (view)).e.setBackgroundResource(0x7f02006b);
            if (flag)
            {
                a(view1, flag2);
                return;
            }
            if (flag2)
            {
                k = ((flag1) ? 1 : 0);
            } else
            {
                k = 8;
            }
            view1.setVisibility(k);
            return;
        }
        if (f != k)
        {
            ((a) (view)).b.setBackgroundResource(0x7f0b0089);
            return;
        } else
        {
            ((a) (view)).b.setBackgroundResource(0x7f0b00d2);
            return;
        }
    }

    protected void a(View view)
    {
        view = (a)view.getTag();
        ((a) (view)).d.setOnClickListener(new android.view.View.OnClickListener(view) {

            final a a;
            final p.ci.a b;

            public void onClick(View view1)
            {
                ae.a(a.i);
            }

            
            {
                b = p.ci.a.this;
                a = a2;
                super();
            }
        });
        ((a) (view)).c.setOnClickListener(new android.view.View.OnClickListener(view) {

            final a a;
            final p.ci.a b;

            public void onClick(View view1)
            {
                ae.b(a.i);
            }

            
            {
                b = p.ci.a.this;
                a = a2;
                super();
            }
        });
    }

    public void a(View view, int k)
    {
        view = (a)view.getTag();
        ae.a(k, ((a) (view)).c, ((a) (view)).d, ((a) (view)).i);
    }

    public void a(View view, aa aa1)
    {
        a(view, aa1.E());
        boolean flag;
        if (!aa1.B())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = (a)view.getTag();
        ((a) (view)).d.setPreventFeedback(flag);
        ((a) (view)).c.setPreventFeedback(flag);
        if (!flag)
        {
            ((a) (view)).d.setEnabled(true);
            ((a) (view)).c.setEnabled(true);
        }
        view.a = aa1.B();
    }

    protected void a(aa aa1, a a1)
    {
        if (s.a(aa1.v()))
        {
            a1.f.setContentDescription(b);
            return;
        } else
        {
            a1.f.setContentDescription(a);
            return;
        }
    }

    Context b()
    {
        return d;
    }

    public boolean b(int k)
    {
        return k == getCount() - 1;
    }

    int c()
    {
        return f;
    }

    public void d()
    {
        if (g != null)
        {
            g.cancel();
        }
    }

    public int getCount()
    {
        return e.d();
    }

    public Object getItem(int k)
    {
        return Integer.valueOf(k);
    }

    public long getItemId(int k)
    {
        return (long)k;
    }

    public View getView(int k, View view, ViewGroup viewgroup)
    {
        Object obj;
        aa aa1;
        int l;
        if (view == null)
        {
            view = c.inflate(0x7f040058, viewgroup, false);
            viewgroup = new a();
            viewgroup.f = (ImageView)view.findViewById(0x7f100180);
            viewgroup.b = view.findViewById(0x7f100181);
            viewgroup.g = (FeaturedTrackLayout)view.findViewById(0x7f10016d);
            viewgroup.e = view.findViewById(0x7f100182);
            viewgroup.d = (ThumbImageButton)view.findViewById(0x7f100184);
            viewgroup.c = (ThumbImageButton)view.findViewById(0x7f100183);
            view.setTag(viewgroup);
            a(view);
        } else
        {
            viewgroup = (a)view.getTag();
        }
        aa1 = e.a(k);
        viewgroup.i = aa1;
        viewgroup.h = e.b(aa1.w(), k);
        obj = ((a) (viewgroup)).g;
        if (aa1.W())
        {
            l = 0;
        } else
        {
            l = 4;
        }
        ((FeaturedTrackLayout) (obj)).setVisibility(l);
        view.setTag(0x7f100029, aa1);
        obj = b.a.b().d().s();
        if (obj != null && aa1.w().equals(((aa) (obj)).w()))
        {
            obj = i.b;
        } else
        {
            obj = i.c;
        }
        obj = p.l.g.b(d).a(aa1.v()).a(((i) (obj))).b().a(p.s.b.a).a(0x7f0200e9);
        if (aa1.W())
        {
            ((p.l.c) (obj)).a(new f(viewgroup) {

                final a a;
                final p.ci.a b;

                public volatile boolean a(Exception exception, Object obj1, k k1, boolean flag)
                {
                    return a(exception, (String)obj1, k1, flag);
                }

                public boolean a(Exception exception, String s1, k k1, boolean flag)
                {
                    p.ci.a.a(b, a.i, a.f, a.g, true);
                    return false;
                }

                public volatile boolean a(Object obj1, Object obj2, k k1, boolean flag, boolean flag1)
                {
                    return a((p.ad.b)obj1, (String)obj2, k1, flag, flag1);
                }

                public boolean a(p.ad.b b1, String s1, k k1, boolean flag, boolean flag1)
                {
                    p.ci.a.a(b, a.i, a.f, a.g, false);
                    return false;
                }

            
            {
                b = p.ci.a.this;
                a = a2;
                super();
            }
            });
        }
        ((p.l.c) (obj)).a(((a) (viewgroup)).f);
        a(aa1, viewgroup);
        a(aa1, viewgroup, view);
        a(k, view, false);
        a(view, aa1);
        a(view, aa1.E());
        return view;
    }
}

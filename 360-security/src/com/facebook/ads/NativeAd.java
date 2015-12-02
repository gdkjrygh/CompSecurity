// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.support.v4.content.g;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.adapters.k;
import com.facebook.ads.internal.adapters.t;
import com.facebook.ads.internal.adapters.u;
import com.facebook.ads.internal.c;
import com.facebook.ads.internal.e;
import com.facebook.ads.internal.f.i;
import com.facebook.ads.internal.h;
import com.facebook.ads.internal.util.l;
import com.facebook.ads.internal.util.m;
import com.facebook.ads.internal.util.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

// Referenced classes of package com.facebook.ads:
//            a, d, f

public class NativeAd
    implements com.facebook.ads.a
{
    public static final class MediaCacheFlag extends Enum
    {

        public static final EnumSet ALL = EnumSet.allOf(com/facebook/ads/NativeAd$MediaCacheFlag);
        public static final MediaCacheFlag ICON;
        public static final MediaCacheFlag IMAGE;
        public static final MediaCacheFlag NONE;
        private static final MediaCacheFlag b[];
        private final long a;

        public static MediaCacheFlag valueOf(String s1)
        {
            return (MediaCacheFlag)Enum.valueOf(com/facebook/ads/NativeAd$MediaCacheFlag, s1);
        }

        public static MediaCacheFlag[] values()
        {
            return (MediaCacheFlag[])b.clone();
        }

        public long getCacheFlagValue()
        {
            return a;
        }

        static 
        {
            NONE = new MediaCacheFlag("NONE", 0, 0L);
            ICON = new MediaCacheFlag("ICON", 1, 1L);
            IMAGE = new MediaCacheFlag("IMAGE", 2, 2L);
            b = (new MediaCacheFlag[] {
                NONE, ICON, IMAGE
            });
        }

        private MediaCacheFlag(String s1, int i1, long l1)
        {
            super(s1, i1);
            a = l1;
        }
    }

    public static class a
    {

        private final String a;
        private final int b;
        private final int c;

        public static a a(JSONObject jsonobject)
        {
            String s1;
            if (jsonobject != null)
            {
                if ((s1 = jsonobject.optString("url")) != null)
                {
                    return new a(s1, jsonobject.optInt("width", 0), jsonobject.optInt("height", 0));
                }
            }
            return null;
        }

        public String a()
        {
            return a;
        }

        public int b()
        {
            return b;
        }

        public int c()
        {
            return c;
        }

        private a(String s1, int i1, int j1)
        {
            a = s1;
            b = i1;
            c = j1;
        }
    }

    public static class b
    {

        private final double a;
        private final double b;

        public static b a(JSONObject jsonobject)
        {
            if (jsonobject != null)
            {
                double d1 = jsonobject.optDouble("value", 0.0D);
                double d2 = jsonobject.optDouble("scale", 0.0D);
                if (d1 != 0.0D && d2 != 0.0D)
                {
                    return new b(d1, d2);
                }
            }
            return null;
        }

        public double a()
        {
            return a;
        }

        public double b()
        {
            return b;
        }

        private b(double d1, double d2)
        {
            a = d1;
            b = d2;
        }
    }

    private class c
        implements android.view.View.OnClickListener, android.view.View.OnTouchListener
    {

        final NativeAd a;
        private int b;
        private int c;
        private int d;
        private int e;
        private float f;
        private float g;
        private int h;
        private int i;
        private boolean j;

        public Map a()
        {
            HashMap hashmap = new HashMap();
            hashmap.put("clickX", Integer.valueOf(b));
            hashmap.put("clickY", Integer.valueOf(c));
            hashmap.put("width", Integer.valueOf(d));
            hashmap.put("height", Integer.valueOf(e));
            hashmap.put("adPositionX", Float.valueOf(f));
            hashmap.put("adPositionY", Float.valueOf(g));
            hashmap.put("visibleWidth", Integer.valueOf(i));
            hashmap.put("visibleHeight", Integer.valueOf(h));
            return hashmap;
        }

        public void onClick(View view)
        {
            if (NativeAd.a(a) != null)
            {
                NativeAd.a(a).onAdClicked(a);
            }
            if (!j)
            {
                Log.e("FBAudienceNetworkLog", "No touch data recorded, please ensure touch events reach the ad View by returning false if you intercept the event.");
            }
            view = a();
            if (NativeAd.f(a) != null)
            {
                view.put("nti", String.valueOf(NativeAd.f(a).getValue()));
            }
            if (com.facebook.ads.NativeAd.h(a))
            {
                view.put("nhs", String.valueOf(com.facebook.ads.NativeAd.h(a)));
            }
            com.facebook.ads.NativeAd.e(a).b(view);
        }

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            boolean flag = false;
            if (motionevent.getAction() == 0 && NativeAd.j(a) != null)
            {
                d = NativeAd.j(a).getWidth();
                e = NativeAd.j(a).getHeight();
                int ai[] = new int[2];
                NativeAd.j(a).getLocationInWindow(ai);
                f = ai[0];
                g = ai[1];
                Rect rect = new Rect();
                NativeAd.j(a).getGlobalVisibleRect(rect);
                i = rect.width();
                h = rect.height();
                int ai1[] = new int[2];
                view.getLocationInWindow(ai1);
                b = ((int)motionevent.getX() + ai1[0]) - ai[0];
                int i1 = (int)motionevent.getY();
                c = (ai1[1] + i1) - ai[1];
                j = true;
            }
            if (com.facebook.ads.NativeAd.k(a) != null)
            {
                flag = com.facebook.ads.NativeAd.k(a).onTouch(view, motionevent);
            }
            return flag;
        }

        private c()
        {
            a = NativeAd.this;
            super();
        }

    }

    private class d extends BroadcastReceiver
    {

        final NativeAd a;
        private boolean b;

        public void a()
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction((new StringBuilder()).append("com.facebook.ads.native.impression:").append(com.facebook.ads.NativeAd.e(a).k()).toString());
            intentfilter.addAction((new StringBuilder()).append("com.facebook.ads.native.click:").append(com.facebook.ads.NativeAd.e(a).k()).toString());
            android.support.v4.content.g.a(com.facebook.ads.NativeAd.c(a)).a(this, intentfilter);
            b = true;
        }

        public void b()
        {
            if (!b)
            {
                return;
            }
            try
            {
                android.support.v4.content.g.a(com.facebook.ads.NativeAd.c(a)).a(this);
                return;
            }
            catch (Exception exception)
            {
                return;
            }
        }

        public void onReceive(Context context, Intent intent)
        {
            context = intent.getAction().split(":")[0];
            if ("com.facebook.ads.native.impression".equals(context))
            {
                com.facebook.ads.NativeAd.g(a).a();
            } else
            if ("com.facebook.ads.native.click".equals(context))
            {
                context = new HashMap();
                context.put("mil", Boolean.valueOf(true));
                com.facebook.ads.NativeAd.e(a).b(context);
                return;
            }
        }

        private d()
        {
            a = NativeAd.this;
            super();
        }

    }

    private class e extends k
    {

        final NativeAd a;

        public boolean a()
        {
            return false;
        }

        public void b()
        {
            if (com.facebook.ads.NativeAd.i(a) != null)
            {
                com.facebook.ads.NativeAd.i(a).a(a);
            }
            if ((NativeAd.a(a) instanceof f) && NativeAd.a(a) != com.facebook.ads.NativeAd.i(a))
            {
                ((f)NativeAd.a(a)).a(a);
            }
        }

        public void c()
        {
        }

        private e()
        {
            a = NativeAd.this;
            super();
        }

    }


    private static final com.facebook.ads.internal.c a;
    private static final String b = com/facebook/ads/NativeAd.getSimpleName();
    private static WeakHashMap c = new WeakHashMap();
    private final Context d;
    private final String e;
    private com.facebook.ads.d f;
    private f g;
    private h h;
    private volatile boolean i;
    private u j;
    private com.facebook.ads.internal.d.c k;
    private View l;
    private List m;
    private android.view.View.OnTouchListener n;
    private com.facebook.ads.internal.adapters.l o;
    private t p;
    private c q;
    private d r;
    private i s;
    private NativeAdView.Type t;
    private boolean u;

    public NativeAd(Context context, u u1, com.facebook.ads.internal.d.c c1)
    {
        this(context, null);
        k = c1;
        i = true;
        j = u1;
    }

    public NativeAd(Context context, String s1)
    {
        m = new ArrayList();
        d = context;
        e = s1;
    }

    static com.facebook.ads.d a(NativeAd nativead)
    {
        return nativead.f;
    }

    static u a(NativeAd nativead, u u1)
    {
        nativead.j = u1;
        return u1;
    }

    public static void a(a a1, ImageView imageview)
    {
        if (a1 != null && imageview != null)
        {
            (new l(imageview)).execute(new String[] {
                a1.a()
            });
        }
    }

    private void a(List list, View view)
    {
        list.add(view);
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            for (int i1 = 0; i1 < view.getChildCount(); i1++)
            {
                a(list, view.getChildAt(i1));
            }

        }
    }

    static h b(NativeAd nativead)
    {
        return nativead.h;
    }

    private void b(View view)
    {
        m.add(view);
        view.setOnClickListener(q);
        view.setOnTouchListener(q);
    }

    static Context c(NativeAd nativead)
    {
        return nativead.d;
    }

    static void d(NativeAd nativead)
    {
        nativead.p();
    }

    static u e(NativeAd nativead)
    {
        return nativead.j;
    }

    static NativeAdView.Type f(NativeAd nativead)
    {
        return nativead.t;
    }

    static t g(NativeAd nativead)
    {
        return nativead.p;
    }

    static boolean h(NativeAd nativead)
    {
        return nativead.u;
    }

    static f i(NativeAd nativead)
    {
        return nativead.g;
    }

    static View j(NativeAd nativead)
    {
        return nativead.l;
    }

    static android.view.View.OnTouchListener k(NativeAd nativead)
    {
        return nativead.n;
    }

    private void o()
    {
        View view;
        for (Iterator iterator = m.iterator(); iterator.hasNext(); view.setOnTouchListener(null))
        {
            view = (View)iterator.next();
            view.setOnClickListener(null);
        }

        m.clear();
    }

    private void p()
    {
        if (j != null && j.c())
        {
            r = new d();
            r.a();
            p = new t(d, new k() {

                final NativeAd a;

                public boolean a()
                {
                    return true;
                }

            
            {
                a = NativeAd.this;
                super();
            }
            }, j);
        }
    }

    public void a()
    {
        a(EnumSet.of(MediaCacheFlag.NONE));
    }

    public void a(View view)
    {
        ArrayList arraylist = new ArrayList();
        a(((List) (arraylist)), view);
        a(view, ((List) (arraylist)));
    }

    public void a(View view, List list)
    {
        boolean flag;
        if (view == null)
        {
            throw new IllegalArgumentException("Must provide a View");
        }
        if (list == null || list.size() == 0)
        {
            throw new IllegalArgumentException("Invalid set of clickable views");
        }
        if (!c())
        {
            Log.e(b, "Ad not loaded");
            return;
        }
        if (l != null)
        {
            Log.w(b, "Native Ad was already registered with a View. Auto unregistering and proceeding.");
            n();
        }
        if (c.containsKey(view))
        {
            Log.w(b, "View already registered with a NativeAd. Auto unregistering and proceeding.");
            ((NativeAd)((WeakReference)c.get(view)).get()).n();
        }
        q = new c();
        l = view;
        if (view instanceof ViewGroup)
        {
            s = new i(view.getContext(), new com.facebook.ads.internal.f.h() {

                final NativeAd a;

                public void a(int j1)
                {
                    if (com.facebook.ads.NativeAd.e(a) != null)
                    {
                        com.facebook.ads.NativeAd.e(a).a(j1);
                    }
                }

            
            {
                a = NativeAd.this;
                super();
            }
            });
            ((ViewGroup)view).addView(s);
        }
        for (list = list.iterator(); list.hasNext(); b((View)list.next())) { }
        p = new t(d, new e(), j);
        flag = true;
        if (k == null) goto _L2; else goto _L1
_L1:
        int i1 = k.e();
_L4:
        o = new com.facebook.ads.internal.adapters.l(d, l, i1, new com.facebook.ads.internal.adapters.l.a() {

            final NativeAd a;

            public void a()
            {
                com.facebook.ads.NativeAd.g(a).a(NativeAd.f(a));
                com.facebook.ads.NativeAd.g(a).a(com.facebook.ads.NativeAd.h(a));
                com.facebook.ads.NativeAd.g(a).a();
            }

            
            {
                a = NativeAd.this;
                super();
            }
        });
        o.a();
        c.put(view, new WeakReference(this));
        return;
_L2:
        i1 = ((flag) ? 1 : 0);
        if (h != null)
        {
            i1 = ((flag) ? 1 : 0);
            if (h.a() != null)
            {
                i1 = h.a().e();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(com.facebook.ads.d d1)
    {
        f = d1;
    }

    public void a(EnumSet enumset)
    {
        if (i)
        {
            throw new IllegalStateException("loadAd cannot be called more than once");
        } else
        {
            i = true;
            com.facebook.ads.internal.e e1 = com.facebook.ads.internal.e.i;
            h = new h(d, e, e1, null, a, 1);
            h.a(new com.facebook.ads.internal.a(enumset) {

                final EnumSet a;
                final NativeAd b;

                public void a()
                {
                    if (NativeAd.b(b) != null)
                    {
                        NativeAd.b(b).c();
                    }
                }

                public void a(u u1)
                {
                    if (u1 == null)
                    {
                        return;
                    }
                    ArrayList arraylist = new ArrayList(2);
                    if (a.contains(MediaCacheFlag.ICON) && u1.d() != null)
                    {
                        arraylist.add(u1.d().a());
                    }
                    if (a.contains(MediaCacheFlag.IMAGE) && u1.e() != null)
                    {
                        arraylist.add(u1.e().a());
                    }
                    com.facebook.ads.internal.util.n.a(com.facebook.ads.NativeAd.c(b), arraylist, new m(this, u1) {

                        final u a;
                        final _cls1 b;

                        public void a()
                        {
                            NativeAd.a(b.b, a);
                            NativeAd.d(b.b);
                            if (NativeAd.a(b.b) != null)
                            {
                                NativeAd.a(b.b).onAdLoaded(b.b);
                            }
                        }

            
            {
                b = _pcls1;
                a = u1;
                super();
            }
                    });
                }

                public void a(com.facebook.ads.internal.b b1)
                {
                    if (NativeAd.a(b) != null)
                    {
                        NativeAd.a(b).onError(b, b1.b());
                    }
                }

                public void b()
                {
                    if (NativeAd.a(b) != null)
                    {
                        NativeAd.a(b).onAdClicked(b);
                    }
                }

                public void c()
                {
                    throw new IllegalStateException("Native ads manager their own impressions.");
                }

            
            {
                b = NativeAd.this;
                a = enumset;
                super();
            }
            });
            h.b();
            return;
        }
    }

    public void b()
    {
        if (r != null)
        {
            r.b();
            r = null;
        }
        if (h != null)
        {
            h.d();
            h = null;
        }
    }

    public boolean c()
    {
        return j != null;
    }

    public a d()
    {
        if (!c())
        {
            return null;
        } else
        {
            return j.d();
        }
    }

    public a e()
    {
        if (!c())
        {
            return null;
        } else
        {
            return j.e();
        }
    }

    public String f()
    {
        if (!c())
        {
            return null;
        } else
        {
            return j.f();
        }
    }

    public String g()
    {
        if (!c())
        {
            return null;
        } else
        {
            return j.g();
        }
    }

    public String h()
    {
        if (!c())
        {
            return null;
        } else
        {
            return j.h();
        }
    }

    public String i()
    {
        if (!c())
        {
            return null;
        } else
        {
            return j.i();
        }
    }

    public b j()
    {
        if (!c())
        {
            return null;
        } else
        {
            return j.j();
        }
    }

    public String k()
    {
        if (!c())
        {
            return null;
        } else
        {
            return j.k();
        }
    }

    public a l()
    {
        if (!c())
        {
            return null;
        } else
        {
            return j.l();
        }
    }

    public String m()
    {
        if (!c())
        {
            return null;
        } else
        {
            return j.m();
        }
    }

    public void n()
    {
        if (l == null)
        {
            return;
        }
        if (!c.containsKey(l) || ((WeakReference)c.get(l)).get() != this)
        {
            throw new IllegalStateException("View not registered with this NativeAd");
        }
        if ((l instanceof ViewGroup) && s != null)
        {
            ((ViewGroup)l).removeView(s);
            s = null;
        }
        c.remove(l);
        o();
        l = null;
        if (o != null)
        {
            o.b();
            o = null;
        }
        p = null;
    }

    static 
    {
        a = com.facebook.ads.internal.c.a;
    }
}

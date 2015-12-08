// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.n;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ab;
import com.google.android.gms.internal.cf;
import com.google.android.gms.internal.hi;
import com.google.android.gms.internal.hj;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.o;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            b, a

public class h
{
    public static interface a
    {

        public abstract void a(h h1);

        public abstract String j();

        public abstract String k();

        public abstract com.google.android.gms.ads.internal.formats.a l();
    }


    private final Object a = new Object();
    private final n b;
    private final Context c;
    private final JSONObject d;
    private final ab e;
    private final a f;
    private final o g;
    private final VersionInfoParcel h;
    private boolean i;
    private hi j;
    private String k;

    public h(Context context, n n1, ab ab1, o o1, JSONObject jsonobject, a a1, VersionInfoParcel versioninfoparcel)
    {
        c = context;
        b = n1;
        e = ab1;
        g = o1;
        d = jsonobject;
        f = a1;
        h = versioninfoparcel;
    }

    static String a(h h1, String s)
    {
        h1.k = s;
        return s;
    }

    static String b(h h1)
    {
        return h1.k;
    }

    static ab c(h h1)
    {
        return h1.e;
    }

    static hi d(h h1)
    {
        return h1.j;
    }

    public com.google.android.gms.ads.internal.formats.b a(android.view.View.OnClickListener onclicklistener)
    {
        Object obj = f.l();
        if (obj == null)
        {
            return null;
        } else
        {
            obj = new com.google.android.gms.ads.internal.formats.b(c, ((com.google.android.gms.ads.internal.formats.a) (obj)));
            ((com.google.android.gms.ads.internal.formats.b) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            ((com.google.android.gms.ads.internal.formats.b) (obj)).a().setOnClickListener(onclicklistener);
            ((com.google.android.gms.ads.internal.formats.b) (obj)).a().setContentDescription("Ad attribution icon");
            return ((com.google.android.gms.ads.internal.formats.b) (obj));
        }
    }

    public void a()
    {
        y.b("recordImpression must be called on the main UI thread.");
        i = true;
        b.i();
    }

    public final void a(MotionEvent motionevent)
    {
        g.a(motionevent);
    }

    public void a(View view)
    {
    }

    public void a(View view, Map map)
    {
        y.b("performClick must be called on the main UI thread.");
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (!view.equals((View)((WeakReference)entry.getValue()).get()))
            {
                continue;
            }
            a((String)entry.getKey());
            break;
        } while (true);
    }

    public final void a(String s)
    {
        y.b("performClick must be called on the main UI thread.");
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("asset", s);
        jsonobject.put("template", f.j());
        s = new JSONObject();
        s.put("ad", d);
        s.put("click", jsonobject);
        boolean flag;
        if (b.a(f.k()) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            s.put("has_custom_click_handler", flag);
            e.a("google.afma.nativeAds.handleClickGmsg", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Unable to create click JSON.", s);
        }
        return;
    }

    public final void b(View view)
    {
label0:
        {
            synchronized (a)
            {
                if (!i)
                {
                    break label0;
                }
            }
            return;
        }
        if (view.isShown())
        {
            break MISSING_BLOCK_LABEL_32;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
        if (view.getGlobalVisibleRect(new Rect(), null))
        {
            break MISSING_BLOCK_LABEL_50;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        a();
        obj;
        JVM INSTR monitorexit ;
    }

    public hi c()
    {
        p.f();
        j = hk.a(c, AdSizeParcel.a(), false, false, g, h);
        j.a().setVisibility(8);
        e.a("/loadHtml", new cf() {

            final h a;

            public final void a(hi hi1, Map map)
            {
                h.d(a).j().a(new com.google.android.gms.internal.hj.a(this, map) {

                    final Map a;
                    final _cls1 b;

                    public final void a(hi hi1, boolean flag)
                    {
                        h.a(b.a, (String)a.get("id"));
                        hi1 = new JSONObject();
                        try
                        {
                            hi1.put("messageType", "htmlLoaded");
                            hi1.put("id", com.google.android.gms.ads.internal.formats.h.b(b.a));
                            h.c(b.a).b("sendMessageToNativeJs", hi1);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (hi hi1)
                        {
                            com.google.android.gms.ads.internal.util.client.b.a("Unable to dispatch sendMessageToNativeJsevent", hi1);
                        }
                    }

            
            {
                b = _pcls1;
                a = map;
                super();
            }
                });
                hi1 = (String)map.get("overlayHtml");
                h.d(a).loadData(hi1, "text/html", "UTF-8");
            }

            
            {
                a = h.this;
                super();
            }
        });
        e.a("/showOverlay", new cf() {

            final h a;

            public final void a(hi hi1, Map map)
            {
                h.d(a).a().setVisibility(0);
            }

            
            {
                a = h.this;
                super();
            }
        });
        e.a("/hideOverlay", new cf() {

            final h a;

            public final void a(hi hi1, Map map)
            {
                h.d(a).a().setVisibility(8);
            }

            
            {
                a = h.this;
                super();
            }
        });
        j.j().a("/hideOverlay", new cf() {

            final h a;

            public final void a(hi hi1, Map map)
            {
                h.d(a).a().setVisibility(8);
            }

            
            {
                a = h.this;
                super();
            }
        });
        j.j().a("/sendMessageToSdk", new cf() {

            final h a;

            public final void a(hi hi1, Map map)
            {
                hi1 = new JSONObject();
                try
                {
                    String s;
                    for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); hi1.put(s, map.get(s)))
                    {
                        s = (String)iterator.next();
                    }

                }
                // Misplaced declaration of an exception variable
                catch (hi hi1)
                {
                    com.google.android.gms.ads.internal.util.client.b.a("Unable to dispatch sendMessageToNativeJs event", hi1);
                    return;
                }
                hi1.put("id", com.google.android.gms.ads.internal.formats.h.b(a));
                h.c(a).b("sendMessageToNativeJs", hi1);
                return;
            }

            
            {
                a = h.this;
                super();
            }
        });
        return j;
    }

    protected final void d()
    {
        i = true;
    }
}

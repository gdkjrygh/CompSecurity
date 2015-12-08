// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

// Referenced classes of package com.mopub.nativeads:
//            y, MoPubNativeAdPositioning, ae, h, 
//            e, as, aq, z, 
//            NativeResponse, ac, MoPubNativeAdLoadedListener, MoPubAdRenderer, 
//            aa, PositioningSource, ab, RequestParameters

public class MoPubStreamAdPlacer
{

    public static final int CONTENT_VIEW_TYPE = 0;
    private static final MoPubNativeAdLoadedListener a = new y();
    private final Context b;
    private final Handler c;
    private final Runnable d;
    private final PositioningSource e;
    private final ae f;
    private final h g;
    private final HashMap h;
    private final WeakHashMap i;
    private boolean j;
    private aq k;
    private boolean l;
    private boolean m;
    private aq n;
    private MoPubAdRenderer o;
    private String p;
    private MoPubNativeAdLoadedListener q;
    private int r;
    private int s;
    private int t;
    private boolean u;

    public MoPubStreamAdPlacer(Context context)
    {
        this(context, MoPubNativeAdPositioning.serverPositioning());
    }

    public MoPubStreamAdPlacer(Context context, MoPubNativeAdPositioning.MoPubClientPositioning mopubclientpositioning)
    {
        this(context, new ae(), new h(context), ((PositioningSource) (new e(mopubclientpositioning))));
    }

    public MoPubStreamAdPlacer(Context context, MoPubNativeAdPositioning.MoPubServerPositioning mopubserverpositioning)
    {
        this(context, new ae(), new h(context), ((PositioningSource) (new as(context))));
    }

    private MoPubStreamAdPlacer(Context context, ae ae1, h h1, PositioningSource positioningsource)
    {
        q = a;
        Preconditions.checkNotNull(context, "context is not allowed to be null");
        Preconditions.checkNotNull(ae1, "adSource is not allowed to be null");
        Preconditions.checkNotNull(h1, "impressionTracker is not allowed to be null");
        Preconditions.checkNotNull(positioningsource, "positioningSource is not allowed to be null");
        b = context;
        g = h1;
        e = positioningsource;
        f = ae1;
        n = aq.a();
        i = new WeakHashMap();
        h = new HashMap();
        c = new Handler();
        d = new z(this);
        r = 0;
        s = 0;
    }

    private void a(View view)
    {
        if (view != null)
        {
            g.a(view);
            NativeResponse nativeresponse = (NativeResponse)i.get(view);
            if (nativeresponse != null)
            {
                nativeresponse.clear(view);
                i.remove(view);
                h.remove(nativeresponse);
                return;
            }
        }
    }

    private void a(aq aq1)
    {
        removeAdsInRange(0, t);
        n = aq1;
        c();
        m = true;
    }

    private boolean a(int i1, int j1)
    {
        int k1;
        for (j1--; i1 <= j1 && i1 != -1 && i1 < t; j1 = k1)
        {
            k1 = j1;
            if (n.a(i1))
            {
                Object obj = f.b();
                if (obj == null)
                {
                    k1 = 0;
                } else
                {
                    Preconditions.checkNotNull(p);
                    Preconditions.checkNotNull(o);
                    obj = new ac(p, o, ((NativeResponse) (obj)));
                    n.a(i1, ((ac) (obj)));
                    t = t + 1;
                    q.onAdLoaded(i1);
                    k1 = 1;
                }
                if (k1 == 0)
                {
                    return false;
                }
                k1 = j1 + 1;
            }
            i1 = n.b(i1);
        }

        return true;
    }

    static boolean a(MoPubStreamAdPlacer mopubstreamadplacer)
    {
        return mopubstreamadplacer.u;
    }

    private void b()
    {
        if (u)
        {
            return;
        } else
        {
            u = true;
            c.post(d);
            return;
        }
    }

    static void b(MoPubStreamAdPlacer mopubstreamadplacer)
    {
        mopubstreamadplacer.c();
    }

    private void c()
    {
        if (!a(r, s))
        {
            return;
        } else
        {
            a(s, s + 10);
            return;
        }
    }

    static boolean c(MoPubStreamAdPlacer mopubstreamadplacer)
    {
        mopubstreamadplacer.u = false;
        return false;
    }

    final void a()
    {
        if (m)
        {
            b();
            return;
        }
        if (j)
        {
            a(k);
        }
        l = true;
    }

    final void a(MoPubNativeAdPositioning.MoPubClientPositioning mopubclientpositioning)
    {
        mopubclientpositioning = aq.a(mopubclientpositioning);
        if (l)
        {
            a(((aq) (mopubclientpositioning)));
        } else
        {
            k = mopubclientpositioning;
        }
        j = true;
    }

    public void clearAds()
    {
        removeAdsInRange(0, t);
        f.a();
    }

    public void destroy()
    {
        c.removeMessages(0);
        f.a();
        g.a();
        n.c();
    }

    public Object getAdData(int i1)
    {
        return n.d(i1);
    }

    public View getAdView(int i1, View view, ViewGroup viewgroup)
    {
        Object obj = n.d(i1);
        if (obj == null)
        {
            return null;
        }
        MoPubAdRenderer mopubadrenderer = ((ac) (obj)).a();
        if (view == null)
        {
            view = mopubadrenderer.createAdView(b, viewgroup);
        }
        obj = ((ac) (obj)).b();
        viewgroup = (WeakReference)h.get(obj);
        if (viewgroup != null)
        {
            viewgroup = (View)viewgroup.get();
        } else
        {
            viewgroup = null;
        }
        if (!view.equals(viewgroup))
        {
            a(viewgroup);
            a(view);
            h.put(obj, new WeakReference(view));
            i.put(view, obj);
            if (!((NativeResponse) (obj)).isOverridingImpressionTracker())
            {
                g.a(view, ((NativeResponse) (obj)));
            }
            ((NativeResponse) (obj)).prepare(view);
            mopubadrenderer.renderAdView(view, obj);
        }
        return view;
    }

    public int getAdViewType(int i1)
    {
        return !isAd(i1) ? 0 : 1;
    }

    public int getAdViewTypeCount()
    {
        return 1;
    }

    public int getAdjustedCount(int i1)
    {
        return n.g(i1);
    }

    public int getAdjustedPosition(int i1)
    {
        return n.f(i1);
    }

    public int getOriginalCount(int i1)
    {
        byte byte0 = -1;
        aq aq1 = n;
        if (i1 == 0)
        {
            i1 = 0;
        } else
        {
            int j1 = aq1.e(i1 - 1);
            i1 = byte0;
            if (j1 != -1)
            {
                return j1 + 1;
            }
        }
        return i1;
    }

    public int getOriginalPosition(int i1)
    {
        return n.e(i1);
    }

    public void insertItem(int i1)
    {
        n.h(i1);
    }

    public boolean isAd(int i1)
    {
        return n.c(i1);
    }

    public void loadAds(String s1)
    {
        loadAds(s1, null);
    }

    public void loadAds(String s1, RequestParameters requestparameters)
    {
        if (!com.mopub.common.Preconditions.NoThrow.checkNotNull(s1, "Cannot load ads with a null ad unit ID"))
        {
            return;
        }
        if (o == null)
        {
            MoPubLog.w("You must call registerAdRenderer before loading ads");
            return;
        } else
        {
            p = s1;
            m = false;
            j = false;
            l = false;
            e.loadPositions(s1, new aa(this));
            f.a(new ab(this));
            f.a(b, s1, requestparameters);
            return;
        }
    }

    public void moveItem(int i1, int j1)
    {
        aq aq1 = n;
        aq1.i(i1);
        aq1.h(j1);
    }

    public void placeAdsInRange(int i1, int j1)
    {
        r = i1;
        s = Math.min(j1, i1 + 100);
        b();
    }

    public void registerAdRenderer(MoPubAdRenderer mopubadrenderer)
    {
        if (!com.mopub.common.Preconditions.NoThrow.checkNotNull(mopubadrenderer, "Cannot register a null adRenderer"))
        {
            return;
        } else
        {
            o = mopubadrenderer;
            return;
        }
    }

    public int removeAdsInRange(int i1, int j1)
    {
        int ai[] = n.b();
        int k1 = n.f(i1);
        j1 = n.f(j1);
        ArrayList arraylist = new ArrayList();
        for (i1 = ai.length - 1; i1 >= 0; i1--)
        {
            int l1 = ai[i1];
            if (l1 < k1 || l1 >= j1)
            {
                continue;
            }
            arraylist.add(Integer.valueOf(l1));
            if (l1 < r)
            {
                r = r - 1;
            }
            t = t - 1;
        }

        i1 = n.a(k1, j1);
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); q.onAdRemoved(j1))
        {
            j1 = ((Integer)iterator.next()).intValue();
        }

        return i1;
    }

    public void removeItem(int i1)
    {
        n.i(i1);
    }

    public void setAdLoadedListener(MoPubNativeAdLoadedListener mopubnativeadloadedlistener)
    {
        MoPubNativeAdLoadedListener mopubnativeadloadedlistener1 = mopubnativeadloadedlistener;
        if (mopubnativeadloadedlistener == null)
        {
            mopubnativeadloadedlistener1 = a;
        }
        q = mopubnativeadloadedlistener1;
    }

    public void setItemCount(int i1)
    {
        t = n.g(i1);
        if (m)
        {
            b();
        }
    }

}

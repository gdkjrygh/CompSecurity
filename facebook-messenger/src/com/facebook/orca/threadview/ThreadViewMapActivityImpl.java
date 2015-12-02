// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.i;
import android.support.v4.app.q;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ZoomButtonsController;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.d;
import com.facebook.base.activity.o;
import com.facebook.config.a.a;
import com.facebook.h;
import com.facebook.inject.t;
import com.facebook.location.Coordinates;
import com.facebook.maps.c;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.emoji.z;
import com.facebook.orca.f.k;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.n;
import com.facebook.orca.threads.r;
import com.facebook.user.UserKey;
import com.facebook.user.tiles.UserTileView;
import com.facebook.user.tiles.e;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.OverlayItem;
import com.google.common.a.es;
import com.google.common.a.hq;
import com.google.common.a.ik;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.orca.threadview:
//            cq, cs, cv, ct, 
//            cu, dq, ThreadViewFragment, cr

public class ThreadViewMapActivityImpl extends o
    implements d, cq
{

    private k a;
    private a b;
    private n c;
    private com.facebook.prefs.shared.d d;
    private r e;
    private z f;
    private av g;
    private FrameLayout h;
    private RelativeLayout i;
    private UserTileView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private MapView n;
    private ThreadViewFragment o;
    private ct p;
    private cu q;
    private MyLocationOverlay r;

    public ThreadViewMapActivityImpl()
    {
    }

    private cs a(List list)
    {
        int j1 = 0x7fffffff;
        int i1 = 0x80000000;
        list = list.iterator();
        int i2 = 0x7fffffff;
        int l1 = 0x80000000;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            GeoPoint geopoint = (GeoPoint)list.next();
            int k1 = i2;
            if (geopoint.getLatitudeE6() < i2)
            {
                k1 = geopoint.getLatitudeE6();
            }
            int j2 = l1;
            if (geopoint.getLatitudeE6() > l1)
            {
                j2 = geopoint.getLatitudeE6();
            }
            int k2 = j1;
            if (geopoint.getLongitudeE6() < j1)
            {
                k2 = geopoint.getLongitudeE6();
            }
            l1 = j2;
            i2 = k1;
            j1 = k2;
            if (geopoint.getLongitudeE6() > i1)
            {
                i1 = geopoint.getLongitudeE6();
                l1 = j2;
                i2 = k1;
                j1 = k2;
            }
        } while (true);
        return new cs(new GeoPoint((i2 + l1) / 2, (j1 + i1) / 2), l1, i2, i1, j1);
    }

    static void a(ThreadViewMapActivityImpl threadviewmapactivityimpl, OverlayItem overlayitem)
    {
        threadviewmapactivityimpl.a(overlayitem);
    }

    private void a(OverlayItem overlayitem)
    {
        if (overlayitem == null)
        {
            i.setVisibility(8);
            return;
        }
        cv cv1 = (cv)overlayitem;
        UserKey userkey = cv1.a();
        i.setVisibility(0);
        j.setParams(com.facebook.user.tiles.e.a(userkey));
        k.setText(overlayitem.getTitle());
        overlayitem = cv1.b();
        if (overlayitem != null)
        {
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(e.a(overlayitem));
            f.a(spannablestringbuilder, (int)l.getTextSize());
            l.setText(spannablestringbuilder);
            l.setVisibility(0);
            m.setText(c.a(overlayitem.f()));
            m.setVisibility(0);
            g.a((new cb("click")).f("map_marker").a(g_()).b("thread_id", overlayitem.e()).g(cv1.a().b()));
            return;
        } else
        {
            l.setVisibility(8);
            m.setVisibility(8);
            return;
        }
    }

    public void a(ThreadSummary threadsummary, es es1)
    {
        if (i != null && i.getVisibility() == 0)
        {
            i.setVisibility(8);
        }
        Object obj = ik.a();
        es1 = es1.iterator();
        do
        {
            if (!es1.hasNext())
            {
                break;
            }
            Message message = (Message)es1.next();
            UserKey userkey1 = message.i().e();
            if (!((Map) (obj)).containsKey(userkey1) && message.n() != null)
            {
                ((Map) (obj)).put(userkey1, message);
            }
        } while (true);
        threadsummary = hq.c(threadsummary.j().size());
        es1 = hq.a();
        float f1;
        UserKey userkey;
        Object obj1;
        GeoPoint geopoint;
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); es1.add(new cv(this, geopoint, f1, com.facebook.common.w.n.a(a.b(((Message) (obj1)).i())), e.a(((Message) (obj1))), userkey, ((Message) (obj1)))))
        {
            obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            userkey = (UserKey)((java.util.Map.Entry) (obj1)).getKey();
            obj1 = (Message)((java.util.Map.Entry) (obj1)).getValue();
            Coordinates coordinates = ((Message) (obj1)).n();
            geopoint = new GeoPoint((int)(coordinates.b() * 1000000D), (int)(coordinates.c() * 1000000D));
            f1 = coordinates.f().floatValue();
            threadsummary.add(geopoint);
        }

        p.a();
        p.a(es1);
        q.a();
        q.a(es1);
        if (threadsummary.size() > 0)
        {
            threadsummary = a(((List) (threadsummary)));
            es1 = n.getController();
            es1.animateTo(((cs) (threadsummary)).a);
            es1.zoomToSpan(Math.max(Math.abs(((cs) (threadsummary)).b - ((cs) (threadsummary)).c), 10000), Math.abs(((cs) (threadsummary)).d - ((cs) (threadsummary)).e));
        }
        threadsummary = n.getOverlays();
        threadsummary.clear();
        threadsummary.add(r);
        threadsummary.add(q);
        threadsummary.add(p);
        threadsummary.add(new dq(this, n));
        n.invalidate();
        n.setBuiltInZoomControls(true);
    }

    protected void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(com.facebook.k.orca_thread_view_map_tab);
        o = (ThreadViewFragment)((i)getParent()).f().a("threadViewFragment");
        bundle = b();
        a = (k)bundle.a(com/facebook/orca/f/k);
        b = (a)bundle.a(com/facebook/config/a/a);
        c = (n)bundle.a(com/facebook/orca/threads/n);
        d = (com.facebook.prefs.shared.d)bundle.a(com/facebook/prefs/shared/d);
        e = (r)bundle.a(com/facebook/orca/threads/r);
        f = (z)bundle.a(com/facebook/orca/emoji/z);
        g = (av)bundle.a(com/facebook/analytics/av);
        h = (FrameLayout)a(com.facebook.i.thread_view_map_frame);
        i = (RelativeLayout)a(com.facebook.i.thread_view_user_overlay);
        j = (UserTileView)a(com.facebook.i.thread_view_map_user_img);
        k = (TextView)a(com.facebook.i.thread_view_map_user_name);
        l = (TextView)a(com.facebook.i.thread_view_map_user_snippet);
        m = (TextView)a(com.facebook.i.thread_view_map_user_time);
        p = new ct(this, getResources().getDrawable(h.orca_map_member_marker));
        p.setOnFocusChangeListener(new cr(this));
        q = new cu(this);
        n = new MapView(this, b.e());
        bundle = new android.widget.FrameLayout.LayoutParams(-1, -1);
        n.setClickable(true);
        n.setLayoutParams(bundle);
        r = new c(this, n);
        h.addView(n, 0);
        ((FrameLayout)findViewById(0x1020002)).setForeground(null);
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.THREAD_VIEW_MAP_ACTIVITY_NAME;
    }

    protected boolean isRouteDisplayed()
    {
        return false;
    }

    public void onBackPressed()
    {
        o.Q();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        o = null;
    }

    protected void onPause()
    {
        super.onPause();
        r.disableMyLocation();
        if (n.getZoomButtonsController() != null)
        {
            n.getZoomButtonsController().setVisible(false);
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (d.a(com.facebook.orca.prefs.n.x, true))
        {
            r.enableMyLocation();
        }
    }
}

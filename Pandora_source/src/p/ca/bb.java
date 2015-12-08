// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.content.j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.pandora.android.activity.BaseFragmentActivity;
import com.pandora.android.tablet.TabletHome;
import com.pandora.android.util.p;
import com.pandora.android.util.s;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.i;
import java.security.InvalidParameterException;
import org.json.JSONObject;
import p.bz.v;
import p.cp.b;
import p.cp.d;
import p.cw.c;
import p.cx.ab;
import p.dd.at;
import p.dd.ay;
import p.df.a;

// Referenced classes of package p.ca:
//            ac, ae

public class bb extends ac
{
    private class a
    {

        final bb a;

        public void a()
        {
            com.pandora.android.provider.b.a.b().c(this);
        }

        public void onStationData(at at1)
        {
            p.ca.bb.a(a, at1.a);
        }

        public void onStationStateChange(ay ay1)
        {
            static class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[p.dd.ay.a.values().length];
                    try
                    {
                        a[p.dd.ay.a.c.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[p.dd.ay.a.d.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[p.dd.ay.a.b.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[p.dd.ay.a.a.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (p.ca._cls1.a[ay1.b.ordinal()])
            {
            default:
                throw new InvalidParameterException((new StringBuilder()).append("onStationStateChange called with unknown stationStateChangeType: ").append(ay1.b).toString());

            case 3: // '\003'
            case 4: // '\004'
                ay1 = a.B();
                if (ay1 != null)
                {
                    ay1.clearView();
                }
                // fall through

            case 1: // '\001'
            case 2: // '\002'
                return;
            }
        }

        public a()
        {
            a = bb.this;
            super();
            com.pandora.android.provider.b.a.b().b(this);
        }
    }

    protected class b extends ac.c
    {

        final bb a;

        protected void a(String s1, String s2)
        {
            ab.a().a(new Runnable(this, s2, s1) {

                final String a;
                final String b;
                final b c;

                public void run()
                {
                    c c1 = com.pandora.android.provider.b.a.b();
                    if (s.a(a) && s.a(b) && c1.d().p())
                    {
                        c1.d().a(p.cw.b.c.a);
                    } else
                    {
                        if (p.ca.bb.a(c.a) == null)
                        {
                            p.ca.bb.a(c.a, c1.y().a(com.pandora.android.provider.b.a.h(), a));
                        }
                        if (p.ca.bb.a(c.a) != null && p.ca.bb.a(c.a).A() && (s.a(a) || p.ca.bb.a(c.a).h().equals(a)))
                        {
                            com.pandora.android.activity.a.a(p.ca.bb.a(c.a), b, true, false, p.cw.b.b.c, null);
                            return;
                        }
                    }
                }

            
            {
                c = b1;
                a = s1;
                b = s2;
                super();
            }
            });
        }

        protected void a(String s1, String s2, String s3, String s4, String s5, String s6)
        {
            if (s.u())
            {
                s3 = (new StringBuilder()).append(s1);
                if (s1.contains("?"))
                {
                    s2 = "&pat=";
                } else
                {
                    s2 = "?pat=";
                }
                s3 = s3.append(s2).append(s.b(com.pandora.android.provider.b.a.d().b())).toString();
                s2 = new Bundle();
                s2.putSerializable("intent_detail_url", s1);
                s1 = null;
                if (s3.indexOf("artist_detail") != -1)
                {
                    s1 = p.D;
                } else
                if (s3.indexOf("track_detail") != -1)
                {
                    s1 = p.C;
                } else
                if (s3.indexOf("album_detail") != -1)
                {
                    s1 = p.E;
                }
                if (s1 == null)
                {
                    return;
                } else
                {
                    com.pandora.android.provider.b.a.C().a(TabletHome.a(s1, s2));
                    return;
                }
            } else
            {
                com.pandora.android.provider.b.a.b().k().e(System.currentTimeMillis());
                super.a(s1, s2, s3, s4, s5, s6);
                return;
            }
        }

        protected void a(JSONObject jsonobject)
        {
            super.a(jsonobject);
            if (jsonobject.has("trackUnavailable"))
            {
                boolean flag;
                if (!jsonobject.optBoolean("trackUnavailable"))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.pandora.android.provider.b.a.e().a(new v(flag));
            }
        }

        public boolean a()
        {
            return true;
        }

        protected void b(String s1, String s2)
        {
            if (p.ca.bb.a(a) == null || !p.ca.bb.a(a).c().equals(s1))
            {
                return;
            } else
            {
                com.pandora.android.provider.b.a.b().d().a(p.ca.bb.a(a).c(), s2);
                return;
            }
        }

        public void onPageStarted(WebView webview, String s1, Bitmap bitmap)
        {
            super.onPageStarted(webview, s1, bitmap);
            if (p.ca.bb.a(a) != null && p.ca.bb.a(a).A())
            {
                com.pandora.android.provider.b.a.e().a(new v(true));
            }
        }

        public b(BaseFragmentActivity basefragmentactivity, WebView webview)
        {
            a = bb.this;
            super(bb.this, basefragmentactivity, q, webview);
        }
    }


    private ae a;
    private y b;
    private String c;
    private int d;
    private a e;

    public bb()
    {
        a = new ae();
        d = -1;
    }

    protected static Bundle a(boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("intent_clear_webview_before_loading", flag);
        bundle.putInt("intent_color", 0);
        return bundle;
    }

    static y a(bb bb1)
    {
        return bb1.b;
    }

    static y a(bb bb1, y y1)
    {
        bb1.b = y1;
        return y1;
    }

    private boolean a(aa aa1, int i)
    {
        while (!s.u() || c == null || aa1 == null || !c.equals(aa1.w()) || d != i) 
        {
            return true;
        }
        return false;
    }

    protected d a(BaseFragmentActivity basefragmentactivity, WebView webview)
    {
        return new b(basefragmentactivity, webview);
    }

    public void a(aa aa1, int i, String s1)
    {
        p.df.a.a("TrackInfoFragment", (new StringBuilder()).append("TrackInfoFragment.onTrackSelected - ").append(aa1.w()).append(" trackPosition:").append(i).toString());
        if (a(aa1, i)) goto _L2; else goto _L1
_L1:
        p.df.a.a("TrackInfoFragment", (new StringBuilder()).append("not reloading - already loaded ").append(aa1.w()).append(" trackPosition:").append(i).toString());
_L4:
        return;
_L2:
        c = aa1.w();
        d = i;
        String s2;
        String s3;
        s3 = p.cp.b.a(aa1);
        if (p.cp.b.d(s3) < 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (b == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = b.h();
_L5:
        aa1 = p.cp.b.a(s3, s2, s1, aa1.W());
        p.df.a.c("TrackInfoFragment", (new StringBuilder()).append("trackInfoURL :").append(aa1).toString());
        if (!s.a(aa1))
        {
            a(true, m, android.webkit.WebSettings.ZoomDensity.MEDIUM, false);
            b(aa1, null, false, 0);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            s2 = aa1.r();
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            p.df.a.c("TrackInfoFragment", "Error setting track info view.", aa1);
            return;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        a.a(activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            p = bundle.getBoolean("intent_clear_webview_before_loading", false);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (s.u())
        {
            viewgroup = new android.widget.LinearLayout.LayoutParams(-1, -1);
            viewgroup.gravity = 48;
            layoutinflater.setLayoutParams(viewgroup);
        }
        e = new a();
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        e.a();
        e = null;
    }

    public void onDetach()
    {
        super.onDetach();
        a.b();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.android.volley.VolleyError;
import com.android.volley.a.l;
import com.crashlytics.android.Crashlytics;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.tinder.a.f;
import com.tinder.utils.ad;
import com.tinder.utils.e;
import com.tinder.utils.h;
import com.tinder.utils.i;
import com.tinder.utils.v;
import java.io.IOException;
import java.io.StringReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

// Referenced classes of package com.tinder.managers:
//            ManagerApp, ae, d

public final class ManagerLiveRail
{
    public static final class LiveRailEvent extends Enum
    {

        public static final LiveRailEvent a;
        public static final LiveRailEvent b;
        public static final LiveRailEvent c;
        public static final LiveRailEvent d;
        public static final LiveRailEvent e;
        public static final LiveRailEvent f;
        public static final LiveRailEvent g;
        public static final LiveRailEvent h;
        public static final LiveRailEvent i;
        public static final LiveRailEvent j;
        public static final LiveRailEvent k;
        private static final LiveRailEvent l[];

        public static LiveRailEvent valueOf(String s1)
        {
            return (LiveRailEvent)Enum.valueOf(com/tinder/managers/ManagerLiveRail$LiveRailEvent, s1);
        }

        public static LiveRailEvent[] values()
        {
            return (LiveRailEvent[])l.clone();
        }

        static 
        {
            a = new LiveRailEvent("impression", 0);
            b = new LiveRailEvent("firstQuartile", 1);
            c = new LiveRailEvent("midpoint", 2);
            d = new LiveRailEvent("thirdQuartile", 3);
            e = new LiveRailEvent("complete", 4);
            f = new LiveRailEvent("mute", 5);
            g = new LiveRailEvent("unmute", 6);
            h = new LiveRailEvent("pause", 7);
            i = new LiveRailEvent("resume", 8);
            j = new LiveRailEvent("close", 9);
            k = new LiveRailEvent("acceptInvitation", 10);
            l = (new LiveRailEvent[] {
                a, b, c, d, e, f, g, h, i, j, 
                k
            });
        }

        private LiveRailEvent(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static String A = "//Companion[@width=1001]//HTMLResource";
    private static String B = "//Companion[@width=1002]//HTMLResource";
    private static String C = "//Companion[@width=1003]//HTMLResource";
    private static String D = "//Creative//MediaFiles/MediaFile";
    private static String E = "//VideoClicks/ClickThrough";
    private static String F = "//Companion//StaticResource[@creativeType='image/jpeg']";
    private static String G = "//Companion//StaticResource[@creativeType='image/png']";
    private static String H = "//Companion[@width=1004]//HTMLResource";
    private static String I = "//Companion[@width=1005]//HTMLResource";
    private static String J = "//Creative//Duration";
    private static String K = "//Ad//Impression[@id='LR']";
    private static String L = "//Linear/TrackingEvents/Tracking[@event='%s']";
    private static String w = "http://ad5.liverail.com/?";
    private static String x = "//Ad/@id";
    private static String y = "//Creative/@id";
    private static String z = "//Ad/InLine/AdSystem";
    private String M;
    Context a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public int n;
    XPath o;
    String p;
    public i q;
    public i r;
    ae s;
    d t;
    public boolean u;
    public boolean v;

    public ManagerLiveRail(Context context, ae ae, d d1)
    {
        q = new i();
        r = new i();
        v = false;
        a = context;
        s = ae;
        t = d1;
    }

    static String a(ManagerLiveRail managerliverail, String s1)
    {
        managerliverail.M = s1;
        return s1;
    }

    static void a(ManagerLiveRail managerliverail)
    {
        if (!managerliverail.u)
        {
            managerliverail.a();
            return;
        } else
        {
            managerliverail = new l(0, managerliverail.M, managerliverail. new com.android.volley.i.b() {

                final ManagerLiveRail a;

                public final void a(Object obj)
                {
                    int i1;
                    i1 = 0;
                    obj = (String)obj;
                    a.p = ((String) (obj));
                    a.o = XPathFactory.newInstance().newXPath();
                    float f1;
                    Object obj1;
                    XPathExpressionException xpathexpressionexception;
                    NamedNodeMap namednodemap;
                    try
                    {
                        obj = ManagerLiveRail.b(a);
                        a.m = (String)a.o.evaluate(ManagerLiveRail.c(), ((InputSource) (obj)), XPathConstants.STRING);
                        obj = ManagerLiveRail.b(a);
                        a.b = (String)a.o.evaluate(ManagerLiveRail.d(), ((InputSource) (obj)), XPathConstants.STRING);
                        obj = ManagerLiveRail.b(a);
                        a.c = (String)a.o.evaluate(com.tinder.managers.ManagerLiveRail.e(), ((InputSource) (obj)), XPathConstants.STRING);
                        obj = ManagerLiveRail.b(a);
                        a.d = (String)a.o.evaluate(com.tinder.managers.ManagerLiveRail.f(), ((InputSource) (obj)), XPathConstants.STRING);
                        obj = ManagerLiveRail.b(a);
                        a.e = (String)a.o.evaluate(ManagerLiveRail.g(), ((InputSource) (obj)), XPathConstants.STRING);
                        obj = ManagerLiveRail.b(a);
                        a.g = (String)a.o.evaluate(com.tinder.managers.ManagerLiveRail.h(), ((InputSource) (obj)), XPathConstants.STRING);
                        obj = ManagerLiveRail.b(a);
                        a.h = (String)a.o.evaluate(com.tinder.managers.ManagerLiveRail.i(), ((InputSource) (obj)), XPathConstants.STRING);
                        obj = ManagerLiveRail.b(a);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        a.r.a();
                        return;
                    }
                    a.l = (String)a.o.evaluate(ManagerLiveRail.j(), ((InputSource) (obj)), XPathConstants.STRING);
_L1:
                    obj1 = a.l;
                    if (obj1 != null)
                    {
                        break MISSING_BLOCK_LABEL_366;
                    }
                    a.l = (String)a.o.evaluate(ManagerLiveRail.k(), ((InputSource) (obj)), XPathConstants.STRING);
_L2:
                    if (com.tinder.utils.h.a(a.l))
                    {
                        a.l = null;
                    }
                    obj = ManagerLiveRail.b(a);
                    obj = (NodeList)a.o.evaluate(com.tinder.managers.ManagerLiveRail.l(), ((InputSource) (obj)), XPathConstants.NODESET);
                    f1 = ((NodeList) (obj)).getLength();
_L3:
                    if ((float)i1 >= f1)
                    {
                        break MISSING_BLOCK_LABEL_598;
                    }
                    obj1 = ((NodeList) (obj)).item(i1);
                    namednodemap = ((Node) (obj1)).getAttributes();
                    if (!namednodemap.getNamedItem("type").getNodeValue().equals("video/webm") || Integer.parseInt(namednodemap.getNamedItem("width").getNodeValue()) < ad.a(a.a) && (float)i1 != f1 - 1.0F)
                    {
                        break MISSING_BLOCK_LABEL_891;
                    }
                    a.i = ((Node) (obj1)).getTextContent();
                    break MISSING_BLOCK_LABEL_891;
                    xpathexpressionexception;
                    a.l = (String)a.o.evaluate(ManagerLiveRail.k(), ((InputSource) (obj)), XPathConstants.STRING);
                      goto _L1
                    obj;
                    a.l = null;
                      goto _L2
                    obj;
                    a.r.a();
                    return;
                    obj = ManagerLiveRail.b(a);
                    a.f = (String)a.o.evaluate(ManagerLiveRail.m(), ((InputSource) (obj)), XPathConstants.STRING);
                    obj = ManagerLiveRail.b(a);
                    a.j = (String)a.o.evaluate(ManagerLiveRail.n(), ((InputSource) (obj)), XPathConstants.STRING);
                    obj = ManagerLiveRail.b(a);
                    a.k = (String)a.o.evaluate(ManagerLiveRail.o(), ((InputSource) (obj)), XPathConstants.STRING);
                    obj = ManagerLiveRail.b(a);
                    obj = ((String)a.o.evaluate(ManagerLiveRail.p(), ((InputSource) (obj)), XPathConstants.STRING)).split(":");
                    if (obj.length != 3)
                    {
                        a.r.a();
                        return;
                    }
                    a.n = Integer.parseInt(obj[0]) * 60 * 60;
                    ManagerLiveRail managerliverail1 = a;
                    managerliverail1.n = managerliverail1.n + Integer.parseInt(obj[1]) * 60;
                    managerliverail1 = a;
                    i1 = managerliverail1.n;
                    managerliverail1.n = Integer.parseInt(obj[2]) + i1;
                    for (obj = (new ArrayList(this) {

                final _cls2 a;

            
            {
                a = _pcls2;
                super();
                add(Integer.valueOf(a.a.n));
                add(a.a.h);
                add(a.a.i);
                add(a.a.m);
            }
            }).iterator(); ((Iterator) (obj)).hasNext();)
                    {
                        if (com.tinder.utils.h.a(((Iterator) (obj)).next().toString()))
                        {
                            a.r.a();
                            return;
                        }
                    }

                    ((Object)this).toString();
                    a.q.a();
                    return;
                    i1++;
                      goto _L3
                }

            
            {
                a = ManagerLiveRail.this;
                super();
            }
            }, managerliverail. new com.android.volley.i.a() {

                final ManagerLiveRail a;

                public final void a(VolleyError volleyerror)
                {
                    com.tinder.utils.v.b("Failed to get LiveRail manifest");
                    a.r.a();
                }

            
            {
                a = ManagerLiveRail.this;
                super();
            }
            });
            ManagerApp.b().a(managerliverail);
            return;
        }
    }

    static String b()
    {
        return w;
    }

    static InputSource b(ManagerLiveRail managerliverail)
    {
        return managerliverail.q();
    }

    static String c()
    {
        return K;
    }

    static String d()
    {
        return x;
    }

    static String e()
    {
        return y;
    }

    static String f()
    {
        return z;
    }

    static String g()
    {
        return A;
    }

    static String h()
    {
        return B;
    }

    static String i()
    {
        return C;
    }

    static String j()
    {
        return F;
    }

    static String k()
    {
        return G;
    }

    static String l()
    {
        return D;
    }

    static String m()
    {
        return E;
    }

    static String n()
    {
        return H;
    }

    static String o()
    {
        return I;
    }

    static String p()
    {
        return J;
    }

    private InputSource q()
    {
        return new InputSource(new StringReader(p));
    }

    public final void a()
    {
        if (u)
        {
            return;
        } else
        {
            u = true;
            com.tinder.utils.e.a(new com.tinder.utils.e.b() {

                final ManagerLiveRail a;

                public final void a()
                {
                    Object obj = new HashMap(this) {

                        final _cls1 a;

            
                throws RuntimeException, Error
            {
                int i1;
                i1 = 0;
                a = _pcls1;
                super();
                put("LR_WIDTH", String.valueOf(ad.a(a.a.a)));
                put("LR_HEIGHT", String.valueOf(ad.b(a.a.a)));
                put("LR_FORMAT", "video/webm");
                put("LR_SCHEMA", "vast2");
                put("LR_ADTYPE", "3");
                _pcls1 = AdvertisingIdClient.getAdvertisingIdInfo(a.a.a);
                put("LR_IDFA", _pcls1.getId());
                if (!_pcls1.isLimitAdTrackingEnabled())
                {
                    i1 = 1;
                }
                put("LR_IDFA_FLAG", String.valueOf(i1));
_L1:
                put("LR_OS", "Android");
                put("LR_OS_VERSION", android.os.Build.VERSION.RELEASE);
                put("LR_BUNDLE", "com.cardify.tinder");
                put("LR_APPNAME", a.a.a.getResources().getString(0x7f060062));
                try
                {
                    put("LR_APPVERS", a.a.a.getPackageManager().getPackageInfo(a.a.a.getPackageName(), 0).versionName);
                }
                // Misplaced declaration of an exception variable
                catch (_cls1 _pcls1)
                {
                    put("LR_APPVERS", "837");
                }
                put("LR_CARRIER", ((TelephonyManager)a.a.a.getSystemService("phone")).getNetworkOperatorName());
                put("LR_MAKE", Build.MANUFACTURER);
                put("LR_MODEL", Build.MODEL);
                put("LR_PUBLISHER_ID", "94567");
                return;
                _pcls1;
                com.tinder.utils.v.a("Failed to connect to Google Play Services", _pcls1);
                  goto _L1
                _pcls1;
                com.tinder.utils.v.a("A recoverable Google Play Services issue occured", _pcls1);
                  goto _L1
                _pcls1;
                com.tinder.utils.v.a("Google Play Services are not available", _pcls1);
                  goto _L1
            }
                    };
                    StringBuilder stringbuilder = new StringBuilder();
                    stringbuilder.append(ManagerLiveRail.b());
                    for (obj = ((HashMap) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append('&'))
                    {
                        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                        stringbuilder.append((String)entry.getKey());
                        stringbuilder.append('=');
                        stringbuilder.append(URLEncoder.encode((String)entry.getValue()).replace("+", "%20"));
                    }

                    stringbuilder.deleteCharAt(stringbuilder.length() - 1);
                    ManagerLiveRail.a(a, stringbuilder.toString());
                    ManagerLiveRail.a(a);
                }

            
            {
                a = ManagerLiveRail.this;
                super();
            }
            }).a(false);
            return;
        }
    }

    public final void a(LiveRailEvent liverailevent)
    {
        if (!u)
        {
            q.a(new Runnable(liverailevent) {

                final LiveRailEvent a;
                final ManagerLiveRail b;

                public final void run()
                {
                    b.a(a);
                }

            
            {
                b = ManagerLiveRail.this;
                a = liverailevent;
                super();
            }
            }, true);
            return;
        }
        a();
        Object obj;
        com.android.volley.i.a a1;
        obj = new com.android.volley.i.b(liverailevent) {

            final LiveRailEvent a;
            final ManagerLiveRail b;

            public final void a(Object obj1)
            {
                String.format("Got response to event %s from LiveRail", new Object[] {
                    a
                });
            }

            
            {
                b = ManagerLiveRail.this;
                a = liverailevent;
                super();
            }
        };
        a1 = new com.android.volley.i.a(liverailevent) {

            final LiveRailEvent a;
            final ManagerLiveRail b;

            public final void a(VolleyError volleyerror)
            {
                String.format("Got error for event %s", new Object[] {
                    a
                });
            }

            
            {
                b = ManagerLiveRail.this;
                a = liverailevent;
                super();
            }
        };
        if (liverailevent != LiveRailEvent.a) goto _L2; else goto _L1
_L1:
        obj = new l(0, m, ((com.android.volley.i.b) (obj)), a1);
        liverailevent = ((LiveRailEvent) (obj));
_L3:
        XPathExpressionException xpathexpressionexception;
        if (liverailevent != null)
        {
            ManagerApp.b().a(liverailevent);
            return;
        } else
        {
            r.a();
            return;
        }
_L2:
        obj = new l(0, (String)o.evaluate(String.format(L, new Object[] {
            liverailevent
        }), q(), XPathConstants.STRING), ((com.android.volley.i.b) (obj)), a1);
        liverailevent = ((LiveRailEvent) (obj));
          goto _L3
        xpathexpressionexception;
        liverailevent = String.format("Failed to fire event %s", new Object[] {
            liverailevent
        });
        Crashlytics.a(xpathexpressionexception);
        Crashlytics.a((new StringBuilder()).append("Tinder").append(": ").append(liverailevent).toString());
        if (ManagerApp.a)
        {
            Log.e("Tinder", (new StringBuilder()).append(com.tinder.utils.v.a(com.tinder.utils.v.a(), liverailevent)).append(" [reason] ").append(xpathexpressionexception.getMessage()).toString());
        }
        r.a();
        liverailevent = null;
          goto _L3
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        java.util.Map.Entry entry;
        for (Iterator iterator = (new HashMap() {

        final ManagerLiveRail a;

            
            {
                a = ManagerLiveRail.this;
                super();
                put("Magic Pixel URL", a.m);
                put("Campaign ID", a.b);
                put("Creative ID", a.c);
                put("Provider ID", a.d);
                put("Title", a.e);
                put("Subtitle", a.g);
                put("Clickthrough URL", a.f);
                put("Action button title", a.h);
                put("Video URL", a.i);
                put("Share text", a.j);
                put("Share URL", a.k);
                put("Partner logo URL", a.l);
                put("Callbacks for initialization", String.valueOf(a.q.a.size()));
                put("Callbacks for failure", String.valueOf(a.r.a.size()));
            }
    }).entrySet().iterator(); iterator.hasNext(); stringbuffer.append(String.format("%s: %s\n", new Object[] {
    entry.getKey(), entry.getValue()
})))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return stringbuffer.toString();
    }

}

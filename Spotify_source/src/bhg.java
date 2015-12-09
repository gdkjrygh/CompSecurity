// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class bhg
{

    final Context a;
    final caa b;
    final bzm c;
    boolean d;
    ckw e;
    String f;
    private final Object g = new Object();
    private final bks h;
    private final JSONObject i;
    private final bhh j;
    private final VersionInfoParcel k;

    public bhg(Context context, bks bks1, caa caa1, bzm bzm, JSONObject jsonobject, bhh bhh1, VersionInfoParcel versioninfoparcel)
    {
        a = context;
        h = bks1;
        b = caa1;
        c = bzm;
        i = jsonobject;
        j = bhh1;
        k = versioninfoparcel;
    }

    public bha a(android.view.View.OnClickListener onclicklistener)
    {
        Object obj = j.l();
        if (obj == null)
        {
            return null;
        } else
        {
            obj = new bha(a, ((bgz) (obj)));
            ((bha) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            ((bha) (obj)).a.setOnClickListener(onclicklistener);
            ((bha) (obj)).a.setContentDescription("Ad attribution icon");
            return ((bha) (obj));
        }
    }

    public void a()
    {
        btl.b("recordImpression must be called on the main UI thread.");
        d = true;
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("ad", i);
            b.a("google.afma.nativeAds.handleImpressionPing", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            bka.b("Unable to create impression JSON.", jsonexception);
        }
    }

    public void a(View view)
    {
    }

    public void a(View view, Map map, JSONObject jsonobject, JSONObject jsonobject1)
    {
        btl.b("performClick must be called on the main UI thread.");
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
            a((String)entry.getKey(), jsonobject, jsonobject1);
            break;
        } while (true);
    }

    public final void a(String s, JSONObject jsonobject, JSONObject jsonobject1)
    {
        btl.b("performClick must be called on the main UI thread.");
        JSONObject jsonobject2 = new JSONObject();
        jsonobject2.put("asset", s);
        jsonobject2.put("template", j.j());
        s = new JSONObject();
        s.put("ad", i);
        s.put("click", jsonobject2);
        boolean flag;
        if (h.a(j.k()) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            s.put("has_custom_click_handler", flag);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bka.b("Unable to create click JSON.", s);
            return;
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        s.put("view_rectangles", jsonobject);
        if (jsonobject1 == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        s.put("click_point", jsonobject1);
        b.a("google.afma.nativeAds.handleClickGmsg", s);
        return;
    }

    public final void b(View view)
    {
label0:
        {
            synchronized (g)
            {
                if (!d)
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

    public ckw c()
    {
        bkv.f();
        e = clc.a(a, AdSizeParcel.a(), false, false, c, k);
        e.b().setVisibility(8);
        b.a("/loadHtml", new cdi() {

            final bhg a;

            public final void a(ckw ckw1, Map map)
            {
                a.e.k().d = new cky(this, map) {

                    private Map a;
                    private _cls1 b;

                    public final void a(ckw ckw1, boolean flag)
                    {
                        b.a.f = (String)a.get("id");
                        ckw1 = new JSONObject();
                        try
                        {
                            ckw1.put("messageType", "htmlLoaded");
                            ckw1.put("id", b.a.f);
                            b.a.b.b("sendMessageToNativeJs", ckw1);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (ckw ckw1)
                        {
                            bka.b("Unable to dispatch sendMessageToNativeJsevent", ckw1);
                        }
                    }

            
            {
                b = _pcls1;
                a = map;
                super();
            }
                };
                ckw1 = (String)map.get("overlayHtml");
                map = (String)map.get("baseUrl");
                if (TextUtils.isEmpty(map))
                {
                    a.e.loadData(ckw1, "text/html", "UTF-8");
                    return;
                } else
                {
                    a.e.loadDataWithBaseURL(map, ckw1, "text/html", "UTF-8", null);
                    return;
                }
            }

            
            {
                a = bhg.this;
                super();
            }
        });
        b.a("/showOverlay", new cdi() {

            private bhg a;

            public final void a(ckw ckw1, Map map)
            {
                a.e.b().setVisibility(0);
            }

            
            {
                a = bhg.this;
                super();
            }
        });
        b.a("/hideOverlay", new cdi() {

            private bhg a;

            public final void a(ckw ckw1, Map map)
            {
                a.e.b().setVisibility(8);
            }

            
            {
                a = bhg.this;
                super();
            }
        });
        e.k().a("/hideOverlay", new cdi() {

            private bhg a;

            public final void a(ckw ckw1, Map map)
            {
                a.e.b().setVisibility(8);
            }

            
            {
                a = bhg.this;
                super();
            }
        });
        e.k().a("/sendMessageToSdk", new cdi() {

            private bhg a;

            public final void a(ckw ckw1, Map map)
            {
                ckw1 = new JSONObject();
                try
                {
                    String s;
                    for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); ckw1.put(s, map.get(s)))
                    {
                        s = (String)iterator.next();
                    }

                }
                // Misplaced declaration of an exception variable
                catch (ckw ckw1)
                {
                    bka.b("Unable to dispatch sendMessageToNativeJs event", ckw1);
                    return;
                }
                ckw1.put("id", a.f);
                a.b.b("sendMessageToNativeJs", ckw1);
                return;
            }

            
            {
                a = bhg.this;
                super();
            }
        });
        return e;
    }
}

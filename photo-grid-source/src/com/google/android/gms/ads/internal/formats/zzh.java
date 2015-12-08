// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.ad;
import com.google.android.gms.internal.bg;
import com.google.android.gms.internal.ry;
import com.google.android.gms.internal.sf;
import com.google.android.gms.internal.zzja;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            a, b, d, e, 
//            f, g

public class zzh
{

    private final Object a = new Object();
    private final zzn b;
    private final Context c;
    private final JSONObject d;
    private final bg e;
    private final zza f;
    private final ad g;
    private final VersionInfoParcel h;
    private boolean i;
    private ry j;
    private String k;

    public zzh(Context context, zzn zzn1, bg bg1, ad ad1, JSONObject jsonobject, zza zza1, VersionInfoParcel versioninfoparcel)
    {
        c = context;
        b = zzn1;
        e = bg1;
        g = ad1;
        d = jsonobject;
        f = zza1;
        h = versioninfoparcel;
    }

    static String a(zzh zzh1)
    {
        return zzh1.k;
    }

    static String a(zzh zzh1, String s)
    {
        zzh1.k = s;
        return s;
    }

    static bg b(zzh zzh1)
    {
        return zzh1.e;
    }

    static ry c(zzh zzh1)
    {
        return zzh1.j;
    }

    protected final void a()
    {
        i = true;
    }

    public Context getContext()
    {
        return c;
    }

    public void recordImpression()
    {
        bl.b("recordImpression must be called on the main UI thread.");
        i = true;
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("ad", d);
            e.a("google.afma.nativeAds.handleImpressionPing", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Unable to create impression JSON.", jsonexception);
        }
    }

    public a zza(android.view.View.OnClickListener onclicklistener)
    {
        Object obj = f.zzdz();
        if (obj == null)
        {
            return null;
        } else
        {
            obj = new a(c, ((com.google.android.gms.ads.internal.formats.zza) (obj)));
            ((a) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            ((a) (obj)).a().setOnClickListener(onclicklistener);
            ((a) (obj)).a().setContentDescription("Ad attribution icon");
            return ((a) (obj));
        }
    }

    public void zza(View view, Map map, JSONObject jsonobject, JSONObject jsonobject1)
    {
        bl.b("performClick must be called on the main UI thread.");
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
            zza((String)entry.getKey(), jsonobject, jsonobject1);
            break;
        } while (true);
    }

    public void zza(String s, JSONObject jsonobject, JSONObject jsonobject1)
    {
        bl.b("performClick must be called on the main UI thread.");
        JSONObject jsonobject2 = new JSONObject();
        jsonobject2.put("asset", s);
        jsonobject2.put("template", f.zzdy());
        s = new JSONObject();
        s.put("ad", d);
        s.put("click", jsonobject2);
        boolean flag;
        if (b.zzr(f.getCustomTemplateId()) != null)
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
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Unable to create click JSON.", s);
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
        e.a("google.afma.nativeAds.handleClickGmsg", s);
        return;
    }

    public void zzb(MotionEvent motionevent)
    {
        g.a(motionevent);
    }

    public ry zzdC()
    {
        zzp.zzbw();
        j = sf.a(c, AdSizeParcel.zzs(c), false, false, g, h);
        j.b().setVisibility(8);
        e.a("/loadHtml", new b(this));
        e.a("/showOverlay", new d(this));
        e.a("/hideOverlay", new e(this));
        j.k().zza("/hideOverlay", new f(this));
        j.k().zza("/sendMessageToSdk", new g(this));
        return j;
    }

    public void zzh(View view)
    {
    }

    public void zzi(View view)
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
        recordImpression();
        obj;
        JVM INSTR monitorexit ;
    }

    private class zza
    {

        public abstract String getCustomTemplateId();

        public abstract void zza(zzh zzh1);

        public abstract String zzdy();

        public abstract com.google.android.gms.ads.internal.formats.zza zzdz();
    }

}

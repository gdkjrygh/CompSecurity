// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.formats.zzh;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.b.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            pa, pb, rg, na, 
//            qr, eo, ey, nd, 
//            nc, my, bg, cy, 
//            cx, rf, qa, bj, 
//            mw, ne, mx, nf, 
//            nb, rh, mz, ri, 
//            rl, ad, bi

public final class mv
    implements Callable
{

    private static final long a;
    private final Context b;
    private final qr c;
    private final zzn d;
    private final ad e;
    private final bi f;
    private final Object g = new Object();
    private final pb h;
    private boolean i;
    private int j;
    private List k;

    public mv(Context context, zzn zzn1, bi bi, qr qr1, ad ad, pb pb1)
    {
        b = context;
        d = zzn1;
        c = qr1;
        f = bi;
        h = pb1;
        e = ad;
        i = false;
        j = -2;
        k = null;
    }

    static zzn a(mv mv1)
    {
        return mv1.d;
    }

    private pa a(com.google.android.gms.ads.internal.formats.zzh.zza zza)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        int i1 = j;
        int l;
        l = i1;
        if (zza != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        l = i1;
        if (j == -2)
        {
            l = 0;
        }
        obj;
        JVM INSTR monitorexit ;
        if (l != -2)
        {
            zza = null;
        }
        return new pa(h.a.zzEn, null, h.b.zzyY, l, h.b.zzyZ, k, h.b.orientation, h.b.zzzc, h.a.zzEq, false, null, null, null, null, null, 0L, h.d, h.b.zzEJ, h.f, h.g, h.b.zzEP, h.h, zza);
        zza;
        obj;
        JVM INSTR monitorexit ;
        throw zza;
    }

    private rl a(JSONObject jsonobject, boolean flag, boolean flag1)
    {
        double d1;
        String s;
        if (flag)
        {
            s = jsonobject.getString("url");
        } else
        {
            s = jsonobject.optString("url");
        }
        d1 = jsonobject.optDouble("scale", 1.0D);
        if (TextUtils.isEmpty(s))
        {
            a(0, flag);
            return new rg(null);
        }
        if (flag1)
        {
            return new rg(new zzc(null, Uri.parse(s), d1));
        } else
        {
            return c.a(s, new na(this, flag, d1, s));
        }
    }

    private static Integer a(JSONObject jsonobject, String s)
    {
        int l;
        try
        {
            jsonobject = jsonobject.getJSONObject(s);
            l = Color.rgb(jsonobject.getInt("r"), jsonobject.getInt("g"), jsonobject.getInt("b"));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return Integer.valueOf(l);
    }

    static List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add((Drawable)com.google.android.gms.b.d.a(((zzc)list.next()).zzdv()))) { }
        return arraylist;
    }

    static void a(mv mv1, eo eo1, String s)
    {
        try
        {
            mv1 = mv1.d.zzr(eo1.getCustomTemplateId());
        }
        // Misplaced declaration of an exception variable
        catch (mv mv1)
        {
            zzb.zzd((new StringBuilder("Failed to call onCustomClick for asset ")).append(s).append(".").toString(), mv1);
            return;
        }
        if (mv1 == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        mv1.a(eo1, s);
    }

    private pa b()
    {
        if (!a()) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
_L13:
        if (!a()) goto _L4; else goto _L3
_L3:
        Object obj2 = null;
_L14:
        Object obj;
        if (a())
        {
            break MISSING_BLOCK_LABEL_717;
        }
        obj = ((JSONObject) (obj2)).getString("template_id");
        if (h.a.zzqB == null) goto _L6; else goto _L5
_L5:
        boolean flag = h.a.zzqB.zzwR;
_L18:
        if (h.a.zzqB == null) goto _L8; else goto _L7
_L7:
        boolean flag1 = h.a.zzqB.zzwT;
_L19:
        if (!"2".equals(obj)) goto _L10; else goto _L9
_L9:
        obj = new nd(flag, flag1);
_L15:
        if (!a()) goto _L12; else goto _L11
_L11:
        obj = null;
_L16:
        if (obj instanceof zzf)
        {
            Object obj3 = (zzf)obj;
            obj2 = new nc(this);
            obj3 = new my(this, ((zzf) (obj3)));
            obj2.a = ((fz) (obj3));
            ((bg) (obj1)).a("/nativeAdCustomClick", ((fz) (obj3)));
        }
        return a(((com.google.android.gms.ads.internal.formats.zzh.zza) (obj)));
_L2:
        obj = cy.Z;
        obj1 = (String)zzp.zzbE().a(((cq) (obj)));
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versioninfoparcel;
        ad ad;
        rf rf2;
        if (h.b.zzBF.indexOf("https") == 0)
        {
            obj = "https:";
        } else
        {
            obj = "http:";
        }
        obj = (new StringBuilder()).append(((String) (obj))).append(((String) (obj1))).toString();
        obj1 = f;
        obj2 = b;
        versioninfoparcel = h.a.zzqj;
        ad = e;
        rf2 = new rf();
        qa.a.post(new bj(((bi) (obj1)), ((Context) (obj2)), versioninfoparcel, rf2, ad, ((String) (obj))));
        obj1 = (bg)rf2.get(a, TimeUnit.MILLISECONDS);
        ((bg) (obj1)).a(d, d, d, d);
          goto _L13
_L4:
        obj = new rf();
        obj2 = new nc(this);
        mw mw1 = new mw(this, ((bg) (obj1)), ((nc) (obj2)), ((rf) (obj)));
        obj2.a = mw1;
        ((bg) (obj1)).a("/nativeAdPreProcess", mw1);
        ((bg) (obj1)).a("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(h.b.body));
        obj2 = (JSONObject)((rf) (obj)).get(a, TimeUnit.MILLISECONDS);
          goto _L14
_L10:
label0:
        {
            if (!"1".equals(obj))
            {
                break label0;
            }
            obj = new ne(flag, flag1);
        }
          goto _L15
label1:
        {
            if (!"3".equals(obj))
            {
                break MISSING_BLOCK_LABEL_552;
            }
            obj = ((JSONObject) (obj2)).getString("custom_template_id");
            rf rf1 = new rf();
            qa.a.post(new mx(this, rf1, ((String) (obj))));
            if (rf1.get(a, TimeUnit.MILLISECONDS) == null)
            {
                break label1;
            }
            obj = new nf(flag);
        }
          goto _L15
        List list;
        try
        {
            zzb.e((new StringBuilder("No handler for custom template: ")).append(((JSONObject) (obj2)).getString("custom_template_id")).toString());
            break MISSING_BLOCK_LABEL_717;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzb.zzd("Malformed native JSON response.", ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzb.zzd("Timeout when loading native ad.", ((Throwable) (obj)));
        }
        break MISSING_BLOCK_LABEL_561;
        a(0);
        break MISSING_BLOCK_LABEL_717;
        if (!i)
        {
            a(0);
        }
        return a(((com.google.android.gms.ads.internal.formats.zzh.zza) (null)));
_L12:
        list = b(((JSONObject) (obj2)).getJSONObject("tracking_urls_and_actions"), "impression_tracking_urls");
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_658;
        }
        list = null;
_L17:
        k = list;
        obj = ((nb) (obj)).a(this, ((JSONObject) (obj2)));
        ((com.google.android.gms.ads.internal.formats.zzh.zza) (obj)).zza(new zzh(b, d, ((bg) (obj1)), e, ((JSONObject) (obj2)), ((com.google.android.gms.ads.internal.formats.zzh.zza) (obj)), h.a.zzqj));
          goto _L16
        list = Arrays.asList(list);
          goto _L17
_L6:
        flag = false;
          goto _L18
_L8:
        flag1 = false;
          goto _L19
        obj = null;
          goto _L15
    }

    private static String[] b(JSONObject jsonobject, String s)
    {
        jsonobject = jsonobject.optJSONArray(s);
        if (jsonobject == null)
        {
            return null;
        }
        s = new String[jsonobject.length()];
        for (int l = 0; l < jsonobject.length(); l++)
        {
            s[l] = jsonobject.getString(l);
        }

        return s;
    }

    public final rl a(JSONObject jsonobject)
    {
        JSONObject jsonobject1 = jsonobject.optJSONObject("attribution");
        if (jsonobject1 == null)
        {
            return new rg(null);
        }
        Object obj = jsonobject1.optString("text");
        int l = jsonobject1.optInt("text_size", -1);
        Object obj1 = a(jsonobject1, "text_color");
        Integer integer = a(jsonobject1, "bg_color");
        int i1 = jsonobject1.optInt("animation_ms", 1000);
        int j1 = jsonobject1.optInt("presentation_ms", 4000);
        jsonobject = new ArrayList();
        if (jsonobject1.optJSONArray("images") != null)
        {
            jsonobject = a(jsonobject1, "images", false, false, true);
        } else
        {
            jsonobject.add(a(jsonobject1, "image", false, false));
        }
        jsonobject = rh.a(jsonobject);
        obj = new mz(this, ((String) (obj)), integer, ((Integer) (obj1)), l, j1, i1);
        obj1 = new rf();
        jsonobject.a(new ri(((rf) (obj1)), ((rk) (obj)), jsonobject));
        return ((rl) (obj1));
    }

    public final rl a(JSONObject jsonobject, String s, boolean flag, boolean flag1)
    {
        if (flag)
        {
            jsonobject = jsonobject.getJSONObject(s);
        } else
        {
            jsonobject = jsonobject.optJSONObject(s);
        }
        s = jsonobject;
        if (jsonobject == null)
        {
            s = new JSONObject();
        }
        return a(((JSONObject) (s)), flag, flag1);
    }

    public final List a(JSONObject jsonobject, String s, boolean flag, boolean flag1, boolean flag2)
    {
        ArrayList arraylist;
        if (flag)
        {
            jsonobject = jsonobject.getJSONArray(s);
        } else
        {
            jsonobject = jsonobject.optJSONArray(s);
        }
        arraylist = new ArrayList();
        if (jsonobject == null || jsonobject.length() == 0)
        {
            a(0, flag);
            return arraylist;
        }
        int l;
        int i1;
        if (flag2)
        {
            l = jsonobject.length();
        } else
        {
            l = 1;
        }
        for (i1 = 0; i1 < l; i1++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
            s = jsonobject1;
            if (jsonobject1 == null)
            {
                s = new JSONObject();
            }
            arraylist.add(a(((JSONObject) (s)), flag, flag1));
        }

        return arraylist;
    }

    public final Future a(JSONObject jsonobject, String s, boolean flag)
    {
        s = jsonobject.getJSONObject(s);
        boolean flag1 = s.optBoolean("require", true);
        jsonobject = s;
        if (s == null)
        {
            jsonobject = new JSONObject();
        }
        return a(jsonobject, flag1, flag);
    }

    public final void a(int l)
    {
        synchronized (g)
        {
            i = true;
            j = l;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int l, boolean flag)
    {
        if (flag)
        {
            a(l);
        }
    }

    public final boolean a()
    {
        boolean flag;
        synchronized (g)
        {
            flag = i;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Object call()
    {
        return b();
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(60L);
    }
}

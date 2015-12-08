// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
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
import java.util.ArrayList;
import java.util.Arrays;
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
//            gl, hi, ha, hh, 
//            ac, br, bv, ay, 
//            au, ad, fh, fi, 
//            gw, fj, hj, n, 
//            hk

public class fg
    implements Callable
{

    private static final long a;
    private final Context b;
    private final ha c;
    private final zzn d;
    private final n e;
    private final ad f;
    private final Object g = new Object();
    private final gl.a h;
    private boolean i;
    private int j;
    private List k;

    public fg(Context context, zzn zzn1, ad ad1, ha ha1, n n, gl.a a1)
    {
        b = context;
        d = zzn1;
        c = ha1;
        f = ad1;
        h = a1;
        e = n;
        i = false;
        j = -2;
        k = null;
    }

    private com.google.android.gms.ads.internal.formats.zzh.zza a(ac ac1, a a1, JSONObject jsonobject)
        throws ExecutionException, InterruptedException, JSONException
    {
        if (b())
        {
            return null;
        }
        List list = b(jsonobject.getJSONObject("tracking_urls_and_actions"), "impression_tracking_urls");
    /* block-local class not found */
    class a {}

        if (list == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(list);
        }
        k = list;
        a1 = a1.a(this, jsonobject);
        if (a1 == null)
        {
            zzb.e("Failed to retrieve ad assets.");
            return null;
        } else
        {
            a1.zza(new zzh(b, d, ac1, e, jsonobject, a1, h.a.zzqb));
            return a1;
        }
    }

    static zzn a(fg fg1)
    {
        return fg1.d;
    }

    private gl a(com.google.android.gms.ads.internal.formats.zzh.zza zza)
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
        return new gl(h.a.zzDy, null, h.b.zzyw, l, h.b.zzyx, k, h.b.orientation, h.b.zzyA, h.a.zzDB, false, null, null, null, null, null, 0L, h.d, h.b.zzDW, h.f, h.g, h.b.zzEc, h.h, zza, h.a.zzDO);
        zza;
        obj;
        JVM INSTR monitorexit ;
        throw zza;
    }

    private hk a(JSONObject jsonobject, boolean flag, boolean flag1)
        throws JSONException
    {
        if (flag)
        {
            jsonobject = jsonobject.getString("url");
        } else
        {
            jsonobject = jsonobject.optString("url");
        }
        if (TextUtils.isEmpty(jsonobject))
        {
            a(0, flag);
            return new hi(null);
        }
        if (flag1)
        {
            return new hi(new zzc(null, Uri.parse(jsonobject)));
        } else
        {
            return c.a(jsonobject, new _cls4(flag, jsonobject));
        }
    }

    private Integer a(JSONObject jsonobject, String s)
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

    private JSONObject a(ac ac1)
        throws TimeoutException, JSONException
    {
        if (b())
        {
            return null;
        } else
        {
            hh hh1 = new hh();
    /* block-local class not found */
    class b {}

            b b1 = new b();
            _cls1 _lcls1 = new _cls1(ac1, b1, hh1);
            b1.a = _lcls1;
            ac1.a("/nativeAdPreProcess", _lcls1);
            ac1.a("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(h.b.body));
            return (JSONObject)hh1.get(a, TimeUnit.MILLISECONDS);
        }
    }

    private void a(com.google.android.gms.ads.internal.formats.zzh.zza zza, ac ac1)
    {
        if (!(zza instanceof zzf))
        {
            return;
        } else
        {
            Object obj = (zzf)zza;
            zza = new b();
            obj = new _cls2(((zzf) (obj)));
            zza.a = ((ch) (obj));
            ac1.a("/nativeAdCustomClick", ((ch) (obj)));
            return;
        }
    }

    private void a(br br1, String s)
    {
        bv bv1;
        try
        {
            bv1 = d.zzr(br1.getCustomTemplateId());
        }
        // Misplaced declaration of an exception variable
        catch (br br1)
        {
            zzb.zzd((new StringBuilder()).append("Failed to call onCustomClick for asset ").append(s).append(".").toString(), br1);
            return;
        }
        if (bv1 == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        bv1.a(br1, s);
    }

    static void a(fg fg1, br br1, String s)
    {
        fg1.a(br1, s);
    }

    private String[] b(JSONObject jsonobject, String s)
        throws JSONException
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

    private ac c()
        throws CancellationException, ExecutionException, InterruptedException, TimeoutException
    {
        if (b())
        {
            return null;
        }
        String s = (String)ay.Z.c();
        Object obj;
        if (h.b.zzAT.indexOf("https") == 0)
        {
            obj = "https:";
        } else
        {
            obj = "http:";
        }
        obj = (new StringBuilder()).append(((String) (obj))).append(s).toString();
        obj = (ac)f.a(b, h.a.zzqb, ((String) (obj)), e).get(a, TimeUnit.MILLISECONDS);
        ((ac) (obj)).a(d, d, d, d, false, null, null, null, null);
        return ((ac) (obj));
    }

    protected a a(JSONObject jsonobject)
        throws JSONException, TimeoutException
    {
        if (b())
        {
            return null;
        }
        String s = jsonobject.getString("template_id");
        boolean flag;
        boolean flag1;
        if (h.a.zzqt != null)
        {
            flag = h.a.zzqt.zzwn;
        } else
        {
            flag = false;
        }
        if (h.a.zzqt != null)
        {
            flag1 = h.a.zzqt.zzwp;
        } else
        {
            flag1 = false;
        }
        if ("2".equals(s))
        {
            return new fh(flag, flag1);
        }
        if ("1".equals(s))
        {
            return new fi(flag, flag1);
        }
        if ("3".equals(s))
        {
            String s1 = jsonobject.getString("custom_template_id");
            hh hh1 = new hh();
            gw.a.post(new zzgf._cls2(this, hh1, s1));
            if (hh1.get(a, TimeUnit.MILLISECONDS) != null)
            {
                return new fj(flag);
            }
            zzb.e((new StringBuilder()).append("No handler for custom template: ").append(jsonobject.getString("custom_template_id")).toString());
        } else
        {
            a(0);
        }
        return null;
    }

    public gl a()
    {
        Object obj;
        obj = c();
        Object obj2 = a(((ac) (obj)));
        obj2 = a(((ac) (obj)), a(((JSONObject) (obj2))), ((JSONObject) (obj2)));
        a(((com.google.android.gms.ads.internal.formats.zzh.zza) (obj2)), ((ac) (obj)));
        obj = a(((com.google.android.gms.ads.internal.formats.zzh.zza) (obj2)));
        return ((gl) (obj));
        Object obj1;
        obj1;
        zzb.zzd("Malformed native JSON response.", ((Throwable) (obj1)));
_L2:
        if (!i)
        {
            a(0);
        }
        return a(((com.google.android.gms.ads.internal.formats.zzh.zza) (null)));
        obj1;
        zzb.zzd("Timeout when loading native ad.", ((Throwable) (obj1)));
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public hk a(JSONObject jsonobject, String s, boolean flag, boolean flag1)
        throws JSONException
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

    public List a(JSONObject jsonobject, String s, boolean flag, boolean flag1, boolean flag2)
        throws JSONException
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

    public Future a(JSONObject jsonobject, String s, boolean flag)
        throws JSONException
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

    public void a(int l)
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

    public void a(int l, boolean flag)
    {
        if (flag)
        {
            a(l);
        }
    }

    public hk b(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONObject("attribution");
        if (jsonobject == null)
        {
            return new hi(null);
        } else
        {
            String s = jsonobject.optString("text");
            int l = jsonobject.optInt("text_size", -1);
            Integer integer = a(jsonobject, "text_color");
            Integer integer1 = a(jsonobject, "bg_color");
            return hj.a(a(jsonobject, "image", false, false), new _cls3(s, integer1, integer, l));
        }
    }

    public boolean b()
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

    public Object call()
        throws Exception
    {
        return a();
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(60L);
    }

    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}

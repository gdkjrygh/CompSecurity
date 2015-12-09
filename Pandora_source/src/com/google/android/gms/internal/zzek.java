// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.common.internal.zzv;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
//            zzbi, zzfa, zzfs, zzy, 
//            zzat, zzap, zzz, zzft, 
//            zzfo, zzel, zzem, zzfu, 
//            zzk, zzfv, zzbs, zzgd, 
//            zzbe, zzhy

public class zzek
    implements Callable
{
    class a
    {

        public zzbs a;
        final zzek b;

        a()
        {
            b = zzek.this;
            super();
        }
    }

    public static interface zza
    {

        public abstract zzbi.zza zza(zzek zzek1, JSONObject jsonobject)
            throws JSONException, InterruptedException, ExecutionException;
    }


    private static final long zzyv;
    private final Context mContext;
    private final Object zzoe = new Object();
    private final com.google.android.gms.ads.internal.zza zzsS;
    private final zzk zzsW;
    private final zzfa.zza zzyh;
    private int zzyl;
    private final zzfo zzyw;
    private final zzz zzyx;
    private boolean zzyy;
    private List zzyz;

    public zzek(Context context, com.google.android.gms.ads.internal.zza zza1, zzz zzz1, zzfo zzfo1, zzk zzk, zzfa.zza zza2)
    {
        mContext = context;
        zzsS = zza1;
        zzyw = zzfo1;
        zzyx = zzz1;
        zzyh = zza2;
        zzsW = zzk;
        zzyy = false;
        zzyl = -2;
        zzyz = null;
    }

    private zzbi.zza zza(zzy zzy1, zza zza1, JSONObject jsonobject)
        throws ExecutionException, InterruptedException, JSONException
    {
        if (zzek())
        {
            return null;
        }
        List list = zzc(jsonobject.getJSONObject("tracking_urls_and_actions"), "impression_tracking_urls");
        if (list == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(list);
        }
        zzyz = list;
        zza1 = zza1.zza(this, jsonobject);
        if (zza1 == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzak("Failed to retrieve ad assets.");
            return null;
        } else
        {
            zza1.zza(new zzbi(mContext, zzsS, zzy1, zzsW, jsonobject, zza1));
            return zza1;
        }
    }

    private zzfa zza(zzbi.zza zza1)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        int j = zzyl;
        int i;
        i = j;
        if (zza1 != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        i = j;
        if (zzyl == -2)
        {
            i = 0;
        }
        obj;
        JVM INSTR monitorexit ;
        if (i != -2)
        {
            zza1 = null;
        }
        return new zzfa(zzyh.zzBy.zzyW, null, zzyh.zzBz.zzuC, i, zzyh.zzBz.zzuD, zzyz, zzyh.zzBz.orientation, zzyh.zzBz.zzuG, zzyh.zzBy.zzyZ, false, null, null, null, null, null, 0L, zzyh.zzmP, zzyh.zzBz.zzzs, zzyh.zzBv, zzyh.zzBw, zzyh.zzBz.zzzy, zzyh.zzBs, zza1, zzyh.zzBy.zzzm);
        zza1;
        obj;
        JVM INSTR monitorexit ;
        throw zza1;
    }

    private Integer zzb(JSONObject jsonobject, String s)
    {
        int i;
        try
        {
            jsonobject = jsonobject.getJSONObject(s);
            i = Color.rgb(jsonobject.getInt("r"), jsonobject.getInt("g"), jsonobject.getInt("b"));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return Integer.valueOf(i);
    }

    private String[] zzc(JSONObject jsonobject, String s)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONArray(s);
        if (jsonobject == null)
        {
            return null;
        }
        s = new String[jsonobject.length()];
        for (int i = 0; i < jsonobject.length(); i++)
        {
            s[i] = jsonobject.getString(i);
        }

        return s;
    }

    private JSONObject zzd(zzy zzy1)
        throws TimeoutException, JSONException
    {
        if (zzek())
        {
            return null;
        } else
        {
            zzfs zzfs1 = new zzfs();
            a a1 = new a();
            zzbs zzbs = new zzbs(zzy1, a1, zzfs1) {

                final zzy a;
                final a b;
                final zzfs c;
                final zzek d;

                public void zza(zzgd zzgd, Map map)
                {
                    a.zzb("/nativeAdPreProcess", b.a);
                    try
                    {
                        zzgd = (String)map.get("success");
                        if (!TextUtils.isEmpty(zzgd))
                        {
                            c.zzc((new JSONObject(zzgd)).getJSONArray("ads").getJSONObject(0));
                            return;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (zzgd zzgd)
                    {
                        com.google.android.gms.ads.internal.util.client.zzb.zzb("Malformed native JSON response.", zzgd);
                    }
                    d.zzv(0);
                    com.google.android.gms.common.internal.zzv.zza(d.zzek(), "Unable to set the ad state error!");
                    c.zzc(null);
                }

            
            {
                d = zzek.this;
                a = zzy1;
                b = a1;
                c = zzfs1;
                super();
            }
            };
            a1.a = zzbs;
            zzy1.zza("/nativeAdPreProcess", zzbs);
            zzy1.zza("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(zzyh.zzBz.zzzr));
            return (JSONObject)zzfs1.get(zzyv, TimeUnit.MILLISECONDS);
        }
    }

    private zzy zzej()
        throws CancellationException, ExecutionException, InterruptedException, TimeoutException
    {
        if (zzek())
        {
            return null;
        }
        String s = (String)zzat.zzrU.get();
        Object obj;
        if (zzyh.zzBz.zzwB.indexOf("https") == 0)
        {
            obj = "https:";
        } else
        {
            obj = "http:";
        }
        obj = (new StringBuilder()).append(((String) (obj))).append(s).toString();
        obj = (zzy)zzyx.zza(mContext, zzyh.zzBy.zzmJ, ((String) (obj))).get(zzyv, TimeUnit.MILLISECONDS);
        ((zzy) (obj)).zza(zzsS, zzsS, zzsS, zzsS, false, zzsS, zzsS, null, zzsS);
        return ((zzy) (obj));
    }

    public Object call()
        throws Exception
    {
        return zzei();
    }

    public zzfv zza(JSONObject jsonobject, String s, boolean flag)
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
        if (flag)
        {
            jsonobject = s.getString("url");
        } else
        {
            jsonobject = s.optString("url");
        }
        if (TextUtils.isEmpty(jsonobject))
        {
            zza(0, flag);
            return new zzft(null);
        } else
        {
            return zzyw.zza(jsonobject, new zzfo.zza(flag) {

                final boolean a;
                final zzek b;

                public Drawable a()
                {
                    b.zza(2, a);
                    return null;
                }

                public Drawable a(InputStream inputstream)
                {
                    try
                    {
                        inputstream = zzhy.zzd(inputstream);
                    }
                    // Misplaced declaration of an exception variable
                    catch (InputStream inputstream)
                    {
                        inputstream = null;
                    }
                    if (inputstream == null)
                    {
                        b.zza(2, a);
                        return null;
                    }
                    inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
                    if (inputstream == null)
                    {
                        b.zza(2, a);
                        return null;
                    } else
                    {
                        return new BitmapDrawable(Resources.getSystem(), inputstream);
                    }
                }

                public Object zzb(InputStream inputstream)
                {
                    return a(inputstream);
                }

                public Object zzem()
                {
                    return a();
                }

            
            {
                b = zzek.this;
                a = flag;
                super();
            }
            });
        }
    }

    public void zza(int i, boolean flag)
    {
        if (flag)
        {
            zzv(i);
        }
    }

    protected zza zzd(JSONObject jsonobject)
        throws JSONException
    {
        if (zzek())
        {
            return null;
        }
        jsonobject = jsonobject.getString("template_id");
        if ("2".equals(jsonobject))
        {
            return new zzel();
        }
        if ("1".equals(jsonobject))
        {
            return new zzem();
        } else
        {
            zzv(0);
            return null;
        }
    }

    public zzfv zze(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONObject("attribution");
        if (jsonobject == null)
        {
            return new zzft(null);
        } else
        {
            String s = jsonobject.optString("text");
            int i = jsonobject.optInt("text_size", -1);
            Integer integer = zzb(jsonobject, "text_color");
            Integer integer1 = zzb(jsonobject, "bg_color");
            return com.google.android.gms.internal.zzfu.zza(zza(jsonobject, "image", false), new zzfu.zza(s, integer1, integer, i) {

                final String a;
                final Integer b;
                final Integer c;
                final int d;
                final zzek e;

                public zzbe a(Drawable drawable)
                {
                    Integer integer2 = null;
                    if (drawable == null || TextUtils.isEmpty(a))
                    {
                        return null;
                    }
                    String s1 = a;
                    Integer integer3 = b;
                    Integer integer4 = c;
                    if (d > 0)
                    {
                        integer2 = Integer.valueOf(d);
                    }
                    return new zzbe(s1, drawable, integer3, integer4, integer2);
                }

                public Object zzb(Object obj)
                {
                    return a((Drawable)obj);
                }

            
            {
                e = zzek.this;
                a = s;
                b = integer;
                c = integer1;
                d = i;
                super();
            }
            });
        }
    }

    public zzfa zzei()
    {
        Object obj;
        obj = zzej();
        JSONObject jsonobject = zzd(((zzy) (obj)));
        obj = zza(zza(((zzy) (obj)), zzd(jsonobject), jsonobject));
        return ((zzfa) (obj));
        Object obj1;
        obj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Malformed native JSON response.", ((Throwable) (obj1)));
_L2:
        if (!zzyy)
        {
            zzv(0);
        }
        return zza(null);
        obj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Timeout when loading native ad.", ((Throwable) (obj1)));
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean zzek()
    {
        boolean flag;
        synchronized (zzoe)
        {
            flag = zzyy;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzv(int i)
    {
        synchronized (zzoe)
        {
            zzyy = true;
            zzyl = i;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        zzyv = TimeUnit.SECONDS.toMillis(60L);
    }
}

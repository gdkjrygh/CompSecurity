// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx, zzcn, zzhe, zzgo, 
//            zzgq, zzhq, zzah, zzai, 
//            zzhr, zzht, zzgu, zzgv, 
//            zzt, zzcv, zzic, zzlz

public class zzgt
    implements Callable
{
    public static interface zza
    {

        public abstract zzcn.zza zza(zzgt zzgt1, JSONObject jsonobject);
    }

    class zzb
    {

        final zzgt zzxc;
        public zzcv zzxe;

        zzb()
        {
            zzxc = zzgt.this;
            super();
        }
    }


    private final Context mContext;
    private final Object zznh = new Object();
    private final zzt zzrv;
    private final zzhe.zza zzvN;
    private int zzvR;
    private final zzht zzwV;
    private final zzai zzwW;
    private boolean zzwX;
    private List zzwY;

    public zzgt(Context context, zzt zzt, zzai zzai1, zzht zzht1, zzhe.zza zza1)
    {
        mContext = context;
        zzrv = zzt;
        zzwV = zzht1;
        zzwW = zzai1;
        zzvN = zza1;
        zzwX = false;
        zzvR = -2;
        zzwY = null;
    }

    private zzcn.zza zza(zzah zzah1, zza zza1, JSONObject jsonobject)
    {
        if (zzdO())
        {
            return null;
        }
        List list = zzb(jsonobject.getJSONObject("tracking_urls_and_actions"), "impression_tracking_urls");
        if (list == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(list);
        }
        zzwY = list;
        zza1 = zza1.zza(this, jsonobject);
        if (zza1 == null)
        {
            zzhx.zzZ("Failed to retrieve ad assets.");
            return null;
        } else
        {
            zza1.zza(new zzcn(zzrv, zzah1, jsonobject));
            return zza1;
        }
    }

    private zzhe zza(zzcn.zza zza1)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        int j = zzvR;
        int i;
        i = j;
        if (zza1 != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        i = j;
        if (zzvR == -2)
        {
            i = 0;
        }
        obj;
        JVM INSTR monitorexit ;
        if (i != -2)
        {
            zza1 = null;
        }
        return new zzhe(zzvN.zzyy.zzwn, null, zzvN.zzyz.zzst, i, zzvN.zzyz.zzsu, zzwY, zzvN.zzyz.orientation, zzvN.zzyz.zzsx, zzvN.zzyy.zzwq, false, null, null, null, null, null, 0L, zzvN.zzlV, zzvN.zzyz.zzwH, zzvN.zzyv, zzvN.zzyw, zzvN.zzyz.zzwN, zzvN.zzys, zza1, zzvN.zzyy.zzwD);
        zza1;
        obj;
        JVM INSTR monitorexit ;
        throw zza1;
    }

    private String[] zzb(JSONObject jsonobject, String s)
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

    private JSONObject zzc(zzah zzah1)
    {
        if (zzdO())
        {
            return null;
        } else
        {
            zzhq zzhq1 = new zzhq();
            zzb zzb1 = new zzb();
            zzcv zzcv = new zzcv(zzah1, zzb1, zzhq1) {

                final zzah zzwZ;
                final zzb zzxa;
                final zzhq zzxb;
                final zzgt zzxc;

                public void zza(zzic zzic, Map map)
                {
                    zzwZ.zzb("/nativeAdPreProcess", zzxa.zzxe);
                    try
                    {
                        zzic = (String)map.get("success");
                        if (!TextUtils.isEmpty(zzic))
                        {
                            zzxb.zzb((new JSONObject(zzic)).getJSONArray("ads").getJSONObject(0));
                            return;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (zzic zzic)
                    {
                        zzhx.zzb("Malformed native JSON response.", zzic);
                    }
                    zzxc.zzx(0);
                    com.google.android.gms.common.internal.zzx.zza(zzxc.zzdO(), "Unable to set the ad state error!");
                    zzxb.zzb(null);
                }

            
            {
                zzxc = zzgt.this;
                zzwZ = zzah1;
                zzxa = zzb1;
                zzxb = zzhq1;
                super();
            }
            };
            zzb1.zzxe = zzcv;
            zzah1.zza("/nativeAdPreProcess", zzcv);
            zzah1.zza("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(zzvN.zzyz.zzwG));
            return (JSONObject)zzhq1.get();
        }
    }

    private zzah zzdN()
    {
        if (zzdO())
        {
            return null;
        } else
        {
            zzah zzah1 = (zzah)zzwW.zza(mContext, zzvN.zzyy.zzlP, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html").get();
            zzah1.zza(zzrv, zzrv, zzrv, zzrv, false, zzrv, zzrv, null, zzrv);
            return zzah1;
        }
    }

    public Object call()
    {
        return zzdM();
    }

    public Future zza(JSONObject jsonobject, String s, boolean flag)
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
            return new zzhr(null);
        } else
        {
            return zzwV.zza(jsonobject, new zzht.zza(flag) {

                final zzgt zzxc;
                final boolean zzxd;

                public Drawable zza(InputStream inputstream)
                {
                    try
                    {
                        inputstream = zzlz.zzd(inputstream);
                    }
                    // Misplaced declaration of an exception variable
                    catch (InputStream inputstream)
                    {
                        inputstream = null;
                    }
                    if (inputstream == null)
                    {
                        zzxc.zza(2, zzxd);
                        return null;
                    }
                    inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
                    if (inputstream == null)
                    {
                        zzxc.zza(2, zzxd);
                        return null;
                    } else
                    {
                        return new BitmapDrawable(Resources.getSystem(), inputstream);
                    }
                }

                public Object zzb(InputStream inputstream)
                {
                    return zza(inputstream);
                }

                public Drawable zzdP()
                {
                    zzxc.zza(2, zzxd);
                    return null;
                }

                public Object zzdQ()
                {
                    return zzdP();
                }

            
            {
                zzxc = zzgt.this;
                zzxd = flag;
                super();
            }
            });
        }
    }

    public void zza(int i, boolean flag)
    {
        if (flag)
        {
            zzx(i);
        }
    }

    protected zza zzc(JSONObject jsonobject)
    {
        if (zzdO())
        {
            return null;
        }
        jsonobject = jsonobject.getString("template_id");
        if ("2".equals(jsonobject))
        {
            return new zzgu();
        }
        if ("1".equals(jsonobject))
        {
            return new zzgv();
        } else
        {
            zzx(0);
            return null;
        }
    }

    public zzhe zzdM()
    {
        Object obj;
        obj = zzdN();
        JSONObject jsonobject = zzc(((zzah) (obj)));
        obj = zza(zza(((zzah) (obj)), zzc(jsonobject), jsonobject));
        return ((zzhe) (obj));
        Object obj1;
        obj1;
        zzhx.zzd("Malformed native JSON response.", ((Throwable) (obj1)));
_L2:
        if (!zzwX)
        {
            zzx(0);
        }
        return zza(null);
        obj1;
        zzhx.zzd("Timeout when loading native ad.", ((Throwable) (obj1)));
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean zzdO()
    {
        boolean flag;
        synchronized (zznh)
        {
            flag = zzwX;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzx(int i)
    {
        synchronized (zznh)
        {
            zzwX = true;
            zzvR = i;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}

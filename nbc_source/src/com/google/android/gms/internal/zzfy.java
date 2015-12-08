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
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.formats.zzg;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzm;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zze;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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
//            zzha, zzht, zzho, zzbb, 
//            zzhs, zzcs, zzcw, zzbz, 
//            zzbv, zzbc, zzfz, zzga, 
//            zzhl, zzgb, zzhu, zzan, 
//            zzhv, zzdg, zzid, zzkw, 
//            zzlg

public class zzfy
    implements Callable
{
    public static interface zza
    {

        public abstract com.google.android.gms.ads.internal.formats.zzg.zza zza(zzfy zzfy1, JSONObject jsonobject)
            throws JSONException, InterruptedException, ExecutionException;
    }

    class zzb
    {

        final zzfy zzBO;
        public zzdg zzBX;

        zzb()
        {
            zzBO = zzfy.this;
            super();
        }
    }


    private static final long zzBF;
    private final Context mContext;
    private final zzho zzBG;
    private final zzm zzBH;
    private final zzbc zzBI;
    private boolean zzBJ;
    private List zzBK;
    private final zzha.zza zzBs;
    private int zzBv;
    private final Object zzqt = new Object();
    private final zzan zzvA;

    public zzfy(Context context, zzm zzm1, zzbc zzbc1, zzho zzho1, zzan zzan, zzha.zza zza1)
    {
        mContext = context;
        zzBH = zzm1;
        zzBG = zzho1;
        zzBI = zzbc1;
        zzBs = zza1;
        zzvA = zzan;
        zzBJ = false;
        zzBv = -2;
        zzBK = null;
    }

    private com.google.android.gms.ads.internal.formats.zzg.zza zza(zzbb zzbb1, zza zza1, JSONObject jsonobject)
        throws ExecutionException, InterruptedException, JSONException
    {
        if (zzfr())
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
        zzBK = list;
        zza1 = zza1.zza(this, jsonobject);
        if (zza1 == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaz("Failed to retrieve ad assets.");
            return null;
        } else
        {
            zza1.zza(new zzg(mContext, zzBH, zzbb1, zzvA, jsonobject, zza1));
            return zza1;
        }
    }

    static zzm zza(zzfy zzfy1)
    {
        return zzfy1.zzBH;
    }

    private zzha zza(com.google.android.gms.ads.internal.formats.zzg.zza zza1)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        int j = zzBv;
        int i;
        i = j;
        if (zza1 != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        i = j;
        if (zzBv == -2)
        {
            i = 0;
        }
        obj;
        JVM INSTR monitorexit ;
        if (i != -2)
        {
            zza1 = null;
        }
        return new zzha(zzBs.zzFr.zzCm, null, zzBs.zzFs.zzxF, i, zzBs.zzFs.zzxG, zzBK, zzBs.zzFs.orientation, zzBs.zzFs.zzxJ, zzBs.zzFr.zzCp, false, null, null, null, null, null, 0L, zzBs.zzpN, zzBs.zzFs.zzCJ, zzBs.zzFo, zzBs.zzFp, zzBs.zzFs.zzCP, zzBs.zzFl, zza1, zzBs.zzFr.zzCC);
        zza1;
        obj;
        JVM INSTR monitorexit ;
        throw zza1;
    }

    private zzhv zza(JSONObject jsonobject, boolean flag, boolean flag1)
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
            zza(0, flag);
            return new zzht(null);
        }
        if (flag1)
        {
            return new zzht(new zzc(null, Uri.parse(jsonobject)));
        } else
        {
            return zzBG.zza(jsonobject, new zzho.zza(flag, jsonobject) {

                final zzfy zzBO;
                final boolean zzBW;
                final String zzyL;

                public zzc zzfs()
                {
                    zzBO.zza(2, zzBW);
                    return null;
                }

                public Object zzft()
                {
                    return zzfs();
                }

                public zzc zzg(InputStream inputstream)
                {
                    try
                    {
                        inputstream = zzlg.zzk(inputstream);
                    }
                    // Misplaced declaration of an exception variable
                    catch (InputStream inputstream)
                    {
                        inputstream = null;
                    }
                    if (inputstream == null)
                    {
                        zzBO.zza(2, zzBW);
                        return null;
                    }
                    inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
                    if (inputstream == null)
                    {
                        zzBO.zza(2, zzBW);
                        return null;
                    } else
                    {
                        return new zzc(new BitmapDrawable(Resources.getSystem(), inputstream), Uri.parse(zzyL));
                    }
                }

                public Object zzh(InputStream inputstream)
                {
                    return zzg(inputstream);
                }

            
            {
                zzBO = zzfy.this;
                zzBW = flag;
                zzyL = s;
                super();
            }
            });
        }
    }

    private void zza(com.google.android.gms.ads.internal.formats.zzg.zza zza1, zzbb zzbb1)
    {
        if (!(zza1 instanceof zzf))
        {
            return;
        } else
        {
            Object obj = (zzf)zza1;
            zza1 = new zzb();
            obj = new zzdg(((zzf) (obj))) {

                final zzfy zzBO;
                final zzf zzBR;

                public void zza(zzid zzid, Map map)
                {
                    zzid = (String)map.get("asset");
                    zzfy.zza(zzBO, zzBR, zzid);
                }

            
            {
                zzBO = zzfy.this;
                zzBR = zzf1;
                super();
            }
            };
            zza1.zzBX = ((zzdg) (obj));
            zzbb1.zza("/nativeAdCustomClick", ((zzdg) (obj)));
            return;
        }
    }

    static void zza(zzfy zzfy1, zzcs zzcs1, String s)
    {
        zzfy1.zzb(zzcs1, s);
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

    private JSONObject zzb(zzbb zzbb1)
        throws TimeoutException, JSONException
    {
        if (zzfr())
        {
            return null;
        } else
        {
            zzhs zzhs1 = new zzhs();
            zzb zzb1 = new zzb();
            zzdg zzdg = new zzdg(zzbb1, zzb1, zzhs1) {

                final zzbb zzBL;
                final zzb zzBM;
                final zzhs zzBN;
                final zzfy zzBO;

                public void zza(zzid zzid, Map map)
                {
                    zzBL.zzb("/nativeAdPreProcess", zzBM.zzBX);
                    try
                    {
                        zzid = (String)map.get("success");
                        if (!TextUtils.isEmpty(zzid))
                        {
                            zzBN.zzf((new JSONObject(zzid)).getJSONArray("ads").getJSONObject(0));
                            return;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (zzid zzid)
                    {
                        com.google.android.gms.ads.internal.util.client.zzb.zzb("Malformed native JSON response.", zzid);
                    }
                    zzBO.zzB(0);
                    zzu.zza(zzBO.zzfr(), "Unable to set the ad state error!");
                    zzBN.zzf(null);
                }

            
            {
                zzBO = zzfy.this;
                zzBL = zzbb1;
                zzBM = zzb1;
                zzBN = zzhs1;
                super();
            }
            };
            zzb1.zzBX = zzdg;
            zzbb1.zza("/nativeAdPreProcess", zzdg);
            zzbb1.zza("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(zzBs.zzFs.zzCI));
            return (JSONObject)zzhs1.get(zzBF, TimeUnit.MILLISECONDS);
        }
    }

    private void zzb(zzcs zzcs1, String s)
    {
        zzcw zzcw1;
        try
        {
            zzcw1 = zzBH.zzq(zzcs1.getCustomTemplateId());
        }
        // Misplaced declaration of an exception variable
        catch (zzcs zzcs1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd((new StringBuilder()).append("Failed to call onCustomClick for asset ").append(s).append(".").toString(), zzcs1);
            return;
        }
        if (zzcw1 == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        zzcw1.zza(zzcs1, s);
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

    private zzbb zzfq()
        throws CancellationException, ExecutionException, InterruptedException, TimeoutException
    {
        if (zzfr())
        {
            return null;
        }
        String s = (String)zzbz.zzur.get();
        Object obj;
        if (zzBs.zzFs.zzzG.indexOf("https") == 0)
        {
            obj = "https:";
        } else
        {
            obj = "http:";
        }
        obj = (new StringBuilder()).append(((String) (obj))).append(s).toString();
        obj = (zzbb)zzBI.zza(mContext, zzBs.zzFr.zzpJ, ((String) (obj))).get(zzBF, TimeUnit.MILLISECONDS);
        ((zzbb) (obj)).zza(zzBH, zzBH, zzBH, zzBH, false, null, null, null, null);
        return ((zzbb) (obj));
    }

    public Object call()
        throws Exception
    {
        return zzfp();
    }

    public void zzB(int i)
    {
        synchronized (zzqt)
        {
            zzBJ = true;
            zzBv = i;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzhv zza(JSONObject jsonobject, String s, boolean flag, boolean flag1)
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
        return zza(((JSONObject) (s)), flag, flag1);
    }

    public List zza(JSONObject jsonobject, String s, boolean flag, boolean flag1, boolean flag2)
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
            zza(0, flag);
            return arraylist;
        }
        int i;
        int j;
        if (flag2)
        {
            i = jsonobject.length();
        } else
        {
            i = 1;
        }
        for (j = 0; j < i; j++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(j);
            s = jsonobject1;
            if (jsonobject1 == null)
            {
                s = new JSONObject();
            }
            arraylist.add(zza(((JSONObject) (s)), flag, flag1));
        }

        return arraylist;
    }

    public Future zza(JSONObject jsonobject, String s, boolean flag)
        throws JSONException
    {
        s = jsonobject.getJSONObject(s);
        boolean flag1 = s.optBoolean("require", true);
        jsonobject = s;
        if (s == null)
        {
            jsonobject = new JSONObject();
        }
        return zza(jsonobject, flag1, flag);
    }

    public void zza(int i, boolean flag)
    {
        if (flag)
        {
            zzB(i);
        }
    }

    protected zza zzd(JSONObject jsonobject)
        throws JSONException, TimeoutException
    {
        if (zzfr())
        {
            return null;
        }
        String s = jsonobject.getString("template_id");
        boolean flag;
        boolean flag1;
        if (zzBs.zzFr.zzqb != null)
        {
            flag = zzBs.zzFr.zzqb.zzvC;
        } else
        {
            flag = false;
        }
        if (zzBs.zzFr.zzqb != null)
        {
            flag1 = zzBs.zzFr.zzqb.zzvE;
        } else
        {
            flag1 = false;
        }
        if ("2".equals(s))
        {
            return new zzfz(flag, flag1);
        }
        if ("1".equals(s))
        {
            return new zzga(flag, flag1);
        }
        if ("3".equals(s))
        {
            String s1 = jsonobject.getString("custom_template_id");
            zzhs zzhs1 = new zzhs();
            zzhl.zzGk.post(new Runnable(zzhs1, s1) {

                final zzfy zzBO;
                final zzhs zzBP;
                final String zzBQ;

                public void run()
                {
                    zzBP.zzf(zzfy.zza(zzBO).zzbo().get(zzBQ));
                }

            
            {
                zzBO = zzfy.this;
                zzBP = zzhs1;
                zzBQ = s;
                super();
            }
            });
            if (zzhs1.get(zzBF, TimeUnit.MILLISECONDS) != null)
            {
                return new zzgb(flag);
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzaz((new StringBuilder()).append("No handler for custom template: ").append(jsonobject.getString("custom_template_id")).toString());
        } else
        {
            zzB(0);
        }
        return null;
    }

    public zzhv zze(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONObject("attribution");
        if (jsonobject == null)
        {
            return new zzht(null);
        } else
        {
            String s = jsonobject.optString("text");
            int i = jsonobject.optInt("text_size", -1);
            Integer integer = zzb(jsonobject, "text_color");
            Integer integer1 = zzb(jsonobject, "bg_color");
            return zzhu.zza(zza(jsonobject, "image", false, false), new zzhu.zza(s, integer1, integer, i) {

                final zzfy zzBO;
                final String zzBS;
                final Integer zzBT;
                final Integer zzBU;
                final int zzBV;

                public com.google.android.gms.ads.internal.formats.zza zza(zzc zzc1)
                {
                    if (zzc1 == null) goto _L2; else goto _L1
_L1:
                    if (!TextUtils.isEmpty(zzBS)) goto _L3; else goto _L2
_L3:
                    String s1;
                    Drawable drawable;
                    Integer integer2;
                    Integer integer3;
                    s1 = zzBS;
                    drawable = (Drawable)com.google.android.gms.dynamic.zze.zzn(zzc1.zzdw());
                    integer2 = zzBT;
                    integer3 = zzBU;
                    if (zzBV <= 0) goto _L5; else goto _L4
_L4:
                    zzc1 = Integer.valueOf(zzBV);
_L6:
                    zzc1 = new com.google.android.gms.ads.internal.formats.zza(s1, drawable, integer2, integer3, zzc1);
                    break MISSING_BLOCK_LABEL_94;
                    zzc1;
                    com.google.android.gms.ads.internal.util.client.zzb.zzb("Could not get attribution icon", zzc1);
                    return null;
_L5:
                    zzc1 = null;
                    if (true) goto _L6; else goto _L2
_L2:
                    zzc1 = null;
                    return zzc1;
                }

                public Object zze(Object obj)
                {
                    return zza((zzc)obj);
                }

            
            {
                zzBO = zzfy.this;
                zzBS = s;
                zzBT = integer;
                zzBU = integer1;
                zzBV = i;
                super();
            }
            });
        }
    }

    public zzha zzfp()
    {
        Object obj;
        obj = zzfq();
        Object obj2 = zzb(((zzbb) (obj)));
        obj2 = zza(((zzbb) (obj)), zzd(((JSONObject) (obj2))), ((JSONObject) (obj2)));
        zza(((com.google.android.gms.ads.internal.formats.zzg.zza) (obj2)), ((zzbb) (obj)));
        obj = zza(((com.google.android.gms.ads.internal.formats.zzg.zza) (obj2)));
        return ((zzha) (obj));
        Object obj1;
        obj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Malformed native JSON response.", ((Throwable) (obj1)));
_L2:
        if (!zzBJ)
        {
            zzB(0);
        }
        return zza(((com.google.android.gms.ads.internal.formats.zzg.zza) (null)));
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

    public boolean zzfr()
    {
        boolean flag;
        synchronized (zzqt)
        {
            flag = zzBJ;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        zzBF = TimeUnit.SECONDS.toMillis(60L);
    }
}

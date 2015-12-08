// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.signin.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zzj, Api, zzi, zzk

public class zzg
    implements zzj
{

    private final Context mContext;
    private f zzZA;
    private int zzZB;
    private boolean zzZC;
    private boolean zzZD;
    private zzp zzZE;
    private boolean zzZF;
    private boolean zzZG;
    private final zzf zzZH;
    private final Map zzZI;
    private ArrayList zzZJ;
    private final GoogleApiAvailability zzZi;
    private final Api.zza zzZj;
    private final zzi zzZq;
    private final Lock zzZs;
    private ConnectionResult zzZt;
    private int zzZu;
    private int zzZv;
    private boolean zzZw;
    private int zzZx;
    private final Bundle zzZy = new Bundle();
    private final Set zzZz = new HashSet();

    public zzg(zzi zzi1, zzf zzf1, Map map, GoogleApiAvailability googleapiavailability, Api.zza zza1, Lock lock, Context context)
    {
        zzZv = 0;
        zzZw = false;
        zzZJ = new ArrayList();
        zzZq = zzi1;
        zzZH = zzf1;
        zzZI = map;
        zzZi = googleapiavailability;
        zzZj = zza1;
        zzZs = lock;
        mContext = context;
    }

    private void zzX(boolean flag)
    {
        if (zzZA != null)
        {
            if (zzZA.isConnected() && flag)
            {
                zzZA.a();
            }
            zzZA.disconnect();
            zzZE = null;
        }
    }

    static Context zza(zzg zzg1)
    {
        return zzg1.mContext;
    }

    static void zza(zzg zzg1, ConnectionResult connectionresult)
    {
        zzg1.zzf(connectionresult);
    }

    static void zza(zzg zzg1, ConnectionResult connectionresult, Api api, int i)
    {
        zzg1.zzb(connectionresult, api, i);
    }

    static void zza(zzg zzg1, ResolveAccountResponse resolveaccountresponse)
    {
        zzg1.zza(resolveaccountresponse);
    }

    private void zza(ResolveAccountResponse resolveaccountresponse)
    {
        if (!zzbe(0))
        {
            return;
        }
        ConnectionResult connectionresult = resolveaccountresponse.zzoP();
        if (connectionresult.isSuccess())
        {
            zzZE = resolveaccountresponse.zzoO();
            zzZD = true;
            zzZF = resolveaccountresponse.zzoQ();
            zzZG = resolveaccountresponse.zzoR();
            zznp();
            return;
        }
        if (zze(connectionresult))
        {
            zznu();
            zznp();
            return;
        } else
        {
            zzf(connectionresult);
            return;
        }
    }

    private boolean zza(int i, int j, ConnectionResult connectionresult)
    {
        while (j == 1 && !zzd(connectionresult) || zzZt != null && i >= zzZu) 
        {
            return false;
        }
        return true;
    }

    static boolean zza(zzg zzg1, int i)
    {
        return zzg1.zzbe(i);
    }

    static GoogleApiAvailability zzb(zzg zzg1)
    {
        return zzg1.zzZi;
    }

    private void zzb(ConnectionResult connectionresult, Api api, int i)
    {
        if (i != 2)
        {
            int j = api.zznb().getPriority();
            if (zza(j, i, connectionresult))
            {
                zzZt = connectionresult;
                zzZu = j;
            }
        }
        zzZq.zzaag.put(api.zznd(), connectionresult);
    }

    static boolean zzb(zzg zzg1, ConnectionResult connectionresult)
    {
        return zzg1.zze(connectionresult);
    }

    private boolean zzbe(int i)
    {
        if (zzZv != i)
        {
            Log.wtf("GoogleApiClientConnecting", (new StringBuilder("GoogleApiClient connecting is in step ")).append(zzbf(zzZv)).append(" but received callback for step ").append(zzbf(i)).toString());
            zzf(new ConnectionResult(8, null));
            return false;
        } else
        {
            return true;
        }
    }

    private String zzbf(int i)
    {
        switch (i)
        {
        default:
            return "UNKNOWN";

        case 0: // '\0'
            return "STEP_GETTING_SERVICE_BINDINGS";

        case 1: // '\001'
            return "STEP_VALIDATING_ACCOUNT";

        case 2: // '\002'
            return "STEP_AUTHENTICATING";

        case 3: // '\003'
            return "STEP_GETTING_REMOTE_SERVICE";
        }
    }

    static Lock zzc(zzg zzg1)
    {
        return zzg1.zzZs;
    }

    private void zzc(ConnectionResult connectionresult)
    {
        if (!zzbe(2))
        {
            return;
        }
        if (connectionresult.isSuccess())
        {
            zzns();
            return;
        }
        if (zze(connectionresult))
        {
            zznu();
            zzns();
            return;
        } else
        {
            zzf(connectionresult);
            return;
        }
    }

    static void zzc(zzg zzg1, ConnectionResult connectionresult)
    {
        zzg1.zzc(connectionresult);
    }

    static zzi zzd(zzg zzg1)
    {
        return zzg1.zzZq;
    }

    private boolean zzd(ConnectionResult connectionresult)
    {
        while (connectionresult.hasResolution() || zzZi.zzbb(connectionresult.getErrorCode()) != null) 
        {
            return true;
        }
        return false;
    }

    private boolean zze(ConnectionResult connectionresult)
    {
        return zzZB == 2 || zzZB == 1 && !connectionresult.hasResolution();
    }

    static boolean zze(zzg zzg1)
    {
        return zzg1.zzZC;
    }

    static f zzf(zzg zzg1)
    {
        return zzg1.zzZA;
    }

    private void zzf(ConnectionResult connectionresult)
    {
        boolean flag = false;
        zzZw = false;
        zznv();
        if (!connectionresult.hasResolution())
        {
            flag = true;
        }
        zzX(flag);
        zzZq.zzaag.clear();
        zzZq.zzg(connectionresult);
        if (!zzZq.zznB() || !zzZi.zzd(mContext, connectionresult.getErrorCode()))
        {
            zzZq.zznE();
            zzZq.zzZY.zzj(connectionresult);
        }
        zzZq.zzZY.zzoI();
    }

    static zzp zzg(zzg zzg1)
    {
        return zzg1.zzZE;
    }

    static Set zzh(zzg zzg1)
    {
        return zzg1.zznw();
    }

    static void zzi(zzg zzg1)
    {
        zzg1.zznu();
    }

    static void zzj(zzg zzg1)
    {
        zzg1.zzns();
    }

    static boolean zzk(zzg zzg1)
    {
        return zzg1.zzno();
    }

    static void zzl(zzg zzg1)
    {
        zzg1.zznp();
    }

    static void zzm(zzg zzg1)
    {
        zzg1.zznr();
    }

    private boolean zzno()
    {
        zzZx = zzZx - 1;
        if (zzZx > 0)
        {
            return false;
        }
        if (zzZx < 0)
        {
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.");
            zzf(new ConnectionResult(8, null));
            return false;
        }
        if (zzZt != null)
        {
            zzf(zzZt);
            return false;
        } else
        {
            return true;
        }
    }

    private void zznp()
    {
        if (zzZx == 0)
        {
            if (zzZC)
            {
                if (zzZD)
                {
                    zznq();
                    return;
                }
            } else
            {
                zzns();
                return;
            }
        }
    }

    private void zznq()
    {
        ArrayList arraylist = new ArrayList();
        zzZv = 1;
        zzZx = zzZq.zzaaf.size();
        Iterator iterator = zzZq.zzaaf.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Api.zzc zzc1 = (Api.zzc)iterator.next();
            if (zzZq.zzaag.containsKey(zzc1))
            {
                if (zzno())
                {
                    zznr();
                }
            } else
            {
                arraylist.add(zzZq.zzaaf.get(zzc1));
            }
        } while (true);
    /* block-local class not found */
    class zzh {}

        if (!arraylist.isEmpty())
        {
            zzZJ.add(com.google.android.gms.common.api.zzk.zznF().submit(new zzh(arraylist)));
        }
    }

    private void zznr()
    {
        zzZv = 2;
        zzZq.zzaah = zznw();
    /* block-local class not found */
    class zzc {}

        zzZJ.add(com.google.android.gms.common.api.zzk.zznF().submit(new zzc(null)));
    }

    private void zzns()
    {
        ArrayList arraylist = new ArrayList();
        zzZv = 3;
        zzZx = zzZq.zzaaf.size();
        Iterator iterator = zzZq.zzaaf.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Api.zzc zzc1 = (Api.zzc)iterator.next();
            if (zzZq.zzaag.containsKey(zzc1))
            {
                if (zzno())
                {
                    zznt();
                }
            } else
            {
                arraylist.add(zzZq.zzaaf.get(zzc1));
            }
        } while (true);
    /* block-local class not found */
    class zzf {}

        if (!arraylist.isEmpty())
        {
            zzZJ.add(com.google.android.gms.common.api.zzk.zznF().submit(new zzf(arraylist)));
        }
    }

    private void zznt()
    {
        zzZq.zznA();
        com.google.android.gms.common.api.zzk.zznF().execute(new _cls1());
        if (zzZA != null)
        {
            if (zzZF)
            {
                zzZA.a(zzZE, zzZG);
            }
            zzX(false);
        }
        Api.zzc zzc1;
        for (Iterator iterator = zzZq.zzaag.keySet().iterator(); iterator.hasNext(); ((Api.zzb)zzZq.zzaaf.get(zzc1)).disconnect())
        {
            zzc1 = (Api.zzc)iterator.next();
        }

        if (zzZw)
        {
            zzZw = false;
            disconnect();
            return;
        }
        Bundle bundle;
        if (zzZy.isEmpty())
        {
            bundle = null;
        } else
        {
            bundle = zzZy;
        }
        zzZq.zzZY.zzh(bundle);
    }

    private void zznu()
    {
        zzZC = false;
        zzZq.zzaah = Collections.emptySet();
        Iterator iterator = zzZz.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Api.zzc zzc1 = (Api.zzc)iterator.next();
            if (!zzZq.zzaag.containsKey(zzc1))
            {
                zzZq.zzaag.put(zzc1, new ConnectionResult(17, null));
            }
        } while (true);
    }

    private void zznv()
    {
        for (Iterator iterator = zzZJ.iterator(); iterator.hasNext(); ((Future)iterator.next()).cancel(true)) { }
        zzZJ.clear();
    }

    private Set zznw()
    {
        HashSet hashset = new HashSet(zzZH.zzoi());
        Map map = zzZH.zzok();
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Api api = (Api)iterator.next();
            if (!zzZq.zzaag.containsKey(api.zznd()))
            {
                hashset.addAll(((com.google.android.gms.common.internal.zzf.zza)map.get(api)).zzZp);
            }
        } while (true);
        return hashset;
    }

    public void begin()
    {
        zzZq.zzZY.zzoJ();
        zzZq.zzaag.clear();
        zzZw = false;
        zzZC = false;
        zzZt = null;
        zzZv = 0;
        zzZB = 2;
        zzZD = false;
        zzZF = false;
        HashMap hashmap = new HashMap();
        Iterator iterator = zzZI.keySet().iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            Api api = (Api)iterator.next();
            Api.zzb zzb1 = (Api.zzb)zzZq.zzaaf.get(api.zznd());
            int i = ((Integer)zzZI.get(api)).intValue();
    /* block-local class not found */
    class zzd {}

            boolean flag1;
            if (api.zznb().getPriority() == 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (zzb1.zzlm())
            {
                zzZC = true;
                if (i < zzZB)
                {
                    zzZB = i;
                }
                if (i != 0)
                {
                    zzZz.add(api.zznd());
                }
            }
            hashmap.put(zzb1, new zzd(api, i));
            flag = flag1 | flag;
        }
        if (flag)
        {
            zzZC = false;
        }
        if (zzZC)
        {
            zzZH.zza(Integer.valueOf(zzZq.getSessionId()));
    /* block-local class not found */
    class zzg {}

            zzg zzg1 = new zzg(null);
            zzZA = (f)zzZj.zza(mContext, zzZq.getLooper(), zzZH, zzZH.zzoo(), zzg1, zzg1);
        }
        zzZx = zzZq.zzaaf.size();
    /* block-local class not found */
    class zze {}

        zzZJ.add(com.google.android.gms.common.api.zzk.zznF().submit(new zze(hashmap)));
    }

    public void connect()
    {
        zzZw = false;
    }

    public void disconnect()
    {
        Iterator iterator = zzZq.zzZZ.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            zzi.zze zze1 = (zzi.zze)iterator.next();
            if (zze1.zzng() != 1)
            {
                zze1.cancel();
                iterator.remove();
            }
        } while (true);
        zzZq.zznx();
        if (zzZt == null && !zzZq.zzZZ.isEmpty())
        {
            zzZw = true;
            return;
        } else
        {
            zznv();
            zzX(true);
            zzZq.zzaag.clear();
            zzZq.zzg(null);
            zzZq.zzZY.zzoI();
            return;
        }
    }

    public String getName()
    {
        return "CONNECTING";
    }

    public void onConnected(Bundle bundle)
    {
        if (zzbe(3))
        {
            if (bundle != null)
            {
                zzZy.putAll(bundle);
            }
            if (zzno())
            {
                zznt();
                return;
            }
        }
    }

    public void onConnectionSuspended(int i)
    {
        zzf(new ConnectionResult(8, null));
    }

    public zzc.zza zza(zzc.zza zza1)
    {
        zzZq.zzZZ.add(zza1);
        return zza1;
    }

    public void zza(ConnectionResult connectionresult, Api api, int i)
    {
        if (zzbe(3))
        {
            zzb(connectionresult, api, i);
            if (zzno())
            {
                zznt();
                return;
            }
        }
    }

    public zzc.zza zzb(zzc.zza zza1)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    // Unreferenced inner class com/google/android/gms/common/api/zzg$zza
    /* block-local class not found */
    class zza {}


    // Unreferenced inner class com/google/android/gms/common/api/zzg$zzb
    /* block-local class not found */
    class zzb {}


    // Unreferenced inner class com/google/android/gms/common/api/zzg$zzi
    /* block-local class not found */
    class zzi {}


    /* member class not found */
    class _cls1 {}

}

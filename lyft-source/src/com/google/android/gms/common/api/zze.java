// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.internal.zzps;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zzh, Api, zzg

public class zze
    implements zzh
{

    private final zzg a;
    private final Lock b;
    private final Context c;
    private ConnectionResult d;
    private int e;
    private int f;
    private boolean g;
    private int h;
    private final Bundle i = new Bundle();
    private final Set j = new HashSet();
    private zzps k;
    private int l;
    private boolean m;
    private boolean n;
    private IAccountAccessor o;
    private boolean p;
    private boolean q;
    private final com.google.android.gms.common.internal.zze r;
    private final Map s;
    private final Api.zza t;

    public zze(zzg zzg1, com.google.android.gms.common.internal.zze zze1, Map map, Api.zza zza, Lock lock, Context context)
    {
        f = 0;
        g = false;
        a = zzg1;
        r = zze1;
        s = map;
        t = zza;
        b = lock;
        c = context;
    }

    static Lock a(zze zze1)
    {
        return zze1.b;
    }

    private void a(ConnectionResult connectionresult)
    {
        b.lock();
        boolean flag = c(2);
        if (!flag)
        {
            b.unlock();
            return;
        }
        if (!connectionresult.b()) goto _L2; else goto _L1
_L1:
        h();
_L3:
        b.unlock();
        return;
_L2:
        if (!c(connectionresult))
        {
            break MISSING_BLOCK_LABEL_81;
        }
        j();
        h();
          goto _L3
        connectionresult;
        b.unlock();
        throw connectionresult;
        d(connectionresult);
          goto _L3
    }

    static void a(zze zze1, ConnectionResult connectionresult)
    {
        zze1.d(connectionresult);
    }

    static void a(zze zze1, ConnectionResult connectionresult, Api api, int i1)
    {
        zze1.b(connectionresult, api, i1);
    }

    static void a(zze zze1, ResolveAccountResponse resolveaccountresponse)
    {
        zze1.a(resolveaccountresponse);
    }

    private void a(ResolveAccountResponse resolveaccountresponse)
    {
        ConnectionResult connectionresult;
        connectionresult = resolveaccountresponse.b();
        b.lock();
        boolean flag = c(0);
        if (!flag)
        {
            b.unlock();
            return;
        }
        if (!connectionresult.b()) goto _L2; else goto _L1
_L1:
        o = resolveaccountresponse.a();
        n = true;
        p = resolveaccountresponse.c();
        q = resolveaccountresponse.d();
        f();
_L3:
        b.unlock();
        return;
_L2:
        if (!c(connectionresult))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        j();
        if (h == 0)
        {
            h();
        }
          goto _L3
        resolveaccountresponse;
        b.unlock();
        throw resolveaccountresponse;
        d(connectionresult);
          goto _L3
    }

    private void a(boolean flag)
    {
        if (k != null)
        {
            if (k.b())
            {
                if (flag)
                {
                    k.g_();
                }
                k.a();
            }
            o = null;
        }
    }

    private boolean a(int i1, int j1, ConnectionResult connectionresult)
    {
        while (j1 == 1 && !b(connectionresult) || d != null && i1 >= e) 
        {
            return false;
        }
        return true;
    }

    static boolean a(zze zze1, int i1)
    {
        return zze1.c(i1);
    }

    static zzg b(zze zze1)
    {
        return zze1.a;
    }

    private void b(ConnectionResult connectionresult, Api api, int i1)
    {
        if (i1 != 2)
        {
            int j1 = api.a().a();
            if (a(j1, i1, connectionresult))
            {
                d = connectionresult;
                e = j1;
            }
        }
        a.f.put(api.d(), connectionresult);
    }

    private static boolean b(ConnectionResult connectionresult)
    {
        while (connectionresult.a() || GooglePlayServicesUtil.b(connectionresult.c()) != null) 
        {
            return true;
        }
        return false;
    }

    static boolean b(zze zze1, ConnectionResult connectionresult)
    {
        return zze1.c(connectionresult);
    }

    static zzps c(zze zze1)
    {
        return zze1.k;
    }

    static void c(zze zze1, ConnectionResult connectionresult)
    {
        zze1.a(connectionresult);
    }

    private boolean c(int i1)
    {
        if (f != i1)
        {
            Log.wtf("GoogleApiClientConnecting", (new StringBuilder()).append("GoogleApiClient connecting is in step ").append(d(f)).append(" but received callback for step ").append(d(i1)).toString());
            d(new ConnectionResult(8, null));
            return false;
        } else
        {
            return true;
        }
    }

    private boolean c(ConnectionResult connectionresult)
    {
        return l == 2 || l == 1 && !connectionresult.a();
    }

    private String d(int i1)
    {
        switch (i1)
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

    private void d(ConnectionResult connectionresult)
    {
        boolean flag = false;
        g = false;
        a.g.clear();
        d = connectionresult;
        if (!connectionresult.a())
        {
            flag = true;
        }
        a(flag);
        a(3);
        if (!a.j() || !GooglePlayServicesUtil.b(c, connectionresult.c()))
        {
            a.l();
            a.a.a(connectionresult);
        }
        a.a.a();
    }

    static void d(zze zze1)
    {
        zze1.j();
    }

    private boolean d()
    {
        h = h - 1;
        if (h > 0)
        {
            return false;
        }
        if (h < 0)
        {
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.");
            d(new ConnectionResult(8, null));
            return false;
        }
        if (d != null)
        {
            d(d);
            return false;
        } else
        {
            return true;
        }
    }

    private void e()
    {
        if (m)
        {
            f();
            return;
        } else
        {
            h();
            return;
        }
    }

    static void e(zze zze1)
    {
        zze1.h();
    }

    private void f()
    {
        if (n && h == 0)
        {
            f = 1;
            h = a.e.size();
            Iterator iterator = a.e.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Api.ClientKey clientkey = (Api.ClientKey)iterator.next();
                if (a.f.containsKey(clientkey))
                {
                    if (d())
                    {
                        g();
                    }
                } else
                {
                    ((Api.Client)a.e.get(clientkey)).a(o);
                }
            } while (true);
        }
    }

    static boolean f(zze zze1)
    {
        return zze1.d();
    }

    private void g()
    {
        f = 2;
        a.g = k();
        k.a(o, a.g, new zza());
    }

    static void g(zze zze1)
    {
        zze1.e();
    }

    private void h()
    {
        Set set = a.g;
        if (set.isEmpty())
        {
            set = k();
        }
        f = 3;
        h = a.e.size();
        Iterator iterator = a.e.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Api.ClientKey clientkey = (Api.ClientKey)iterator.next();
            if (a.f.containsKey(clientkey))
            {
                if (d())
                {
                    i();
                }
            } else
            {
                ((Api.Client)a.e.get(clientkey)).a(o, set);
            }
        } while (true);
    }

    static void h(zze zze1)
    {
        zze1.g();
    }

    private void i()
    {
        a.i();
        if (k != null)
        {
            if (p)
            {
                k.a(o, q);
            }
            a(false);
        }
        Api.ClientKey clientkey;
        for (Iterator iterator = a.f.keySet().iterator(); iterator.hasNext(); ((Api.Client)a.e.get(clientkey)).a())
        {
            clientkey = (Api.ClientKey)iterator.next();
        }

        if (g)
        {
            g = false;
            a(-1);
            return;
        }
        Bundle bundle;
        if (i.isEmpty())
        {
            bundle = null;
        } else
        {
            bundle = i;
        }
        a.a.a(bundle);
    }

    private void j()
    {
        m = false;
        a.g.clear();
        Iterator iterator = j.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Api.ClientKey clientkey = (Api.ClientKey)iterator.next();
            if (!a.f.containsKey(clientkey))
            {
                a.f.put(clientkey, new ConnectionResult(17, null));
            }
        } while (true);
    }

    private Set k()
    {
        HashSet hashset = new HashSet(r.d());
        Map map = r.f();
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Api api = (Api)iterator.next();
            if (!a.f.containsKey(api.d()))
            {
                hashset.addAll(((com.google.android.gms.common.internal.zza)map.get(api)).a);
            }
        } while (true);
        return hashset;
    }

    public zza.zza a(zza.zza zza1)
    {
        a.b.add(zza1);
        return zza1;
    }

    public void a()
    {
        a.a.b();
        a.f.clear();
        g = false;
        m = false;
        d = null;
        f = 0;
        l = 2;
        n = false;
        p = false;
        int i1 = GooglePlayServicesUtil.a(c);
        if (i1 != 0)
        {
            ConnectionResult connectionresult = new ConnectionResult(i1, null);
            a.c.post(new Runnable(connectionresult) {

                final ConnectionResult a;
                final zze b;

                public void run()
                {
                    zze.a(b).lock();
                    zze.a(b, a);
                    zze.a(b).unlock();
                    return;
                    Exception exception;
                    exception;
                    zze.a(b).unlock();
                    throw exception;
                }

            
            {
                b = zze.this;
                a = connectionresult;
                super();
            }
            });
        } else
        {
            HashMap hashmap = new HashMap();
            Object obj = s.keySet().iterator();
            boolean flag = false;
            while (((Iterator) (obj)).hasNext()) 
            {
                Api api = (Api)((Iterator) (obj)).next();
                Api.Client client1 = (Api.Client)a.e.get(api.d());
                int j1 = ((Integer)s.get(api)).intValue();
                boolean flag1;
                if (api.a().a() == 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (client1.c())
                {
                    m = true;
                    if (j1 < l)
                    {
                        l = j1;
                    }
                    if (j1 != 0)
                    {
                        j.add(api.d());
                    }
                }
                hashmap.put(client1, new zzc(api, j1));
                flag = flag1 | flag;
            }
            if (flag)
            {
                m = false;
            }
            if (m)
            {
                r.a(Integer.valueOf(a.m()));
                obj = new zzd();
                k = (zzps)t.a(c, a.a(), r, r.i(), ((GoogleApiClient.ConnectionCallbacks) (obj)), ((GoogleApiClient.OnConnectionFailedListener) (obj)));
                k.g();
            }
            h = a.e.size();
            obj = a.e.values().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                Api.Client client = (Api.Client)((Iterator) (obj)).next();
                client.a((GoogleApiClient.ConnectionProgressReportCallbacks)hashmap.get(client));
            }
        }
    }

    public void a(int i1)
    {
        if (i1 == -1)
        {
            Iterator iterator = a.b.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                zzg.zze zze1 = (zzg.zze)iterator.next();
                if (zze1.g() != 1)
                {
                    zze1.c();
                    iterator.remove();
                }
            } while (true);
            a.f();
            if (d == null && !a.b.isEmpty())
            {
                g = true;
                return;
            }
            a.f.clear();
            d = null;
            a(true);
        }
        a.a(d);
    }

    public void a(Bundle bundle)
    {
        if (c(3))
        {
            if (bundle != null)
            {
                i.putAll(bundle);
            }
            if (d())
            {
                i();
                return;
            }
        }
    }

    public void a(ConnectionResult connectionresult, Api api, int i1)
    {
        if (c(3))
        {
            b(connectionresult, api, i1);
            if (d())
            {
                i();
                return;
            }
        }
    }

    public zza.zza b(zza.zza zza1)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public void b()
    {
        g = false;
    }

    public void b(int i1)
    {
        d(new ConnectionResult(8, null));
    }

    public String c()
    {
        return "CONNECTING";
    }

    private class zza extends zzb
    {

        private final WeakReference a;

        public void a(ConnectionResult connectionresult, AuthAccountResult authaccountresult)
        {
            authaccountresult = (zze)a.get();
            if (authaccountresult == null)
            {
                return;
            } else
            {
                zze.b(authaccountresult).c.post(authaccountresult. new Runnable(connectionresult) {

                    final zze a;
                    final ConnectionResult b;
                    final zza c;

                    public void run()
                    {
                        zze.c(a, b);
                    }

                
                {
                    c = zza.this;
                    a = zze.this;
                    b = connectionresult;
                    super();
                }
                });
                return;
            }
        }

        zza()
        {
            a = new WeakReference(zze.this);
        }
    }


    private class zzc
        implements GoogleApiClient.ConnectionProgressReportCallbacks
    {

        private final WeakReference a;
        private final Api b;
        private final int c;

        public void a(ConnectionResult connectionresult)
        {
            zze zze1;
            boolean flag = false;
            zze1 = (zze)a.get();
            if (zze1 == null)
            {
                return;
            }
            if (Looper.myLooper() == zze.b(zze1).a())
            {
                flag = true;
            }
            zzu.a(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            zze.a(zze1).lock();
            boolean flag1 = zze.a(zze1, 0);
            if (!flag1)
            {
                zze.a(zze1).unlock();
                return;
            }
            if (!connectionresult.b())
            {
                zze.a(zze1, connectionresult, b, c);
            }
            if (zze.f(zze1))
            {
                zze.g(zze1);
            }
            zze.a(zze1).unlock();
            return;
            connectionresult;
            zze.a(zze1).unlock();
            throw connectionresult;
        }

        public void b(ConnectionResult connectionresult)
        {
            zze zze1;
            boolean flag = true;
            zze1 = (zze)a.get();
            if (zze1 == null)
            {
                return;
            }
            if (Looper.myLooper() != zze.b(zze1).a())
            {
                flag = false;
            }
            zzu.a(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
            zze.a(zze1).lock();
            flag = zze.a(zze1, 1);
            if (!flag)
            {
                zze.a(zze1).unlock();
                return;
            }
            if (!connectionresult.b())
            {
                zze.a(zze1, connectionresult, b, c);
            }
            if (zze.f(zze1))
            {
                zze.h(zze1);
            }
            zze.a(zze1).unlock();
            return;
            connectionresult;
            zze.a(zze1).unlock();
            throw connectionresult;
        }

        public zzc(Api api, int i1)
        {
            a = new WeakReference(zze.this);
            b = api;
            c = i1;
        }
    }


    private class zzd
        implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
    {

        final zze a;

        public void onConnected(Bundle bundle)
        {
            zze.c(a).a(a. new zzb());
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            zze.a(a).lock();
            if (!zze.b(a, connectionresult)) goto _L2; else goto _L1
_L1:
            zze.d(a);
            zze.e(a);
_L4:
            zze.a(a).unlock();
            return;
_L2:
            zze.a(a, connectionresult);
            if (true) goto _L4; else goto _L3
_L3:
            connectionresult;
            zze.a(a).unlock();
            throw connectionresult;
        }

        public void onConnectionSuspended(int i1)
        {
        }

        private zzd()
        {
            a = zze.this;
            super();
        }


        private class zzb extends com.google.android.gms.common.internal.zzq.zza
        {

            private final WeakReference a;

            public void a(ResolveAccountResponse resolveaccountresponse)
            {
                zze zze1 = (zze)a.get();
                if (zze1 == null)
                {
                    return;
                } else
                {
                    zze.b(zze1).c.post(zze1. new Runnable(resolveaccountresponse) {

                        final zze a;
                        final ResolveAccountResponse b;
                        final zzb c;

                        public void run()
                        {
                            zze.a(a, b);
                        }

                    
                    {
                        c = zzb.this;
                        a = zze.this;
                        b = resolveaccountresponse;
                        super();
                    }
                    });
                    return;
                }
            }

            zzb()
            {
                a = new WeakReference(zze.this);
            }
        }

    }

}

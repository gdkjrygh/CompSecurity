// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.b;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.i;
import com.google.android.gms.location.j;
import com.tinder.a.f;
import com.tinder.e.z;
import com.tinder.events.EventLocationSet;
import com.tinder.utils.o;
import com.tinder.utils.v;
import de.greenrobot.event.c;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            ae, d, ManagerApp, f

public final class g
    implements com.google.android.gms.common.api.c.b, com.google.android.gms.common.api.c.c, com.google.android.gms.location.g
{
    public static interface a
    {

        public abstract void g();
    }

    public static interface b
    {

        public abstract void a();

        public abstract void b();

        public abstract void c();
    }


    public com.google.android.gms.common.api.c a;
    public WeakReference b;
    public boolean c;
    public List d;
    public int e;
    public boolean f;
    private final List g = new ArrayList();
    private Context h;
    private int i;
    private boolean j;
    private ae k;
    private com.tinder.managers.f l;
    private com.tinder.managers.d m;
    private f n;
    private c o;
    private Location p;

    public g(Context context, ae ae1, com.tinder.managers.f f1, com.tinder.managers.d d1, f f2, c c1)
    {
        i = 0;
        c = false;
        p = null;
        e = 0;
        f = false;
        h = context;
        l = f1;
        m = d1;
        k = ae1;
        n = f2;
        o = c1;
    }

    public static void a(double d1, double d2)
    {
        com.tinder.managers.ae.b.putString("LATITUDE", String.valueOf(d1));
        com.tinder.managers.ae.b.commit();
        com.tinder.managers.ae.b.putString("LONGITUDE", String.valueOf(d2));
        com.tinder.managers.ae.b.commit();
        String s = (new StringBuilder("lat: ")).append(d1).append(" long: ").append(d2).toString();
        (new StringBuilder("location **************_________ Storing ")).append(s).append(" _________**************");
    }

    static void a(g g1)
    {
        g1.i();
    }

    private void b(Location location)
    {
        if (location != null && location.getLatitude() != 0.0D && location.getLongitude() != 0.0D)
        {
            (new StringBuilder("latitude: ")).append(location.getLatitude());
            boolean flag;
            if (p == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p = location;
            o.c(new EventLocationSet(location, flag));
        }
    }

    static boolean b(g g1)
    {
        g1.j = true;
        return true;
    }

    static List c(g g1)
    {
        return g1.d;
    }

    static f d(g g1)
    {
        return g1.n;
    }

    static boolean e(g g1)
    {
        return g1.h();
    }

    static int f(g g1)
    {
        return g1.e;
    }

    private void g()
    {
        if (a != null && a.d())
        {
            i.b.a(a, this);
        }
    }

    static void g(g g1)
    {
        g1.a();
    }

    static com.google.android.gms.common.api.c h(g g1)
    {
        return g1.a;
    }

    private boolean h()
    {
        return a != null && a.d();
    }

    static WeakReference i(g g1)
    {
        return g1.b;
    }

    private void i()
    {
        if (!h())
        {
            v.b("Failed to create and requets location updates, client is null or not connected");
            return;
        }
        b(i.b.a(a));
        LocationRequest locationrequest = LocationRequest.a();
        locationrequest.b = 100;
        LocationRequest.a(60000L);
        locationrequest.c = 60000L;
        if (!locationrequest.e)
        {
            locationrequest.d = (long)((double)locationrequest.c / 6D);
        }
        LocationRequest.a(30000L);
        locationrequest.e = true;
        locationrequest.d = 30000L;
        locationrequest.h = 1609F;
        com.google.android.gms.location.LocationSettingsRequest.a a1 = new com.google.android.gms.location.LocationSettingsRequest.a();
        a1.b = true;
        a1.a.add(locationrequest);
        i.d.a(a, new LocationSettingsRequest(a1.a, a1.b, a1.c, a1.d, (byte)0)).a(new com.google.android.gms.common.api.g(locationrequest) {

            final LocationRequest a;
            final g b;

            public final void a(com.google.android.gms.common.api.f f1)
            {
                boolean flag;
                flag = true;
                f1 = (LocationSettingsResult)f1;
                if (g.e(b)) goto _L2; else goto _L1
_L1:
                v.b("Google API client is null or not connected, unable to continue.");
                if (com.tinder.managers.g.f(b) > 0)
                {
                    g.g(b);
                }
_L10:
                return;
_L2:
                f1 = ((LocationSettingsResult) (f1)).b;
                ((Status) (f1)).g;
                JVM INSTR lookupswitch 3: default 84
            //                           0: 85
            //                           6: 110
            //                           8502: 205;
                   goto _L3 _L4 _L5 _L6
_L3:
                return;
_L4:
                i.b.a(g.h(b), a, b);
                return;
_L5:
                try
                {
                    if (com.tinder.managers.g.i(b) == null)
                    {
                        v.b("Cannot attempt to fix locations settings without an activity.");
                        return;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (com.google.android.gms.common.api.f f1)
                {
                    v.a("Failed to send intent to activity about location settings update", f1);
                    return;
                }
                Activity activity = (Activity)com.tinder.managers.g.i(b).get();
                if (activity == null) goto _L8; else goto _L7
_L7:
                (new StringBuilder("Resolution result will go to ")).append(activity.getClass());
                if (((Status) (f1)).i == null)
                {
                    flag = false;
                }
                if (!flag)
                {
                    continue; /* Loop/switch isn't completed */
                }
                activity.startIntentSenderForResult(((Status) (f1)).i.getIntentSender(), 10000, null, 0, 0, 0);
                return;
_L8:
                v.b("No activity in weak ref to get location resolution result from");
                return;
_L6:
                v.b("Could not change settings for locations, user perma-denied us?");
                if (com.tinder.managers.g.i(b) != null)
                {
                    Toast.makeText((Activity)com.tinder.managers.g.i(b).get(), 0x7f0600fe, 1).show();
                    return;
                }
                if (true) goto _L10; else goto _L9
_L9:
            }

            
            {
                b = g.this;
                a = locationrequest;
                super();
            }
        });
    }

    public final void a()
    {
        if (a == null)
        {
            a = (new com.google.android.gms.common.api.c.a(h)).a(i.a).a(this).a(this).b();
        }
        b();
    }

    public final void a(int i1)
    {
    }

    public final void a(Activity activity, a a1)
    {
        g.add(a1);
        i = i + 1;
        (new StringBuilder("location numGpsUsers: ")).append(i);
        if (i == 1)
        {
            a(activity);
        }
    }

    public final void a(Location location)
    {
        (new StringBuilder("location onLocation: ")).append(location);
        b(location);
        float af[] = new float[1];
        double d1 = ae.k();
        double d2 = ae.l();
        Location.distanceBetween(location.getLatitude(), location.getLongitude(), d1, d2, af);
        float f1 = af[0];
        (new StringBuilder("location displacement: ")).append(f1).append(" after comparing ").append(location.getLatitude()).append(',').append(location.getLongitude()).append(" with stored location: ").append(d1).append(',').append(d2);
        boolean flag;
        if (f1 > 1609F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || !j)
        {
            a(location.getLatitude(), location.getLongitude());
            a(new z() {

                final g a;

                public final void a()
                {
                }

                public final void b()
                {
                    v.b("Failed to ping");
                }

                public final void c()
                {
                    v.b("Ping responded with bad location.");
                    g.a(a);
                }

            
            {
                a = g.this;
                super();
            }
            }, false);
        } else
        if (d != null)
        {
            location = d.iterator();
            while (location.hasNext()) 
            {
                SoftReference softreference = (SoftReference)location.next();
                if (com.tinder.utils.o.a(softreference))
                {
                    ((b)softreference.get()).c();
                }
            }
        }
        for (location = g.iterator(); location.hasNext(); ((a)location.next()).g()) { }
    }

    public final void a(Bundle bundle)
    {
        i();
    }

    public final void a(ConnectionResult connectionresult)
    {
        Object obj = null;
        if (!f) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!connectionresult.a())
        {
            break MISSING_BLOCK_LABEL_73;
        }
        f = true;
        Activity activity = obj;
        if (!com.tinder.utils.o.a(b))
        {
            continue; /* Loop/switch isn't completed */
        }
        activity = (Activity)b.get();
        if (activity.isFinishing())
        {
            activity = obj;
        }
        if (activity == null) goto _L1; else goto _L3
_L3:
        try
        {
            connectionresult.a(activity, 9000);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ConnectionResult connectionresult)
        {
            b();
        }
        return;
        Activity activity1;
        if (com.tinder.utils.o.a(b))
        {
            Activity activity2 = (Activity)b.get();
            activity1 = activity2;
            if (activity2.isFinishing())
            {
                activity1 = null;
            }
        } else
        {
            activity1 = null;
        }
        if (activity1 != null)
        {
            com.google.android.gms.common.b.a();
            com.google.android.gms.common.b.a(activity1, connectionresult.c).show();
            f = true;
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(z z1, boolean flag)
    {
        String s = com.tinder.managers.d.b();
        double d1 = d();
        double d2 = e();
        if (s != null)
        {
            if (!flag && !c())
            {
                z1.c();
            } else
            if (c())
            {
                (new StringBuilder("Proceeding to ping ... lat = ")).append(d1).append(" long =").append(d2);
                JSONObject jsonobject = new JSONObject();
                try
                {
                    jsonobject.put("lat", d1);
                    jsonobject.put("lon", d2);
                }
                catch (JSONException jsonexception)
                {
                    v.a("Failed to put lat/long into json", jsonexception);
                }
                z1 = new com.tinder.a.d(1, n.i, jsonobject, new com.android.volley.i.b(z1) {

                    final z a;
                    final g b;

                    public final void a(Object obj)
                    {
                        obj = (JSONObject)obj;
                        (new StringBuilder("response=")).append(obj);
                        com.tinder.managers.g.b(b);
                        SoftReference softreference1;
                        if (((JSONObject) (obj)).optInt("status", 200) == 200)
                        {
                            a.a();
                            if (com.tinder.managers.g.c(b) != null)
                            {
                                obj = com.tinder.managers.g.c(b).iterator();
                                do
                                {
                                    if (!((Iterator) (obj)).hasNext())
                                    {
                                        break;
                                    }
                                    SoftReference softreference = (SoftReference)((Iterator) (obj)).next();
                                    if (com.tinder.utils.o.a(softreference))
                                    {
                                        ((b)softreference.get()).a();
                                    }
                                } while (true);
                            }
                        } else
                        {
                            try
                            {
                                a.b();
                                if (com.tinder.managers.g.c(b) != null)
                                {
                                    obj = com.tinder.managers.g.c(b).iterator();
                                    do
                                    {
                                        if (!((Iterator) (obj)).hasNext())
                                        {
                                            break;
                                        }
                                        SoftReference softreference2 = (SoftReference)((Iterator) (obj)).next();
                                        if (com.tinder.utils.o.a(softreference2))
                                        {
                                            ((b)softreference2.get()).b();
                                        }
                                    } while (true);
                                }
                            }
                            // Misplaced declaration of an exception variable
                            catch (Object obj)
                            {
                                v.a("Failed to ping", ((Throwable) (obj)));
                                a.b();
                                if (com.tinder.managers.g.c(b) != null)
                                {
                                    obj = com.tinder.managers.g.c(b).iterator();
                                    do
                                    {
                                        if (!((Iterator) (obj)).hasNext())
                                        {
                                            break;
                                        }
                                        softreference1 = (SoftReference)((Iterator) (obj)).next();
                                        if (com.tinder.utils.o.a(softreference1))
                                        {
                                            ((b)softreference1.get()).b();
                                        }
                                    } while (true);
                                }
                            }
                        }
                        return;
                    }

            
            {
                b = g.this;
                a = z1;
                super();
            }
                }, new com.android.volley.i.a(z1) {

                    final z a;
                    final g b;

                    public final void a(VolleyError volleyerror)
                    {
                        volleyerror = com.tinder.managers.g.d(b).i;
                        com.tinder.managers.g.b(b);
                        a.b();
                    }

            
            {
                b = g.this;
                a = z1;
                super();
            }
                }, s);
                z1.j = new com.android.volley.c(20000, 0, 1.0F);
                com.tinder.managers.ManagerApp.b().a(z1);
                return;
            }
        }
    }

    public final void a(a a1)
    {
        if (i == 0)
        {
            v.b("Attempting to remove a location listener, but none are registered! Check your code!");
        } else
        {
            i = i - 1;
            (new StringBuilder("location numGpsUsers: ")).append(i);
            if (i == 0)
            {
                g();
            }
            int i1 = 0;
            while (i1 < g.size()) 
            {
                if (g.get(i1) == a1)
                {
                    g.remove(i1);
                    return;
                }
                i1++;
            }
        }
    }

    public final void a(b b1)
    {
        if (d != null)
        {
            Iterator iterator = d.iterator();
            while (iterator.hasNext()) 
            {
                SoftReference softreference = (SoftReference)iterator.next();
                if (softreference.get() == null || softreference.get() == b1)
                {
                    iterator.remove();
                }
            }
        }
    }

    public final boolean a(Activity activity)
    {
label0:
        {
            {
                (new StringBuilder("Updating current location using activity ")).append(activity.getClass().getSimpleName());
                b = new WeakReference(activity);
                if (a == null)
                {
                    break label0;
                }
                if (a.d())
                {
                    activity = i.b.a(a);
                    (new StringBuilder("location ")).append(activity);
                    if (activity != null)
                    {
                        boolean flag;
                        if (com.tinder.utils.o.c())
                        {
                            StringBuilder stringbuilder;
                            boolean flag1;
                            if (SystemClock.elapsedRealtimeNanos() - activity.getElapsedRealtimeNanos() > 0x11e1a300L)
                            {
                                flag = false;
                            } else
                            {
                                flag = true;
                            }
                            stringbuilder = new StringBuilder("last known location is too old to use? ");
                            if (!flag)
                            {
                                flag1 = true;
                            } else
                            {
                                flag1 = false;
                            }
                            stringbuilder.append(flag1);
                        } else
                        {
                            flag = true;
                        }
                        if (flag)
                        {
                            a(((Location) (activity)));
                            return true;
                        }
                    }
                } else
                {
                    v.b("location googleapiclient not connected but setup, trying to connect");
                    if (!c)
                    {
                        b();
                    }
                }
            }
            return false;
        }
        if (!c)
        {
            a();
        }
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_164;
        }
    }

    public final void b()
    {
        if (a != null && !a.e() && !a.d())
        {
            a.b();
        }
    }

    public final boolean c()
    {
        (new StringBuilder("location lat: ")).append(d()).append(" lon: ").append(e());
        return d() != -100000D && e() != -100000D;
    }

    public final double d()
    {
        if (p == null)
        {
            return -100000D;
        } else
        {
            return p.getLatitude();
        }
    }

    public final double e()
    {
        if (p == null)
        {
            return -100000D;
        } else
        {
            return p.getLongitude();
        }
    }

    public final void f()
    {
        if (g != null)
        {
            for (int i1 = 0; i1 < g.size(); i1++)
            {
                g.remove(i1);
            }

        }
        i = 0;
        g();
    }
}

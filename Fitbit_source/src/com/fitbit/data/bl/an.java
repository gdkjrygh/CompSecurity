// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.blinkfeed.FitbitIdentityProvider;
import com.fitbit.data.bl.exceptions.AuthenticationException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.exceptions.SignupException;
import com.fitbit.data.domain.Gender;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.ProfilePreference;
import com.fitbit.data.domain.UnitSystem;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.repo.ag;
import com.fitbit.data.repo.am;
import com.fitbit.data.repo.l;
import com.fitbit.data.repo.n;
import com.fitbit.dncs.DncsPairingManager;
import com.fitbit.dncs.c;
import com.fitbit.home.ui.DashboardFragment;
import com.fitbit.mixpanel.f;
import com.fitbit.multipledevice.a;
import com.fitbit.pedometer.e;
import com.fitbit.savedstate.d;
import com.fitbit.savedstate.p;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.b;
import com.fitbit.util.PushNotificationsController;
import com.fitbit.util.al;
import com.fitbit.weight.Weight;
import com.squareup.picasso.Cache;
import java.util.Date;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.bl:
//            m, ao, aq, ad, 
//            dg, l, am, i, 
//            BadgesBusinessLogic, FacebookBusinessLogic, ez

public class an
{

    public static final String a = "ProfileBusinessLogic";
    public static Length b;
    public static Length c;
    public static long d = 0x1b7740L;
    private static an e;
    private static final Object o = new Object();
    private final am f = com.fitbit.data.bl.aq.a().i();
    private final n g = com.fitbit.data.bl.aq.a().t();
    private final m h = new m();
    private final b i = new b();
    private final PublicAPI j = new PublicAPI(ServerGateway.a());
    private final ao k = new ao();
    private Profile l;
    private volatile boolean m;
    private volatile boolean n;

    private an()
    {
        l = null;
        m = false;
        n = false;
    }

    public static an a()
    {
        com/fitbit/data/bl/an;
        JVM INSTR monitorenter ;
        an an1;
        if (e == null)
        {
            e = new an();
        }
        an1 = e;
        com/fitbit/data/bl/an;
        JVM INSTR monitorexit ;
        return an1;
        Exception exception;
        exception;
        throw exception;
    }

    static am a(an an1)
    {
        return an1.f;
    }

    static n b(an an1)
    {
        return an1.g;
    }

    private EnumSet b(boolean flag)
        throws ServerCommunicationException, JSONException
    {
        JSONObject jsonobject;
        if (flag)
        {
            jsonobject = j.a(true, 0x7fffffffffffffffL, false);
        } else
        {
            jsonobject = j.a(false, d, k());
        }
        return k.W(jsonobject);
    }

    public Device a(String s)
    {
        return g.getByEncodedId(s);
    }

    public JSONObject a(String s, String s1, String s2, Date date, Length length, Weight weight, Gender gender, 
            boolean flag)
        throws ServerCommunicationException, JSONException, AuthenticationException, SignupException
    {
        String s3;
        String s4;
        if (length != null)
        {
            s3 = UnitSystem.getByHeightUnit((com.fitbit.data.domain.Length.LengthUnits)length.a()).getSerializableName();
        } else
        {
            s3 = null;
        }
        if (weight != null)
        {
            s4 = UnitSystem.getByWeightUnit((com.fitbit.data.domain.WeightLogEntry.WeightUnits)weight.a()).getSerializableName();
        } else
        {
            s4 = null;
        }
        if (gender != null)
        {
            gender = gender.getSerializableName();
        } else
        {
            gender = null;
        }
        return j.a(s, s1, s2, date, length, s3, weight, s4, gender, flag);
    }

    public void a(ad ad1)
        throws AuthenticationException, ServerCommunicationException
    {
        j.a(ad1.a, ad1.b, true);
    }

    public void a(h.a a1)
        throws AuthenticationException, ServerCommunicationException, JSONException
    {
        h.c();
        com.fitbit.data.bl.dg.d().a(a1);
    }

    public void a(Profile profile)
    {
        if (l != null)
        {
            profile.setEntityId(l.getEntityId());
        }
        f.runInTransaction(new Runnable(profile) {

            final Profile a;
            final an b;

            public void run()
            {
                if (a.isNew())
                {
                    com.fitbit.data.bl.an.a(b).add(a);
                    return;
                } else
                {
                    com.fitbit.data.bl.an.a(b).save(a);
                    return;
                }
            }

            
            {
                b = an.this;
                a = profile;
                super();
            }
        });
        a(true);
        FitBitApplication.a().c().a();
    }

    public void a(Profile profile, Context context)
    {
        com.fitbit.data.bl.l.a(profile, com.fitbit.data.bl.aq.a().i(), context);
        a(true);
    }

    public void a(Device device)
    {
        g.runInTransaction(new Runnable(device) {

            final Device a;
            final an b;

            public void run()
            {
                List list = b.f();
                Profile profile = b.b();
                Iterator iterator = list.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Device device1 = (Device)iterator.next();
                    device1.a(profile);
                    if (!a.d().equals(device1.d()))
                    {
                        continue;
                    }
                    device1.a(a.e());
                    break;
                } while (true);
                profile.a(list);
                com.fitbit.data.bl.an.b(b).saveAll(list);
            }

            
            {
                b = an.this;
                a = device;
                super();
            }
        });
    }

    public void a(Device device, Context context)
    {
        a(device, context, true);
    }

    public void a(Device device, Context context, boolean flag)
    {
        com.fitbit.data.bl.l.a(device, g, context);
        if (flag)
        {
            com.fitbit.multipledevice.a.a().a(device.c(), com.fitbit.serverinteraction.SynclairApi.SyncTrigger.b, false);
        }
    }

    public void a(String s, String s1)
        throws AuthenticationException, ServerCommunicationException
    {
        a(new ad(s, s1));
        h.c();
    }

    public void a(String s, String s1, h.a a1)
        throws AuthenticationException, ServerCommunicationException, JSONException
    {
        a(new ad(s, s1));
        h.c();
        try
        {
            com.fitbit.data.bl.dg.d().a(a1);
            FitbitIdentityProvider.a();
            (new com.fitbit.runtrack.data.b()).b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        ServerGateway.a().i();
        i.c();
        h.c();
        d();
        throw s;
    }

    public void a(EnumSet enumset)
    {
        Object obj = o;
        obj;
        JVM INSTR monitorenter ;
        if (l == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        l.a(enumset);
        n = false;
_L2:
        return;
        n = true;
        if (true) goto _L2; else goto _L1
_L1:
        enumset;
        obj;
        JVM INSTR monitorexit ;
        throw enumset;
    }

    public void a(boolean flag)
    {
        m = flag;
    }

    public Profile b()
    {
        boolean flag;
label0:
        {
            obj1 = null;
            flag = true;
            synchronized (o)
            {
                if (l == null || m)
                {
                    break label0;
                }
                obj1 = l;
            }
            return ((Profile) (obj1));
        }
        if (l != null || n)
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        List list = f.getAll();
        Object obj2;
        if (flag && !list.isEmpty())
        {
            try
            {
                obj = b(true);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = EnumSet.noneOf(com/fitbit/data/domain/ProfilePreference);
            }
        } else
        {
            obj = null;
        }
        obj2 = o;
        obj2;
        JVM INSTR monitorenter ;
        if (l != null)
        {
            obj = l.D();
        }
        if (!list.isEmpty()) goto _L2; else goto _L1
_L1:
        l = ((Profile) (obj1));
        m = false;
        if (l != null) goto _L4; else goto _L3
_L3:
        n = true;
_L5:
        return l;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L2:
        obj1 = (Profile)list.get(0);
          goto _L1
_L4:
        l.a(((EnumSet) (obj)));
          goto _L5
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
          goto _L1
    }

    public void b(Profile profile)
    {
        com.fitbit.data.bl.l.a(profile, com.fitbit.data.bl.aq.a().i());
        a(true);
    }

    public void b(Device device)
    {
        com.fitbit.data.bl.l.a(device, g);
    }

    public Length c(Profile profile)
    {
        if (profile.J() == Gender.MALE)
        {
            return b;
        } else
        {
            return c;
        }
    }

    public Profile c()
    {
        List list = f.getAll();
        if (list.isEmpty())
        {
            return null;
        } else
        {
            return (Profile)list.get(0);
        }
    }

    public void d()
    {
        FitBitApplication fitbitapplication = FitBitApplication.a();
        DashboardFragment.k();
        com.fitbit.livedata.auth.a.a();
        com.fitbit.data.bl.aq.a().S();
        (new com.fitbit.runtrack.data.b()).b();
        com.fitbit.data.repo.l.b().c();
        com.fitbit.serverinteraction.c.a.c().clear();
        DncsPairingManager.a().c();
        com.google.android.gcm.b.c(fitbitapplication);
        PushNotificationsController.a(fitbitapplication);
        com.fitbit.data.bl.am.a().d();
        com.fitbit.pedometer.service.a.a();
        com.fitbit.pedometer.e.g().e();
        com.fitbit.data.bl.i.a().g();
        com.fitbit.data.bl.BadgesBusinessLogic.a().b();
        com.fitbit.data.bl.FacebookBusinessLogic.a().f();
        com.fitbit.data.bl.dg.d().c().a();
        synchronized (o)
        {
            l = null;
            n = true;
        }
        com.fitbit.multipledevice.a.a().b();
        p.a();
        al.b(null);
        ServerGateway.a().i();
        i.c();
        obj = (ad)h.b();
        if (obj != null)
        {
            h.c();
            if (((ad) (obj)).a != null && com.fitbit.savedstate.d.h() == null)
            {
                com.fitbit.savedstate.d.a(((ad) (obj)).a);
            }
        }
        com.fitbit.dncs.c.a().b();
        com.fitbit.widget.b.a(fitbitapplication);
        com.fitbit.widget.b.b(fitbitapplication);
        com.fitbit.mixpanel.f.b();
        FitbitIdentityProvider.a();
        FitBitApplication.a(fitbitapplication).c().a();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public List e()
        throws ServerCommunicationException, JSONException
    {
        JSONObject jsonobject = (new PublicAPI(ServerGateway.a())).m();
        return (new ao()).a(jsonobject, b());
    }

    public List f()
    {
        return g.getAll();
    }

    public boolean g()
    {
        com.fitbit.serverinteraction.a a1 = (com.fitbit.serverinteraction.a)i.b();
        return a1 != null && a1.a != null && a1.b != null;
    }

    public ad h()
    {
        return (ad)h.b();
    }

    public boolean i()
    {
        ad ad1 = (ad)h.b();
        return ad1 != null && ad1.a != null && ad1.b != null;
    }

    public boolean j()
    {
        Object obj = o;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (l != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean k()
    {
        return n;
    }

    public EnumSet l()
        throws ServerCommunicationException, JSONException
    {
        return b(false);
    }

    static 
    {
        b = new Length(1.758D, com.fitbit.data.domain.Length.LengthUnits.METERS);
        c = new Length(1.6200000000000001D, com.fitbit.data.domain.Length.LengthUnits.METERS);
    }
}

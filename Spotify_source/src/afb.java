// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.bmwgroup.connected.car.internal.SdkManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class afb
    implements ado
{

    public static final ahn a = ahn.a("connected.car.sdk");
    private static String h[] = {
        "geo.currentPosition", "geo.bearing"
    };
    private static String i[] = {
        "telephony"
    };
    private static String j[] = {
        "consumption"
    };
    private static String k[] = {
        "rawcds"
    };
    private static String l[] = {
        "instrumentcluster"
    };
    private static String m[] = {
        "voicerecorder"
    };
    protected agm b;
    public final Map c = new HashMap();
    public HashMap d;
    private final agk e = new agl();
    private String f;
    private final String g;
    private final Context n;

    public afb(Context context, adp adp)
    {
        a.b("setApplicationListener()", new Object[0]);
        n = context;
        g = context.getPackageName();
        SdkManager.a.mApplicationName = g;
        SdkManager.a.a(SdkManager.a.mApplicationName, adp, true);
        aia.a(context, SdkManager.a.mApplicationName);
        context = aia.a(g);
        adp = e;
        String s = g;
        try
        {
            ahz ahz1 = (ahz)agn.newInstance();
            ahz1.a = s;
            ((aia) (context)).c.put(agk, ahz1);
            ((aia) (context)).e.put(agk, adp);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        context = aia.a(g);
        adp = g;
        try
        {
            aib aib1 = (aib)agm.newInstance();
            aib1.a = adp;
            ((aia) (context)).d.put(agj, aib1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        aia.a(g).b();
        b = (agm)aia.a(g).a(agj);
        (new afc(this)).a();
    }

    static String a(afb afb1)
    {
        return afb1.g;
    }

    private void a(String as[], adr adr)
    {
        int j1 = as.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            String s = as[i1];
            a.b((new StringBuilder("Registering ")).append(s).toString(), new Object[0]);
            List list = (List)c.get(s);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
            }
            if (!((List) (obj)).contains(adr))
            {
                ((List) (obj)).add(adr);
            }
            c.put(s, obj);
        }

    }

    static ahn b()
    {
        return a;
    }

    static Context b(afb afb1)
    {
        return afb1.n;
    }

    private boolean b(String s)
    {
        if (d == null)
        {
            return true;
        }
        return d.containsKey(s) && ((Boolean)d.get(s)).booleanValue();
    }

    public final adm a()
    {
        return (adm)SdkManager.a.b(f);
    }

    public final adq a(adr adr)
    {
        afj afj1 = null;
        if (!(adr instanceof adv)) goto _L2; else goto _L1
_L1:
        if (b("geolocation"))
        {
            a(h, adr);
            afj1 = new afj(g);
        }
_L4:
        return afj1;
_L2:
        if (!(adr instanceof aed))
        {
            break; /* Loop/switch isn't completed */
        }
        if (b("telephony"))
        {
            a(i, adr);
            return new afm(g);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (adr instanceof adt)
        {
            a(j, adr);
            return new afh(g);
        }
        if (adr instanceof aeb)
        {
            a(k, adr);
            return new afl(g);
        }
        if (adr instanceof ady)
        {
            a(l, adr);
            return new afk(g);
        }
        if (adr instanceof aef)
        {
            a(m, adr);
            return new afn(g);
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void a(adm adm1)
    {
        if (adm1 != null)
        {
            f = SdkManager.a.a(adm1);
            SdkManager.a.a(f, adm1, true);
            ((agm)aia.a(g).a(agj)).a(SdkManager.a.mApplicationName, f);
            return;
        } else
        {
            a.b("called setListener(NULL)", new Object[0]);
            return;
        }
    }

    public final void a(String s)
    {
        Object obj = b;
        obj = new Intent((new StringBuilder()).append(((agm) (obj)).a).append("#setStatusBarText(java.lang.String arg0)").toString());
        ((Intent) (obj)).putExtra("arg0", s);
        agm.a(((Intent) (obj)));
    }

}

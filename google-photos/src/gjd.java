// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Location;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class gjd
    implements lzl, lzm, omb, opt, opu, opv
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"
    })));
    private final gje b[];
    private List c;
    private Set d;
    private Context e;
    private mdb f;
    private gss g;

    public transient gjd(opd opd1, gje agje[])
    {
        d = new HashSet();
        b = agje;
        opd1.a(this);
    }

    private void e()
    {
        gje agje[];
        int i;
        int j;
        agje = b;
        j = agje.length;
        i = 0;
_L6:
        gje gje1;
        Iterator iterator;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        gje1 = agje[i];
        iterator = d.iterator();
_L2:
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_174;
        }
        Locale locale = (Locale)iterator.next();
        String s = locale.getCountry();
        obj = (TelephonyManager)e.getSystemService("phone");
        String s1 = ((TelephonyManager) (obj)).getSimCountryIso();
        if (s1 != null && s1.length() == 2)
        {
            obj = s1.toUpperCase(Locale.US);
        } else
        {
label0:
            {
                if (((TelephonyManager) (obj)).getPhoneType() == 2)
                {
                    break label0;
                }
                obj = ((TelephonyManager) (obj)).getNetworkCountryIso();
                if (obj == null || ((String) (obj)).length() != 2)
                {
                    break label0;
                }
                obj = ((String) (obj)).toUpperCase(Locale.US);
            }
        }
_L3:
        if (!s.equals(obj)) goto _L2; else goto _L1
_L1:
        obj = locale;
_L4:
        gje1.a(((Locale) (obj)));
        i++;
        continue; /* Loop/switch isn't completed */
        obj = null;
          goto _L3
        Locale locale1 = e.getResources().getConfiguration().locale;
        obj = locale1;
        if (!d.contains(locale1))
        {
            obj = null;
        }
          goto _L4
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void V_()
    {
        f.c();
    }

    public final void X_()
    {
        f.b();
    }

    public final void a()
    {
        if (f.e() && !f.d()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!g.a(e, a)) goto _L4; else goto _L3
_L3:
        Object obj = f.a();
        if (obj == null) goto _L6; else goto _L5
_L5:
        double d1;
        double d2;
        d1 = ((Location) (obj)).getLatitude();
        d2 = ((Location) (obj)).getLongitude();
        obj = c.iterator();
_L9:
        if (!((Iterator) (obj)).hasNext()) goto _L6; else goto _L7
_L7:
        gjf gjf1 = (gjf)((Iterator) (obj)).next();
        if (!gjf1.a(d1, d2)) goto _L9; else goto _L8
_L8:
        obj = gjf1.a();
_L10:
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        gje agje[] = b;
        int j = agje.length;
        int i = 0;
        while (i < j) 
        {
            agje[i].a(((Locale) (obj)));
            i++;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        obj = null;
        if (true) goto _L10; else goto _L4
_L4:
        e();
        return;
        if (true) goto _L1; else goto _L11
_L11:
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        e = context;
        g = (gss)olm1.a(gss);
        f = ((mdc)olm1.a(mdc)).a(context, this, this);
        c = olm1.c(gjf);
        for (context = c.iterator(); context.hasNext(); d.add(olm1.a()))
        {
            olm1 = (gjf)context.next();
        }

    }

    public final void c()
    {
        e();
    }

    public final void d()
    {
        e();
    }

}

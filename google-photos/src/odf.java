// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

final class odf
    implements msc
{

    private Map a;
    private final ocw b = new ocw();
    private final ocx c;
    private final int d;

    public odf(Context context)
    {
        a = new HashMap();
        a.put(mry, new oeh());
        a.put(obw, new odk());
        a.put(obz, new odn());
        a.put(ocd, new odo());
        a.put(ocj, new odu());
        a.put(ocq, new oea());
        a.put(oce, new odp());
        a.put(ocr, new oeb());
        a.put(oci, new odt());
        a.put(och, new ods());
        a.put(ock, new odv());
        a.put(obu, new odj());
        a.put(ocl, new odw());
        a.put(obt, new odi());
        a.put(oby, new odm());
        a.put(obx, new odl());
        a.put(ocf, new odq());
        a.put(ocs, new oec());
        a.put(oct, new oed());
        a.put(ocu, new oee());
        a.put(ocv, new oef());
        a.put(obs, new odg());
        a.put(ocp, new odz());
        a.put(ocg, new odr());
        a.put(ocm, new odx());
        a.put(oco, new odh());
        a.put(ocn, new ody());
        int i;
        if (b.y(context))
        {
            i = 3;
        } else
        {
            i = 2;
        }
        d = i;
        c = (ocx)olm.a(context, ocx);
    }

    public final void a(Context context, mru mru, Bundle bundle)
    {
        if (!a.containsKey(mru.getClass()))
        {
            return;
        } else
        {
            ocw.a(context, mru, bundle);
            ocw.a(context, bundle);
            return;
        }
    }

    public final boolean a(mru mru, Bundle bundle)
    {
        String s;
        oeg oeg1;
        int i;
        oeg1 = (oeg)a.get(mru.getClass());
        if (oeg1 == null)
        {
            return false;
        }
        i = ocw.b(bundle);
        s = "SOCIAL";
        i;
        JVM INSTR lookupswitch 6: default 96
    //                   2: 250
    //                   13: 250
    //                   165: 250
    //                   173: 250
    //                   192: 250
    //                   502: 250;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2
_L1:
        String s1 = ocw.a(bundle);
        oxz oxz1 = new oxz();
        oxz1.a = new qpw();
        oxz1.a.b = i;
        oxz1.a.a = d;
        oxz1.a.c = 2;
        oeg1.a(mru, oxz1, bundle);
        c.a(s1, s, oxz1, bundle);
        if (Log.isLoggable("SocialExtensionHandler", 3))
        {
            String.format(Locale.US, "SocialExtension: %s", new Object[] {
                oxz1
            });
            bundle = Locale.US;
            mru = mru.toString();
            boolean flag;
            if (s1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            String.format(bundle, "Handled event: %s signed-in: %b", new Object[] {
                mru, Boolean.valueOf(flag)
            });
        }
        return true;
_L2:
        s = "PHOTOS";
          goto _L1
    }
}

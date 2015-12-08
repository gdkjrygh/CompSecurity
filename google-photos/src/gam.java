// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gam extends ogq
{

    private static final ekk b = (new ekm()).a(hpg).a();
    private final Context c;
    private final List d;

    public gam(Context context, msp msp, List list)
    {
        super(msp);
        p.a(list);
        c = context.getApplicationContext();
        d = list;
    }

    private ogw a(ekp ekp1)
    {
        Object obj;
        byte byte0;
        if (ekp1.c().g == njx.b)
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        obj = ((hpg)((ekp)b.a(c, ekp1).a(ekp1, b).a()).a(hpg)).b();
        if (obj == null)
        {
            try
            {
                throw new eke("No resolved media.");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            if (Log.isLoggable("PhotosDeferredVEs", 3))
            {
                ekp1 = String.valueOf(ekp1);
                (new StringBuilder(String.valueOf(ekp1).length() + 30)).append("Error while resolving media : ").append(ekp1);
            }
            return ogw.a(byte0);
        }
        if (((hpk) (obj)).a())
        {
            return ogw.a(byte0, ((hpk) (obj)).c);
        }
        obj = ogw.b(byte0, ((hpk) (obj)).e);
        return ((ogw) (obj));
    }

    protected final msm a(msp msp)
    {
        ArrayList arraylist = new ArrayList(d.size());
        for (Iterator iterator = d.iterator(); iterator.hasNext(); arraylist.add(a((ekp)iterator.next()))) { }
        return new ogv(msp, (ogw[])arraylist.toArray(new ogw[arraylist.size()]));
    }

}

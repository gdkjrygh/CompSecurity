// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class ita extends AsyncTask
{

    final isz a;

    ita(isz isz1)
    {
        a = isz1;
        super();
    }

    private transient iui a(elb aelb[])
    {
        HashMap hashmap;
        Object obj;
        obj = aelb[0];
        hashmap = new HashMap();
        aelb = new ArrayList();
        elw elw1 = (elw)olm.a(((ei) (a)).f, elw);
        ekp ekp2;
        for (obj = ((List)((elb) (obj)).a()).iterator(); ((Iterator) (obj)).hasNext(); aelb.add(((ekv)elw1.a(ekp2.a())).a(ekp2, isz.q()).a()))
        {
            ekp2 = (ekp)((Iterator) (obj)).next();
        }

          goto _L1
_L3:
        return new iui(hashmap);
_L1:
        for (aelb = aelb.iterator(); aelb.hasNext();)
        {
            ekp ekp1 = (ekp)aelb.next();
            Iterator iterator = ((hpg)ekp1.a(hpg)).a.iterator();
            while (iterator.hasNext()) 
            {
                hashmap.put(((hpk)iterator.next()).c, ekp1);
            }
        }

        try
        {
            if (isz.a(a) == null)
            {
                break MISSING_BLOCK_LABEL_145;
            }
            isz.a(a);
        }
        // Misplaced declaration of an exception variable
        catch (elb aelb[])
        {
            aelb = String.valueOf(aelb.getMessage());
            if (aelb.length() != 0)
            {
                aelb = "CoreOperationException while trying to load list of media object: ".concat(aelb);
            } else
            {
                aelb = new String("CoreOperationException while trying to load list of media object: ");
            }
            Log.e("StoryLoader", aelb);
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((elb[])aobj);
    }
}

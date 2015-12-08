// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import android.location.Location;
import com.vungle.log.Logger;
import dagger.Lazy;

// Referenced classes of package com.vungle.publisher:
//            cj, cm

public class ck
    implements cj
{

    boolean a;
    boolean b;
    public Lazy c;
    public cm d;

    public ck()
    {
        a = true;
        b = true;
    }

    public final Location b()
    {
        Object obj = null;
        if (!b) goto _L2; else goto _L1
_L1:
        Object obj2 = d;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        obj = ((cj) (obj2)).b();
        Object obj1 = obj2;
_L7:
        obj2 = obj1;
        boolean flag = a;
        obj2 = obj;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        obj2 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        obj2 = (cj)c.get();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        obj1 = ((cj) (obj2)).b();
        obj = obj1;
        obj2 = obj;
        return ((Location) (obj2));
        obj;
        Logger.i("VungleLocation", (new StringBuilder("permanent error obtaining detailed location ")).append(obj2).toString(), ((Throwable) (obj)));
        b = false;
        obj = null;
        obj1 = obj2;
        continue; /* Loop/switch isn't completed */
        obj;
        Logger.i("VungleLocation", (new StringBuilder("error obtaining detailed location ")).append(obj2).toString(), ((Throwable) (obj)));
        obj = null;
        obj1 = obj2;
        continue; /* Loop/switch isn't completed */
        Object obj3;
        obj3;
_L5:
        obj2 = obj1;
        Logger.i("VungleLocation", (new StringBuilder("permanent error obtaining detailed location ")).append(obj1).toString(), ((Throwable) (obj3)));
        obj2 = obj1;
        a = false;
        return ((Location) (obj));
        obj3;
        obj1 = obj;
        obj = obj3;
_L3:
        Logger.i("VungleLocation", (new StringBuilder("error obtaining detailed location ")).append(obj2).toString(), ((Throwable) (obj)));
        return ((Location) (obj1));
        obj3;
_L4:
        obj2 = obj1;
        Logger.i("VungleLocation", (new StringBuilder("error obtaining detailed location ")).append(obj1).toString(), ((Throwable) (obj3)));
        return ((Location) (obj));
        obj;
        obj2 = null;
        obj1 = null;
          goto _L3
        obj;
        obj1 = null;
          goto _L3
        obj3;
        obj1 = obj2;
          goto _L4
        obj3;
        obj1 = obj2;
        if (true) goto _L5; else goto _L2
_L2:
        obj1 = null;
        obj = null;
        if (true) goto _L7; else goto _L6
_L6:
    }
}

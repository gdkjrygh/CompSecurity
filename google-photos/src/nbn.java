// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class nbn extends jp
{

    nbn(nbl nbl, int i)
    {
        super(i);
    }

    protected final void a(boolean flag, Object obj, Object obj1, Object obj2)
    {
        obj2 = (nxd)obj;
        obj = (nbc)obj1;
        if (flag)
        {
            if (((nxb) (obj)).m)
            {
                obj1 = String.valueOf(obj2);
                (new StringBuilder(String.valueOf(obj1).length() + 26)).append("Evicted image from cache: ").append(((String) (obj1)));
                if (Log.isLoggable("ImageResourceManager", 2))
                {
                    obj1 = g();
                    String s;
                    int i;
                    for (obj2 = ((Map) (obj1)).keySet().iterator(); ((Iterator) (obj2)).hasNext(); (new StringBuilder(String.valueOf(s).length() + 26)).append("   id: ").append(s).append("; size: ").append(i))
                    {
                        nxd nxd1 = (nxd)((Iterator) (obj2)).next();
                        s = String.valueOf(nxd1);
                        i = ((nbc)((Map) (obj1)).get(nxd1)).m();
                    }

                }
            }
            ((nbc) (obj)).h();
        }
    }

    protected final int b(Object obj, Object obj1)
    {
        return ((nbc)obj1).m();
    }
}

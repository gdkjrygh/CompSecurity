// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LruCache;
import java.util.Iterator;
import java.util.List;

final class bli extends LruCache
{

    private blh a;

    bli(blh blh1, int i)
    {
        a = blh1;
        super(1000);
    }

    protected final Object create(Object obj)
    {
label0:
        {
            String s1 = (String)obj;
            obj = null;
            String s = null;
            if (s1.isEmpty())
            {
                break label0;
            }
            Iterator iterator = a.a.b().iterator();
            obj = s;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                obj = (String)iterator.next();
                s = a.a.a(((String) (obj)), s1);
                obj = s;
            } while (s == null);
            obj = s;
        }
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = "";
        }
        return obj1;
    }
}

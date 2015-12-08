// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.z;
import com.tinder.utils.o;
import com.tinder.utils.v;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            g

final class a
    implements com.android.volley.
{

    final z a;
    final g b;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        (new StringBuilder("response=")).append(obj);
        g.b(b);
        SoftReference softreference1;
        if (((JSONObject) (obj)).optInt("status", 200) == 200)
        {
            a.a();
            if (g.c(b) != null)
            {
                obj = g.c(b).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    SoftReference softreference = (SoftReference)((Iterator) (obj)).next();
                    if (o.a(softreference))
                    {
                        ((nce)softreference.get()).a();
                    }
                } while (true);
            }
        } else
        {
            try
            {
                a.b();
                if (g.c(b) != null)
                {
                    obj = g.c(b).iterator();
                    do
                    {
                        if (!((Iterator) (obj)).hasNext())
                        {
                            break;
                        }
                        SoftReference softreference2 = (SoftReference)((Iterator) (obj)).next();
                        if (o.a(softreference2))
                        {
                            ((nce)softreference2.get()).b();
                        }
                    } while (true);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                v.a("Failed to ping", ((Throwable) (obj)));
                a.b();
                if (g.c(b) != null)
                {
                    obj = g.c(b).iterator();
                    do
                    {
                        if (!((Iterator) (obj)).hasNext())
                        {
                            break;
                        }
                        softreference1 = (SoftReference)((Iterator) (obj)).next();
                        if (o.a(softreference1))
                        {
                            ((nce)softreference1.get()).b();
                        }
                    } while (true);
                }
            }
        }
        return;
    }

    nce(g g1, z z1)
    {
        b = g1;
        a = z1;
        super();
    }
}

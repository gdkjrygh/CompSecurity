// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.a;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.c.c.a.e;
import org.c.c.b.f;
import org.c.c.n;

// Referenced classes of package org.c.e.a:
//            g, l

class m
    implements g
{

    final l a;
    private final Class b;

    private m(l l1, Class class1)
    {
        a = l1;
        super();
        b = class1;
    }

    m(l l1, Class class1, byte byte0)
    {
        this(l1, class1);
    }

    public void doWithRequest(e e1)
    {
        if (b != null)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = a.getMessageConverters().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                f f1 = (f)iterator.next();
                if (f1.canRead(b, null))
                {
                    Iterator iterator1 = f1.getSupportedMediaTypes().iterator();
                    while (iterator1.hasNext()) 
                    {
                        n n2 = (n)iterator1.next();
                        n n1 = n2;
                        if (n2.getCharSet() != null)
                        {
                            n1 = new n(n2.getType(), n2.getSubtype());
                        }
                        arraylist.add(n1);
                    }
                }
            } while (true);
            if (!arraylist.isEmpty())
            {
                n.sortBySpecificity(arraylist);
                if (Log.isLoggable("RestTemplate", 3))
                {
                    Log.d("RestTemplate", (new StringBuilder("Setting request Accept header to ")).append(arraylist).toString());
                }
                e1.getHeaders().setAccept(arraylist);
            }
        }
    }
}

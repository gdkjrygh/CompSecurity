// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.a;

import android.util.Log;
import java.util.Iterator;
import java.util.List;
import org.c.c.a.i;
import org.c.c.f;
import org.c.c.l;
import org.c.c.n;
import org.c.d.a;

// Referenced classes of package org.c.e.a:
//            j, k

public final class d
    implements j
{

    private final Class a;
    private final List b;

    public d(Class class1, List list)
    {
        org.c.d.a.notNull(class1, "'responseType' must not be null");
        org.c.d.a.notEmpty(list, "'messageConverters' must not be empty");
        a = class1;
        b = list;
    }

    public final Object extractData(i i1)
    {
        l l1;
        boolean flag;
        boolean flag1;
        flag1 = false;
        l1 = i1.getStatusCode();
        flag = flag1;
        if (l1 == l.NO_CONTENT) goto _L2; else goto _L1
_L1:
        if (l1 != l.NOT_MODIFIED) goto _L4; else goto _L3
_L3:
        flag = flag1;
_L2:
        if (!flag)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L4:
        flag = flag1;
        if (i1.getHeaders().getContentLength() != 0L)
        {
            flag = true;
        }
        if (true) goto _L2; else goto _L5
_L5:
        n n1 = i1.getHeaders().getContentType();
        if (n1 == null)
        {
            if (Log.isLoggable("RestTemplate", 3))
            {
                Log.d("RestTemplate", "No Content-Type header found, defaulting to application/octet-stream");
            }
            n1 = n.APPLICATION_OCTET_STREAM;
        }
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            org.c.c.b.f f1 = (org.c.c.b.f)iterator.next();
            if (f1.canRead(a, n1))
            {
                if (Log.isLoggable("RestTemplate", 3))
                {
                    Log.d("RestTemplate", (new StringBuilder("Reading [")).append(a.getName()).append("] as \"").append(n1).append("\" using [").append(f1).append("]").toString());
                }
                return f1.read(a, i1);
            }
        }

        throw new k((new StringBuilder("Could not extract response: no suitable HttpMessageConverter found for response type [")).append(a.getName()).append("] and content type [").append(n1).append("]").toString());
    }
}

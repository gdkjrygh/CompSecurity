// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market;

import com.cleanmaster.ui.app.market.loader.AsyncTaskEx;
import com.cleanmaster.util.s;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

// Referenced classes of package com.cleanmaster.ui.app.market:
//            i, d, l

public class k extends AsyncTaskEx
{

    String a;
    String b;
    String c;
    final i d;

    public k(i j)
    {
        d = j;
        super();
        a = "";
        b = "";
        c = "";
    }

    protected volatile Object a(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected transient String a(String as[])
    {
        as = as[0];
        Object obj;
        do
        {
            Object obj1 = d.a(as);
            obj = as;
            if (obj1 == null)
            {
                break;
            }
            obj = as;
            if (((HttpResponse) (obj1)).getStatusLine() == null)
            {
                break;
            }
            int j = ((HttpResponse) (obj1)).getStatusLine().getStatusCode();
            if (j != 301)
            {
                obj = as;
                if (j != 302)
                {
                    break;
                }
            }
            obj1 = ((HttpResponse) (obj1)).getFirstHeader("Location").getValue();
            obj = obj1;
            if (obj1 == null)
            {
                break;
            }
            as = ((String []) (obj1));
            if (!com.cleanmaster.ui.app.market.d.a(((String) (obj1))))
            {
                continue;
            }
            obj = obj1;
            break;
        } while (true);
        return ((String) (obj));
    }

    protected volatile void a(Object obj)
    {
        a((String)obj);
    }

    protected void a(String s1)
    {
        s.a(new l(this, s1));
    }
}

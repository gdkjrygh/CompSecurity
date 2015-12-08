// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.b;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kik.android.util.DeviceUtils;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

// Referenced classes of package com.kik.b:
//            a

public final class b
{

    public static final Pattern a = Pattern.compile("(www.)?kik.com", 2);
    private List b;
    private final a c;

    public b(a a1)
    {
        b = new Vector();
        c = a1;
        if (c == null)
        {
            throw new IllegalArgumentException("Must set a default handler");
        } else
        {
            return;
        }
    }

    private void a()
    {
        c.a(new HashMap(), new HashMap());
    }

    public final void a(a a1)
    {
        b.add(a1);
    }

    public final void a(String s)
    {
        boolean flag1 = false;
        HashMap hashmap;
        URI uri;
        Object obj;
        try
        {
            uri = URI.create(s);
            obj = URLEncodedUtils.parse(uri, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a();
            return;
        }
        hashmap = new HashMap();
        NameValuePair namevaluepair;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((List)hashmap.get(namevaluepair.getName())).add(namevaluepair.getValue()))
        {
            namevaluepair = (NameValuePair)((Iterator) (obj)).next();
            if (!hashmap.containsKey(namevaluepair.getName()))
            {
                hashmap.put(namevaluepair.getName(), new ArrayList());
            }
        }

        boolean flag2 = "kik".equalsIgnoreCase(uri.getScheme());
        boolean flag;
        if (uri.getHost() != null)
        {
            flag = a.matcher(uri.getHost()).matches();
        } else
        {
            flag = false;
        }
        if (uri.getHost() != null)
        {
            flag1 = "users".equalsIgnoreCase(uri.getHost());
        }
        if (DeviceUtils.c() && !flag2 && !flag && !flag1)
        {
            throw new IllegalArgumentException("invalid request url recieved");
        }
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            if (a1.b(s))
            {
                a1.a(a1.a(s), hashmap);
                return;
            }
        }

        a();
    }

}

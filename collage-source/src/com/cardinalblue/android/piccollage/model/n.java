// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import com.cardinalblue.android.b.k;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.http.message.BasicNameValuePair;

public class n
    implements Serializable
{

    private String a;
    private String b;
    private Hashtable c;
    private Hashtable d;
    private String e;

    public n()
    {
    }

    private List d()
    {
        if (c == null)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = c.keySet().iterator(); iterator.hasNext(); arraylist.add(new BasicNameValuePair(s, (String)c.get(s))))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    private List e()
    {
        if (d == null)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = d.keySet().iterator(); iterator.hasNext(); arraylist.add(new BasicNameValuePair(s, (String)d.get(s))))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        String s1 = b;
        List list = d();
        String s = s1;
        if (list != null)
        {
            try
            {
                s = k.a(s1, list);
            }
            catch (URISyntaxException urisyntaxexception)
            {
                urisyntaxexception.printStackTrace();
                return s1;
            }
        }
        return s;
    }

    public String c()
    {
        String s1 = e;
        List list = e();
        String s = s1;
        if (list != null)
        {
            try
            {
                s = k.a(s1, list);
            }
            catch (URISyntaxException urisyntaxexception)
            {
                urisyntaxexception.printStackTrace();
                return s1;
            }
        }
        return s;
    }
}

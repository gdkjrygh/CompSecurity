// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            ab

class k extends HashMap
{

    private static final String a = com/threatmetrix/TrustDefenderMobile/k.getName();
    private int b;

    k()
    {
        b = 0;
    }

    public final k a(String s, String s1)
    {
        put(s, s1);
        return this;
    }

    public final k a(String s, String s1, boolean flag)
    {
        if (s1 != null && !s1.isEmpty())
        {
            put(s, s1.toLowerCase(Locale.US));
            return this;
        } else
        {
            put(s, s1);
            return this;
        }
    }

    public final String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            String s1 = (String)get(s);
            if (s1 != null && !s1.isEmpty())
            {
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append("&");
                }
                stringbuilder.append(s);
                s = s1;
                if (b != 0)
                {
                    s = s1;
                    if (s1.length() > b)
                    {
                        s = s1.substring(0, b);
                    }
                }
                stringbuilder.append("=");
                stringbuilder.append(ab.a(s));
            }
        } while (true);
        return stringbuilder.toString();
    }

    public final void a(int i)
    {
        b = 255;
    }

    public final UrlEncodedFormEntity b()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s2 = (String)iterator.next();
            String s1 = (String)get(s2);
            if (!s1.isEmpty())
            {
                String s = s1;
                if (b != 0)
                {
                    s = s1;
                    if (s1.length() > b)
                    {
                        s = s1.substring(0, b);
                    }
                }
                arraylist.add(new BasicNameValuePair(s2, s));
            }
        } while (true);
        UrlEncodedFormEntity urlencodedformentity;
        try
        {
            urlencodedformentity = new UrlEncodedFormEntity(arraylist, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            Log.e(a, "Failed url encoding", unsupportedencodingexception);
            return null;
        }
        return urlencodedformentity;
    }

}

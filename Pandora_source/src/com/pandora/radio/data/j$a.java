// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import com.pandora.radio.util.i;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.pandora.radio.data:
//            j

public static class ng
    implements Serializable, Comparable
{

    private String a;
    private String b;
    private String c;
    private String d;

    public int a(ng ng)
    {
        if (this != ng)
        {
            int k = i.a(a, ng.a);
            if (k != 0)
            {
                return k;
            }
            k = i.a(b, ng.b);
            if (k != 0)
            {
                return k;
            }
            k = i.a(c, ng.c);
            if (k != 0)
            {
                return k;
            }
            k = i.a(d, ng.d);
            if (k != 0)
            {
                return k;
            }
        }
        return 0;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public int compareTo(Object obj)
    {
        return a((a)obj);
    }

    public String d()
    {
        return d;
    }

    public String toString()
    {
        return b();
    }

    public (String s, String s1, String s2, String s3)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
    }

    public d(JSONObject jsonobject)
        throws JSONException
    {
        a = jsonobject.getString("stationId");
        b = jsonobject.getString("stationName");
        c = jsonobject.getString("stationToken");
        d = jsonobject.optString("artUrl");
    }
}

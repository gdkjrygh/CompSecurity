// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.a;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.android.volley.a.l;
import com.android.volley.i;
import com.tinder.e.ax;
import com.tinder.managers.d;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.tinder.a:
//            f

public final class a extends l
{

    private final Map m;
    private String n;
    private ax o;

    public a(int i, String s, Map map, String s1, ax ax1)
    {
        super(i, s, new com.android.volley.i.b() {

            public final volatile void a(Object obj)
            {
            }

        }, new com.android.volley.i.a(ax1) {

            final ax a;

            public final void a(VolleyError volleyerror)
            {
                if (volleyerror.a != null)
                {
                    a.a(volleyerror.a.a);
                    return;
                } else
                {
                    a.a(500);
                    return;
                }
            }

            
            {
                a = ax1;
                super();
            }
        });
        o = ax1;
        m = map;
        n = s1;
    }

    public a(String s, Map map, String s1, com.android.volley.i.b b, com.android.volley.i.a a1)
    {
        super(0, s, b, a1);
        m = map;
        n = s1;
        (new StringBuilder("url=")).append(s).append(", mPayload=").append(s1);
    }

    public static Map k()
    {
        TreeMap treemap = new TreeMap();
        treemap.put("User-Agent", f.a);
        treemap.put("os-version", f.ab);
        treemap.put("app-version", f.ac);
        treemap.put("platform", "android");
        if (com.tinder.managers.d.b() != null)
        {
            treemap.put("X-Auth-Token", com.tinder.managers.d.b());
        }
        return treemap;
    }

    protected final i a(NetworkResponse networkresponse)
    {
        if (o != null)
        {
            o.a(networkresponse.a);
        }
        return super.a(networkresponse);
    }

    public final Map d()
        throws AuthFailureError
    {
        if (m != null)
        {
            return m;
        } else
        {
            return super.d();
        }
    }

    public final String g()
    {
        return "application/json";
    }

    public final byte[] h()
    {
        (new StringBuilder("Returning ")).append(n);
        byte abyte0[];
        try
        {
            if (n == null)
            {
                n = "";
            }
            abyte0 = n.getBytes("utf-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            com.android.volley.l.d("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[] {
                n, "utf-8"
            });
            return null;
        }
        return abyte0;
    }
}

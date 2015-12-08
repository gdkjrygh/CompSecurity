// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.a;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.i;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.android.volley.a:
//            e

public class l extends Request
{

    private com.android.volley.i.b m;

    public l(int j, String s, com.android.volley.i.b b, com.android.volley.i.a a1)
    {
        super(j, s, a1);
        m = b;
    }

    public i a(NetworkResponse networkresponse)
    {
        String s;
        try
        {
            s = new String(networkresponse.b, e.a(networkresponse.c));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception = new String(networkresponse.b);
        }
        return i.a(s, e.a(networkresponse));
    }

    protected final void a()
    {
        super.a();
        m = null;
    }

    protected final volatile void a(Object obj)
    {
        obj = (String)obj;
        if (m != null)
        {
            m.a(obj);
        }
    }
}

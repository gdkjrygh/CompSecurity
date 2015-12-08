// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.os.AsyncTask;
import com.android.volley.Request;
import com.android.volley.a.i;
import com.android.volley.c;
import com.android.volley.h;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ek, dp, ci, ba, 
//            j, n, hi, gs, 
//            ef, eg

public final class ee extends AsyncTask
{

    final dp a;

    public ee(dp dp1)
    {
        a = dp1;
        super();
    }

    private transient Void a(Object aobj[])
    {
        if (aobj[0] != null)
        {
            break MISSING_BLOCK_LABEL_276;
        }
        Object obj = new HashMap();
_L1:
        StringBuilder stringbuilder;
        String s;
        String s1;
        aobj = (ek)aobj[1];
        stringbuilder = new StringBuilder((new StringBuilder()).append(a.e).append(a.b).append("/api/v1/clientConfig").toString());
        s = stringbuilder.toString();
        ci.b().c.a(stringbuilder);
        s1 = ci.b().d.c.a("user_id");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        ((Map) (obj)).put("uid", s1);
        s1 = ci.b().d.c.a("email");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        ((Map) (obj)).put("email", s1);
        hi.a(((Map) (obj)), stringbuilder);
        obj = new Date();
        if (gs.b())
        {
            gs.a((new StringBuilder("Get Properties From Server, url: ")).append(stringbuilder.toString().replaceAll(" ", "%20")).toString());
        }
        aobj = new i(0, stringbuilder.toString().replaceAll(" ", "%20"), new JSONObject(), new ef(this, ((Date) (obj)), ((ek) (aobj))), new eg(this, s, ((ek) (aobj))));
        aobj.l = "get_clientConfig";
        aobj.j = new c(15000, 3, 1.0F);
        a.f.a(((Request) (aobj)));
        return null;
        try
        {
            obj = (Map)aobj[0];
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            if (aobj instanceof Exception)
            {
                aobj = (Exception)aobj;
            } else
            {
                aobj = null;
            }
            gs.b("error getting TLProperties from Server", ((Exception) (aobj)));
            return null;
        }
          goto _L1
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }
}

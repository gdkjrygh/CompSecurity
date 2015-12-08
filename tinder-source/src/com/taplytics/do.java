// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.VolleyError;
import com.android.volley.a.e;
import com.android.volley.a.j;
import com.android.volley.i;
import com.android.volley.l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ie, ak, c, gs, 
//            ii, if, wildebeast, ib, 
//            ig, hw, hz, ia

public final class do extends j
{

    ie m;
    HttpEntity n;
    com.android.volley.i.b o;
    com.android.volley.i.a p;
    private Map q;

    public do(String s, JSONObject jsonobject, Map map, com.android.volley.i.b b1, com.android.volley.i.a a1)
    {
        String s1;
        if (jsonobject == null)
        {
            s1 = null;
        } else
        {
            s1 = jsonobject.toString();
        }
        super(1, s, s1, b1, a1);
        m = ie.a();
        q = new HashMap();
        p = a1;
        o = b1;
        a(map);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        m.a("body", new ak(jsonobject.toString(), c.c));
        return;
        s;
        gs.b("Adding string to multipart entity", s);
        return;
    }

    private void a(Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); m.a("image", new ii((byte[])entry.getValue(), (String)entry.getKey())))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    protected final i a(NetworkResponse networkresponse)
    {
        try
        {
            networkresponse = i.a(new JSONObject(new String(networkresponse.b, e.a(networkresponse.c))), e.a(networkresponse));
        }
        // Misplaced declaration of an exception variable
        catch (NetworkResponse networkresponse)
        {
            return i.a(new ParseError(networkresponse));
        }
        // Misplaced declaration of an exception variable
        catch (NetworkResponse networkresponse)
        {
            return i.a(new ParseError(networkresponse));
        }
        return networkresponse;
    }

    protected final void a(Object obj)
    {
        obj = (JSONObject)obj;
        o.a(obj);
    }

    public final void b(VolleyError volleyerror)
    {
        if (volleyerror != null)
        {
            p.a(volleyerror);
        }
        gs.b("Volley error", volleyerror);
    }

    public final Map d()
        throws AuthFailureError
    {
        return q;
    }

    public final String g()
    {
        return n.getContentType().getValue();
    }

    public final byte[] h()
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        Object obj1 = m;
        if (((ie) (obj1)).a == null) goto _L2; else goto _L1
_L1:
        String s = ((ie) (obj1)).a;
_L12:
        java.nio.charset.Charset charset = ((ie) (obj1)).d;
        if (((ie) (obj1)).c == null) goto _L4; else goto _L3
_L3:
        String s1 = ((ie) (obj1)).c;
_L13:
        if (((ie) (obj1)).e == null) goto _L6; else goto _L5
_L5:
        Object obj = new ArrayList(((ie) (obj1)).e);
_L14:
        if (((ie) (obj1)).b == null) goto _L8; else goto _L7
_L7:
        obj1 = ((ie) (obj1)).b;
_L15:
        if.a[((wildebeast) (obj1)).ordinal()];
        JVM INSTR tableswitch 1 2: default 243
    //                   1 197
    //                   2 227;
           goto _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_227;
_L9:
        obj = new ib(s, charset, s1, ((java.util.List) (obj)));
_L16:
        n = new ig(((hw) (obj)), ie.a(s1, s, charset), ((hw) (obj)).b());
        n.writeTo(bytearrayoutputstream);
_L17:
        return bytearrayoutputstream.toByteArray();
_L2:
        s = "form-data";
          goto _L12
_L4:
        s1 = ie.b();
          goto _L13
_L6:
        obj = Collections.emptyList();
          goto _L14
_L8:
        obj1 = wildebeast.a;
          goto _L15
_L10:
        obj = new hz(s, charset, s1, ((java.util.List) (obj)));
          goto _L16
        obj;
        l.c("IOException writing to ByteArrayOutputStream", new Object[0]);
          goto _L17
        obj = new ia(s, charset, s1, ((java.util.List) (obj)));
          goto _L16
    }
}

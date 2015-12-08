// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.iap;

import com.kik.cards.web.bf;
import java.util.HashMap;
import kik.a.e.d;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.iap:
//            l

public final class a
    implements l
{

    private final d a;

    public a(d d1)
    {
        a = d1;
    }

    public final String a(JSONObject jsonobject, String s, String s1)
    {
        java.security.interfaces.RSAPrivateKey rsaprivatekey = a.c();
        java.net.URL url = a.b();
        if (rsaprivatekey == null || url == null)
        {
            return "";
        } else
        {
            HashMap hashmap = new HashMap();
            hashmap.put("kikUsr", s);
            hashmap.put("kikExt", "iap");
            hashmap.put("kikCrdDm", bf.j(s1));
            jsonobject = jsonobject.toString();
            return a.a(hashmap, jsonobject);
        }
    }
}

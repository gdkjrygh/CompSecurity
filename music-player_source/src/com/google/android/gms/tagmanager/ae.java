// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            af, t

class ae
{

    private static ae a;
    private volatile af b;
    private volatile String c;
    private volatile String d;
    private volatile String e;

    ae()
    {
        b = af.a;
        d = null;
        c = null;
        e = null;
    }

    static ae a()
    {
        com/google/android/gms/tagmanager/ae;
        JVM INSTR monitorenter ;
        ae ae1;
        if (a == null)
        {
            a = new ae();
        }
        ae1 = a;
        com/google/android/gms/tagmanager/ae;
        JVM INSTR monitorexit ;
        return ae1;
        Exception exception;
        exception;
        throw exception;
    }

    private static String a(String s)
    {
        return s.split("&")[0].split("=")[1];
    }

    final boolean a(Uri uri)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        String s = URLDecoder.decode(uri.toString(), "UTF-8");
        if (!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) goto _L2; else goto _L1
_L1:
        t.d((new StringBuilder("Container preview url: ")).append(s).toString());
        if (!s.matches(".*?&gtm_debug=x$")) goto _L4; else goto _L3
_L3:
        b = af.c;
_L6:
        e = uri.getQuery().replace("&gtm_debug=x", "");
        if (b == af.b || b == af.c)
        {
            d = (new StringBuilder("/r?")).append(e).toString();
        }
        c = a(e);
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        uri;
        flag = false;
          goto _L5
_L4:
        b = af.b;
          goto _L6
        uri;
        throw uri;
_L2:
label0:
        {
            if (!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$"))
            {
                break label0;
            }
            if (!a(uri.getQuery()).equals(c))
            {
                break MISSING_BLOCK_LABEL_239;
            }
            t.d((new StringBuilder("Exit preview mode for container: ")).append(c).toString());
            b = af.a;
            d = null;
        }
          goto _L5
        t.b((new StringBuilder("Invalid preview uri: ")).append(s).toString());
        flag = false;
          goto _L5
        flag = false;
          goto _L5
    }

    final af b()
    {
        return b;
    }

    final String c()
    {
        return d;
    }

    final String d()
    {
        return c;
    }
}

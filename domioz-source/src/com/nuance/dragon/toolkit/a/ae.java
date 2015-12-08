// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import java.util.Enumeration;
import java.util.Hashtable;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            g

public final class ae
    implements g
{

    private Hashtable a;

    public ae(boolean flag)
    {
        a = new Hashtable();
        a.put("SSL_Socket_Enable", "TRUE".getBytes());
        if (flag)
        {
            a.put("SSL_SelfSigned_Cert", "TRUE".getBytes());
        }
    }

    public final Object a(String s)
    {
        return a.get(s);
    }

    public final Enumeration a()
    {
        return a.keys();
    }
}

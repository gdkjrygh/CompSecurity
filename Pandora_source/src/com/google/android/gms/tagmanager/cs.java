// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            q, s, bo, az, 
//            zzbg, r

class cs
    implements q
{

    private static cs a;
    private static final Object b = new Object();
    private String c;
    private String d;
    private az e;
    private r f;

    private cs(Context context)
    {
        this(((r) (s.a(context))), ((az) (new bo())));
    }

    cs(r r1, az az1)
    {
        f = r1;
        e = az1;
    }

    public static q a(Context context)
    {
        synchronized (b)
        {
            if (a == null)
            {
                a = new cs(context);
            }
            context = a;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean a(String s1)
    {
        if (!e.a())
        {
            zzbg.zzan("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
            return false;
        }
        String s2 = s1;
        if (c != null)
        {
            s2 = s1;
            if (d != null)
            {
                try
                {
                    s2 = (new StringBuilder()).append(c).append("?").append(d).append("=").append(URLEncoder.encode(s1, "UTF-8")).toString();
                    zzbg.zzam((new StringBuilder()).append("Sending wrapped url hit: ").append(s2).toString());
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    zzbg.zzd("Error wrapping URL for testing.", s1);
                    return false;
                }
            }
        }
        f.a(s2);
        return true;
    }

}

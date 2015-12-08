// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            v, x, bx, bi, 
//            ak, w

final class dl
    implements v
{

    private static dl a;
    private static final Object b = new Object();
    private String c;
    private String d;
    private bi e;
    private w f;

    private dl(Context context)
    {
        this(((w) (x.a(context))), ((bi) (new bx((byte)0))));
    }

    private dl(w w1, bi bi1)
    {
        f = w1;
        e = bi1;
    }

    public static v a(Context context)
    {
        synchronized (b)
        {
            if (a == null)
            {
                a = new dl(context);
            }
            context = a;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final boolean a(String s)
    {
        if (!e.a())
        {
            ak.b("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
            return false;
        }
        String s1 = s;
        if (c != null)
        {
            s1 = s;
            if (d != null)
            {
                try
                {
                    s1 = (new StringBuilder()).append(c).append("?").append(d).append("=").append(URLEncoder.encode(s, "UTF-8")).toString();
                    ak.b();
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    ak.b("Error wrapping URL for testing.", s);
                    return false;
                }
            }
        }
        f.a(s1);
        return true;
    }

}

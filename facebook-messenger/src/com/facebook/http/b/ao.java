// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import android.content.Context;
import com.facebook.http.annotations.IsSslPersistentCacheEnabled;
import com.facebook.http.annotations.UserAgentString;
import com.facebook.http.c.e;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import javax.inject.a;
import org.apache.http.conn.scheme.SocketFactory;

// Referenced classes of package com.facebook.http.b:
//            ay, w, x

class ao extends d
{

    final w a;

    private ao(w w1)
    {
        a = w1;
        super();
    }

    ao(w w1, x x)
    {
        this(w1);
    }

    public SocketFactory a()
    {
        String s = (String)a(java/lang/String, com/facebook/http/annotations/UserAgentString);
        e e1 = (e)a(com/facebook/http/c/e);
        Context context = (Context)e().a(android/content/Context);
        a a1 = b(java/lang/Boolean, com/facebook/http/annotations/IsSslPersistentCacheEnabled);
        if (!e1.b())
        {
            return com.facebook.http.b.ay.a();
        }
        if (((Boolean)a1.b()).booleanValue())
        {
            return com.facebook.http.b.w.a(context, s);
        } else
        {
            return com.facebook.http.b.w.a(s);
        }
    }

    public Object b()
    {
        return a();
    }
}

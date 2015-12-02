// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import android.content.Context;
import android.net.http.AndroidHttpClient;
import com.facebook.common.c.j;
import com.facebook.f.f;
import com.facebook.f.o;
import com.facebook.http.annotations.IsPhpProfilingEnabled;
import com.facebook.http.annotations.IsSslPersistentCacheEnabled;
import com.facebook.http.annotations.IsTeakProfilingEnabled;
import com.facebook.http.annotations.IsWirehogProfilingEnabled;
import com.facebook.http.annotations.SslSocketFactory;
import com.facebook.http.c.d;
import com.facebook.http.c.e;
import com.facebook.http.protocol.ai;
import com.facebook.http.protocol.ak;
import com.facebook.http.protocol.am;
import com.facebook.http.protocol.an;
import com.facebook.http.protocol.aq;
import com.facebook.http.protocol.ar;
import com.facebook.http.protocol.i;
import com.facebook.http.protocol.q;
import com.facebook.http.protocol.s;
import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.facebook.http.b:
//            l, m, af, ap, 
//            ah, ae, ac, aj, 
//            ao, ad, am, z, 
//            aq, ai, v, ag, 
//            al, aa, ak, an, 
//            ab, y, ar, t, 
//            au, u

public class w extends c
{

    public w()
    {
    }

    static SocketFactory a(Context context, String s1)
    {
        return b(context, s1);
    }

    static SocketFactory a(String s1)
    {
        return b(s1);
    }

    private static SocketFactory b(Context context, String s1)
    {
        try
        {
            context = (AndroidHttpClient)android/net/http/AndroidHttpClient.getMethod("newInstance", new Class[] {
                java/lang/String, android/content/Context
            }).invoke(null, new Object[] {
                s1, context
            });
            s1 = context.getConnectionManager().getSchemeRegistry().get("https").getSocketFactory();
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException(context);
        }
        return s1;
    }

    private static SocketFactory b(String s1)
    {
        s1 = AndroidHttpClient.newInstance(s1);
        SocketFactory socketfactory = s1.getConnectionManager().getSchemeRegistry().get("https").getSocketFactory();
        s1.close();
        return socketfactory;
    }

    protected void a()
    {
        a(org/apache/http/client/CookieStore).b(com/facebook/http/b/l);
        a(org/apache/http/client/HttpClient).b(com/facebook/http/b/m);
        a(com/facebook/http/b/m).a(new af(this, null)).a();
        a(com/facebook/http/b/ap).a(new ah(this, null)).a();
        a(com/facebook/http/b/l).a(new ae(this, null)).a();
        a(org/apache/http/conn/ClientConnectionManager).a(new ac(this, null)).a();
        a(org/apache/http/params/HttpParams).a(new com.facebook.http.b.aj(this, null));
        a(org/apache/http/conn/scheme/SocketFactory).a(com/facebook/http/annotations/SslSocketFactory).a(new ao(this, null));
        a(com/facebook/http/c/e).a(new ad(null)).a();
        a(com/facebook/http/c/g).a(new com.facebook.http.b.am(this, null)).c();
        a(com/facebook/http/protocol/q).a(new z(this, null)).a();
        a(com/facebook/http/b/aq).a(new com.facebook.http.b.ai(null));
        c(com/facebook/f/f).a(com/facebook/http/c/d);
        a(com/facebook/http/b/v).a(new ag(this, null)).a();
        a(com/facebook/common/c/j).a(new al(this, null)).a();
        a(com/facebook/http/protocol/s).a(new aa(this, null)).a();
        a(com/facebook/http/protocol/an).a(new com.facebook.http.b.ak(this, null)).a();
        a(com/facebook/http/protocol/ar).a(new com.facebook.http.b.an(this, null)).a();
        a(com/facebook/http/protocol/w).a(new ab(null)).a();
        a(com/facebook/http/protocol/aq).b(com/facebook/http/protocol/ar);
        a(com/facebook/http/protocol/am).b(com/facebook/http/protocol/an);
        a(com/facebook/http/protocol/i).a(new y(this, null)).a();
        a(com/facebook/http/b/ar).a(new com.facebook.http.b.ar());
        a(java/lang/Boolean).a(com/facebook/http/annotations/IsPhpProfilingEnabled).c(com/facebook/http/protocol/ai);
        a(java/lang/Boolean).a(com/facebook/http/annotations/IsTeakProfilingEnabled).c(com/facebook/http/protocol/aj);
        a(java/lang/Boolean).a(com/facebook/http/annotations/IsWirehogProfilingEnabled).c(com/facebook/http/protocol/ak);
        a(java/lang/Boolean).a(com/facebook/http/annotations/IsSslPersistentCacheEnabled).a(new o("fbandroid_ssl_cache_enabled"));
        c(com/facebook/http/b/t);
        c(com/facebook/http/b/au);
        c(com/facebook/http/b/u);
    }
}

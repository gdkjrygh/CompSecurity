// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.auth;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.r;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.IGsonable;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.facebook.AccessToken;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;

// Referenced classes of package com.cardinalblue.android.piccollage.auth:
//            a

public class PicAuth extends com.cardinalblue.android.piccollage.auth.a
{
    public static class PicLoginResultEvent
        implements IGsonable
    {

        private final a a;

        public a a()
        {
            return a;
        }

        public PicLoginResultEvent(a a1)
        {
            a = a1;
        }
    }

    public static final class PicLoginResultEvent.a extends Enum
    {

        public static final PicLoginResultEvent.a a;
        public static final PicLoginResultEvent.a b;
        private static final PicLoginResultEvent.a c[];

        public static PicLoginResultEvent.a valueOf(String s)
        {
            return (PicLoginResultEvent.a)Enum.valueOf(com/cardinalblue/android/piccollage/auth/PicAuth$PicLoginResultEvent$a, s);
        }

        public static PicLoginResultEvent.a[] values()
        {
            return (PicLoginResultEvent.a[])c.clone();
        }

        static 
        {
            a = new PicLoginResultEvent.a("OK", 0);
            b = new PicLoginResultEvent.a("FAIL", 1);
            c = (new PicLoginResultEvent.a[] {
                a, b
            });
        }

        private PicLoginResultEvent.a(String s, int l)
        {
            super(s, l);
        }
    }

    public static class a extends a.a
    {

        public a(int l)
        {
            super(l);
        }
    }


    private static PicAuth d;
    private String b;
    private PicUser c;
    private final Context e = k.a();

    public PicAuth()
    {
    }

    public static PicAuth h()
    {
        com/cardinalblue/android/piccollage/auth/PicAuth;
        JVM INSTR monitorenter ;
        PicAuth picauth;
        if (d == null)
        {
            d = new PicAuth();
        }
        picauth = d;
        com/cardinalblue/android/piccollage/auth/PicAuth;
        JVM INSTR monitorexit ;
        return picauth;
        Exception exception;
        exception;
        throw exception;
    }

    public void a()
    {
        super.a();
        k.f(e);
    }

    public void a(a.b b1)
    {
        super.a(b1);
    }

    public boolean b()
    {
        return !TextUtils.isEmpty(b);
    }

    protected void c()
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new BasicNameValuePair("redirect_uri", "cardinalblue://localhost/cb_authorized"));
        AccessToken accesstoken = AccessToken.getCurrentAccessToken();
        if (accesstoken != null)
        {
            ((List) (obj)).add(new BasicNameValuePair("fb_access_token", accesstoken.getToken()));
        }
        obj = com.cardinalblue.android.piccollage.controller.network.f.a("/cb_authorize", ((List) (obj)));
        if (a != null)
        {
            a.a(((String) (obj)));
        }
    }

    public void c(String s)
    {
        b(s);
        g();
    }

    protected void f()
    {
        b = d();
    }

    protected void g()
    {
        c = PicUser.fromJson(e());
    }

    public PicUser i()
    {
        return c;
    }

    public void j()
    {
        com.cardinalblue.android.piccollage.controller.network.f.b(e, "me", new com.android.volley.m.b() {

            final PicAuth a;

            public volatile void a(Object obj)
            {
                a((String)obj);
            }

            public void a(String s)
            {
                if (s != null)
                {
                    try
                    {
                        a.c(com.cardinalblue.android.piccollage.controller.network.f.u(s).toJSONString());
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        com.cardinalblue.android.piccollage.a.f.a(s);
                    }
                    if (a.a != null)
                    {
                        a.a.a(null, null);
                    }
                }
            }

            
            {
                a = PicAuth.this;
                super();
            }
        }, new com.android.volley.m.a() {

            final PicAuth a;

            public void a(r r)
            {
                if (a.a != null)
                {
                    a.a.a(null, new a(0));
                }
            }

            
            {
                a = PicAuth.this;
                super();
            }
        });
    }

    public PicLoginResultEvent produceLoginEvent()
    {
        if (b())
        {
            return new PicLoginResultEvent(PicLoginResultEvent.a.a);
        } else
        {
            return new PicLoginResultEvent(PicLoginResultEvent.a.b);
        }
    }
}

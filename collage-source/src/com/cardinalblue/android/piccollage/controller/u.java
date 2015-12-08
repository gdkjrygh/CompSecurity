// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import bolts.j;
import com.android.volley.k;
import com.android.volley.r;
import com.android.volley.toolbox.n;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.lib.g;
import com.cardinalblue.android.piccollage.lib.i;
import com.cardinalblue.android.piccollage.model.gson.CollageRoot;
import com.cardinalblue.android.piccollage.view.o;
import com.google.b.l;
import com.google.b.t;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            l, CollageController, f

public class u extends com.cardinalblue.android.piccollage.controller.l
{

    private String c;
    private String d;
    private k e;
    private g f;
    private Executor g;

    public u(o o1, CollageController collagecontroller)
    {
        super(o1, collagecontroller);
        g = Executors.newSingleThreadExecutor();
    }

    static String a(u u1, String s)
    {
        u1.c = s;
        return s;
    }

    static String b(u u1, String s)
    {
        u1.d = s;
        return s;
    }

    private g l()
    {
        if (f == null)
        {
            f = new g((com.cardinalblue.android.piccollage.view.g)a);
        }
        return f;
    }

    public String a()
    {
        return c;
    }

    public j b()
    {
        if (a == null || ((o)a).m() == null)
        {
            return j.a(new IOException("the image scrap and drawable should not be null"));
        }
        if (((o)a).k() != null && ((o)a).k().exists())
        {
            return j.a(null);
        } else
        {
            return j.a(new Callable() {

                final u a;

                public Void a()
                    throws Exception
                {
                    if (a.a == null || ((o)a.a).m() == null)
                    {
                        throw new IOException("the image scrap and drawable should not be null");
                    }
                    File file = com.cardinalblue.android.piccollage.model.k.a(((o)a.a).m(), "png");
                    if (file == null)
                    {
                        throw new IOException("the image scrap's bitmap can't save into a file");
                    } else
                    {
                        ((o)a.a).a(file);
                        return null;
                    }
                }

                public Object call()
                    throws Exception
                {
                    return a();
                }

            
            {
                a = u.this;
                super();
            }
            }, g);
        }
    }

    public void c()
    {
        super.c();
        e.i();
    }

    public String e()
    {
        return d;
    }

    public String f()
    {
        StringBuilder stringbuilder = new StringBuilder(com.cardinalblue.android.piccollage.controller.network.f.a());
        stringbuilder.append("scraps/viewer");
        Object obj = new ArrayList();
        ((List) (obj)).add(new BasicNameValuePair("scrap_struct", h()));
        try
        {
            obj = com.cardinalblue.android.b.k.a(stringbuilder.toString(), ((List) (obj)));
        }
        catch (URISyntaxException urisyntaxexception)
        {
            com.cardinalblue.android.piccollage.a.f.a(urisyntaxexception);
            urisyntaxexception.printStackTrace();
            return stringbuilder.toString();
        }
        return ((String) (obj));
    }

    j g()
    {
        bolts.j.a a1 = j.a();
        String s = f();
        if (!TextUtils.isEmpty(s))
        {
            e = com.cardinalblue.android.piccollage.lib.i.a(com.cardinalblue.android.b.k.a()).b(new n(0, s, new com.android.volley.m.b(a1) {

                final bolts.j.a a;
                final u b;

                public volatile void a(Object obj)
                {
                    a((String)obj);
                }

                public void a(String s1)
                {
                    a.b(s1);
                }

            
            {
                b = u.this;
                a = a1;
                super();
            }
            }, new com.android.volley.m.a(a1) {

                final bolts.j.a a;
                final u b;

                public void a(r r1)
                {
                    a.b(new Exception(r1.getCause()));
                }

            
            {
                b = u.this;
                a = a1;
                super();
            }
            }));
            return a1.a();
        } else
        {
            return j.a(new IllegalStateException((new StringBuilder("Invalid request url: ")).append(s).toString()));
        }
    }

    String h()
    {
        String s = CollageRoot.versionedTypeAdapterGson(com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.A3).a(((o)j()).al());
        Log.v("[VideoScrapController]", (new StringBuilder()).append("preview struct: ").append(s).toString());
        return s;
    }

    public j i()
    {
        return l().a().c(new bolts.i() {

            final u a;

            public Bitmap a(j j1)
                throws Exception
            {
                ((o)a.a).b(false);
                if (j1.e() == null)
                {
                    j1 = new StringBuilder();
                    j1.append("Image resourcer load image with size (").append(f.b).append(") failed");
                    throw new IOException(j1.toString());
                } else
                {
                    ((o)a.a).b((Bitmap)j1.e());
                    a.b.h();
                    return (Bitmap)j1.e();
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = u.this;
                super();
            }
        }, g);
    }

    public j k()
    {
        return g().c(new bolts.i() {

            final u a;

            public Object then(j j1)
                throws Exception
            {
                j1 = (String)j1.e();
                try
                {
                    com.google.b.o o1 = ((l)(new com.google.b.f()).a(j1, com/google/b/l)).m();
                    if (o1.b("avplayer_url"))
                    {
                        Log.v("[VideoScrapController]", (new StringBuilder()).append("avplayer_url").append(o1.c("avplayer_url").c()).toString());
                        u.a(a, o1.c("avplayer_url").c());
                    }
                }
                catch (t t1)
                {
                    Log.v("[VideoScrapController]", (new StringBuilder()).append("Video Web Html: ").append(j1).toString());
                    u.a(a, null);
                    u.b(a, j1);
                    return null;
                }
                return null;
            }

            
            {
                a = u.this;
                super();
            }
        }).a(new bolts.i() {

            final u a;

            public Object then(j j1)
                throws Exception
            {
                if (j1.d())
                {
                    Log.w("[VideoScrapController]", j1.f().toString());
                }
                return null;
            }

            
            {
                a = u.this;
                super();
            }
        });
    }
}

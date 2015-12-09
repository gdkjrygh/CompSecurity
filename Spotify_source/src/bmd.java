// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

final class bmd extends bnd
    implements blu
{

    boolean a;
    long b;
    private int c;
    private boolean d;
    private long e;
    private bmc g;

    protected bmd(bmc bmc1, bnf bnf1)
    {
        g = bmc1;
        super(bnf1);
        b = -1L;
    }

    protected final void a()
    {
    }

    public final void a(Activity activity)
    {
        if (c == 0)
        {
            Intent intent;
            HashMap hashmap;
            bmc bmc1;
            boolean flag;
            if (super.f.c.b() >= e + Math.max(1000L, b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                d = true;
            }
        }
        c = c + 1;
        if (a)
        {
            intent = activity.getIntent();
            Object obj;
            if (intent != null)
            {
                obj = g;
                Object obj1 = intent.getData();
                if (obj1 != null && !((Uri) (obj1)).isOpaque())
                {
                    obj1 = ((Uri) (obj1)).getQueryParameter("referrer");
                    if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                    {
                        obj1 = Uri.parse((new StringBuilder("http://hostname/?")).append(((String) (obj1))).toString());
                        String s1 = ((Uri) (obj1)).getQueryParameter("utm_id");
                        if (s1 != null)
                        {
                            ((bmc) (obj)).a.put("&ci", s1);
                        }
                        s1 = ((Uri) (obj1)).getQueryParameter("anid");
                        if (s1 != null)
                        {
                            ((bmc) (obj)).a.put("&anid", s1);
                        }
                        s1 = ((Uri) (obj1)).getQueryParameter("utm_campaign");
                        if (s1 != null)
                        {
                            ((bmc) (obj)).a.put("&cn", s1);
                        }
                        s1 = ((Uri) (obj1)).getQueryParameter("utm_content");
                        if (s1 != null)
                        {
                            ((bmc) (obj)).a.put("&cc", s1);
                        }
                        s1 = ((Uri) (obj1)).getQueryParameter("utm_medium");
                        if (s1 != null)
                        {
                            ((bmc) (obj)).a.put("&cm", s1);
                        }
                        s1 = ((Uri) (obj1)).getQueryParameter("utm_source");
                        if (s1 != null)
                        {
                            ((bmc) (obj)).a.put("&cs", s1);
                        }
                        s1 = ((Uri) (obj1)).getQueryParameter("utm_term");
                        if (s1 != null)
                        {
                            ((bmc) (obj)).a.put("&ck", s1);
                        }
                        s1 = ((Uri) (obj1)).getQueryParameter("dclid");
                        if (s1 != null)
                        {
                            ((bmc) (obj)).a.put("&dclid", s1);
                        }
                        s1 = ((Uri) (obj1)).getQueryParameter("gclid");
                        if (s1 != null)
                        {
                            ((bmc) (obj)).a.put("&gclid", s1);
                        }
                        obj1 = ((Uri) (obj1)).getQueryParameter("aclid");
                        if (obj1 != null)
                        {
                            ((bmc) (obj)).a.put("&aclid", obj1);
                        }
                    }
                }
            }
            hashmap = new HashMap();
            hashmap.put("&t", "screenview");
            bmc1 = g;
            if (g.e != null)
            {
                obj1 = g.e;
                obj = activity.getClass().getCanonicalName();
                obj1 = (String)((bmy) (obj1)).g.get(obj);
                if (obj1 != null)
                {
                    obj = obj1;
                }
            } else
            {
                obj = activity.getClass().getCanonicalName();
            }
            bmc1.a("&cd", ((String) (obj)));
            if (TextUtils.isEmpty((CharSequence)hashmap.get("&dr")))
            {
                btl.a(activity);
                activity = activity.getIntent();
                if (activity == null)
                {
                    activity = null;
                } else
                {
                    String s = activity.getStringExtra("android.intent.extra.REFERRER_NAME");
                    activity = s;
                    if (TextUtils.isEmpty(s))
                    {
                        activity = null;
                    }
                }
                if (!TextUtils.isEmpty(activity))
                {
                    hashmap.put("&dr", activity);
                }
            }
            g.a(hashmap);
        }
    }

    public final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        flag = d;
        d = false;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    final void c()
    {
        if (b >= 0L || a)
        {
            blt blt1 = super.f.d();
            Object obj = g.c;
            blt1.b.add(obj);
            obj = ((bod) (blt1)).e.a;
            if (obj instanceof Application)
            {
                blt1.a((Application)obj);
            }
            return;
        } else
        {
            blt blt2 = super.f.d();
            bmd bmd1 = g.c;
            blt2.b.remove(bmd1);
            return;
        }
    }

    public final void k_()
    {
        c = c - 1;
        c = Math.max(0, c);
        if (c == 0)
        {
            e = super.f.c.b();
        }
    }
}

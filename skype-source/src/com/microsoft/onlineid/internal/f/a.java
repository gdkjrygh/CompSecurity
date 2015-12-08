// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.microsoft.onlineid.b.c;
import com.microsoft.onlineid.i;
import com.microsoft.onlineid.internal.MsaService;
import com.microsoft.onlineid.internal.b.b;
import com.microsoft.onlineid.internal.e.e;
import com.microsoft.onlineid.internal.e.f;
import com.microsoft.onlineid.internal.n;
import com.microsoft.onlineid.internal.o;
import com.microsoft.onlineid.internal.sso.client.BackupService;
import com.microsoft.onlineid.internal.ui.InterruptResolutionActivity;
import com.microsoft.onlineid.sts.d;
import com.microsoft.onlineid.sts.j;
import com.microsoft.onlineid.sts.k;
import com.microsoft.onlineid.sts.q;
import com.microsoft.onlineid.sts.request.StsRequestFactory;
import com.microsoft.onlineid.sts.request.h;

public final class a
{

    private final Context a;
    private final d b;
    private final j c;
    private final StsRequestFactory d;
    private final f e;
    private final e f;
    private final k g;

    public a()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
    }

    public a(Context context)
    {
        a = context;
        b = new d(context);
        c = new j(context);
        d = new StsRequestFactory(context);
        e = new f(context);
        f = new e(context);
        g = new k(context);
    }

    private com.microsoft.onlineid.sts.b.e a(com.microsoft.onlineid.sts.b b1, com.microsoft.onlineid.d d1, String s, String s1, String s2, Bundle bundle)
        throws c, com.microsoft.onlineid.sts.a.c, com.microsoft.onlineid.sts.a.e, b
    {
        Object obj = c.a(false);
        com.microsoft.onlineid.sts.b.e e1 = (com.microsoft.onlineid.sts.b.e)d.createServiceRequest(b1, ((com.microsoft.onlineid.sts.i) (obj)), d1, s, s1, false).e();
        obj = e1;
        if (!e1.b())
        {
            obj = e1;
            if (e1.a().d())
            {
                obj = c.a(true);
                obj = (com.microsoft.onlineid.sts.b.e)d.createServiceRequest(b1, ((com.microsoft.onlineid.sts.i) (obj)), d1, s, s1, false).e();
            }
        }
        b.b(((com.microsoft.onlineid.sts.b.e) (obj)).e());
        if (!((com.microsoft.onlineid.sts.b.e) (obj)).b())
        {
            s1 = ((com.microsoft.onlineid.sts.b.e) (obj)).a();
            com.microsoft.onlineid.internal.c.d.c((new StringBuilder("ServiceRequest failed with error: ")).append(s1.b()).toString());
            obj = ((com.microsoft.onlineid.sts.b.e) (obj)).f();
            if (obj != null)
            {
                s1 = (new StringBuilder("android")).append(n.a(a)).toString();
                obj = Uri.parse(((String) (obj))).buildUpon();
                ((android.net.Uri.Builder) (obj)).appendQueryParameter("platform", s1);
                if (s2 != null)
                {
                    ((android.net.Uri.Builder) (obj)).appendQueryParameter("cobrandid", s2);
                }
                b1 = InterruptResolutionActivity.a(a, ((android.net.Uri.Builder) (obj)).build(), b1, d1, s2, s, bundle);
                throw new b(new com.microsoft.onlineid.internal.b(a, b1));
            } else
            {
                throw new com.microsoft.onlineid.sts.a.e("Could not acquire ticket.", s1);
            }
        } else
        {
            return ((com.microsoft.onlineid.sts.b.e) (obj));
        }
    }

    public final i a(com.microsoft.onlineid.sts.b b1, com.microsoft.onlineid.d d1)
        throws c, b, com.microsoft.onlineid.sts.a.c, com.microsoft.onlineid.sts.a.e
    {
        String s = a.getPackageName();
        com.microsoft.onlineid.internal.k.a(b1, "account");
        com.microsoft.onlineid.internal.k.a(d1, "scope");
        o.a(s, "packageName");
        com.microsoft.onlineid.internal.c.d.a((new StringBuilder("Attempting to get ticket from server: ")).append(d1.toString()).toString());
        b1 = a(b1, d1, s, null, null, null);
        com.microsoft.onlineid.internal.e.a(b1.b());
        b1 = b1.c();
        boolean flag;
        if (b1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.microsoft.onlineid.internal.e.a(flag);
        return b1;
    }

    public final i a(String s, com.microsoft.onlineid.d d1, String s1)
        throws com.microsoft.onlineid.internal.b.a, com.microsoft.onlineid.sts.a.c, com.microsoft.onlineid.sts.a.e, c, b
    {
        return a(s, d1, a.getPackageName(), s1, null, null);
    }

    public final i a(String s, com.microsoft.onlineid.d d1, String s1, String s2, String s3, Bundle bundle)
        throws com.microsoft.onlineid.internal.b.a, com.microsoft.onlineid.sts.a.c, com.microsoft.onlineid.sts.a.e, c, b
    {
        o.a(s, "accountPuid");
        com.microsoft.onlineid.internal.k.a(d1, "scope");
        o.a(s1, "packageName");
        Object obj = f.a(s, s1, d1);
        if (obj != null)
        {
            com.microsoft.onlineid.internal.c.d.a((new StringBuilder("Ticket request serviced from cache: ")).append(d1.toString()).toString());
            return ((i) (obj));
        }
        obj = e.a(s);
        if (obj == null)
        {
            throw new com.microsoft.onlineid.internal.b.a("The account was deleted.");
        }
        com.microsoft.onlineid.internal.c.d.a((new StringBuilder("Attempting to get ticket from server: ")).append(d1.toString()).toString());
        d1 = a(((com.microsoft.onlineid.sts.b) (obj)), d1, s1, s2, s3, bundle);
        com.microsoft.onlineid.internal.e.a(d1.b());
        com.microsoft.onlineid.internal.e.a(d1.b());
        s3 = d1.d();
        if (s3 != null)
        {
            bundle = e.a(s);
            if (bundle != null)
            {
                bundle.a(s3);
                e.a(bundle);
            }
        }
        boolean flag;
        if (s2 != null)
        {
            BackupService.a(a);
        } else
        {
            BackupService.b(a);
        }
        d1 = d1.c();
        if (d1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.microsoft.onlineid.internal.e.a(flag);
        f.a(s, s1, d1);
        return d1;
    }

    public final com.microsoft.onlineid.internal.b a(String s, com.microsoft.onlineid.d d1, String s1, String s2, Bundle bundle)
    {
        return (new com.microsoft.onlineid.internal.b(a, (new Intent(a, com/microsoft/onlineid/internal/MsaService)).setAction("com.microsoft.onlineid.internal.GET_TICKET"))).a(s).a(d1).(s1).d(s2).a(bundle);
    }
}

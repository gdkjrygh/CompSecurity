// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.uj;
import com.google.android.gms.internal.uz;
import com.google.android.gms.internal.vr;
import com.google.android.gms.internal.xe;
import com.google.android.gms.internal.xj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            a, j, l, b, 
//            h

public final class i
{

    private Account a;
    private final Set b = new HashSet();
    private int c;
    private View d;
    private String e;
    private String f;
    private final Map g = new vr();
    private final Context h;
    private final Map i = new vr();
    private FragmentActivity j;
    private int k;
    private l l;
    private Looper m;
    private b n;
    private com.google.android.gms.common.api.b o;
    private final ArrayList p = new ArrayList();
    private final ArrayList q = new ArrayList();
    private xj r;

    public i(Context context)
    {
        k = -1;
        n = com.google.android.gms.common.b.a();
        o = xe.c;
        h = context;
        m = context.getMainLooper();
        e = context.getPackageName();
        f = context.getClass().getName();
    }

    static FragmentActivity a(i i1)
    {
        return i1.j;
    }

    static void a(i i1, uz uz1, h h1)
    {
        i1.a(uz1, h1);
    }

    private void a(uz uz1, h h1)
    {
        uz1.a(k, h1, l);
    }

    public final i a(a a1)
    {
        bl.a(a1, "Api must not be null");
        i.put(a1, null);
        Set set = b;
        a1.a();
        set.addAll(Collections.emptyList());
        return this;
    }

    public final w a()
    {
        xj xj1;
        if (i.containsKey(xe.g))
        {
            Account account;
            Set set;
            Map map;
            View view;
            String s;
            String s1;
            int i1;
            boolean flag;
            if (r == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            bl.a(flag, "SignIn.API can't be used in conjunction with requestServerAuthCode.");
            r = (xj)i.get(xe.g);
        }
        account = a;
        set = b;
        map = g;
        i1 = c;
        view = d;
        s = e;
        s1 = f;
        if (r != null)
        {
            xj1 = r;
        } else
        {
            xj1 = xj.a;
        }
        return new w(account, set, map, i1, view, s, s1, xj1);
    }

    public final h b()
    {
        boolean flag;
        if (!i.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.b(flag, "must call addApi() to add at least one API");
        if (k >= 0)
        {
            uj uj1 = new uj(h.getApplicationContext(), m, a(), n, o, i, p, q, k);
            uz uz1 = uz.a(j);
            if (uz1 == null)
            {
                (new Handler(h.getMainLooper())).post(new j(this, uj1));
                return uj1;
            } else
            {
                a(uz1, uj1);
                return uj1;
            }
        } else
        {
            return new uj(h, m, a(), n, o, i, p, q, -1);
        }
    }
}

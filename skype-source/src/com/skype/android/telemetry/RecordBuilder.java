// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.telemetry;

import a.a.a.a;
import a.a.a.g;
import a.a.a.h;
import a.a.a.i;
import a.a.a.j;
import com.skype.Account;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class RecordBuilder
{

    final String a;
    final HashMap b = new HashMap();
    final String c;
    final h d = new h();
    private long e;

    public RecordBuilder(String s, String s1, String s2)
    {
        a = s;
        c = s2;
        d.a(UUID.randomUUID().toString());
        d.a(i.b);
        d.b(s1);
    }

    private void a(j j1)
    {
        d.a(j1);
        d.e(j1.a());
    }

    private j c(Account account)
    {
        j j1 = new j();
        j1.a(account.getSkypenameProp());
        j1.b(a);
        account = account.getPstnnumberProp();
        if (account != null)
        {
            g g1 = new g();
            g1.a(account);
            j1.a(g1);
        }
        return j1;
    }

    public final h a()
    {
        d.b(b);
        return d;
    }

    public final RecordBuilder a(long l)
    {
        d.a(l);
        return this;
    }

    public final RecordBuilder a(Account account)
    {
        if (account != null)
        {
            a(c(account));
        }
        return this;
    }

    public final RecordBuilder a(String s)
    {
        d.c(s);
        return this;
    }

    public final RecordBuilder a(String s, Object obj)
    {
        if (obj != null)
        {
            b.put(s, String.valueOf(obj));
        }
        return this;
    }

    public final long b()
    {
        return e;
    }

    public final RecordBuilder b(Account account)
    {
        if (account != null)
        {
            account = c(account);
            d.c().add(account.a());
            d.e().add(account);
        }
        return this;
    }

    public final RecordBuilder b(String s)
    {
        if (s != null)
        {
            j j1 = new j();
            j1.a(s);
            a(j1);
        }
        return this;
    }

    public final RecordBuilder b(String s, Object obj)
    {
        return a((new StringBuilder()).append(c).append(s).toString(), obj);
    }

    public final void b(long l)
    {
        e = l;
    }

    public final void c(String s)
    {
        if (s != null)
        {
            a a1 = new a();
            a1.a(s);
            d.a(a1);
        }
    }

    public final void d(String s)
    {
        if (s != null)
        {
            d.d().put("callId", s);
        }
    }

    public final RecordBuilder e(String s)
    {
        if (s != null)
        {
            d.d(s);
        }
        return this;
    }

    public String toString()
    {
        return String.format("Event Type: %s, Extension Data: %s", new Object[] {
            d.b(), String.valueOf(b)
        });
    }
}

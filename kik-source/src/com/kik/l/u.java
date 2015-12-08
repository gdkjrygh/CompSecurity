// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.content.SharedPreferences;
import kik.a.d.t;
import kik.a.e.h;
import kik.android.util.ar;

public final class u
    implements h
{

    private t a;
    private final SharedPreferences b;

    public u(ar ar1)
    {
        b = ar1.a("Kik.Storage.ContentStorage.Pref");
        if (a == null && b.contains("MessageStub.Jid"))
        {
            a = new t(b.getString("MessageStub.Jid", null), b.getString("MessageStub.FileLocation", null));
        }
    }

    public final t a()
    {
        return a;
    }

    public final void a(t t1)
    {
        a = t1;
        if (a == null)
        {
            b.edit().clear().commit();
            return;
        } else
        {
            b.edit().putString("MessageStub.FileLocation", t1.b()).putString("MessageStub.Jid", t1.a()).commit();
            return;
        }
    }

    public final void b()
    {
        b.edit().clear().commit();
        a = null;
    }
}

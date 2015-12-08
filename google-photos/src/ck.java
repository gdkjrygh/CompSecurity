// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Bundle;

public final class ck extends db
{

    private final Bundle a;
    private final dr b[];
    private int c;
    private CharSequence d;
    private PendingIntent e;

    public ck(int i, CharSequence charsequence, PendingIntent pendingintent)
    {
        this(i, charsequence, pendingintent, new Bundle(), null);
    }

    private ck(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, dr adr[])
    {
        c = i;
        d = cn.f(charsequence);
        e = pendingintent;
        a = bundle;
        b = null;
    }

    public final int a()
    {
        return c;
    }

    public final CharSequence b()
    {
        return d;
    }

    public final PendingIntent c()
    {
        return e;
    }

    public final Bundle d()
    {
        return a;
    }

    public final dt[] e()
    {
        return b;
    }
}

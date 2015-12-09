// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

public abstract class dzu extends cn
{

    private final db k = new db(this);
    private Object l;

    public dzu(Context context)
    {
        super(context);
    }

    public void b(Object obj)
    {
        super.b(obj);
        l = obj;
    }

    protected final void f()
    {
        i().getContentResolver().registerContentObserver(s(), true, k);
        if (l != null)
        {
            b(l);
        }
        if (q() || l == null)
        {
            n();
        }
    }

    protected final void g()
    {
        i().getContentResolver().unregisterContentObserver(k);
        m();
    }

    protected void h()
    {
        super.h();
        g();
        l = null;
    }

    public abstract Uri s();
}

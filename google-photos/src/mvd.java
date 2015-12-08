// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;

public abstract class mvd extends dy
{

    private boolean l;
    private boolean m;

    public mvd(Context context)
    {
        super(context);
    }

    private void r()
    {
        if (m)
        {
            m = false;
        }
    }

    public final void a(Object obj)
    {
        if (!l)
        {
            super.a(obj);
        }
    }

    public final Object d()
    {
        if (l)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        Object obj = q();
        return obj;
        SQLiteException sqliteexception;
        sqliteexception;
        Log.w("EsAsyncTaskLoader", "loadInBackground failed", sqliteexception);
        l = true;
        return null;
    }

    protected final void f()
    {
        super.f();
        h();
        if (!m)
        {
            m = false;
        }
    }

    protected final void j()
    {
        super.j();
        g();
    }

    protected final void l()
    {
        super.l();
        r();
    }

    protected final void n()
    {
        g();
        super.n();
        r();
    }

    public abstract Object q();
}

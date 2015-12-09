// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.AsyncQueryHandler;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import java.lang.ref.WeakReference;

public final class gfi
{

    gfk a;
    final Object b = new Object();
    Cursor c;
    boolean d;
    ContentObserver e;
    private AsyncQueryHandler f;
    private Uri g;
    private String h[];

    public gfi(Context context, gfk gfk1)
    {
        e = new ContentObserver() {

            private gfi a;

            public final void onChange(boolean flag)
            {
                a.a();
            }

            
            {
                a = gfi.this;
                super(null);
            }
        };
        d = false;
        f = new gfj(new WeakReference(this), context);
        a = (gfk)ctz.a(gfk1);
    }

    public final void a()
    {
        d = false;
        if (gmt.a())
        {
            new Throwable("");
            (new StringBuilder("Starting query for ")).append(g);
        }
        f.startQuery(0, null, g, h, null, null, null);
    }

    public final void a(Uri uri, String as[])
    {
        g = uri;
        if (as != null)
        {
            uri = (String[])as.clone();
        } else
        {
            uri = null;
        }
        h = uri;
        a();
    }

    public final void b()
    {
        f.cancelOperation(0);
        synchronized (b)
        {
            if (c != null)
            {
                c.unregisterContentObserver(e);
                c.close();
                c = null;
            }
            d = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}

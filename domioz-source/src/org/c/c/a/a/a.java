// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.a.a;

import android.util.Log;
import java.net.URI;
import org.c.c.a.e;
import org.c.c.a.g;
import org.c.c.a.k;
import org.c.c.a.r;
import org.c.c.i;

public abstract class a
{

    private static final String a = org/c/c/a/a/a.getSimpleName();
    private g b;

    protected a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            b = new r();
            return;
        } else
        {
            b = new k();
            return;
        }
    }

    protected final e a(URI uri, i j)
    {
        e e = getRequestFactory().createRequest(uri, j);
        if (Log.isLoggable(a, 3))
        {
            Log.d(a, (new StringBuilder("Created ")).append(j.name()).append(" request for \"").append(uri).append("\"").toString());
        }
        return e;
    }

    public g getRequestFactory()
    {
        return b;
    }

    public void setRequestFactory(g g1)
    {
        org.c.d.a.notNull(g1, "'requestFactory' must not be null");
        b = g1;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.service;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;

// Referenced classes of package com.fitbit.util.service:
//            h, d, e

public class c
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{

    private final FragmentActivity a;
    private d b;
    private final int c;

    public c(FragmentActivity fragmentactivity, d d1, int i)
    {
        a = fragmentactivity;
        b = d1;
        c = i;
        j();
    }

    private static transient Bundle b(Intent aintent[])
    {
        int i1 = aintent.length;
        for (int i = 0; i < i1; i++)
        {
            if (aintent[i] == null)
            {
                throw new NullPointerException("intent is null");
            }
        }

        Bundle bundle = new Bundle();
        bundle.putParcelableArray("intent", aintent);
        return bundle;
    }

    public void a(Intent intent)
    {
        intent = b(new Intent[] {
            intent
        });
        a.getSupportLoaderManager().restartLoader(c, intent, this);
    }

    public void a(Loader loader, h h1)
    {
        if (h1 != null && b != null)
        {
            b.a(this, h1.a, h1.b);
        }
    }

    protected void a(d d1)
    {
        b = d1;
    }

    public transient void a(Intent aintent[])
    {
        aintent = b(aintent);
        a.getSupportLoaderManager().restartLoader(c, aintent, this);
    }

    public void b(Intent intent)
    {
        intent = b(new Intent[] {
            intent
        });
        a.getSupportLoaderManager().initLoader(c, intent, this);
    }

    void j()
    {
        if (a.getSupportLoaderManager().getLoader(c) != null)
        {
            a.getSupportLoaderManager().initLoader(c, null, this);
        }
    }

    public void k()
    {
        if (a.getSupportLoaderManager().getLoader(c) != null)
        {
            a.getSupportLoaderManager().destroyLoader(c);
        }
    }

    public boolean l()
    {
        return a.getSupportLoaderManager().getLoader(c) != null;
    }

    public FragmentActivity m()
    {
        return a;
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        bundle = (Intent[])(Intent[])bundle.get("intent");
        return new e(a, bundle);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (h)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }
}

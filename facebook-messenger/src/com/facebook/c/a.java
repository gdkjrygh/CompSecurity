// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.c;

import android.content.ContentProvider;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.c:
//            p

abstract class a extends ContentProvider
{

    private final AtomicBoolean a = new AtomicBoolean();

    a()
    {
    }

    protected abstract int a(Uri uri, ContentValues contentvalues, String s, String as[]);

    protected abstract int a(Uri uri, String s, String as[]);

    protected int a(Uri uri, ContentValues acontentvalues[])
    {
        return super.bulkInsert(uri, acontentvalues);
    }

    protected AssetFileDescriptor a(Uri uri, String s, Bundle bundle)
    {
        return null;
    }

    protected abstract Cursor a(Uri uri, String as[], String s, String as1[], String s1);

    protected Cursor a(Uri uri, String as[], String s, String as1[], String s1, CancellationSignal cancellationsignal)
    {
        return a(uri, as, s, as1, s1);
    }

    protected abstract Uri a(Uri uri, ContentValues contentvalues);

    protected Bundle a(String s, String s1, Bundle bundle)
    {
        return null;
    }

    protected abstract String a(Uri uri);

    protected void a()
    {
    }

    protected void a(int i1)
    {
    }

    protected void a(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    protected ContentProviderResult[] a(ArrayList arraylist)
    {
        return super.applyBatch(arraylist);
    }

    protected String[] a(Uri uri, String s)
    {
        return null;
    }

    public final ContentProviderResult[] applyBatch(ArrayList arraylist)
    {
        l();
        return a(arraylist);
    }

    protected AssetFileDescriptor b(Uri uri, String s)
    {
        return super.openAssetFile(uri, s);
    }

    public final int bulkInsert(Uri uri, ContentValues acontentvalues[])
    {
        l();
        return a(uri, acontentvalues);
    }

    protected ParcelFileDescriptor c(Uri uri, String s)
    {
        return super.openFile(uri, s);
    }

    public final Bundle call(String s, String s1, Bundle bundle)
    {
        l();
        return a(s, s1, bundle);
    }

    public final int delete(Uri uri, String s, String as[])
    {
        l();
        return a(uri, s, as);
    }

    protected void f()
    {
    }

    protected void g()
    {
    }

    public final String[] getStreamTypes(Uri uri, String s)
    {
        l();
        return a(uri, s);
    }

    public final String getType(Uri uri)
    {
        l();
        return a(uri);
    }

    protected boolean h()
    {
        return super.isTemporary();
    }

    protected boolean i()
    {
        return false;
    }

    public final Uri insert(Uri uri, ContentValues contentvalues)
    {
        l();
        return a(uri, contentvalues);
    }

    protected final boolean isTemporary()
    {
        l();
        return h();
    }

    protected final void j()
    {
        synchronized (a)
        {
            if (!a.get())
            {
                a();
                a.set(true);
            }
        }
        return;
        exception;
        atomicboolean;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void k()
    {
        if (!i())
        {
            p.a();
        }
    }

    protected final void l()
    {
        j();
        k();
    }

    public final void onConfigurationChanged(Configuration configuration)
    {
        l();
        a(configuration);
    }

    public final boolean onCreate()
    {
        return true;
    }

    public final void onLowMemory()
    {
        if (!a.get())
        {
            return;
        } else
        {
            l();
            super.onLowMemory();
            g();
            return;
        }
    }

    public final void onTrimMemory(int i1)
    {
        if (!a.get())
        {
            return;
        } else
        {
            l();
            super.onTrimMemory(i1);
            a(i1);
            return;
        }
    }

    public final AssetFileDescriptor openAssetFile(Uri uri, String s)
    {
        l();
        return b(uri, s);
    }

    public final ParcelFileDescriptor openFile(Uri uri, String s)
    {
        l();
        return c(uri, s);
    }

    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String s, Bundle bundle)
    {
        l();
        return a(uri, s, bundle);
    }

    public final Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        l();
        return a(uri, as, s, as1, s1);
    }

    public final Cursor query(Uri uri, String as[], String s, String as1[], String s1, CancellationSignal cancellationsignal)
    {
        l();
        return a(uri, as, s, as1, s1, cancellationsignal);
    }

    public final void shutdown()
    {
        if (!a.get())
        {
            return;
        } else
        {
            l();
            f();
            return;
        }
    }

    public final int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        l();
        return a(uri, contentvalues, s, as);
    }
}

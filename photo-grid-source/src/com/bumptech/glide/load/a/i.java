// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.a;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.a:
//            c

public abstract class i
    implements c
{

    private final Uri a;
    private final Context b;
    private Object c;

    public i(Context context, Uri uri)
    {
        b = context.getApplicationContext();
        a = uri;
    }

    public final Object a(int j)
    {
        ContentResolver contentresolver = b.getContentResolver();
        c = a(a, contentresolver);
        return c;
    }

    protected abstract Object a(Uri uri, ContentResolver contentresolver);

    public final void a()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        a(c);
        return;
        IOException ioexception;
        ioexception;
        Log.isLoggable("LocalUriFetcher", 2);
        return;
    }

    protected abstract void a(Object obj);

    public final String b()
    {
        return a.toString();
    }

    public final void c()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.a;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.i;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.a:
//            c

public abstract class g
    implements c
{

    private final Uri a;
    private final Context b;
    private Object c;

    public g(Context context, Uri uri)
    {
        b = context.getApplicationContext();
        a = uri;
    }

    public void a()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        a(c);
_L1:
        return;
        IOException ioexception;
        ioexception;
        if (Log.isLoggable("LocalUriFetcher", 2))
        {
            Log.v("LocalUriFetcher", "failed to close data", ioexception);
            return;
        }
          goto _L1
    }

    protected abstract void a(Object obj)
        throws IOException;

    protected abstract Object b(Uri uri, ContentResolver contentresolver)
        throws FileNotFoundException;

    public final Object b(i i)
        throws Exception
    {
        i = b.getContentResolver();
        c = b(a, ((ContentResolver) (i)));
        return c;
    }

    public String b()
    {
        return a.toString();
    }

    public void c()
    {
    }
}

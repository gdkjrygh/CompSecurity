// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.squareup.okhttp.c;
import com.squareup.okhttp.d;
import com.squareup.okhttp.e;
import com.squareup.okhttp.s;
import com.squareup.okhttp.v;
import com.squareup.okhttp.w;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.picasso:
//            Downloader, ab, NetworkPolicy

public final class o
    implements Downloader
{

    private final s a;

    public o(Context context)
    {
        this(ab.b(context));
    }

    public o(s s1)
    {
        a = s1;
    }

    private o(File file)
    {
        this(file, ab.a(file));
    }

    private o(File file, long l)
    {
        s s1 = new s();
        s1.a(15000L, TimeUnit.MILLISECONDS);
        s1.b(20000L, TimeUnit.MILLISECONDS);
        s1.c(20000L, TimeUnit.MILLISECONDS);
        this(s1);
        try
        {
            a.a(new c(file, l));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return;
        }
    }

    public final Downloader.a a(Uri uri, int i)
        throws IOException
    {
        Object obj = null;
        int j;
        if (i != 0)
        {
            if (com.squareup.picasso.NetworkPolicy.c(i))
            {
                obj = d.b;
            } else
            {
                obj = new com.squareup.okhttp.d.a();
                if (!NetworkPolicy.a(i))
                {
                    ((com.squareup.okhttp.d.a) (obj)).a();
                }
                if (!NetworkPolicy.b(i))
                {
                    ((com.squareup.okhttp.d.a) (obj)).b();
                }
                obj = ((com.squareup.okhttp.d.a) (obj)).c();
            }
        }
        uri = (new com.squareup.okhttp.t.a()).a(uri.toString());
        if (obj != null)
        {
            uri.a(((d) (obj)));
        }
        uri = a.a(uri.a()).a();
        j = uri.a();
        if (j >= 300)
        {
            uri.d().close();
            throw new Downloader.ResponseException((new StringBuilder()).append(j).append(" ").append(uri.b()).toString(), i, j);
        }
        boolean flag;
        if (uri.f() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        uri = uri.d();
        return new Downloader.a(uri.d(), flag, uri.b());
    }
}

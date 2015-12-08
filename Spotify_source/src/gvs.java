// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.NetworkPolicy;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class gvs
    implements Downloader
{

    private final gro a;

    public gvs(Context context)
    {
        this(gwm.b(context));
    }

    public gvs(gro gro1)
    {
        a = gro1;
    }

    private gvs(File file)
    {
        this(file, gwm.a(file));
    }

    private gvs(File file, long l)
    {
        gro gro1 = new gro();
        gro1.a(15000L, TimeUnit.MILLISECONDS);
        gro1.b(20000L, TimeUnit.MILLISECONDS);
        gro1.a(TimeUnit.MILLISECONDS);
        this(gro1);
        try
        {
            a.a(new gqm(file, l));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return;
        }
    }

    public final gvm a(Uri uri, int i)
    {
        Object obj = null;
        int j;
        if (i != 0)
        {
            if (NetworkPolicy.c(i))
            {
                obj = gqq.a;
            } else
            {
                obj = new gqr();
                if (!NetworkPolicy.a(i))
                {
                    ((gqr) (obj)).a();
                }
                if (!NetworkPolicy.b(i))
                {
                    ((gqr) (obj)).b();
                }
                obj = ((gqr) (obj)).c();
            }
        }
        uri = (new grr()).a(uri.toString());
        if (obj != null)
        {
            uri.a(((gqq) (obj)));
        }
        uri = a.a(uri.b()).a();
        j = uri.a();
        if (j >= 300)
        {
            uri.e().close();
            throw new com.squareup.picasso.Downloader.ResponseException((new StringBuilder()).append(j).append(" ").append(uri.c()).toString(), i, j);
        }
        boolean flag;
        if (uri.h() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        uri = uri.e();
        return new gvm(uri.d(), flag, uri.b());
    }
}

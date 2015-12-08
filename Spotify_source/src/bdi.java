// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer.upstream.AssetDataSource;
import com.google.android.exoplayer.upstream.ContentDataSource;
import com.google.android.exoplayer.upstream.FileDataSource;

public final class bdi
    implements bdo
{

    private final bdo a;
    private final bdo b;
    private final bdo c;
    private final bdo d;
    private bdo e;

    public bdi(Context context, bdn bdn, bdo bdo1)
    {
        a = (bdo)bds.a(bdo1);
        b = new FileDataSource(bdn);
        c = new AssetDataSource(context, bdn);
        d = new ContentDataSource(context, bdn);
    }

    public bdi(Context context, bdn bdn, String s)
    {
        this(context, bdn, s, (byte)0);
    }

    private bdi(Context context, bdn bdn, String s, byte byte0)
    {
        this(context, bdn, ((bdo) (new bdh(s, bdn))));
    }

    public final int a(byte abyte0[], int i, int j)
    {
        return e.a(abyte0, i, j);
    }

    public final long a(bde bde1)
    {
        String s;
        boolean flag;
        if (e == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        s = bde1.a.getScheme();
        if ("file".equals(s) || TextUtils.isEmpty(s))
        {
            if (bde1.a.getPath().startsWith("/android_asset/"))
            {
                e = c;
            } else
            {
                e = b;
            }
        } else
        if ("asset".equals(s))
        {
            e = c;
        } else
        if ("content".equals(s))
        {
            e = d;
        } else
        {
            e = a;
        }
        return e.a(bde1);
    }

    public final String a()
    {
        if (e == null)
        {
            return null;
        } else
        {
            return e.a();
        }
    }

    public final void b()
    {
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        e.b();
        e = null;
        return;
        Exception exception;
        exception;
        e = null;
        throw exception;
    }
}

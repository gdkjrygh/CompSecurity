// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer.util.Assertions;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            UriDataSource, FileDataSource, AssetDataSource, ContentDataSource, 
//            DefaultHttpDataSource, DataSpec, TransferListener

public final class DefaultUriDataSource
    implements UriDataSource
{

    private final UriDataSource a;
    private final UriDataSource b;
    private final UriDataSource c;
    private final UriDataSource d;
    private UriDataSource e;

    private DefaultUriDataSource(Context context, TransferListener transferlistener, UriDataSource uridatasource)
    {
        a = (UriDataSource)Assertions.a(uridatasource);
        b = new FileDataSource(transferlistener);
        c = new AssetDataSource(context, transferlistener);
        d = new ContentDataSource(context, transferlistener);
    }

    private DefaultUriDataSource(Context context, TransferListener transferlistener, String s, boolean flag)
    {
        this(context, transferlistener, ((UriDataSource) (new DefaultHttpDataSource(s, null, transferlistener, 8000, 8000, flag))));
    }

    public DefaultUriDataSource(Context context, String s)
    {
        this(context, null, s, false);
    }

    public final int a(byte abyte0[], int i, int j)
    {
        return e.a(abyte0, i, j);
    }

    public final long a(DataSpec dataspec)
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
        Assertions.b(flag);
        s = dataspec.a.getScheme();
        if ("file".equals(s) || TextUtils.isEmpty(s))
        {
            if (dataspec.a.getPath().startsWith("/android_asset/"))
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
        return e.a(dataspec);
    }

    public final void a()
    {
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        e.a();
        e = null;
        return;
        Exception exception;
        exception;
        e = null;
        throw exception;
    }

    public final String b()
    {
        if (e == null)
        {
            return null;
        } else
        {
            return e.b();
        }
    }
}

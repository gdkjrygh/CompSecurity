// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import android.net.Uri;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            DataSpec, DataSourceInputStream, UriDataSource

public final class UriLoadable
    implements Loader.Loadable
{

    private final DataSpec a;
    private final UriDataSource b;
    private final Parser c;
    private volatile Object d;
    private volatile boolean e;

    public UriLoadable(String s, UriDataSource uridatasource, Parser parser)
    {
        b = uridatasource;
        c = parser;
        a = new DataSpec(Uri.parse(s), 1);
    }

    public final Object a()
    {
        return d;
    }

    public final void f()
    {
        e = true;
    }

    public final boolean g()
    {
        return e;
    }

    public final void h()
    {
        DataSourceInputStream datasourceinputstream = new DataSourceInputStream(b, a);
        datasourceinputstream.a();
        d = c.b(b.b(), datasourceinputstream);
        datasourceinputstream.close();
        return;
        Exception exception;
        exception;
        datasourceinputstream.close();
        throw exception;
    }

    private class Parser
    {

        public abstract Object b(String s, InputStream inputstream);
    }

}

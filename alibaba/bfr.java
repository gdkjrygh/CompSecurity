// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CacheRequest;

interface bfr
{

    public abstract InputStream a(CacheRequest cacherequest)
        throws IOException;

    public abstract OutputStream a()
        throws IOException;

    public abstract void a(bfo bfo)
        throws IOException;

    public abstract boolean a(boolean flag, OutputStream outputstream, InputStream inputstream);

    public abstract void b()
        throws IOException;

    public abstract void c()
        throws IOException;

    public abstract bfn d()
        throws IOException;
}

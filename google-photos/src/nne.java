// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;

final class nne extends nmv
{

    HttpUrlRequest a;
    private final Context j;
    private final String k;
    private final String l;
    private final long m;
    private final long n;
    private final InputStream o;
    private final boolean p;
    private final npd q;

    public nne(Context context, nyb nyb1, String s, String s1, long l1, long l2, InputStream inputstream, boolean flag, npd npd)
    {
        super(nyb1);
        j = context;
        k = s;
        l = s1;
        m = l1;
        n = l2;
        o = inputstream;
        p = flag;
        q = npd;
    }

    public final void a()
    {
        jk jk1 = new jk();
        jk1.putAll(super.c.a(k));
        long l1 = m;
        long l2 = n;
        long l3 = n;
        jk1.put("Content-Range", (new StringBuilder(68)).append("bytes ").append(l1).append("-").append(l2 - 1L).append("/").append(l3).toString());
        Context context = j;
        String s = k;
        boolean flag = p;
        a = npi.a(context, s, 3, jk1, i);
        a.a(l, new nph(Channels.newChannel(o), q, n - m), n - m);
        a.a("PUT");
    }

    protected final void a(HttpUrlRequest httpurlrequest)
    {
    }

    protected final HttpUrlRequest b()
    {
        return a;
    }
}

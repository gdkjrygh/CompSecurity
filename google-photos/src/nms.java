// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

final class nms
    implements npd
{

    nme a;
    private final Uri b;
    private final long c;
    private final long d;
    private long e;
    private nmp f;

    public nms(nmp nmp1, Uri uri, long l, long l1)
    {
        f = nmp1;
        super();
        e = 0L;
        b = uri;
        c = l;
        d = l1;
    }

    public final void a(long l, long l1)
    {
        if (l - e > nmp.d())
        {
            e = l;
            try
            {
                f.b();
            }
            catch (nme nme1)
            {
                a = nme1;
                f.a();
            }
        }
        if (d + l < l1)
        {
            nmp.a(f).a(b, d + l, c);
        }
    }
}

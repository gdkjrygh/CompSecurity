// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.http.Header;
import org.apache.http.HttpEntity;

final class grx extends grs
{

    private static final grn a = grn.a("application/octet-stream");
    private final HttpEntity b;
    private final grn c;

    grx(HttpEntity httpentity, String s)
    {
        b = httpentity;
        if (s != null)
        {
            c = grn.a(s);
            return;
        }
        if (httpentity.getContentType() != null)
        {
            c = grn.a(httpentity.getContentType().getValue());
            return;
        } else
        {
            c = a;
            return;
        }
    }

    public final grn a()
    {
        return c;
    }

    public final void a(hci hci1)
    {
        b.writeTo(hci1.c());
    }

    public final long b()
    {
        return b.getContentLength();
    }

}

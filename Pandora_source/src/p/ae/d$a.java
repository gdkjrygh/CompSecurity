// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ae;

import java.io.IOException;
import java.io.InputStream;
import p.q.e;
import p.s.k;

// Referenced classes of package p.ae:
//            d

private static class <init>
    implements e
{

    public String a()
    {
        return "";
    }

    public k a(InputStream inputstream, int i, int j)
    {
        throw new Error("You cannot decode a File from an InputStream by default, try either #diskCacheStratey(DiskCacheStrategy.SOURCE) to avoid this call or #decoder(ResourceDecoder) to replace this Decoder");
    }

    public volatile k a(Object obj, int i, int j)
        throws IOException
    {
        return a((InputStream)obj, i, j);
    }

    private n()
    {
    }

    n(n n)
    {
        this();
    }
}

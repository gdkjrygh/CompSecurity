// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ae;

import java.io.IOException;
import java.io.InputStream;
import p.ak.b;
import p.q.e;
import p.q.f;
import p.s.k;
import p.x.m;

// Referenced classes of package p.ae:
//            a

public class d
    implements b
{
    private static class a
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

        private a()
        {
        }

    }


    private static final a a = new a();
    private final e b = new p.ae.a();
    private final p.q.b c = new m();

    public d()
    {
    }

    public e a()
    {
        return b;
    }

    public e b()
    {
        return a;
    }

    public p.q.b c()
    {
        return c;
    }

    public f d()
    {
        return p.aa.b.b();
    }

}

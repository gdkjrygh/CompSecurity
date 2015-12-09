// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.b;

import com.bumptech.glide.e.b;
import com.bumptech.glide.load.b.o;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.f;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.resource.b:
//            a

public class d
    implements b
{
    private static class a
        implements e
    {

        public j a(InputStream inputstream, int i, int j)
        {
            throw new Error("You cannot decode a File from an InputStream by default, try either #diskCacheStratey(DiskCacheStrategy.SOURCE) to avoid this call or #decoder(ResourceDecoder) to replace this Decoder");
        }

        public volatile j a(Object obj, int i, int j)
            throws IOException
        {
            return a((InputStream)obj, i, j);
        }

        public String a()
        {
            return "";
        }

        private a()
        {
        }

    }


    private static final a a = new a();
    private final e b = new com.bumptech.glide.load.resource.b.a();
    private final com.bumptech.glide.load.b c = new o();

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

    public com.bumptech.glide.load.b c()
    {
        return c;
    }

    public f d()
    {
        return com.bumptech.glide.load.resource.b.b();
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.b;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.a.c;
import com.bumptech.glide.load.a.h;
import com.bumptech.glide.load.a.i;
import com.bumptech.glide.load.b.d;
import com.bumptech.glide.load.b.l;
import com.bumptech.glide.load.b.m;
import com.bumptech.glide.load.b.q;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.b.b:
//            d

public class g extends q
    implements com.bumptech.glide.load.b.b.d
{
    public static class a
        implements m
    {

        public l a(Context context, com.bumptech.glide.load.b.c c1)
        {
            return new g(context, c1.a(com/bumptech/glide/load/b/d, java/io/InputStream));
        }

        public void a()
        {
        }

        public a()
        {
        }
    }


    public g(Context context, l l)
    {
        super(context, l);
    }

    protected c a(Context context, Uri uri)
    {
        return new i(context, uri);
    }

    protected c a(Context context, String s)
    {
        return new h(context.getApplicationContext().getAssets(), s);
    }
}

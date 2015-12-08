// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.a;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.a.c;
import com.bumptech.glide.load.a.d;
import com.bumptech.glide.load.b.l;
import com.bumptech.glide.load.b.m;
import com.bumptech.glide.load.b.q;

// Referenced classes of package com.bumptech.glide.load.b.a:
//            b

public class e extends q
    implements b
{
    public static class a
        implements m
    {

        public l a(Context context, com.bumptech.glide.load.b.c c1)
        {
            return new e(context, c1.a(com/bumptech/glide/load/b/d, android/os/ParcelFileDescriptor));
        }

        public void a()
        {
        }

        public a()
        {
        }
    }


    public e(Context context, l l)
    {
        super(context, l);
    }

    protected c a(Context context, Uri uri)
    {
        return new com.bumptech.glide.load.a.e(context, uri);
    }

    protected c a(Context context, String s)
    {
        return new d(context.getApplicationContext().getAssets(), s);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.a;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.b.l;
import com.bumptech.glide.load.b.m;
import com.bumptech.glide.load.b.n;

// Referenced classes of package com.bumptech.glide.load.b.a:
//            b

public class c extends n
    implements b
{
    public static class a
        implements m
    {

        public l a(Context context, com.bumptech.glide.load.b.c c1)
        {
            return new c(context, c1.a(android/net/Uri, android/os/ParcelFileDescriptor));
        }

        public void a()
        {
        }

        public a()
        {
        }
    }


    public c(Context context, l l)
    {
        super(context, l);
    }
}

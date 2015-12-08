// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.b.x;
import com.bumptech.glide.load.e;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            y, c

public final class k
    implements e
{

    private final y a;
    private final com.bumptech.glide.load.b.a.e b;
    private a c;

    public k(com.bumptech.glide.load.b.a.e e1, a a1)
    {
        this(new y(), e1, a1);
    }

    private k(y y1, com.bumptech.glide.load.b.a.e e1, a a1)
    {
        a = y1;
        b = e1;
        c = a1;
    }

    public final volatile x a(Object obj, int i, int j)
    {
        obj = (ParcelFileDescriptor)obj;
        return com.bumptech.glide.load.resource.bitmap.c.a(a.a(((ParcelFileDescriptor) (obj))), b);
    }

    public final String a()
    {
        return "FileDescriptorBitmapDecoder.com.bumptech.glide.load.data.bitmap";
    }
}

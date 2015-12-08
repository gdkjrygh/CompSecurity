// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.a.c;
import com.bumptech.glide.load.engine.j;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            r, c

public class h
    implements e
{

    private final r a;
    private final c b;
    private a c;

    public h(c c1, a a1)
    {
        this(new r(), c1, a1);
    }

    public h(r r1, c c1, a a1)
    {
        a = r1;
        b = c1;
        c = a1;
    }

    public j a(ParcelFileDescriptor parcelfiledescriptor, int i, int j)
        throws IOException
    {
        return com.bumptech.glide.load.resource.bitmap.c.a(a.a(parcelfiledescriptor, b, i, j, c), b);
    }

    public volatile j a(Object obj, int i, int j)
        throws IOException
    {
        return a((ParcelFileDescriptor)obj, i, j);
    }

    public String a()
    {
        return "FileDescriptorBitmapDecoder.com.bumptech.glide.load.data.bitmap";
    }
}

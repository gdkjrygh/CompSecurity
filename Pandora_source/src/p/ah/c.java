// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ah;

import android.content.res.Resources;
import android.graphics.Bitmap;
import p.ab.j;
import p.ab.k;

// Referenced classes of package p.ah:
//            d

public class c
    implements d
{

    private final Resources a;
    private final p.t.c b;

    public c(Resources resources, p.t.c c1)
    {
        a = resources;
        b = c1;
    }

    public String a()
    {
        return "GlideBitmapDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }

    public p.s.k a(p.s.k k1)
    {
        return new k(new j(a, (Bitmap)k1.b()), b);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.RectF;
import androidx.media.filterpacks.image.ImageRegionSource;

public final class akz
    implements ajq
{

    private ImageRegionSource a;

    public akz(ImageRegionSource imageregionsource)
    {
        a = imageregionsource;
        super();
    }

    public final void a(ajo ajo, ahs ahs1)
    {
        ImageRegionSource.a(a).set((RectF)ahs1.d().m());
    }
}

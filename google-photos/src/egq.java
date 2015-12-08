// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.photos.cast.impl.CastImageView;

public final class egq
    implements Runnable
{

    private CastImageView a;

    public egq(CastImageView castimageview)
    {
        a = castimageview;
        super();
    }

    public final void run()
    {
        a.invalidate();
        CastImageView.a(a);
        if (a.getDrawable() != null && CastImageView.b(a) < 100)
        {
            CastImageView.d(a).postDelayed(CastImageView.c(a), 50L);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.photos.daydream.DreamViewFlipper;

public final class ezt extends azb
{

    private DreamViewFlipper b;

    public ezt(DreamViewFlipper dreamviewflipper, ImageView imageview)
    {
        b = dreamviewflipper;
        super(imageview);
    }

    public final void a(Object obj, azp azp)
    {
        super.a((Drawable)obj, null);
        DreamViewFlipper.b(b, true);
        if (DreamViewFlipper.m(b))
        {
            DreamViewFlipper.a(b, false);
            DreamViewFlipper.c(b);
        }
    }
}

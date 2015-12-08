// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.util.Log;
import com.google.android.apps.photos.transition.ClipAnimationImageView;

final class inb extends azf
{

    private imz a;

    inb(imz imz1)
    {
        a = imz1;
        super();
    }

    public final void a(Drawable drawable)
    {
        imz.a(a).setImageDrawable(drawable);
    }

    public final void a(Object obj, azp azp)
    {
        obj = (Drawable)obj;
        imz.a(a, ((Drawable) (obj)));
        if (imz.b(a) == ine.c)
        {
            imz.a(a).setImageDrawable(((Drawable) (obj)));
        }
    }

    public final void c(Drawable drawable)
    {
        Log.e("ElementPickerFullscreenFragment", "Failed to load high-res drawable for element picker fullscreen fragment");
    }
}

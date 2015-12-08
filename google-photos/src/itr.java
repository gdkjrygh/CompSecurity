// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;

final class itr extends azf
{

    private itf a;

    itr(itf itf1)
    {
        a = itf1;
        super();
    }

    public final void a(Drawable drawable)
    {
        itf.a(a).setImageDrawable(drawable);
    }

    public final void a(Object obj, azp azp)
    {
        obj = (Drawable)obj;
        itf.b(a, ((Drawable) (obj)));
        if (itf.c(a) == iua.c)
        {
            if (obj instanceof Animatable)
            {
                itf.a(a, ((Drawable) (obj)));
            }
            itf.a(a).setImageDrawable(((Drawable) (obj)));
        }
    }

    public final void c(Drawable drawable)
    {
        Log.e("StoryWhiteboxFragment", "Failed to load high-res bitmap for story whitebox");
    }
}

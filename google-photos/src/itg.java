// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;

final class itg extends azf
{

    private itf a;

    itg(itf itf1)
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
        if (obj instanceof Animatable)
        {
            itf.a(a, ((Drawable) (obj)));
        }
        itf.a(a).setImageDrawable(((Drawable) (obj)));
        itf.a(a).setVisibility(0);
        itf.b(a);
    }

    public final void c(Drawable drawable)
    {
        Log.e("StoryWhiteboxFragment", "Failed to load initial bitmap for story whitebox");
    }
}

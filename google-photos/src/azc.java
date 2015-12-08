// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public abstract class azc extends azi
    implements azq
{

    private Animatable b;

    public azc(ImageView imageview)
    {
        super(imageview);
    }

    public final void a(Drawable drawable)
    {
        super.a(drawable);
        a(null);
        d(drawable);
    }

    protected abstract void a(Object obj);

    public void a(Object obj, azp azp1)
    {
        if (azp1 == null || !azp1.a(obj, this))
        {
            a(obj);
        }
        if (obj instanceof Animatable)
        {
            b = (Animatable)obj;
            b.start();
        }
    }

    public final Drawable b()
    {
        return ((ImageView)a).getDrawable();
    }

    public final void b(Drawable drawable)
    {
        super.b(drawable);
        a(null);
        d(drawable);
    }

    public void c(Drawable drawable)
    {
        super.c(drawable);
        a(null);
        d(drawable);
    }

    public final void c_()
    {
        if (b != null)
        {
            b.start();
        }
    }

    public final void d(Drawable drawable)
    {
        ((ImageView)a).setImageDrawable(drawable);
    }

    public final void d_()
    {
        if (b != null)
        {
            b.stop();
        }
    }
}

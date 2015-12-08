// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.List;

public abstract class azi extends ayz
{

    private static Integer b = null;
    public final View a;
    private final azj c;

    public azi(View view)
    {
        a = (View)b.a(view, "Argument must not be null");
        c = new azj(view);
    }

    public final ayo a()
    {
        Object obj = a.getTag();
        if (obj != null)
        {
            if (obj instanceof ayo)
            {
                return (ayo)obj;
            } else
            {
                throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
            }
        } else
        {
            return null;
        }
    }

    public void a(Drawable drawable)
    {
        super.a(drawable);
        c.a();
    }

    public final void a(ayo ayo1)
    {
        a.setTag(ayo1);
    }

    public final void a(azg azg1)
    {
        azj azj1 = c;
        int i = azj1.c();
        int j = azj1.b();
        if (azj.a(i) && azj.a(j))
        {
            azg1.a(i, j);
        } else
        {
            if (!azj1.b.contains(azg1))
            {
                azj1.b.add(azg1);
            }
            if (azj1.c == null)
            {
                azg1 = azj1.a.getViewTreeObserver();
                azj1.c = new azk(azj1);
                azg1.addOnPreDrawListener(azj1.c);
                return;
            }
        }
    }

    public final View f()
    {
        return a;
    }

    public String toString()
    {
        String s = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 12)).append("Target for: ").append(s).toString();
    }

}

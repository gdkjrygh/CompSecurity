// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;
import java.util.Set;

final class frc
    implements android.view.View.OnAttachStateChangeListener, fqy
{

    private final long a;
    private final ImageView b;
    private final fqx c;
    private final Set d;

    frc(long l, ImageView imageview, fqx fqx1, Set set)
    {
        d = set;
        p.b(imageview, "Pivot view not initialized.");
        p.b(fqx1, "Date header model not initialized.");
        a = l;
        b = imageview;
        c = fqx1;
    }

    public final void a(long l)
    {
        if (a != l)
        {
            return;
        } else
        {
            b.setImageResource(fra.a());
            c.a.add(Long.valueOf(l));
            b.setClickable(true);
            return;
        }
    }

    public final void b(long l)
    {
        if (a != l)
        {
            return;
        } else
        {
            b.setImageResource(fra.b());
            c.a.remove(Long.valueOf(l));
            b.setClickable(true);
            return;
        }
    }

    public final void onViewAttachedToWindow(View view)
    {
        d.add(this);
    }

    public final void onViewDetachedFromWindow(View view)
    {
        d.remove(this);
    }
}

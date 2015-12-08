// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Animation;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class gra
    implements android.view.animation.Animation.AnimationListener
{

    private gqz a;

    gra(gqz gqz1)
    {
        a = gqz1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        animation = gqz.a(a).values().iterator();
        do
        {
            if (!animation.hasNext())
            {
                break;
            }
            Object obj = (List)animation.next();
            if (obj != null)
            {
                obj = ((List) (obj)).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    ((View)((Iterator) (obj)).next()).setVisibility(0);
                }
            }
        } while (true);
    }
}

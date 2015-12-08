// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;

import android.view.View;
import java.util.List;

// Referenced classes of package android.support.v4.a:
//            e, d

final class a
    implements Runnable
{

    final a a;

    public final void run()
    {
        float f = ((float)(a.a.getDrawingTime() - a.a) * 1.0F) / (float)a.a;
        if (f > 1.0F || a.a.getParent() == null)
        {
            f = 1.0F;
        }
        a.a = f;
        a a1 = a;
        for (int i = a1.a.size() - 1; i >= 0; i--)
        {
            ((d)a1.a.get(i)).onAnimationUpdate(a1);
        }

        if (a.a >= 1.0F)
        {
            a.a();
            return;
        } else
        {
            a.a.postDelayed(a.a, 16L);
            return;
        }
    }

    ( )
    {
        a = ;
        super();
    }
}

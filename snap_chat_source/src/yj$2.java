// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.List;

final class lang.Object
    implements android.view.OnClickListener
{

    private int a;
    private yj b;

    public final void onClick(View view)
    {
        Object obj = yj.a(b);
        obj.mNumSeeMoreRecentsRequested = ((lv) (obj)).mNumSeeMoreRecentsRequested + 1;
        obj = yj.b(b).b();
        if (obj != null)
        {
            yj yj1 = b;
            int i = a;
            if (!yj1.c.c())
            {
                yj1.d.a(view.getBottom(), view.getHeight() * (((List) (obj)).size() - 1));
                yj1.e.remove(i);
            } else
            {
                yj1.d.a(view.getTop(), view.getHeight() * ((List) (obj)).size());
            }
            yj1.e.addAll(i, ((java.util.Collection) (obj)));
            yj1.f = yj1.e;
            ((android.support.v7.widget.lerView.a) (yj1)).a.b();
        }
    }

    >(yj yj1, int i)
    {
        b = yj1;
        a = i;
        super();
    }
}

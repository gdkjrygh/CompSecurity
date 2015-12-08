// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.List;

final class bfe
    implements android.view.View.OnLayoutChangeListener
{

    private bfd a;

    bfe(bfd bfd1)
    {
        a = bfd1;
        super();
    }

    public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        bfd.a(a, false);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            view = new View[bfd.a(a).size() + 1];
            view[0] = bfd.b(a);
            for (i = 0; i < bfd.a(a).size(); i++)
            {
                view[i + 1] = (View)bfd.a(a).get(i);
            }

            if (bfd.c(a) && !bfd.d(a))
            {
                bfd.b(a, true);
                bfd.b(a).post(new bff(this, view));
            }
        }
    }
}

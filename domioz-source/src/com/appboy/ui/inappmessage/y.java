// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;
import com.appboy.d.b;
import com.appboy.d.i;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage:
//            w, t, s

final class y
    implements android.view.View.OnClickListener
{

    final w a;

    y(w w1)
    {
        a = w1;
        super();
    }

    public final void onClick(View view)
    {
        b b1 = (b)w.a(a);
        int j = 0;
        do
        {
label0:
            {
                if (j < w.d(a).size())
                {
                    if (view.getId() != ((View)w.d(a).get(j)).getId())
                    {
                        break label0;
                    }
                    view = (i)b1.e_().get(j);
                    w.c(a).a(new t(a), view, b1);
                }
                return;
            }
            j++;
        } while (true);
    }
}

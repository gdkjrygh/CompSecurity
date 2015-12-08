// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;
import com.appboy.d.b;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage:
//            w, t, s

final class x
    implements android.view.View.OnClickListener
{

    final w a;

    x(w w1)
    {
        a = w1;
        super();
    }

    public final void onClick(View view)
    {
        if (w.a(a) instanceof b)
        {
            view = (b)w.a(a);
            if (view.e_() == null || view.e_().size() == 0)
            {
                view = w.c(a);
                t t1 = new t(a);
                com.appboy.ui.inappmessage.w.b(a);
                view.a(t1, w.a(a));
            }
            return;
        } else
        {
            view = w.c(a);
            t t2 = new t(a);
            com.appboy.ui.inappmessage.w.b(a);
            view.a(t2, w.a(a));
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;
import com.appboy.d.d;
import com.appboy.ui.inappmessage.a.c;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage:
//            v, t

final class w
    implements android.view.View.OnClickListener
{

    final v a;

    w(v v1)
    {
        a = v1;
        super();
    }

    public final void onClick(View view)
    {
        if (v.a(a) instanceof d)
        {
            view = (d)v.a(a);
            if (view.u() == null || view.u().size() == 0)
            {
                view = com.appboy.ui.inappmessage.v.c(a);
                t t1 = new t(a);
                v.b(a);
                view.a(t1, v.a(a));
            }
            return;
        } else
        {
            view = com.appboy.ui.inappmessage.v.c(a);
            t t2 = new t(a);
            v.b(a);
            view.a(t2, v.a(a));
            return;
        }
    }
}

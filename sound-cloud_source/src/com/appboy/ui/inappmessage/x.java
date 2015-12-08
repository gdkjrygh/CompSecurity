// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;
import com.appboy.d.d;
import com.appboy.d.l;
import com.appboy.ui.inappmessage.a.c;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage:
//            v, t

final class x
    implements android.view.View.OnClickListener
{

    final v a;

    x(v v1)
    {
        a = v1;
        super();
    }

    public final void onClick(View view)
    {
        d d1 = (d)v.a(a);
        int i = 0;
        do
        {
label0:
            {
                if (i < com.appboy.ui.inappmessage.v.d(a).size())
                {
                    if (view.getId() != ((View)com.appboy.ui.inappmessage.v.d(a).get(i)).getId())
                    {
                        break label0;
                    }
                    view = (l)d1.u().get(i);
                    com.appboy.ui.inappmessage.v.c(a).a(new t(a), view, d1);
                }
                return;
            }
            i++;
        } while (true);
    }
}

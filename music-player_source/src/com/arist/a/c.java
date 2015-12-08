// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.a;

import android.view.View;
import android.widget.PopupWindow;
import com.arist.activity.MainActivity;
import com.arist.b.b;
import com.arist.model.a.a;

// Referenced classes of package com.arist.a:
//            a

final class c
    implements android.view.View.OnClickListener
{

    final com.arist.a.a a;
    private PopupWindow b;
    private b c;

    public c(com.arist.a.a a1, PopupWindow popupwindow, b b1)
    {
        a = a1;
        super();
        b = popupwindow;
        c = b1;
    }

    public final void onClick(View view)
    {
        boolean flag = false;
        b.dismiss();
        com.arist.a.a.a(a).e = c;
        switch (view.getId())
        {
        default:
            return;

        case 2131099891: 
            view = com.arist.a.a.a(a);
            if (com.arist.a.a.b(a) == 0)
            {
                flag = true;
            }
            view.c(flag);
            return;

        case 2131099893: 
            com.arist.a.a.a(a).d();
            return;

        case 2131099889: 
            com.arist.a.a.a(a).a(0, 0);
            return;

        case 2131099894: 
            com.arist.a.a.a(a).a();
            return;

        case 2131099890: 
            new a();
            view = com.arist.a.a.a(a).getApplicationContext();
            int i = c.c();
            c.e();
            boolean flag1 = com.arist.model.a.a.a(view, i);
            view = com.arist.a.a.a(a);
            if (flag1)
            {
                i = 0x7f0900db;
            } else
            {
                i = 0x7f0900dc;
            }
            view.a(i);
            return;

        case 2131099892: 
            break;
        }
        if (com.arist.a.a.b(a) == 3)
        {
            com.arist.a.a.a(a).c();
            return;
        } else
        {
            com.arist.a.a.a(a).b();
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import android.view.View;
import android.widget.BaseAdapter;
import com.roidapp.baselib.c.n;
import com.roidapp.photogrid.release.ParentActivity;
import com.roidapp.photogrid.release.ab;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.cloud.a:
//            y

final class z
    implements android.view.View.OnClickListener
{

    final ParentActivity a;
    final String b;
    final y c;

    z(y y1, ParentActivity parentactivity, String s)
    {
        c = y1;
        a = parentactivity;
        b = s;
        super();
    }

    public final void onClick(View view)
    {
        if (c.d != null && !a.isFinishing())
        {
            a.F();
            view = a;
            String s = b;
            while (false) 
            {
                if (view != null && !view.h() && !view.isFinishing() && s != null)
                {
                    ab ab1 = new ab();
                    ab1.a(s);
                    ab1.a(true);
                    n.a(view.getSupportFragmentManager(), ab1, "AddDecoViewTipDialogFragment");
                }
                if (y.a(c) != null && y.a(c).get() != null)
                {
                    c.b((BaseAdapter)y.a(c).get());
                    return;
                }
            }
        }
    }
}

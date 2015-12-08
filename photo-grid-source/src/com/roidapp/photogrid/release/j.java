// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.widget.ImageView;
import com.roidapp.baselib.view.FixedDrawerLayout;

// Referenced classes of package com.roidapp.photogrid.release:
//            c

final class j
    implements android.content.DialogInterface.OnKeyListener
{

    final c a;

    j(c c1)
    {
        a = c1;
        super();
    }

    public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4 && keyevent.getAction() == 0)
        {
            c.c(a);
            if (!FixedDrawerLayout.g(c.b(a)))
            {
                c.d(a).setVisibility(8);
                c.c(a).e(c.b(a));
            } else
            {
                c.i(a);
            }
            return true;
        } else
        {
            return false;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.DialogInterface;
import android.os.Handler;
import android.view.KeyEvent;

// Referenced classes of package com.jcp.util:
//            aj, an

class am
    implements android.content.DialogInterface.OnKeyListener
{

    final aj a;

    am(aj aj1)
    {
        a = aj1;
        super();
    }

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            dialoginterface.dismiss();
            a.d();
            aj.d(a).removeCallbacks(aj.c(a));
            if (aj.g(a) != null)
            {
                ((an)aj.h(a)).a();
            }
            return true;
        } else
        {
            return false;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.DialogInterface;
import android.os.Handler;

// Referenced classes of package com.jcp.util:
//            aj, an

class al
    implements android.content.DialogInterface.OnClickListener
{

    final aj a;

    al(aj aj1)
    {
        a = aj1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        a.d();
        aj.d(a).removeCallbacks(aj.c(a));
        if (aj.e(a) != null)
        {
            ((an)aj.f(a)).a();
        }
    }
}

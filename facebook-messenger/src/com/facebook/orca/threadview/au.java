// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

// Referenced classes of package com.facebook.orca.threadview:
//            as, ax, aw

class au
    implements android.content.DialogInterface.OnClickListener
{

    final as a;

    au(as as1)
    {
        a = as1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        as.b(a).hideSoftInputFromWindow(a.getWindow().getDecorView().getWindowToken(), 0);
        a.dismiss();
        if (as.c(a) != null)
        {
            as.c(a).a(ax.NO_CHANGE, as.d(a));
        }
    }
}

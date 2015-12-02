// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.d;

import android.app.Activity;
import android.content.DialogInterface;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.ui.d:
//            a, e

class c
    implements android.content.DialogInterface.OnClickListener
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        if (com.facebook.ui.d.a.a(a) != null)
        {
            com.facebook.ui.d.a.a(a).finish();
        }
        (new e(com.facebook.ui.d.a.c(a))).a(com.facebook.ui.d.a.d(a).b());
    }
}

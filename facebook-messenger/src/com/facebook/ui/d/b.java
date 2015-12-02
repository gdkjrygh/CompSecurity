// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.d;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;

// Referenced classes of package com.facebook.ui.d:
//            a

class b
    implements android.content.DialogInterface.OnClickListener
{

    final a a;

    b(a a1)
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
        if (com.facebook.ui.d.a.b(a) != null)
        {
            com.facebook.ui.d.a.b(a).a();
        }
    }
}

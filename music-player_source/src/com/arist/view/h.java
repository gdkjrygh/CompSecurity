// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.view;

import android.content.DialogInterface;
import com.arist.activity.MyApplication;
import com.arist.c.f;

// Referenced classes of package com.arist.view:
//            e

final class h
    implements android.content.DialogInterface.OnClickListener
{

    final e a;

    h(e e1)
    {
        a = e1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        i++;
        MyApplication.i = i;
        MyApplication.e.c(i);
        a.a();
        dialoginterface.dismiss();
    }
}

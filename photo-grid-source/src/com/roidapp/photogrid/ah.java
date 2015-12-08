// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage

final class ah
    implements android.content.DialogInterface.OnClickListener
{

    final MainPage a;

    ah(MainPage mainpage)
    {
        a = mainpage;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (!a.isFinishing())
        {
            dialoginterface.dismiss();
            MainPage.N(a);
            a.finish();
        }
    }
}

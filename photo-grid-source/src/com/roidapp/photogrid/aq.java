// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.content.DialogInterface;
import com.roidapp.photogrid.social.c;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage

final class aq
    implements android.content.DialogInterface.OnDismissListener
{

    final MainPage a;

    aq(MainPage mainpage)
    {
        a = mainpage;
        super();
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        c.a(true, a);
    }
}

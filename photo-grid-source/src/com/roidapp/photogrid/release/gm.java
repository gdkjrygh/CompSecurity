// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.roidapp.photogrid.release:
//            ge, PhotoGridActivity

final class gm
    implements android.content.DialogInterface.OnClickListener
{

    final ge a;

    gm(ge ge1)
    {
        a = ge1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.settings.WIFI_SETTINGS");
        ge.f(a).startActivity(dialoginterface);
    }
}

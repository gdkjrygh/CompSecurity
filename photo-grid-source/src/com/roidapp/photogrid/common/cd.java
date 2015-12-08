// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.roidapp.photogrid.common:
//            cc

final class cd
    implements android.content.DialogInterface.OnClickListener
{

    final cc a;

    cd(cc cc1)
    {
        a = cc1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse(a.d));
        dialoginterface.setFlags(0x10000000);
        cc.a(a).startActivity(dialoginterface);
    }
}

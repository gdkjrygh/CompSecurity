// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.miteksystems.misnap:
//            MiSnap

final class f
    implements android.content.DialogInterface.OnClickListener
{

    final MiSnap a;

    f(MiSnap misnap)
    {
        a = misnap;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse(a.getString(R.string.mobi_url)));
        dialoginterface.addFlags(0x80000);
        a.startActivity(dialoginterface);
        a.finish();
    }
}

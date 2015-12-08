// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.google;

import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.roidapp.cloudlib.google:
//            GoogleAuthActivity

final class a
    implements android.content.DialogInterface.OnClickListener
{

    final GoogleAuthActivity a;

    a(GoogleAuthActivity googleauthactivity)
    {
        a = googleauthactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.startActivityForResult(new Intent("android.settings.WIFI_SETTINGS"), 1);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.google;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.cloudlib.google:
//            GoogleAuthActivity

final class b
    implements android.content.DialogInterface.OnClickListener
{

    final GoogleAuthActivity a;

    b(GoogleAuthActivity googleauthactivity)
    {
        a = googleauthactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        a.setResult(0, a.getIntent());
        a.finish();
    }
}

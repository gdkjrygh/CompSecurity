// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.instagram;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.cloudlib.instagram:
//            InstagramAuthActivity

final class b
    implements android.content.DialogInterface.OnClickListener
{

    final InstagramAuthActivity a;

    b(InstagramAuthActivity instagramauthactivity)
    {
        a = instagramauthactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        a.setResult(0, a.getIntent());
        a.finish();
    }
}

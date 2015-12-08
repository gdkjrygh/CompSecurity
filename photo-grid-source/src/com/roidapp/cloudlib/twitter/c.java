// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.twitter;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.cloudlib.twitter:
//            TwitterLoginActivity

final class c
    implements android.content.DialogInterface.OnClickListener
{

    final TwitterLoginActivity a;

    c(TwitterLoginActivity twitterloginactivity)
    {
        a = twitterloginactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        a.setResult(0);
        a.finish();
    }
}

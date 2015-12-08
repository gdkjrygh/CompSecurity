// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.twitter;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.cloudlib.twitter:
//            TwitterLoginActivity

final class e
    implements android.content.DialogInterface.OnCancelListener
{

    final TwitterLoginActivity a;

    e(TwitterLoginActivity twitterloginactivity)
    {
        a = twitterloginactivity;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.a();
        a.finish();
    }
}

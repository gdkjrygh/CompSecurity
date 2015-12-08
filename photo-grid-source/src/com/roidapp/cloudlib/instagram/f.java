// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.instagram;


// Referenced classes of package com.roidapp.cloudlib.instagram:
//            InstagramAuthActivity

final class f
    implements Runnable
{

    final InstagramAuthActivity a;

    f(InstagramAuthActivity instagramauthactivity)
    {
        a = instagramauthactivity;
        super();
    }

    public final void run()
    {
        InstagramAuthActivity.c(a);
    }
}

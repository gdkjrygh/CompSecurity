// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            AdViewManager

class by
    implements Runnable
{

    final AdViewManager a;

    by(AdViewManager adviewmanager)
    {
        a = adviewmanager;
        super();
    }

    public void run()
    {
        a.f.onAdComplete(a);
    }
}

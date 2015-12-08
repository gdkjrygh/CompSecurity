// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import KO;

// Referenced classes of package com.snapchat.android:
//            SnapchatApplication

final class a
    implements Runnable
{

    private SnapchatApplication a;

    public final void run()
    {
        Thread.currentThread().setName("SlightlySecurePreferences.initialize");
        a.mSlightlySecurePreferences.a();
    }

    (SnapchatApplication snapchatapplication)
    {
        a = snapchatapplication;
        super();
    }
}

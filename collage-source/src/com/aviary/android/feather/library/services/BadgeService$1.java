// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

// Referenced classes of package com.aviary.android.feather.library.services:
//            BadgeService

class a extends ContentObserver
{

    final BadgeService a;

    public void onChange(boolean flag)
    {
        onChange(flag, null);
    }

    public void onChange(boolean flag, Uri uri)
    {
        BadgeService.a(a);
    }

    (BadgeService badgeservice, Handler handler)
    {
        a = badgeservice;
        super(handler);
    }
}

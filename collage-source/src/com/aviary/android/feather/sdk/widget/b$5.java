// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            b

class a extends ContentObserver
{

    final b a;

    public void onChange(boolean flag)
    {
        onChange(flag, null);
    }

    public void onChange(boolean flag, Uri uri)
    {
        b.a.b("mServiceFinishedContentObserver::onChange");
        if (a.d())
        {
            b.a(a).a();
        }
    }

    (b b1, Handler handler)
    {
        a = b1;
        super(handler);
    }
}

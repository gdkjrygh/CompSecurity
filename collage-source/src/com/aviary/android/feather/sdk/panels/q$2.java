// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.database.ContentObserver;
import android.os.Handler;
import android.support.v4.content.CursorLoader;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            q

class a extends ContentObserver
{

    final q a;

    public void onChange(boolean flag)
    {
        a.q.b("mContentObserver::onChange");
        super.onChange(flag);
        if (a.n() && a.u != null && a.u.isStarted())
        {
            a.u.onContentChanged();
        }
    }

    (q q1, Handler handler)
    {
        a = q1;
        super(handler);
    }
}

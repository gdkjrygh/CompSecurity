// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.database.ContentObserver;
import android.os.Handler;
import android.support.v4.content.CursorLoader;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            f

class a extends ContentObserver
{

    final f a;

    public void onChange(boolean flag)
    {
        a.q.b("mContentObserver::onChange");
        super.onChange(flag);
        if (a.n() && a.A != null && a.A.isStarted())
        {
            a.A.onContentChanged();
        }
    }

    (f f1, Handler handler)
    {
        a = f1;
        super(handler);
    }
}

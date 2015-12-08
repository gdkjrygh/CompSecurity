// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.database.ContentObserver;
import android.os.Handler;

// Referenced classes of package android.support.v4.widget:
//            e

private final class er extends ContentObserver
{

    final e a;

    public final boolean deliverSelfNotifications()
    {
        return true;
    }

    public final void onChange(boolean flag)
    {
        a.onContentChanged();
    }

    public er(e e1)
    {
        a = e1;
        super(new Handler());
    }
}

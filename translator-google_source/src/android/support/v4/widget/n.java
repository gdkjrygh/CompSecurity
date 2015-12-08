// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

// Referenced classes of package android.support.v4.widget:
//            m

final class n extends ContentObserver
{

    final m a;

    public n(m m1)
    {
        a = m1;
        super(new Handler());
    }

    public final boolean deliverSelfNotifications()
    {
        return true;
    }

    public final void onChange(boolean flag)
    {
        m m1 = a;
        if (m1.b && m1.c != null && !m1.c.isClosed())
        {
            m1.a = m1.c.requery();
        }
    }
}

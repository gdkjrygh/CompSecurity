// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.database.ContentObserver;
import android.os.Handler;

// Referenced classes of package android.support.v4.content:
//            p

public final class q extends ContentObserver
{

    final p a;

    public q(p p1)
    {
        a = p1;
        super(new Handler());
    }

    public final boolean deliverSelfNotifications()
    {
        return true;
    }

    public final void onChange(boolean flag)
    {
        a.n();
    }
}

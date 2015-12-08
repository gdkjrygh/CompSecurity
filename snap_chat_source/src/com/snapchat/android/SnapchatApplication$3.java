// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.snapchat.android:
//            SnapchatApplication

final class a
    implements onHandler
{

    private onHandler a;
    private SnapchatApplication b;

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        Iterator iterator = SnapchatApplication.sCrashables.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (rashables)((WeakReference)iterator.next()).get();
            if (a1 != null)
            {
                a1.a(SnapchatApplication.access$000(b), thread, throwable);
            }
        } while (true);
        a.uncaughtException(thread, throwable);
    }

    (SnapchatApplication snapchatapplication, onHandler onhandler)
    {
        b = snapchatapplication;
        a = onhandler;
        super();
    }
}

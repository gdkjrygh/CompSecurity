// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.net.Uri;
import android.os.Bundle;
import com.appboy.b.a.a;
import com.appboy.d.b;
import com.appboy.h;
import com.appboy.ui.a.d;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.appboy.ui.inappmessage:
//            s, j, t, a, 
//            p

final class i
    implements s
{

    final com.appboy.ui.inappmessage.a a;

    i(com.appboy.ui.inappmessage.a a1)
    {
        a = a1;
        super();
    }

    private void a(a a1, com.appboy.d.a a2, t t1, Uri uri)
    {
        switch (com.appboy.ui.inappmessage.j.b[a1.ordinal()])
        {
        default:
            t1.a(false);
            return;

        case 1: // '\001'
            a2.a(false);
            t1.a(false);
            a1 = com.appboy.ui.inappmessage.a.e(a);
            t1 = com.appboy.ui.inappmessage.a.a(a);
            uri = a2.c();
            a2 = new Bundle();
            if (uri != null)
            {
                java.util.Map.Entry entry;
                for (uri = uri.entrySet().iterator(); uri.hasNext(); a2.putString((String)entry.getKey(), (String)entry.getValue()))
                {
                    entry = (java.util.Map.Entry)uri.next();
                }

            }
            a1.a(t1);
            return;

        case 2: // '\002'
            a2.a(false);
            t1.a(false);
            com.appboy.ui.a.a.a(com.appboy.ui.inappmessage.a.a(a), uri.toString()).a(com.appboy.ui.inappmessage.a.a(a));
            return;

        case 3: // '\003'
            t1.a(true);
            return;
        }
    }

    public final void a()
    {
        com.appboy.f.a.a(com.appboy.ui.inappmessage.a.c(), "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.afterOpened called.");
    }

    public final void a(com.appboy.d.a a1)
    {
        com.appboy.f.a.a(com.appboy.ui.inappmessage.a.c(), "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.beforeOpened called.");
        a1.r();
    }

    public final void a(t t1, com.appboy.d.a a1)
    {
        com.appboy.f.a.a(com.appboy.ui.inappmessage.a.c(), "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onClicked called.");
        if (a1.m() != a.c)
        {
            a1.s();
        }
        if (!com.appboy.ui.inappmessage.a.c(a).onInAppMessageClicked(a1, t1))
        {
            a(a1.m(), a1, t1, a1.n());
        }
    }

    public final void a(t t1, com.appboy.d.i k, b b1)
    {
        com.appboy.f.a.a(com.appboy.ui.inappmessage.a.c(), "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onButtonClicked called.");
        if (k.c() != a.c)
        {
            b1.a(k);
        }
        if (!com.appboy.ui.inappmessage.a.c(a).onInAppMessageButtonClicked(k, t1))
        {
            a(k.c(), ((com.appboy.d.a) (b1)), t1, k.d());
        }
    }

    public final void b()
    {
        com.appboy.f.a.a(com.appboy.ui.inappmessage.a.c(), "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.beforeClosed called.");
    }

    public final void b(com.appboy.d.a a1)
    {
        com.appboy.f.a.a(com.appboy.ui.inappmessage.a.c(), "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onDismissed called.");
        com.appboy.ui.inappmessage.a.c(a).onInAppMessageDismissed(a1);
    }

    public final void c()
    {
        com.appboy.ui.inappmessage.a.d(a);
        com.appboy.f.a.a(com.appboy.ui.inappmessage.a.c(), "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.afterClosed called.");
        com.appboy.ui.inappmessage.a.b(a).set(false);
    }
}

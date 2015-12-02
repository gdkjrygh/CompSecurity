// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.os.PowerManager;
import com.facebook.inject.d;
import com.facebook.messages.ipc.k;
import com.facebook.orca.chatheads.annotations.IsChatHeadsEnabled;
import com.facebook.ui.images.b.h;
import com.facebook.user.tiles.c;

// Referenced classes of package com.facebook.orca.notify:
//            f, an, ak, x, 
//            y

class ab extends d
{

    final x a;

    private ab(x x)
    {
        a = x;
        super();
    }

    ab(x x, y y)
    {
        this(x);
    }

    public f a()
    {
        return new f((Context)e().a(android/content/Context), (NotificationManager)e().a(android/app/NotificationManager), (an)a(com/facebook/orca/notify/an), (ak)a(com/facebook/orca/notify/ak), (k)a(com/facebook/messages/ipc/k), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (h)a(com/facebook/ui/images/b/h), (c)a(com/facebook/user/tiles/c), (com.facebook.fbservice.ops.k)e().a(com/facebook/fbservice/ops/k), (KeyguardManager)e().a(android/app/KeyguardManager), (PowerManager)e().a(android/os/PowerManager), b(java/lang/Boolean, com/facebook/orca/chatheads/annotations/IsChatHeadsEnabled));
    }

    public Object b()
    {
        return a();
    }
}

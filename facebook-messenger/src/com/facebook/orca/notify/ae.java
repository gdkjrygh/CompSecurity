// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.content.Context;
import android.media.AudioManager;
import android.os.Vibrator;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.notify:
//            ak, an, x, y

class ae extends d
{

    final x a;

    private ae(x x)
    {
        a = x;
        super();
    }

    ae(x x, y y)
    {
        this(x);
    }

    public ak a()
    {
        return new ak((Context)e().a(android/content/Context), (Vibrator)e().a(android/os/Vibrator), (AudioManager)e().a(android/media/AudioManager), (an)a(com/facebook/orca/notify/an));
    }

    public Object b()
    {
        return a();
    }
}

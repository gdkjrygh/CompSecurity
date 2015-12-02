// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.media.AudioManager;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.d:
//            bf, s, t

class ad extends d
{

    final s a;

    private ad(s s)
    {
        a = s;
        super();
    }

    ad(s s, t t)
    {
        this(s);
    }

    public bf a()
    {
        return new bf((AudioManager)e().a(android/media/AudioManager));
    }

    public Object b()
    {
        return a();
    }
}

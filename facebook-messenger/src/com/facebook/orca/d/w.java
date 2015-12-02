// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.media.AudioManager;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.d:
//            m, e, bf, s, 
//            t

class w extends d
{

    final s a;

    private w(s s)
    {
        a = s;
        super();
    }

    w(s s, t t)
    {
        this(s);
    }

    public m a()
    {
        return new m((AudioManager)e().a(android/media/AudioManager), b(com/facebook/orca/d/e), (bf)a(com/facebook/orca/d/bf));
    }

    public Object b()
    {
        return a();
    }
}

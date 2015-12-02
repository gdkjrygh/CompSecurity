// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.content.Context;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.push.mqtt:
//            s, ax, ay

class bd extends d
{

    final ax a;

    private bd(ax ax)
    {
        a = ax;
        super();
    }

    bd(ax ax, ay ay)
    {
        this(ax);
    }

    public s a()
    {
        return new s((Context)e().a(android/content/Context));
    }

    public Object b()
    {
        return a();
    }
}

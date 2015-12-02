// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.content.Context;
import com.facebook.c.j;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.push.mqtt:
//            ci, ax, ay

class bp extends d
{

    final ax a;

    private bp(ax ax)
    {
        a = ax;
        super();
    }

    bp(ax ax, ay ay)
    {
        this(ax);
    }

    public ci a()
    {
        return new ci((Context)a(android/content/Context), (j)a(com/facebook/c/j));
    }

    public Object b()
    {
        return a();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.app.AlarmManager;
import android.content.Context;
import com.facebook.common.time.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.push.annotations.KeepaliveDelayAdjustmentPercentage;

// Referenced classes of package com.facebook.push.mqtt:
//            o, ax, ay

class bc extends d
{

    final ax a;

    private bc(ax ax)
    {
        a = ax;
        super();
    }

    bc(ax ax, ay ay)
    {
        this(ax);
    }

    public o a()
    {
        return new o((Context)e().a(android/content/Context), (AlarmManager)e().a(android/app/AlarmManager), (a)a(com/facebook/common/time/a), ((Integer)a(java/lang/Integer, com/facebook/push/annotations/KeepaliveDelayAdjustmentPercentage)).intValue());
    }

    public Object b()
    {
        return a();
    }
}

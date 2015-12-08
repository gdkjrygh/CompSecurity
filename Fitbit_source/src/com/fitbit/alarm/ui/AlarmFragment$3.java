// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.fitbit.alarm.ui:
//            AlarmFragment

class <init> extends <init>
{

    final AlarmFragment a;

    public void forceLoad()
    {
        AlarmFragment.e(a).set(true);
        super.forceLoad();
    }

    olean(AlarmFragment alarmfragment, Context context)
    {
        a = alarmfragment;
        super(alarmfragment, context);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.content.ComponentName;
import android.os.IBinder;
import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages

public static final class binder extends MessageBase
{

    public final IBinder binder;
    public final ComponentName component;

    public (ComponentName componentname, IBinder ibinder)
    {
        super(12);
        component = componentname;
        binder = ibinder;
    }
}

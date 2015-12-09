// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;

import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomservice:
//            Messages

public static final class result extends MessageBase
{

    public boolean result;

    public (boolean flag)
    {
        super(20);
        result = flag;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages

public static final class success extends MessageBase
{

    public final String roomId;
    public final Boolean success;

    public (String s, boolean flag)
    {
        super(49);
        roomId = s;
        success = Boolean.valueOf(flag);
    }
}

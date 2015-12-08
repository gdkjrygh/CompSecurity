// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages

public static final class roomStatusJson extends MessageBase
{

    public final String roomStatusJson;
    public final int statusCode;

    public (int i, String s)
    {
        super(47);
        statusCode = i;
        roomStatusJson = s;
    }
}

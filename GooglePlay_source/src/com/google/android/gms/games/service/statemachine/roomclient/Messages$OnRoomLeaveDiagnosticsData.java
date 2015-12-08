// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages

public static final class dcmPlaylog extends MessageBase
{

    public final byte dcmPlaylog[];
    public final String roomLeaveDiagnosticsJson;

    public (String s, byte abyte0[])
    {
        super(10);
        roomLeaveDiagnosticsJson = s;
        dcmPlaylog = abyte0;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages

public static final class enterRoomData extends MessageBase
{

    public final enterRoomData enterRoomData;
    public final DataHolder roomDataHolder;

    public (DataHolder dataholder,  )
    {
        super(15);
        roomDataHolder = dataholder;
        enterRoomData = ;
    }
}

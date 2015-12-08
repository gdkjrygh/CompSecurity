// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;

import java.util.UUID;

// Referenced classes of package com.snapchat.android.model.chat:
//            Chat

public static class recipient
{

    String id;
    String recipient;
    String sender;

    public (String s, String s1)
    {
        id = UUID.randomUUID().toString();
        sender = s;
        recipient = s1;
    }
}

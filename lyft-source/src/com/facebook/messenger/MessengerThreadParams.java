// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messenger;

import java.util.List;

public class MessengerThreadParams
{

    public final String metadata;
    public final Origin origin;
    public final List participants;
    public final String threadToken;

    public MessengerThreadParams(Origin origin1, String s, String s1, List list)
    {
        threadToken = s;
        metadata = s1;
        participants = list;
        origin = origin1;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;


// Referenced classes of package com.google.android.gms.games.broker:
//            MultiplayerAgent

private static final class isInvitation
{

    public final int initialVersion;
    public final boolean isInvitation;
    public final int newVersion;

    public final boolean isTombstone()
    {
        return newVersion == -1;
    }

    public (int i, int j, boolean flag)
    {
        initialVersion = i;
        newVersion = j;
        isInvitation = flag;
    }
}

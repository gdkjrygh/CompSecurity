// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;


// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation

public interface OnInvitationReceivedListener
{

    public abstract void onInvitationReceived(Invitation invitation);

    public abstract void onInvitationRemoved(String s);
}

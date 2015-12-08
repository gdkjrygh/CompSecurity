// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine;


// Referenced classes of package com.google.android.gms.games.service.statemachine:
//            MessageBase, StateTimer

private final class timerToken extends MessageBase
{

    final StateTimer this$0;
    public final geToken timerToken;

    public geToken(int i, geToken getoken)
    {
        this$0 = StateTimer.this;
        super(i);
        timerToken = getoken;
    }
}

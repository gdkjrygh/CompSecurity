// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.jingle;


// Referenced classes of package com.google.android.gms.games.jingle:
//            JingleMessages

public static final class latencyMs extends latencyMs
{

    public final int latencyMs;
    public final String localJid;
    public final boolean signedIn;

    public Q(boolean flag, String s, int i)
    {
        super(1);
        signedIn = flag;
        localJid = s;
        latencyMs = i;
    }
}

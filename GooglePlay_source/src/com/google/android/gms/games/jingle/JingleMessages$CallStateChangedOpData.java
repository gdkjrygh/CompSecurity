// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.jingle;


// Referenced classes of package com.google.android.gms.games.jingle:
//            JingleMessages

public static final class error extends error
{

    public final int error;
    public final String localJid;
    public final int newState;
    public final String remoteJid;
    public final String sessionId;

    public (String s, String s1, String s2, int i, int j)
    {
        super(2);
        localJid = s;
        remoteJid = s1;
        sessionId = s2;
        newState = i;
        error = j;
    }
}

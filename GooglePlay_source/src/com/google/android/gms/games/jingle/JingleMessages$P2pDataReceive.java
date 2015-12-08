// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.jingle;


// Referenced classes of package com.google.android.gms.games.jingle:
//            JingleMessages

public static final class recieveData extends se
{

    public final byte recieveData[];
    public final String sessionId;

    public se(String s, byte abyte0[])
    {
        super(302);
        sessionId = s;
        recieveData = abyte0;
    }
}

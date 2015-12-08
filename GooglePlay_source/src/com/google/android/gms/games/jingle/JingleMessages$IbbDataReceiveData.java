// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.jingle;


// Referenced classes of package com.google.android.gms.games.jingle:
//            JingleMessages

public static final class recieveData extends recieveData
{

    public final String fromJid;
    public final byte recieveData[];

    public (String s, byte abyte0[])
    {
        super(101);
        fromJid = s;
        recieveData = abyte0;
    }
}

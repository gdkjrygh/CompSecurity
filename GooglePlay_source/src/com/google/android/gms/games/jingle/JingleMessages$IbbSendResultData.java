// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.jingle;


// Referenced classes of package com.google.android.gms.games.jingle:
//            JingleMessages

public static final class success extends success
{

    public final String peerJid;
    public final boolean success;
    public final int token;

    public (int i, String s, boolean flag)
    {
        super(102);
        token = i;
        peerJid = s;
        success = flag;
    }
}

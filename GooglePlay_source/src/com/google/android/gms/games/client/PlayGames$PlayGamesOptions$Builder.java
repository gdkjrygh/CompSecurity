// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client;


// Referenced classes of package com.google.android.gms.games.client:
//            PlayGames

public static final class <init>
{

    com.google.android.gms.games.uilder baseOptions;
    public boolean unauthenticated;

    public final <init> build()
    {
        return new <init>(this, (byte)0);
    }

    private (com.google.android.gms.games.uilder uilder)
    {
        baseOptions = uilder;
        unauthenticated = false;
    }

    unauthenticated(com.google.android.gms.games.uilder uilder, byte byte0)
    {
        this(uilder);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.audio;


public final class errorCode extends Exception
{

    public final int errorCode;

    public (int i)
    {
        super((new StringBuilder("AudioTrack write failed: ")).append(i).toString());
        errorCode = i;
    }
}

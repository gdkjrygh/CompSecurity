// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash.mpd;


public final class UtcTimingElement
{

    public final String a;
    public final String b;

    public UtcTimingElement(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append(", ").append(b).toString();
    }
}

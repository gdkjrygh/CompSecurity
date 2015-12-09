// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class  extends Enum
{

    public static final d a;
    private static d b;
    private static d c;
    private static d d;
    private static final d e[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/internal/zzk$zza, s);
    }

    public static [] values()
    {
        return ([])e.clone();
    }

    static 
    {
        b = new <init>("LOW", 0);
        a = new <init>("NORMAL", 1);
        c = new <init>("HIGH", 2);
        d = new <init>("IMMEDIATE", 3);
        e = (new e[] {
            b, a, c, d
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

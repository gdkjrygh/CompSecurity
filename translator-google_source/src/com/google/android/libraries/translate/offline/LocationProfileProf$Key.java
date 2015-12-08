// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;


public final class  extends Enum
{

    public static final TYPE MINVC;
    public static final TYPE PV;
    public static final TYPE R;
    public static final TYPE TYPE;
    public static final TYPE URL;
    public static final TYPE V;
    private static final TYPE a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/libraries/translate/offline/LocationProfileProf$Key, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        V = new <init>("V", 0);
        R = new <init>("R", 1);
        PV = new <init>("PV", 2);
        URL = new <init>("URL", 3);
        MINVC = new <init>("MINVC", 4);
        TYPE = new <init>("TYPE", 5);
        a = (new a[] {
            V, R, PV, URL, MINVC, TYPE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

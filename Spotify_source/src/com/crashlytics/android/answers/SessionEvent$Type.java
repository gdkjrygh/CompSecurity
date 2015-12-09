// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;


public final class  extends Enum
{

    public static final l a;
    public static final l b;
    public static final l c;
    public static final l d;
    public static final l e;
    public static final l f;
    public static final l g;
    public static final l h;
    public static final l i;
    public static final l j;
    public static final l k;
    public static final l l;
    private static final l m[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/crashlytics/android/answers/SessionEvent$Type, s);
    }

    public static [] values()
    {
        return ([])m.clone();
    }

    static 
    {
        a = new <init>("CREATE", 0);
        b = new <init>("START", 1);
        c = new <init>("RESUME", 2);
        d = new <init>("SAVE_INSTANCE_STATE", 3);
        e = new <init>("PAUSE", 4);
        f = new <init>("STOP", 5);
        g = new <init>("DESTROY", 6);
        h = new <init>("ERROR", 7);
        i = new <init>("CRASH", 8);
        j = new <init>("INSTALL", 9);
        k = new <init>("CUSTOM", 10);
        l = new <init>("PREDEFINED", 11);
        m = (new m[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }

    private (String s, int i1)
    {
        super(s, i1);
    }
}

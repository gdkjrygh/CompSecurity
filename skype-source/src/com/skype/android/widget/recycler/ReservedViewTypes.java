// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;


public final class ReservedViewTypes extends Enum
{

    public static final ReservedViewTypes a;
    public static final ReservedViewTypes b;
    private static final ReservedViewTypes d[];
    public final int c;

    private ReservedViewTypes(String s, int i, int j)
    {
        super(s, i);
        c = j;
    }

    public static ReservedViewTypes valueOf(String s)
    {
        return (ReservedViewTypes)Enum.valueOf(com/skype/android/widget/recycler/ReservedViewTypes, s);
    }

    public static ReservedViewTypes[] values()
    {
        return (ReservedViewTypes[])d.clone();
    }

    static 
    {
        a = new ReservedViewTypes("PREINFLATED", 0, 0xff000000);
        b = new ReservedViewTypes("PLACEHOLDER", 1, 0xff000001);
        d = (new ReservedViewTypes[] {
            a, b
        });
    }
}

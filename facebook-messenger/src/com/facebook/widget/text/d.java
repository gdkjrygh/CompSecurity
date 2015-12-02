// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.text;


public final class d extends Enum
{

    private static final d $VALUES[];
    public static final d BUILTIN;
    public static final d HELVETICA_NEUE;

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d fromIndex(int i)
    {
        return values()[i];
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/widget/text/d, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    static 
    {
        BUILTIN = new d("BUILTIN", 0);
        HELVETICA_NEUE = new d("HELVETICA_NEUE", 1);
        $VALUES = (new d[] {
            BUILTIN, HELVETICA_NEUE
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog;


public final class _cls9 extends Enum
{

    private static final OptionalCorrectable $VALUES[];
    public static final OptionalCorrectable Mandatory;
    public static final OptionalCorrectable MandatoryCorrectable;
    public static final OptionalCorrectable Optional;
    public static final OptionalCorrectable OptionalCorrectable;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/dominos/nina/dialog/DialogModelBuilder$SlotMode, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        Mandatory = new <init>("Mandatory", 0);
        MandatoryCorrectable = new <init>("MandatoryCorrectable", 1);
        Optional = new <init>("Optional", 2);
        OptionalCorrectable = new <init>("OptionalCorrectable", 3);
        $VALUES = (new .VALUES[] {
            Mandatory, MandatoryCorrectable, Optional, OptionalCorrectable
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}

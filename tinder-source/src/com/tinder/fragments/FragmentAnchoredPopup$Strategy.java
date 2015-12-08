// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;


// Referenced classes of package com.tinder.fragments:
//            FragmentAnchoredPopup

static final class _cls9 extends Enum
{

    public static final a a;
    private static final a b[];

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/tinder/fragments/FragmentAnchoredPopup$Strategy, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])b.clone();
    }

    static 
    {
        a = new <init>("GAMEPAD");
        b = (new b[] {
            a
        });
    }

    private _cls9(String s)
    {
        super(s, 0);
    }
}

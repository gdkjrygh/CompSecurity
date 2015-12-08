// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;


final class az
{

    static final int a[];

    static 
    {
        a = new int[KeyboardHandwritingPopup.CardsMode.values().length];
        try
        {
            a[KeyboardHandwritingPopup.CardsMode.INPUT_AND_BUTTONS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[KeyboardHandwritingPopup.CardsMode.FULL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

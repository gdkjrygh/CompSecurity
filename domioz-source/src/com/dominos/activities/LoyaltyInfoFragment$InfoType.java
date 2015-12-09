// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


public final class _cls9 extends Enum
{

    private static final INFO_SR $VALUES[];
    public static final INFO_SR ACTIVATE;
    public static final INFO_SR ACTIVATE_SR;
    public static final INFO_SR INFO;
    public static final INFO_SR INFO_SR;
    public static final INFO_SR REGISTER;
    public static final INFO_SR REGISTER_SR;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/dominos/activities/LoyaltyInfoFragment$InfoType, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        ACTIVATE = new <init>("ACTIVATE", 0);
        INFO = new <init>("INFO", 1);
        REGISTER = new <init>("REGISTER", 2);
        ACTIVATE_SR = new <init>("ACTIVATE_SR", 3);
        REGISTER_SR = new <init>("REGISTER_SR", 4);
        INFO_SR = new <init>("INFO_SR", 5);
        $VALUES = (new .VALUES[] {
            ACTIVATE, INFO, REGISTER, ACTIVATE_SR, REGISTER_SR, INFO_SR
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}

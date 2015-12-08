// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;


public class PromotionAction
{

    public static final int NO_ACTION_NEEDED = 999;
    public static final int REPRICE_ORDER = 1002;
    public static final int SELECT_PRODUCT = 1000;
    public static final int SHOW_DIALOG = 1001;
    private int action;
    private int dialogType;

    public PromotionAction()
    {
        action = -1;
        dialogType = -1;
    }

    public int getAction()
    {
        return action;
    }

    public int getDialogType()
    {
        return dialogType;
    }

    public PromotionAction setAction(int i)
    {
        action = i;
        return this;
    }

    public PromotionAction setDialogType(int i)
    {
        dialogType = i;
        return this;
    }
}

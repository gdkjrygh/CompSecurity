// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import me.lyft.android.ui.Dialogs;

public class Toast extends Dialogs
{

    private Integer icon;
    private String message;

    public Toast(String s)
    {
        message = s;
    }

    public Toast(String s, Integer integer)
    {
        message = s;
        icon = integer;
    }

    public Integer getIcon()
    {
        return icon;
    }

    public String getMessage()
    {
        return message;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.view;


public class _type
{

    public static final int DISABLE = 0;
    public static final int ENABLE = 1;
    public static final int NONE = -1;
    public static final int SCALE_BACK = 2;
    public static final int SCALE_RESTORE = 3;
    private int _type;

    public int getType()
    {
        return _type;
    }

    public void setType(int i)
    {
        _type = i;
    }

    public A(int i)
    {
        _type = -1;
        _type = i;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.event;


public class BackEvent
{

    private final boolean _modalPopped;

    public BackEvent(boolean flag)
    {
        _modalPopped = flag;
    }

    public boolean isModalPopped()
    {
        return _modalPopped;
    }
}

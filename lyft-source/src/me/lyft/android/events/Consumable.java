// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.events;


public class Consumable
{

    private boolean isConsumed;

    public Consumable()
    {
        isConsumed = false;
    }

    public final boolean consume()
    {
        boolean flag = isConsumed;
        isConsumed = true;
        return flag;
    }
}

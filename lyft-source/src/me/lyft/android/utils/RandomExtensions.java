// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import java.util.Random;

public class RandomExtensions
{

    public RandomExtensions()
    {
    }

    public static int generateRandom(int i)
    {
        Random random = new Random();
        double d = i;
        return (int)(random.nextDouble() * d);
    }
}

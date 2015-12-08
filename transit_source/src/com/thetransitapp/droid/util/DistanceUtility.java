// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.util;


public class DistanceUtility
{

    public DistanceUtility()
    {
    }

    public static String getDistanceString(double d, boolean flag)
    {
        if (flag)
        {
            d *= 3.2808399000000001D;
            if (d > 528D)
            {
                return (new StringBuilder(String.valueOf(""))).append((double)Math.round(d / 528D) / 10D).append(" mi").toString();
            } else
            {
                return (new StringBuilder(String.valueOf(""))).append(Math.round(d)).append(" ft").toString();
            }
        }
        if (d > 500D)
        {
            return (new StringBuilder(String.valueOf(""))).append((double)Math.round(d / 100D) / 10D).append(" km").toString();
        } else
        {
            return (new StringBuilder(String.valueOf(""))).append(Math.round(d)).append(" m").toString();
        }
    }
}

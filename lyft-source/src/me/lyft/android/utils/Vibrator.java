// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import me.lyft.android.common.Iterables;

public class Vibrator
{

    private final android.os.Vibrator vibrator;

    public Vibrator(Context context)
    {
        vibrator = (android.os.Vibrator)context.getSystemService("vibrator");
    }

    private long[] convertToLongArray(List list)
    {
        long al[] = new long[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            al[i] = ((Long)list.get(i)).longValue();
        }

        return al;
    }

    private List getPatternWithDelay(long l, Long along[])
    {
        ArrayList arraylist = new ArrayList();
        int j = along.length;
        for (int i = 0; i < j; i++)
        {
            Long long1 = along[i];
            arraylist.add(Long.valueOf(l));
            arraylist.add(long1);
        }

        return arraylist;
    }

    public transient void vibrate(int i, long l, Long along[])
    {
        along = convertToLongArray(Iterables.repeat(getPatternWithDelay(l, along), i));
        vibrator.vibrate(along, -1);
    }
}

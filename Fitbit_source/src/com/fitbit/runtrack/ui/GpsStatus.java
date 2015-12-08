// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.location.Location;

public final class GpsStatus extends Enum
{

    public static final GpsStatus a;
    public static final GpsStatus b;
    public static final GpsStatus c;
    public static final GpsStatus d;
    public static final GpsStatus e;
    private static final GpsStatus f[];
    final float accuracy;

    private GpsStatus(String s, int i, float f1)
    {
        super(s, i);
        accuracy = f1;
    }

    public static GpsStatus a(Location location)
    {
        if (location.hasAccuracy())
        {
            GpsStatus agpsstatus[] = values();
            int j = agpsstatus.length;
            for (int i = 0; i < j; i++)
            {
                GpsStatus gpsstatus = agpsstatus[i];
                if (location.getAccuracy() <= gpsstatus.accuracy)
                {
                    return gpsstatus;
                }
            }

        }
        return e;
    }

    public static GpsStatus valueOf(String s)
    {
        return (GpsStatus)Enum.valueOf(com/fitbit/runtrack/ui/GpsStatus, s);
    }

    public static GpsStatus[] values()
    {
        return (GpsStatus[])f.clone();
    }

    public Drawable a(Context context)
    {
        if (this != e)
        {
            context = context.getResources().getDrawable(0x7f02021d);
            context.setLevel((int)accuracy);
            return context;
        } else
        {
            return null;
        }
    }

    static 
    {
        a = new GpsStatus("Good", 0, 10F);
        b = new GpsStatus("Medium", 1, 50F);
        c = new GpsStatus("NotGreat", 2, 100F);
        d = new GpsStatus("Terrible", 3, 125F);
        e = new GpsStatus("NonExistant", 4, 3.402823E+38F);
        f = (new GpsStatus[] {
            a, b, c, d, e
        });
    }
}

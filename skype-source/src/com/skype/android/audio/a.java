// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.audio;

import android.media.AudioManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.EnumSet;

final class a extends Enum
{

    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    public static final a o;
    public static final a p;
    private static final a r[];
    private int q;

    private a(String s, int i1, int j1)
    {
        super(s, i1);
        q = j1;
    }

    static EnumSet a(AudioManager audiomanager)
        throws NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException
    {
        EnumSet enumset = EnumSet.noneOf(com/skype/android/audio/a);
        audiomanager = (Integer)audiomanager.getClass().getMethod("getDevicesForStream", new Class[] {
            Integer.TYPE
        }).invoke(audiomanager, new Object[] {
            Integer.valueOf(0)
        });
        a aa[] = values();
        int j1 = aa.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            a a1 = aa[i1];
            if ((a1.q & audiomanager.intValue()) != 0)
            {
                enumset.add(a1);
            }
        }

        return enumset;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/skype/android/audio/a, s);
    }

    public static a[] values()
    {
        return (a[])r.clone();
    }

    static 
    {
        a = new a("DEVICE_OUT_EARPIECE", 0, 1);
        b = new a("DEVICE_OUT_SPEAKER", 1, 2);
        c = new a("DEVICE_OUT_WIRED_HEADSET", 2, 4);
        d = new a("DEVICE_OUT_WIRED_HEADPHONE", 3, 8);
        e = new a("DEVICE_OUT_BLUETOOTH_SCO", 4, 16);
        f = new a("DEVICE_OUT_BLUETOOTH_SCO_HEADSET", 5, 32);
        g = new a("DEVICE_OUT_BLUETOOTH_SCO_CARKIT", 6, 64);
        h = new a("DEVICE_OUT_BLUETOOTH_A2DP", 7, 128);
        i = new a("DEVICE_OUT_BLUETOOTH_A2DP_HEADPHONES", 8, 256);
        j = new a("DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER", 9, 512);
        k = new a("DEVICE_OUT_AUX_DIGITAL", 10, 1024);
        l = new a("DEVICE_OUT_ANLG_DOCK_HEADSET", 11, 2048);
        m = new a("DEVICE_OUT_DGTL_DOCK_HEADSET", 12, 4096);
        n = new a("DEVICE_OUT_USB_ACCESSORY", 13, 8192);
        o = new a("DEVICE_OUT_USB_DEVICE", 14, 16384);
        p = new a("DEVICE_OUT_REMOTE_SUBMIX", 15, 32768);
        r = (new a[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p
        });
    }
}

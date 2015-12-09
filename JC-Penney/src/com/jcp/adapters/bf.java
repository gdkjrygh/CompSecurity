// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.gms.maps.c;
import java.util.List;

public class bf
{

    private static List d;
    private final View a;
    private Fragment b;
    private c c;

    public bf(Activity activity, Fragment fragment, c c1, List list)
    {
        a = activity.getLayoutInflater().inflate(0x7f030095, null);
        b = fragment;
        c = c1;
        d = list;
    }

    public static void a(List list)
    {
        d = list;
    }
}

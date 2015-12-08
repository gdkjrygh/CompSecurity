// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.os.Environment;

public class f
{

    public static int a = 255;
    public static int b = 400;
    public static final String c;
    public static final String d;
    public static final android.graphics.Bitmap.Config e;

    public f()
    {
    }

    static 
    {
        c = (new StringBuilder()).append("resources//").append(Environment.DIRECTORY_DOWNLOADS).toString();
        d = (new StringBuilder()).append("resources//").append(Environment.DIRECTORY_PICTURES).toString();
        e = android.graphics.Bitmap.Config.ARGB_8888;
    }
}

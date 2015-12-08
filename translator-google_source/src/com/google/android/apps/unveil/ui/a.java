// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.ui;


final class a
{

    static final int a[];

    static 
    {
        a = new int[CameraWrappingLayout.Alignment.values().length];
        try
        {
            a[CameraWrappingLayout.Alignment.TOP.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[CameraWrappingLayout.Alignment.BOTTOM.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[CameraWrappingLayout.Alignment.CENTER.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

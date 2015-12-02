// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;


class Policy
{

    static final int a[];

    static 
    {
        a = new int[com.facebook.video.abtest.brPolicy.values().length];
        try
        {
            a[com.facebook.video.abtest.brPolicy.CUSTOM_ABR.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.facebook.video.abtest.brPolicy.RANDOM_ABR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

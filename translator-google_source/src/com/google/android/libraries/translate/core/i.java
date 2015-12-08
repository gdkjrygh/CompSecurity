// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;


final class i
{

    static final int a[];

    static 
    {
        a = new int[Singleton.TranslateClientId.values().length];
        try
        {
            a[Singleton.TranslateClientId.GLASS_SPEECH_ANDROID_TRANSLATE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[Singleton.TranslateClientId.PHONE_ANDROID_TRANSLATE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[Singleton.TranslateClientId.WEARABLE_ANDROID_TRANSLATE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

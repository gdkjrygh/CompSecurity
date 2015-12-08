// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;


final class ay
{

    static final int a[];

    static 
    {
        a = new int[VoiceLangButton.State.values().length];
        try
        {
            a[VoiceLangButton.State.DEFAULT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[VoiceLangButton.State.SOURCE_LANGUAGE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[VoiceLangButton.State.TARGET_LANGUAGE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

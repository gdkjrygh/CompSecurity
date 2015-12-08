// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.settings;

import rx.Observable;

public interface ISettingsService
{

    public abstract Observable requestVerificationCode(String s);

    public abstract Observable updateEmail(String s);

    public abstract Observable verifyPhone(String s, String s1);
}

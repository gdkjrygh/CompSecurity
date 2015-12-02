// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;


public interface p
{

    public abstract void beginShowingProgress();

    public abstract void setSmsCode(String s, boolean flag);

    public abstract void setSmsCodePrompt(String s);

    public abstract void setSmsCodePromptResource(int i);

    public abstract void showSmsCodeError();

    public abstract void stopShowingProgress();
}

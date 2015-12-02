// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;


public interface d
{

    public abstract void beginShowingProgress();

    public abstract void hideFirstNameError();

    public abstract void hideLastNameError();

    public abstract void setNamePrompt(String s);

    public abstract void setNamePromptResource(int i);

    public abstract void showFirstNameError();

    public abstract void showLastNameError();

    public abstract void stopShowingProgress();
}

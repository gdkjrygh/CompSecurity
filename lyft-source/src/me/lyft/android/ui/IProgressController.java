// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;


public interface IProgressController
{

    public abstract void disableUI();

    public abstract void enableUI();

    public abstract void enableUI(boolean flag);

    public abstract void hideProgress();

    public abstract boolean isUIEnabled();

    public abstract void showProgress();

    public abstract void showProgress(String s);
}

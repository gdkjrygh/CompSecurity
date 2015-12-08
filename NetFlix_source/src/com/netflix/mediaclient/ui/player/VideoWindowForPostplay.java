// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;


public interface VideoWindowForPostplay
{

    public abstract void animateIn();

    public abstract void animateOut(Runnable runnable);

    public abstract boolean canVideoVindowResize();

    public abstract void setVisible(boolean flag);
}

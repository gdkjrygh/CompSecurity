// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content_public.browser;


public interface NavigationTransitionDelegate
{

    public abstract void addEnteringStylesheetToTransition(String s);

    public abstract void didDeferAfterResponseStarted(String s, String s1, String s2);

    public abstract void didStartNavigationTransitionForFrame(long l);

    public abstract boolean willHandleDeferAfterResponseStarted();
}

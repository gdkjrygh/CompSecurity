// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;


public interface PositionObserver
{
    public static interface Listener
    {

        public abstract void onPositionChanged(int i, int j);
    }


    public abstract void addListener(Listener listener);

    public abstract void clearListener();

    public abstract int getPositionX();

    public abstract int getPositionY();

    public abstract void removeListener(Listener listener);
}

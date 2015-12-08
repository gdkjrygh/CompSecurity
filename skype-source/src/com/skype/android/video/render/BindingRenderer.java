// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.render;


public interface BindingRenderer
{
    public static interface Callback
    {

        public abstract void onBindingCreated(long l);

        public abstract void onBindingFailed();

        public abstract void onBindingReleased();

        public abstract void onSizeChanged(int i, int j);
    }


    public abstract void dispose();

    public abstract long getNativeBindingEvent();

    public abstract int getNativeBindingType();

    public abstract void registerView(Object obj);

    public abstract void setTargetResolution(int i, int j);

    public abstract void unregisterView(Object obj);
}

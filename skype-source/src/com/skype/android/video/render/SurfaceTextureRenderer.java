// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.render;


public interface SurfaceTextureRenderer
{

    public abstract void attach(int i, int j);

    public abstract void detach();

    public abstract void initialize(int i, int j);

    public abstract void release();

    public abstract void render();
}

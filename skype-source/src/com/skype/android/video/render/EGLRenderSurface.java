// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.render;

import android.graphics.SurfaceTexture;

interface EGLRenderSurface
{

    public abstract void create(SurfaceTexture surfacetexture);

    public abstract void destroy(boolean flag);

    public abstract void makeCurrent(boolean flag);

    public abstract void swapBuffers();
}

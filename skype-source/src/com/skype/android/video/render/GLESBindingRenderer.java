// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.render;


// Referenced classes of package com.skype.android.video.render:
//            BindingRenderer

public final class GLESBindingRenderer
    implements BindingRenderer
{

    private long nativePtr;

    public GLESBindingRenderer(BindingRenderer.Callback callback)
    {
        nativeInit(callback);
    }

    private native void nativeInit(BindingRenderer.Callback callback);

    public final synchronized native void dispose();

    public final native long getNativeBindingEvent();

    public final native int getNativeBindingType();

    public final synchronized native void registerView(Object obj);

    public final synchronized native void setTargetResolution(int i, int j);

    public final synchronized native void unregisterView(Object obj);
}

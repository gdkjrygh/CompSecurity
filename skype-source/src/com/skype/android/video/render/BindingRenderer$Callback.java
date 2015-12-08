// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.render;


// Referenced classes of package com.skype.android.video.render:
//            BindingRenderer

public static interface 
{

    public abstract void onBindingCreated(long l);

    public abstract void onBindingFailed();

    public abstract void onBindingReleased();

    public abstract void onSizeChanged(int i, int j);
}

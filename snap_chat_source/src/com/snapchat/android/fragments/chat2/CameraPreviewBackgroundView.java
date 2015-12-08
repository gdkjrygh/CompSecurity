// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat2;

import Vk;
import Vu;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class CameraPreviewBackgroundView extends FrameLayout
{

    public static final Vk a = new Vk();
    public static final Vu b = new Vu();
    private static CameraPreviewBackgroundView d;
    public View c;

    public CameraPreviewBackgroundView(Context context)
    {
        super(context);
        a(context);
    }

    public CameraPreviewBackgroundView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    public CameraPreviewBackgroundView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context);
    }

    public static CameraPreviewBackgroundView a()
    {
        return d;
    }

    private void a(Context context)
    {
        d = this;
        c = b.a(context);
        addView(c);
    }

    public static void setCameraInfo(android.hardware.Camera.CameraInfo camerainfo)
    {
        a.c = camerainfo;
        b.a();
    }

    public static void setCameraPreviewSize(int i, int j)
    {
        a.a = i;
        a.b = j;
        b.a();
    }

}

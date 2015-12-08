// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.lenses;

import android.content.Context;
import android.view.TextureView;
import qF;
import qZ;

public class LensesGlTextureView extends TextureView
{

    public final qZ a = qZ.e();

    public LensesGlTextureView(Context context)
    {
        super(context);
        setSurfaceTextureListener(a);
    }

    public void setSurfaceReadyCallback(qF qf)
    {
        a.h = qf;
    }
}

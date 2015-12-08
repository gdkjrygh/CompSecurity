// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

public abstract class CanvasViewBase extends View
{

    public CanvasViewBase(Context context)
    {
        super(context);
    }

    public abstract void a();

    public abstract void a(int i);

    public abstract void b();

    public abstract int c();

    public abstract boolean d();

    public abstract int e();

    public abstract boolean f();

    public abstract ArrayList g();

    public abstract void setColor(int i);

    public abstract void setDrawingEnabled(boolean flag);
}

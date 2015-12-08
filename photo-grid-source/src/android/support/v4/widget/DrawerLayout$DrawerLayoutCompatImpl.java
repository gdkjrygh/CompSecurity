// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

interface 
{

    public abstract void applyMarginInsets(android.view.utCompatImpl utcompatimpl, Object obj, int i);

    public abstract void configureApplyInsets(View view);

    public abstract void dispatchChildInsets(View view, Object obj, int i);

    public abstract Drawable getDefaultStatusBarBackground(Context context);

    public abstract int getTopInset(Object obj);
}

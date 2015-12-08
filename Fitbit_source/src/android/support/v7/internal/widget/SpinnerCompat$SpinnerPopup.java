// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            SpinnerCompat

private static interface 
{

    public abstract void dismiss();

    public abstract Drawable getBackground();

    public abstract CharSequence getHintText();

    public abstract int getHorizontalOffset();

    public abstract int getVerticalOffset();

    public abstract boolean isShowing();

    public abstract void setAdapter(ListAdapter listadapter);

    public abstract void setBackgroundDrawable(Drawable drawable);

    public abstract void setHorizontalOffset(int i);

    public abstract void setPromptText(CharSequence charsequence);

    public abstract void setVerticalOffset(int i);

    public abstract void show();
}

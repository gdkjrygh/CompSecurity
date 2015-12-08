// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;

// Referenced classes of package android.support.v7.widget:
//            CardViewDelegate

public interface CardViewImpl
{

    public abstract float getMaxElevation(CardViewDelegate cardviewdelegate);

    public abstract float getMinHeight(CardViewDelegate cardviewdelegate);

    public abstract float getMinWidth(CardViewDelegate cardviewdelegate);

    public abstract float getRadius(CardViewDelegate cardviewdelegate);

    public abstract void initStatic();

    public abstract void initialize(CardViewDelegate cardviewdelegate, Context context, int i, float f, float f1, float f2);

    public abstract void setBackgroundColor(CardViewDelegate cardviewdelegate, int i);
}

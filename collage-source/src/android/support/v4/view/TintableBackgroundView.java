// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.res.ColorStateList;

public interface TintableBackgroundView
{

    public abstract ColorStateList getSupportBackgroundTintList();

    public abstract android.graphics.PorterDuff.Mode getSupportBackgroundTintMode();

    public abstract void setSupportBackgroundTintList(ColorStateList colorstatelist);

    public abstract void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode);
}

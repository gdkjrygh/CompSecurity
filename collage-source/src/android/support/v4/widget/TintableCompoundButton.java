// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.res.ColorStateList;

public interface TintableCompoundButton
{

    public abstract ColorStateList getSupportButtonTintList();

    public abstract android.graphics.PorterDuff.Mode getSupportButtonTintMode();

    public abstract void setSupportButtonTintList(ColorStateList colorstatelist);

    public abstract void setSupportButtonTintMode(android.graphics.PorterDuff.Mode mode);
}

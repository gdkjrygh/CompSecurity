// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.text;

import android.graphics.Typeface;

public interface TypeFaceFactory
{

    public abstract Typeface getBold(float f);

    public abstract Typeface getDefault(float f);

    public abstract Typeface getIllustrationFont();

    public abstract Typeface getSemiLight();

    public abstract Typeface getSymbolFont();
}

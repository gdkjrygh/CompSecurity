// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.cardview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public interface CardViewGroupDelegate
{

    public abstract void initialize(View view, Context context, AttributeSet attributeset, int i);

    public abstract void setBackgroundColor(View view, int i);

    public abstract void setBackgroundResource(View view, int i);
}

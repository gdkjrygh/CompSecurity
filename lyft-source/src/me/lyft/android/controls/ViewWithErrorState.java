// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.widget.TextView;

public interface ViewWithErrorState
{

    public abstract boolean hasValidationError();

    public abstract void setValidationErrorId(Integer integer);

    public abstract void setValidationMessageView(TextView textview);

    public abstract void showValidationMessage();
}

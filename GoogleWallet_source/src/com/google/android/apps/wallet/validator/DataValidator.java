// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.validator;

import android.content.res.Resources;

public interface DataValidator
{

    public abstract boolean isValid(Object obj, Resources resources);

    public abstract String validate(Object obj, Resources resources);
}

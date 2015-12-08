// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.sms;

import android.content.Context;
import rx.Observable;

public interface IVerificationAutoFillService
{

    public abstract Observable observeCode(Context context);
}

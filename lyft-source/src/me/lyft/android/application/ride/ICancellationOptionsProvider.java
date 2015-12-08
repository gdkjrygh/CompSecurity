// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import java.util.List;
import rx.Observable;

public interface ICancellationOptionsProvider
{

    public abstract List getCancellationOptions();

    public abstract Observable observeCancellationOptionChange();

    public abstract void updateCancellationOptions(List list);
}

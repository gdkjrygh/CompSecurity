// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import rx.Observable;

public interface 
    extends me.lyft.android.ui.RideStepView
{

    public abstract Observable observeBottomContainerHeight();

    public abstract Observable observeTopContainerHeight();
}

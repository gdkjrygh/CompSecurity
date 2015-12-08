// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import java.util.List;
import rx.Observable;

public interface ISplitFareProvider
{

    public abstract void incrementSplitFareCount(List list);

    public abstract Observable observeTopSplitFareContacts();
}

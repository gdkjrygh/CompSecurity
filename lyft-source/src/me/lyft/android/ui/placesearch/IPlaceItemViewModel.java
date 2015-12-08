// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import rx.Observer;

public interface IPlaceItemViewModel
{

    public abstract int getIconResourceId();

    public abstract me.lyft.android.domain.location.Location.PlaceType getPlaceTypeForAnalytics();

    public abstract String getSubtitle();

    public abstract String getTitle();

    public abstract boolean isEditVisible();

    public abstract void onEdit();

    public abstract void onSelected();

    public abstract void setSelectionObserver(Observer observer);
}

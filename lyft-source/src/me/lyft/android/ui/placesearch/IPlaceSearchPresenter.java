// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import rx.Observable;

public interface IPlaceSearchPresenter
{

    public abstract Observable loadAutocompleteSuggestions(String s);

    public abstract Observable loadCityAutocompleteSuggestions(String s);

    public abstract Observable observeDriverDropoffPlacesSuggestions();

    public abstract Observable observePickupPlacesSuggestions();

    public abstract Observable observeShortcutSuggestions();

    public abstract Observable observeUserDropoffPlacesSuggestions();
}

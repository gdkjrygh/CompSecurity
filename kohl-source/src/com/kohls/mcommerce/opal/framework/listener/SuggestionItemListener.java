// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.listener;

import android.location.Address;
import java.util.List;

public interface SuggestionItemListener
{

    public abstract boolean hideSuggestionItems(boolean flag);

    public abstract void onSuggestClick(Address address);

    public abstract void showSuggestionItems(List list, boolean flag);
}

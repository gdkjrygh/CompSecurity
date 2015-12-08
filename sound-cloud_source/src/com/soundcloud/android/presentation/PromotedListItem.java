// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import com.soundcloud.android.stream.StreamItem;
import com.soundcloud.java.optional.Optional;
import java.util.List;

public interface PromotedListItem
    extends StreamItem
{

    public abstract String getAdUrn();

    public abstract List getClickUrls();

    public abstract List getImpressionUrls();

    public abstract List getPlayUrls();

    public abstract List getPromoterClickUrls();

    public abstract Optional getPromoterName();

    public abstract Optional getPromoterUrn();

    public abstract boolean hasPromoter();
}

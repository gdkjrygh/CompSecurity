// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;

import com.adobe.mediacore.MediaResource;
import com.adobe.mediacore.utils.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.adobe.mediacore.timeline.advertising:
//            AdAsset, AdClick, ContentTracker

public final class Ad
{

    private final List _companionAssets;
    private final ContentTracker _contentTracker;
    private final long _duration;
    private final int _id;
    private final boolean _isCustomAdMarker;
    private final AdAsset _primaryAsset;
    private final com.adobe.mediacore.MediaResource.Type _type;

    private Ad(int i, com.adobe.mediacore.MediaResource.Type type, ContentTracker contenttracker, long l, boolean flag, AdAsset adasset, 
            List list)
    {
        _id = i;
        _type = type;
        _contentTracker = contenttracker;
        _duration = l;
        _isCustomAdMarker = flag;
        _primaryAsset = adasset;
        _companionAssets = list;
    }

    public static Ad cloneAd(Ad ad, long l, int i)
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = ad.getCompanionAssets().iterator(); iterator.hasNext(); arraylist.add(AdAsset.newInstance((AdAsset)iterator.next()))) { }
        return new Ad(i, ad.getType(), ad.getContentTracker(), l, ad.isCustomAdMarker(), AdAsset.newInstance(ad.getPrimaryAsset()), arraylist);
    }

    public static Ad createAd(com.adobe.mediacore.MediaResource.Type type, long l, int i, AdAsset adasset, List list, ContentTracker contenttracker)
    {
        return new Ad(i, type, contenttracker, l, false, adasset, list);
    }

    public static Ad createCustomAdMarker(com.adobe.mediacore.MediaResource.Type type, long l, int i, AdAsset adasset)
    {
        return new Ad(i, type, null, l, true, adasset, new ArrayList());
    }

    public boolean equals(Ad ad)
    {
        return ad != null && _id == ad.getId() && _primaryAsset.getId() == ad.getPrimaryAsset().getId() && super.equals(ad);
    }

    public final List getCompanionAssets()
    {
        return _companionAssets;
    }

    public ContentTracker getContentTracker()
    {
        return _contentTracker;
    }

    public final long getDuration()
    {
        return _duration;
    }

    public int getId()
    {
        return _id;
    }

    public final AdAsset getPrimaryAsset()
    {
        return _primaryAsset;
    }

    public final com.adobe.mediacore.MediaResource.Type getType()
    {
        return _type;
    }

    public boolean isClickable()
    {
        return _primaryAsset != null && _primaryAsset.getAdClick() != null && !StringUtils.isEmpty(_primaryAsset.getAdClick().getUrl());
    }

    public boolean isCustomAdMarker()
    {
        return _isCustomAdMarker;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getSimpleName()).append(" Object {");
        stringbuilder.append(" resource=").append(getPrimaryAsset().getMediaResource().toString());
        stringbuilder.append(" ,duration=").append(getDuration());
        stringbuilder.append(" ,id=").append(_id);
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}

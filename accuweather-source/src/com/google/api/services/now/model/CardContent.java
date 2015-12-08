// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;
import java.util.List;

// Referenced classes of package com.google.api.services.now.model:
//            BarcodeCard, GenericCard, TemplatedString, ListCard, 
//            MapCard, PhotoCard, TableCard, VideoCard

public final class CardContent extends GenericJson
{

    private BarcodeCard barcodeCard;
    private GenericCard genericCard;
    private TemplatedString justification;
    private ListCard listCard;
    private List locales;
    private MapCard mapCard;
    private PhotoCard photoCard;
    private TableCard tableCard;
    private VideoCard videoCard;

    public CardContent()
    {
    }

    public volatile GenericJson clone()
    {
        return clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public CardContent clone()
    {
        return (CardContent)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public BarcodeCard getBarcodeCard()
    {
        return barcodeCard;
    }

    public GenericCard getGenericCard()
    {
        return genericCard;
    }

    public TemplatedString getJustification()
    {
        return justification;
    }

    public ListCard getListCard()
    {
        return listCard;
    }

    public List getLocales()
    {
        return locales;
    }

    public MapCard getMapCard()
    {
        return mapCard;
    }

    public PhotoCard getPhotoCard()
    {
        return photoCard;
    }

    public TableCard getTableCard()
    {
        return tableCard;
    }

    public VideoCard getVideoCard()
    {
        return videoCard;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public CardContent set(String s, Object obj)
    {
        return (CardContent)super.set(s, obj);
    }

    public CardContent setBarcodeCard(BarcodeCard barcodecard)
    {
        barcodeCard = barcodecard;
        return this;
    }

    public CardContent setGenericCard(GenericCard genericcard)
    {
        genericCard = genericcard;
        return this;
    }

    public CardContent setJustification(TemplatedString templatedstring)
    {
        justification = templatedstring;
        return this;
    }

    public CardContent setListCard(ListCard listcard)
    {
        listCard = listcard;
        return this;
    }

    public CardContent setLocales(List list)
    {
        locales = list;
        return this;
    }

    public CardContent setMapCard(MapCard mapcard)
    {
        mapCard = mapcard;
        return this;
    }

    public CardContent setPhotoCard(PhotoCard photocard)
    {
        photoCard = photocard;
        return this;
    }

    public CardContent setTableCard(TableCard tablecard)
    {
        tableCard = tablecard;
        return this;
    }

    public CardContent setVideoCard(VideoCard videocard)
    {
        videoCard = videocard;
        return this;
    }
}

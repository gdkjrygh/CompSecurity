// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.api.models.NbcDate;
import com.orm.SugarRecord;

public class FavoriteItem extends SugarRecord
{

    String assetId;
    private String createdDate;
    String favoriteData;

    public FavoriteItem()
    {
    }

    private static Asset deserializeFavorite(String s)
    {
        return (Asset)(new Gson()).fromJson(s, com/nbcsports/liveextra/library/api/models/Asset);
    }

    private static String serializeFavorite(Asset asset)
    {
        return (new GsonBuilder()).registerTypeAdapter(com/nbcsports/liveextra/library/api/models/NbcDate, new com.nbcsports.liveextra.library.api.models.NbcDate.TypeAdapter()).excludeFieldsWithoutExposeAnnotation().create().toJson(asset);
    }

    public Asset getAsset()
    {
        return deserializeFavorite(favoriteData);
    }

    public void setAsset(Asset asset)
    {
        favoriteData = serializeFavorite(asset);
    }

    public void setAssetId(String s)
    {
        assetId = s;
    }

    public void setCreatedDate(String s)
    {
        createdDate = s;
    }
}

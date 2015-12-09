// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import com.dominos.android.sdk.core.models.json.UpsellDataDeserializer;
import com.google.b.k;
import com.google.b.r;
import java.util.List;

public class LabsUpsellData
{

    private List upsellList;

    public LabsUpsellData(List list)
    {
        upsellList = list;
    }

    public static LabsUpsellData from(String s)
    {
        return (LabsUpsellData)(new r()).a(com/dominos/android/sdk/core/models/LabsUpsellData, new UpsellDataDeserializer()).f().a(s, com/dominos/android/sdk/core/models/LabsUpsellData);
    }

    public List getUpsellList()
    {
        return upsellList;
    }
}

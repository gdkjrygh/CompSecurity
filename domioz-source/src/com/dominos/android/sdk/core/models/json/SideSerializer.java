// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.core.models.LabsSide;
import com.google.b.ad;
import com.google.b.ae;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;

public class SideSerializer
    implements ae
{

    public SideSerializer()
    {
    }

    public w serialize(LabsSide labsside, Type type, ad ad)
    {
        if (labsside.getQuantityForPart("1/1") == (double)labsside.getDefaultQuantity())
        {
            return null;
        } else
        {
            type = new z();
            ad = new z();
            ad.a("1/1", Double.valueOf(labsside.getQuantityForPart("1/1")));
            type.a(labsside.getCode(), ad);
            return type;
        }
    }

    public volatile w serialize(Object obj, Type type, ad ad)
    {
        return serialize((LabsSide)obj, type, ad);
    }
}

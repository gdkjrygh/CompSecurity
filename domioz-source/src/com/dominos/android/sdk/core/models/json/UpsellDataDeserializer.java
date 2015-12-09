// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.core.models.LabsUpsellData;
import com.google.b.t;
import com.google.b.u;
import com.google.b.v;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class UpsellDataDeserializer
    implements v
{

    public UpsellDataDeserializer()
    {
    }

    public LabsUpsellData deserialize(w w1, Type type, u u)
    {
        type = new ArrayList();
        w1 = (z)w1;
        if (w1.a("products") && (w1.b("products") instanceof t))
        {
            w1 = w1.c("products");
            for (int i = 0; i < w1.a(); i++)
            {
                u = w1.a(i).h();
                ArrayList arraylist = new ArrayList();
                if (u.a("excludedBy") && (u.b("excludedBy") instanceof t))
                {
                    t t1 = u.c("excludedBy");
                    for (int j = 0; j < t1.a(); j++)
                    {
                        arraylist.add(t1.a(j).c());
                    }

                }
                if (u.a("code"))
                {
                    com.dominos.android.sdk.core.models.LabsUpsellData.UpsellEntry upsellentry = new com.dominos.android.sdk.core.models.LabsUpsellData.UpsellEntry();
                    upsellentry.upsellCode = u.b("code").c();
                    upsellentry.excludedByList = arraylist;
                    type.add(upsellentry);
                }
            }

        }
        return new LabsUpsellData(type);
    }

    public volatile Object deserialize(w w1, Type type, u u)
    {
        return deserialize(w1, type, u);
    }
}

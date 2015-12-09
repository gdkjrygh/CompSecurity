// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.core.models.LabsPromotion;
import com.google.b.t;
import com.google.b.u;
import com.google.b.v;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.dominos.android.sdk.core.models.json:
//            PromotionRedeemableDeserializer, PromotionValidDeserializer

public class PromotionDeserializer
    implements v
{

    public PromotionDeserializer()
    {
    }

    private void deserializeRedeemable(LabsPromotion labspromotion, z z1, u u)
    {
        if (z1.a("Redeemable") && (z1.b("Redeemable") instanceof t))
        {
            ArrayList arraylist = new ArrayList();
            z1 = z1.c("Redeemable");
            for (int i = 0; i < z1.a(); i++)
            {
                com.dominos.android.sdk.core.models.LabsPromotionRedeemable labspromotionredeemable = (new PromotionRedeemableDeserializer()).deserialize(z1.a(i).h(), null, u);
                if (labspromotionredeemable != null)
                {
                    arraylist.add(labspromotionredeemable);
                }
            }

            labspromotion.setRedeemable(arraylist);
        }
    }

    private void deserializeValid(LabsPromotion labspromotion, z z1, u u)
    {
        if (z1.a("Valid") && (z1.b("Valid") instanceof t))
        {
            ArrayList arraylist = new ArrayList();
            z1 = z1.c("Valid");
            for (int i = 0; i < z1.a(); i++)
            {
                com.dominos.android.sdk.core.models.LabsPromotionValid labspromotionvalid = (new PromotionValidDeserializer()).deserialize(z1.a(i).h(), null, u);
                if (labspromotionvalid != null)
                {
                    arraylist.add(labspromotionvalid);
                }
            }

            labspromotion.setValid(arraylist);
        }
    }

    public LabsPromotion deserialize(w w1, Type type, u u)
    {
        type = new LabsPromotion();
        w1 = (z)w1;
        deserializeRedeemable(type, w1, u);
        deserializeValid(type, w1, u);
        return type;
    }

    public volatile Object deserialize(w w1, Type type, u u)
    {
        return deserialize(w1, type, u);
    }
}

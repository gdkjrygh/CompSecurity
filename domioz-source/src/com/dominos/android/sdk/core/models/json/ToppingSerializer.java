// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsTopping;
import com.google.b.ad;
import com.google.b.ae;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Set;
import org.a.a.a.l;

public class ToppingSerializer
    implements ae
{

    public ToppingSerializer()
    {
    }

    public w serialize(LabsTopping labstopping, Type type, ad ad)
    {
        z z1;
        z z2;
        Iterator iterator;
        z1 = new z();
        z2 = new z();
        iterator = labstopping.getOptionKeyList().iterator();
_L8:
        double d;
        double d1;
        String s;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_383;
        }
        s = (String)iterator.next();
        if (StringHelper.equals(s, "1/1"))
        {
            if (labstopping.getQuantityForPart(s) == labstopping.getDefaultQuantity() && StringHelper.equals(labstopping.getPartWithQuantity(), "1/1"))
            {
                return null;
            }
            if (StringHelper.equals(labstopping.getPartWithQuantity(), "1/1"))
            {
                z1.a(labstopping.getCode(), Double.valueOf(labstopping.getQuantityForPart(s)));
                return z1;
            }
            continue; /* Loop/switch isn't completed */
        }
        d = labstopping.getDefaultQuantity();
        d1 = labstopping.getQuantityForPart(s);
        if (d <= 0.0D || d1 != d || l.a("C", labstopping.getCode())) goto _L2; else goto _L1
_L1:
        if (StringHelper.equals(s, "2/2"))
        {
            type = "1/2";
        } else
        {
            type = "2/2";
        }
        labstopping.setQuantityForPart(type, 0.0D);
_L6:
        z2.a(s, Double.valueOf(labstopping.getQuantityForPart(s)));
_L4:
        z1.a(labstopping.getCode(), z2);
        continue; /* Loop/switch isn't completed */
_L2:
        if (labstopping.getDefaultQuantity() <= 0.0D || d1 == d || d1 == 0.0D)
        {
            break; /* Loop/switch isn't completed */
        }
        if (StringHelper.equals(s, "1/2"))
        {
            ad = "2/2";
        } else
        {
            ad = "1/2";
        }
        if (labstopping.getQuantityForPart(s) == 1.0D)
        {
            type = "1";
        } else
        if (labstopping.getQuantityForPart(s) == 2D)
        {
            type = "2";
        } else
        if (labstopping.getQuantityForPart(s) == 3D)
        {
            type = "3";
        } else
        {
            type = (new StringBuilder()).append(labstopping.getQuantityForPart(s)).toString();
        }
        z2.a(s, type);
        z2.a(s, Double.valueOf(labstopping.getQuantityForPart(s)));
        if (!l.a("C", labstopping.getCode()))
        {
            z2.a(ad, "0");
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        return z1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public volatile w serialize(Object obj, Type type, ad ad)
    {
        return serialize((LabsTopping)obj, type, ad);
    }
}

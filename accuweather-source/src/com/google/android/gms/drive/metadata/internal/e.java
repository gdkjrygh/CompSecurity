// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.ir;
import com.google.android.gms.internal.it;
import com.google.android.gms.internal.iv;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class e
{

    private static Map JO = new HashMap();

    public static MetadataField aN(String s)
    {
        return (MetadataField)JO.get(s);
    }

    private static void b(MetadataField metadatafield)
    {
        if (JO.containsKey(metadatafield.getName()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate field name registered: ").append(metadatafield.getName()).toString());
        } else
        {
            JO.put(metadatafield.getName(), metadatafield);
            return;
        }
    }

    public static Collection gz()
    {
        return Collections.unmodifiableCollection(JO.values());
    }

    static 
    {
        b(ir.JQ);
        b(ir.Ko);
        b(ir.Kh);
        b(ir.Km);
        b(ir.Kp);
        b(ir.Kb);
        b(ir.Kc);
        b(ir.JZ);
        b(ir.Ke);
        b(ir.Kk);
        b(ir.JR);
        b(ir.Kj);
        b(ir.JT);
        b(ir.Ka);
        b(ir.JU);
        b(ir.JV);
        b(ir.JW);
        b(ir.Kg);
        b(ir.Kd);
        b(ir.Ki);
        b(ir.Kl);
        b(ir.Kq);
        b(ir.Kr);
        b(ir.JY);
        b(ir.JX);
        b(ir.Kn);
        b(ir.Kf);
        b(ir.JS);
        b(ir.Ks);
        b(it.Kt);
        b(it.Kv);
        b(it.Kw);
        b(it.Kx);
        b(it.Ku);
        b(iv.Kz);
        b(iv.KA);
    }
}

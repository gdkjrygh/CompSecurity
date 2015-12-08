// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.iq;
import com.google.android.gms.internal.is;
import com.google.android.gms.internal.iu;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class e
{

    private static Map JR = new HashMap();

    public static MetadataField aN(String s)
    {
        return (MetadataField)JR.get(s);
    }

    private static void b(MetadataField metadatafield)
    {
        if (JR.containsKey(metadatafield.getName()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate field name registered: ").append(metadatafield.getName()).toString());
        } else
        {
            JR.put(metadatafield.getName(), metadatafield);
            return;
        }
    }

    public static Collection gE()
    {
        return Collections.unmodifiableCollection(JR.values());
    }

    static 
    {
        b(iq.JT);
        b(iq.Kr);
        b(iq.Kk);
        b(iq.Kp);
        b(iq.Ks);
        b(iq.Ke);
        b(iq.Kf);
        b(iq.Kc);
        b(iq.Kh);
        b(iq.Kn);
        b(iq.JU);
        b(iq.Km);
        b(iq.JW);
        b(iq.Kd);
        b(iq.JX);
        b(iq.JY);
        b(iq.JZ);
        b(iq.Kj);
        b(iq.Kg);
        b(iq.Kl);
        b(iq.Ko);
        b(iq.Kt);
        b(iq.Ku);
        b(iq.Kb);
        b(iq.Ka);
        b(iq.Kq);
        b(iq.Ki);
        b(iq.JV);
        b(iq.Kv);
        b(is.Kw);
        b(is.Ky);
        b(is.Kz);
        b(is.KA);
        b(is.Kx);
        b(iu.KC);
        b(iu.KD);
    }
}

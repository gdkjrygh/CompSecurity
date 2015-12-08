// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.kd;
import com.google.android.gms.internal.kf;
import com.google.android.gms.internal.kh;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class e
{

    private static Map PK = new HashMap();

    private static void b(MetadataField metadatafield)
    {
        if (PK.containsKey(metadatafield.getName()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate field name registered: ").append(metadatafield.getName()).toString());
        } else
        {
            PK.put(metadatafield.getName(), metadatafield);
            return;
        }
    }

    public static MetadataField bj(String s)
    {
        return (MetadataField)PK.get(s);
    }

    public static Collection in()
    {
        return Collections.unmodifiableCollection(PK.values());
    }

    static 
    {
        b(kd.PM);
        b(kd.Qm);
        b(kd.Qd);
        b(kd.Qk);
        b(kd.Qn);
        b(kd.PX);
        b(kd.PY);
        b(kd.PV);
        b(kd.Qa);
        b(kd.Qi);
        b(kd.PN);
        b(kd.Qf);
        b(kd.PP);
        b(kd.PW);
        b(kd.PQ);
        b(kd.PR);
        b(kd.PS);
        b(kd.Qc);
        b(kd.PZ);
        b(kd.Qe);
        b(kd.Qg);
        b(kd.Qh);
        b(kd.Qj);
        b(kd.Qo);
        b(kd.Qp);
        b(kd.PU);
        b(kd.PT);
        b(kd.Ql);
        b(kd.Qb);
        b(kd.PO);
        b(kd.Qq);
        b(kd.Qr);
        b(kd.Qs);
        b(kf.Qt);
        b(kf.Qv);
        b(kf.Qw);
        b(kf.Qx);
        b(kf.Qu);
        b(kh.Qz);
        b(kh.QA);
    }
}

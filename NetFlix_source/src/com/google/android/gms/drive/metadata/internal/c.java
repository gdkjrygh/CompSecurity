// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.gs;
import com.google.android.gms.internal.gt;
import com.google.android.gms.internal.gv;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class c
{

    private static Map FP = new HashMap();

    public static MetadataField ax(String s)
    {
        return (MetadataField)FP.get(s);
    }

    private static void b(MetadataField metadatafield)
    {
        if (FP.containsKey(metadatafield.getName()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate field name registered: ").append(metadatafield.getName()).toString());
        } else
        {
            FP.put(metadatafield.getName(), metadatafield);
            return;
        }
    }

    public static Collection fS()
    {
        return Collections.unmodifiableCollection(FP.values());
    }

    static 
    {
        b(gs.FR);
        b(gs.Go);
        b(gs.Gh);
        b(gs.Gm);
        b(gs.Gp);
        b(gs.Gb);
        b(gs.Gc);
        b(gs.FZ);
        b(gs.Ge);
        b(gs.Gk);
        b(gs.FS);
        b(gs.Gj);
        b(gs.FT);
        b(gs.Ga);
        b(gs.FU);
        b(gs.FV);
        b(gs.FW);
        b(gs.Gg);
        b(gs.Gd);
        b(gs.Gi);
        b(gs.Gl);
        b(gs.Gq);
        b(gs.Gr);
        b(gs.FY);
        b(gs.FX);
        b(gs.Gn);
        b(gs.Gf);
        b(gt.Gs);
        b(gt.Gu);
        b(gt.Gv);
        b(gt.Gw);
        b(gt.Gt);
        b(gv.Gy);
        b(gv.Gz);
    }
}

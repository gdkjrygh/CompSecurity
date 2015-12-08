// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal:
//            v, ak, l, dx, 
//            k, ao, do, dh, 
//            di, ar, co, dm

private static final class kK
{

    public final kT kG;
    public final String kH;
    public final Context kI;
    public final l kJ;
    public final dx kK;
    public ao kL;
    public do kM;
    public ak kN;
    public dh kO;
    public di kP;
    public ar kQ;
    public co kR;
    public dm kS;
    private HashSet kT;

    public void a(HashSet hashset)
    {
        kT = hashset;
    }

    public HashSet ak()
    {
        return kT;
    }

    public (Context context, ak ak1, String s, dx dx1)
    {
        kS = null;
        kT = null;
        if (ak1.lT)
        {
            kG = null;
        } else
        {
            kG = new <init>(context);
            kG.setMinimumWidth(ak1.widthPixels);
            kG.setMinimumHeight(ak1.heightPixels);
            kG.setVisibility(4);
        }
        kN = ak1;
        kH = s;
        kI = context;
        kJ = new l(k.a(dx1.rq, context));
        kK = dx1;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal:
//            u, al, k, ev, 
//            ap, em, ef, eg, 
//            as, dg, dc, cz, 
//            ek

private static final class kQ
{

    public final lc kM;
    public final String kN;
    public final Context kO;
    public final k kP = new k(new <init>(this));
    public final ev kQ;
    public ap kR;
    public em kS;
    public al kT;
    public ef kU;
    public eg kV;
    public as kW;
    public dg kX;
    public dc kY;
    public cz kZ;
    public ek la;
    public boolean lb;
    private HashSet lc;

    public void a(HashSet hashset)
    {
        lc = hashset;
    }

    public HashSet aq()
    {
        return lc;
    }

    public (Context context, al al1, String s, ev ev)
    {
        la = null;
        lb = false;
        lc = null;
        if (al1.mf)
        {
            kM = null;
        } else
        {
            kM = new <init>(context);
            kM.setMinimumWidth(al1.widthPixels);
            kM.setMinimumHeight(al1.heightPixels);
            kM.setVisibility(4);
        }
        kT = al1;
        kN = s;
        kO = context;
        kQ = ev;
    }
}

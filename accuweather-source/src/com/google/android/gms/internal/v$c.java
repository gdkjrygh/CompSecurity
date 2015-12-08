// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal:
//            v, am, l, ew, 
//            aq, en, eg, eh, 
//            at, dh, dd, da, 
//            el

private static final class kO
{

    public final la kK;
    public final String kL;
    public final Context kM;
    public final l kN = new l(new <init>(this));
    public final ew kO;
    public aq kP;
    public en kQ;
    public am kR;
    public eg kS;
    public eh kT;
    public at kU;
    public dh kV;
    public dd kW;
    public da kX;
    public el kY;
    public boolean kZ;
    private HashSet la;

    public void a(HashSet hashset)
    {
        la = hashset;
    }

    public HashSet al()
    {
        return la;
    }

    public (Context context, am am1, String s, ew ew)
    {
        kY = null;
        kZ = false;
        la = null;
        if (am1.md)
        {
            kK = null;
        } else
        {
            kK = new <init>(context);
            kK.setMinimumWidth(am1.widthPixels);
            kK.setMinimumHeight(am1.heightPixels);
            kK.setVisibility(4);
        }
        kR = am1;
        kL = s;
        kM = context;
        kO = ew;
    }
}

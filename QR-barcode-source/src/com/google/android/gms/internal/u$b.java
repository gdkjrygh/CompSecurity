// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            u, ay, k, w, 
//            gt, bc, gg, fz, 
//            ga, bf, el, eh, 
//            et, eu, bt, bu, 
//            ee, ge

static class lD
{

    public final String lA;
    public final Context lB;
    public final k lC = new k(new w(this));
    public final gt lD;
    public bc lE;
    public gg lF;
    public gg lG;
    public ay lH;
    public fz lI;
    public  lJ;
    public ga lK;
    public bf lL;
    public el lM;
    public eh lN;
    public et lO;
    public eu lP;
    public bt lQ;
    public bu lR;
    public List lS;
    public ee lT;
    public ge lU;
    public View lV;
    public int lW;
    public boolean lX;
    private HashSet lY;
    public final  lz;

    public void a(HashSet hashset)
    {
        lY = hashset;
    }

    public HashSet au()
    {
        return lY;
    }

    public (Context context, ay ay1, String s, gt gt)
    {
        lU = null;
        lV = null;
        lW = 0;
        lX = false;
        lY = null;
        if (ay1.og)
        {
            lz = null;
        } else
        {
            lz = new <init>(context);
            lz.setMinimumWidth(ay1.widthPixels);
            lz.setMinimumHeight(ay1.heightPixels);
            lz.setVisibility(4);
        }
        lH = ay1;
        lA = s;
        lB = context;
        lD = gt;
    }
}

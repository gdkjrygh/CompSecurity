// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            u, ay, k, x, 
//            gs, bc, gf, fy, 
//            fz, bf, er, en, 
//            by, bz, br, ek, 
//            gd

static class lO
{

    public final mj lK;
    public final String lL;
    public final Context lM;
    public final k lN = new k(new x(this));
    public final gs lO;
    public bc lP;
    public gf lQ;
    public gf lR;
    public ay lS;
    public fy lT;
    public  lU;
    public fz lV;
    public bf lW;
    public er lX;
    public en lY;
    public by lZ;
    public bz ma;
    public br mb;
    public List mc;
    public ek md;
    public gd me;
    public View mf;
    public int mg;
    public boolean mh;
    public boolean mi;
    private HashSet mj;

    public void a(HashSet hashset)
    {
        mj = hashset;
    }

    public HashSet ay()
    {
        return mj;
    }

    public (Context context, ay ay1, String s, gs gs)
    {
        me = null;
        mf = null;
        mg = 0;
        mh = false;
        mi = false;
        mj = null;
        if (ay1.oq)
        {
            lK = null;
        } else
        {
            lK = new <init>(context);
            lK.setMinimumWidth(ay1.widthPixels);
            lK.setMinimumHeight(ay1.heightPixels);
            lK.setVisibility(4);
        }
        lS = ay1;
        lL = s;
        lM = context;
        lO = gs;
    }
}

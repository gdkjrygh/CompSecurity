// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            gv, bl, gj, gs, 
//            df

public class dg
{

    private final Context mContext;
    private final WindowManager mG;
    private final gv md;
    private final bl rg;
    DisplayMetrics rh;
    private float ri;
    int rj;
    int rk;
    private int rl;
    private int rm;
    private int rn;
    private int ro[];

    public dg(gv gv1, Context context, bl bl1)
    {
        rj = -1;
        rk = -1;
        rm = -1;
        rn = -1;
        ro = new int[2];
        md = gv1;
        mContext = context;
        rg = bl1;
        mG = (WindowManager)context.getSystemService("window");
        bM();
        bN();
        bO();
    }

    private void bM()
    {
        rh = new DisplayMetrics();
        Display display = mG.getDefaultDisplay();
        display.getMetrics(rh);
        ri = rh.density;
        rl = display.getRotation();
    }

    private void bO()
    {
        md.getLocationOnScreen(ro);
        md.measure(0, 0);
        float f = 160F / (float)rh.densityDpi;
        rm = Math.round((float)md.getMeasuredWidth() * f);
        rn = Math.round(f * (float)md.getMeasuredHeight());
    }

    private df bU()
    {
        return (new df.a()).j(rg.bj()).i(rg.bk()).k(rg.bo()).l(rg.bl()).m(rg.bm()).bL();
    }

    void bN()
    {
        int i = gj.s(mContext);
        float f = 160F / (float)rh.densityDpi;
        rj = Math.round((float)rh.widthPixels * f);
        rk = Math.round((float)(rh.heightPixels - i) * f);
    }

    public void bP()
    {
        bS();
        bT();
        bR();
        bQ();
    }

    public void bQ()
    {
        if (gs.u(2))
        {
            gs.U("Dispatching Ready Event.");
        }
        md.b("onReadyEventReceived", new JSONObject());
    }

    public void bR()
    {
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("x", ro[0]).put("y", ro[1]).put("width", rm).put("height", rn);
            md.b("onDefaultPositionReceived", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            gs.b("Error occured while dispatching default position.", jsonexception);
        }
    }

    public void bS()
    {
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("width", rj).put("height", rk).put("density", ri).put("rotation", rl);
            md.b("onScreenInfoChanged", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            gs.b("Error occured while obtaining screen information.", jsonexception);
        }
    }

    public void bT()
    {
        df df1 = bU();
        md.b("onDeviceFeaturesReceived", df1.bK());
    }
}

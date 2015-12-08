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
//            gu, bl, gi, gr, 
//            dk

public class dl
{

    private final Context mContext;
    private final WindowManager mR;
    private final gu mo;
    int rA;
    int rB;
    private int rC;
    private int rD;
    private int rE;
    private int rF[];
    private final bl rx;
    DisplayMetrics ry;
    private float rz;

    public dl(gu gu1, Context context, bl bl1)
    {
        rA = -1;
        rB = -1;
        rD = -1;
        rE = -1;
        rF = new int[2];
        mo = gu1;
        mContext = context;
        rx = bl1;
        mR = (WindowManager)context.getSystemService("window");
        bV();
        bW();
        bX();
    }

    private void bV()
    {
        ry = new DisplayMetrics();
        Display display = mR.getDefaultDisplay();
        display.getMetrics(ry);
        rz = ry.density;
        rC = display.getRotation();
    }

    private void bX()
    {
        mo.getLocationOnScreen(rF);
        mo.measure(0, 0);
        float f = 160F / (float)ry.densityDpi;
        rD = Math.round((float)mo.getMeasuredWidth() * f);
        rE = Math.round(f * (float)mo.getMeasuredHeight());
    }

    private dk cd()
    {
        return (new dk.a()).l(rx.bo()).k(rx.bp()).m(rx.bt()).n(rx.bq()).o(rx.br()).bU();
    }

    void bW()
    {
        int i = gi.s(mContext);
        float f = 160F / (float)ry.densityDpi;
        rA = Math.round((float)ry.widthPixels * f);
        rB = Math.round((float)(ry.heightPixels - i) * f);
    }

    public void bY()
    {
        cb();
        cc();
        ca();
        bZ();
    }

    public void bZ()
    {
        if (gr.v(2))
        {
            gr.U("Dispatching Ready Event.");
        }
        mo.b("onReadyEventReceived", new JSONObject());
    }

    public void ca()
    {
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("x", rF[0]).put("y", rF[1]).put("width", rD).put("height", rE);
            mo.b("onDefaultPositionReceived", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            gr.b("Error occured while dispatching default position.", jsonexception);
        }
    }

    public void cb()
    {
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("width", rA).put("height", rB).put("density", rz).put("rotation", rC);
            mo.b("onScreenInfoChanged", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            gr.b("Error occured while obtaining screen information.", jsonexception);
        }
    }

    public void cc()
    {
        dk dk1 = cd();
        mo.b("onDeviceFeaturesReceived", dk1.toJson());
    }
}

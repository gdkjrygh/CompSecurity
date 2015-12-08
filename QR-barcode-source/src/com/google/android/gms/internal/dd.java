// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.google.android.gms.ads.AdSize;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            gv, gj, gs, ay, 
//            gr

public class dd
{

    static final Set qT = new HashSet(Arrays.asList(new String[] {
        "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"
    }));
    private int lf;
    private int lg;
    private final Context mContext;
    private final gv md;
    private final Map qM;
    private int qU;
    private int qV;
    private boolean qW;
    private String qX;

    public dd(gv gv1, Map map)
    {
        lf = -1;
        lg = -1;
        qU = 0;
        qV = 0;
        qW = true;
        qX = "top-right";
        md = gv1;
        qM = map;
        mContext = gv1.dz();
    }

    private void bG()
    {
        int ai[] = gj.t(mContext);
        if (!TextUtils.isEmpty((CharSequence)qM.get("width")))
        {
            int i = gj.M((String)qM.get("width"));
            if (b(i, ai[0]))
            {
                lf = i;
            }
        }
        if (!TextUtils.isEmpty((CharSequence)qM.get("height")))
        {
            int j = gj.M((String)qM.get("height"));
            if (c(j, ai[1]))
            {
                lg = j;
            }
        }
        if (!TextUtils.isEmpty((CharSequence)qM.get("offsetX")))
        {
            qU = gj.M((String)qM.get("offsetX"));
        }
        if (!TextUtils.isEmpty((CharSequence)qM.get("offsetY")))
        {
            qV = gj.M((String)qM.get("offsetY"));
        }
        if (!TextUtils.isEmpty((CharSequence)qM.get("allowOffscreen")))
        {
            qW = Boolean.parseBoolean((String)qM.get("allowOffscreen"));
        }
        String s = (String)qM.get("customClosePosition");
        if (!TextUtils.isEmpty(s) && qT.contains(s))
        {
            qX = s;
        }
    }

    boolean b(int i, int j)
    {
        return i >= 50 && i < j;
    }

    boolean bH()
    {
        return lf > -1 && lg > -1;
    }

    void bI()
    {
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("x", qU).put("y", qV).put("width", lf).put("height", lg);
            md.b("onSizeChanged", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            gs.b("Error occured while dispatching size change.", jsonexception);
        }
    }

    void bJ()
    {
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("state", "resized");
            md.b("onStateChanged", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            gs.b("Error occured while dispatching state change.", jsonexception);
        }
    }

    boolean c(int i, int j)
    {
        return i >= 50 && i < j;
    }

    public void execute()
    {
        gs.U("PLEASE IMPLEMENT mraid.resize()");
        if (mContext == null)
        {
            gs.W("Not an activity context. Cannot resize.");
            return;
        }
        if (md.Y().og)
        {
            gs.W("Is interstitial. Cannot resize an interstitial.");
            return;
        }
        if (md.dy())
        {
            gs.W("Is expanded. Cannot resize an expanded banner.");
            return;
        }
        bG();
        if (!bH())
        {
            gs.W("Invalid width and height options. Cannot resize.");
            return;
        }
        Object obj = (WindowManager)mContext.getSystemService("window");
        Object obj1 = new DisplayMetrics();
        ((WindowManager) (obj)).getDefaultDisplay().getMetrics(((DisplayMetrics) (obj1)));
        int i = gr.a(((DisplayMetrics) (obj1)), lf);
        int j = gr.a(((DisplayMetrics) (obj1)), lg);
        obj = md.getParent();
        if (obj != null && (obj instanceof ViewGroup))
        {
            ((ViewGroup)obj).removeView(md);
        }
        obj = new LinearLayout(mContext);
        ((LinearLayout) (obj)).setBackgroundColor(0);
        obj1 = new PopupWindow(mContext);
        ((PopupWindow) (obj1)).setHeight(j + 16);
        ((PopupWindow) (obj1)).setWidth(i + 16);
        boolean flag;
        if (!qW)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj1)).setClippingEnabled(flag);
        ((PopupWindow) (obj1)).setContentView(((android.view.View) (obj)));
        ((LinearLayout) (obj)).addView(md, -1, -1);
        ((PopupWindow) (obj1)).showAtLocation(((Activity)mContext).getWindow().getDecorView(), 0, qU, qV);
        md.a(new ay(mContext, new AdSize(lf, lg)));
        bI();
        bJ();
    }

}

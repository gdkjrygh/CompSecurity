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
//            gu, gi, gr, ay, 
//            gq

public class di
{

    static final Set rk = new HashSet(Arrays.asList(new String[] {
        "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"
    }));
    private int li;
    private int lj;
    private final Context mContext;
    private final gu mo;
    private final Map rd;
    private int rl;
    private int rm;
    private boolean rn;
    private String ro;

    public di(gu gu1, Map map)
    {
        li = -1;
        lj = -1;
        rl = 0;
        rm = 0;
        rn = true;
        ro = "top-right";
        mo = gu1;
        rd = map;
        mContext = gu1.dI();
    }

    private void bQ()
    {
        int ai[] = gi.t(mContext);
        if (!TextUtils.isEmpty((CharSequence)rd.get("width")))
        {
            int i = gi.M((String)rd.get("width"));
            if (b(i, ai[0]))
            {
                li = i;
            }
        }
        if (!TextUtils.isEmpty((CharSequence)rd.get("height")))
        {
            int j = gi.M((String)rd.get("height"));
            if (c(j, ai[1]))
            {
                lj = j;
            }
        }
        if (!TextUtils.isEmpty((CharSequence)rd.get("offsetX")))
        {
            rl = gi.M((String)rd.get("offsetX"));
        }
        if (!TextUtils.isEmpty((CharSequence)rd.get("offsetY")))
        {
            rm = gi.M((String)rd.get("offsetY"));
        }
        if (!TextUtils.isEmpty((CharSequence)rd.get("allowOffscreen")))
        {
            rn = Boolean.parseBoolean((String)rd.get("allowOffscreen"));
        }
        String s = (String)rd.get("customClosePosition");
        if (!TextUtils.isEmpty(s) && rk.contains(s))
        {
            ro = s;
        }
    }

    boolean b(int i, int j)
    {
        return i >= 50 && i < j;
    }

    boolean bR()
    {
        return li > -1 && lj > -1;
    }

    void bS()
    {
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("x", rl).put("y", rm).put("width", li).put("height", lj);
            mo.b("onSizeChanged", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            gr.b("Error occured while dispatching size change.", jsonexception);
        }
    }

    void bT()
    {
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("state", "resized");
            mo.b("onStateChanged", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            gr.b("Error occured while dispatching state change.", jsonexception);
        }
    }

    boolean c(int i, int j)
    {
        return i >= 50 && i < j;
    }

    public void execute()
    {
        gr.U("PLEASE IMPLEMENT mraid.resize()");
        if (mContext == null)
        {
            gr.W("Not an activity context. Cannot resize.");
            return;
        }
        if (mo.ac().oq)
        {
            gr.W("Is interstitial. Cannot resize an interstitial.");
            return;
        }
        if (mo.dH())
        {
            gr.W("Is expanded. Cannot resize an expanded banner.");
            return;
        }
        bQ();
        if (!bR())
        {
            gr.W("Invalid width and height options. Cannot resize.");
            return;
        }
        Object obj = (WindowManager)mContext.getSystemService("window");
        Object obj1 = new DisplayMetrics();
        ((WindowManager) (obj)).getDefaultDisplay().getMetrics(((DisplayMetrics) (obj1)));
        int i = gq.a(((DisplayMetrics) (obj1)), li);
        int j = gq.a(((DisplayMetrics) (obj1)), lj);
        obj = mo.getParent();
        if (obj != null && (obj instanceof ViewGroup))
        {
            ((ViewGroup)obj).removeView(mo);
        }
        obj = new LinearLayout(mContext);
        ((LinearLayout) (obj)).setBackgroundColor(0);
        obj1 = new PopupWindow(mContext);
        ((PopupWindow) (obj1)).setHeight(j + 16);
        ((PopupWindow) (obj1)).setWidth(i + 16);
        boolean flag;
        if (!rn)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj1)).setClippingEnabled(flag);
        ((PopupWindow) (obj1)).setContentView(((android.view.View) (obj)));
        ((LinearLayout) (obj)).addView(mo, -1, -1);
        ((PopupWindow) (obj1)).showAtLocation(((Activity)mContext).getWindow().getDecorView(), 0, rl, rm);
        mo.a(new ay(mContext, new AdSize(li, lj)));
        bS();
        bT();
    }

}

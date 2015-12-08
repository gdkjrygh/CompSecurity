// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzic, zzhx

public class zzeg
{

    private final zzic zzmu;
    private final String zztP;

    public zzeg(zzic zzic1)
    {
        this(zzic1, "");
    }

    public zzeg(zzic zzic1, String s)
    {
        zzmu = zzic1;
        zztP = s;
    }

    public void zzH(String s)
    {
        try
        {
            s = (new JSONObject()).put("message", s).put("action", zztP);
            zzmu.zzb("onError", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzhx.zzb("Error occurred while dispatching error event.", s);
        }
    }

    public void zzI(String s)
    {
        try
        {
            s = (new JSONObject()).put("js", s);
            zzmu.zzb("onReadyEventReceived", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzhx.zzb("Error occured while dispatching ready Event.", s);
        }
    }

    public void zzJ(String s)
    {
        try
        {
            s = (new JSONObject()).put("state", s);
            zzmu.zzb("onStateChanged", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzhx.zzb("Error occured while dispatching state change.", s);
        }
    }

    public void zza(int i, int j, int k, int l, float f, int i1)
    {
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("width", i).put("height", j).put("maxSizeWidth", k).put("maxSizeHeight", l).put("density", f).put("rotation", i1);
            zzmu.zzb("onScreenInfoChanged", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            zzhx.zzb("Error occured while obtaining screen information.", jsonexception);
        }
    }

    public void zzb(int i, int j, int k, int l)
    {
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("x", i).put("y", j).put("width", k).put("height", l);
            zzmu.zzb("onSizeChanged", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            zzhx.zzb("Error occured while dispatching size change.", jsonexception);
        }
    }

    public void zzc(int i, int j, int k, int l)
    {
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("x", i).put("y", j).put("width", k).put("height", l);
            zzmu.zzb("onDefaultPositionReceived", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            zzhx.zzb("Error occured while dispatching default position.", jsonexception);
        }
    }
}

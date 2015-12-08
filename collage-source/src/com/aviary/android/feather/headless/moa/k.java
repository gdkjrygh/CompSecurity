// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.moa;

import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.aviary.android.feather.headless.moa:
//            j

public class k extends j
{

    public k()
    {
        c();
        a(0.0F, 0.0F);
    }

    public k(double d, double d1)
    {
        c();
        a(d, d1);
    }

    public k(float f, float f1)
    {
        c();
        a(f, f1);
    }

    public static Object b(float f, float f1)
    {
        JSONArray jsonarray = new JSONArray();
        double d = f;
        try
        {
            jsonarray.put(d);
            jsonarray.put(f1);
        }
        catch (JSONException jsonexception)
        {
            return jsonarray;
        }
        return jsonarray;
    }

    private void c()
    {
        h = new double[2];
        g = "point";
    }

    public Object a()
    {
        JSONArray jsonarray = new JSONArray();
        try
        {
            jsonarray.put(((double[])h)[0]);
            jsonarray.put(((double[])h)[1]);
        }
        catch (JSONException jsonexception)
        {
            return jsonarray;
        }
        return jsonarray;
    }

    public void a(double d, double d1)
    {
        ((double[])h)[0] = d;
        ((double[])h)[1] = d1;
    }

    public void a(float f, float f1)
    {
        ((double[])h)[0] = f;
        ((double[])h)[1] = f1;
    }

    public Object clone()
    {
        return new k(((double[])h)[0], ((double[])h)[1]);
    }
}

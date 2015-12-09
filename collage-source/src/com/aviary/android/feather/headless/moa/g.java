// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.moa;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.aviary.android.feather.headless.moa:
//            j

public class g extends j
{

    static final DecimalFormatSymbols a;
    static final DecimalFormat b;
    private int c;

    public g(int i)
    {
        a(i);
    }

    public g(int i, float f, float f1)
    {
        a(i);
        a(f, f1);
    }

    public g(int i, float f, float f1, float f2, float f3)
    {
        a(i);
        a(f, f1, f2, f3);
    }

    private void a(int i)
    {
        i;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 38
    //                   1 38
    //                   2 48
    //                   3 58;
           goto _L1 _L2 _L2 _L3 _L4
_L1:
        c = i;
        return;
_L2:
        h = new float[2];
        continue; /* Loop/switch isn't completed */
_L3:
        h = new float[4];
        continue; /* Loop/switch isn't completed */
_L4:
        h = new float[6];
        if (true) goto _L1; else goto _L5
_L5:
    }

    public Object a()
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        int i;
        try
        {
            jsonobject.put("c", c);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return jsonobject;
        }
        i = 0;
        if (i >= ((float[])h).length)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonarray.put(b.format(((float[])h)[i]));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_29;
_L1:
        jsonobject.put("p", jsonarray);
        return jsonobject;
    }

    public void a(float f, float f1)
    {
        ((float[])h)[0] = f;
        ((float[])h)[1] = f1;
    }

    public void a(float f, float f1, float f2, float f3)
    {
        ((float[])h)[0] = f;
        ((float[])h)[1] = f1;
        ((float[])h)[2] = f2;
        ((float[])h)[3] = f3;
    }

    public Object clone()
    {
        g g1 = new g(c);
        System.arraycopy(h, 0, g1.h, 0, ((float[])h).length);
        return g1;
    }

    static 
    {
        a = new DecimalFormatSymbols();
        a.setDecimalSeparator('.');
        b = new DecimalFormat("##.#####", a);
    }
}

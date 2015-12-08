// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.d.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class ca
    implements c
{

    private final int a;
    private final int b;
    private final float c;
    private final float d;
    private final int e;

    public ca(int i, int j, float f, float f1, int k)
    {
        a = i;
        b = j;
        c = f;
        d = f1;
        e = k;
    }

    public final Object a()
    {
        return b();
    }

    public final JSONObject b()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("resolution_height", b);
            jsonobject.put("resolution_width", a);
            jsonobject.put("x_dpi", c);
            jsonobject.put("y_dpi", d);
            jsonobject.put("density_default", e);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }
}

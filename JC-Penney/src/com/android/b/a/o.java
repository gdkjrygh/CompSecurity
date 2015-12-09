// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b.a;

import com.android.b.n;
import com.android.b.p;
import com.android.b.v;
import com.android.b.w;
import com.android.b.x;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.b.a:
//            p, j

public class o extends com.android.b.a.p
{

    public o(int i, String s, JSONObject jsonobject, x x, w w)
    {
        if (jsonobject == null)
        {
            jsonobject = null;
        } else
        {
            jsonobject = jsonobject.toString();
        }
        super(i, s, jsonobject, x, w);
    }

    public o(String s, x x, w w)
    {
        super(0, s, null, x, w);
    }

    public o(String s, JSONObject jsonobject, x x, w w)
    {
        int i;
        if (jsonobject == null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        this(i, s, jsonobject, x, w);
    }

    protected v a(n n1)
    {
        try
        {
            n1 = v.a(new JSONObject(new String(n1.b, j.a(n1.c, "utf-8"))), j.a(n1));
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            return v.a(new p(n1));
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            return v.a(new p(n1));
        }
        return n1;
    }
}

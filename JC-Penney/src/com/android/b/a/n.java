// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b.a;

import com.android.b.p;
import com.android.b.v;
import com.android.b.w;
import com.android.b.x;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.android.b.a:
//            p, j

public class n extends com.android.b.a.p
{

    public n(String s, x x, w w)
    {
        super(0, s, null, x, w);
    }

    protected v a(com.android.b.n n1)
    {
        try
        {
            n1 = v.a(new JSONArray(new String(n1.b, j.a(n1.c, "utf-8"))), j.a(n1));
        }
        // Misplaced declaration of an exception variable
        catch (com.android.b.n n1)
        {
            return v.a(new p(n1));
        }
        // Misplaced declaration of an exception variable
        catch (com.android.b.n n1)
        {
            return v.a(new p(n1));
        }
        return n1;
    }
}

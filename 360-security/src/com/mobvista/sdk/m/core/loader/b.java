// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.loader;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mobvista.sdk.m.a.a.c.a;
import com.mobvista.sdk.m.a.f.e;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends a
{

    private Context c;
    private String d;

    public b()
    {
        c = null;
    }

    private static String a(String s)
    {
        com.mobvista.sdk.m.a.b.a.a.a("AdWallIconLoader", (new StringBuilder("RESPONSE: ")).append(s).toString());
        String s1;
        int i;
        s = new JSONObject(s);
        i = s.optInt("status");
        s1 = s.optString("msg");
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        s = s.optJSONObject("data").optString("image", "");
        if (!TextUtils.isEmpty(s))
        {
            return s;
        }
        break MISSING_BLOCK_LABEL_94;
        try
        {
            Log.w("AdWallIconLoader", (new StringBuilder("APILoader error: ")).append(s1).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return "";
    }

    private String a(byte abyte0[])
    {
label0:
        {
            if (abyte0 != null && abyte0.length > 0)
            {
                abyte0 = new String(abyte0);
                if (!TextUtils.isEmpty(abyte0))
                {
                    break label0;
                }
            }
            return null;
        }
        return a(((String) (abyte0)));
    }

    private String b()
    {
        return (new e()).a(d).d(102).a(c);
    }

    protected final volatile Object a(Map map, byte abyte0[])
    {
        return a(abyte0);
    }

    protected final String a()
    {
        return (new StringBuilder("http://net.rayjump.com/image?")).append(b()).toString();
    }

    public final void a(Context context, String s)
    {
        c = context;
        d = s;
    }
}

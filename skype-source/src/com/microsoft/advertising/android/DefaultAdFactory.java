// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.text.TextUtils;
import com.microsoft.advertising.android.a.e;
import org.json.JSONObject;

// Referenced classes of package com.microsoft.advertising.android:
//            IAdFactory, i, av, bn, 
//            d, l, ap, ai

class DefaultAdFactory
    implements IAdFactory
{

    private static final String TAG = "AdFactory";
    private static final DefaultAdFactory instance = new DefaultAdFactory();

    private DefaultAdFactory()
    {
    }

    public static final DefaultAdFactory get()
    {
        return instance;
    }

    public d create(String s, ai ai, l l1)
        throws i
    {
        if (!TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        av.d("AdFactory", "Raw HTTP ad response from server is null or empty");
        return null;
        JSONObject jsonobject = new JSONObject(s);
        boolean flag;
        if (jsonobject.has("f") && "raf".equals(jsonobject.getString("f")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        try
        {
            ai = (new bn(ai)).a(jsonobject, l1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (ai ai)
        {
            av.c("AdFactory", (new StringBuilder("Failed to parse input JSON is : ")).append(ai).append(" ").append(s).toString());
            throw new i(e.f, (new StringBuilder("Error parsing Ad JSON : ")).append(ai.getMessage()).toString());
        }
_L6:
        if (ai == null) goto _L4; else goto _L3
_L3:
        ai.c().a(s);
        return ai;
_L2:
        ai = (new ap(ai)).a(jsonobject, l1);
        continue; /* Loop/switch isn't completed */
_L4:
        return ai;
        if (true) goto _L6; else goto _L5
_L5:
    }

}

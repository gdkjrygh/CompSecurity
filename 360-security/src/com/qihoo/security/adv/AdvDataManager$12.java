// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv;

import android.text.TextUtils;
import org.json.JSONObject;

// Referenced classes of package com.qihoo.security.adv:
//            AdvDataManager

class a
    implements com.android.volley.._cls12
{

    final  a;
    final AdvDataManager b;

    public volatile void a(Object obj)
    {
        a((String)obj);
    }

    public void a(String s)
    {
        if (a == null)
        {
            return;
        }
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_102;
        }
        int i = (new JSONObject(s)).optInt("result");
        if (1 == i)
        {
            try
            {
                a.(s, Long.valueOf(0L), Long.valueOf(0L));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                a.(Long.valueOf(-1L), Long.valueOf(-1L), 10003);
            }
            return;
        }
        a.(Long.valueOf(-1L), Long.valueOf(-1L), i);
        return;
        a.(Long.valueOf(-1L), Long.valueOf(-1L), 10000);
        return;
    }

    (AdvDataManager advdatamanager,  )
    {
        b = advdatamanager;
        a = ;
        super();
    }
}

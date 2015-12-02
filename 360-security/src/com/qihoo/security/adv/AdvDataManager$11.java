// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv;

import com.android.volley.AuthFailureError;
import com.android.volley.k;
import com.android.volley.toolbox.i;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.qihoo.security.adv:
//            AdvDataManager

class a extends i
{

    final String a;
    final AdvDataManager b;

    protected k a(com.android.volley.i j)
    {
        if (j != null && AdvDataManager.e().containsKey(Integer.valueOf(j.a)))
        {
            long l = ((Integer)AdvDataManager.e().get(Integer.valueOf(j.a))).intValue();
            long l1 = System.currentTimeMillis();
            AdvDataManager.a(b, a, l + l1);
        }
        return super.a(j);
    }

    public Map i()
        throws AuthFailureError
    {
        HashMap hashmap = new HashMap();
        hashmap.put("ADAPPINFO", AdvDataManager.d(b));
        return hashmap;
    }

    (AdvDataManager advdatamanager, int j, String s, String s1, com.android.volley. , com.android.volley. 1, String s2)
    {
        b = advdatamanager;
        a = s2;
        super(j, s, s1, , 1);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv;

import com.android.volley.AuthFailureError;
import com.android.volley.toolbox.l;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.qihoo.security.adv:
//            AdvDataManager

class a extends l
{

    final AdvDataManager a;

    public Map i()
        throws AuthFailureError
    {
        HashMap hashmap = new HashMap();
        hashmap.put("ADAPPINFO", AdvDataManager.d(a));
        return hashmap;
    }

    (AdvDataManager advdatamanager, int j, String s, String s1, com.android.volley.r r, com.android.volley.r r1)
    {
        a = advdatamanager;
        super(j, s, s1, r, r1);
    }
}

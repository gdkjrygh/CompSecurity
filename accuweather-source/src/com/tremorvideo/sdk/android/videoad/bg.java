// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            az, cx, dp, fz, 
//            gd

public class bg extends az
{

    private String k;
    private dp l;

    public bg(fz fz, JSONObject jsonobject, boolean flag)
        throws Exception
    {
        super(fz, jsonobject, flag);
        l = null;
        k = jsonobject.getString("asset-url");
        a(jsonobject);
    }

    public void a(gd gd)
    {
        c = gd;
    }

    public List b()
    {
        ArrayList arraylist = new ArrayList();
        if (b != null)
        {
            HashMap hashmap = new HashMap(2);
            hashmap.put("url", b.c());
            hashmap.put("crc", Long.valueOf(b.d()));
            hashmap.put("checkCache", Boolean.valueOf(false));
            arraylist.add(new az.a(this, fp.d.a, "coupon", hashmap));
        }
        if (d != null)
        {
            arraylist.add(new az.a(this, fp.d.c, "survey"));
        }
        return arraylist;
    }

    protected boolean p()
    {
        return true;
    }

    public String z()
    {
        return k;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ea

public class ey
{

    File a;
    private int b;
    private String c;
    private String d;
    private List e;

    public ey(JSONObject jsonobject)
        throws Exception
    {
        a = null;
        b = jsonobject.getInt("survey-skip-seconds") * 1000;
        c = jsonobject.getString("survey-link");
        d = jsonobject.getString("survey-image");
        if (!jsonobject.has("events"))
        {
            e = new ArrayList();
        } else
        {
            jsonobject = jsonobject.getJSONArray("events");
            e = new ArrayList(jsonobject.length());
            int i = 0;
            while (i < jsonobject.length()) 
            {
                e.add(new ea(jsonobject.getJSONObject(i)));
                i++;
            }
        }
    }

    public int a()
    {
        return b;
    }

    public ea a(ea.b b1)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext();)
        {
            ea ea1 = (ea)iterator.next();
            if (ea1.a() == b1)
            {
                return ea1;
            }
        }

        return null;
    }

    public void a(File file)
    {
        a = file;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public File d()
    {
        return a;
    }
}

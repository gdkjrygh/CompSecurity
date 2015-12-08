// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d;

import android.net.Uri;
import bo.app.eo;
import bo.app.eq;
import com.appboy.b.a.a;
import com.appboy.d;
import org.json.JSONObject;

// Referenced classes of package com.appboy.d:
//            e

public class l
    implements e
{

    private static final String g;
    public int a;
    public a b;
    public Uri c;
    public String d;
    public int e;
    public int f;
    private JSONObject h;

    public l()
    {
        a = -1;
        b = a.c;
        e = 0;
        f = 0;
    }

    public l(JSONObject jsonobject)
    {
        this(jsonobject, jsonobject.optInt("id", -1), (a)eo.a(jsonobject, "click_action", com/appboy/b/a/a, a.a), jsonobject.optString("uri"), jsonobject.optString("text"), jsonobject.optInt("bg_color"), jsonobject.optInt("text_color"));
    }

    private l(JSONObject jsonobject, int i, a a1, String s, String s1, int j, int k)
    {
        a = -1;
        b = a.c;
        e = 0;
        f = 0;
        h = jsonobject;
        a = i;
        b = a1;
        if (b == a.b && !eq.c(s))
        {
            c = Uri.parse(s);
        }
        d = s1;
        e = j;
        f = k;
    }

    public volatile Object forJsonPut()
    {
        return h;
    }

    static 
    {
        g = String.format("%s.%s", new Object[] {
            d.a, com/appboy/d/l.getName()
        });
    }
}

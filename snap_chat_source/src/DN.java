// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import org.json.JSONObject;

public final class DN extends DK
{

    private String e;
    private String f;

    public DN(JSONObject jsonobject)
    {
        super.d = false;
        e = jsonobject.getString("headline");
        f = jsonobject.getString("byline");
        jsonobject.getString("url");
        if (!TextUtils.isEmpty(e))
        {
            super.d = true;
        }
        a = e;
        b = f;
    }

    public final String c()
    {
        return c;
    }
}

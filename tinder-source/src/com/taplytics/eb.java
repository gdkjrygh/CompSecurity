// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.os.AsyncTask;
import com.android.volley.Request;
import com.android.volley.h;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            dp, ci, gm, do, 
//            ec, ed, gs, el

public final class eb extends AsyncTask
{

    final dp a;

    private eb(dp dp1)
    {
        a = dp1;
        super();
    }

    public eb(dp dp1, byte byte0)
    {
        this(dp1);
    }

    private Void a(el ael[])
    {
        ael = ael[0];
        String s;
        JSONObject jsonobject;
        s = (new StringBuilder()).append(a.e).append(a.b).append("/api/v1/images").toString().replaceAll(" ", "%20");
        jsonobject = new JSONObject();
        Date date;
        HashMap hashmap;
        byte abyte0[];
        try
        {
            jsonobject.put("projectToken", ci.b().f);
            jsonobject.put("isAppIcon", true);
            jsonobject.put("isAndroid", true);
        }
        catch (JSONException jsonexception)
        {
            try
            {
                gs.b("postChosenActivity", jsonexception);
            }
            // Misplaced declaration of an exception variable
            catch (el ael[])
            {
                return null;
            }
        }
        date = new Date();
        hashmap = new HashMap();
        abyte0 = gm.a();
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        if (abyte0.length <= 0)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        hashmap.put("icon", abyte0);
        ael = new do(s, jsonobject, hashmap, new ec(this, date, ael), new ed(this, s, ael));
        ael.l = "post_appIcon";
        a.f.a(ael);
        return null;
        gs.c("app icon null");
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((el[])aobj);
    }
}

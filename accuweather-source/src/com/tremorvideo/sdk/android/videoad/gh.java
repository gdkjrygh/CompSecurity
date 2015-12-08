// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.text.Html;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            fd, gg, ct

class gh
    implements Runnable
{

    final String a;
    final gg b;

    gh(gg gg1, String s)
    {
        b = gg1;
        a = s;
        super();
    }

    public void run()
    {
        boolean flag1 = false;
        Object obj;
        obj = fd.a(a, null);
        ((fd) (obj)).a();
        boolean flag = flag1;
        if (((fd) (obj)).b() == null) goto _L2; else goto _L1
_L1:
        obj = (new JSONObject(((fd) (obj)).b())).getJSONArray("results");
        int i = 0;
_L5:
        if (i >= ((JSONArray) (obj)).length()) goto _L4; else goto _L3
_L3:
        Object obj1 = ((JSONArray) (obj)).getJSONObject(i);
        String s = ((JSONObject) (obj1)).getString("text");
        obj1 = (new StringBuilder()).append("@").append(((JSONObject) (obj1)).getString("from_user")).append(": ").toString();
        s = (new StringBuilder()).append(((String) (obj1))).append(Html.fromHtml(s).toString()).toString();
        b.e.add(s);
_L6:
        i++;
          goto _L5
        Exception exception1;
        exception1;
        ct.a(exception1);
          goto _L6
        Exception exception;
        exception;
        ct.d(exception.getMessage());
        flag = flag1;
_L2:
        b.d = true;
        b.f.a(b, flag);
        return;
_L4:
        flag = true;
        if (true) goto _L2; else goto _L7
_L7:
    }
}

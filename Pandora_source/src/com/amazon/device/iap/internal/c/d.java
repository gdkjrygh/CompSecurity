// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.c;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.iap.internal.c:
//            e

class d
{

    private final String a;
    private final String b;
    private final long c;
    private final String d;

    public d(String s, String s1, String s2, long l)
    {
        a = s;
        b = s1;
        d = s2;
        c = l;
    }

    public static d a(String s)
        throws e
    {
        Object obj;
        try
        {
            obj = new JSONObject(s);
            obj = new d(((JSONObject) (obj)).getString("KEY_USER_ID"), ((JSONObject) (obj)).getString("KEY_RECEIPT_STRING"), ((JSONObject) (obj)).getString("KEY_REQUEST_ID"), ((JSONObject) (obj)).getLong("KEY_TIMESTAMP"));
        }
        catch (Throwable throwable)
        {
            throw new e((new StringBuilder()).append("Input invalid for PendingReceipt Object:").append(s).toString(), throwable);
        }
        return ((d) (obj));
    }

    public String a()
    {
        return d;
    }

    public String b()
    {
        return b;
    }

    public long c()
    {
        return c;
    }

    public String d()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("KEY_USER_ID", a);
        jsonobject.put("KEY_RECEIPT_STRING", b);
        jsonobject.put("KEY_REQUEST_ID", d);
        jsonobject.put("KEY_TIMESTAMP", c);
        return jsonobject.toString();
    }
}

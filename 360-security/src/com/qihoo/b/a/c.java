// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.b.a;

import android.os.Bundle;
import java.net.URLEncoder;

// Referenced classes of package com.qihoo.b.a:
//            e

class c
{

    private static String a[] = {
        "deviceModel", "sysVersion", "deviceId", "district", "lang", "channel", "subChannel", "isRoot", "email", "gp"
    };
    private Bundle b;

    public c(Bundle bundle)
    {
        b = null;
        b = bundle;
    }

    private String b()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Object obj = a;
        int j = obj.length;
        int i = 0;
        do
        {
            String s1;
            String s2;
            if (i >= j)
            {
                if (stringbuilder.length() != 0)
                {
                    String s = b.getString("sk");
                    obj = s;
                    if (s == null)
                    {
                        obj = "";
                    }
                    obj = e.a((new StringBuilder(String.valueOf((new StringBuilder("{")).append(stringbuilder.toString()).append("}").toString()))).append(((String) (obj))).toString());
                    return String.format("{%s,\"%s\":\"%s\"}", new Object[] {
                        stringbuilder.toString(), "sig", obj
                    });
                } else
                {
                    return null;
                }
            }
            s1 = obj[i];
            s2 = b.getString(s1);
            if (s2 != null)
            {
                if (stringbuilder.length() != 0)
                {
                    stringbuilder.append(",");
                }
                stringbuilder.append(String.format("\"%s\":\"%s\"", new Object[] {
                    s1, s2
                }));
            }
            i++;
        } while (true);
    }

    public String a()
    {
        if (b != null)
        {
            String s = b.getString("client");
            String s1 = b.getString("version");
            String s2 = b.getString("");
            String s3 = b();
            if (s != null && s1 != null && s2 != null && s3 != null)
            {
                String s4 = b.getString("dk");
                if (s4 != null)
                {
                    try
                    {
                        s = String.format("%sclient=%s&version=%s&data=%s", new Object[] {
                            s2, URLEncoder.encode(s, "utf-8"), URLEncoder.encode(s1, "utf-8"), URLEncoder.encode(e.a(s3, s4), "utf-8")
                        });
                    }
                    catch (Exception exception)
                    {
                        return null;
                    }
                    return s;
                }
            }
        }
        return null;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import android.net.Uri;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.b:
//            al

public class ao
{

    private String a;
    private String b;
    private Uri c;
    private int d[];

    private ao(String s, String s1, Uri uri, int ai[])
    {
        a = s;
        b = s1;
        c = uri;
        d = ai;
    }

    static ao a(JSONObject jsonobject)
    {
        return b(jsonobject);
    }

    private static int[] a(JSONArray jsonarray)
    {
        int ai[] = null;
        if (jsonarray != null)
        {
            int l = jsonarray.length();
            ai = new int[l];
            int j = 0;
            do
            {
                if (j >= l)
                {
                    break;
                }
                int k = jsonarray.optInt(j, -1);
                int i = k;
                if (k == -1)
                {
                    String s = jsonarray.optString(j);
                    i = k;
                    if (!al.a(s))
                    {
                        try
                        {
                            i = Integer.parseInt(s);
                        }
                        catch (NumberFormatException numberformatexception)
                        {
                            al.a("FacebookSDK", numberformatexception);
                            i = -1;
                        }
                    }
                }
                ai[j] = i;
                j++;
            } while (true);
        }
        return ai;
    }

    private static ao b(JSONObject jsonobject)
    {
        Uri uri = null;
        String s = jsonobject.optString("name");
        String as[];
        if (!al.a(s))
        {
            if ((as = s.split("\\|")).length == 2)
            {
                String s1 = as[0];
                String s2 = as[1];
                if (!al.a(s1) && !al.a(s2))
                {
                    String s3 = jsonobject.optString("url");
                    if (!al.a(s3))
                    {
                        uri = Uri.parse(s3);
                    }
                    return new ao(s1, s2, uri, a(jsonobject.optJSONArray("versions")));
                }
            }
        }
        return null;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }
}

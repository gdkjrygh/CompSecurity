// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.net.Uri;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//            aw

public final class az
{

    private String a;
    private String b;
    private Uri c;
    private int d[];

    private az(String s, String s1, Uri uri, int ai[])
    {
        a = s;
        b = s1;
        c = uri;
        d = ai;
    }

    static az a(JSONObject jsonobject)
    {
        Uri uri = null;
        String s = jsonobject.optString("name");
        String as[];
        if (!aw.a(s))
        {
            if ((as = s.split("\\|")).length == 2)
            {
                String s1 = as[0];
                String s2 = as[1];
                if (!aw.a(s1) && !aw.a(s2))
                {
                    String s3 = jsonobject.optString("url");
                    if (!aw.a(s3))
                    {
                        uri = Uri.parse(s3);
                    }
                    return new az(s1, s2, uri, a(jsonobject.optJSONArray("versions")));
                }
            }
        }
        return null;
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
                    if (!aw.a(s))
                    {
                        try
                        {
                            i = Integer.parseInt(s);
                        }
                        catch (NumberFormatException numberformatexception)
                        {
                            aw.a("FacebookSDK", numberformatexception);
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

    public final String a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final Uri c()
    {
        return c;
    }

    public final int[] d()
    {
        return d;
    }
}

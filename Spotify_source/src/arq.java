// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import org.json.JSONArray;

public final class arq
{

    String a;
    String b;
    public Uri c;
    public int d[];

    arq(String s, String s1, Uri uri, int ai[])
    {
        a = s;
        b = s1;
        c = uri;
        d = ai;
    }

    static int[] a(JSONArray jsonarray)
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
                    if (!arp.a(s))
                    {
                        try
                        {
                            i = Integer.parseInt(s);
                        }
                        catch (NumberFormatException numberformatexception)
                        {
                            arp.a("FacebookSDK", numberformatexception);
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
}

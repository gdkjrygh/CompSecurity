// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.mobile.android.arsenal.data.AccountsLinkException;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;

public final class dks extends dkr
{

    private final Context a;

    dks(Context context)
    {
        a = context;
    }

    private static dkt a(String s, String s1, List list, List list1)
    {
        String s2;
        String s3;
        s3 = null;
        s2 = null;
        s = b(s, s1, list, list1);
        s2 = s;
        s3 = s;
        s1 = a(((HttpURLConnection) (s)));
        s2 = s;
        s3 = s;
        s1 = new dkt(s.getResponseCode(), s.getResponseMessage(), s1, (byte)0);
        if (s != null)
        {
            s.disconnect();
        }
        return s1;
        s;
        s3 = s2;
        Logger.c("Failed linking accounts", new Object[] {
            s
        });
        if (s2 != null)
        {
            s2.disconnect();
        }
        return new dkt(-1, "Exception occurred", "", (byte)0);
        s;
        if (s3 != null)
        {
            s3.disconnect();
        }
        throw s;
    }

    private static String a(HttpURLConnection httpurlconnection)
    {
        try
        {
            httpurlconnection = (new Scanner(httpurlconnection.getInputStream())).useDelimiter("\\A");
            if (httpurlconnection.hasNext())
            {
                return httpurlconnection.next();
            }
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            return "";
        }
        return "";
    }

    private static HttpURLConnection b(String s, String s1, List list, List list1)
    {
        s = (new grp(new gro())).a(new URL(s));
        s.setRequestMethod(s1);
        for (s1 = list1.iterator(); s1.hasNext(); s.addRequestProperty((String)((dmm) (list1)).first, (String)((dmm) (list1)).second))
        {
            list1 = (dmm)s1.next();
        }

        if (list == null || list.isEmpty())
        {
            break MISSING_BLOCK_LABEL_121;
        }
        s1 = new PrintWriter(s.getOutputStream());
        s1.print(dmt.a(list, "UTF-8"));
        s1.flush();
        s1.close();
        return s;
        s;
        s1 = null;
_L2:
        if (s1 != null)
        {
            s1.close();
        }
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final Optional a(String s)
    {
        geh.a();
        Object obj = a(dkw.a(a, true), "GET", Collections.emptyList(), Arrays.asList(new dmm[] {
            new dmm("Authorization", (new StringBuilder("Bearer ")).append(s).toString())
        }));
        if (((dkt) (obj)).b != 200)
        {
            throw new AccountsLinkException(((dkt) (obj)).b, ((dkt) (obj)).a);
        }
        s = Optional.e();
        try
        {
            obj = Optional.b((new JSONObject(((dkt) (obj)).c)).getString("id"));
        }
        catch (JSONException jsonexception)
        {
            Logger.a(jsonexception, "Failed to parse link check response", new Object[0]);
            return s;
        }
        return ((Optional) (obj));
    }

    public final void a(String s, String s1)
    {
        geh.a();
        s = a(dkw.a(a, false), "POST", Arrays.asList(new dmm[] {
            new dmm("code", s), new dmm("service", "sp"), new dmm("access_token", s1)
        }), Collections.emptyList());
        if (((dkt) (s)).b != 201)
        {
            throw new AccountsLinkException(((dkt) (s)).b, ((dkt) (s)).a);
        } else
        {
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.content.Context;
import android.location.Location;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.jcp.JCP;
import com.jcp.http.b;
import com.jcp.util.ae;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.jcp.helper:
//            aa

public class z extends AsyncTask
{

    private static final String e = com/jcp/helper/z.getSimpleName();
    private String a;
    private aa b;
    private String c;
    private String d;

    public z(Context context, Location location)
    {
        a = String.format("https://maps.googleapis.com/maps/api/geocode/json?latlng=%s,%s", new Object[] {
            Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())
        });
    }

    private void a(String s)
    {
        Object obj;
        s = new JSONObject(s);
        obj = s.getString("status");
        if (!"OK".equals(obj)) goto _L2; else goto _L1
_L1:
        s = s.getJSONArray("results");
        if (s.length() <= 0) goto _L4; else goto _L3
_L3:
        int i;
        s = s.getJSONObject(0).getJSONArray("address_components");
        i = s.length() - 1;
_L6:
        if (i < 0 || !TextUtils.isEmpty(d))
        {
            return;
        }
        obj = s.getJSONObject(i);
        JSONArray jsonarray = ((JSONObject) (obj)).getJSONArray("types");
        int j = 0;
        do
        {
label0:
            {
                if (j < jsonarray.length())
                {
                    if (!"postal_code".equals(jsonarray.getString(j)))
                    {
                        break label0;
                    }
                    d = ((JSONObject) (obj)).getString("long_name");
                }
                i--;
                continue; /* Loop/switch isn't completed */
            }
            j++;
        } while (true);
_L4:
        c = "No results for Location given";
        return;
_L2:
        c = (new StringBuilder()).append(((String) (obj))).append(":").append(s.getString("error_message")).toString();
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected transient Void a(Void avoid[])
    {
        try
        {
            avoid = JCP.k().newCall(com.jcp.http.b.a(a)).execute();
            String s = com.jcp.http.b.a(avoid);
            if (avoid.code() == 200 && !TextUtils.isEmpty(s))
            {
                a(s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            ae.a(e, "Exception while reverse geocode:", avoid);
            c = avoid.getMessage();
            avoid.printStackTrace();
        }
        return null;
    }

    public void a(aa aa1)
    {
        b = aa1;
    }

    protected void a(Void void1)
    {
        if (!isCancelled() && b != null)
        {
            if (!TextUtils.isEmpty(d))
            {
                b.b(d);
                return;
            }
            if (!TextUtils.isEmpty(c))
            {
                b.a(c);
                return;
            }
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

}

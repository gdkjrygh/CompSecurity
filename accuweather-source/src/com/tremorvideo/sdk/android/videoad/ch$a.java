// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import java.io.File;
import java.io.FileOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ch, az, ct

private class e
{

    public String a;
    public String b;
    public int c;
    public String d[];
    public long e;
    public int f;
    final ch g;

    public void a(az az1)
    {
        boolean flag = false;
        b = az1.i();
        f = 0;
        String as[] = az1.l();
        d = new String[as.length];
        for (int i = 0; i < d.length; i++)
        {
            d[i] = as[i];
        }

        e = 0L;
        for (int j = ((flag) ? 1 : 0); j < as.length; j++)
        {
            e = e + (long)az1.d(j);
        }

    }

    public void a(File file)
        throws Exception
    {
        int i = 0;
        file = new JSONObject(ct.a(file));
        c = file.getInt("views");
        a = file.getString("base-file");
        b = file.getString("expiration-date");
        e = file.getLong("total-size");
        f = file.getInt("priority");
        if (!file.has("files"))
        {
            d = new String[0];
        } else
        {
            file = file.getJSONArray("files");
            d = new String[file.length()];
            while (i < file.length()) 
            {
                d[i] = file.getString(i);
                i++;
            }
        }
    }

    public void a(String s)
    {
        JSONObject jsonobject;
        JSONArray jsonarray;
        jsonobject = new JSONObject();
        jsonarray = new JSONArray();
        int i = 0;
_L2:
        if (i >= d.length)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonarray.put(d[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            jsonobject.put("files", jsonarray);
            jsonobject.put("views", c);
            jsonobject.put("expiration-date", b);
            jsonobject.put("base-file", a);
            jsonobject.put("total-size", e);
            jsonobject.put("priority", f);
            s = new FileOutputStream(new File(s));
            s.write(jsonobject.toString().getBytes());
            s.flush();
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ct.a(s);
        }
        return;
    }

    public (ch ch1)
    {
        g = ch1;
        super();
    }

    public g(ch ch1, az az1, File file)
    {
        boolean flag = false;
        g = ch1;
        super();
        a = az1.j();
        c = 0;
        b = az1.i();
        f = 0;
        ch1 = az1.l();
        d = new String[ch1.length];
        int i = 0;
        int j;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i >= d.length)
            {
                break;
            }
            d[i] = ch1[i];
            i++;
        } while (true);
        for (; j < ch1.length; j++)
        {
            e = e + (long)az1.d(j);
        }

    }
}

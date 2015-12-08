// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.text.TextUtils;
import android.widget.Toast;
import com.jcp.JCP;
import com.jcp.util.ae;
import com.jcp.util.g;
import com.jcp.util.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jcp.helper:
//            u, t

public final class s extends u
{

    private static final String b = com/jcp/helper/s.getSimpleName();
    private g c;
    private ExecutorService d;
    private final List e = new ArrayList();

    public s()
    {
        c = com.jcp.util.g.a();
    }

    private void a(String s1, boolean flag)
    {
        if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s2;
        String s3;
        Object obj;
        String s4;
        JSONArray jsonarray;
        String s5;
        String s6;
        String s7;
        String s8;
        JSONObject jsonobject;
        int j;
        try
        {
            s1 = new JSONObject(s1);
            s4 = s1.getString("id");
            jsonarray = s1.optJSONArray("categories");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return;
        }
        if (jsonarray == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = 0;
        if (j >= jsonarray.length())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = jsonarray.getJSONObject(j);
        s5 = ((JSONObject) (obj)).getString("id");
        s6 = ((JSONObject) (obj)).getString("name");
        s7 = ((JSONObject) (obj)).getString("url");
        s3 = "";
        s1 = "";
        s8 = ((JSONObject) (obj)).getString("external");
        s2 = s3;
        if (!((JSONObject) (obj)).has("templates"))
        {
            break MISSING_BLOCK_LABEL_179;
        }
        obj = ((JSONObject) (obj)).getString("templates");
        s1 = ((String) (obj));
        s2 = s3;
        if (((String) (obj)).contains("null"))
        {
            break MISSING_BLOCK_LABEL_179;
        }
        jsonobject = new JSONObject(((String) (obj)));
        s1 = ((String) (obj));
        s2 = s3;
        if (!jsonobject.has("mobile"))
        {
            break MISSING_BLOCK_LABEL_179;
        }
        s2 = jsonobject.getString("mobile");
        s1 = ((String) (obj));
        c.a(new h(s5, s6, s7, s4, "", s1, "", "", s2, (new StringBuilder()).append("").append(s8).toString()));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        h(s7);
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_245;
_L4:
        break MISSING_BLOCK_LABEL_41;
        if (true) goto _L1; else goto _L5
_L5:
    }

    static String b()
    {
        return b;
    }

    private void e(String s1)
    {
        ArrayList arraylist;
        Object obj;
        String s2;
        String s3;
        String s4;
        JSONObject jsonobject;
        int j;
        try
        {
            obj = new JSONArray(s1);
            arraylist = new ArrayList();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return;
        }
        j = 0;
        if (j >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = ((JSONArray) (obj)).getJSONObject(j);
        s2 = jsonobject.getString("id");
        s3 = jsonobject.getString("name");
        s4 = jsonobject.getString("url");
        s1 = "";
        if (jsonobject.has("titleImage"))
        {
            s1 = jsonobject.getString("titleImage");
        }
        c.a(new h(s2, s3, s4, "depth0", s1, "", "", "", "", "false"));
        arraylist.add(s4);
        j++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_20;
_L1:
        obj = arraylist.iterator();
_L3:
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_210;
            }
            s1 = (String)((Iterator) (obj)).next();
        } while (s1 == null);
        b(s1);
          goto _L3
        s1;
        if (s1.getMessage() != null)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        s1 = "while parsing department list got exception";
_L4:
        ae.a(b, s1);
          goto _L3
        s1 = s1.getMessage();
          goto _L4
        arraylist.clear();
        return;
          goto _L3
    }

    private boolean f(String s1)
    {
        return e.contains(s1);
    }

    private void g(String s1)
    {
        a(s1, true);
    }

    private void h(String s1)
    {
label0:
        {
            if (s1 != null)
            {
                if (!s1.contains("Products"))
                {
                    break label0;
                }
                Toast.makeText(JCP.d(), "NO Products", 0).show();
            }
            return;
        }
        d = Executors.newCachedThreadPool();
        s1 = new t(this, s1);
        d.execute(s1);
    }

    private void i(String s1)
    {
        a(s1, false);
    }

    public void a()
    {
        if (d != null && !d.isShutdown())
        {
            d.shutdown();
        }
    }

    public void a(String s1)
    {
        s1 = d(s1);
        if (s1 != null)
        {
            e(s1);
        }
    }

    public void b(String s1)
    {
        if (f(s1))
        {
            return;
        }
        String s2 = d(s1);
        if (s2 != null)
        {
            g(s2);
        }
        e.add(s1);
    }

    public void c(String s1)
    {
        s1 = d(s1);
        if (s1 != null)
        {
            i(s1);
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import net.hockeyapp.android.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class l
{

    private ArrayList a;
    private JSONObject b;
    private p c;
    private int d;

    public l(Context context, String s, p p1)
    {
        c = p1;
        a(context, s);
        d();
    }

    public static int a(String s, String s1)
    {
        byte byte0 = -1;
        if (s != null && s1 != null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        return i;
_L2:
        s = new Scanner(s.replaceAll("\\-.*", ""));
        s1 = new Scanner(s1.replaceAll("\\-.*", ""));
        s.useDelimiter("\\.");
        s1.useDelimiter("\\.");
_L4:
        int j;
        int k;
        if (!s.hasNextInt() || !s1.hasNextInt())
        {
            break MISSING_BLOCK_LABEL_104;
        }
        j = s.nextInt();
        k = s1.nextInt();
        i = byte0;
        if (j < k)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (j <= k) goto _L4; else goto _L3
_L3:
        return 1;
        if (s.hasNextInt())
        {
            return 1;
        }
        boolean flag;
        try
        {
            flag = s1.hasNextInt();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0;
        }
        i = byte0;
        if (!flag)
        {
            return 0;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static long a(JSONObject jsonobject, String s, long l1)
    {
        long l2;
        try
        {
            l2 = jsonobject.getLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return l1;
        }
        return l2;
    }

    private String a(int i, JSONObject jsonobject)
    {
        StringBuilder stringbuilder = new StringBuilder();
        jsonobject = a(jsonobject);
        if (jsonobject.length() > 0)
        {
            stringbuilder.append((new StringBuilder()).append("<a href='restore:").append(jsonobject).append("'  style='background: #c8c8c8; color: #000; display: block; float: right; padding: 7px; margin: 0px 10px 10px; text-decoration: none;'>Restore</a>").toString());
        }
        return stringbuilder.toString();
    }

    public static String a(String s)
    {
        String s1;
label0:
        {
            if (s != null)
            {
                s1 = s;
                if (!s.equalsIgnoreCase("L"))
                {
                    break label0;
                }
            }
            s1 = "5.0";
        }
        return s1;
    }

    private String a(JSONObject jsonobject)
    {
        try
        {
            jsonobject = jsonobject.getString("id");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return "";
        }
        return jsonobject;
    }

    private static String a(JSONObject jsonobject, String s, String s1)
    {
        try
        {
            jsonobject = jsonobject.getString(s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return s1;
        }
        return jsonobject;
    }

    private void a(Context context, String s)
    {
        b = new JSONObject();
        a = new ArrayList();
        d = c.e();
        int j;
        s = new JSONArray(s);
        j = c.e();
        int i = 0;
_L4:
        if (i >= s.length()) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject = s.getJSONObject(i);
        boolean flag;
        boolean flag1;
        if (jsonobject.getInt("version") > j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (jsonobject.getInt("version") == j && a(context, jsonobject.getLong("timestamp")))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
          goto _L3
_L5:
        b = jsonobject;
        j = jsonobject.getInt("version");
_L6:
        a.add(jsonobject);
        i++;
          goto _L4
        context;
_L2:
        return;
        context;
        return;
_L3:
        if (!flag && !flag1) goto _L6; else goto _L5
    }

    public static boolean a(Context context, long l1)
    {
        if (context != null) goto _L2; else goto _L1
_L1:
        long l2;
        return false;
_L2:
        if (l1 <= (l2 = (new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir)).lastModified() / 1000L) + 1800L) goto _L1; else goto _L3
_L3:
        return true;
        context;
        context.printStackTrace();
        return false;
    }

    private int b(JSONObject jsonobject)
    {
        int i;
        try
        {
            i = jsonobject.getInt("version");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return 0;
        }
        return i;
    }

    private String b(int i, JSONObject jsonobject)
    {
        StringBuilder stringbuilder;
        int j;
        int k;
        stringbuilder = new StringBuilder();
        j = b(b);
        k = b(jsonobject);
        jsonobject = c(jsonobject);
        stringbuilder.append("<div style='padding: 20px 10px 10px;'><strong>");
        if (i != 0) goto _L2; else goto _L1
_L1:
        stringbuilder.append("Newest version:");
_L4:
        stringbuilder.append("</strong></div>");
        return stringbuilder.toString();
_L2:
        stringbuilder.append((new StringBuilder()).append("Version ").append(jsonobject).append(" (").append(k).append("): ").toString());
        if (k != j && k == d)
        {
            d = -1;
            stringbuilder.append("[INSTALLED]");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private String c(int i, JSONObject jsonobject)
    {
        StringBuilder stringbuilder = new StringBuilder();
        jsonobject = a(jsonobject, "notes", "");
        stringbuilder.append("<div style='padding: 0px 10px;'>");
        if (jsonobject.trim().length() == 0)
        {
            stringbuilder.append("<em>No information.</em>");
        } else
        {
            stringbuilder.append(jsonobject);
        }
        stringbuilder.append("</div>");
        return stringbuilder.toString();
    }

    private String c(JSONObject jsonobject)
    {
        try
        {
            jsonobject = jsonobject.getString("shortversion");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return "";
        }
        return jsonobject;
    }

    private void d()
    {
        Collections.sort(a, new _cls1());
    }

    private Object e()
    {
        return "<hr style='border-top: 1px solid #c8c8c8; border-bottom: 0px; margin: 40px 10px 0px 10px;' />";
    }

    public String a()
    {
        return (new StringBuilder()).append(a(b, "shortversion", "")).append(" (").append(a(b, "version", "")).append(")").toString();
    }

    public String a(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<html>");
        stringbuilder.append("<body style='padding: 0px 0px 20px 0px'>");
        Iterator iterator = a.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            JSONObject jsonobject = (JSONObject)iterator.next();
            if (i > 0)
            {
                stringbuilder.append(e());
                if (flag)
                {
                    stringbuilder.append(a(i, jsonobject));
                }
            }
            stringbuilder.append(b(i, jsonobject));
            stringbuilder.append(c(i, jsonobject));
        }

        stringbuilder.append("</body>");
        stringbuilder.append("</html>");
        return stringbuilder.toString();
    }

    public String b()
    {
        Date date = new Date(a(b, "timestamp", 0L) * 1000L);
        return (new SimpleDateFormat("dd.MM.yyyy")).format(date);
    }

    public long c()
    {
        boolean flag = Boolean.valueOf(a(b, "external", "false")).booleanValue();
        long l2 = a(b, "appsize", 0L);
        long l1 = l2;
        if (flag)
        {
            l1 = l2;
            if (l2 == 0L)
            {
                l1 = -1L;
            }
        }
        return l1;
    }

    /* member class not found */
    class _cls1 {}

}

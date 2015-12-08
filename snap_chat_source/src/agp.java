// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class agp
{

    private ArrayList a;
    private JSONObject b;
    private afP c;
    private int d;

    public agp(Context context, String s, afP afp)
    {
        c = afp;
        a(context, s);
        Collections.sort(a, new Comparator() {

            private static int a(JSONObject jsonobject, JSONObject jsonobject1)
            {
                int i;
                int j;
                try
                {
                    i = jsonobject.getInt("version");
                    j = jsonobject1.getInt("version");
                }
                // Misplaced declaration of an exception variable
                catch (JSONObject jsonobject)
                {
                    return 0;
                }
                // Misplaced declaration of an exception variable
                catch (JSONObject jsonobject)
                {
                    return 0;
                }
                if (i <= j);
                return 0;
            }

            public final int compare(Object obj, Object obj1)
            {
                return a((JSONObject)obj, (JSONObject)obj1);
            }

        });
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

    private static int a(JSONObject jsonobject)
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

    private static long a(JSONObject jsonobject, String s)
    {
        long l;
        try
        {
            l = jsonobject.getLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return 0L;
        }
        return l;
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
        d = c.c();
        int j;
        s = new JSONArray(s);
        j = c.c();
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

    public static boolean a(Context context, long l)
    {
        if (context != null) goto _L2; else goto _L1
_L1:
        long l1;
        return false;
_L2:
        if (l <= (l1 = (new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir)).lastModified() / 1000L) + 1800L) goto _L1; else goto _L3
_L3:
        return true;
        context;
        context.printStackTrace();
        return false;
    }

    private static String b(JSONObject jsonobject)
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

    public final String a()
    {
        return (new StringBuilder()).append(a(b, "shortversion", "")).append(" (").append(a(b, "version", "")).append(")").toString();
    }

    public final String b()
    {
        Date date = new Date(a(b, "timestamp") * 1000L);
        return (new SimpleDateFormat("dd.MM.yyyy")).format(date);
    }

    public final long c()
    {
        boolean flag = Boolean.valueOf(a(b, "external", "false")).booleanValue();
        long l1 = a(b, "appsize");
        long l = l1;
        if (flag)
        {
            l = l1;
            if (l1 == 0L)
            {
                l = -1L;
            }
        }
        return l;
    }

    public final String d()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<html>");
        stringbuilder.append("<body style='padding: 0px 0px 20px 0px'>");
        Iterator iterator = a.iterator();
        int i = 0;
        while (iterator.hasNext()) 
        {
            Object obj = (JSONObject)iterator.next();
            if (i > 0)
            {
                stringbuilder.append("<hr style='border-top: 1px solid #c8c8c8; border-bottom: 0px; margin: 40px 10px 0px 10px;' />");
            }
            StringBuilder stringbuilder1 = new StringBuilder();
            int j = a(b);
            int k = a(((JSONObject) (obj)));
            String s = b(((JSONObject) (obj)));
            stringbuilder1.append("<div style='padding: 20px 10px 10px;'><strong>");
            if (i == 0)
            {
                stringbuilder1.append("Newest version:");
            } else
            {
                stringbuilder1.append((new StringBuilder("Version ")).append(s).append(" (").append(k).append("): ").toString());
                if (k != j && k == d)
                {
                    d = -1;
                    stringbuilder1.append("[INSTALLED]");
                }
            }
            stringbuilder1.append("</strong></div>");
            stringbuilder.append(stringbuilder1.toString());
            stringbuilder1 = new StringBuilder();
            obj = a(((JSONObject) (obj)), "notes", "");
            stringbuilder1.append("<div style='padding: 0px 10px;'>");
            if (((String) (obj)).trim().length() == 0)
            {
                stringbuilder1.append("<em>No information.</em>");
            } else
            {
                stringbuilder1.append(((String) (obj)));
            }
            stringbuilder1.append("</div>");
            stringbuilder.append(stringbuilder1.toString());
            i++;
        }
        stringbuilder.append("</body>");
        stringbuilder.append("</html>");
        return stringbuilder.toString();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class ans
{

    private static final ani a[] = new ani[0];
    private static final ann b[] = new ann[0];
    private static final ano c[] = new ano[0];
    private final anr d;

    public ans()
    {
        this(((anr) (new anw())));
    }

    private ans(anr anr1)
    {
        d = anr1;
    }

    public static ank a(JSONObject jsonobject)
    {
        return new ank(jsonobject.optInt("orientation"), jsonobject.optLong("total_physical_memory"), jsonobject.optLong("total_internal_storage"), jsonobject.optLong("available_physical_memory"), jsonobject.optLong("available_internal_storage"), jsonobject.optInt("battery"), jsonobject.optInt("battery_velocity", 1), jsonobject.optBoolean("proximity_enabled", false));
    }

    private static File a(File file)
    {
        Object obj = file;
        if (file.getAbsolutePath().startsWith("/data"))
        {
            try
            {
                obj = ((gyh) (anq.f())).k;
                obj = new File(((Context) (obj)).getPackageManager().getApplicationInfo(((Context) (obj)).getPackageName(), 0).nativeLibraryDir, file.getName());
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                gya.a().c("JsonCrashDataParser", "Error getting ApplicationInfo", namenotfoundexception);
                return file;
            }
        }
        return ((File) (obj));
    }

    public static anj[] a(String s)
    {
        return (new anj[] {
            new anj("json_session", s)
        });
    }

    private static ano[] a(JSONObject jsonobject, int i)
    {
        JSONArray jsonarray = jsonobject.optJSONArray("frames");
        if (jsonarray != null) goto _L2; else goto _L1
_L1:
        jsonobject = c;
_L4:
        return jsonobject;
_L2:
        int k = jsonarray.length();
        ano aano[] = new ano[k];
        int j = 0;
        do
        {
            jsonobject = aano;
            if (j >= k)
            {
                continue;
            }
            jsonobject = jsonarray.optJSONObject(j);
            long l = jsonobject.optLong("pc");
            String s = jsonobject.optString("symbol");
            jsonobject = s;
            if (s == null)
            {
                jsonobject = "";
            }
            aano[j] = new ano(l, jsonobject, "", i);
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static anm b(JSONObject jsonobject)
    {
        return new anm(jsonobject.optString("sig_name", ""), jsonobject.optString("sig_code", ""), jsonobject.optLong("si_addr"));
    }

    public static ann[] d(JSONObject jsonobject)
    {
        jsonobject = jsonobject.optJSONArray("threads");
        if (jsonobject == null)
        {
            return b;
        }
        int j = jsonobject.length();
        ann aann[] = new ann[j];
        int i = 0;
        while (i < j) 
        {
            JSONObject jsonobject1 = jsonobject.optJSONObject(i);
            String s = jsonobject1.optString("name");
            byte byte0;
            if (jsonobject1.optBoolean("crashed"))
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            aann[i] = new ann(s, byte0, a(jsonobject1, byte0));
            i++;
        }
        return aann;
    }

    public final ani[] c(JSONObject jsonobject)
    {
        JSONArray jsonarray = jsonobject.optJSONArray("maps");
        if (jsonarray == null)
        {
            return a;
        }
        LinkedList linkedlist = new LinkedList();
        int i = 0;
        while (i < jsonarray.length()) 
        {
            anu anu1 = anv.a(jsonarray.optString(i));
            if (anu1 != null)
            {
                String s = anu1.c;
                File file = new File(s);
                jsonobject = file;
                if (!file.exists())
                {
                    jsonobject = a(file);
                }
                try
                {
                    jsonobject = d.a(jsonobject);
                    linkedlist.add(new ani(anu1.a, anu1.b, s, jsonobject));
                }
                // Misplaced declaration of an exception variable
                catch (JSONObject jsonobject)
                {
                    gya.a().a("JsonCrashDataParser", (new StringBuilder("Could not generate ID for file ")).append(anu1.c).toString(), jsonobject);
                }
            }
            i++;
        }
        return (ani[])linkedlist.toArray(new ani[linkedlist.size()]);
    }

}

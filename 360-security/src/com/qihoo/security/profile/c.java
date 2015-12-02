// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.profile;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.SparseArray;
import com.qihoo360.mobilesafe.core.d.d;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.qihoo.security.profile:
//            f, m

class c
    implements f
{

    Context a;
    private boolean b;

    c(Context context)
    {
        a = context.getApplicationContext();
    }

    private final JSONObject a(ProfileDataKeeper.Sample sample)
    {
        JSONObject jsonobject;
        JSONArray jsonarray;
        JSONObject jsonobject1;
        int i;
        int j;
        try
        {
            jsonobject = new JSONObject();
            jsonobject.put("ts", sample.a);
            jsonobject.put("dur", sample.b);
            jsonobject.put("tr", sample.c);
            jsonobject.put("tag", sample.d);
            sample = sample.e;
        }
        // Misplaced declaration of an exception variable
        catch (ProfileDataKeeper.Sample sample)
        {
            return null;
        }
        if (sample == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        jsonarray = new JSONArray();
        j = sample.size();
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject1 = new JSONObject();
        jsonobject1.put("t", sample.keyAt(i));
        jsonobject1.put("v", sample.valueAt(i));
        jsonarray.put(jsonobject1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        jsonobject.put("dat", jsonarray);
        return jsonobject;
    }

    private final void a(List list, File file)
        throws Exception
    {
        if (file.exists())
        {
            file.delete();
        }
        file.mkdir();
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("timestamp", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(Calendar.getInstance().getTime()));
        if (Build.MODEL != null)
        {
            jsonobject.put("model", Build.MODEL);
        }
        jsonobject.put("mem", com.qihoo360.mobilesafe.core.d.d.a());
        if (Build.FINGERPRINT != null)
        {
            jsonobject.put("fingerprint", Build.FINGERPRINT);
        }
        jsonobject.put("sdk", android.os.Build.VERSION.SDK_INT);
        JSONArray jsonarray = new JSONArray();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            JSONObject jsonobject1 = a((ProfileDataKeeper.Sample)list.next());
            if (jsonobject1 != null)
            {
                jsonarray.put(jsonobject1);
            }
        } while (true);
        jsonobject.put("samples", jsonarray);
        list = new FileWriter(new File(file, "pf.txt"));
        list.write(jsonobject.toString());
        list.close();
    }

    public boolean a()
    {
        return b;
    }

    public boolean a(List list)
    {
        if (list == null || list.isEmpty())
        {
            return false;
        }
        int i;
        int j;
        long l;
        long l1;
        i = d();
        j = list.size();
        l = ((ProfileDataKeeper.Sample)list.get(0)).a;
        l1 = ((ProfileDataKeeper.Sample)list.get(j - 1)).a;
        if (j <= f() || l1 - l <= 0x5265c00L)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        for (; !list.isEmpty() && (list.size() > i || ((ProfileDataKeeper.Sample)list.get(0)).a < l1 - 0x5265c00L); list.remove(0)) { }
        File file = new File(a.getFilesDir(), "pf");
        a(list, file);
        list.clear();
        (new m(a)).a(file);
        return true;
        list;
        return false;
    }

    public void b()
    {
        boolean flag = true;
        Object obj = a.getSharedPreferences("pf_config", 0);
        long l = ((SharedPreferences) (obj)).getLong("last_updatetime", -1L);
        long l1 = System.currentTimeMillis() / 1000L;
        if (l1 < l || l1 - l > 0x15180L)
        {
            if ((new Random(l1)).nextInt(100) >= 1)
            {
                flag = false;
            }
            b = flag;
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putBoolean("enabled", b);
            ((android.content.SharedPreferences.Editor) (obj)).putLong("last_updatetime", l1);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
            return;
        } else
        {
            b = ((SharedPreferences) (obj)).getBoolean("enabled", false);
            return;
        }
    }

    public long c()
    {
        return 0x493e0L;
    }

    public int d()
    {
        return 512;
    }

    public long e()
    {
        return 0x1b7740L;
    }

    public int f()
    {
        return 64;
    }
}

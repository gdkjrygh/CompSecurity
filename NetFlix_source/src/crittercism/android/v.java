// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import com.crittercism.app.CrittercismConfig;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            s, m, l, i

public final class v extends s
{
    public static final class a
        implements FilenameFilter
    {

        private String a;

        public final boolean accept(File file, String s1)
        {
            return s1.endsWith(a);
        }

        public a(String s1)
        {
            a = new String();
            if (s1 != null)
            {
                a = s1;
            }
        }
    }


    public v(m m1)
    {
        this((new StringBuilder()).append(m1.a()).append("/android_v2/ndk_crash").toString());
    }

    private v(String s1)
    {
        a = s1;
        b = new Vector();
    }

    public static v a(m m1)
    {
        m1 = new v((new StringBuilder()).append(m1.a()).append("/android_v2/ndk_crash").toString());
        Object obj;
        Object obj1;
        String as[];
        Vector vector;
        int j;
        try
        {
            obj1 = l.i().f;
            obj = (new StringBuilder()).append(((Context) (obj1)).getFilesDir().getAbsolutePath()).append("/").append(l.i().t.getNativeDumpPath()).toString();
            obj1 = ((Context) (obj1)).getPackageName();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return m1;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        if (((String) (obj1)).equals(""))
        {
            break MISSING_BLOCK_LABEL_227;
        }
        obj = new File(((String) (obj)));
        if (!((File) (obj)).exists())
        {
            break MISSING_BLOCK_LABEL_227;
        }
        as = ((File) (obj)).list(new a(".dmp"));
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        if (as.length <= 0)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        vector = new Vector();
        j = 0;
_L2:
        if (j >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        (new StringBuilder("filename = ")).append(((File) (obj)).getAbsolutePath()).append("/").append(as[j]);
        vector.add((new StringBuilder()).append(((File) (obj)).getAbsolutePath()).append("/").append(as[j]).toString());
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        m1.a(((Collection) (vector)));
        return m1;
    }

    public final void a()
    {
        try
        {
            if (b != null)
            {
                String s1;
                for (Iterator iterator = b.iterator(); iterator.hasNext(); (new File(s1)).delete())
                {
                    s1 = (String)iterator.next();
                    (new StringBuilder("deleting filename: ")).append(s1);
                }

            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public final void a(JSONObject jsonobject)
    {
    }

    public final JSONObject b()
    {
        Object obj;
        JSONObject jsonobject1 = new JSONObject();
        new JSONObject();
        new JSONArray();
        JSONObject jsonobject;
        try
        {
            obj = new JSONArray(b);
        }
        catch (Exception exception)
        {
            exception = new JSONArray();
        }
        jsonobject = l.i().c.d();
        jsonobject.put("app_state", l.i().c.f());
        jsonobject.put("num_ndk_crashes", b.size());
        jsonobject.put("filenames", obj);
        jsonobject.put("filename_prefix", "ndk_crash_");
        obj = jsonobject;
_L1:
        Exception exception1;
        try
        {
            jsonobject1.put("requestUrl", a);
            jsonobject1.put("requestData", obj);
        }
        catch (Exception exception2)
        {
            return new JSONObject();
        }
        return jsonobject1;
        exception1;
        exception1 = new JSONObject();
          goto _L1
    }

    public final void c()
    {
    }

    public final JSONObject d()
    {
        return null;
    }

    protected final void e()
    {
    }
}

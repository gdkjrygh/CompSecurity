// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            am, dd, de, df, 
//            ep

public class dc
    implements IPutIntoJson
{

    private static final String b;
    public final de a;
    private final Integer c;
    private final String d;
    private final String e;
    private final df f;

    private dc(Integer integer, String s, String s1, df df1, de de1)
    {
        c = integer;
        d = s;
        e = s1;
        f = df1;
        a = de1;
    }

    public static dc a(JSONObject jsonobject)
    {
        de de1;
        df df1;
        String s;
        String s1;
        Integer integer;
        am aam[];
        int i;
        int j;
        de1 = null;
        aam = am.values();
        j = aam.length;
        i = 0;
        s1 = null;
        df1 = null;
        s = null;
        integer = null;
_L8:
        Object obj;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_388;
        }
        obj = aam[i];
        dd.a[((am) (obj)).ordinal()];
        JVM INSTR tableswitch 1 5: default 84
    //                   1 148
    //                   2 206
    //                   3 264
    //                   4 325
    //                   5 357;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_357;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        String s2;
        String s3;
        df df2;
        de de2;
        AppboyLogger.e(b, String.format("Unknown key encountered in WearDevice createFromJson %s", new Object[] {
            obj
        }));
        de2 = de1;
        df2 = df1;
        s3 = s;
        s2 = s1;
        obj = integer;
_L9:
        i++;
        integer = ((Integer) (obj));
        s1 = s2;
        s = s3;
        df1 = df2;
        de1 = de2;
        if (true) goto _L8; else goto _L7
_L7:
        JSONObject jsonobject1 = jsonobject.optJSONObject(am.d.f);
        obj = integer;
        s2 = s1;
        s3 = s;
        df2 = df1;
        de2 = de1;
        if (jsonobject1 != null)
        {
            de2 = de.a(jsonobject1);
            obj = integer;
            s2 = s1;
            s3 = s;
            df2 = df1;
        }
          goto _L9
_L3:
        JSONObject jsonobject2 = jsonobject.optJSONObject(am.c.f);
        obj = integer;
        s2 = s1;
        s3 = s;
        df2 = df1;
        de2 = de1;
        if (jsonobject2 != null)
        {
            df2 = df.b(jsonobject2);
            obj = integer;
            s2 = s1;
            s3 = s;
            de2 = de1;
        }
          goto _L9
_L4:
        obj = integer;
        s2 = s1;
        s3 = s;
        df2 = df1;
        de2 = de1;
        if (jsonobject.has(am.a.f))
        {
            obj = Integer.valueOf(jsonobject.optInt(am.a.f));
            s2 = s1;
            s3 = s;
            df2 = df1;
            de2 = de1;
        }
          goto _L9
_L5:
        s3 = ep.d(jsonobject.optString(am.b.f));
        obj = integer;
        s2 = s1;
        df2 = df1;
        de2 = de1;
          goto _L9
        s2 = ep.d(jsonobject.optString(am.e.f));
        obj = integer;
        s3 = s;
        df2 = df1;
        de2 = de1;
          goto _L9
        return new dc(integer, s1, s, df1, de1);
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.putOpt(am.a.f, c);
            jsonobject.putOpt(am.b.f, e);
            jsonobject.putOpt(am.e.f, d);
            if (f != null)
            {
                jsonobject.putOpt(am.c.f, f.a());
            }
            if (a != null)
            {
                jsonobject.putOpt(am.d.f, a.a());
            }
        }
        catch (JSONException jsonexception)
        {
            AppboyLogger.e(b, "Caught exception creating wear device Json.", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    public Object forJsonPut()
    {
        return a();
    }

    static 
    {
        b = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/dc.getName()
        });
    }
}

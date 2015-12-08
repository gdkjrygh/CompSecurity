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
//            ar, dj, dk, dl, 
//            ev

public class di
    implements IPutIntoJson
{

    private static final String b;
    public final dk a;
    private final Integer c;
    private final String d;
    private final String e;
    private final dl f;

    private di(Integer integer, String s, String s1, dl dl1, dk dk1)
    {
        c = integer;
        d = s;
        e = s1;
        f = dl1;
        a = dk1;
    }

    public static di a(JSONObject jsonobject)
    {
        dk dk1;
        dl dl1;
        String s;
        String s1;
        Integer integer;
        ar aar[];
        int i;
        int j;
        dk1 = null;
        aar = ar.values();
        j = aar.length;
        i = 0;
        s1 = null;
        dl1 = null;
        s = null;
        integer = null;
_L8:
        Object obj;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_388;
        }
        obj = aar[i];
        dj.a[((ar) (obj)).ordinal()];
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
        dl dl2;
        dk dk2;
        AppboyLogger.e(b, String.format("Unknown key encountered in WearDevice createFromJson %s", new Object[] {
            obj
        }));
        dk2 = dk1;
        dl2 = dl1;
        s3 = s;
        s2 = s1;
        obj = integer;
_L9:
        i++;
        integer = ((Integer) (obj));
        s1 = s2;
        s = s3;
        dl1 = dl2;
        dk1 = dk2;
        if (true) goto _L8; else goto _L7
_L7:
        JSONObject jsonobject1 = jsonobject.optJSONObject(ar.d.f);
        obj = integer;
        s2 = s1;
        s3 = s;
        dl2 = dl1;
        dk2 = dk1;
        if (jsonobject1 != null)
        {
            dk2 = dk.a(jsonobject1);
            obj = integer;
            s2 = s1;
            s3 = s;
            dl2 = dl1;
        }
          goto _L9
_L3:
        JSONObject jsonobject2 = jsonobject.optJSONObject(ar.c.f);
        obj = integer;
        s2 = s1;
        s3 = s;
        dl2 = dl1;
        dk2 = dk1;
        if (jsonobject2 != null)
        {
            dl2 = dl.b(jsonobject2);
            obj = integer;
            s2 = s1;
            s3 = s;
            dk2 = dk1;
        }
          goto _L9
_L4:
        obj = integer;
        s2 = s1;
        s3 = s;
        dl2 = dl1;
        dk2 = dk1;
        if (jsonobject.has(ar.a.f))
        {
            obj = Integer.valueOf(jsonobject.optInt(ar.a.f));
            s2 = s1;
            s3 = s;
            dl2 = dl1;
            dk2 = dk1;
        }
          goto _L9
_L5:
        s3 = ev.d(jsonobject.optString(ar.b.f));
        obj = integer;
        s2 = s1;
        dl2 = dl1;
        dk2 = dk1;
          goto _L9
        s2 = ev.d(jsonobject.optString(ar.e.f));
        obj = integer;
        s3 = s;
        dl2 = dl1;
        dk2 = dk1;
          goto _L9
        return new di(integer, s1, s, dl1, dk1);
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.putOpt(ar.a.f, c);
            jsonobject.putOpt(ar.b.f, e);
            jsonobject.putOpt(ar.e.f, d);
            if (f != null)
            {
                jsonobject.putOpt(ar.c.f, f.a());
            }
            if (a != null)
            {
                jsonobject.putOpt(ar.d.f, a.a());
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
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/di.getName()
        });
    }
}

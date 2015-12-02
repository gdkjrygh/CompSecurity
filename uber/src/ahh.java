// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ahh
    implements Callable
{

    private static final long a;
    private final Context b;
    private final ajn c;
    private final oh d;
    private final amb e;
    private final aqn f;
    private final Object g = new Object();
    private final aio h;
    private boolean i;
    private int j;
    private List k;

    public ahh(Context context, oh oh, aqn aqn1, ajn ajn1, amb amb, aio aio1)
    {
        b = context;
        d = oh;
        c = ajn1;
        f = aqn1;
        h = aio1;
        e = amb;
        i = false;
        j = -2;
        k = null;
    }

    private aci a(aql aql1, ahi ahi1, JSONObject jsonobject)
    {
        if (a())
        {
            return null;
        }
        List list = b(jsonobject.getJSONObject("tracking_urls_and_actions"), "impression_tracking_urls");
        if (list == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(list);
        }
        k = list;
        ahi1 = ahi1.a(this, jsonobject);
        if (ahi1 == null)
        {
            of.b("Failed to retrieve ad assets.");
            return null;
        } else
        {
            ahi1.a(new ach(b, d, aql1, e, jsonobject, ahi1));
            return ahi1;
        }
    }

    private ain a(aci aci1)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        int i1 = j;
        int l;
        l = i1;
        if (aci1 != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        l = i1;
        if (j == -2)
        {
            l = 0;
        }
        obj;
        JVM INSTR monitorexit ;
        if (l != -2)
        {
            aci1 = null;
        }
        return new ain(h.a.c, null, h.b.d, l, h.b.f, k, h.b.l, h.b.k, h.a.i, false, null, null, null, null, null, 0L, h.d, h.b.g, h.f, h.g, h.b.o, h.h, aci1, h.a.x);
        aci1;
        obj;
        JVM INSTR monitorexit ;
        throw aci1;
    }

    private static Integer a(JSONObject jsonobject, String s)
    {
        int l;
        try
        {
            jsonobject = jsonobject.getJSONObject(s);
            l = Color.rgb(jsonobject.getInt("r"), jsonobject.getInt("g"), jsonobject.getInt("b"));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return Integer.valueOf(l);
    }

    private JSONObject a(aql aql1)
    {
        if (a())
        {
            return null;
        } else
        {
            ajs ajs1 = new ajs();
            ahj ahj1 = new ahj(this);
            _cls1 _lcls1 = new _cls1(aql1, ahj1, ajs1);
            ahj1.a = _lcls1;
            aql1.a("/nativeAdPreProcess", _lcls1);
            aql1.a("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(h.b.c));
            return (JSONObject)ajs1.get(a, TimeUnit.MILLISECONDS);
        }
    }

    private ahi b(JSONObject jsonobject)
    {
        if (a())
        {
            return null;
        }
        jsonobject = jsonobject.getString("template_id");
        if ("2".equals(jsonobject))
        {
            return new ahk();
        }
        if ("1".equals(jsonobject))
        {
            return new ahl();
        } else
        {
            a(0);
            return null;
        }
    }

    private ain b()
    {
        Object obj;
        obj = c();
        JSONObject jsonobject = a(((aql) (obj)));
        obj = a(a(((aql) (obj)), b(jsonobject), jsonobject));
        return ((ain) (obj));
        Object obj1;
        obj1;
        of.d("Malformed native JSON response.", ((Throwable) (obj1)));
_L2:
        if (!i)
        {
            a(0);
        }
        return a(((aci) (null)));
        obj1;
        of.d("Timeout when loading native ad.", ((Throwable) (obj1)));
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String[] b(JSONObject jsonobject, String s)
    {
        jsonobject = jsonobject.optJSONArray(s);
        if (jsonobject == null)
        {
            return null;
        }
        s = new String[jsonobject.length()];
        for (int l = 0; l < jsonobject.length(); l++)
        {
            s[l] = jsonobject.getString(l);
        }

        return s;
    }

    private aql c()
    {
        if (a())
        {
            return null;
        }
        String s = (String)abn.O.c();
        Object obj;
        if (h.b.b.indexOf("https") == 0)
        {
            obj = "https:";
        } else
        {
            obj = "http:";
        }
        obj = (new StringBuilder()).append(((String) (obj))).append(s).toString();
        obj = (aql)f.a(b, h.a.k, ((String) (obj))).get(a, TimeUnit.MILLISECONDS);
        ((aql) (obj)).a(d, d, d, d, d, d, d);
        return ((aql) (obj));
    }

    public final ajw a(JSONObject jsonobject)
    {
        jsonobject = jsonobject.optJSONObject("attribution");
        if (jsonobject == null)
        {
            return new ajt();
        } else
        {
            String s = jsonobject.optString("text");
            int l = jsonobject.optInt("text_size", -1);
            Integer integer = a(jsonobject, "text_color");
            Integer integer1 = a(jsonobject, "bg_color");
            return aju.a(a(jsonobject, "image", false), new _cls2(s, integer1, integer, l));
        }
    }

    public final ajw a(JSONObject jsonobject, String s, boolean flag)
    {
        if (flag)
        {
            jsonobject = jsonobject.getJSONObject(s);
        } else
        {
            jsonobject = jsonobject.optJSONObject(s);
        }
        s = jsonobject;
        if (jsonobject == null)
        {
            s = new JSONObject();
        }
        if (flag)
        {
            jsonobject = s.getString("url");
        } else
        {
            jsonobject = s.optString("url");
        }
        if (TextUtils.isEmpty(jsonobject))
        {
            a(0, flag);
            return new ajt();
        } else
        {
            return c.a(jsonobject, new _cls3(flag));
        }
    }

    public final void a(int l)
    {
        synchronized (g)
        {
            i = true;
            j = l;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int l, boolean flag)
    {
        if (flag)
        {
            a(l);
        }
    }

    public final boolean a()
    {
        boolean flag;
        synchronized (g)
        {
            flag = i;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Object call()
    {
        return b();
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(60L);
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}

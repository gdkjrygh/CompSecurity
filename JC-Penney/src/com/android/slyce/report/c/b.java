// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.slyce.report.mpmetrics.af;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.report.c:
//            at, d, e, f

class b
    implements at
{

    private static String e = "MixpanelAPI.DynamicEventTracker";
    private final af a;
    private final Handler b;
    private final Runnable c = new d(this, null);
    private final Map d = new HashMap();

    public b(af af1, Handler handler)
    {
        a = af1;
        b = handler;
    }

    private static String a(View view)
    {
        Object obj = null;
        String s;
        if (view instanceof TextView)
        {
            view = ((TextView)view).getText();
            s = obj;
            if (view != null)
            {
                s = view.toString();
            }
        } else
        {
            s = obj;
            if (view instanceof ViewGroup)
            {
                StringBuilder stringbuilder = new StringBuilder();
                view = (ViewGroup)view;
                int j = view.getChildCount();
                int i = 0;
                boolean flag;
                boolean flag1;
                for (flag = false; i < j && stringbuilder.length() < 128; flag = flag1)
                {
                    s = a(view.getChildAt(i));
                    flag1 = flag;
                    if (s != null)
                    {
                        flag1 = flag;
                        if (s.length() > 0)
                        {
                            if (flag)
                            {
                                stringbuilder.append(", ");
                            }
                            stringbuilder.append(s);
                            flag1 = true;
                        }
                    }
                    i++;
                }

                if (stringbuilder.length() > 128)
                {
                    return stringbuilder.substring(0, 128);
                }
                s = obj;
                if (flag)
                {
                    return stringbuilder.toString();
                }
            }
        }
        return s;
    }

    static Map a(b b1)
    {
        return b1.d;
    }

    static af b(b b1)
    {
        return b1.a;
    }

    static Handler c(b b1)
    {
        return b1.b;
    }

    public void a(View view, String s, boolean flag)
    {
        Object obj;
        long l = System.currentTimeMillis();
        obj = new JSONObject();
        try
        {
            ((JSONObject) (obj)).put("$text", a(view));
            ((JSONObject) (obj)).put("$from_binding", true);
            ((JSONObject) (obj)).put("time", l / 1000L);
        }
        catch (JSONException jsonexception)
        {
            Log.e(e, "Can't format properties from view due to JSON issue", jsonexception);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        view = new e(view, s);
        obj = new f(s, ((JSONObject) (obj)), l);
        s = d;
        s;
        JVM INSTR monitorenter ;
        flag = d.isEmpty();
        d.put(view, obj);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        b.postDelayed(c, 1000L);
        s;
        JVM INSTR monitorexit ;
        return;
        view;
        s;
        JVM INSTR monitorexit ;
        throw view;
        a.a(s, ((JSONObject) (obj)));
        return;
    }

}

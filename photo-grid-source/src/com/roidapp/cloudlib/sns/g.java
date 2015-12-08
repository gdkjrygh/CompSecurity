// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import android.app.Application;
import android.text.TextUtils;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.c.x;
import com.roidapp.baselib.e.i;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            o, x, w

public final class g extends o
{

    private long e;

    public g(w w)
    {
        super("https://cmbackup.cmcm.com/v2/batch", i.b, new com.roidapp.cloudlib.sns.x(w));
        a(false);
        l();
    }

    private String u()
    {
        Object obj = null;
        String s = android.provider.Settings.Secure.getString(aj.a().getContentResolver(), "android_id");
        obj = s;
_L2:
        String s1 = ((String) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            s1 = UUID.randomUUID().toString();
        }
        obj = new JSONObject();
        ((JSONObject) (obj)).put("uuid", s1);
        ((JSONObject) (obj)).put("cnl", "89d3a1d6d3aaf135e120cb3ff19ab3f3");
        ((JSONObject) (obj)).put("cv", n.d(aj.a()));
        obj = String.format(Locale.ENGLISH, "{\"user\":{},\"device\":%s,\"tstamp\":\"%s\",\"ops\":{\"/invite/getpubcode\":{}}}", new Object[] {
            ((JSONObject) (obj)).toString(), String.valueOf(System.currentTimeMillis())
        });
        e = n.b((new StringBuilder()).append(((String) (obj))).append("3fb9b607905d870e352c963c11f65a8a").toString()) & 0xffffffffL;
        return ((String) (obj));
        Exception exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final Object a(String s, boolean flag)
    {
        return (new JSONObject(s)).getJSONObject("data").getJSONObject("/invite/getpubcode").getString("invcode");
    }

    protected final x[] e()
    {
        if (e != 0x8000000000000000L)
        {
            return (new x[] {
                new x("Vc", String.valueOf(e))
            });
        } else
        {
            return super.e();
        }
    }

    public final void run()
    {
        try
        {
            a(u());
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        super.run();
    }
}

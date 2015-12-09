// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Message;
import android.util.Log;
import com.mixpanel.android.mpmetrics.MPDbAdapter;
import com.mixpanel.android.util.RemoteService;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class cwv
{

    private static final Map d = new HashMap();
    public final cwx a = new cwx(this);
    protected final Context b;
    protected final cxi c;

    private cwv(Context context)
    {
        b = context;
        c = cxi.a(context);
    }

    protected static RemoteService a()
    {
        return new cym();
    }

    public static cwv a(Context context)
    {
        Map map = d;
        map;
        JVM INSTR monitorenter ;
        Context context1;
        context1 = context.getApplicationContext();
        if (d.containsKey(context1))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        context = new cwv(context1);
        d.put(context1, context);
_L2:
        return context;
        context = (cwv)d.get(context1);
        if (true) goto _L2; else goto _L1
_L1:
        context;
        map;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void a(String s)
    {
        if (cxi.a)
        {
            Log.v("MixpanelAPI.Messages", (new StringBuilder()).append(s).append(" (Thread ").append(Thread.currentThread().getId()).append(")").toString());
        }
    }

    static void a(String s, Throwable throwable)
    {
        if (cxi.a)
        {
            Log.v("MixpanelAPI.Messages", (new StringBuilder()).append(s).append(" (Thread ").append(Thread.currentThread().getId()).append(")").toString(), throwable);
        }
    }

    protected static MPDbAdapter b(Context context)
    {
        return new MPDbAdapter(context);
    }

    public final void a(JSONObject jsonobject)
    {
        Message message = Message.obtain();
        message.what = 0;
        message.obj = jsonobject;
        a.a(message);
    }

}

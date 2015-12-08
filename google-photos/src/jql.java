// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;

public class jql extends Service
{

    private static Boolean b;
    private Handler a;

    public jql()
    {
    }

    public static boolean a(Context context)
    {
        b.d(context);
        if (b != null)
        {
            return b.booleanValue();
        } else
        {
            boolean flag = jtk.a(context, jql);
            b = Boolean.valueOf(flag);
            return flag;
        }
    }

    protected final void a(jso jso1, Handler handler, int i)
    {
        handler.post(new jqo(this, i, jso1));
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        jrk.a(this).a().b("CampaignTrackingService is starting up");
    }

    public void onDestroy()
    {
        jrk.a(this).a().b("CampaignTrackingService is shutting down");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        Object obj = jqk.a;
        obj;
        JVM INSTR monitorenter ;
        lpf lpf1 = jqk.b;
        if (lpf1 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (lpf1.a.isHeld())
        {
            lpf1.a();
        }
        obj;
        JVM INSTR monitorexit ;
_L1:
        jrk jrk1;
        jso jso1;
        jrk1 = jrk.a(this);
        jso1 = jrk1.a();
        obj = null;
        Handler handler;
        Exception exception;
        if (kbe.a)
        {
            jso1.f("Unexpected installation campaign (package side)");
            intent = ((Intent) (obj));
        } else
        {
            intent = intent.getStringExtra("referrer");
        }
        handler = a;
        obj = handler;
        if (handler == null)
        {
            obj = new Handler(getMainLooper());
            a = ((Handler) (obj));
        }
        if (TextUtils.isEmpty(intent))
        {
            if (!kbe.a)
            {
                jso1.e("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
            }
            jrk1.b().a(new jqm(this, jso1, ((Handler) (obj)), j));
            return 2;
        }
        break MISSING_BLOCK_LABEL_169;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
          goto _L1
        i = jsh.c();
        if (intent.length() > i)
        {
            jso1.c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(intent.length()), Integer.valueOf(i));
            intent = intent.substring(0, i);
        }
        jso1.a("CampaignTrackingService called. startId, campaign", Integer.valueOf(j), intent);
        jrk1.c().a(intent, new jqn(this, jso1, ((Handler) (obj)), j));
        return 2;
    }
}

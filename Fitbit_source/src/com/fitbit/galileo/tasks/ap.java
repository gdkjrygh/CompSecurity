// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.exceptions.ServerResponseException;
import com.fitbit.data.bl.exceptions.SynclairBackOffException;
import com.fitbit.e.a;
import com.fitbit.galileo.bluetooth.f;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.SynclairApi;
import com.fitbit.synclair.d;
import com.fitbit.util.threading.FitbitHandlerThread;
import java.io.IOException;
import org.json.JSONException;

public abstract class ap extends f
    implements android.os.Handler.Callback
{

    private static final String a = "SynclairApiTask";
    private static final int b = 0;
    private static final int c = 1;
    public static final String e = "EXTRA_SYNCLAIR_ERROR";
    public static final String f = "SYNCLAIR_ERROR_NOT_PAIRED";
    public static final String g = "SYNCLAIR_ERROR_INVALID_SECRET";
    public static final String h = "SYNCLAIR_ERROR_BACKOFF";
    public static final String i = "SYNCLAIR_ERROR_LOW_BATTERY";
    private final SynclairApi d;
    private final Handler j;
    private boolean k;

    public ap()
    {
        this(ServerGateway.a());
    }

    public ap(ServerGateway servergateway)
    {
        d = new SynclairApi(servergateway);
        j = new Handler(this);
    }

    static Intent a(ap ap1)
    {
        return ap1.g();
    }

    static Handler b(ap ap1)
    {
        return ap1.j;
    }

    static SynclairApi c(ap ap1)
    {
        return ap1.d;
    }

    static String d(ap ap1)
    {
        return ap1.c();
    }

    static String e(ap ap1)
    {
        return ap1.c();
    }

    static String f(ap ap1)
    {
        return ap1.c();
    }

    private Intent g()
    {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_SYNCLAIR_ERROR", "SYNCLAIR_ERROR_BACKOFF");
        return intent;
    }

    protected Intent a(ServerCommunicationException servercommunicationexception)
    {
        if (servercommunicationexception != null && (servercommunicationexception instanceof ServerResponseException) && ((ServerResponseException)servercommunicationexception).c() == com.fitbit.data.bl.exceptions.ServerResponseException.ErrorCode.d)
        {
            servercommunicationexception = new Intent();
            servercommunicationexception.putExtra("EXTRA_SYNCLAIR_ERROR", "SYNCLAIR_ERROR_NOT_PAIRED");
            return servercommunicationexception;
        } else
        {
            return null;
        }
    }

    protected void a()
    {
        TrackerSyncPreferencesSavedState.H();
    }

    protected void a(SynclairBackOffException synclairbackoffexception)
    {
        com.fitbit.synclair.d.a().b(synclairbackoffexception);
    }

    protected abstract void a(SynclairApi synclairapi)
        throws ServerCommunicationException, IOException, JSONException;

    protected final void b()
    {
    }

    protected final void d()
    {
        k = true;
        FitbitHandlerThread.a(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.c, new _cls1());
    }

    protected final void e()
    {
        if (k)
        {
            FitbitHandlerThread.a(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.c);
        }
    }

    protected boolean f()
    {
        if (!TrackerSyncPreferencesSavedState.D())
        {
            com.fitbit.e.a.a("SynclairApiTask", "+++++ ALL OPERATIONS ARE BACKED OFF. +++++", new Object[0]);
            return false;
        } else
        {
            return true;
        }
    }

    public boolean handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 30
    //                   1 41;
           goto _L1 _L2 _L3
_L1:
        return false;
_L2:
        o();
_L5:
        k = false;
        return true;
_L3:
        r();
        if (true) goto _L5; else goto _L4
_L4:
    }

    /* member class not found */
    class _cls1 {}

}

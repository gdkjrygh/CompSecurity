// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AccountManagerCallback;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.sony.snei.np.android.account.oauth.hide.BrowserResponseReceiver;
import com.sony.snei.np.android.common.oauth.exception.NpamReasonCodeException;

public abstract class dao extends dbh
{

    private final Object a = new Object();
    private final Context d;
    private final Handler e;

    public dao(Context context, AccountManagerCallback accountmanagercallback, Handler handler)
    {
        super(accountmanagercallback, handler);
        d = context;
        e = new Handler(context.getMainLooper());
    }

    public final Bundle a(Activity activity, Uri uri)
    {
        dbc dbc1;
        BrowserResponseReceiver browserresponsereceiver;
        browserresponsereceiver = new BrowserResponseReceiver(e, a);
        dbc1 = dbc.a();
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Intent intent;
        intent = new Intent((new StringBuilder()).append(d.getPackageName()).append(".NPAM_ACTION_BROWSER").toString());
        intent.putExtra("EGH", true);
        intent.putExtra("GnH", uri.toString());
        dbc1.a(browserresponsereceiver);
        activity.startActivity(intent);
        a.wait();
        dbc1.b();
        if (browserresponsereceiver.a.intValue() == 0)
        {
            int i = browserresponsereceiver.b.getInt("pD3", 0);
            if (i == 0)
            {
                throw new OperationCanceledException();
            } else
            {
                throw new NpamReasonCodeException(i);
            }
        } else
        {
            return browserresponsereceiver.b;
        }
        activity;
        dbt.a(dao.getSimpleName(), "Caught the exception. %s: %s", new Object[] {
            activity.getClass().getSimpleName(), activity.getMessage()
        });
        throw new OperationCanceledException(activity);
        activity;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw activity;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity) { }
        finally
        {
            dbc1.b();
        }
        throw new OperationCanceledException();
    }
}

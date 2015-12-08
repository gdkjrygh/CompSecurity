// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.activitylog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelUuid;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.View;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.e.a;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.s;
import com.fitbit.util.bf;
import java.util.UUID;

// Referenced classes of package com.fitbit.activity.ui.activitylog:
//            ActivityLogFormFragment

public class UpdateRecordedExerciseActivity extends FitbitActivity
    implements android.os.Handler.Callback, android.support.v4.app.LoaderManager.LoaderCallbacks, android.view.View.OnClickListener
{
    private static class a extends bf
    {

        private final UUID a;

        protected ActivityLogEntry a()
        {
            return ActivityBusinessLogic.a().a(a);
        }

        protected Object f_()
        {
            return a();
        }

        public a(Context context, UUID uuid)
        {
            super(context);
            a = uuid;
        }
    }

    private static class b extends bf
    {

        private final ActivityLogEntry a;
        private ServerCommunicationException b;

        public boolean a()
        {
            return b != null;
        }

        public ServerCommunicationException b()
        {
            return b;
        }

        protected ActivityLogEntry d()
        {
            ActivityLogEntry activitylogentry;
            try
            {
                activitylogentry = ActivityBusinessLogic.a().d(a);
            }
            catch (ServerCommunicationException servercommunicationexception)
            {
                b = servercommunicationexception;
                return null;
            }
            return activitylogentry;
        }

        protected Object f_()
        {
            return d();
        }

        protected void onReset()
        {
            super.onReset();
            b = null;
        }

        public b(Context context, ActivityLogEntry activitylogentry)
        {
            super(context);
            a = activitylogentry;
        }
    }


    private static final String a = com/fitbit/activity/ui/activitylog/UpdateRecordedExerciseActivity.getSimpleName();
    private static final String b = "UUID";
    private static final String c = "FRAGMENT_TAG";
    private static final int d = 0x7f110006;
    private static final int e = 0x7f110094;
    private static final int f = 0x7f11009d;
    private Handler g;

    public UpdateRecordedExerciseActivity()
    {
    }

    public static Intent a(Context context, ActivityLogEntry activitylogentry)
    {
        context = new Intent(context, com/fitbit/activity/ui/activitylog/UpdateRecordedExerciseActivity);
        context.putExtra("UUID", new ParcelUuid(activitylogentry.getUuid()));
        return context;
    }

    private void a(View view)
    {
        setResult(0);
        finish();
    }

    private void b(View view)
    {
        view = (ActivityLogFormFragment)getSupportFragmentManager().findFragmentByTag("FRAGMENT_TAG");
        ActivityLogEntry activitylogentry = new ActivityLogEntry();
        try
        {
            view.a(activitylogentry);
            getSupportLoaderManager().restartLoader(0x7f110094, getIntent().getExtras(), this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            s.a(this, view.getMessage(), 0).i();
        }
    }

    public void a(Loader loader, ActivityLogEntry activitylogentry)
    {
        switch (loader.getId())
        {
        default:
            return;

        case 2131820550: 
            g.sendMessage(g.obtainMessage(loader.getId(), activitylogentry));
            return;

        case 2131820692: 
            loader = (b)loader;
            break;
        }
        if (loader.a())
        {
            com.fitbit.e.a.f(a, "Exception while updating Activity Log Entry", loader.b(), new Object[0]);
            g.sendEmptyMessage(0x7f11009d);
            return;
        } else
        {
            setResult(-1);
            finish();
            return;
        }
    }

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 2131820550: 
            message = (ActivityLogEntry)message.obj;
            if (message == null)
            {
                finish();
            } else
            {
                getSupportFragmentManager().beginTransaction().replace(0x7f110009, com.fitbit.activity.ui.activitylog.ActivityLogFormFragment.a(message, 0x7f110006), "FRAGMENT_TAG").commit();
            }
            return true;

        case 2131820701: 
            s.a(this, getText(0x7f08018f), 0).i();
            return true;
        }
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131821018: 
            b(view);
            return;

        case 2131821019: 
            a(view);
            break;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        g = new Handler(this);
        setContentView(0x7f040051);
        getSupportLoaderManager().initLoader(0x7f110006, getIntent().getExtras(), this);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        Object obj = (ParcelUuid)bundle.getParcelable("UUID");
        switch (i)
        {
        default:
            return null;

        case 2131820550: 
            return new a(this, ((ParcelUuid) (obj)).getUuid());

        case 2131820692: 
            bundle = new ActivityLogEntry();
            break;
        }
        bundle.setUuid(((ParcelUuid) (obj)).getUuid());
        obj = (ActivityLogFormFragment)getSupportFragmentManager().findFragmentByTag("FRAGMENT_TAG");
        try
        {
            ((ActivityLogFormFragment) (obj)).a(bundle);
        }
        catch (ActivityLogFormFragment.ValidationException validationexception) { }
        return new b(this, bundle);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (ActivityLogEntry)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onSupportContentChanged()
    {
        super.onSupportContentChanged();
        findViewById(0x7f1101da).setOnClickListener(this);
        findViewById(0x7f1101db).setOnClickListener(this);
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.activitylog;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.Loader;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.ActivityItem;
import com.fitbit.e.a;
import com.fitbit.util.bf;

// Referenced classes of package com.fitbit.activity.ui.activitylog:
//            ActivityLogFormFragment

class b
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, com.fitbit.data.bl.h.a
{

    final ActivityLogFormFragment a;

    public b(ActivityLogFormFragment activitylogformfragment)
    {
        a = activitylogformfragment;
    }

    public void a(Loader loader, ActivityItem activityitem)
    {
        a.a(activityitem);
    }

    public boolean a()
    {
        return false;
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        long l = bundle.getLong("id");
        return new bf(a.getActivity(), l) {

            final long a;
            final b b;

            protected ActivityItem a()
            {
                ActivityItem activityitem;
                try
                {
                    activityitem = dg.d().b(a, b);
                }
                catch (ServerCommunicationException servercommunicationexception)
                {
                    com.fitbit.e.a.e("ServerError", "Could not load activity Item from ActivityLogEntry - disabling fields", servercommunicationexception, new Object[0]);
                    return null;
                }
                return activityitem;
            }

            protected Object f_()
            {
                return a();
            }

            
            {
                b = b.this;
                a = l;
                super(context);
            }
        };
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (ActivityItem)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }
}

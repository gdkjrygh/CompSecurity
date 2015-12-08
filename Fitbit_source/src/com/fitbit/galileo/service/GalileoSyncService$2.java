// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;

import android.os.AsyncTask;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.e.a;
import org.json.JSONException;

// Referenced classes of package com.fitbit.galileo.service:
//            GalileoSyncService

class a extends AsyncTask
{

    final GalileoSyncService a;

    protected transient Void a(Void avoid[])
    {
        try
        {
            dg.d().z(true, null);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            com.fitbit.e.a.a("GalileoSyncService", "Server communication error syncing bt support status", avoid, new Object[0]);
            avoid.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            com.fitbit.e.a.a("GalileoSyncService", "JSON error syncing bt support status", avoid, new Object[0]);
            avoid.printStackTrace();
            return null;
        }
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    nException(GalileoSyncService galileosyncservice)
    {
        a = galileosyncservice;
        super();
    }
}

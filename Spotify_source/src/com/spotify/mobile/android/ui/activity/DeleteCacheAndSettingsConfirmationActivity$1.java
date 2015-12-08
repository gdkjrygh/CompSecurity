// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.widget.Button;
import dmb;
import geh;
import gmt;
import java.io.File;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            DeleteCacheAndSettingsConfirmationActivity

final class b extends AsyncTask
{

    private File a;
    private File b;
    private DeleteCacheAndSettingsConfirmationActivity c;

    private transient Long a()
    {
        long l = 0L;
        long l2 = SystemClock.elapsedRealtime();
        File file = a;
        File file1 = b;
        if (!gmt.a())
        {
            geh.a("This hits the file system");
        }
        if (file != null)
        {
            l = 0L + dmb.a(file);
        }
        long l1 = l;
        if (file1 != null)
        {
            l1 = l + dmb.a(file1);
        }
        l = SystemClock.elapsedRealtime() - l2;
        if (l < 2000L)
        {
            try
            {
                Thread.sleep(2000L - l);
            }
            catch (InterruptedException interruptedexception) { }
        }
        return Long.valueOf(l1);
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Long)obj;
        DeleteCacheAndSettingsConfirmationActivity.a(c).setEnabled(true);
        DeleteCacheAndSettingsConfirmationActivity.a(c, ((Long) (obj)).longValue());
    }

    Y(DeleteCacheAndSettingsConfirmationActivity deletecacheandsettingsconfirmationactivity, File file, File file1)
    {
        c = deletecacheandsettingsconfirmationactivity;
        a = file;
        b = file1;
        super();
    }
}

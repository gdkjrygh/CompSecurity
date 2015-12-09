// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.spotify.mobile.android.ui.activity.UpdateNagActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.music.update.AppVersion;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class fpj extends AsyncTask
{

    private final WeakReference a;

    public fpj(Context context)
    {
        a = new WeakReference(context);
    }

    private static transient Boolean a()
    {
        Object obj1 = (gqe)dmz.a(gqe);
        Object obj;
        obj = ((gqe) (obj1)).a;
        obj = ((Context) (obj)).getPackageManager().getInstallerPackageName(((Context) (obj)).getPackageName());
        if (obj != null) goto _L2; else goto _L1
_L1:
        Logger.c("UpdateNag: sourcePackageName has null source", new Object[0]);
        obj = com.spotify.music.update.AppVersion.Source.c;
_L5:
        AppVersion appversion;
        appversion = new AppVersion(((com.spotify.music.update.AppVersion.Source) (obj)), "armv7", -1L, 15, 0x8c08aa, -1L);
        obj = (gqf)dmz.a(gqf);
        if (((gdy)dmz.a(gdy)).a()) goto _L4; else goto _L3
_L3:
        Logger.a("UpdateNag: No internet connection. ", new Object[0]);
        obj = null;
_L6:
        long l;
        boolean flag;
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L9:
        return Boolean.valueOf(flag);
_L2:
label0:
        {
            if (!((String) (obj)).contains("com.android") && !((String) (obj)).contains("com.google"))
            {
                break label0;
            }
            obj = com.spotify.music.update.AppVersion.Source.a;
        }
          goto _L5
label1:
        {
            if (!((String) (obj)).contains("com.amazon"))
            {
                break label1;
            }
            obj = com.spotify.music.update.AppVersion.Source.b;
        }
          goto _L5
        Logger.c("UpdateNag: Unknown package source. Got src name : %s", new Object[] {
            obj
        });
        obj = com.spotify.music.update.AppVersion.Source.c;
          goto _L5
_L4:
        l = ((giq)dmz.a(giq)).a(((gqe) (obj1)).a).a(gqe.b, 0L);
        dmz.a(ggb);
        ggb.a();
        Exception exception;
        int i;
        if (gcf.a() < l)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        Logger.a("UpdateNag: Postponed pending update. ", new Object[0]);
        obj = null;
          goto _L6
        obj = new ArrayList(((gqf) (obj)).a());
        obj1 = ((giq)dmz.a(giq)).a(((gqe) (obj1)).a);
        dmz.a(ggb);
        ggb.a();
        l = gcf.a();
        ((gin) (obj1)).b().a(gqe.c, l).b();
        i = ((ArrayList) (obj)).indexOf(appversion);
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        Logger.a("UpdateNag: No suitable newer versions found.", new Object[0]);
        obj = null;
          goto _L6
        obj1 = (AppVersion)((ArrayList) (obj)).get(i);
        Logger.a("UpdateNag: Found candidate version to update client: %s", new Object[] {
            obj1
        });
        if (((AppVersion) (obj1)).c <= appversion.c || ((AppVersion) (obj1)).b > android.os.Build.VERSION.SDK_INT) goto _L8; else goto _L7
_L7:
        i = ((AppVersion) (obj1)).c;
        i = appversion.c;
        dmz.a(ggb);
        ggb.a();
        obj = obj1;
        if (gcf.a() > ((AppVersion) (obj1)).d + ((AppVersion) (obj1)).a) goto _L6; else goto _L8
_L8:
        Logger.a("UpdateNag: Compared versions UNsuccesfully: Candidate %s Current %s", new Object[] {
            Integer.valueOf(((AppVersion) (obj1)).c), Integer.valueOf(appversion.c)
        });
        dmz.a(ggb);
        ggb.a();
        Logger.a("UpdateNag: It is NOT time to update!: Time %s RelDate+Delay: %s", new Object[] {
            Long.valueOf(gcf.a()), Long.valueOf(((AppVersion) (obj1)).d + ((AppVersion) (obj1)).a)
        });
        obj = null;
          goto _L6
        exception;
        Assertion.a("Cannot fetch updates data.", exception);
        flag = false;
          goto _L9
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        if (((Boolean)obj).booleanValue())
        {
            obj = (Context)a.get();
            if (obj != null)
            {
                ((Context) (obj)).startActivity(new Intent(((Context) (obj)), com/spotify/mobile/android/ui/activity/UpdateNagActivity));
            }
        }
    }
}

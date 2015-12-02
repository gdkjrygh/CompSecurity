// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.app.AlarmManager;
import android.app.DownloadManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.f.f;
import com.facebook.common.f.g;
import com.facebook.common.time.a;
import com.facebook.common.w.n;
import com.facebook.http.protocol.aq;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import java.io.IOException;
import java.util.UUID;

// Referenced classes of package com.facebook.selfupdate:
//            c, af, f, e, 
//            p, o, j, AppServerParams, 
//            a

public class SelfUpdateFetchService extends IntentService
{

    private com.facebook.selfupdate.a a;
    private com.facebook.config.b.a b;
    private com.facebook.selfupdate.o c;
    private d d;
    private aq e;
    private AlarmManager f;
    private DownloadManager g;
    private a h;
    private Context i;
    private ViewerContext j;
    private af k;
    private f l;
    private com.facebook.selfupdate.f m;

    public SelfUpdateFetchService()
    {
        super("SelfUpdateFetchService");
    }

    private long a(c c1, String s, boolean flag)
    {
        Uri uri1 = Uri.parse(c1.e);
        android.app.DownloadManager.Request request = null;
        Object obj = request;
        Uri uri = uri1;
        int j1;
        if (uri1.getScheme().equalsIgnoreCase("https"))
        {
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                obj = uri1.buildUpon();
                ((android.net.Uri.Builder) (obj)).scheme("http");
                uri = ((android.net.Uri.Builder) (obj)).build();
                obj = request;
            } else
            {
                obj = j.b();
                uri = uri1;
            }
        }
        k.f();
        request = m.a(uri);
        if (!flag)
        {
            int i1;
            if ((e.MOBILE.value & c1.i) == e.MOBILE.value)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            i1 = j1;
            if ((e.WIFI.value & c1.i) == e.WIFI.value)
            {
                i1 = j1 | 2;
            }
            j1 = i1;
            if (a("android.permission.DOWNLOAD_WITHOUT_NOTIFICATION"))
            {
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    request.setNotificationVisibility(2);
                    j1 = i1;
                } else
                {
                    request.setShowRunningNotification(false);
                    j1 = i1;
                }
            }
        } else
        {
            j1 = 0;
        }
        request.setVisibleInDownloadsUi(false);
        if (j1 != 0)
        {
            request.setAllowedNetworkTypes(j1);
        }
        request.addRequestHeader("Accept", "application/octet-stream");
        if (obj != null)
        {
            request.addRequestHeader("Authorization", (new StringBuilder()).append("OAuth ").append(((String) (obj))).toString());
        }
        if (s != null)
        {
            request.setTitle(s);
        }
        if (!a(c1.k, request))
        {
            return -1L;
        } else
        {
            c.a(this, p.QUEUE_DOWNLOAD, uri.toString());
            return g.enqueue(request);
        }
    }

    private long a(boolean flag)
    {
        c c1;
        String s;
        long l1;
label0:
        {
            c1 = b(flag);
            if (c1 == null)
            {
                return 0xa4cb80L;
            }
            s = a(i);
            long l2 = -1L;
            l1 = l2;
            if (!c1.a())
            {
                break label0;
            }
            if (!flag)
            {
                l1 = l2;
                if (a())
                {
                    break label0;
                }
                l1 = l2;
                if (a(c1))
                {
                    break label0;
                }
            }
            l1 = a(c1, n.a(getString(o.download_new_build), new Object[] {
                s
            }), flag);
        }
        a(c1, l1, s);
        return c1.c();
    }

    private String a(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        try
        {
            context = packagemanager.getApplicationInfo(context.getPackageName(), 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        if (context != null)
        {
            return packagemanager.getApplicationLabel(context).toString();
        } else
        {
            return "";
        }
    }

    private void a(long l1)
    {
        long l3 = 0xf731400L;
        long l2 = 0x493e0L;
        if (l1 > 0xf731400L)
        {
            l1 = l3;
        }
        if (l1 < 0x493e0L)
        {
            l1 = l2;
        }
        l2 = h.a() + l1;
        d.b().a(j.b, l2).a(j.c, l1).a();
        Object obj = new Intent(i, com/facebook/selfupdate/SelfUpdateFetchService);
        ((Intent) (obj)).putExtra("force_update", false);
        obj = PendingIntent.getService(i, 0, ((Intent) (obj)), 0);
        f.set(1, l2, ((PendingIntent) (obj)));
        c.a(this, p.ALARM_NEXT_TIME, String.valueOf(l2));
    }

    private void a(c c1, long l1, String s)
    {
        if (l1 != -1L)
        {
            d.b().a(com.facebook.selfupdate.j.d, c1.c).a(com.facebook.selfupdate.j.g, l1).a(com.facebook.selfupdate.j.e, c1.e).a(com.facebook.selfupdate.j.f, c1.f).a(j.i, c1.b()).a(j.j, s).a(j.k, c1.h).a(com.facebook.selfupdate.j.n, 1).a(com.facebook.selfupdate.j.o, c1.a).a(j.p, c1.j).a(j.q, c1.k).a();
        }
    }

    private boolean a()
    {
        boolean flag = false;
        if (d.a(com.facebook.selfupdate.j.n, 0) != 0)
        {
            flag = true;
        }
        return flag;
    }

    private boolean a(long l1, android.app.DownloadManager.Request request)
    {
        long l2 = l.a(g.INTERNAL);
        if (l2 < l1)
        {
            c.a(this, p.NO_FREE_SPACE_TO_DOWNLOAD);
            return false;
        }
        if (l2 >= 2L * l1)
        {
            return true;
        }
        if (Environment.getExternalStorageState().equals("mounted") && !l.a(g.EXTERNAL, l1))
        {
            request.setDestinationInExternalFilesDir(i, Environment.DIRECTORY_DOWNLOADS, com.facebook.common.h.a.a().toString());
            c.a(this, p.DOWNLOAD_AT_EXTERNAL_DESTINATION);
            return true;
        } else
        {
            c.a(this, p.NO_FREE_SPACE_TO_DOWNLOAD);
            return false;
        }
    }

    private boolean a(c c1)
    {
        if (!c1.b() && d.a(j.l, 0) == c1.c)
        {
            long l1 = d.a(j.m, 0L);
            if (h.a() < l1)
            {
                return true;
            }
        }
        return false;
    }

    private boolean a(String s)
    {
        return checkCallingOrSelfPermission(s) == 0;
    }

    private c b(boolean flag)
    {
        Object obj;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = b.b();
        }
        obj = new AppServerParams(i1, i.getPackageName());
        try
        {
            obj = (c)e.a(a, obj);
        }
        catch (IOException ioexception)
        {
            return null;
        }
        catch (Exception exception)
        {
            c.b("Failed to fetch update information from server");
            return null;
        }
        return ((c) (obj));
    }

    public void onCreate()
    {
        super.onCreate();
        setIntentRedelivery(true);
        com.facebook.base.a.g.a(this);
        t t1 = t.a(this);
        a = (com.facebook.selfupdate.a)t1.a(com/facebook/selfupdate/a);
        b = (com.facebook.config.b.a)t1.a(com/facebook/config/b/a);
        c = (com.facebook.selfupdate.o)t1.a(com/facebook/selfupdate/o);
        d = (d)t1.a(com/facebook/prefs/shared/d);
        e = (aq)t1.a(com/facebook/http/protocol/aq);
        f = (AlarmManager)t1.a(android/app/AlarmManager);
        g = (DownloadManager)t1.a(android/app/DownloadManager);
        h = (a)t1.a(com/facebook/common/time/a);
        i = (Context)t1.a(android/content/Context);
        j = (ViewerContext)t1.b(com/facebook/auth/viewercontext/ViewerContext).b();
        k = (af)t1.b(com/facebook/selfupdate/af).b();
        l = (f)t1.b(com/facebook/common/f/f).b();
        m = (com.facebook.selfupdate.f)t1.a(com/facebook/selfupdate/f);
    }

    public void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        } else
        {
            c.a(this, p.ON_HANDLE_INTENT);
            a(a(intent.getBooleanExtra("force_update", false)));
            return;
        }
    }
}

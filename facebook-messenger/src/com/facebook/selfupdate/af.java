// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import com.facebook.base.broadcast.j;
import com.facebook.base.broadcast.k;
import com.facebook.base.broadcast.l;
import com.facebook.c.s;
import com.facebook.common.f.d;
import com.facebook.config.b.a;
import com.facebook.inject.t;
import com.facebook.prefs.shared.e;
import com.google.common.base.Preconditions;
import java.io.File;
import java.net.URI;

// Referenced classes of package com.facebook.selfupdate:
//            j, o, SelfUpdateInstallActivity, ag, 
//            ah, h, ae, p

public class af
{

    private final Context a;
    private final com.facebook.prefs.shared.d b;
    private final a c;
    private final o d;
    private final s e;
    private final com.facebook.common.executors.a f;
    private final h g;
    private final d h;
    private final DownloadManager i;
    private final ae j;
    private final j k;
    private l l;

    public af(Context context, com.facebook.prefs.shared.d d1, a a1, com.facebook.common.executors.a a2, o o1, s s1, h h1, 
            d d2, DownloadManager downloadmanager, j j1, ae ae1)
    {
        a = context;
        b = d1;
        c = a1;
        f = a2;
        d = o1;
        e = s1;
        g = h1;
        h = d2;
        i = downloadmanager;
        k = j1;
        j = ae1;
    }

    static Context a(af af1)
    {
        return af1.a;
    }

    public static Intent a(Uri uri, Context context)
    {
        Intent intent = new Intent();
        intent.setDataAndType(uri, "application/vnd.android.package-archive");
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            intent.setAction("android.intent.action.INSTALL_PACKAGE");
            intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
            intent.putExtra("android.intent.extra.RETURN_RESULT", true);
            intent.putExtra("android.intent.extra.ALLOW_REPLACE", true);
            intent.putExtra("android.intent.extra.INSTALLER_PACKAGE_NAME", context.getApplicationInfo().packageName);
            return intent;
        } else
        {
            intent.setAction("android.intent.action.VIEW");
            intent.setFlags(0x10000000);
            return intent;
        }
    }

    public static void a(Uri uri, Activity activity)
    {
        s s1 = (s)t.a(activity).a(com/facebook/c/s);
        uri = a(uri, ((Context) (activity)));
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            s1.a(uri, 4, activity);
            return;
        } else
        {
            s1.b(uri, activity);
            return;
        }
    }

    static s b(af af1)
    {
        return af1.e;
    }

    static l c(af af1)
    {
        return af1.l;
    }

    private void c(String s1)
    {
        URI uri;
        try
        {
            uri = new URI(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return;
        }
        if (uri.isAbsolute() && "file".equals(uri.getScheme()))
        {
            try
            {
                s1 = h.a(uri);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1 = null;
            }
        } else
        {
            s1 = h.a(s1);
        }
        if (s1 != null)
        {
            s1.delete();
        }
    }

    protected Intent a()
    {
        Object obj;
        String s1;
        String s2;
        String s3;
        int i1;
        int j1;
        boolean flag;
        try
        {
            i1 = b.a(com.facebook.selfupdate.j.d, -1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                obj = b.a(com.facebook.selfupdate.j.d, "");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = "error getting stored string";
            }
            d.a((new StringBuilder()).append("SelfUpdateNotifier.createIntent - Stored new_version data type does not match: ").append(((String) (obj))).toString());
            i1 = -1;
        }
        j1 = c.b();
        obj = b.a(j.h, null);
        s1 = b.a(j.f, null);
        flag = b.a(j.i, false);
        s2 = b.a(com.facebook.selfupdate.j.j, null);
        s3 = b.a(j.o, null);
        if (j1 >= i1 || !a(((String) (obj))))
        {
            return null;
        } else
        {
            return a(((String) (obj)), s1, flag, s2, s3);
        }
    }

    protected Intent a(String s1, String s2, boolean flag, String s3, String s4)
    {
        Intent intent = new Intent(a, com/facebook/selfupdate/SelfUpdateInstallActivity);
        intent.setFlags(0x4000000);
        intent.putExtra("local_uri", s1);
        if (s2 != null)
        {
            intent.putExtra("release_notes", s2);
        }
        intent.putExtra("no_cancel", flag);
        if (s3 != null)
        {
            intent.putExtra("app_name", s3);
        }
        if (s4 != null && !s4.equals("no_megaphone"))
        {
            intent.putExtra("megaphone", s4);
        }
        return intent;
    }

    protected void a(Intent intent)
    {
        f.b(new ag(this, intent));
    }

    public boolean a(String s1)
    {
        if (s1 != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        URI uri = new URI(s1);
        if (!uri.isAbsolute())
        {
            break MISSING_BLOCK_LABEL_44;
        }
        s1 = h.a(uri);
_L5:
        if (s1 == null) goto _L1; else goto _L3
_L3:
        if (!s1.exists()) goto _L1; else goto _L4
_L4:
        return true;
        try
        {
            s1 = h.a(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return false;
        }
          goto _L5
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        String s1;
        String s2;
        int i1;
        i1 = b.a(j.n, 0);
        s1 = b.a(j.o, "no_megaphone");
        s2 = b.a(j.p, "application/vnd.android.package-archive");
        if (i1 != 2)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (s1.equals("no_megaphone") && s2.equals("application/vnd.android.package-archive"))
        {
            c();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(String s1)
    {
        Preconditions.checkArgument(s1.equals("application/java-archive"));
        l = k.a().a("clean_up_action", new ah(this)).a();
        l.b();
        Intent intent = new Intent("download_complete_action");
        String s2 = b.a(j.h, null);
        int i1 = b.a(com.facebook.selfupdate.j.d, -1);
        intent.putExtra("local_file", s2);
        intent.putExtra("mime_type", s1);
        intent.putExtra("new_build", i1);
        k.a(intent);
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        Intent intent = a();
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        intent.addFlags(0x10000000);
        if (g.a() != null) goto _L2; else goto _L1
_L1:
        j.a(intent);
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a(intent);
          goto _L3
        Exception exception;
        exception;
        throw exception;
        f();
          goto _L3
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        Intent intent;
        d.a(this, p.CREATE_NOTIFICATION);
        intent = a();
        if (intent == null) goto _L2; else goto _L1
_L1:
        j.a(intent);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void e()
    {
        int i1 = b.a(com.facebook.selfupdate.j.d, 0);
        if (i1 != 0)
        {
            long l1 = ((com.facebook.common.time.a)t.a(a).a(com/facebook/common/time/a)).a();
            b.b().a(com.facebook.selfupdate.j.l, i1).a(j.m, l1 + 0x5265c00L).a();
        }
    }

    public void f()
    {
        d.a(this, p.CLEAN_UPDATE_INFO);
        j.a();
        long l1 = b.a(j.g, -1L);
        String s1;
        if (l1 != -1L)
        {
            try
            {
                i.remove(new long[] {
                    l1
                });
            }
            catch (Exception exception)
            {
                d.a((new StringBuilder()).append("Failed to remove download ID from DownloadManager: ").append(l1).toString(), exception);
            }
        }
        s1 = b.a(j.h, null);
        if (s1 != null)
        {
            c(s1);
        }
        b.b().a(com.facebook.selfupdate.j.d).a(com.facebook.selfupdate.j.e).a(j.f).a(j.n).a(j.i).a(j.g).a(j.h).a(com.facebook.selfupdate.j.j).a(j.o).a(j.p).a();
    }
}

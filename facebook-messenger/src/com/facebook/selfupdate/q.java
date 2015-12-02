// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.c.k;
import com.facebook.common.f.d;
import com.facebook.common.f.f;
import com.facebook.common.f.g;
import com.facebook.common.h.a;
import com.facebook.prefs.shared.e;
import com.google.common.a.ew;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;
import java.util.jar.JarFile;

// Referenced classes of package com.facebook.selfupdate:
//            j, o, af, p, 
//            g, s, i, r, 
//            SelfUpdateFetchService

public class q
{

    private final Context a;
    private final com.facebook.base.a.d b;
    private final com.facebook.common.time.a c;
    private final com.facebook.prefs.shared.d d;
    private final com.facebook.config.b.a e;
    private final o f;
    private final DownloadManager g;
    private final af h;
    private final com.facebook.selfupdate.g i;
    private final com.facebook.common.executors.a j;
    private final i k;
    private final d l;
    private final f m;
    private k n;

    public q(com.facebook.base.a.d d1, com.facebook.config.b.a a1, Context context, com.facebook.common.time.a a2, com.facebook.prefs.shared.d d2, o o1, DownloadManager downloadmanager, 
            af af1, com.facebook.selfupdate.g g1, com.facebook.common.executors.a a3, i i1, d d3, f f1)
    {
        b = d1;
        e = a1;
        a = context;
        c = a2;
        d = d2;
        f = o1;
        g = downloadmanager;
        h = af1;
        i = g1;
        j = a3;
        k = i1;
        l = d3;
        m = f1;
    }

    static com.facebook.prefs.shared.d a(q q1)
    {
        return q1.d;
    }

    private File a(String s1, long l1)
    {
        Object obj = null;
        if (!TextUtils.isEmpty(s1))
        {
            s1 = Uri.parse(s1);
            if (l.a(s1))
            {
                obj = l.a(s1.getPath());
            } else
            {
                try
                {
                    s1 = g.openDownloadedFile(l1);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    return null;
                }
                s1 = l.a(a, s1, com.facebook.common.h.a.a().toString());
                obj = s1;
                if (s1 != null)
                {
                    try
                    {
                        g.remove(new long[] {
                            l1
                        });
                    }
                    catch (Exception exception)
                    {
                        f.a((new StringBuilder()).append("Failed to remove download ID from DownloadManager after making a copy: ").append(l1).toString(), exception);
                    }
                    d.b().a(com.facebook.selfupdate.j.g).a();
                    return s1;
                }
            }
        }
        return ((File) (obj));
    }

    private void a(long l1)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new android.app.DownloadManager.Query();
        ((android.app.DownloadManager.Query) (obj)).setFilterById(new long[] {
            l1
        });
        Cursor cursor = g.query(((android.app.DownloadManager.Query) (obj)));
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (cursor.moveToFirst()) goto _L3; else goto _L2
_L2:
        f.a("Empty DownloadManager cursor");
_L23:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        h.f();
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        cursor.close();
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        int i1;
        int j1;
        i1 = cursor.getInt(cursor.getColumnIndex("status"));
        j1 = cursor.getInt(cursor.getColumnIndex("reason"));
        obj = cursor.getString(cursor.getColumnIndex("local_uri"));
        i1;
        JVM INSTR lookupswitch 2: default 579
    //                   8: 168
    //                   16: 528;
           goto _L4 _L5 _L6
_L5:
        obj = a(((String) (obj)), l1);
        if (obj == null) goto _L8; else goto _L7
_L7:
        String s1 = ((File) (obj)).getPath();
        obj = l.a(((File) (obj)));
_L14:
        String s2;
        f.a(this, p.DOWNLOAD_SUCCESS_FILE_URI, s1);
        s2 = d.a(j.p, "application/vnd.android.package-archive");
        if (!i.a(((JarFile) (obj)), s2) || m.a(g.INTERNAL) < d.a(j.q, 0x1e00000L)) goto _L10; else goto _L9
_L9:
        d.b().a(j.h, s1).a(j.n, 2).a();
        if (s2.equals("application/java-archive")) goto _L12; else goto _L11
_L11:
        h.d();
_L15:
        flag = false;
_L20:
        Object obj1;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            ((JarFile) (obj)).close();
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        finally { }
          goto _L13
        obj1;
        f.a((new StringBuilder()).append("Failed to open JarFile: ").append(s1).toString(), ((Exception) (obj1)));
        obj1 = null;
          goto _L14
        obj1;
        f.a((new StringBuilder()).append("Failed to open JarFile by OOM: ").append(s1).toString());
        obj1 = null;
          goto _L14
_L12:
        h.b(s2);
          goto _L15
        obj1;
        flag = true;
_L21:
        if (!flag) goto _L17; else goto _L16
_L16:
        h.f();
_L17:
        if (cursor == null) goto _L19; else goto _L18
_L18:
        cursor.close();
_L19:
        throw obj1;
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
_L10:
        f.a("Downloaded package is invalid or corrupt");
        flag = true;
          goto _L20
_L13:
        f.a((new StringBuilder()).append("Failed to close JarFile: ").append(s1).toString());
        continue; /* Loop/switch isn't completed */
_L8:
        f.a((new StringBuilder()).append("Download succeeded, but file the is missing: id= ").append(l1).toString());
        continue; /* Loop/switch isn't completed */
_L6:
        f.a((new StringBuilder()).append("Download failed: id= ").append(l1).append(" reason=").append(j1).toString());
        continue; /* Loop/switch isn't completed */
        obj1;
        cursor = null;
        flag = true;
          goto _L21
_L4:
        flag = false;
        if (true) goto _L23; else goto _L22
_L22:
    }

    static void a(q q1, long l1)
    {
        q1.a(l1);
    }

    static com.facebook.common.executors.a b(q q1)
    {
        return q1.j;
    }

    private void b()
    {
        if (n == null)
        {
            s s1 = new s(this);
            n = new k((new ew()).b("android.intent.action.DOWNLOAD_COMPLETE", s1).b());
            a.registerReceiver(n, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        }
    }

    private boolean c()
    {
        return k.a();
    }

    public void a()
    {
        f.a(this, p.SCHEDULE_SERVICE);
        b.b();
        if (!c())
        {
            f.a(this, p.SHOULD_SCHEDULE_SERVICE_FALSE);
        } else
        {
            int i1 = e.b();
            int j1 = d.a(j.n, 0);
            if (j1 == 2)
            {
                if (i1 >= d.a(com.facebook.selfupdate.j.d, 0))
                {
                    f.a(this, p.PENDING_DOWNLOAD_OLD_VERSION);
                    h.f();
                } else
                {
                    h.b();
                }
            } else
            if (j1 == 1)
            {
                long l2 = d.a(com.facebook.selfupdate.j.g, -1L);
                if (l2 != -1L)
                {
                    f.a(this, p.PENDING_DOWNLOAD_COMPLETE);
                    j.a("completeDownload", new r(this, l2));
                }
            }
            if (i1 != e.c())
            {
                b();
                long l1 = d.a(j.b, 0L);
                long l3 = d.a(j.c, 0xa4cb80L);
                long l4 = c.a();
                if (Math.abs(l4 - l1) > l3)
                {
                    d.b().a(j.b, l4).a();
                    a(false);
                    return;
                }
            }
        }
    }

    public void a(boolean flag)
    {
        Intent intent;
        if (flag)
        {
            f.a(this, p.FORCE_UPDATE_CHECK_NOW);
        } else
        {
            f.a(this, p.UPDATE_CHECK_NOW);
        }
        b();
        intent = new Intent(a, com/facebook/selfupdate/SelfUpdateFetchService);
        intent.putExtra("force_update", flag);
        a.startService(intent);
    }
}

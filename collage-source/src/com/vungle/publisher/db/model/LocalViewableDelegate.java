// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import android.content.ContentValues;
import android.database.Cursor;
import com.vungle.log.Logger;
import com.vungle.publisher.async.ScheduledPriorityExecutor;
import com.vungle.publisher.bg;
import com.vungle.publisher.bi;
import com.vungle.publisher.bk;
import com.vungle.publisher.bt;
import com.vungle.publisher.cb;
import com.vungle.publisher.cc;
import com.vungle.publisher.cw;
import com.vungle.publisher.env.SdkState;
import com.vungle.publisher.net.http.DownloadHttpGateway;
import java.io.File;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.db.model:
//            LocalAd

public class LocalViewableDelegate
{
    static class Factory
    {

        Provider a;
        DownloadHttpGateway b;

        final LocalViewableDelegate a(a a1)
        {
            LocalViewableDelegate localviewabledelegate = (LocalViewableDelegate)a.get();
            localviewabledelegate.a = a1;
            localviewabledelegate.d = b;
            return localviewabledelegate;
        }

        Factory()
        {
        }
    }

    static interface a
        extends bk
    {

        public abstract boolean q();

        public abstract boolean u();
    }


    a a;
    public String b;
    Integer c;
    DownloadHttpGateway d;
    bt e;
    SdkState f;

    LocalViewableDelegate()
    {
    }

    private String i()
    {
        return a.d();
    }

    private com.vungle.publisher.bj.b j()
    {
        return a.f();
    }

    final String a()
    {
        return ((LocalAd)a.c()).t();
    }

    final void a(ContentValues contentvalues)
    {
        contentvalues.put("url", b);
        contentvalues.put("size", c);
    }

    final void a(Cursor cursor)
    {
        b = bg.f(cursor, "url");
        c = bg.d(cursor, "size");
    }

    final void a(cw cw1)
    {
        Logger.d("VunglePrepare", (new StringBuilder("downloading ")).append(a.f()).append(" for ad_id ").append(i()).toString());
        a.b(com.vungle.publisher.bj.a.c);
        DownloadHttpGateway downloadhttpgateway = d;
        a a1 = a;
        downloadhttpgateway.e.a(new com.vungle.publisher.net.http.DownloadHttpGateway._cls1(downloadhttpgateway, a1, cw1), com.vungle.publisher.async.ScheduledPriorityExecutor.b.i, cw1.a(2000));
    }

    final void a(StringBuilder stringbuilder)
    {
        bi.a(stringbuilder, "url", b);
        bi.a(stringbuilder, "size", c);
    }

    final File b()
    {
        String s = c();
        if (s == null)
        {
            return null;
        } else
        {
            return new File(s);
        }
    }

    final String c()
    {
        return cc.a(new Object[] {
            a(), (new StringBuilder()).append(j()).append(".").append(a.h()).toString()
        });
    }

    final int d()
    {
        a.A();
        return a.B();
    }

    final boolean e()
    {
        boolean flag = a.q();
        if (flag)
        {
            com.vungle.publisher.bj.a a1 = com.vungle.publisher.bj.a.e;
            Logger.i("VunglePrepare", (new StringBuilder()).append(j()).append(" ").append(a1).append(" for ad_id ").append(i()).toString());
            a.b(a1);
            return flag;
        }
        if (SdkState.a())
        {
            Logger.i("VunglePrepare", (new StringBuilder("debug mode: post-processing failed for ")).append(a.y()).append(" - not deleting ").append(c()).toString());
        } else
        {
            Logger.d("VunglePrepare", (new StringBuilder("post-processing failed for ")).append(a.y()).append(" - deleting ").append(c()).toString());
            a.A();
        }
        a.b(com.vungle.publisher.bj.a.a);
        return flag;
    }

    final boolean f()
        throws cb
    {
        boolean flag = a.u();
        Object obj = i();
        com.vungle.publisher.bj.b b1 = j();
        if (flag)
        {
            Logger.i("VunglePrepare", (new StringBuilder()).append(b1).append(" verified for ad_id ").append(((String) (obj))).toString());
            obj = com.vungle.publisher.bj.a.e;
        } else
        {
            Logger.w("VunglePrepare", (new StringBuilder()).append(b1).append(" failed verification; reprocessing ad_id ").append(((String) (obj))).toString());
            obj = com.vungle.publisher.bj.a.a;
        }
        a.b(((com.vungle.publisher.bj.a) (obj)));
        return flag;
    }

    final boolean g()
        throws cb
    {
        boolean flag1 = false;
        if (!e.o())
        {
            throw new cb();
        }
        Object obj = i();
        com.vungle.publisher.bj.b b1 = j();
        if (c == null)
        {
            Logger.d("VunglePrepare", (new StringBuilder()).append(b1).append(" size ").append(c).append(" for ad_id: ").append(((String) (obj))).toString());
            flag1 = true;
        } else
        {
            File file = b();
            int k;
            if (file == null)
            {
                k = 0;
            } else
            {
                k = (int)file.length();
            }
            if (k == c.intValue())
            {
                Logger.d("VunglePrepare", (new StringBuilder()).append(b1).append(" disk size matched size ").append(c).append(" for ad_id: ").append(((String) (obj))).toString());
                return true;
            }
            Logger.d("VunglePrepare", (new StringBuilder()).append(b1).append(" disk size ").append(k).append(" failed to match size ").append(c).append(" for ad_id: ").append(((String) (obj))).toString());
            obj = b();
            boolean flag;
            if (obj == null)
            {
                Logger.w("VunglePrepare", (new StringBuilder("null ")).append(a.f()).append(" file for ad ").append(i()).toString());
                flag = false;
            } else
            if (((File) (obj)).exists())
            {
                Logger.v("VunglePrepare", (new StringBuilder()).append(((File) (obj)).getAbsolutePath()).append(" exists, ").append(((File) (obj)).length()).append(" bytes").toString());
                flag = true;
            } else
            {
                Logger.w("VunglePrepare", (new StringBuilder()).append(((File) (obj)).getAbsolutePath()).append(" missing ").toString());
                flag = false;
            }
            if (flag)
            {
                Logger.d("VunglePrepare", (new StringBuilder("ignoring ")).append(b1).append(" size mismatch - file exists").toString());
                return true;
            }
        }
        return flag1;
    }

    final boolean h()
    {
        File file = b();
        Logger.d("VunglePrepare", (new StringBuilder("deleting ")).append(file).toString());
        return file != null && file.delete();
    }
}

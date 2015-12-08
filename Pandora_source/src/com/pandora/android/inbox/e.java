// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.inbox;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.pandora.android.gcm.a;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.ag;
import java.security.InvalidParameterException;
import java.util.concurrent.TimeUnit;
import p.cw.c;
import p.dd.an;
import p.dd.bh;

// Referenced classes of package com.pandora.android.inbox:
//            d, b

public class e
    implements d.a
{

    public static final long a;
    static volatile e b;
    private static final long c;
    private final Context d;
    private final ag e;

    protected e()
    {
        d = b.a.h();
        e = b.a.b().k();
    }

    public static e a()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/pandora/android/inbox/e;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new e();
        }
        com/pandora/android/inbox/e;
        JVM INSTR monitorexit ;
_L2:
        return b;
        Exception exception;
        exception;
        com/pandora/android/inbox/e;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void h()
    {
        (new AsyncTask() {

            final e a;

            protected transient Void a(Void avoid[])
            {
                a.f();
                return null;
            }

            protected Object doInBackground(Object aobj[])
            {
                return a((Void[])aobj);
            }

            
            {
                a = e.this;
                super();
            }
        }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    void a(long l)
    {
        (new d(b.a.b(), this)).a_(new Object[] {
            Long.valueOf(l)
        });
        h();
    }

    public void a(Long long1)
    {
        if (long1 == null)
        {
            e.R();
            return;
        } else
        {
            e.c(long1.longValue());
            return;
        }
    }

    public void b()
    {
        b.a.b().b(this);
    }

    protected boolean b(long l)
    {
        long l1 = Math.abs(System.currentTimeMillis() - l);
        if (g())
        {
            l = a;
        } else
        {
            l = c;
        }
        return l1 > l;
    }

    public void c()
    {
        b.a.b().c(this);
    }

    public void d()
    {
        long l = e.Q();
        if (b(l))
        {
            a(l);
        }
    }

    public void e()
    {
        (new AsyncQueryHandler(d.getContentResolver()) {

            final e a;

            protected void onDeleteComplete(int i, Object obj, int j)
            {
                if (i == 0)
                {
                    startDelete(1, null, com.pandora.android.inbox.b.a.a, null, null);
                    a.a(null);
                }
            }

            
            {
                a = e.this;
                super(contentresolver);
            }
        }).startDelete(0, null, com.pandora.android.inbox.b.a, null, null);
    }

    void f()
    {
        Cursor cursor;
        cursor = d.getContentResolver().query(com.pandora.android.inbox.b.a, null, "expireTimestamp < ?", new String[] {
            Long.toString(System.currentTimeMillis())
        }, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        int i;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_131;
        }
        i = cursor.getColumnIndex("_id");
        boolean flag;
        do
        {
            long l = cursor.getLong(i);
            d.getContentResolver().delete(com.pandora.android.inbox.b.a, "_id == ?", new String[] {
                Long.toString(l)
            });
            d.getContentResolver().delete(com.pandora.android.inbox.b.a.a, "_id == ?", new String[] {
                Long.toString(l)
            });
            flag = cursor.moveToNext();
        } while (flag);
        cursor.close();
        return;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    protected boolean g()
    {
        return GooglePlayServicesUtil.isGooglePlayServicesAvailable(d) == 0 && !s.a(com.pandora.android.gcm.a.a().e(d));
    }

    public void onSignInState(an an1)
    {
        static class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[p.cx.a.values().length];
                try
                {
                    a[p.cx.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.cx.a.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cx.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cx.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android.inbox._cls3.a[an1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

        case 1: // '\001'
            d();
            // fall through

        case 2: // '\002'
        case 3: // '\003'
            return;

        case 4: // '\004'
            e();
            break;
        }
    }

    public void onTrackState(bh bh1)
    {
        if (bh1.a == p.dd.bh.a.c)
        {
            d();
        }
    }

    static 
    {
        a = TimeUnit.DAYS.toMillis(14L);
        c = TimeUnit.MINUTES.toMillis(15L);
    }
}

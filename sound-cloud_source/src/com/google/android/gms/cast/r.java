// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.SystemClock;
import com.google.android.gms.cast.internal.d;
import com.google.android.gms.cast.internal.q;
import com.google.android.gms.cast.internal.s;
import com.google.android.gms.cast.internal.t;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            s, p, o, m, 
//            C, H, J, Q, 
//            CastDevice, a, O, P

public final class r
    implements a.e
{
    public static interface a
        extends Result
    {
    }

    public static interface b
    {

        public abstract void onMetadataUpdated();
    }

    public static interface c
    {

        public abstract void onPreloadStatusUpdated();
    }

    public static interface d
    {

        public abstract void onQueueStatusUpdated();
    }

    public static interface e
    {

        public abstract void onStatusUpdated();
    }

    private final class f
        implements com.google.android.gms.cast.internal.r
    {

        GoogleApiClient a;
        final r b;
        private long c;

        public final long a()
        {
            long l = c + 1L;
            c = l;
            return l;
        }

        public final void a(String s1, String s2, long l)
            throws IOException
        {
            if (a == null)
            {
                throw new IOException("No GoogleApiClient available");
            } else
            {
                com.google.android.gms.cast.a.b.a(a, s1, s2).setResultCallback(new a(this, l));
                return;
            }
        }

        public f()
        {
            b = r.this;
            super();
            c = 0L;
        }
    }

    private final class f.a
        implements ResultCallback
    {

        final f a;
        private final long b;

        public final void onResult(Result result)
        {
            result = (Status)result;
            if (!result.isSuccess())
            {
                q q1 = a.b.b;
                long l = b;
                int i = result.getStatusCode();
                for (result = q1.k.iterator(); result.hasNext(); ((t)result.next()).a(l, i, null)) { }
            }
        }

        f.a(f f1, long l)
        {
            a = f1;
            super();
            b = l;
        }
    }

    private static abstract class g extends com.google.android.gms.cast.internal.b
    {

        s h;

        public final a a(Status status)
        {
            return new P(this, status);
        }

        public Result zzb(Status status)
        {
            return a(status);
        }

        g(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
            h = new O(this);
        }
    }

    private static final class h
        implements a
    {

        private final Status a;
        private final JSONObject b;

        public final Status getStatus()
        {
            return a;
        }

        h(Status status, JSONObject jsonobject)
        {
            a = status;
            b = jsonobject;
        }
    }


    final Object a = new Object();
    public final q b = new com.google.android.gms.cast.s(this);
    final f c = new f();
    public c d;
    public d e;
    public b f;
    public e g;

    public r()
    {
        q q1 = b;
        q1.h = c;
        if (((com.google.android.gms.cast.internal.d) (q1)).h == null)
        {
            q1.e();
        }
    }

    static int a(r r1, int i)
    {
        r1 = r1.c();
        for (int j = 0; j < ((p) (r1)).m.a(); j++)
        {
            if (r1.b(j).b == i)
            {
                return j;
            }
        }

        return -1;
    }

    public final long a()
    {
        long l = 0L;
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        q q1;
        m m1;
        q1 = b;
        m1 = q1.g();
        if (m1 != null) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return l;
_L2:
        double d1;
        int i;
        if (q1.i == 0L)
        {
            continue; /* Loop/switch isn't completed */
        }
        d1 = q1.j.d;
        l = q1.j.g;
        i = q1.j.e;
        if (d1 == 0.0D || i != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        long l1 = SystemClock.elapsedRealtime() - q1.i;
        if (l1 < 0L)
        {
            l1 = 0L;
        }
          goto _L3
_L5:
        long l2 = m1.e;
        l += (long)((double)l1 * d1);
        if (l2 > 0L && l > l2)
        {
            l = l2;
            break; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_180;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L3:
        if (l1 != 0L) goto _L5; else goto _L4
_L4:
        continue; /* Loop/switch isn't completed */
        if (l < 0L)
        {
            l = 0L;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final PendingResult a(GoogleApiClient googleapiclient, long l, int i)
    {
        return googleapiclient.zzb(new C(this, googleapiclient, googleapiclient, l, i));
    }

    public final PendingResult a(GoogleApiClient googleapiclient, Q q1)
    {
        if (q1 == null)
        {
            throw new IllegalArgumentException("trackStyle cannot be null");
        } else
        {
            return googleapiclient.zzb(new H(this, googleapiclient, googleapiclient, q1));
        }
    }

    public final PendingResult a(GoogleApiClient googleapiclient, o ao[], int i, JSONObject jsonobject)
        throws IllegalArgumentException
    {
        return googleapiclient.zzb(new J(this, googleapiclient, googleapiclient, ao, i, jsonobject));
    }

    public final long b()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        m m1 = b.g();
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        long l = m1.e;
_L1:
        obj;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        l = 0L;
          goto _L1
    }

    public final p c()
    {
        p p1;
        synchronized (a)
        {
            p1 = b.j;
        }
        return p1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final m d()
    {
        m m1;
        synchronized (a)
        {
            m1 = b.g();
        }
        return m1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onMessageReceived(CastDevice castdevice, String s1, String s2)
    {
        b.a(s2);
    }
}

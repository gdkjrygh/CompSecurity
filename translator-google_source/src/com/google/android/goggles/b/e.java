// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.goggles.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.apps.gsa.a.c;
import com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException;
import com.google.android.apps.gsa.shared.util.a.b;
import com.google.android.goggles.a;
import com.google.bionics.goggles.api2.j;
import com.google.bionics.goggles.api2.k;
import com.google.bionics.goggles.api2.l;
import com.google.bionics.goggles.api2.s;
import com.google.bionics.goggles.api2.t;
import com.google.f.e.m;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.goggles.b:
//            g, f

public final class e
    implements c
{

    final a a;
    final List b = new ArrayList();
    private final Context c;
    private final String d;
    private final String e;
    private final Handler f = new Handler();
    private com.google.android.apps.gsa.a.a.e g;
    private final AtomicBoolean h = new AtomicBoolean(false);

    public e(a a1, Context context, String s1, String s2)
    {
        c = context;
        a = a1;
        d = s1;
        e = s2;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (g != null)
        {
            h.set(true);
            g.a();
            b.clear();
            g = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(Bitmap bitmap, boolean flag, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        t t1;
        if (g != null)
        {
            h.set(true);
            g.a();
            g = null;
        }
        b.clear();
        t1 = new t();
        t1.b = flag;
        t1.a = t1.a | 2;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        throw new NullPointerException();
        bitmap;
        this;
        JVM INSTR monitorexit ;
        throw bitmap;
        int i;
        int i1;
        t1.e = s1;
        t1.a = t1.a | 8;
        t1.c = false;
        t1.a = t1.a | 4;
        t1.d = (new int[] {
            2
        });
        s1 = new ByteArrayOutputStream();
        i = bitmap.getWidth();
        i1 = bitmap.getHeight();
        double d1 = i;
        d1 = ((double)i1 * d1) / 1000000D;
        double d2 = 3681D + 55382D * d1;
        if (d2 < 44999.999900000003D) goto _L2; else goto _L1
_L1:
        i = 60;
_L8:
        if (bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i, s1)) goto _L4; else goto _L3
_L3:
        a.e();
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        i1 = (int)((Math.sqrt(d1 * 2000D) * -0.85334390000000004D - 12.19872D) + Math.log(45000D - d2) * 11.63659D);
        if (i1 >= 60)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 60;
        continue; /* Loop/switch isn't completed */
_L4:
        l l1;
        bitmap = new j();
        bitmap.f = true;
        bitmap.a = ((j) (bitmap)).a | 4;
        l1 = new l();
        l1.b = 1;
        l1.a = l1.a | 1;
        s1 = s1.toByteArray();
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_333;
        }
        throw new NullPointerException();
        l1.c = s1;
        l1.a = l1.a | 2;
        bitmap.d = l1;
        h.set(false);
        g = new com.google.android.apps.gsa.a.a.e(c.getApplicationContext(), this, new com.google.android.goggles.a.a("c548_232a_f5c8_05ff", 51200), new b());
        g.a(new g(c, d, e, t1, bitmap));
        if (true) goto _L6; else goto _L5
_L5:
        i = i1;
        if (i1 > 95)
        {
            i = 95;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(NetworkRecognizeException networkrecognizeexception)
    {
        if (!h.get());
    }

    public final void a(m m1)
    {
        if (!h.get())
        {
            if (m1.a == 2)
            {
                b(new com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException.ServerRecognizeException(m1.b));
                return;
            }
            k k1 = (k)m1.getExtension(s.c);
            if (k1 != null && k1.b != null)
            {
                Collections.addAll(b, k1.b);
            }
            if (m1.a == 1)
            {
                f.post(new f(this));
                return;
            }
        }
    }

    public final void b(NetworkRecognizeException networkrecognizeexception)
    {
        if (h.getAndSet(true))
        {
            return;
        }
        if (g != null)
        {
            g.a();
        }
        a.e();
    }
}

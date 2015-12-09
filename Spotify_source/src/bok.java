// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class bok
    implements boj
{

    public bok()
    {
    }

    public final double a(bqu bqu1)
    {
        bqu1 = (bpm)bqu1.a(bpx.a);
        bqu1.f();
        return ((bpm) (bqu1)).c;
    }

    public final bra a(bqu bqu1, String s)
    {
        return bqu1.b(new bop(bqu1, s) {

            private String a;

            protected final void a(bqr bqr)
            {
                bqr = (bpm)bqr;
                try
                {
                    String s1 = a;
                    bqr.a(this);
                    JoinOptions joinoptions = new JoinOptions();
                    ((bps)bqr.p()).a(s1, null, joinoptions);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (bqr bqr)
                {
                    a();
                }
            }

            
            {
                a = s;
                super(bqu1);
            }
        });
    }

    public final bra a(bqu bqu1, String s, LaunchOptions launchoptions)
    {
        return bqu1.b(new bop(bqu1, s, launchoptions) {

            private String a;
            private LaunchOptions c;

            protected final void a(bqr bqr)
            {
                bqr = (bpm)bqr;
                try
                {
                    String s1 = a;
                    LaunchOptions launchoptions1 = c;
                    bqr.a(this);
                    ((bps)bqr.p()).a(s1, launchoptions1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (bqr bqr)
                {
                    a();
                }
            }

            
            {
                a = s;
                c = launchoptions;
                super(bqu1);
            }
        });
    }

    public final bra a(bqu bqu1, String s, String s1)
    {
        return bqu1.b(new bpr(bqu1, s, s1) {

            private String a;
            private String c;

            protected final void a(bqr bqr)
            {
                bqr = (bpm)bqr;
                String s2;
                String s3;
                s2 = a;
                s3 = c;
                if (TextUtils.isEmpty(s3))
                {
                    throw new IllegalArgumentException("The message payload cannot be null or empty");
                }
                  goto _L1
_L3:
                a();
                return;
_L1:
                long l;
                if (s3.length() > 0x10000)
                {
                    throw new IllegalArgumentException("Message exceeds maximum size");
                }
                bpp.a(s2);
                bqr.f();
                l = ((bpm) (bqr)).d.incrementAndGet();
                try
                {
                    ((bpm) (bqr)).e.put(Long.valueOf(l), this);
                    ((bps)bqr.p()).a(s2, s3, l);
                    return;
                }
                catch (Throwable throwable)
                {
                    try
                    {
                        ((bpm) (bqr)).e.remove(Long.valueOf(l));
                        throw throwable;
                    }
                    // Misplaced declaration of an exception variable
                    catch (bqr bqr) { }
                    // Misplaced declaration of an exception variable
                    catch (bqr bqr) { }
                }
                if (true) goto _L3; else goto _L2
_L2:
            }

            
            {
                a = s;
                c = s1;
                super(bqu1);
            }
        });
    }

    public final void a(bqu bqu1, double d)
    {
        try
        {
            bqu1 = (bpm)bqu1.a(bpx.a);
            if (Double.isInfinite(d) || Double.isNaN(d))
            {
                throw new IllegalArgumentException((new StringBuilder("Volume cannot be ")).append(d).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (bqu bqu1)
        {
            throw new IOException("service error");
        }
        ((bps)bqu1.p()).a(d, ((bpm) (bqu1)).c, ((bpm) (bqu1)).b);
        return;
    }

    public final void a(bqu bqu1, String s, boo boo)
    {
        bpm bpm1;
        try
        {
            bpm1 = (bpm)bqu1.a(bpx.a);
            bpp.a(s);
            bpm1.a(s);
        }
        // Misplaced declaration of an exception variable
        catch (bqu bqu1)
        {
            throw new IOException("service error");
        }
        if (boo == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        synchronized (bpm1.a)
        {
            bpm1.a.put(s, boo);
        }
        ((bps)bpm1.p()).b(s);
        return;
        s;
        bqu1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void b(bqu bqu1, String s)
    {
        try
        {
            ((bpm)bqu1.a(bpx.a)).a(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bqu bqu1)
        {
            throw new IOException("service error");
        }
    }
}

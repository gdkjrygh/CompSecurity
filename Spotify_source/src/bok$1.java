// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

final class nit> extends bpr
{

    private String a;
    private String c;

    protected final void a(bqr bqr)
    {
        bqr = (bpm)bqr;
        String s;
        String s1;
        s = a;
        s1 = c;
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
          goto _L1
_L3:
        a();
        return;
_L1:
        long l;
        if (s1.length() > 0x10000)
        {
            throw new IllegalArgumentException("Message exceeds maximum size");
        }
        bpp.a(s);
        bqr.f();
        l = ((bpm) (bqr)).d.incrementAndGet();
        try
        {
            ((bpm) (bqr)).e.put(Long.valueOf(l), this);
            ((bps)bqr.p()).a(s, s1, l);
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

    (bqu bqu, String s, String s1)
    {
        a = s;
        c = s1;
        super(bqu);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

final class juk extends jwq
{

    private String g;
    private String h;

    juk(juj juj, jyn jyn, String s, String s1)
    {
        g = s;
        h = s1;
        super(jyn);
    }

    protected final void a(jyl jyl)
    {
        jyl = (jwh)jyl;
        String s;
        String s1;
        s = g;
        s1 = h;
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
          goto _L1
_L3:
        a(2001);
        return;
_L1:
        long l;
        if (s1.length() > 0x10000)
        {
            throw new IllegalArgumentException("Message exceeds maximum size");
        }
        jwo.a(s);
        jyl.f();
        l = ((jwh) (jyl)).d.incrementAndGet();
        try
        {
            ((jwh) (jyl)).e.put(Long.valueOf(l), this);
            ((jwr)jyl.o()).a(s, s1, l);
            return;
        }
        catch (Throwable throwable)
        {
            try
            {
                ((jwh) (jyl)).e.remove(Long.valueOf(l));
                throw throwable;
            }
            // Misplaced declaration of an exception variable
            catch (jyl jyl) { }
            // Misplaced declaration of an exception variable
            catch (jyl jyl) { }
        }
        if (true) goto _L3; else goto _L2
_L2:
    }
}

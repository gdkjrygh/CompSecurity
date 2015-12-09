// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.c;

import com.android.slyce.a.aj;
import com.android.slyce.a.am;
import com.android.slyce.a.at;
import com.android.slyce.a.bp;
import java.nio.ByteBuffer;
import java.util.zip.Inflater;

// Referenced classes of package com.android.slyce.a.c.c:
//            g

public class n extends at
{

    static final boolean g;
    private Inflater d;
    aj f;

    public n()
    {
        this(new Inflater());
    }

    public n(Inflater inflater)
    {
        f = new aj();
        d = inflater;
    }

    public void a(am am, aj aj1)
    {
        am = aj.c(aj1.d() * 2);
_L3:
        ByteBuffer bytebuffer;
        if (aj1.o() <= 0)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        bytebuffer = aj1.n();
        am am1 = am;
        int i;
        if (!bytebuffer.hasRemaining())
        {
            break MISSING_BLOCK_LABEL_189;
        }
        i = bytebuffer.remaining();
        d.setInput(bytebuffer.array(), bytebuffer.arrayOffset() + bytebuffer.position(), bytebuffer.remaining());
        am1 = am;
_L2:
        am1.position(d.inflate(am1.array(), am1.arrayOffset() + am1.position(), am1.remaining()) + am1.position());
        am = am1;
        if (am1.hasRemaining())
        {
            break MISSING_BLOCK_LABEL_163;
        }
        am1.flip();
        f.a(am1);
        if (!g && i == 0)
        {
            try
            {
                throw new AssertionError();
            }
            // Misplaced declaration of an exception variable
            catch (am am)
            {
                a(((Exception) (am)));
            }
            return;
        }
        am = aj.c(am1.capacity() * 2);
        am1 = am;
        if (d.needsInput())
        {
            break MISSING_BLOCK_LABEL_189;
        }
        am1 = am;
        if (!d.finished()) goto _L2; else goto _L1
_L1:
        am1 = am;
        aj.c(bytebuffer);
        am = am1;
          goto _L3
        am.flip();
        f.a(am);
        bp.a(this, f);
        return;
    }

    protected void a(Exception exception)
    {
        d.end();
        Object obj = exception;
        if (exception != null)
        {
            obj = exception;
            if (d.getRemaining() > 0)
            {
                obj = new g("data still remaining in inflater", exception);
            }
        }
        super.a(((Exception) (obj)));
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/a/c/c/n.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.a.e;
import java.nio.ByteBuffer;

// Referenced classes of package com.android.slyce.a:
//            bl, aj, am

class bk extends bl
{

    byte a;
    e b;

    public bk(byte byte0, e e1)
    {
        super(1);
        a = byte0;
        b = e1;
    }

    public bl a(am am, aj aj1)
    {
        aj aj2 = new aj();
        boolean flag = true;
        do
        {
            ByteBuffer bytebuffer;
label0:
            {
                int i = ((flag) ? 1 : 0);
                if (aj1.o() > 0)
                {
                    bytebuffer = aj1.n();
                    bytebuffer.mark();
                    i = 0;
                    do
                    {
                        if (bytebuffer.remaining() <= 0)
                        {
                            break;
                        }
                        if (bytebuffer.get() == a)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (flag)
                        {
                            break;
                        }
                        i++;
                    } while (true);
                    bytebuffer.reset();
                    if (!flag)
                    {
                        break label0;
                    }
                    aj1.b(bytebuffer);
                    aj1.a(aj2, i);
                    aj1.i();
                    i = ((flag) ? 1 : 0);
                }
                b.a(am, aj2);
                am = this;
                if (i != 0)
                {
                    am = null;
                }
                return am;
            }
            aj2.a(bytebuffer);
        } while (true);
    }
}

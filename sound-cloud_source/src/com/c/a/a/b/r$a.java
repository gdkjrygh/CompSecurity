// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import c.h;
import c.i;
import java.io.IOException;
import java.net.ProtocolException;

// Referenced classes of package com.c.a.a.b:
//            b, r, k, q, 
//            e, a

static final class b
    implements b
{

    private final h a;
    private final boolean b;
    private final k c;

    private static transient IOException a(String s, Object aobj[])
        throws IOException
    {
        throw new IOException(String.format(s, aobj));
    }

    private void a( , int j, int l)
        throws IOException
    {
        boolean flag = true;
        int i1 = a.g();
        if (l != i1 * 8 + 4)
        {
            throw a("TYPE_SETTINGS length: %d != 4 + 8 * %d", new Object[] {
                Integer.valueOf(l), Integer.valueOf(i1)
            });
        }
        q q1 = new q();
        for (l = 0; l < i1; l++)
        {
            int j1 = a.g();
            q1.a(j1 & 0xffffff, (0xff000000 & j1) >>> 24, a.g());
        }

        if ((j & 1) == 0)
        {
            flag = false;
        }
        .a(flag, q1);
    }

    public final void a()
    {
    }

    public final boolean a(a a1)
        throws IOException
    {
        boolean flag = false;
        boolean flag1 = false;
        int j;
        int l;
        int i1;
        int j1;
        try
        {
            l = a.g();
            j1 = a.g();
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            return false;
        }
        if ((0x80000000 & l) != 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        i1 = (0xff000000 & j1) >>> 24;
        j1 = 0xffffff & j1;
        if (j != 0)
        {
            j = (0x7fff0000 & l) >>> 16;
            if (j != 3)
            {
                throw new ProtocolException((new StringBuilder("version != 3: ")).append(j).toString());
            }
            switch (l & 0xffff)
            {
            case 5: // '\005'
            default:
                a.f(j1);
                return true;

            case 1: // '\001'
                j = a.g();
                a.g();
                a.f();
                java.util.List list = c.a(j1 - 10);
                if ((i1 & 1) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if ((i1 & 2) != 0)
                {
                    flag1 = true;
                }
                a1.a(flag1, flag, j & 0x7fffffff, list, e.a);
                return true;

            case 2: // '\002'
                j = a.g();
                java.util.List list1 = c.a(j1 - 4);
                if ((i1 & 1) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a1.a(false, flag, j & 0x7fffffff, list1, e.b);
                return true;

            case 3: // '\003'
                if (j1 != 8)
                {
                    throw a("TYPE_RST_STREAM length: %d != 8", new Object[] {
                        Integer.valueOf(j1)
                    });
                }
                j = a.g();
                l = a.g();
                a a2 = com.c.a.a.b.a.a(l);
                if (a2 == null)
                {
                    throw a("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                        Integer.valueOf(l)
                    });
                } else
                {
                    a1.a(j & 0x7fffffff, a2);
                    return true;
                }

            case 4: // '\004'
                a(a1, i1, j1);
                return true;

            case 6: // '\006'
                if (j1 != 4)
                {
                    throw a("TYPE_PING length: %d != 4", new Object[] {
                        Integer.valueOf(j1)
                    });
                }
                j = a.g();
                boolean flag2 = b;
                if ((j & 1) == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag2 == flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a1.a(flag, j, 0);
                return true;

            case 7: // '\007'
                if (j1 != 8)
                {
                    throw a("TYPE_GOAWAY length: %d != 8", new Object[] {
                        Integer.valueOf(j1)
                    });
                }
                j = a.g();
                l = a.g();
                if (com.c.a.a.b.a.c(l) == null)
                {
                    throw a("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                        Integer.valueOf(l)
                    });
                } else
                {
                    a1.a(j & 0x7fffffff, i.b);
                    return true;
                }

            case 8: // '\b'
                a1.a(false, false, a.g() & 0x7fffffff, c.a(j1 - 4), e.c);
                return true;

            case 9: // '\t'
                break;
            }
            if (j1 != 8)
            {
                throw a("TYPE_WINDOW_UPDATE length: %d != 8", new Object[] {
                    Integer.valueOf(j1)
                });
            }
            j = a.g();
            long l1 = a.g() & 0x7fffffff;
            if (l1 == 0L)
            {
                throw a("windowSizeIncrement was 0", new Object[] {
                    Long.valueOf(l1)
                });
            } else
            {
                a1.a(j & 0x7fffffff, l1);
                return true;
            }
        }
        if ((i1 & 1) != 0)
        {
            flag = true;
        }
        a1.a(flag, l & 0x7fffffff, a, j1);
        return true;
    }

    public final void close()
        throws IOException
    {
        c.b.close();
    }

    ion(h h1, boolean flag)
    {
        a = h1;
        c = new k(a);
        b = flag;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import java.net.ProtocolException;
import okio.ByteString;
import okio.e;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            a, n, j, m, 
//            HeadersMode, ErrorCode

static final class b
    implements a
{

    private final e a;
    private final boolean b;
    private final j c;

    private static transient IOException a(String s, Object aobj[])
        throws IOException
    {
        throw new IOException(String.format(s, aobj));
    }

    private void a(b b1, int i, int k)
        throws IOException
    {
        boolean flag = true;
        int l = a.h();
        if (k != l * 8 + 4)
        {
            throw a("TYPE_SETTINGS length: %d != 4 + 8 * %d", new Object[] {
                Integer.valueOf(k), Integer.valueOf(l)
            });
        }
        m m1 = new m();
        for (k = 0; k < l; k++)
        {
            int i1 = a.h();
            m1.a(i1 & 0xffffff, (0xff000000 & i1) >>> 24, a.h());
        }

        if ((i & 1) == 0)
        {
            flag = false;
        }
        b1.a(flag, m1);
    }

    public final void a()
    {
    }

    public final boolean a(a a1)
        throws IOException
    {
        boolean flag = false;
        boolean flag1 = false;
        int i;
        int k;
        int l;
        int i1;
        try
        {
            k = a.h();
            i1 = a.h();
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            return false;
        }
        if ((0x80000000 & k) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        l = (0xff000000 & i1) >>> 24;
        i1 = 0xffffff & i1;
        if (i != 0)
        {
            i = (0x7fff0000 & k) >>> 16;
            if (i != 3)
            {
                throw new ProtocolException((new StringBuilder("version != 3: ")).append(i).toString());
            }
            switch (k & 0xffff)
            {
            case 5: // '\005'
            default:
                a.f(i1);
                return true;

            case 1: // '\001'
                i = a.h();
                a.h();
                a.g();
                java.util.List list = c.a(i1 - 10);
                if ((l & 1) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if ((l & 2) != 0)
                {
                    flag1 = true;
                }
                a1.a(flag1, flag, i & 0x7fffffff, list, HeadersMode.a);
                return true;

            case 2: // '\002'
                i = a.h();
                java.util.List list1 = c.a(i1 - 4);
                if ((l & 1) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a1.a(false, flag, i & 0x7fffffff, list1, HeadersMode.b);
                return true;

            case 3: // '\003'
                if (i1 != 8)
                {
                    throw a("TYPE_RST_STREAM length: %d != 8", new Object[] {
                        Integer.valueOf(i1)
                    });
                }
                i = a.h();
                k = a.h();
                ErrorCode errorcode = ErrorCode.a(k);
                if (errorcode == null)
                {
                    throw a("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                        Integer.valueOf(k)
                    });
                } else
                {
                    a1.a(i & 0x7fffffff, errorcode);
                    return true;
                }

            case 4: // '\004'
                a(a1, l, i1);
                return true;

            case 6: // '\006'
                if (i1 != 4)
                {
                    throw a("TYPE_PING length: %d != 4", new Object[] {
                        Integer.valueOf(i1)
                    });
                }
                i = a.h();
                boolean flag2 = b;
                if ((i & 1) == 1)
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
                a1.a(flag, i, 0);
                return true;

            case 7: // '\007'
                if (i1 != 8)
                {
                    throw a("TYPE_GOAWAY length: %d != 8", new Object[] {
                        Integer.valueOf(i1)
                    });
                }
                i = a.h();
                k = a.h();
                if (ErrorCode.c(k) == null)
                {
                    throw a("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                        Integer.valueOf(k)
                    });
                } else
                {
                    a1.a(i & 0x7fffffff, ByteString.b);
                    return true;
                }

            case 8: // '\b'
                a1.a(false, false, a.h() & 0x7fffffff, c.a(i1 - 4), HeadersMode.c);
                return true;

            case 9: // '\t'
                break;
            }
            if (i1 != 8)
            {
                throw a("TYPE_WINDOW_UPDATE length: %d != 8", new Object[] {
                    Integer.valueOf(i1)
                });
            }
            i = a.h();
            long l1 = a.h() & 0x7fffffff;
            if (l1 == 0L)
            {
                throw a("windowSizeIncrement was 0", new Object[] {
                    Long.valueOf(l1)
                });
            } else
            {
                a1.a(i & 0x7fffffff, l1);
                return true;
            }
        }
        if ((l & 1) != 0)
        {
            flag = true;
        }
        a1.a(flag, k & 0x7fffffff, a, i1);
        return true;
    }

    public final void close()
        throws IOException
    {
        c.b.close();
    }

    rCode(e e1, boolean flag)
    {
        a = e1;
        c = new j(a);
        b = flag;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.HeadersMode;
import java.io.IOException;
import java.net.ProtocolException;
import okio.ByteString;

final class gtr
    implements gsq
{

    private final hcj a;
    private final boolean b;
    private final gtm c;

    gtr(hcj hcj1, boolean flag)
    {
        a = hcj1;
        c = new gtm(a);
        b = flag;
    }

    private static transient IOException a(String s, Object aobj[])
    {
        throw new IOException(String.format(s, aobj));
    }

    private void a(gsr gsr1, int i, int j)
    {
        boolean flag = true;
        int k = a.i();
        if (j != (k << 3) + 4)
        {
            throw a("TYPE_SETTINGS length: %d != 4 + 8 * %d", new Object[] {
                Integer.valueOf(j), Integer.valueOf(k)
            });
        }
        gtp gtp1 = new gtp();
        for (j = 0; j < k; j++)
        {
            int l = a.i();
            gtp1.a(l & 0xffffff, (0xff000000 & l) >>> 24, a.i());
        }

        if ((i & 1) == 0)
        {
            flag = false;
        }
        gsr1.a(flag, gtp1);
    }

    public final void a()
    {
    }

    public final boolean a(gsr gsr1)
    {
        boolean flag = false;
        boolean flag1 = false;
        int i;
        int j;
        int k;
        int l;
        try
        {
            j = a.i();
            l = a.i();
        }
        // Misplaced declaration of an exception variable
        catch (gsr gsr1)
        {
            return false;
        }
        if ((0x80000000 & j) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        k = (0xff000000 & l) >>> 24;
        l = 0xffffff & l;
        if (i != 0)
        {
            i = (0x7fff0000 & j) >>> 16;
            if (i != 3)
            {
                throw new ProtocolException((new StringBuilder("version != 3: ")).append(i).toString());
            }
            switch (j & 0xffff)
            {
            case 5: // '\005'
            default:
                a.f(l);
                return true;

            case 1: // '\001'
                i = a.i();
                a.i();
                a.h();
                java.util.List list = c.a(l - 10);
                if ((k & 1) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if ((k & 2) != 0)
                {
                    flag1 = true;
                }
                gsr1.a(flag1, flag, i & 0x7fffffff, list, HeadersMode.a);
                return true;

            case 2: // '\002'
                i = a.i();
                java.util.List list1 = c.a(l - 4);
                if ((k & 1) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                gsr1.a(false, flag, i & 0x7fffffff, list1, HeadersMode.b);
                return true;

            case 3: // '\003'
                if (l != 8)
                {
                    throw a("TYPE_RST_STREAM length: %d != 8", new Object[] {
                        Integer.valueOf(l)
                    });
                }
                i = a.i();
                j = a.i();
                ErrorCode errorcode = ErrorCode.a(j);
                if (errorcode == null)
                {
                    throw a("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                        Integer.valueOf(j)
                    });
                } else
                {
                    gsr1.a(i & 0x7fffffff, errorcode);
                    return true;
                }

            case 4: // '\004'
                a(gsr1, k, l);
                return true;

            case 6: // '\006'
                if (l != 4)
                {
                    throw a("TYPE_PING length: %d != 4", new Object[] {
                        Integer.valueOf(l)
                    });
                }
                i = a.i();
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
                gsr1.a(flag, i, 0);
                return true;

            case 7: // '\007'
                if (l != 8)
                {
                    throw a("TYPE_GOAWAY length: %d != 8", new Object[] {
                        Integer.valueOf(l)
                    });
                }
                i = a.i();
                j = a.i();
                if (ErrorCode.c(j) == null)
                {
                    throw a("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                        Integer.valueOf(j)
                    });
                } else
                {
                    gsr1.a(i & 0x7fffffff, ByteString.a);
                    return true;
                }

            case 8: // '\b'
                gsr1.a(false, false, a.i() & 0x7fffffff, c.a(l - 4), HeadersMode.c);
                return true;

            case 9: // '\t'
                break;
            }
            if (l != 8)
            {
                throw a("TYPE_WINDOW_UPDATE length: %d != 8", new Object[] {
                    Integer.valueOf(l)
                });
            }
            i = a.i();
            long l1 = a.i() & 0x7fffffff;
            if (l1 == 0L)
            {
                throw a("windowSizeIncrement was 0", new Object[] {
                    Long.valueOf(l1)
                });
            } else
            {
                gsr1.a(i & 0x7fffffff, l1);
                return true;
            }
        }
        if ((k & 1) != 0)
        {
            flag = true;
        }
        gsr1.a(flag, j & 0x7fffffff, a, l);
        return true;
    }

    public final void close()
    {
        c.b.close();
    }
}

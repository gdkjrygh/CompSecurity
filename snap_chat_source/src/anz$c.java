// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

static final class h extends alw
{

    private final long d[];
    private final int e[];
    private final int f[];
    private final String g[];
    private final ang.String h;

    static ang.String a(DataInput datainput, String s)
    {
        Object obj;
        long al[];
        int ai[];
        int ai1[];
        String as[];
        int j;
        int l;
        int i1;
        l = datainput.readUnsignedShort();
        obj = new String[l];
        for (int i = 0; i < l; i++)
        {
            obj[i] = datainput.readUTF();
        }

        i1 = datainput.readInt();
        al = new long[i1];
        ai = new int[i1];
        ai1 = new int[i1];
        as = new String[i1];
        j = 0;
_L2:
        int k;
        if (j >= i1)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        al[j] = anz.a(datainput);
        ai[j] = (int)anz.a(datainput);
        ai1[j] = (int)anz.a(datainput);
        if (l < 256)
        {
            try
            {
                k = datainput.readUnsignedByte();
            }
            // Misplaced declaration of an exception variable
            catch (DataInput datainput)
            {
                throw new IOException("Invalid encoding");
            }
            break MISSING_BLOCK_LABEL_204;
        }
        k = datainput.readUnsignedShort();
        break MISSING_BLOCK_LABEL_204;
        obj = null;
        if (datainput.readBoolean())
        {
            obj = new <init>(s, (int)anz.a(datainput), a(datainput), a(datainput));
        }
        return new <init>(s, al, ai, ai1, as, ((ang.String) (obj)));
        as[j] = obj[k];
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final String a(long l)
    {
        long al[] = d;
        int i = Arrays.binarySearch(al, l);
        if (i >= 0)
        {
            return g[i];
        }
        i = ~i;
        if (i < al.length)
        {
            if (i > 0)
            {
                return g[i - 1];
            } else
            {
                return "UTC";
            }
        }
        if (h == null)
        {
            return g[i - 1];
        } else
        {
            return h.a(l);
        }
    }

    public final int b(long l)
    {
        long al[] = d;
        int i = Arrays.binarySearch(al, l);
        if (i >= 0)
        {
            return e[i];
        }
        i = ~i;
        if (i < al.length)
        {
            if (i > 0)
            {
                return e[i - 1];
            } else
            {
                return 0;
            }
        }
        if (h == null)
        {
            return e[i - 1];
        } else
        {
            return h.b(l);
        }
    }

    public final boolean c()
    {
        return false;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof ))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj = ()obj;
        if (!super.c.equals(((alw) (obj)).c) || !Arrays.equals(d, ((d) (obj)).d) || !Arrays.equals(g, ((ang.Object) (obj)).g) || !Arrays.equals(e, ((e) (obj)).e) || !Arrays.equals(f, ((f) (obj)).f))
        {
            break; /* Loop/switch isn't completed */
        }
        if (h != null) goto _L4; else goto _L3
_L3:
        if (((h) (obj)).h == null) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (!h.equals(((ang.Object) (obj)).h)) goto _L5; else goto _L6
_L6:
        return true;
        return false;
    }

    public final long f(long l)
    {
        long al[] = d;
        int i = Arrays.binarySearch(al, l);
        long l1;
        if (i >= 0)
        {
            i++;
        } else
        {
            i = ~i;
        }
        if (i < al.length)
        {
            l1 = al[i];
        } else
        {
            l1 = l;
            if (h != null)
            {
                long l3 = al[al.length - 1];
                long l2 = l;
                if (l < l3)
                {
                    l2 = l3;
                }
                return h.f(l2);
            }
        }
        return l1;
    }

    public final long g(long l)
    {
        long al[];
        int i;
        al = d;
        i = Arrays.binarySearch(al, l);
        if (i < 0) goto _L2; else goto _L1
_L1:
        long l1;
        l1 = l;
        if (l > 0x8000000000000000L)
        {
            l1 = l - 1L;
        }
_L4:
        return l1;
_L2:
        i = ~i;
        if (i >= al.length)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = l;
        if (i > 0)
        {
            long l2 = al[i - 1];
            l1 = l;
            if (l2 > 0x8000000000000000L)
            {
                return l2 - 1L;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (h != null)
        {
            l1 = h.g(l);
            if (l1 < l)
            {
                return l1;
            }
        }
        long l3 = al[i - 1];
        l1 = l;
        if (l3 > 0x8000000000000000L)
        {
            return l3 - 1L;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private (String s, long al[], int ai[], int ai1[], String as[], ring ring)
    {
        super(s);
        d = al;
        e = ai;
        f = ai1;
        g = as;
        h = ring;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.a.a.b;

import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.c.b.a.a.f;
import com.nuance.a.a.a.c.b.a.a.g;
import com.nuance.a.a.a.c.b.c.a;
import com.nuance.a.a.a.c.c.c;
import com.nuance.a.a.a.c.c.e;
import java.util.Vector;

// Referenced classes of package com.nuance.a.a.a.c.a.a.b:
//            c

public class b extends e
    implements com.nuance.a.a.a.c.a.b.e, f
{

    private static final com.nuance.a.a.a.a.d.a.e h = d.a(com/nuance/a/a/a/c/a/a/b/b);
    public String a;
    private com.nuance.a.a.a.c.a.a.b.c i;
    private Object j;
    private g k;
    private com.nuance.a.a.a.c.a.b.c l;

    public b(String s, short word0, String s1, byte abyte0[], String s2, com.nuance.a.a.a.a.b.b b1, com.nuance.a.a.a.a.b.b b2, 
            Vector vector, com.nuance.a.a.a.c.a.b.c c1)
    {
        int i1;
        int j1;
        int k1;
        super(s, word0, s2, b1, b2);
        if (s1 == null)
        {
            throw new IllegalArgumentException(" application id is null.");
        }
        a = s1;
        if (abyte0 == null)
        {
            throw new IllegalArgumentException(" application key is null");
        }
        l = c1;
        j1 = -1;
        b1 = null;
        i1 = 0x186a0;
        k1 = 0;
        if (vector != null && vector.size() != 0) goto _L2; else goto _L1
_L1:
        s2 = new Vector();
        i1 = 0;
        j1 = 0x186a0;
        b1 = null;
        k1 = -1;
_L12:
        i = new com.nuance.a.a.a.c.a.a.b.c(e(), f(), s1, abyte0, d, s2, d(), c1);
        if (i1 == 0)
        {
            k = new g(s, word0, a, abyte0, j1, k1, b1, vector, d, d(), this);
            i.a(k);
        }
        return;
_L2:
        Vector vector1;
        int j2;
        vector1 = new Vector(vector.size());
        j2 = 0;
_L4:
        c c2;
        int l1;
        int l2;
        int i3;
        if (j2 >= vector.size())
        {
            break MISSING_BLOCK_LABEL_891;
        }
        c2 = (c)vector.elementAt(j2);
        l1 = k1;
        l2 = i1;
        b2 = b1;
        i3 = j1;
        if (c2.d() == com.nuance.a.a.a.c.c.d.a)
        {
            if (!c2.a().equals("DEVICE_CMD_LOG_TO_SERVER_ENABLED"))
            {
                break; /* Loop/switch isn't completed */
            }
            j = new Vector();
            i3 = j1;
            b2 = b1;
            l2 = i1;
            l1 = k1;
        }
_L5:
        vector1.addElement(c2);
        j2++;
        k1 = l1;
        i1 = l2;
        b1 = b2;
        j1 = i3;
        if (true) goto _L4; else goto _L3
_L3:
label0:
        {
            if (!c2.a().equals("Calllog_Disable"))
            {
                break MISSING_BLOCK_LABEL_470;
            }
            if (!(new String(c2.b())).equals("TRUE") && !(new String(c2.b())).equals("true"))
            {
                break label0;
            }
            l1 = 1;
            l2 = i1;
            b2 = b1;
            i3 = j1;
        }
          goto _L5
        if ((new String(c2.b())).equals("FALSE")) goto _L7; else goto _L6
_L6:
        l1 = k1;
        l2 = i1;
        b2 = b1;
        i3 = j1;
        if (!(new String(c2.b())).equals("false")) goto _L5; else goto _L7
_L7:
        l1 = 0;
        l2 = i1;
        b2 = b1;
        i3 = j1;
          goto _L5
        if (c2.a().equals("Calllog_Root_Id"))
        {
            b2 = new String(c2.b());
            l1 = k1;
            l2 = i1;
            i3 = j1;
        } else
        if (c2.a().equals("Calllog_Retention_Days"))
        {
            i3 = Integer.parseInt(new String(c2.b()));
            if (i3 == -1 || i3 > 0)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            l1 = k1;
            l2 = i1;
            b2 = b1;
            if (j1 == 0)
            {
                throw new IllegalArgumentException("The NMSP_DEFINES_CALLLOG_RETENTION_DAYS parameter must be greater than 0 or equals to -1.");
            }
        } else
        {
label1:
            {
                if (!c2.a().equals("Calllog_Chunk_Size"))
                {
                    break label1;
                }
                i1 = Integer.parseInt(new String(c2.b()));
                if (i1 < 20000)
                {
                    throw new IllegalArgumentException("Minimum chunk size for calllog is 20000");
                }
                l1 = k1;
                l2 = i1;
                b2 = b1;
                i3 = j1;
                if (i1 > 0x249f0)
                {
                    throw new IllegalArgumentException("Maximum chunk size for calllog is 150000");
                }
            }
        }
          goto _L5
        l1 = k1;
        l2 = i1;
        b2 = b1;
        i3 = j1;
        if (!c2.a().equals("Enable_UserId_Encryption")) goto _L5; else goto _L8
_L8:
        if ((new String(c2.b())).equals("TRUE")) goto _L10; else goto _L9
_L9:
        l1 = k1;
        l2 = i1;
        b2 = b1;
        i3 = j1;
        if (!(new String(c2.b())).equals("true")) goto _L5; else goto _L10
_L10:
        b2 = com.nuance.a.a.a.a.d.a.f.b(s1.getBytes(), s2.getBytes());
        StringBuilder stringbuilder = new StringBuilder();
        l1 = 0;
        while (l1 < b2.length) 
        {
            String s3 = Integer.toHexString(b2[l1]);
            if (s3.length() == 1)
            {
                stringbuilder.append(0);
                stringbuilder.append(s3.charAt(s3.length() - 1));
            } else
            {
                stringbuilder.append(s3.substring(s3.length() - 2));
            }
            l1++;
        }
        d = stringbuilder.toString();
        l1 = k1;
        l2 = i1;
        b2 = b1;
        i3 = j1;
          goto _L5
        int i2 = i1;
        int k2 = j1;
        s2 = vector1;
        i1 = k1;
        j1 = i2;
        k1 = k2;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final com.nuance.a.a.a.c.a.a.b.c a()
    {
        return i;
    }

    public final void a(byte abyte0[])
    {
        l.a(abyte0);
    }

    public final Object b()
    {
        return j;
    }

    public final void c()
    {
        if (k != null)
        {
            com.nuance.a.a.a.c.b.c.c c1 = k.a();
            if (c1 != null)
            {
                c1.b("NMSP_ShutDown").a();
            }
            k.b();
            k.c();
        }
        i.c();
    }

}

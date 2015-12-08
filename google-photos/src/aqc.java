// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class aqc
    implements ane
{

    private static final bad b = new bad(50);
    private final ane c;
    private final ane d;
    private final int e;
    private final int f;
    private final Class g;
    private final ani h;
    private final anl i;

    public aqc(ane ane1, ane ane2, int j, int k, anl anl1, Class class1, ani ani1)
    {
        c = ane1;
        d = ane2;
        e = j;
        f = k;
        i = anl1;
        g = class1;
        h = ani1;
    }

    public final void a(MessageDigest messagedigest)
    {
        byte abyte0[] = ByteBuffer.allocate(8).putInt(e).putInt(f).array();
        d.a(messagedigest);
        c.a(messagedigest);
        messagedigest.update(abyte0);
        if (i != null)
        {
            i.a(messagedigest);
        }
        h.a(messagedigest);
        byte abyte1[] = (byte[])b.b(g);
        abyte0 = abyte1;
        if (abyte1 == null)
        {
            abyte0 = g.getName().getBytes(a);
            b.b(g, abyte0);
        }
        messagedigest.update(abyte0);
    }

    public final boolean equals(Object obj)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (!(obj instanceof aqc)) goto _L2; else goto _L1
_L1:
        obj = (aqc)obj;
        flag = flag1;
        if (f != ((aqc) (obj)).f) goto _L2; else goto _L3
_L3:
        flag = flag1;
        if (e != ((aqc) (obj)).e) goto _L2; else goto _L4
_L4:
        if (i != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((aqc) (obj)).i != null) goto _L2; else goto _L7
_L7:
        flag = flag1;
        if (g.equals(((aqc) (obj)).g))
        {
            flag = flag1;
            if (c.equals(((aqc) (obj)).c))
            {
                flag = flag1;
                if (d.equals(((aqc) (obj)).d))
                {
                    flag = flag1;
                    if (h.equals(((aqc) (obj)).h))
                    {
                        flag = true;
                    }
                }
            }
        }
_L2:
        return flag;
_L6:
        flag = flag1;
        if (!i.equals(((aqc) (obj)).i)) goto _L2; else goto _L7
    }

    public final int hashCode()
    {
        int k = ((c.hashCode() * 31 + d.hashCode()) * 31 + e) * 31 + f;
        int j = k;
        if (i != null)
        {
            j = k * 31 + i.hashCode();
        }
        return (j * 31 + g.hashCode()) * 31 + h.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf("ResourceCacheKey{sourceKey=");
        String s1 = String.valueOf(c);
        String s2 = String.valueOf(d);
        int j = e;
        int k = f;
        String s3 = String.valueOf(g);
        String s4 = String.valueOf(i);
        String s5 = String.valueOf(h);
        return (new StringBuilder(String.valueOf(s).length() + 104 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length())).append(s).append(s1).append(", signature=").append(s2).append(", width=").append(j).append(", height=").append(k).append(", decodedResourceClass=").append(s3).append(", transformation='").append(s4).append("', options=").append(s5).append("}").toString();
    }

}

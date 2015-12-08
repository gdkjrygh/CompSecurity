// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.MessageDigest;
import java.util.Map;

public final class apr
    implements ane
{

    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final ane g;
    private final Map h;
    private final ani i;
    private int j;

    public apr(Object obj, ane ane1, int k, int l, Map map, Class class1, Class class2, 
            ani ani1)
    {
        b = b.a(obj, "Argument must not be null");
        g = (ane)b.a(ane1, "Signature must not be null");
        c = k;
        d = l;
        h = (Map)b.a(map, "Argument must not be null");
        e = (Class)b.a(class1, "Resource class must not be null");
        f = (Class)b.a(class2, "Transcode class must not be null");
        i = (ani)b.a(ani1, "Argument must not be null");
    }

    public final void a(MessageDigest messagedigest)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof apr)
        {
            obj = (apr)obj;
            flag = flag1;
            if (b.equals(((apr) (obj)).b))
            {
                flag = flag1;
                if (g.equals(((apr) (obj)).g))
                {
                    flag = flag1;
                    if (d == ((apr) (obj)).d)
                    {
                        flag = flag1;
                        if (c == ((apr) (obj)).c)
                        {
                            flag = flag1;
                            if (h.equals(((apr) (obj)).h))
                            {
                                flag = flag1;
                                if (e.equals(((apr) (obj)).e))
                                {
                                    flag = flag1;
                                    if (f.equals(((apr) (obj)).f))
                                    {
                                        flag = flag1;
                                        if (i.equals(((apr) (obj)).i))
                                        {
                                            flag = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        if (j == 0)
        {
            j = b.hashCode();
            j = j * 31 + g.hashCode();
            j = j * 31 + c;
            j = j * 31 + d;
            j = j * 31 + h.hashCode();
            j = j * 31 + e.hashCode();
            j = j * 31 + f.hashCode();
            j = j * 31 + i.hashCode();
        }
        return j;
    }

    public final String toString()
    {
        String s = String.valueOf("EngineKey{model=");
        String s1 = String.valueOf(b);
        int k = c;
        int l = d;
        String s2 = String.valueOf(e);
        String s3 = String.valueOf(f);
        String s4 = String.valueOf(g);
        int i1 = j;
        String s5 = String.valueOf(h);
        String s6 = String.valueOf(i);
        return (new StringBuilder(String.valueOf(s).length() + 135 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length())).append(s).append(s1).append(", width=").append(k).append(", height=").append(l).append(", resourceClass=").append(s2).append(", transcodeClass=").append(s3).append(", signature=").append(s4).append(", hashCode=").append(i1).append(", transformations=").append(s5).append(", options=").append(s6).append("}").toString();
    }
}

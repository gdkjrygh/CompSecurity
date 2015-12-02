// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear;

import com.qihoo.security.clearengine.TrashType;
import com.qihoo.security.clearengine.surface.b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.qihoo.security.opti.trashclear:
//            d

public class e
{
    public static class a
    {

        public long a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public long j;
        public long k;
        public int l;
        public int m;
        public long n;

        public a a()
        {
            a a1 = new a();
            a1.a = a;
            a1.b = b;
            a1.c = c;
            a1.d = d;
            a1.e = e;
            a1.f = f;
            a1.g = g;
            a1.h = h;
            a1.i = i;
            a1.m = m;
            a1.l = l;
            a1.j = j;
            a1.k = k;
            return a1;
        }

        public long b()
        {
            return b + i + k + n;
        }

        public long c()
        {
            return a;
        }

        public Object clone()
            throws CloneNotSupportedException
        {
            return a();
        }

        public long d()
        {
            return j + c;
        }

        public long e()
        {
            return b() + c() + d();
        }

        public long f()
        {
            return b() + c();
        }

        public String toString()
        {
            return (new StringBuilder()).append("CleanSizeInfo [appCacheLength=").append(a).append(", sysAppCacheLength=").append(b).append(", residualFileLength=").append(c).append(", emptyDirLength=").append(d).append(", logLength=").append(e).append(", lostDirLength=").append(f).append(", tempLength=").append(g).append(", thumbnailLength=").append(h).append(", uselessApkLength=").append(i).append(", bigfileLength=").append(j).append(", adFileLength=").append(k).append(", privacyType=").append(l).append(", privacyCount=").append(m).toString();
        }

        public a()
        {
            a = 0L;
            b = 0L;
            c = 0L;
            d = 0L;
            e = 0L;
            f = 0L;
            g = 0L;
            h = 0L;
            i = 0L;
            j = 0L;
            k = 0L;
            l = 0;
            m = 0;
            n = 0L;
        }
    }


    private static final String a = com/qihoo/security/opti/trashclear/e.getSimpleName();

    public e()
    {
    }

    public static d a(int i, Map map)
    {
        d d1 = new d();
        d1.m = i;
        d1.q = i;
        d1.o = i;
        d1.a = i;
        a(map, d1.j, d1.k, d1.l);
        return d1;
    }

    public static void a(Map map, a a1, a a2, a a3)
    {
        if (map != null && a1 != null && a2 != null)
        {
            map = map.entrySet().iterator();
            do
            {
                if (!map.hasNext())
                {
                    continue;
                }
                Object obj = (java.util.Map.Entry)map.next();
                TrashType trashtype = (TrashType)((java.util.Map.Entry) (obj)).getKey();
                obj = (b)((java.util.Map.Entry) (obj)).getValue();
                long l = ((b) (obj)).a;
                long l1 = ((b) (obj)).b;
                long l2 = l1 - l;
                static class _cls1
                {

                    static final int a[];

                    static 
                    {
                        a = new int[TrashType.values().length];
                        try
                        {
                            a[TrashType.CATE_CACHE.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        try
                        {
                            a[TrashType.CATE_ADPLUGIN.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            a[TrashType.CATE_UNINSTALLED.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            a[TrashType.CATE_APK.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[TrashType.CATE_BIGFILE.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[TrashType.CATE_SYSTEM.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[TrashType.CATE_UNDEFINED_TYPE.ordinal()] = 7;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls1.a[trashtype.ordinal()])
                {
                case 1: // '\001'
                    a1.a = l1;
                    a2.a = l;
                    a3.a = l2;
                    break;

                case 2: // '\002'
                    a1.k = l1;
                    a2.k = l;
                    a3.k = l2;
                    break;

                case 3: // '\003'
                    a1.c = l1;
                    a2.c = l;
                    a3.c = l2;
                    break;

                case 4: // '\004'
                    a1.i = l1;
                    a2.i = l;
                    a3.i = l2;
                    break;

                case 5: // '\005'
                    a1.j = l1;
                    a2.j = l;
                    a3.j = l2;
                    break;

                case 6: // '\006'
                    a1.b = l1;
                    a2.b = l;
                    a3.b = l2;
                    break;
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_265;
        while (true) 
        {
            return;
        }
    }

}

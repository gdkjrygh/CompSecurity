// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.c.b:
//            aq, an, bd

public final class ap extends aq
{
    private static final class a
    {

        private final ak.a a;
        private final int b;

        public final boolean equals(Object obj)
        {
            if (obj instanceof a)
            {
                if (a == ((a) (obj = (a)obj)).a && b == ((a) (obj)).b)
                {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode()
        {
            return a.hashCode() * 65535 + b;
        }

        a(ak.a a1, int i)
        {
            a = a1;
            b = i;
        }
    }

    public static final class b
    {

        public final ak.f a;
        public final bd b;

        private b(ak.f f, bd bd1)
        {
            a = f;
            b = bd1;
        }

        b(ak.f f, bd bd1, byte byte0)
        {
            this(f, bd1);
        }
    }


    private static final ap e = new ap((byte)0);
    private final Map a;
    private final Map b;
    private final Map c;
    private final Map d;

    private ap()
    {
        a = new HashMap();
        b = new HashMap();
        c = new HashMap();
        d = new HashMap();
    }

    private ap(byte byte0)
    {
        super(aq.d());
        a = Collections.emptyMap();
        b = Collections.emptyMap();
        c = Collections.emptyMap();
        d = Collections.emptyMap();
    }

    public static ap a()
    {
        return new ap();
    }

    public static ap b()
    {
        return e;
    }

    public final b a(ak.a a1, int i)
    {
        return (b)c.get(new a(a1, i));
    }

    public final void a(an an1)
    {
        if (an1.b() == an.a.a || an1.b() == an.a.b) goto _L2; else goto _L1
_L1:
        return;
_L2:
        b b1;
        Object obj;
        int i;
        if (an1.a().f() == ak.f.a.i)
        {
            if (an1.c() == null)
            {
                throw new IllegalStateException((new StringBuilder("Registered message-type extension had null default instance: ")).append(an1.a().c()).toString());
            }
            b1 = new b(an1.a(), (bd)an1.c(), (byte)0);
        } else
        {
            b1 = new b(an1.a(), null, (byte)0);
        }
        i = an1.b();
        if (!b1.a.s())
        {
            throw new IllegalArgumentException("ExtensionRegistry.add() was given a FieldDescriptor for a regular (non-extension) field.");
        }
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[an.a.a().length];
                try
                {
                    a[an.a.a - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[an.a.b - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[i - 1])
        {
        default:
            return;

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 1: // '\001'
            an1 = a;
            obj = c;
            break;
        }
_L4:
        an1.put(b1.a.c(), b1);
        ((Map) (obj)).put(new a(b1.a.t(), b1.a.e()), b1);
        obj = b1.a;
        if (((ak.f) (obj)).t().e().i() && ((ak.f) (obj)).h() == ak.f.b.k && ((ak.f) (obj)).n() && ((ak.f) (obj)).v() == ((ak.f) (obj)).w())
        {
            an1.put(((ak.f) (obj)).w().c(), b1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        an1 = b;
        obj = d;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

}

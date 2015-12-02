// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.e;


// Referenced classes of package android_src.mms.e:
//            k, m, l

class o
{

    final k a;
    private int b;
    private int c;

    private o(k k1)
    {
        a = k1;
        super();
    }

    o(k k1, l l)
    {
        this(k1);
    }

    static int a(o o1, int i)
    {
        o1.b = i;
        return i;
    }

    static int b(o o1, int i)
    {
        o1.c = i;
        return i;
    }

    int a()
    {
        if (c != k.a(a).a)
        {
            throw new RuntimeException("BUG: Invalid call to getLength()");
        } else
        {
            return a.b - b;
        }
    }
}

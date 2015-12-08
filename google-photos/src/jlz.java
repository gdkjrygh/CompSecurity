// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import android.util.SparseBooleanArray;

public final class jlz
    implements jkd
{

    final SparseBooleanArray a;
    final SparseArray b;
    jlu c;
    private final jlx d;
    private final jnl e;
    private final jnk f;
    private final boolean g;
    private jkf h;

    public jlz()
    {
        this(new jlx(0L));
    }

    private jlz(jlx jlx1)
    {
        this(jlx1, true);
    }

    private jlz(jlx jlx1, boolean flag)
    {
        g = true;
        f = new jnk(new byte[3]);
        e = new jnl(188);
        a = new SparseBooleanArray();
        b = new SparseArray();
        b.put(0, new jma(this));
        d = jlx1;
    }

    static boolean a(jlz jlz1)
    {
        return jlz1.g;
    }

    static jlx b(jlz jlz1)
    {
        return jlz1.d;
    }

    public final int a(jke jke1, jkk jkk)
    {
        if (!jke1.a(e.a, 0, 188, true))
        {
            return -1;
        }
        e.b(0);
        e.a(188);
        if (e.d() != 71)
        {
            return 0;
        }
        e.a(f, 3);
        f.b(1);
        boolean flag = f.b();
        f.b(1);
        int i = f.c(13);
        f.b(2);
        boolean flag1 = f.b();
        boolean flag2 = f.b();
        if (flag1)
        {
            int j = e.d();
            e.c(j);
        }
        if (flag2)
        {
            jke1 = (jmd)b.get(i);
            if (jke1 != null)
            {
                jke1.a(e, flag, h);
            }
        }
        return 0;
    }

    public final void a(jkf jkf1)
    {
        h = jkf1;
        jkf1.a(jko.a);
    }

    public final boolean a(jke jke1)
    {
        byte abyte0[] = new byte[1];
        for (int i = 0; i < 5; i++)
        {
            jke1.c(abyte0, 0, 1);
            if ((abyte0[0] & 0xff) != 71)
            {
                return false;
            }
            jke1.b(187);
        }

        return true;
    }

    public final void b()
    {
        d.a = 0x8000000000000000L;
        for (int i = 0; i < b.size(); i++)
        {
            ((jmd)b.valueAt(i)).a();
        }

    }
}

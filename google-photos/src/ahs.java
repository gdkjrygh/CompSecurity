// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.Arrays;

public class ahs
{

    public agu a;
    boolean b;

    ahs(agu agu1)
    {
        b = false;
        a = agu1;
    }

    ahs(aif aif1, int ai[], ahw ahw1)
    {
        b = false;
        a = new agu(aif1, ai, ahw1);
    }

    public static ahs a(aif aif1, int ai[])
    {
        ahw ahw1 = ahw.a();
        if (ahw1 == null)
        {
            throw new IllegalStateException("Attempting to create new Frame outside of FrameManager context!");
        } else
        {
            return new ahs(aif1, ai, ahw1);
        }
    }

    public final aif a()
    {
        return a.a;
    }

    public final void a(long l1)
    {
        a.c = l1;
    }

    void a(int ai[])
    {
        int j1 = 0;
        int ai1[] = a.b;
        int i1;
        if (ai1 == null)
        {
            i1 = 0;
        } else
        {
            i1 = ai1.length;
        }
        if (ai != null)
        {
            j1 = ai.length;
        }
        if (i1 != j1)
        {
            throw new IllegalArgumentException((new StringBuilder(77)).append("Cannot resize ").append(i1).append("-dimensional Frame to ").append(j1).append("-dimensional Frame!").toString());
        }
        if (ai != null && !Arrays.equals(ai1, ai))
        {
            a.a(ai);
        }
    }

    public final int b()
    {
        agu agu1 = a;
        int k1 = 1;
        int i1 = 1;
        if (agu1.b != null)
        {
            int ai[] = agu1.b;
            int l1 = ai.length;
            int j1 = 0;
            do
            {
                k1 = i1;
                if (j1 >= l1)
                {
                    break;
                }
                k1 = ai[j1];
                j1++;
                i1 = k1 * i1;
            } while (true);
        }
        return k1;
    }

    public final long c()
    {
        return a.c;
    }

    public final aig d()
    {
        agu agu1 = a;
        aig.a(agu1.a);
        return new aig(agu1);
    }

    public final aih e()
    {
        agu agu1 = a;
        aih.a(agu1.a);
        return new aih(agu1);
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof ahs) && ((ahs)obj).a == a;
    }

    public final aht f()
    {
        agu agu1 = a;
        aht.a(agu1);
        return new aht(agu1);
    }

    public final ahu g()
    {
        agu agu1 = a;
        ahu.b(agu1);
        return new ahu(agu1);
    }

    public final ahv h()
    {
        agu agu1 = a;
        ahu.b(agu1);
        return new ahv(agu1);
    }

    public final ahs i()
    {
        agu agu2 = a;
        if (agu2.e <= 0)
        {
            throw new RuntimeException("DOUBLE-RELEASE");
        }
        agu2.e = agu2.e - 1;
        agu agu1 = agu2;
        if (agu2.e == 0)
        {
            agu2.b();
            agu1 = null;
        }
        a = agu1;
        if (a != null)
        {
            return this;
        } else
        {
            return null;
        }
    }

    public final ahs j()
    {
        agu agu1 = a;
        if (agu1.e >= 10)
        {
            int i1 = agu1.e;
            String s = String.valueOf(agu1);
            Log.w("BackingStore", (new StringBuilder(String.valueOf(s).length() + 34)).append("High ref-count of ").append(i1).append(" on ").append(s).append("!").toString());
        }
        if (agu1.e <= 0)
        {
            throw new RuntimeException("RETAINING RELEASED");
        } else
        {
            agu1.e = agu1.e + 1;
            a = agu1;
            return this;
        }
    }

    public final void k()
    {
        if (!a.a())
        {
            throw new RuntimeException("Attempting to unlock frame that is not locked!");
        } else
        {
            return;
        }
    }

    public int[] l()
    {
        int ai[] = a.b;
        if (ai != null)
        {
            return Arrays.copyOf(ai, ai.length);
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        String s = a().toString();
        String s1 = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 9 + String.valueOf(s1).length())).append("Frame[").append(s).append("]: ").append(s1).toString();
    }
}

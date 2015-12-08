// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


// Referenced classes of package crittercism.android:
//            t, h

public final class ar
    implements t
{
    public static final class a
    {

        public a()
        {
        }
    }


    int a;

    private ar(int i)
    {
        a = i;
    }

    ar(int i, byte byte0)
    {
        this(i);
    }

    public final boolean a(h h1, String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        h1.a(s, s1, Integer.valueOf(a).intValue());
        this;
        JVM INSTR monitorexit ;
        return true;
        h1;
        throw h1;
    }

    public final Object b()
    {
        return Integer.valueOf(a);
    }
}

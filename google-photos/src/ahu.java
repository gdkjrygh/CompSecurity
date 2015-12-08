// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class ahu extends aht
{

    ahu(agu agu1)
    {
        super(agu1);
    }

    public static void b(agu agu1)
    {
        aht.a(agu1);
        agu1 = agu1.b;
        int i;
        if (agu1 != null)
        {
            i = agu1.length;
        } else
        {
            i = 0;
        }
        if (i != 2)
        {
            throw new RuntimeException((new StringBuilder(72)).append("Cannot access ").append(i).append("-dimensional Frame as a FrameBuffer2D instance!").toString());
        } else
        {
            return;
        }
    }

    public final int m()
    {
        return a.b[0];
    }

    public final int n()
    {
        return a.b[1];
    }
}

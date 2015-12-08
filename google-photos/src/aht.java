// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public class aht extends ahs
{

    private int c;

    aht(agu agu1)
    {
        int i = 0;
        super(agu1);
        c = 0;
        agu1 = agu1.b;
        c = 1;
        for (int j = agu1.length; i < j; i++)
        {
            c = agu1[i] * c;
        }

    }

    static void a(agu agu1)
    {
        aif aif1 = agu1.a;
        if (aif1.d() == 0)
        {
            agu1 = String.valueOf(aif1);
            throw new RuntimeException((new StringBuilder(String.valueOf(agu1).length() + 55)).append("Cannot access Frame of type ").append(agu1).append(" as a FrameBuffer instance!").toString());
        }
        agu1 = agu1.b;
        if (agu1 == null || agu1.length == 0)
        {
            throw new RuntimeException("Cannot access Frame with no dimensions as a FrameBuffer instance!");
        } else
        {
            return;
        }
    }

    public final ByteBuffer a(int i)
    {
        if (super.b && i == 2)
        {
            String s = String.valueOf(this);
            throw new RuntimeException((new StringBuilder(String.valueOf(s).length() + 40)).append("Attempting to write to read-only frame ").append(s).append("!").toString());
        } else
        {
            return (ByteBuffer)a.a(i, 1);
        }
    }

    public final void a(int ai[])
    {
        super.a(ai);
    }

    public final int[] l()
    {
        return super.l();
    }
}

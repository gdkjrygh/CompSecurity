// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.mp4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//            Atom

final class ah extends Atom
{

    public final long ah;
    public final List ai = new ArrayList();
    public final List aj = new ArrayList();

    public final void a(ah ah1)
    {
        aj.add(ah1);
    }

    public final void a(aj aj1)
    {
        ai.add(aj1);
    }

    public final ai d(int i)
    {
        int k = ai.size();
        for (int j = 0; j < k; j++)
        {
            ai ai1 = (ai)ai.get(j);
            if (ai1.ai == i)
            {
                return ai1;
            }
        }

        return null;
    }

    public final ai e(int i)
    {
        int k = aj.size();
        for (int j = 0; j < k; j++)
        {
            ai ai1 = (aj)aj.get(j);
            if (ai1.ag == i)
            {
                return ai1;
            }
        }

        return null;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(c(ag)).append(" leaves: ").append(Arrays.toString(ai.toArray(new ai[0]))).append(" containers: ").append(Arrays.toString(aj.toArray(new aj[0]))).toString();
    }

    public (int i, long l)
    {
        super(i);
        ah = l;
    }
}

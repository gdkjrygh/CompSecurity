// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.base;

import ahn;
import aif;
import ajo;
import ajr;
import aju;
import ajw;
import android.os.SystemClock;

public final class MergeFilter extends ahn
{

    public static final int MODE_LFU = 2;
    public static final int MODE_LRU = 1;
    private int mMode;
    private long mPortScores[];

    public MergeFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mMode = 1;
        mPortScores = null;
    }

    public final void a(ajo ajo1)
    {
        ajo1.f = false;
    }

    public final ajw b()
    {
        ajw ajw1 = (new ajw()).b("output", 2, aif.a());
        ajw1.d = false;
        return ajw1;
    }

    public final void b(ajo ajo1)
    {
        ajo1.a(b("output"));
    }

    protected final void d()
    {
        mPortScores = new long[super.mConnectedInputPortArray.length];
        for (int i = 0; i < mPortScores.length; i++)
        {
            mPortScores[i] = 0x8000000000000000L;
        }

    }

    protected final void e()
    {
        int k;
label0:
        {
            long l1 = 0x8000000000000000L;
            k = -1;
            ajo aajo[] = super.mConnectedInputPortArray;
            for (int i = 0; i < aajo.length;)
            {
                int l = k;
                long l2 = l1;
                if (aajo[i].b())
                {
                    long l3 = mPortScores[i];
                    l = k;
                    l2 = l1;
                    if (l3 >= l1)
                    {
                        l = i;
                        l2 = l3;
                    }
                }
                i++;
                k = l;
                l1 = l2;
            }

            if (k >= 0)
            {
                ahs ahs = aajo[k].a();
                b("output").a(ahs);
                switch (mMode)
                {
                default:
                    int j = mMode;
                    throw new RuntimeException((new StringBuilder(31)).append("Unknown merge mode ").append(j).append("!").toString());

                case 2: // '\002'
                    break label0;

                case 1: // '\001'
                    mPortScores[k] = -SystemClock.elapsedRealtime();
                    break;
                }
            }
            return;
        }
        mPortScores[k] = mPortScores[k] - 1L;
    }
}

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

public final class BranchFilter extends ahn
{

    private boolean mSynchronized;

    public BranchFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mSynchronized = true;
    }

    public BranchFilter(ajr ajr, String s, boolean flag)
    {
        super(ajr, s);
        mSynchronized = true;
        mSynchronized = false;
    }

    public final ajw b()
    {
        ajw ajw1 = (new ajw()).a("input", 2, aif.a()).a("synchronized", 1, aif.a(Boolean.TYPE));
        ajw1.c = false;
        return ajw1;
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("input"))
        {
            aju aaju[] = super.mConnectedOutputPortArray;
            int j = aaju.length;
            for (int i = 0; i < j; i++)
            {
                ajo1.a(aaju[i]);
            }

        } else
        if (ajo1.b.equals("synchronized"))
        {
            ajo1.a("mSynchronized");
            ajo1.g = true;
        }
    }

    protected final void d()
    {
        int i = 0;
        if (mSynchronized)
        {
            aju aaju[] = super.mConnectedOutputPortArray;
            for (int k = aaju.length; i < k; i++)
            {
                aaju[i].f = true;
            }

        } else
        {
            aju aaju1[] = super.mConnectedOutputPortArray;
            int l = aaju1.length;
            for (int j = 0; j < l; j++)
            {
                aaju1[j].f = false;
            }

        }
    }

    protected final void e()
    {
        ahs ahs = a("input").a();
        aju aaju[] = super.mConnectedOutputPortArray;
        int j = aaju.length;
        for (int i = 0; i < j; i++)
        {
            aju aju1 = aaju[i];
            if (aju1.a())
            {
                aju1.a(ahs);
            }
        }

    }
}

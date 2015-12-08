// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.base;

import ahn;
import aif;
import ajo;
import ajr;
import aju;
import ajw;

public class ToggleableBranchFilter extends ahn
{

    public ToggleableBranchFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        ajw ajw1 = (new ajw()).a("input", 2, aif.a());
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
                aju aju1 = aaju[i];
                if (aju1.g.a.mIsActive)
                {
                    ajo1.a(aju1);
                }
            }

        }
    }

    protected final void d()
    {
        aju aaju[] = super.mConnectedOutputPortArray;
        int j = aaju.length;
        for (int i = 0; i < j; i++)
        {
            aju aju1 = aaju[i];
            aju1.f = aju1.g.a.mIsActive;
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

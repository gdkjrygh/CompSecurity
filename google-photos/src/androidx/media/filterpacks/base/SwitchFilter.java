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

public final class SwitchFilter extends ahn
{

    private String mTarget;

    public SwitchFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mTarget = null;
    }

    public final void a(aju aju1)
    {
        aju1.f = false;
    }

    public final ajw b()
    {
        ajw ajw1 = (new ajw()).a("input", 2, aif.a()).a("target", 1, aif.a(java/lang/String));
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
        if (ajo1.b.equals("target"))
        {
            ajo1.a("mTarget");
            ajo1.g = true;
        }
    }

    protected final void e()
    {
label0:
        {
            if (mTarget != null)
            {
                aju aju1 = b(mTarget);
                if (aju1 == null)
                {
                    break label0;
                }
                if (aju1.a())
                {
                    aju1.a(a("input").a());
                }
            }
            return;
        }
        String s = mTarget;
        throw new RuntimeException((new StringBuilder(String.valueOf(s).length() + 23)).append("Unknown target port '").append(s).append("'!").toString());
    }
}

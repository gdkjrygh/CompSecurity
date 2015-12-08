// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.base;

import ahn;
import ahs;
import aif;
import aig;
import aih;
import ajo;
import ajr;
import aju;
import ajw;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;

public final class ArrayToSequenceFilter extends ahn
{

    Queue mValues;

    public ArrayToSequenceFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mValues = new LinkedList();
    }

    public final ajw b()
    {
        return (new ajw()).a("inputArray", 2, aif.c()).b("outputSequence", 2, aif.b()).b("remainingElements", 1, aif.a(Integer.TYPE)).a();
    }

    protected final void e()
    {
        ajo ajo1 = a("inputArray");
        if (mValues.size() == 0)
        {
            Object obj = ajo1.a().e().n();
            for (int i = 0; i < Array.getLength(obj); i++)
            {
                mValues.add(Array.get(obj, i));
            }

        }
        aju aju1 = b("remainingElements");
        if (aju1 != null)
        {
            aig aig1 = aju1.a(null).d();
            aig1.a(Integer.valueOf(mValues.size()));
            aju1.a(aig1);
        }
        if (mValues.size() > 0)
        {
            aju aju2 = b("outputSequence");
            aig aig2 = aju2.a(null).d();
            aig2.a(mValues.remove());
            aju2.a(aig2);
        }
        if (mValues.size() == 0)
        {
            ajo1.f = true;
            super.mMinimumAvailableInputs = 1;
            return;
        } else
        {
            ajo1.f = false;
            super.mMinimumAvailableInputs = 0;
            return;
        }
    }
}

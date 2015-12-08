// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.base;

import ahn;
import ahs;
import aib;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;

public final class SequenceToArrayFilter extends ahn
{

    private int mNumRemainingElements;
    private int mStage;
    Queue mValues;

    public SequenceToArrayFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mStage = 1;
        mValues = new LinkedList();
    }

    private static Class c(aju aju1)
    {
        return aju1.g.e.b.c;
    }

    public final void a(ajo ajo1)
    {
        if (ajo1.b.equals("remainingElements"))
        {
            ajo1.f = true;
        } else
        if (ajo1.b.equals("inputSequence"))
        {
            ajo1.f = false;
            return;
        }
    }

    public final ajw b()
    {
        return (new ajw()).a("inputSequence", 2, aif.b()).a("remainingElements", 2, aif.a(Integer.TYPE)).b("outputArray", 2, aif.c()).a();
    }

    protected final void e()
    {
        Object obj;
        aju aju1;
        Object obj1;
        int i;
        i = 0;
        obj = a("remainingElements");
        obj1 = a("inputSequence");
        aju1 = b("outputArray");
        mStage;
        JVM INSTR tableswitch 1 2: default 52
    //                   1 62
    //                   2 172;
           goto _L1 _L2 _L3
_L1:
        throw new RuntimeException("SequenceToArray: invalid state!");
_L2:
        if (!((ajo) (obj)).b())
        {
            throw new RuntimeException("SequenceToArray expected frame on port remainingElements, but no frame is available!");
        }
        mNumRemainingElements = ((Integer)((ajo) (obj)).a().d().m()).intValue();
        if (mNumRemainingElements > 0)
        {
            obj.f = false;
            obj1.f = true;
            mStage = 2;
            obj = null;
        } else
        {
            obj = Array.newInstance(c(aju1), 0);
            i = 1;
        }
_L5:
        if (i != 0)
        {
            obj1 = aju1.a(null).e();
            ((aig) (obj1)).a(obj);
            aju1.a(((ahs) (obj1)));
            mValues.clear();
        }
        return;
_L3:
        if (!((ajo) (obj1)).b())
        {
            throw new RuntimeException("SequenceToArray expected frame on port inputSequence, but no frame is available!");
        }
        mValues.add(((ajo) (obj1)).a().d().m());
        obj.f = true;
        obj1.f = false;
        mStage = 1;
        if (mNumRemainingElements == 1)
        {
            obj = Array.newInstance(c(aju1), mValues.size());
            for (i = 0; i < Array.getLength(obj); i++)
            {
                Array.set(obj, i, mValues.remove());
            }

            i = 1;
        } else
        {
            obj = null;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }
}

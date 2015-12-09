// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v8.renderscript:
//            ScriptGroup

public static final class mArgIndex
{

    List mArgIndex;
    List mFieldID;
    Object mValue;

    void addReference(e e, int i)
    {
        mArgIndex.add(Pair.create(e, Integer.valueOf(i)));
    }

    void addReference(e e, e e1)
    {
        mFieldID.add(Pair.create(e, e1));
    }

    Object get()
    {
        return mValue;
    }

    void set(Object obj)
    {
        mValue = obj;
        Pair pair;
        for (Iterator iterator = mArgIndex.iterator(); iterator.hasNext(); ((e)pair.first).setArg(((Integer)pair.second).intValue(), obj))
        {
            pair = (Pair)iterator.next();
        }

        Pair pair1;
        for (Iterator iterator1 = mFieldID.iterator(); iterator1.hasNext(); ((e)pair1.first).setGlobal((e.setGlobal)pair1.second, obj))
        {
            pair1 = (Pair)iterator1.next();
        }

    }

    e()
    {
        mFieldID = new ArrayList();
        mArgIndex = new ArrayList();
    }
}

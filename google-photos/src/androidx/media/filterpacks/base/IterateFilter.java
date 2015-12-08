// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.base;

import ahn;
import ahq;
import ahs;
import aif;
import aig;
import aih;
import ajo;
import ajr;
import aju;
import ajw;
import akt;
import aku;
import android.util.Log;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package androidx.media.filterpacks.base:
//            MetaFilter, GraphInputSource, GraphOutputTarget

public class IterateFilter extends MetaFilter
{

    int mIndex;
    int mInputArraySize;
    Object mInputsArray;
    HashMap mOutputs;

    public IterateFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mIndex = 0;
        mInputsArray = null;
        mInputArraySize = 0;
        mOutputs = new HashMap();
    }

    protected final void A()
    {
        mCurrentGraph = mGraphProvider.a();
        Iterator iterator = mInputFrames.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (((String)entry.getKey()).equals("array"))
            {
                if (mInputsArray == null)
                {
                    mInputsArray = ((ahs)entry.getValue()).e().n();
                    mIndex = 0;
                    mInputArraySize = Array.getLength(mInputsArray);
                    mOutputs.clear();
                }
                Object obj;
                GraphInputSource graphinputsource;
                boolean flag;
                if (mInputArraySize > 0)
                {
                    graphinputsource = mCurrentGraph.d("elem");
                    Object obj1 = Array.get(mInputsArray, mIndex);
                    obj = ahs.a(aif.b(), null);
                    ((ahs) (obj)).d().a(obj1);
                    flag = true;
                } else
                {
                    flag = false;
                    obj = null;
                    graphinputsource = null;
                }
            } else
            {
                graphinputsource = mCurrentGraph.d((String)entry.getKey());
                obj = (ahs)entry.getValue();
                flag = false;
            }
            if (obj != null)
            {
                if (graphinputsource == null)
                {
                    obj = (String)entry.getKey();
                    throw new RuntimeException((new StringBuilder(String.valueOf(obj).length() + 67)).append("Input port '").append(((String) (obj))).append("' could not be mapped to any input in the filter graph!").toString());
                }
                graphinputsource.b(((ahs) (obj)));
                if (flag)
                {
                    ((ahs) (obj)).i();
                }
            }
        } while (true);
    }

    protected final void B()
    {
        aju aaju[] = super.mConnectedOutputPortArray;
        int j = aaju.length;
        for (int i = 0; i < j; i++)
        {
            aju aju1 = aaju[i];
            Object obj = aju1.b;
            obj = mOutputs.get(obj);
            if (obj != null)
            {
                ahs ahs1 = ahs.a(aif.c(), new int[] {
                    mInputArraySize
                });
                ahs1.e().b(obj);
                aju1.a(ahs1);
                ahs1.i();
            }
        }

        mState.a = 0;
    }

    public final ajw b()
    {
        return (new ajw()).a("array", 2, aif.c());
    }

    protected final void e()
    {
        if (mState.a != 0) goto _L2; else goto _L1
_L1:
        mInputsArray = null;
        y();
        if (mInputArraySize <= 0) goto _L4; else goto _L3
_L3:
        z();
_L6:
        return;
_L4:
        B();
        return;
_L2:
        if (mState.a == 2)
        {
            aju aaju[] = super.mConnectedOutputPortArray;
            int j = aaju.length;
            int i = 0;
            while (i < j) 
            {
                String s = aaju[i].b;
                Object obj = mCurrentGraph.c(s);
                ahs ahs1 = ((GraphOutputTarget) (obj)).a();
                if (ahs1 == null)
                {
                    obj = ((ahn) (obj)).mName;
                    Log.w("IterateFilter", (new StringBuilder(String.valueOf(obj).length() + 23)).append("Output '").append(((String) (obj))).append("' has no frame!").toString());
                } else
                {
                    Object obj3 = ahs1.d().m();
                    int k = mIndex;
                    Object obj2 = mOutputs.get(s);
                    Object obj1 = obj2;
                    if (obj2 == null)
                    {
                        obj1 = Array.newInstance(obj3.getClass(), mInputArraySize);
                        mOutputs.put(s, obj1);
                    }
                    Array.set(obj1, k, obj3);
                    ahs1.i();
                }
                i++;
            }
            mIndex = mIndex + 1;
            if (mIndex < mInputArraySize)
            {
                A();
                z();
                return;
            } else
            {
                B();
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final void y()
    {
        for (Iterator iterator = mInputFrames.values().iterator(); iterator.hasNext(); ((ahs)iterator.next()).i()) { }
        mInputFrames.clear();
        ajo aajo[] = super.mConnectedInputPortArray;
        int j = aajo.length;
        for (int i = 0; i < j; i++)
        {
            ajo ajo1 = aajo[i];
            mInputFrames.put(ajo1.b, ajo1.a().j());
        }

        A();
    }
}

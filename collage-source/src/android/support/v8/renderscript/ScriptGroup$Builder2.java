// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package android.support.v8.renderscript:
//            ScriptGroup, RSIllegalArgumentException, RenderScript, Type

public static final class mInputs
{

    private static final String TAG = "ScriptGroup.Builder2";
    List mClosures;
    List mInputs;
    RenderScript mRS;

    private mInputs addInvokeInternal(mInputs minputs, Object aobj[], Map map)
    {
        minputs = new init>(mRS, minputs, aobj, map);
        mClosures.add(minputs);
        return minputs;
    }

    private mClosures addKernelInternal(mClosures mclosures, Type type, Object aobj[], Map map)
    {
        mclosures = new init>(mRS, mclosures, type, aobj, map);
        mClosures.add(mclosures);
        return mclosures;
    }

    private boolean seperateArgsAndBindings(Object aobj[], ArrayList arraylist, Map map)
    {
        int i = 0;
_L5:
        if (i < aobj.length && !(aobj[i] instanceof mClosures)) goto _L2; else goto _L1
_L1:
        if (i >= aobj.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!(aobj[i] instanceof mClosures))
        {
            return false;
        }
        arraylist = (mClosures)aobj[i];
        map.put(arraylist.etField(), arraylist.etValue());
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        arraylist.add(aobj[i]);
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return true;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public etValue addInput()
    {
        etValue etvalue = new it>();
        mInputs.add(etvalue);
        return etvalue;
    }

    public transient mInputs addInvoke(mInputs minputs, Object aobj[])
    {
        ArrayList arraylist = new ArrayList();
        HashMap hashmap = new HashMap();
        if (!seperateArgsAndBindings(aobj, arraylist, hashmap))
        {
            return null;
        } else
        {
            return addInvokeInternal(minputs, arraylist.toArray(), hashmap);
        }
    }

    public transient addInvokeInternal addKernel(addInvokeInternal addinvokeinternal, Type type, Object aobj[])
    {
        ArrayList arraylist = new ArrayList();
        HashMap hashmap = new HashMap();
        if (!seperateArgsAndBindings(aobj, arraylist, hashmap))
        {
            return null;
        } else
        {
            return addKernelInternal(addinvokeinternal, type, arraylist.toArray(), hashmap);
        }
    }

    public transient ScriptGroup create(String s, addKernelInternal aaddkernelinternal[])
    {
        if (s == null || s.isEmpty() || s.length() > 100 || !s.equals(s.replaceAll("[^a-zA-Z0-9-]", "_")))
        {
            throw new RSIllegalArgumentException("invalid script group name");
        } else
        {
            return new ScriptGroup(mRS, s, mClosures, mInputs, aaddkernelinternal);
        }
    }

    public ption(RenderScript renderscript)
    {
        mRS = renderscript;
        mClosures = new ArrayList();
        mInputs = new ArrayList();
    }
}

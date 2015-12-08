// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observers;


// Referenced classes of package rx.observers:
//            SerializedObserver

static final class 
{

    Object array[];
    int size;

    public void add(Object obj)
    {
        Object aobj1[];
        int i;
        i = size;
        aobj1 = array;
        if (aobj1 != null) goto _L2; else goto _L1
_L1:
        Object aobj[];
        aobj = new Object[16];
        array = aobj;
_L4:
        aobj[i] = obj;
        size = i + 1;
        return;
_L2:
        aobj = aobj1;
        if (i == aobj1.length)
        {
            aobj = new Object[(i >> 2) + i];
            System.arraycopy(((Object) (aobj1)), 0, ((Object) (aobj)), 0, i);
            array = aobj;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
    }
}

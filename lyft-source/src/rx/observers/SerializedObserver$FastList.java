// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observers;


final class 
{

    Object array[];
    int size;

    public void add(Object obj)
    {
        Object aobj[];
        int i;
        i = size;
        aobj = array;
        if (aobj != null) goto _L2; else goto _L1
_L1:
        aobj = new Object[16];
        array = aobj;
_L4:
        aobj[i] = obj;
        size = i + 1;
        return;
_L2:
        if (i == aobj.length)
        {
            Object aobj1[] = new Object[(i >> 2) + i];
            System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, i);
            array = aobj1;
            aobj = aobj1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
    }
}

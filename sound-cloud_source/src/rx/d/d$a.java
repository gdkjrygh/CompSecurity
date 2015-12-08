// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.d;


// Referenced classes of package rx.d:
//            d

static final class .Object
{

    Object a[];
    int b;

    public final void a(Object obj)
    {
        Object aobj[];
        int i;
        i = b;
        aobj = a;
        if (aobj != null) goto _L2; else goto _L1
_L1:
        aobj = new Object[16];
        a = aobj;
_L4:
        aobj[i] = obj;
        b = i + 1;
        return;
_L2:
        if (i == aobj.length)
        {
            Object aobj1[] = new Object[(i >> 2) + i];
            System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, i);
            a = aobj1;
            aobj = aobj1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    .Object()
    {
    }
}

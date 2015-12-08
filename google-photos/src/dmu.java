// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;

final class dmu
    implements emd
{

    private static final ekk a = (new ekm()).a(hjp).a(hkb).a(dnq).a();

    dmu()
    {
    }

    public final ekq a(ekq ekq, elm elm)
    {
        ekq = (dms)ekq;
        return new dms(((dms) (ekq)).b, ((dms) (ekq)).c, ((dms) (ekq)).a, elm);
    }

    public final elm a(ekq ekq, ekk ekk1)
    {
        Iterator iterator;
        boolean flag1;
        flag1 = false;
        ekq = (dms)ekq;
        iterator = ekk1.a().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Class class1 = (Class)iterator.next();
        if (!ekk1.a(class1) || a.a(class1)) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L6:
        ekk1 = String.valueOf(ekk1);
        p.a(flag, (new StringBuilder(String.valueOf(ekk1).length() + 57)).append("Invalid features request for SearchQueryMediaCollection: ").append(ekk1).toString());
        ekk1 = new elq();
        ekk1.a(hjp, new hjp(erw.a.d));
        ekk1.a(hkb, new hkb(true));
        int i = ((dms) (ekq)).a;
        String s = ((dms) (ekq)).c;
        gka gka1 = ((dms) (ekq)).b;
        String s1 = ((dms) (ekq)).b.a();
        flag = flag1;
        if (((dms) (ekq)).b != null)
        {
            flag = true;
        }
        ekk1.a(dnq, new dnq(i, s, gka1, s1, flag));
        return ekk1;
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final Class a()
    {
        return dms;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;

final class dnz
    implements emd
{

    private static final ekk a = (new ekm()).a(hjp).a(hkb).a(dnq).a();

    dnz()
    {
    }

    public final ekq a(ekq ekq, elm elm)
    {
        ekq = (dnx)ekq;
        return new dnx(((dnx) (ekq)).a, ((dnx) (ekq)).b, ((dnx) (ekq)).c, ((dnx) (ekq)).d, elm, ((dnx) (ekq)).e);
    }

    public final elm a(ekq ekq, ekk ekk1)
    {
        dnx dnx1;
        boolean flag;
        boolean flag1;
        flag1 = false;
        dnx1 = (dnx)ekq;
        ekq = ekk1.a().iterator();
        Class class1;
        do
        {
            if (!ekq.hasNext())
            {
                break MISSING_BLOCK_LABEL_242;
            }
            class1 = (Class)ekq.next();
        } while (!ekk1.a(class1) || a.a(class1));
        flag = false;
_L1:
label0:
        {
            ekq = String.valueOf(ekk1);
            p.a(flag, (new StringBuilder(String.valueOf(ekq).length() + 57)).append("Invalid features request for SearchQueryMediaCollection: ").append(ekq).toString());
            ekk1 = new elq();
            ekk1.a(hjp, new hjp(erw.a.d));
            ekk1.a(hkb, new hkb(true));
            int i = dnx1.c;
            String s = dnx1.a;
            String s1 = dnx1.a;
            String s2;
            String s3;
            if (dnx1.b())
            {
                ekq = Integer.valueOf(dnx1.b);
            } else
            {
                ekq = null;
            }
            s2 = dnx1.d;
            s3 = dnx1.c();
            if (dnx1.b <= 0)
            {
                flag = flag1;
                if (TextUtils.isEmpty(dnx1.d))
                {
                    break label0;
                }
            }
            flag = true;
        }
        ekk1.a(dnq, new dnq(i, s, s1, ekq, s2, s3, flag, dnx1.e));
        return ekk1;
        flag = true;
          goto _L1
    }

    public final Class a()
    {
        return dnx;
    }

}

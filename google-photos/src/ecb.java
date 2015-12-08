// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class ecb
    implements ebh
{

    private static final ekk a = (new ekm()).b(gsn).a();
    private final Context b;
    private final eci c;
    private final noz d;

    ecb(Context context, eci eci1)
    {
        b = context;
        c = eci1;
        d = noz.a(context, "HiddenFactory", new String[0]);
    }

    private boolean a(int i, ozs ozs1)
    {
        ArrayList arraylist;
        ekv ekv1;
        arraylist = new ArrayList();
        if (ozs1.b.a != null)
        {
            ozs1 = ozs1.b.a;
            int k = ozs1.length;
            for (int j = 0; j < k; j++)
            {
                Object obj = ozs1[j];
                if (((qgg) (obj)).b != null && !TextUtils.isEmpty(((qgg) (obj)).b.a))
                {
                    arraylist.add(((qgg) (obj)).b.a);
                }
            }

        }
        if (arraylist.isEmpty())
        {
            return false;
        }
        ozs1 = new dmb(i, arraylist);
        ekv1 = b.a(b, ozs1);
        ozs1 = (List)ekv1.a(ozs1, ekw.a, a).a();
        if (ozs1.size() != arraylist.size())
        {
            return true;
        }
        ozs1 = ozs1.iterator();
_L4:
        if (!ozs1.hasNext()) goto _L2; else goto _L1
_L1:
        boolean flag = ((gsn)((ekp)ozs1.next()).a(gsn)).a();
        if (!flag) goto _L4; else goto _L3
_L3:
        flag = true;
_L6:
        return flag;
_L2:
        flag = false;
        continue; /* Loop/switch isn't completed */
        ozs1;
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean b(int i, ozs ozs1)
    {
        ArrayList arraylist = new ArrayList();
        if (ozs1.b.c != null)
        {
            ozs1 = ozs1.b.c;
            int k = ozs1.length;
            for (int j = 0; j < k; j++)
            {
                Object obj1 = ozs1[j];
                if (((qfz) (obj1)).a != null && !TextUtils.isEmpty(((qfz) (obj1)).a.a))
                {
                    arraylist.add(((qfz) (obj1)).a.a);
                }
            }

        }
        if (arraylist.isEmpty())
        {
            return false;
        }
        ozs1 = arraylist.iterator();
_L4:
        if (!ozs1.hasNext()) goto _L2; else goto _L1
_L1:
        boolean flag;
        Object obj = b.a(i, (String)ozs1.next());
        ekr ekr1 = b.b(b, ((ekq) (obj)));
        try
        {
            obj = (gsn)((ekq)ekr1.a(((ekg) (obj)), a).a()).b(gsn);
        }
        // Misplaced declaration of an exception variable
        catch (ozs ozs1)
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = ((gsn) (obj)).a();
        if (!flag) goto _L4; else goto _L5
_L5:
        flag = true;
_L7:
        return flag;
_L2:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final ekf a(int i, Object obj)
    {
label0:
        {
            boolean flag3 = false;
            boolean flag2 = true;
            obj = (ozs)obj;
            pzx pzx1 = c.a(((ozs) (obj)).b);
            boolean flag;
            boolean flag1;
            if (pzx1 != null && pzx1.b.f != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag = flag3;
            if (!flag1)
            {
                break label0;
            }
            if (!a(i, ((ozs) (obj))))
            {
                flag = flag3;
                if (!b(i, ((ozs) (obj))))
                {
                    break label0;
                }
            }
            flag = true;
        }
        i = ((flag2) ? 1 : 0);
        if (flag)
        {
            i = 2;
        }
        return new gsn(i);
    }

    public final Set a()
    {
        return Collections.emptySet();
    }

    public final Class b()
    {
        return gsn;
    }

}

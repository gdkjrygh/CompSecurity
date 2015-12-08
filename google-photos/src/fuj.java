// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

final class fuj
    implements fuh
{

    private static final TimeUnit a;
    private final Context b;
    private final mmv c;
    private final mhh d;
    private final fui e;

    fuj(Context context)
    {
        b = context;
        c = (mmv)olm.a(context, mmv);
        d = (mhh)olm.a(context, mhh);
        e = (fui)olm.a(context, fui);
    }

    private static boolean a(String s, mhe mhe1, String s1)
    {
        boolean flag;
        mhe1.a(500L, a);
        flag = mhe1.c();
        if (!flag)
        {
            mhe1.b();
            return false;
        }
        s = (mhq)mhe1.b(s).a(500L, a);
        flag = s.r().a();
        if (!flag)
        {
            mhe1.b();
            return false;
        }
        s = s.a().iterator();
        mhp mhp1;
        do
        {
            if (!s.hasNext())
            {
                break MISSING_BLOCK_LABEL_132;
            }
            mhp1 = (mhp)s.next();
        } while (!TextUtils.equals(mhp1.a(), s1));
        flag = mhp1.b();
        mhe1.b();
        return flag;
        mhe1.b();
        return false;
        s;
        mhe1.b();
        throw s;
    }

    public final boolean a(int i, hpk hpk)
    {
label0:
        {
            Object obj1 = (new ekm()).a(elj).b(hpe).a();
            Object obj = c.a(i);
            if (((mmx) (obj)).c("is_managed_account"))
            {
                return false;
            }
            obj = ((mmx) (obj)).b("account_name");
            mhe mhe1 = d.a(b, ((String) (obj)));
            Object obj2 = (mhn)mhe1.a(((String) (obj))).a(500L, a);
            if (!((mhn) (obj2)).r().a())
            {
                return false;
            }
            if (!TextUtils.equals(((mhn) (obj2)).a().e(), ((CharSequence) (obj))))
            {
                return false;
            }
            obj2 = (List)b.b(b, fux.a(i)).a(fux.a(i), ((ekk) (obj1))).a();
            obj1 = new ArrayList();
            obj2 = ((List) (obj2)).iterator();
            do
            {
                if (!((Iterator) (obj2)).hasNext())
                {
                    break;
                }
                ekq ekq1 = (ekq)((Iterator) (obj2)).next();
                if (((fkw)b.a(b, fkw, ekq1)).a(i, ekq1, hpk).a() != null)
                {
                    ((List) (obj1)).addAll(((fux)ekq1).b);
                }
            } while (true);
            if (((List) (obj1)).isEmpty())
            {
                break label0;
            }
            hpk = neh.a(e.a);
            obj1 = ((List) (obj1)).iterator();
            String s;
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break label0;
                }
                Integer integer = (Integer)((Iterator) (obj1)).next();
                s = integer.toString();
                if (hpk.contains(integer))
                {
                    return true;
                }
            } while (!a(((String) (obj)), mhe1, s));
            return true;
        }
        return false;
    }

    static 
    {
        a = TimeUnit.MILLISECONDS;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class fla
{

    private static final long a;
    private static final TimeUnit b;
    private final Context c;
    private final mmv d;
    private final fky e;
    private final mhh f;

    fla(Context context, mmv mmv1, fky fky1, mhh mhh1)
    {
        c = context;
        d = mmv1;
        e = fky1;
        f = mhh1;
    }

    public final fld a(int i)
    {
        Object obj;
        mhe mhe1;
        obj = d.a(i).b("account_name");
        mhe1 = f.a(c, ((String) (obj)));
        mhe1.a(a, b);
        if (!mhe1.c())
        {
            return fld.a();
        }
        mhn mhn1 = (mhn)mhe1.a(((String) (obj))).a(a, b);
        if (mhn1.r().a()) goto _L2; else goto _L1
_L1:
        obj = fld.a();
_L3:
        mhe1.b();
        return ((fld) (obj));
_L2:
label0:
        {
            if (TextUtils.equals(mhn1.a().e(), ((CharSequence) (obj))))
            {
                break label0;
            }
            obj = fld.a(new fkz(Collections.emptySet()));
        }
          goto _L3
label1:
        {
            obj = (mhq)mhe1.b(((String) (obj))).a(a, b);
            if (((mhq) (obj)).r().a())
            {
                break label1;
            }
            obj = fld.a();
        }
          goto _L3
        Object obj1 = ((mhq) (obj)).a();
        obj = new HashSet();
        ((Set) (obj)).addAll(e.a());
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            mhp mhp1 = (mhp)((Iterator) (obj1)).next();
            if (mhp1.b())
            {
                ((Set) (obj)).add(mhp1.a());
            }
        } while (true);
        break MISSING_BLOCK_LABEL_266;
        obj;
        mhe1.b();
        throw obj;
        obj = fld.a(new fkz(((Set) (obj))));
          goto _L3
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(3L);
        b = TimeUnit.MILLISECONDS;
    }
}

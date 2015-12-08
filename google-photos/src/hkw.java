// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class hkw
    implements hkv, nus, omb, opt, opu, opv
{

    private hlb a;
    private ekb b;
    private Context c;
    private final ay d;
    private ejz e;
    private nur f;

    public hkw(am am1, opd opd1)
    {
        d = am1.h();
        opd1.a(this);
    }

    public hkw(ar ar1, opd opd1)
    {
        d = ar1.c();
        opd1.a(this);
    }

    public final void V_()
    {
        f.b(this);
    }

    public final void X_()
    {
        f.a(this);
    }

    public final String a()
    {
        return "OfflineRetryTagRemoveFromAlbum";
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (hlb)olm1.a(hlb);
        b = (ekb)olm1.a(ekb);
        f = (nur)olm1.a(nur);
        e = (ejz)olm1.a(ejz);
        c = context;
    }

    public final void c()
    {
        Object obj;
        Object obj1;
        hlb hlb1;
        int i;
        boolean flag;
        if (!b.w(c))
        {
            ay ay = d;
            nuq nuq1 = new nuq();
            nuq1.a = nup.m;
            nuq1.c = "OfflineRetryTagRemoveFromAlbum";
            nuq1.e = true;
            nuo.a(ay, nuq1);
            return;
        }
        hlb1 = a;
        obj1 = b.a();
        ekq ekq1 = e.b();
        if (hlb.a(ekq1))
        {
            obj = (hjv)ekq1.b(hjv);
            int j;
            boolean flag1;
            if (obj != null && ((hjv) (obj)).a.a(hlb1.c.g()))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_239;
            }
        }
        obj = obj1;
_L1:
        obj1 = new hle(hlb1.c.d(), ((Collection) (obj)), ekq1);
        obj = new hyw(((Collection) (obj)));
        flag = ((hyw) (obj)).b;
        flag1 = ((hyw) (obj)).c;
        j = ((hyw) (obj)).a.size();
        ekp ekp1;
        hkh hkh1;
        if (flag && flag1)
        {
            i = b.wt;
        } else
        if (flag)
        {
            i = b.wv;
        } else
        {
            i = b.wu;
        }
        obj = hlb1.a.getResources().getQuantityString(i, j);
        hlb1.b.b.a(((String) (obj)), ((mtf) (obj1)).d);
        hlb1.b.a(((mtf) (obj1)));
        return;
        obj = new ArrayList();
        obj1 = ((Collection) (obj1)).iterator();
        while (((Iterator) (obj1)).hasNext()) 
        {
            ekp1 = (ekp)((Iterator) (obj1)).next();
            hkh1 = (hkh)ekp1.b(hkh);
            if (hkh1 != null && hkh1.a.a(hlb1.c.g()))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                ((Collection) (obj)).add(ekp1);
            } else
            {
                hlb1.d = true;
            }
        }
          goto _L1
    }

    public final void c_(Bundle bundle)
    {
        c();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.photos.list.PhotoTileView;
import java.util.Map;
import java.util.Set;

public final class dsf
    implements fqg, omb, opv
{

    private efd a;
    private muz b;

    public dsf(opd opd1)
    {
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (muz)olm1.a(muz);
        a = (efd)olm1.a(efd);
    }

    public final void a(PhotoTileView phototileview)
    {
        Object obj;
        Object obj1 = phototileview.m;
        obj = ((gax)((ekp) (obj1)).a(gax)).q();
        boolean flag1 = ((Set) (obj)).contains(gav.b);
        boolean flag2 = ((Set) (obj)).contains(gav.a);
        obj = a.b;
        int i;
        if (obj == null || ((eey) (obj)).a == efb.a)
        {
            i = fse.a;
        } else
        if (((eey) (obj)).a == efb.f || ((eey) (obj)).a == efb.b)
        {
            if (flag1)
            {
                i = fse.a;
            } else
            {
                i = fse.b;
            }
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            phototileview.b(i);
            return;
        }
        if (flag1 && !flag2)
        {
            phototileview.b(fse.a);
            return;
        }
        obj1 = (eft)((ekp) (obj1)).a(eft);
        String s = ((eft) (obj1)).d();
        Long long1 = (Long)a.c.get(s);
        boolean flag;
        if (long1 != null && (float)b.b() < (float)long1.longValue() + PhotoTileView.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            long l = long1.longValue();
            phototileview.a(fse.e, l);
            return;
        }
        if (flag1)
        {
            a.c.remove(s);
            phototileview.b(fse.a);
            return;
        }
        if (long1 != null)
        {
            phototileview.b(fse.a);
            return;
        }
        if (((eey) (obj)).a == efb.c && TextUtils.equals(s, ((eey) (obj)).d))
        {
            phototileview.b(fse.d);
            return;
        }
        obj = ((eft) (obj1)).c();
        dsg.a[((euu) (obj)).ordinal()];
        JVM INSTR tableswitch 1 6: default 372
    //                   1 387
    //                   2 395
    //                   3 403
    //                   4 411
    //                   5 419
    //                   6 419;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L6
_L6:
        break MISSING_BLOCK_LABEL_419;
_L1:
        int j = 0;
_L7:
        if (j != 0)
        {
            phototileview.b(j);
            return;
        } else
        {
            phototileview.b(fse.b);
            return;
        }
_L2:
        j = fse.a;
          goto _L7
_L3:
        j = fse.a;
          goto _L7
_L4:
        j = fse.c;
          goto _L7
_L5:
        j = fse.b;
          goto _L7
        j = fse.a;
          goto _L7
    }
}

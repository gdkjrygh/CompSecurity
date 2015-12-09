// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.WeakHashMap;

public final class cim
{

    private WeakHashMap a;

    public cim()
    {
        a = new WeakHashMap();
    }

    public final cik a(Context context)
    {
        Object obj = (cin)a.get(context);
        if (obj == null) goto _L2; else goto _L1
_L1:
        long l = ((cin) (obj)).a;
        cax cax = cbb.M;
        boolean flag;
        if (l + ((Long)bkv.n().a(cax)).longValue() < bkv.i().a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L2; else goto _L3
_L3:
        cax = cbb.L;
        if (!((Boolean)bkv.n().a(cax)).booleanValue()) goto _L2; else goto _L4
_L4:
        obj = (new cil(context, ((cin) (obj)).b)).a();
_L6:
        a.put(context, new cin(((cik) (obj))));
        return ((cik) (obj));
_L2:
        obj = (new cil(context)).a();
        if (true) goto _L6; else goto _L5
_L5:
    }
}

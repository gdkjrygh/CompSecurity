// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Log;

final class efh
    implements lzy
{

    private final efc a = new efc();
    private efd b;

    efh(efd efd1)
    {
        b = efd1;
        super();
    }

    public final void a(lzx lzx)
    {
        Object obj;
        String s;
        efd efd1;
        s = null;
        obj = (mhn)lzx;
        efd.a(b, false);
        if (efd.g(b).a())
        {
            noy.a("fetch time", efd.h(b));
        }
        efd1 = b;
        lzx = efd.c(b);
        if (((mhn) (obj)).a() != null) goto _L2; else goto _L1
_L1:
        lzx = new efa();
        lzx.a = efb.a;
        lzx = lzx.a();
_L4:
        efd1.a(lzx);
        return;
_L2:
        Object obj1;
        int i;
        int j;
        obj1 = ((mhn) (obj)).a();
        if (TextUtils.isEmpty(((mhm) (obj1)).e()) || ((mhm) (obj1)).e().equals(lzx))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = efb.f;
        j = ((mhm) (obj1)).d();
        i = 0;
        lzx = null;
_L6:
        if (!TextUtils.isEmpty(((mhm) (obj1)).e()))
        {
            s = ((mhm) (obj1)).e();
        }
        obj1 = new efa();
        obj1.a = ((efb) (obj));
        obj1.b = i;
        obj1.c = j;
        obj1.d = lzx;
        obj1.e = s;
        lzx = ((efa) (obj1)).a();
        if (true) goto _L4; else goto _L3
_L3:
        switch (((mhm) (obj1)).a())
        {
        default:
            obj = efb.b;
            if (Log.isLoggable("AutoBackupStatusConvert", 5))
            {
                i = ((mhm) (obj1)).a();
                Log.w("AutoBackupStatusConvert", (new StringBuilder(42)).append("Unknown GcoreAutoBackupStatus: ").append(i).toString());
            }
            j = 0;
            i = 0;
            lzx = null;
            break;

        case 0: // '\0'
            obj = efb.b;
            j = 0;
            i = 0;
            lzx = null;
            break;

        case 1: // '\001'
            obj = efb.e;
            j = 0;
            i = 0;
            lzx = null;
            break;

        case 2: // '\002'
            obj = efb.c;
            j = ((mhm) (obj1)).d();
            i = (int)(((mhm) (obj1)).c() * 100F);
            lzx = ((mhm) (obj1)).b();
            break;

        case 3: // '\003'
            obj = efb.g;
            j = ((mhm) (obj1)).d();
            i = 0;
            lzx = null;
            break;

        case 4: // '\004'
            obj = efb.h;
            j = ((mhm) (obj1)).d();
            i = 0;
            lzx = null;
            break;

        case 5: // '\005'
            if (((mhm) (obj1)).d() == 0)
            {
                obj = efb.e;
                j = 0;
                i = 0;
                lzx = null;
            } else
            {
                obj = efb.i;
                j = ((mhm) (obj1)).d();
                i = 0;
                lzx = null;
            }
            break;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}

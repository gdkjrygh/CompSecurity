// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.e;

import android.util.SparseBooleanArray;
import com.qihoo.security.engine.ApkInfo;
import com.qihoo.security.engine.FileInfo;
import com.qihoo.security.services.ScanResult;

// Referenced classes of package com.qihoo.security.engine.e:
//            b, c

class a
    implements b
{

    final c a;

    public boolean a(ScanResult scanresult)
    {
        if (!c.a(a)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        switch (scanresult.state)
        {
        default:
            return false;

        case 1: // '\001'
            if (a.b.get(6, false) && scanresult.fileInfo.level < 50)
            {
                return true;
            }
            break;

        case 7: // '\007'
            Object obj = scanresult.fileInfo.apkInfo;
            if (obj != null)
            {
                if (((ApkInfo) (obj)).maliceRank > 0)
                {
                    obj = a;
                    c.a(((c) (obj)), c.b(((c) (obj))) + 1);
                } else
                {
                    ((ApkInfo) (obj)).addUpExts("ac", (new StringBuilder(String.valueOf(System.currentTimeMillis()))).append(":").append(c.b(a)).toString());
                }
            }
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (scanresult.fileInfo.apkInfo.isMalware()) goto _L1; else goto _L4
_L4:
        return true;
    }

    public int b(ScanResult scanresult)
    {
        int i = 1;
        scanresult.state;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 44
    //                   1: 76
    //                   7: 59;
           goto _L1 _L2 _L3 _L4
_L1:
        i = 0;
_L5:
        return i;
_L2:
        if (a.b.get(1, false)) goto _L5; else goto _L4
_L4:
        if (a.b.get(2, false))
        {
            return 2;
        }
_L3:
        if (!a.b.get(6, false)) goto _L1; else goto _L6
_L6:
        return 6;
    }

    Result(c c1)
    {
        a = c1;
        super();
    }
}

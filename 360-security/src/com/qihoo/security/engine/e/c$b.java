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

        case 7: // '\007'
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            if (!a.b.get(6, false))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (scanresult.fileInfo.level < 50)
            {
                return true;
            }
            break;

        case 11: // '\013'
            if (scanresult.fileInfo.level >= 30 && scanresult.fileInfo.level < 50)
            {
                break; /* Loop/switch isn't completed */
            }
            break;
        }
        continue; /* Loop/switch isn't completed */
        if (scanresult.fileInfo.level < 30 || scanresult.fileInfo.level >= 50) goto _L1; else goto _L3
_L3:
        return true;
        if (true) goto _L1; else goto _L4
_L4:
        return true;
        if (scanresult.fileInfo.level >= 60 || scanresult.fileInfo.apkInfo.isSystem()) goto _L1; else goto _L5
_L5:
        return true;
    }

    public int b(ScanResult scanresult)
    {
        byte byte0 = 2;
        scanresult.state;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 44
    //                   1: 59
    //                   11: 78;
           goto _L1 _L2 _L3 _L4
_L1:
        byte0 = 0;
_L5:
        return byte0;
_L2:
        if (a.b.get(2, false)) goto _L5; else goto _L3
_L3:
        if (a.b.get(6, false))
        {
            return 6;
        }
_L4:
        if (!a.b.get(1, false)) goto _L1; else goto _L6
_L6:
        return 1;
    }

    Result(c c1)
    {
        a = c1;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

import com.qihoo.security.SecurityApplication;
import com.qihoo.security.adv.a.a;
import com.qihoo.security.v5.UpdateService;
import com.qihoo360.mobilesafe.share.SharedPref;

public class b
{

    public static void a()
    {
        android.content.Context context;
        int i;
        int j;
        i = 0;
        context = SecurityApplication.a();
        j = SharedPref.b(context, "key_update_next_check_values", 0);
        j;
        JVM INSTR tableswitch 0 3: default 44
    //                   0 61
    //                   1 73
    //                   2 79
    //                   3 97;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_97;
_L6:
        j++;
        if (j < 4)
        {
            i = j;
        }
        SharedPref.a(context, "key_update_next_check_values", i);
        return;
_L2:
        com.qihoo.security.support.b.a();
        com.qihoo.security.adv.a.a.a().b();
          goto _L6
_L3:
        UpdateService.a();
          goto _L6
_L4:
        com.qihoo.security.appbox.bi.a.a();
        com.qihoo.security.installreport.a.a();
        com.qihoo.security.adv.a.a.a().a(com.qihoo.security.adv.AdvDataManager.AdvType.PrepareAdvData);
          goto _L6
        com.qihoo.security.opti.trashclear.a.a().b();
          goto _L6
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result;

import android.util.Pair;
import com.qihoo.security.gamebooster.d;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.result:
//            d

class a
    implements Runnable
{

    final com.qihoo.security.ui.result.d a;

    public void run()
    {
        Pair pair = d.a();
        ((Integer)pair.first).intValue();
        JVM INSTR tableswitch 0 2: default 40
    //                   0 86
    //                   1 63
    //                   2 40;
           goto _L1 _L2 _L3 _L1
_L1:
        SharedPref.a(d.b(a), "sp_key_game_booster_card_type", ((Integer)pair.first).intValue());
        return;
_L3:
        d.a(a).addAll((Collection)pair.second);
        continue; /* Loop/switch isn't completed */
_L2:
        d.a(a).addAll((Collection)pair.second);
        if (true) goto _L1; else goto _L4
_L4:
    }

    redPref(com.qihoo.security.ui.result.d d1)
    {
        a = d1;
        super();
    }
}

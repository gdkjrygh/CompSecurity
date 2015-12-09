// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;

// Referenced classes of package com.pandora.android.iap:
//            b

class b
    implements p.cm..Object
{

    final String a;
    final c b;
    final com.pandora.android.iap.b c;

    public void a(boolean flag, String s)
    {
        com.pandora.android.iap.b.d((new StringBuilder()).append("CanPurchaseALaCarteProductTask[").append(flag).append("]: reason: ").append(s).toString());
        com.pandora.android.iap.b.a(c, a);
        if (flag)
        {
            c.a = b;
            c.a(a);
            return;
        } else
        {
            s = (new PandoraIntent("cmd_show_iap_error_dialog")).putExtra("intent_iap_error_dialog_type", com.pandora.android.iap.b.toString());
            b.a.C().a(s);
            com.pandora.android.iap.b.a(c);
            return;
        }
    }

    (com.pandora.android.iap.b b1, String s,  )
    {
        c = b1;
        a = s;
        b = ;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale.fragment;

import android.os.Handler;
import android.view.View;
import com.qihoo.security.dialog.i;
import com.qihoo.security.locale.d;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.f;

// Referenced classes of package com.qihoo.security.locale.fragment:
//            LanguagePacketFragment

class b
    implements android.view.uagePacketFragment._cls10
{

    final String a;
    final i b;
    final LanguagePacketFragment c;

    public void onClick(View view)
    {
        if (!f.a())
        {
            com.qihoo.security.locale.fragment.LanguagePacketFragment.f(c).a(a);
            c.b.sendMessageDelayed(c.b.obtainMessage(1002), 300L);
            Utils.dismissDialog(b);
        }
    }

    (LanguagePacketFragment languagepacketfragment, String s, i i)
    {
        c = languagepacketfragment;
        a = s;
        b = i;
        super();
    }
}

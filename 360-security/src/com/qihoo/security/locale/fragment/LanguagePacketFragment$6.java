// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale.fragment;

import android.view.View;
import com.qihoo.security.dialog.i;
import com.qihoo.security.locale.LocaleInfo;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.f;

// Referenced classes of package com.qihoo.security.locale.fragment:
//            LanguagePacketFragment

class b
    implements android.view.guagePacketFragment._cls6
{

    final LocaleInfo a;
    final i b;
    final LanguagePacketFragment c;

    public void onClick(View view)
    {
        if (!f.a())
        {
            if (a.support)
            {
                c.a(a.locale);
            } else
            {
                c.a();
            }
            Utils.dismissDialog(b);
        }
    }

    A(LanguagePacketFragment languagepacketfragment, LocaleInfo localeinfo, i i)
    {
        c = languagepacketfragment;
        a = localeinfo;
        b = i;
        super();
    }
}

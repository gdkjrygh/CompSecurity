// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale.fragment;

import android.view.View;
import com.qihoo.security.dialog.i;
import com.qihoo.security.ui.a;
import com.qihoo360.common.utils.Utils;

// Referenced classes of package com.qihoo.security.locale.fragment:
//            LanguagePacketFragment

class a
    implements android.view.guagePacketFragment._cls2
{

    final i a;
    final LanguagePacketFragment b;

    public void onClick(View view)
    {
        com.qihoo.security.ui.a.f(LanguagePacketFragment.g(b));
        Utils.dismissDialog(a);
    }

    A(LanguagePacketFragment languagepacketfragment, i i)
    {
        b = languagepacketfragment;
        a = i;
        super();
    }
}

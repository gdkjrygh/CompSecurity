// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale.fragment;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.qihoo360.common.utils.Utils;

// Referenced classes of package com.qihoo.security.locale.fragment:
//            LanguagePacketFragment

class a
    implements android.content.ener
{

    final LanguagePacketFragment a;

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            Utils.dismissDialog(LanguagePacketFragment.e(a));
        } else
        if (i != 84)
        {
            return false;
        }
        return true;
    }

    A(LanguagePacketFragment languagepacketfragment)
    {
        a = languagepacketfragment;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale.fragment;

import android.os.Handler;
import com.qihoo.security.v5.UpdateService;
import com.qihoo.security.v5.e;

// Referenced classes of package com.qihoo.security.locale.fragment:
//            LanguagePacketFragment

class b extends e
{

    boolean a;
    final LanguagePacketFragment b;

    public void a()
    {
    }

    public void a(int i)
    {
        a = false;
        switch (i)
        {
        case -2: 
        default:
            return;

        case 0: // '\0'
            b.a();
            return;

        case -3: 
        case -1: 
            LanguagePacketFragment.a(b);
            return;
        }
    }

    public void a(String s)
    {
    }

    public void a(String s, boolean flag)
    {
        if (!flag)
        {
            a = true;
            b.b.sendMessageDelayed(b.b.obtainMessage(1003, LanguagePacketFragment.b(b)), 800L);
            return;
        } else
        {
            LanguagePacketFragment.a(b);
            return;
        }
    }

    public void b(String s)
    {
        if (!a)
        {
            b.b.sendMessageDelayed(b.b.obtainMessage(1003, LanguagePacketFragment.c(b)), 800L);
        }
        if (LanguagePacketFragment.d(b) != null)
        {
            LanguagePacketFragment.d(b).a(null);
        }
        a = false;
    }

    public void c(String s)
    {
        if (LanguagePacketFragment.d(b) != null)
        {
            LanguagePacketFragment.d(b).a(null);
        }
        LanguagePacketFragment.a(b);
    }

    A(LanguagePacketFragment languagepacketfragment)
    {
        b = languagepacketfragment;
        super();
    }
}

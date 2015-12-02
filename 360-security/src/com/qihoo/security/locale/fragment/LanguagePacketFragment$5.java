// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale.fragment;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.qihoo.security.v5.UpdateService;

// Referenced classes of package com.qihoo.security.locale.fragment:
//            LanguagePacketFragment

class a
    implements ServiceConnection
{

    final LanguagePacketFragment a;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        LanguagePacketFragment.a(a, ((com.qihoo.security.v5.etFragment._cls5.a)ibinder).a());
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        if (LanguagePacketFragment.d(a) != null)
        {
            LanguagePacketFragment.d(a).a(null);
            LanguagePacketFragment.a(a, null);
        }
    }

    A(LanguagePacketFragment languagepacketfragment)
    {
        a = languagepacketfragment;
        super();
    }
}

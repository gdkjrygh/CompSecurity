// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import kik.android.util.av;

// Referenced classes of package kik.android.chat.fragment:
//            ip, KikCodeFragment

final class iq
    implements Runnable
{

    final ip a;

    iq(ip ip1)
    {
        a = ip1;
        super();
    }

    public final void run()
    {
        av.b(new View[] {
            a.a._errorHolder
        });
        av.a(new View[] {
            a.a._codeInfo, a.a._scanText
        });
    }
}

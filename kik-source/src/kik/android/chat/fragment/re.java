// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;

// Referenced classes of package kik.android.chat.fragment:
//            SendToFragment

final class re
    implements Runnable
{

    final Bundle a;
    final SendToFragment b;

    re(SendToFragment sendtofragment, Bundle bundle)
    {
        b = sendtofragment;
        a = bundle;
        super();
    }

    public final void run()
    {
        SendToFragment.b(b, a);
    }
}

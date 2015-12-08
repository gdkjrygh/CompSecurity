// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment.settings;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package kik.android.chat.fragment.settings:
//            PreferenceFragment

final class e extends Handler
{

    final PreferenceFragment a;

    e(PreferenceFragment preferencefragment)
    {
        a = preferencefragment;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (a.getActivity() != null)
        {
            PreferenceFragment.a(a);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

// Referenced classes of package com.roidapp.photogrid.release:
//            qi, ParentActivity

final class qj extends Handler
{

    final qi a;

    qj(qi qi1)
    {
        a = qi1;
        super();
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            qi.a(a, a.getActivity());
            return;

        case 2: // '\002'
            qi.b(a, a.getActivity());
            return;

        case 3: // '\003'
            int i = message.arg1;
            qi.a(a);
            return;

        case 4: // '\004'
            Toast.makeText(a.getActivity(), 0x7f07033e, 1).show();
            break;
        }
        ((ParentActivity)a.getActivity()).D();
        a.dismissAllowingStateLoss();
    }
}

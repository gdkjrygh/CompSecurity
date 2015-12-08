// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.os.Message;
import java.util.List;

// Referenced classes of package com.roidapp.imagelib.filter:
//            s, b, v, az

final class u
    implements android.os.Handler.Callback
{

    final s a;

    u(s s1)
    {
        a = s1;
        super();
    }

    public final boolean handleMessage(Message message)
    {
        if (a.isAdded()) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        switch (message.what)
        {
        default:
            return true;

        case 1: // '\001'
            message = (List)message.obj;
            break;
        }
        if (s.b(a) != null)
        {
            int j = message.size();
            int i = 0;
            while (i < j) 
            {
                s.b(a).a((b)message.get(i), s.c(a), new v(this));
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}

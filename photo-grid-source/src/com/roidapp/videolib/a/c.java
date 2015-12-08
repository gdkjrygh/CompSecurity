// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.roidapp.videolib.core.a.b;
import com.roidapp.videolib.e;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.videolib.a:
//            b

final class c extends Handler
{

    final com.roidapp.videolib.a.b a;

    c(com.roidapp.videolib.a.b b1)
    {
        a = b1;
        super();
    }

    public final void handleMessage(Message message)
    {
        String s = null;
        message.what;
        JVM INSTR lookupswitch 6: default 64
    //                   47872: 65
    //                   47873: 88
    //                   47874: 169
    //                   47875: 264
    //                   47876: 119
    //                   703710: 423;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return;
_L2:
        if (b.a(a) != null)
        {
            b.a(a).a();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (b.a(a) != null)
        {
            b.a(a).a(message.arg1, message.arg2);
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
        com.roidapp.videolib.a.b.b(a).removeMessages(0xabcde);
        b.c(a);
        if (b.a(a) != null)
        {
            b.a(a).b();
        }
        b.d(a);
        return;
_L4:
        Object obj;
        if (com.roidapp.videolib.a.b.e(a) != null)
        {
            obj = (Context)com.roidapp.videolib.a.b.e(a).get();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            e.a();
            e.b(((Context) (obj)));
        }
        if (b.a(a) != null)
        {
            message = message.getData();
            obj = b.a(a);
            if (message != null)
            {
                message = message.getString("videoPath");
            } else
            {
                message = null;
            }
            ((b) (obj)).a(message);
        }
        b.d(a);
        return;
_L5:
        Object obj1;
        if (message.arg1 == 60935)
        {
            b b1;
            Bundle bundle;
            int i;
            int j;
            if (com.roidapp.videolib.a.b.e(a) != null)
            {
                obj1 = (Context)com.roidapp.videolib.a.b.e(a).get();
            } else
            {
                obj1 = null;
            }
            if (obj1 != null)
            {
                e.a();
                e.a(((Context) (obj1)), true);
            }
        }
        if (b.a(a) != null)
        {
            bundle = message.getData();
            b1 = b.a(a);
            i = message.arg1;
            j = message.arg2;
            if (bundle != null)
            {
                message = bundle.getString("eclass");
            } else
            {
                message = null;
            }
            if (bundle != null)
            {
                obj1 = bundle.getString("emsg");
            } else
            {
                obj1 = null;
            }
            if (bundle != null)
            {
                s = bundle.getString("errorpath");
            }
            b1.a(i, j, message, ((String) (obj1)), s);
        }
        b.d(a);
        return;
_L7:
        if (b.f(a) && b.a(a) != null)
        {
            b.a(a).b();
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
    }
}

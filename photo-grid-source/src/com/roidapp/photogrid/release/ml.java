// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import com.roidapp.imagelib.filter.aa;
import com.roidapp.photogrid.common.az;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, ih, oi, bg, 
//            ng, mm, ne

public final class ml extends Handler
{

    private WeakReference a;

    public ml(WeakReference weakreference)
    {
        a = weakreference;
    }

    public final void a(int i)
    {
        Message message = Message.obtain();
        message.what = 7;
        message.arg1 = i;
        sendMessage(message);
    }

    public final void a(int i, int j)
    {
        Message message = Message.obtain();
        if (j == 0)
        {
            message.what = 1;
        } else
        {
            message.what = 0;
        }
        message.arg1 = i;
        sendMessage(message);
    }

    public final void b(int i, int j)
    {
        Message message = Message.obtain();
        message.what = 19;
        message.arg1 = i;
        message.arg2 = j;
        sendMessage(message);
    }

    public final void handleMessage(Message message)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        PhotoGridActivity photogridactivity;
        return;
_L2:
        if ((photogridactivity = (PhotoGridActivity)a.get()) == null) goto _L1; else goto _L3
_L3:
        switch (message.what)
        {
        case 4: // '\004'
        case 6: // '\006'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        default:
            return;

        case 0: // '\0'
            photogridactivity.a(true, message.arg1);
            return;

        case 3: // '\003'
            photogridactivity.p();
            if (aa.a().g() && az.q == 5)
            {
                photogridactivity.a(ih.C().bd(), ih.C().be());
            }
            if (photogridactivity.r)
            {
                photogridactivity.r = false;
                message = photogridactivity.c;
                if (message != null)
                {
                    photogridactivity.a(((oi) (message)).e, message.c());
                }
            }
            int i = az.q;
            return;

        case 1: // '\001'
            photogridactivity.a(false, message.arg1);
            return;

        case 5: // '\005'
            photogridactivity.r();
            return;

        case 7: // '\007'
            int j = message.arg1;
            photogridactivity.u();
            return;

        case 21: // '\025'
            String s = "";
            if (message.obj != null)
            {
                s = (String)message.obj;
            }
            int k = message.arg1;
            int i1 = message.arg2;
            photogridactivity.o();
            (new bg(photogridactivity)).a(k, i1, s);
            if (photogridactivity.b instanceof ng)
            {
                photogridactivity.b.a(true, false);
                return;
            }
            break;

        case 18: // '\022'
            photogridactivity.m();
            return;

        case 15: // '\017'
            photogridactivity.n();
            return;

        case 14: // '\016'
            int l = message.arg1;
            photogridactivity.u();
            return;

        case 2: // '\002'
            photogridactivity.a(true, false);
            return;

        case 16: // '\020'
            photogridactivity.d(message.arg1, message.arg2);
            return;

        case 17: // '\021'
            if (photogridactivity.b instanceof ne)
            {
                ((ne)photogridactivity.b).m();
                return;
            }
            break;

        case 19: // '\023'
            photogridactivity.c(message.arg1, message.arg2);
            return;

        case 20: // '\024'
            photogridactivity.o();
            return;

        case 22: // '\026'
            photogridactivity.Q();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}

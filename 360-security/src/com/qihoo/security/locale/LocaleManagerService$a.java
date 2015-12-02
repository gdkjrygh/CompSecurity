// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteCallbackList;
import android.os.RemoteException;

// Referenced classes of package com.qihoo.security.locale:
//            LocaleManagerService, b, d

private final class <init> extends Handler
{

    final LocaleManagerService a;
    private boolean b;
    private boolean c;
    private String d;
    private String e;
    private String f;

    public void handleMessage(Message message)
    {
        int i;
        int j;
        int k;
        boolean flag;
        i = 0;
        k = 0;
        flag = false;
        j = 0;
        message.what;
        JVM INSTR tableswitch 0 8: default 64
    //                   0 65
    //                   1 139
    //                   2 158
    //                   3 392
    //                   4 455
    //                   5 257
    //                   6 512
    //                   7 569
    //                   8 625;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        return;
_L2:
        LocaleManagerService.h(a).beginBroadcast();
        message = (b)message.obj;
        LocaleManagerService.h(a).register(message);
        try
        {
            message.a(c, b, d, e, f);
            message.a();
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        LocaleManagerService.h(a).finishBroadcast();
        return;
_L3:
        LocaleManagerService.h(a).unregister((b)message.obj);
        return;
_L4:
        try
        {
            message = ((Message) ((Object[])(Object[])message.obj));
            c = ((Boolean)message[0]).booleanValue();
            b = ((Boolean)message[1]).booleanValue();
            d = (String)message[2];
            e = (String)message[3];
            f = (String)message[4];
            com.qihoo.security.locale.d.a(c, b, d, e, f);
            sendEmptyMessage(5);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            return;
        }
_L7:
        k = LocaleManagerService.h(a).beginBroadcast();
        i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            try
            {
                ((b)LocaleManagerService.h(a).getBroadcastItem(i)).a(c, b, d, e, f);
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                break;
            }
            i++;
        } while (true);
        LocaleManagerService.h(a).finishBroadcast();
        k = LocaleManagerService.h(a).beginBroadcast();
        i = j;
        do
        {
            if (i >= k)
            {
                break;
            }
            try
            {
                ((b)LocaleManagerService.h(a).getBroadcastItem(i)).a();
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                break;
            }
            i++;
        } while (true);
        LocaleManagerService.h(a).finishBroadcast();
        return;
_L5:
        j = LocaleManagerService.h(a).beginBroadcast();
        try
        {
            message = (String)message.obj;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            break; /* Loop/switch isn't completed */
        }
_L12:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((b)LocaleManagerService.h(a).getBroadcastItem(i)).a(message);
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L12; else goto _L11
_L11:
        LocaleManagerService.h(a).finishBroadcast();
        return;
_L6:
        j = LocaleManagerService.h(a).beginBroadcast();
        i = k;
        do
        {
            if (i >= j)
            {
                break;
            }
            try
            {
                ((b)LocaleManagerService.h(a).getBroadcastItem(i)).c();
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                break;
            }
            i++;
        } while (true);
        LocaleManagerService.h(a).finishBroadcast();
        return;
_L8:
        j = LocaleManagerService.h(a).beginBroadcast();
        i = ((flag) ? 1 : 0);
        do
        {
            if (i >= j)
            {
                break;
            }
            try
            {
                ((b)LocaleManagerService.h(a).getBroadcastItem(i)).b();
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                break;
            }
            i++;
        } while (true);
        LocaleManagerService.h(a).finishBroadcast();
        return;
_L9:
        j = LocaleManagerService.h(a).beginBroadcast();
        i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            try
            {
                ((b)LocaleManagerService.h(a).getBroadcastItem(i)).d();
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                break;
            }
            i++;
        } while (true);
        LocaleManagerService.h(a).finishBroadcast();
        return;
_L10:
        try
        {
            LocaleManagerService.a(a, LocaleManagerService.d(a).a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            LocaleManagerService.a(a).sendEmptyMessage(5);
        }
        return;
    }

    private (LocaleManagerService localemanagerservice)
    {
        a = localemanagerservice;
        super();
    }

    a(LocaleManagerService localemanagerservice, a a1)
    {
        this(localemanagerservice);
    }
}

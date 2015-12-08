// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import akU;
import android.os.Handler;
import android.os.Message;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class SystemMessageHandler extends Handler
{
    static final class a
    {

        private static c a;

        public static void a(Message message)
        {
            a.a(message);
        }

        static 
        {
            if (android.os.Build.VERSION.SDK_INT >= 22)
            {
                a = new b();
            } else
            {
                a = new a();
            }
        }
    }

    static final class a.a
        implements a.c
    {

        private Method a;

        public final void a(Message message)
        {
            if (a == null)
            {
                return;
            }
            try
            {
                a.invoke(message, new Object[] {
                    Boolean.valueOf(true)
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                akU.a("cr.SysMessageHandler", "Illegal access to async message creation, disabling.", new Object[0]);
                a = null;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                akU.a("cr.SysMessageHandler", "Illegal argument for async message creation, disabling.", new Object[0]);
                a = null;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                akU.a("cr.SysMessageHandler", "Invocation exception during async message creation, disabling.", new Object[0]);
                a = null;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                akU.a("cr.SysMessageHandler", "Runtime exception during async message creation, disabling.", new Object[0]);
            }
            a = null;
        }

        a.a()
        {
            try
            {
                a = Class.forName("android.os.Message").getMethod("setAsynchronous", new Class[] {
                    Boolean.TYPE
                });
                return;
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                akU.a("cr.SysMessageHandler", "Failed to find android.os.Message class", new Object[] {
                    classnotfoundexception
                });
                return;
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                akU.a("cr.SysMessageHandler", "Failed to load Message.setAsynchronous method", new Object[] {
                    nosuchmethodexception
                });
                return;
            }
            catch (RuntimeException runtimeexception)
            {
                akU.a("cr.SysMessageHandler", "Exception while loading Message.setAsynchronous method", new Object[] {
                    runtimeexception
                });
            }
        }
    }

    static final class a.b
        implements a.c
    {

        public final void a(Message message)
        {
            message.setAsynchronous(true);
        }

        a.b()
        {
        }
    }

    static interface a.c
    {

        public abstract void a(Message message);
    }


    private long a;
    private long b;

    private SystemMessageHandler(long l)
    {
        a = 0L;
        b = 0L;
        a = l;
    }

    private static Message a(int i)
    {
        Message message = Message.obtain();
        message.what = i;
        a.a(message);
        return message;
    }

    private static SystemMessageHandler create(long l)
    {
        return new SystemMessageHandler(l);
    }

    private native void nativeDoRunLoopOnce(long l, long l1);

    private void removeAllPendingMessages()
    {
        removeMessages(1);
        removeMessages(2);
    }

    private void scheduleDelayedWork(long l, long l1)
    {
        if (b != 0L)
        {
            removeMessages(2);
        }
        b = l;
        sendMessageDelayed(a(2), l1);
    }

    private void scheduleWork()
    {
        sendMessage(a(1));
    }

    public void handleMessage(Message message)
    {
        if (message.what == 2)
        {
            b = 0L;
        }
        nativeDoRunLoopOnce(a, b);
    }
}

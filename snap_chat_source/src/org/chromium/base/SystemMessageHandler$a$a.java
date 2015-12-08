// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import akU;
import android.os.Message;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package org.chromium.base:
//            SystemMessageHandler

static final class a
    implements a
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

    ()
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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice.e;

import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package com.baidu.android.pushservice.e:
//            a

public class b
    implements a
{

    private com.baidu.android.pushservice.b.b a;

    public b()
    {
    }

    public b(com.baidu.android.pushservice.b.b b1)
    {
        a = b1;
    }

    public void a(int k)
    {
    }

    public void a(int k, String s)
    {
        try
        {
            a.b(k, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void a(int k, String s, boolean flag)
    {
    }

    public void a(boolean flag)
    {
    }

    public void a(boolean flag, boolean flag1)
    {
    }

    public void b(int k)
    {
    }

    public void b(int k, String s)
    {
        if (a == null)
        {
            return;
        }
        try
        {
            a.c(k, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("LightApiListenerForAidl", "onUnbindLightResult error");
        }
        Log.e("LightApiListenerForAidl", (new StringBuilder("error ")).append(s.getMessage()).toString());
    }

    public void c(int k)
    {
    }

    public void c(int k, String s)
    {
        if (a == null)
        {
            return;
        }
        try
        {
            a.b(k, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("LightApiListenerForAidl", "onSubscribeResult error");
        }
        Log.e("LightApiListenerForAidl", (new StringBuilder("error ")).append(s.getMessage()).toString());
    }

    public void d(int k)
    {
    }

    public void d(int k, String s)
    {
        if (a == null)
        {
            return;
        }
        try
        {
            a.a(k, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("LightApiListenerForAidl", "onUnsubscribeResult error");
        }
        Log.e("LightApiListenerForAidl", (new StringBuilder("error ")).append(s.getMessage()).toString());
    }

    public void e(int k)
    {
    }

    public void e(int k, String s)
    {
        try
        {
            a.b(k, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("LightApiListenerForAidl", "onSubscribeServiceResult error");
        }
        Log.e("LightApiListenerForAidl", (new StringBuilder("error ")).append(s.getMessage()).toString());
    }

    public void f(int k, String s)
    {
    }

    public void g(int k, String s)
    {
    }

    public void h(int k, String s)
    {
    }

    public void i(int k, String s)
    {
    }

    public void j(int k, String s)
    {
    }
}

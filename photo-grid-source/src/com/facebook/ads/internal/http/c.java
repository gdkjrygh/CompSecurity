// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.http;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.util.EntityUtils;

public class c
{

    private Handler a;

    public c()
    {
        if (Looper.myLooper() != null)
        {
            a = new _cls1();
        }
    }

    protected Message a(int i, Object obj)
    {
        if (a != null)
        {
            return a.obtainMessage(i, obj);
        } else
        {
            Message message = Message.obtain();
            message.what = i;
            message.obj = obj;
            return message;
        }
    }

    public void a()
    {
    }

    public void a(int i, String s)
    {
        a(s);
    }

    protected void a(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            message = ((Message) ((Object[])message.obj));
            c(((Integer)message[0]).intValue(), (String)message[1]);
            return;

        case 1: // '\001'
            message = ((Message) ((Object[])message.obj));
            c((Throwable)message[0], (String)message[1]);
            return;

        case 2: // '\002'
            a();
            return;

        case 3: // '\003'
            b();
            break;
        }
    }

    public void a(String s)
    {
    }

    public void a(Throwable throwable)
    {
    }

    public void a(Throwable throwable, String s)
    {
        a(throwable);
    }

    void a(HttpResponse httpresponse)
    {
        Object obj;
        StatusLine statusline;
        obj = null;
        statusline = httpresponse.getStatusLine();
        org.apache.http.HttpEntity httpentity = httpresponse.getEntity();
        httpresponse = obj;
        if (httpentity != null)
        {
            try
            {
                httpresponse = EntityUtils.toString(new BufferedHttpEntity(httpentity), "UTF-8");
            }
            // Misplaced declaration of an exception variable
            catch (HttpResponse httpresponse)
            {
                b(httpresponse, null);
                httpresponse = obj;
            }
        }
        if (statusline.getStatusCode() >= 300)
        {
            b(new HttpResponseException(statusline.getStatusCode(), statusline.getReasonPhrase()), httpresponse);
            return;
        } else
        {
            b(statusline.getStatusCode(), httpresponse);
            return;
        }
    }

    public void b()
    {
    }

    protected void b(int i, String s)
    {
        b(a(0, ((Object) (new Object[] {
            Integer.valueOf(i), s
        }))));
    }

    protected void b(Message message)
    {
        if (a != null)
        {
            a.sendMessage(message);
            return;
        } else
        {
            a(message);
            return;
        }
    }

    protected void b(Throwable throwable, String s)
    {
        b(a(1, ((Object) (new Object[] {
            throwable, s
        }))));
    }

    protected void c()
    {
        b(a(2, null));
    }

    protected void c(int i, String s)
    {
        a(i, s);
    }

    protected void c(Throwable throwable, String s)
    {
        a(throwable, s);
    }

    protected void d()
    {
        b(a(3, null));
    }

    private class _cls1 extends Handler
    {

        final c a;

        public void handleMessage(Message message)
        {
            a.a(message);
        }

        _cls1()
        {
            a = c.this;
            super();
        }
    }

}

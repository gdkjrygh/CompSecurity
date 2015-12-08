// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.TextView;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.util.EntityUtils;

// Referenced classes of package io.card.payment:
//            g, l

public class f
{

    private Handler a;

    public f()
    {
        if (Looper.myLooper() != null)
        {
            a = new g(this);
        }
    }

    private Message a(int i, Object obj)
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

    public static void a(Activity activity, TextView textview, String s, String s1, Drawable drawable)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        activity.setTitle((new StringBuilder()).append(s2).append(s).toString());
        if (c())
        {
            s1 = activity.getActionBar();
            s1.setBackgroundDrawable(l.b);
            s1.setTitle(s);
            activity = (TextView)activity.findViewById(Resources.getSystem().getIdentifier("action_bar_title", "id", "android"));
            if (activity != null)
            {
                activity.setTextColor(-1);
            }
            s1.setDisplayHomeAsUpEnabled(false);
            if (drawable != null && android.os.Build.VERSION.SDK_INT >= 14)
            {
                s1.setIcon(drawable);
            } else
            {
                s1.setDisplayShowHomeEnabled(false);
            }
            if (textview != null)
            {
                textview.setVisibility(8);
            }
        } else
        if (textview != null)
        {
            textview.setText(s);
            return;
        }
    }

    private void b(Message message)
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

    public static boolean c()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }

    public static boolean d()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }

    protected final void a()
    {
        b(a(2, null));
    }

    protected final void a(Message message)
    {
        Object aobj[];
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            a((String)message.obj);
            return;

        case 1: // '\001'
            aobj = (Object[])message.obj;
            break;
        }
        message = (Throwable)aobj[0];
        String s = (String)aobj[1];
        a(((Throwable) (message)));
    }

    public void a(String s)
    {
    }

    public void a(Throwable throwable)
    {
    }

    protected final void a(Throwable throwable, String s)
    {
        b(a(1, ((Object) (new Object[] {
            throwable, s
        }))));
    }

    final void a(HttpResponse httpresponse)
    {
        Object obj;
        StatusLine statusline;
        obj = null;
        statusline = httpresponse.getStatusLine();
        httpresponse = httpresponse.getEntity();
        if (httpresponse == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        httpresponse = new BufferedHttpEntity(httpresponse);
_L2:
        httpresponse = EntityUtils.toString(httpresponse);
_L1:
        int i = statusline.getStatusCode();
        if (i < 200 || 300 <= i)
        {
            a(((Throwable) (new HttpResponseException(statusline.getStatusCode(), statusline.getReasonPhrase()))), ((String) (httpresponse)));
            return;
        } else
        {
            b(a(0, httpresponse));
            return;
        }
        httpresponse;
        a(((Throwable) (httpresponse)), ((String) (null)));
        httpresponse = obj;
          goto _L1
        httpresponse = null;
          goto _L2
    }

    protected final void b()
    {
        b(a(3, null));
    }
}

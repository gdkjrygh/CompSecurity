// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.os.Message;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.paypal.android.sdk:
//            aL

public final class aN extends aL
{

    private static String a[] = {
        "image/jpeg", "image/png"
    };

    public aN()
    {
    }

    protected final void a(Message message)
    {
        switch (message.what)
        {
        default:
            super.a(message);
            return;

        case 0: // '\0'
            ((Integer)((Object[])message.obj)[0]).intValue();
            return;

        case 1: // '\001'
            message = ((Message) ((Object[])message.obj));
            break;
        }
        Throwable throwable = (Throwable)message[0];
        byte abyte0[] = (byte[])message[1];
        a(throwable, (String)message[3]);
    }

    protected final void a(Throwable throwable, byte abyte0[], String s)
    {
        b(a(1, ((Object) (new Object[] {
            throwable, abyte0, s
        }))));
    }

    final void a(HttpResponse httpresponse)
    {
        String s;
        Object obj;
        StatusLine statusline;
        obj = null;
        statusline = httpresponse.getStatusLine();
        Header aheader[] = httpresponse.getHeaders("PayPal-Debug-Id");
        Header aheader1[];
        if (aheader != null && aheader.length > 0)
        {
            s = aheader[1].getValue();
        } else
        {
            s = null;
        }
        aheader1 = httpresponse.getHeaders("Content-Type");
        if (aheader1.length != 1)
        {
            a(((Throwable) (new HttpResponseException(statusline.getStatusCode(), "None, or more than one, Content-Type Header found!"))), null, s);
            return;
        }
        Header header = aheader1[0];
        String as[] = a;
        int j = as.length;
        int i = 0;
        boolean flag = false;
        for (; i < j; i++)
        {
            if (as[i].equals(header.getValue()))
            {
                flag = true;
            }
        }

        if (!flag)
        {
            a(((Throwable) (new HttpResponseException(statusline.getStatusCode(), "Content-Type not allowed!"))), null, s);
            return;
        }
        httpresponse = httpresponse.getEntity();
        if (httpresponse == null)
        {
            break MISSING_BLOCK_LABEL_283;
        }
        httpresponse = new BufferedHttpEntity(httpresponse);
_L2:
        httpresponse = EntityUtils.toByteArray(httpresponse);
_L1:
        if (statusline.getStatusCode() >= 300)
        {
            a(((Throwable) (new HttpResponseException(statusline.getStatusCode(), statusline.getReasonPhrase()))), ((byte []) (httpresponse)), s);
            return;
        } else
        {
            b(a(0, ((Object) (new Object[] {
                Integer.valueOf(statusline.getStatusCode()), httpresponse, s
            }))));
            return;
        }
        httpresponse;
        a(((Throwable) (httpresponse)), null, s);
        httpresponse = obj;
          goto _L1
        httpresponse = null;
          goto _L2
    }

}

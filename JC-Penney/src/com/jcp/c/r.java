// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import com.jcp.e.ar;
import com.jcp.e.as;
import com.jcp.e.at;
import com.jcp.e.w;
import com.jcp.errorstatus.ErrorMessageUtil;
import com.jcp.http.b;
import com.jcp.http.c;
import com.jcp.model.OrderItemsDetails;
import com.jcp.pojo.Response;
import com.jcp.util.aa;

public final class r
    implements w
{

    private static r a;
    private Context b;
    private as c;
    private ar d;
    private at e;

    private r(Context context)
    {
        b = context;
    }

    public static r a(Context context)
    {
        if (a == null)
        {
            a = new r(context);
        }
        return a;
    }

    private void b(Response response)
    {
label0:
        {
label1:
            {
                int i = response.getStatusCode();
                response = response.getResponseBody();
                if (e != null)
                {
                    if (!com.jcp.http.b.a(i))
                    {
                        break label0;
                    }
                    response = (com.jcp.pojo.TrackShipment[])aa.a(response, [Lcom/jcp/pojo/TrackShipment;);
                    if (response == null)
                    {
                        break label1;
                    }
                    e.a(response[0]);
                }
                return;
            }
            c(b.getString(0x7f0701bb), b.getString(0x7f0701f6));
            return;
        }
        String s = ErrorMessageUtil.getErrorMessageFromJSONResponse(response);
        b(ErrorMessageUtil.getErrorCode(response), s);
    }

    private void b(String s, String s1)
    {
        e.a(s, s1);
    }

    private void c(Response response)
    {
label0:
        {
label1:
            {
                int i = response.getStatusCode();
                response = response.getResponseBody();
                if (d != null)
                {
                    if (!com.jcp.http.b.a(i))
                    {
                        break label0;
                    }
                    response = (com.jcp.model.OrderHistory[])aa.a(response, [Lcom/jcp/model/OrderHistory;);
                    if (response == null)
                    {
                        break label1;
                    }
                    d.a(response);
                }
                return;
            }
            c(b.getString(0x7f0701bb), b.getString(0x7f0701f6));
            return;
        }
        String s = ErrorMessageUtil.getErrorMessageFromJSONResponse(response);
        c(ErrorMessageUtil.getErrorCode(response), s);
    }

    private void c(String s, String s1)
    {
        d.a(s, s1);
    }

    private void d(Response response)
    {
label0:
        {
label1:
            {
                int i = response.getStatusCode();
                response = response.getResponseBody();
                if (c != null)
                {
                    if (!com.jcp.http.b.a(i))
                    {
                        break label0;
                    }
                    response = (OrderItemsDetails)aa.a(response, com/jcp/model/OrderItemsDetails);
                    if (response == null)
                    {
                        break label1;
                    }
                    c.a(response);
                }
                return;
            }
            d(b.getString(0x7f0701bb), b.getString(0x7f0701f6));
            return;
        }
        String s = ErrorMessageUtil.getErrorMessageFromJSONResponse(response);
        d(ErrorMessageUtil.getErrorCode(response), s);
    }

    private void d(String s, String s1)
    {
        c.a(s, s1);
    }

    public void a()
    {
        c c1 = new c(b, this);
        c1.b(com.jcp.b.b.X());
        c1.a(false);
        c1.a(79);
        c1.b(0);
        c1.execute(new String[0]);
    }

    public void a(ar ar1)
    {
        d = ar1;
    }

    public void a(as as1)
    {
        c = as1;
    }

    public void a(at at1)
    {
        e = at1;
    }

    public void a(Response response)
    {
        switch (response.getReJcpRequestTypes())
        {
        default:
            return;

        case 80: // 'P'
        case 82: // 'R'
            d(response);
            return;

        case 79: // 'O'
            c(response);
            return;

        case 81: // 'Q'
            b(response);
            break;
        }
    }

    public void a(String s)
    {
        c c1 = new c(b, this);
        c1.b(s);
        c1.a(false);
        c1.a(80);
        c1.b(1);
        c1.execute(new String[0]);
    }

    public void a(String s, String s1)
    {
        c c1 = new c(b, this);
        c1.b(com.jcp.b.b.c(s, s1));
        c1.a(false);
        c1.a(81);
        c1.b(0);
        c1.execute(new String[0]);
    }
}

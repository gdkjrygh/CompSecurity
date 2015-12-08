// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.http;

import android.util.Log;
import org.apache.http.params.AbstractHttpParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.google.android.gms.http:
//            GoogleHttpClient, GoogleURLConnectionFactory

final class > extends AbstractHttpParams
{

    final GoogleHttpClient this$0;

    public final HttpParams copy()
    {
        throw new UnsupportedOperationException();
    }

    public final Object getParameter(String s)
    {
        return null;
    }

    public final boolean removeParameter(String s)
    {
        Log.w("GoogleHttpClient", (new StringBuilder("Ignoring unsupported remove operation for: ")).append(s).toString());
        return true;
    }

    public final HttpParams setParameter(String s, Object obj)
    {
label0:
        {
            if (!s.equals("http.conn-manager.timeout"))
            {
                if (!s.equals("http.socket.timeout"))
                {
                    break label0;
                }
                s = (Integer)obj;
                mConnectionFactory.defaultReadTimeout = s.intValue();
            }
            return this;
        }
        if (s.equals("http.connection.timeout"))
        {
            s = (Integer)obj;
            mConnectionFactory.defaultConnectTimeout = s.intValue();
            return this;
        } else
        {
            Log.w("GoogleHttpClient", (new StringBuilder("Ignoring unsupported parameter: ")).append(s).toString());
            return this;
        }
    }

    Factory()
    {
        this$0 = GoogleHttpClient.this;
        super();
    }
}

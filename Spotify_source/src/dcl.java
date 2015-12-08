// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import com.sony.snei.np.android.common.oauth.exception.OAuthResponseParserException;
import com.sony.snei.np.android.common.oauth.exception.VersaProtocolException;
import com.sony.snei.np.android.common.oauth.exception.VersaServerException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

public abstract class dcl
    implements ResponseHandler
{

    final Uri a;

    public dcl(Uri uri)
    {
        a = uri;
    }

    protected static dbx a(int i, HttpResponse httpresponse, String s)
    {
        httpresponse = httpresponse.getFirstHeader("Content-Type");
        if (httpresponse != null)
        {
            httpresponse = httpresponse.getValue();
            if (!TextUtils.isEmpty(httpresponse) && httpresponse.contains("application/json"))
            {
                try
                {
                    httpresponse = new dbx(s);
                    dbz.a(httpresponse, i);
                }
                // Misplaced declaration of an exception variable
                catch (HttpResponse httpresponse)
                {
                    throw new VersaProtocolException(i, httpresponse);
                }
                return httpresponse;
            } else
            {
                throw new VersaProtocolException(i, 1);
            }
        } else
        {
            throw new VersaProtocolException(i, 1);
        }
    }

    protected static dby a(int i, String s, Uri uri)
    {
        if (TextUtils.isEmpty(Uri.parse(s).getFragment()))
        {
            s = new dcd(uri);
        } else
        {
            s = new dcc(uri);
        }
        dbz.a(s, i);
        return s;
    }

    protected abstract Object a(int i, String s);

    protected abstract Object a(HttpResponse httpresponse, int i, String s);

    public Object handleResponse(HttpResponse httpresponse)
    {
        String s;
        int i;
        try
        {
            i = httpresponse.getStatusLine().getStatusCode();
            s = EntityUtils.toString(httpresponse.getEntity());
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw new ClientProtocolException(httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw new ClientProtocolException(httpresponse);
        }
        i;
        JVM INSTR lookupswitch 3: default 136
    //                   200: 83
    //                   301: 91
    //                   302: 91;
           goto _L1 _L2 _L3 _L3
_L1:
        a(i, httpresponse, s);
        throw new VersaProtocolException(i, 2);
_L2:
        return a(httpresponse, i, s);
_L3:
        httpresponse = httpresponse.getFirstHeader("Location");
        if (httpresponse == null) goto _L5; else goto _L4
_L4:
        return a(i, httpresponse.getValue());
_L5:
        throw new VersaProtocolException(i, 2);
    }
}

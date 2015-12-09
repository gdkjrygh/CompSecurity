// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.http;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.jcp.JCP;
import com.jcp.e.w;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.pojo.Response;
import com.jcp.util.ae;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.jcp.http:
//            b

public class a extends AsyncTask
{

    private static final String a = com/jcp/http/a.getName();
    private String b;
    private Context c;
    private w d;
    private int e;
    private boolean f;
    private int g;

    public a(Context context, w w1)
    {
        g = 0;
        c = context;
        d = w1;
    }

    private static String a(InputStream inputstream)
    {
        char ac[];
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        ac = new char[1024];
        Object obj1 = new BufferedReader(new InputStreamReader(inputstream));
_L2:
        Object obj = obj1;
        int i = ((BufferedReader) (obj1)).read(ac, 0, 1024);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        stringbuilder.append(ac, 0, i);
        if (true) goto _L2; else goto _L1
        IOException ioexception;
        ioexception;
_L6:
        obj = obj1;
        ae.a(a, "Exception reading from input stream reader", ioexception);
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                ae.a(a, "Exception while closing input stream", inputstream);
            }
        }
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                ae.a(a, "Exception while closing buffer reader", inputstream);
            }
        }
        return stringbuilder.toString();
_L1:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                ae.a(a, "Exception while closing input stream", inputstream);
            }
        }
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                ae.a(a, "Exception while closing buffer reader", inputstream);
            }
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj1;
        obj = null;
_L4:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                ae.a(a, "Exception while closing input stream", inputstream);
            }
        }
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                ae.a(a, "Exception while closing buffer reader", inputstream);
            }
        }
        throw obj1;
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        ioexception;
        obj1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(Response response, String s)
    {
        if (isCancelled())
        {
            com.jcp.http.b.a(response, e);
            return;
        } else
        {
            com.jcp.http.b.a(response, c, s);
            return;
        }
    }

    protected transient Response a(Void avoid[])
    {
        avoid = new Response();
        avoid.setReJcpRequestTypes(e);
        if (g != 0)
        {
            throw new UnsupportedOperationException((new StringBuilder()).append("Currently only GET supported by ").append(a).toString());
        }
        HttpURLConnection httpurlconnection;
        ae.d(a, (new StringBuilder()).append("URL : ").append(b).toString());
        httpurlconnection = (HttpURLConnection)(new URL(b.replaceAll(" ", "%20"))).openConnection();
        JCP.a(httpurlconnection);
        httpurlconnection.setConnectTimeout(10000);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setInstanceFollowRedirects(true);
        if (!isCancelled())
        {
            break MISSING_BLOCK_LABEL_144;
        }
        com.jcp.http.b.a(avoid, e);
        return avoid;
        String s;
        int i;
        s = a(httpurlconnection.getInputStream());
        i = httpurlconnection.getResponseCode();
        if (!isCancelled())
        {
            break MISSING_BLOCK_LABEL_175;
        }
        com.jcp.http.b.a(avoid, e);
        return avoid;
label0:
        {
            if (TextUtils.isEmpty(s))
            {
                a(((Response) (avoid)), null);
                break label0;
            }
            try
            {
                ae.d(a, (new StringBuilder()).append("Response : ").append(s).toString());
                ae.d(a, (new StringBuilder()).append("Status Code: ").append(i).toString());
                avoid.setStatusCode(i);
                avoid.setResponseBoday(s);
                avoid.setOptionalMsg(httpurlconnection.getResponseMessage());
            }
            catch (Exception exception)
            {
                ae.a(a, (new StringBuilder()).append("Error: ").append(b).toString(), exception);
                a(((Response) (avoid)), exception.getMessage());
            }
        }
        return avoid;
    }

    public void a(int i)
    {
        e = i;
    }

    protected void a(Response response)
    {
        if (!f && (!(c instanceof Activity) || !((Activity)c).isFinishing()))
        {
            com.jcp.b.a.i();
        }
        if (d != null)
        {
            if (com.jcp.http.b.b(response.getStatusCode()))
            {
                ErrorMessageEntityContainer errormessageentitycontainer = com.jcp.f.a.a(response.getResponseBody());
                if (errormessageentitycontainer != null)
                {
                    ae.d(a, (new StringBuilder()).append("Service request received an error : ").append(errormessageentitycontainer.getErrorCode()).toString());
                } else
                {
                    ae.d(a, "Setting generic error message");
                    response.setErrorMsg(c.getString(0x7f0702b7));
                }
            }
            d.a(response);
        }
        super.onPostExecute(response);
    }

    public void a(String s)
    {
        b = s;
    }

    public void a(boolean flag)
    {
        f = flag;
    }

    public void b(int i)
    {
        g = i;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Response)obj);
    }

    public void onPreExecute()
    {
        if (!f && c != null && (!(c instanceof Activity) || !((Activity)c).isFinishing()))
        {
            com.jcp.b.a.a(c, 0x7f070317);
        }
    }

}

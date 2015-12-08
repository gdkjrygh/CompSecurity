// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.b.a.a;
import com.b.a.k;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package b.a:
//            ff, fj, ht, fg

public final class hv
{

    private String a;
    private String b;
    private int c;
    private Context d;
    private ht e;

    public hv(Context context)
    {
        b = "10.0.0.172";
        c = 80;
        d = context;
        a = a(context);
    }

    private static String a(Context context)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("Android");
        stringbuffer.append("/");
        stringbuffer.append("5.5.3");
        stringbuffer.append(" ");
        try
        {
            StringBuffer stringbuffer1 = new StringBuffer();
            stringbuffer1.append(ff.p(context));
            stringbuffer1.append("/");
            stringbuffer1.append(ff.b(context));
            stringbuffer1.append(" ");
            stringbuffer1.append(Build.MODEL);
            stringbuffer1.append("/");
            stringbuffer1.append(android.os.Build.VERSION.RELEASE);
            stringbuffer1.append(" ");
            stringbuffer1.append(b.a.fj.a(com.b.a.a.a(context)));
            stringbuffer.append(URLEncoder.encode(stringbuffer1.toString(), "UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        return stringbuffer.toString();
    }

    private boolean a()
    {
        if (d.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", d.getPackageName()) != 0)
        {
            return false;
        }
        Object obj = ((ConnectivityManager)d.getSystemService("connectivity")).getActiveNetworkInfo();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (((NetworkInfo) (obj)).getType() == 1)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        obj = ((NetworkInfo) (obj)).getExtraInfo();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        boolean flag;
        if (((String) (obj)).equals("cmwap") || ((String) (obj)).equals("3gwap"))
        {
            break MISSING_BLOCK_LABEL_90;
        }
        flag = ((String) (obj)).equals("uniwap");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        return true;
        Exception exception;
        exception;
        exception.printStackTrace();
        return false;
    }

    private byte[] a(byte abyte0[], String s)
    {
        HttpPost httppost;
        Object obj;
        httppost = new HttpPost(s);
        obj = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(((HttpParams) (obj)), 10000);
        HttpConnectionParams.setSoTimeout(((HttpParams) (obj)), 30000);
        obj = new DefaultHttpClient(((HttpParams) (obj)));
        httppost.addHeader("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
        httppost.addHeader("X-Umeng-Sdk", a);
        httppost.addHeader("Msg-Type", "envelope");
        int i;
        boolean flag;
        if (a())
        {
            HttpHost httphost = new HttpHost(b, c);
            ((HttpClient) (obj)).getParams().setParameter("http.route.default-proxy", httphost);
        }
        httppost.setEntity(new InputStreamEntity(new ByteArrayInputStream(abyte0), abyte0.length));
        if (e != null)
        {
            e.g();
        }
        abyte0 = ((HttpClient) (obj)).execute(httppost);
        if (e != null)
        {
            e.h();
        }
        i = abyte0.getStatusLine().getStatusCode();
        flag = b.a.fj.a(abyte0.getFirstHeader("Content-Type"), "application/thrift");
        fg.c("MobclickAgent", (new StringBuilder("status code : ")).append(i).toString());
        if (i != 200 || !flag)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        b.a.fg.a("MobclickAgent", (new StringBuilder("Send message to ")).append(s).toString());
        abyte0 = abyte0.getEntity();
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        abyte0 = abyte0.getContent();
        s = fj.b(abyte0);
        fj.c(abyte0);
        return s;
        s;
        try
        {
            fj.c(abyte0);
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            fg.b("MobclickAgent", "ClientProtocolException,Failed to send message.", abyte0);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            fg.b("MobclickAgent", "IOException,Failed to send message.", abyte0);
        }
        break MISSING_BLOCK_LABEL_332;
        return null;
        return null;
        return null;
    }

    public final void a(ht ht1)
    {
        e = ht1;
    }

    public final byte[] a(byte abyte0[])
    {
        byte abyte1[] = null;
        int i = 0;
        do
        {
label0:
            {
                byte abyte2[] = abyte1;
                if (i < k.a.length)
                {
                    abyte1 = a(abyte0, k.a[i]);
                    if (abyte1 == null)
                    {
                        break label0;
                    }
                    abyte2 = abyte1;
                    if (e != null)
                    {
                        e.i();
                        abyte2 = abyte1;
                    }
                }
                return abyte2;
            }
            if (e != null)
            {
                e.j();
            }
            i++;
        } while (true);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.net.http.AndroidHttpClient;
import android.text.TextUtils;
import android.util.Log;
import com.sony.snei.np.android.common.oauth.exception.NpamInternalException;
import com.sony.snei.np.android.common.oauth.exception.VersaException;
import com.sony.snei.np.android.common.oauth.exception.VersaNetworkException;
import java.io.IOException;
import java.security.MessageDigest;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;

public final class dcm
{

    private static VersaException a(Exception exception)
    {
        if (exception instanceof VersaException)
        {
            return (VersaException)exception;
        }
        if (exception instanceof ClientProtocolException)
        {
            Throwable throwable = exception.getCause();
            if (throwable instanceof VersaException)
            {
                return (VersaException)throwable;
            } else
            {
                return new VersaNetworkException((ClientProtocolException)exception);
            }
        }
        if (exception instanceof IOException)
        {
            return new VersaNetworkException((IOException)exception);
        }
        if (exception instanceof AuthenticationException)
        {
            return new VersaNetworkException((AuthenticationException)exception);
        } else
        {
            throw new NpamInternalException(exception);
        }
    }

    public static dca a(String s, dbu dbu1, dch dch, String s1)
    {
        String s2;
        String s3;
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        s3 = obj;
        s2 = obj1;
        dch = dcj.a(b(s), dbu1, dch, s1);
        s3 = obj;
        s2 = obj1;
        s = AndroidHttpClient.newInstance("com.sony.snei.np.android.account.USER_AGENT");
        s3 = s;
        s2 = s;
        s.getParams().setBooleanParameter("http.protocol.handle-redirects", false);
        s3 = s;
        s2 = s;
        dbu1 = (dca)s.execute(dch, new dcf(Uri.parse(dbu1.c)));
        if (s != null)
        {
            s.getConnectionManager().shutdown();
            s.close();
        }
        return dbu1;
        s;
        s2 = s3;
        Log.w("VersaOAuthUtils", "retrieveTokenByRefreshToken", s);
        s2 = s3;
        throw a(((Exception) (s)));
        s;
        if (s2 != null)
        {
            s2.getConnectionManager().shutdown();
            s2.close();
        }
        throw s;
    }

    public static dca a(String s, dbu dbu1, dch dch, String s1, String s2)
    {
        String s3;
        String s4;
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        s4 = obj;
        s3 = obj1;
        dch = dcj.a(b(s), dbu1, dch, s2, s1);
        s4 = obj;
        s3 = obj1;
        s = AndroidHttpClient.newInstance("com.sony.snei.np.android.account.USER_AGENT");
        s4 = s;
        s3 = s;
        dbu1 = (dca)s.execute(dch, new dcf(Uri.parse(dbu1.c)));
        if (s != null)
        {
            s.getConnectionManager().shutdown();
            s.close();
        }
        return dbu1;
        s;
        s3 = s4;
        Log.w("VersaOAuthUtils", "retrieveTokenByGrantCode", s);
        s3 = s4;
        throw a(((Exception) (s)));
        s;
        if (s3 != null)
        {
            s3.getConnectionManager().shutdown();
            s3.close();
        }
        throw s;
    }

    public static dcg a(String s, dbu dbu1, String s1)
    {
        String s2;
        String s3;
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        s3 = obj;
        s2 = obj1;
        s1 = dcj.a(b(s), dbu1, s1);
        s3 = obj;
        s2 = obj1;
        s = AndroidHttpClient.newInstance("com.sony.snei.np.android.account.USER_AGENT");
        s3 = s;
        s2 = s;
        s1 = (dcg)s.execute(s1, new dce(Uri.parse(dbu1.c)));
        if (s != null)
        {
            s.getConnectionManager().shutdown();
            s.close();
        }
        s = ((dcg) (s1)).a;
        dbu1 = MessageDigest.getInstance("SHA-256");
        dbu1.update(s.getBytes());
        s = dbu1.digest();
        dbu1 = new StringBuilder();
        for (int i = 0; i < s.length; i++)
        {
            dbu1.append(Integer.toHexString(s[i] & 0xff));
        }

        break MISSING_BLOCK_LABEL_189;
        s;
        s2 = s3;
        Log.w("VersaOAuthUtils", "verifyAccessToken", s);
        s2 = s3;
        throw a(((Exception) (s)));
        s;
        if (s2 != null)
        {
            s2.getConnectionManager().shutdown();
            s2.close();
        }
        throw s;
        s1.b = dbu1.toString();
        dbu1 = ((dcg) (s1)).c;
        String as[] = dbu1.split("\\Q@\\E");
        s = dbu1;
        if (as.length != 1)
        {
            s = dbu1;
            if (as.length > 1)
            {
                s = dbu1;
                if (!TextUtils.isEmpty(as[0]))
                {
                    s = as[0];
                }
            }
        }
        s1.c = s;
        return s1;
    }

    public static String a(String s)
    {
        String s1 = s;
        if (s.equals("np"))
        {
            s1 = "";
        }
        s = s1;
        if (!TextUtils.isEmpty(s1))
        {
            s = (new StringBuilder()).append(s1).append(".").toString();
        }
        return s;
    }

    private static Uri b(String s)
    {
        return Uri.parse(String.format("https://auth.api.%ssonyentertainmentnetwork.com/2.0/oauth/token", new Object[] {
            a(s)
        }));
    }
}

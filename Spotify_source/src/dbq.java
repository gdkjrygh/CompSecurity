// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.text.TextUtils;
import com.sony.snei.np.android.common.oauth.exception.NpamAuthGatewayException;
import com.sony.snei.np.android.common.oauth.exception.NpamAuthGatewayNetworkException;
import com.sony.snei.np.android.common.oauth.exception.NpamAuthGatewayProtocolException;
import com.sony.snei.np.android.common.oauth.exception.NpamAuthGatewayServerException;
import com.sony.snei.np.android.common.oauth.exception.NpamReasonCodeException;
import com.sony.snei.np.android.common.oauth.exception.VersaException;
import com.sony.snei.np.android.common.oauth.exception.VersaNetworkException;
import com.sony.snei.np.android.common.oauth.exception.VersaProtocolException;
import com.sony.snei.np.android.common.oauth.exception.VersaServerException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;

public final class dbq
{

    private static Bundle a(int i)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("9qz", i | 0xff);
        return bundle;
    }

    private static Bundle a(int i, IOException ioexception)
    {
        Bundle bundle;
        byte byte0;
        byte0 = 4;
        bundle = new Bundle();
        if (!(ioexception instanceof NoHttpResponseException)) goto _L2; else goto _L1
_L1:
        char c = '\001';
_L4:
        bundle.putInt("9qz", c | i);
        return bundle;
_L2:
        if (ioexception instanceof ConnectionPoolTimeoutException)
        {
            c = '\003';
        } else
        if (ioexception instanceof ConnectTimeoutException)
        {
            c = '\002';
        } else
        {
            c = byte0;
            if (!(ioexception instanceof ConnectException))
            {
                if (ioexception instanceof NoRouteToHostException)
                {
                    c = '\005';
                } else
                {
                    c = byte0;
                    if (!(ioexception instanceof UnknownHostException))
                    {
                        c = '\377';
                    }
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static Bundle a(int i, SSLException sslexception)
    {
        Bundle bundle = new Bundle();
        byte byte0;
        if (sslexception instanceof SSLProtocolException)
        {
            byte0 = 36;
        } else
        if (sslexception instanceof SSLPeerUnverifiedException)
        {
            byte0 = 35;
        } else
        if (sslexception instanceof SSLKeyException)
        {
            byte0 = 34;
        } else
        if (sslexception instanceof SSLHandshakeException)
        {
            byte0 = 33;
        } else
        {
            byte0 = 32;
        }
        bundle.putInt("9qz", byte0 | i);
        return bundle;
    }

    public static Bundle a(Bundle bundle)
    {
        Bundle bundle1 = new Bundle();
        Boolean boolean1 = Boolean.valueOf(bundle.getBoolean("booleanResult"));
        bundle1.putBoolean("booleanResult", boolean1.booleanValue());
        if (boolean1.booleanValue())
        {
            bundle1.putString("authAccount", bundle.getString("authAccount"));
            bundle1.putString("accountType", bundle.getString("accountType"));
            bundle1.putString("authtoken", bundle.getString("authtoken"));
            bundle1.putString("pl1", bundle.getString("pl1"));
            if (bundle.containsKey("SRQ"))
            {
                bundle1.putLong("SRQ", bundle.getLong("SRQ"));
            }
            if (bundle.containsKey("V4e"))
            {
                bundle1.putString("V4e", bundle.getString("V4e"));
            }
            if (bundle.containsKey("dfg"))
            {
                bundle1.putString("dfg", bundle.getString("dfg"));
            }
        } else
        {
            if (bundle.containsKey("errorCode"))
            {
                bundle1.putInt("errorCode", bundle.getInt("errorCode"));
            }
            if (bundle.containsKey("errorMessage"))
            {
                bundle1.putString("errorMessage", bundle.getString("errorMessage"));
            }
            if (bundle.containsKey("intent"))
            {
                bundle1.putParcelable("intent", bundle.getParcelable("intent"));
            }
            if (bundle.containsKey("9qz"))
            {
                bundle1.putInt("9qz", bundle.getInt("9qz"));
            }
            if (bundle.containsKey("RhP"))
            {
                bundle1.putString("RhP", bundle.getString("RhP"));
            }
            if (bundle.containsKey("pob"))
            {
                bundle1.putString("pob", bundle.getString("pob"));
            }
            if (bundle.containsKey("Lqz"))
            {
                bundle1.putInt("Lqz", bundle.getInt("Lqz"));
            }
            if (bundle.containsKey("ndb"))
            {
                bundle1.putInt("ndb", bundle.getInt("ndb"));
                return bundle1;
            }
        }
        return bundle1;
    }

    public static Bundle a(Exception exception)
    {
        if (!(exception instanceof VersaException)) goto _L2; else goto _L1
_L1:
        exception = (VersaException)exception;
        if (!(exception instanceof VersaServerException)) goto _L4; else goto _L3
_L3:
        VersaServerException versaserverexception = (VersaServerException)exception;
        int i = versaserverexception.b;
        exception = new Bundle();
        exception.putInt("Lqz", versaserverexception.b);
        exception.putString("RhP", versaserverexception.c);
        exception.putString("pob", versaserverexception.d);
        exception.putInt("ndb", versaserverexception.a);
        exception.putInt("9qz", i | 0x80030000);
_L6:
        exception.putBoolean("booleanResult", false);
        return exception;
_L4:
        if (exception instanceof VersaProtocolException)
        {
            VersaProtocolException versaprotocolexception = (VersaProtocolException)exception;
            int j = versaprotocolexception.d;
            Bundle bundle = new Bundle();
            bundle.putInt("ndb", versaprotocolexception.a);
            bundle.putInt("9qz", j | 0x80020000);
            if (!TextUtils.isEmpty(versaprotocolexception.b))
            {
                bundle.putString("RhP", versaprotocolexception.b);
            }
            exception = bundle;
            if (!TextUtils.isEmpty(versaprotocolexception.c))
            {
                bundle.putString("pob", versaprotocolexception.c);
                exception = bundle;
            }
        } else
        if (exception instanceof VersaNetworkException)
        {
            exception = ((VersaNetworkException)exception).getCause();
            if (exception instanceof SSLException)
            {
                exception = a(0x80010000, (SSLException)exception);
            } else
            if (exception instanceof IOException)
            {
                exception = a(0x80010000, (IOException)exception);
            } else
            if (exception instanceof AuthenticationException)
            {
                exception = new Bundle();
                exception.putInt("9qz", 0x80010010);
            } else
            {
                exception = a(0x80010000);
            }
        } else
        {
            exception = a(0x80010000);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (exception instanceof NpamAuthGatewayException)
        {
            exception = (NpamAuthGatewayException)exception;
            if (exception instanceof NpamAuthGatewayServerException)
            {
                int k = ((NpamAuthGatewayServerException)exception).a;
                exception = new Bundle();
                exception.putInt("9qz", k | 0x80060000);
            } else
            if (exception instanceof NpamAuthGatewayProtocolException)
            {
                int l = ((NpamAuthGatewayProtocolException)exception).d;
                exception = new Bundle();
                exception.putInt("9qz", l | 0x80050000);
            } else
            if (exception instanceof NpamAuthGatewayNetworkException)
            {
                exception = ((NpamAuthGatewayNetworkException)exception).getCause();
                if (exception instanceof SSLException)
                {
                    exception = a(0x80040000, (SSLException)exception);
                } else
                if (exception instanceof IOException)
                {
                    exception = a(0x80040000, (IOException)exception);
                } else
                {
                    exception = a(0x80040000);
                }
            } else
            {
                exception = a(0x80040000);
            }
        } else
        if (exception instanceof GeneralSecurityException)
        {
            GeneralSecurityException generalsecurityexception = (GeneralSecurityException)exception;
            exception = new Bundle();
            int i1;
            if (generalsecurityexception instanceof NoSuchAlgorithmException)
            {
                i1 = 0x800e0001;
            } else
            {
                i1 = 0x800e00ff;
            }
            exception.putInt("9qz", i1 | 0x800e0000);
        } else
        if (exception instanceof NpamReasonCodeException)
        {
            NpamReasonCodeException npamreasoncodeexception = (NpamReasonCodeException)exception;
            exception = new Bundle();
            exception.putInt("9qz", npamreasoncodeexception.a);
        } else
        {
            throw exception;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}

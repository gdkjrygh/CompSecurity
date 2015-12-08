// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.google.android.apps.common.csi.lib.Ticker;
import com.google.android.apps.wallet.analytics.CsiConfig;
import com.google.android.apps.wallet.analytics.CsiManager;
import com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil;
import com.google.android.apps.wallet.config.cloudconfig.CloudServiceSpec;
import com.google.android.apps.wallet.http.HttpUrlConnectionFactory;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.nano.MessageNano;
import dagger.Lazy;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.rpc:
//            RpcCaller, HttpCaller, RpcRequestMetadataProcessor, RpcException, 
//            ResponsePayloadSerializer, ResponsePayload, ResponseMetadataProcessor

public class RpcCallerImpl
    implements RpcCaller
{
    static final class UnauthorizedException extends Exception
    {

        private UnauthorizedException()
        {
        }

    }


    private static final String TAG = com/google/android/apps/wallet/rpc/RpcCallerImpl.getSimpleName();
    private static final Object TOKEN_CACHE_KEY = new Object();
    private final String accountName;
    private final WalletGoogleAuthUtil authUtil;
    private final Cache cachedAuthToken;
    private final Lazy connectionFactory;
    private final ConnectivityManager connectivityManager;
    private final CsiManager csi;
    private final HttpCaller httpCaller;
    private final ResponsePayloadSerializer payloadSerializer;
    private final ImmutableList requestMetadataProcessors;
    private final ResponseMetadataProcessor responseMetadataProcessor;
    private final CloudServiceSpec serviceSpec;
    private final String userAgent;

    RpcCallerImpl(Lazy lazy, WalletGoogleAuthUtil walletgoogleauthutil, ResponsePayloadSerializer responsepayloadserializer, ResponseMetadataProcessor responsemetadataprocessor, ImmutableList immutablelist, ConnectivityManager connectivitymanager, CloudServiceSpec cloudservicespec, 
            String s, String s1, CsiManager csimanager)
    {
        cachedAuthToken = CacheBuilder.newBuilder().maximumSize(1L).expireAfterWrite(10L, TimeUnit.MINUTES).build();
        authUtil = walletgoogleauthutil;
        connectionFactory = lazy;
        payloadSerializer = responsepayloadserializer;
        responseMetadataProcessor = responsemetadataprocessor;
        requestMetadataProcessors = immutablelist;
        connectivityManager = connectivitymanager;
        serviceSpec = cloudservicespec;
        accountName = s;
        userAgent = s1;
        csi = csimanager;
        httpCaller = new HttpCaller(responsepayloadserializer);
    }

    private URL buildUrl(String s)
        throws MalformedURLException
    {
        return new URL(String.format("%s%s", new Object[] {
            serviceSpec.getUrlPrefix(), s
        }));
    }

    private static Ticker createCsiTicker(String s)
    {
        s = s.substring(1);
        if (CsiConfig.METHOD_ACTION_MAP.containsKey(s))
        {
            s = (String)CsiConfig.METHOD_ACTION_MAP.get(s);
        } else
        {
            s = s.replace('/', '_');
        }
        return new Ticker(s);
    }

    private static String ensureLeadingSlash(String s)
    {
        String s1 = s;
        if (!s.startsWith("/"))
        {
            s1 = String.format("/%s", new Object[] {
                s
            });
        }
        return s1;
    }

    private com.google.wallet.proto.NanoWalletTransport.RequestMetadata generateRequestMetadata()
    {
        com.google.wallet.proto.NanoWalletTransport.RequestMetadata requestmetadata = new com.google.wallet.proto.NanoWalletTransport.RequestMetadata();
        for (com.google.common.collect.UnmodifiableIterator unmodifiableiterator = requestMetadataProcessors.iterator(); unmodifiableiterator.hasNext(); ((RpcRequestMetadataProcessor)unmodifiableiterator.next()).process(requestmetadata)) { }
        return requestmetadata;
    }

    private String getAuthToken()
        throws RpcException
    {
        this;
        JVM INSTR monitorenter ;
        String s = (String)cachedAuthToken.getIfPresent(TOKEN_CACHE_KEY);
        if (s == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = authUtil.getTokenWithNotification(accountName, serviceSpec.getOauthScope(), null);
        cachedAuthToken.put(TOKEN_CACHE_KEY, s);
        if (true) goto _L1; else goto _L3
_L3:
        Object obj;
        obj;
        throw new RpcException(((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        throw new RpcException(((Throwable) (obj)));
        obj;
        throw new RpcException(((Throwable) (obj)));
    }

    private MessageNano internalCall(String s, MessageNano messagenano, MessageNano messagenano1)
        throws UnauthorizedException, RpcException
    {
        MessageNano messagenano2;
        MessageNano messagenano3;
        Object obj;
        Object obj1;
        Object obj2;
        String s1;
        Ticker ticker;
        String s2;
        com.google.wallet.proto.NanoWalletTransport.RequestMetadata requestmetadata;
        long l;
        long l1 = SystemClock.elapsedRealtime();
        s1 = getAuthToken();
        l = SystemClock.elapsedRealtime();
        s2 = ensureLeadingSlash(s);
        ticker = createCsiTicker(s2);
        ticker.putCustomizedParam("st", (new StringBuilder(20)).append(l1).toString());
        ticker.tick(l - l1, new String[] {
            "at"
        });
        obj1 = null;
        obj2 = null;
        obj = null;
        requestmetadata = generateRequestMetadata();
        messagenano2 = obj;
        s = obj1;
        messagenano3 = obj2;
        ResponsePayloadSerializer responsepayloadserializer = payloadSerializer;
        messagenano2 = obj;
        s = obj1;
        messagenano3 = obj2;
        byte abyte0[] = ResponsePayloadSerializer.getRequestBytes(messagenano, requestmetadata);
        messagenano2 = obj;
        s = obj1;
        messagenano3 = obj2;
        ticker.tick(SystemClock.elapsedRealtime() - l, new String[] {
            "sr"
        });
        messagenano2 = obj;
        s = obj1;
        messagenano3 = obj2;
        messagenano = setupConnection(s2, abyte0, s1);
        messagenano2 = messagenano;
        s = messagenano;
        messagenano3 = messagenano;
        messagenano.getOutputStream().write(abyte0);
        messagenano2 = messagenano;
        s = messagenano;
        messagenano3 = messagenano;
        long l2 = SystemClock.elapsedRealtime();
        messagenano2 = messagenano;
        s = messagenano;
        messagenano3 = messagenano;
        ticker.tick(l2 - l, new String[] {
            "st"
        });
        messagenano2 = messagenano;
        s = messagenano;
        messagenano3 = messagenano;
        if (messagenano.getResponseCode() != 401)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        messagenano2 = messagenano;
        s = messagenano;
        messagenano3 = messagenano;
        invalidateAuthToken(s1);
        messagenano2 = messagenano;
        s = messagenano;
        messagenano3 = messagenano;
        throw new UnauthorizedException();
        messagenano;
        s = messagenano2;
        throw new RpcException(messagenano);
        messagenano;
        if (s != null)
        {
            s.disconnect();
        }
        throw messagenano;
        messagenano2 = messagenano;
        s = messagenano;
        messagenano3 = messagenano;
        messagenano1 = (ResponsePayload)httpCaller.deserializeResponse(messagenano, messagenano1);
        messagenano2 = messagenano;
        s = messagenano;
        messagenano3 = messagenano;
        reportTiming(l, ticker, messagenano, l2);
        if (messagenano != null)
        {
            messagenano.disconnect();
        }
        responseMetadataProcessor.processMetadata(messagenano1.getResponseMetadata(), l);
        return messagenano1.getMessage();
        messagenano;
        s = messagenano3;
        responseMetadataProcessor.processMetadata(Optional.fromNullable(messagenano.getResponseMetadata()), l);
        s = messagenano3;
        throw messagenano;
    }

    private void invalidateAuthToken(String s)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = (String)cachedAuthToken.getIfPresent(TOKEN_CACHE_KEY);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        boolean flag = s1.equals(s);
        if (flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        cachedAuthToken.invalidate(TOKEN_CACHE_KEY);
        authUtil.clearToken(s);
          goto _L2
        s;
        WLog.e(TAG, "Unexpected exception while clearing token", s);
          goto _L2
        s;
        throw s;
        s;
        WLog.e(TAG, "Unexpected exception while clearing token", s);
          goto _L2
    }

    private void reportTiming(long l, Ticker ticker, HttpURLConnection httpurlconnection, long l1)
    {
        long l2 = SystemClock.elapsedRealtime();
        ticker.tick(l2 - l1, new String[] {
            "dr"
        });
        ticker.tick(l2 - l, new String[] {
            "prt"
        });
        int i = httpurlconnection.getContentLength();
        ticker.putCustomizedParam("bd", (new StringBuilder(11)).append(i).toString());
        httpurlconnection = httpurlconnection.getHeaderField("X-Xbar-Eventid");
        NetworkInfo networkinfo = connectivityManager.getActiveNetworkInfo();
        if (networkinfo != null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(networkinfo.getTypeName());
            if (!Strings.isNullOrEmpty(networkinfo.getSubtypeName()))
            {
                stringbuilder.append('_');
                stringbuilder.append(networkinfo.getSubtypeName());
            }
            ticker.putCustomizedParam("e", stringbuilder.toString());
        }
        if (httpurlconnection != null && httpurlconnection.startsWith("eid="))
        {
            httpurlconnection = httpurlconnection.substring(4);
            ticker.putCustomizedParam("ei", httpurlconnection);
            csi.setEventId(httpurlconnection);
        }
        csi.reportTicker(ticker);
    }

    private HttpURLConnection setupConnection(String s, byte abyte0[], String s1)
        throws MalformedURLException
    {
        HttpURLConnection httpurlconnection = ((HttpUrlConnectionFactory)connectionFactory.get()).get(buildUrl(s));
        httpurlconnection.setUseCaches(false);
        httpurlconnection.setInstanceFollowRedirects(false);
        httpurlconnection.setDoOutput(true);
        httpurlconnection.setFixedLengthStreamingMode(abyte0.length);
        httpurlconnection.setRequestProperty("User-Agent", userAgent);
        s = String.valueOf(s1);
        if (s.length() != 0)
        {
            s = "Bearer ".concat(s);
        } else
        {
            s = new String("Bearer ");
        }
        httpurlconnection.setRequestProperty("Authorization", s);
        httpurlconnection.setRequestProperty("Content-Type", "application/octet-stream");
        return httpurlconnection;
    }

    public final MessageNano call(String s, MessageNano messagenano, MessageNano messagenano1)
        throws RpcException
    {
        int i;
        Preconditions.checkNotNull(s);
        i = 0;
_L2:
        if (i >= 2)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        i++;
        MessageNano messagenano2 = internalCall(s, messagenano, messagenano1);
        return messagenano2;
        throw new RpcException("Received HTTP response 401");
        UnauthorizedException unauthorizedexception;
        unauthorizedexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

}

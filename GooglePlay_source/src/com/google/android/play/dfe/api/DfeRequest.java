// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.dfe.api;

import android.accounts.Account;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.AndroidAuthenticator;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.play.dfe.utils.NanoProtoHelper;
import com.google.android.play.utils.PlayCommonLog;
import com.google.android.play.utils.config.GservicesValue;
import com.google.android.play.utils.config.PlayG;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.MessageNanoPrinter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.zip.GZIPInputStream;

// Referenced classes of package com.google.android.play.dfe.api:
//            PlayDfeApi, DfeRetryPolicy, PlayDfeApiContext, DfeServerError

public final class DfeRequest extends Request
{

    private static final boolean DEBUG;
    private static final boolean PROTO_DEBUG = Log.isLoggable("DfeProto", 2);
    private boolean mAllowMultipleResponses;
    private final PlayDfeApiContext mApiContext;
    private boolean mAvoidBulkCancel;
    private com.android.volley.Response.Listener mListener;
    private final Class mResponseClass;
    private boolean mResponseDelivered;
    private long mServerLatencyMs;

    public DfeRequest(String s, PlayDfeApiContext playdfeapicontext, Class class1, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener)
    {
        this(s, playdfeapicontext, class1, listener, errorlistener, (byte)0);
    }

    private DfeRequest(String s, PlayDfeApiContext playdfeapicontext, Class class1, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener, byte byte0)
    {
        super(0, Uri.withAppendedPath(PlayDfeApi.BASE_URI, s).toString(), errorlistener);
        mAllowMultipleResponses = false;
        mServerLatencyMs = -1L;
        mAvoidBulkCancel = false;
        if (TextUtils.isEmpty(s))
        {
            PlayCommonLog.wtf("Empty DFE URL", new Object[0]);
        }
        boolean flag;
        if (!((Boolean)PlayG.skipAllCaches.get()).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setShouldCache(flag);
        setRetryPolicy(new DfeRetryPolicy(playdfeapicontext));
        mApiContext = playdfeapicontext;
        mListener = listener;
        mResponseClass = class1;
    }

    private static void copy(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = new byte[4096];
_L1:
        int i = inputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        outputstream.write(abyte0, 0, i);
          goto _L1
        outputstream;
        inputstream.close();
        throw outputstream;
        inputstream.close();
        return;
    }

    private Response handleServerCommands(com.google.android.finsky.protos.PlayResponse.PlayResponseWrapper playresponsewrapper)
    {
        if (playresponsewrapper.commands != null)
        {
            playresponsewrapper = playresponsewrapper.commands;
            if (((com.google.android.finsky.protos.ResponseMessages.ServerCommands) (playresponsewrapper)).hasLogErrorStacktrace)
            {
                PlayCommonLog.d("%s", new Object[] {
                    ((com.google.android.finsky.protos.ResponseMessages.ServerCommands) (playresponsewrapper)).logErrorStacktrace
                });
            }
            if (((com.google.android.finsky.protos.ResponseMessages.ServerCommands) (playresponsewrapper)).clearCache)
            {
                mApiContext.mCache.clear();
            }
            if (((com.google.android.finsky.protos.ResponseMessages.ServerCommands) (playresponsewrapper)).hasDisplayErrorMessage)
            {
                return Response.error(new DfeServerError(((com.google.android.finsky.protos.ResponseMessages.ServerCommands) (playresponsewrapper)).displayErrorMessage));
            }
        }
        return null;
    }

    private void logProtoResponse(com.google.android.finsky.protos.PlayResponse.PlayResponseWrapper playresponsewrapper)
    {
        String s;
        s = (String)PlayG.protoLogUrlRegexp.get();
        if (!getUrl().matches(s))
        {
            break MISSING_BLOCK_LABEL_114;
        }
        com/google/protobuf/nano/MessageNanoPrinter;
        JVM INSTR monitorenter ;
        int j;
        Log.v("DfeProto", (new StringBuilder("Response for ")).append(getUrl()).toString());
        playresponsewrapper = MessageNanoPrinter.print(playresponsewrapper).split("\n");
        j = playresponsewrapper.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = playresponsewrapper[i];
        Log.v("DfeProto", (new StringBuilder("| ")).append(s).toString());
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        com/google/protobuf/nano/MessageNanoPrinter;
        JVM INSTR monitorexit ;
        return;
        playresponsewrapper;
        com/google/protobuf/nano/MessageNanoPrinter;
        JVM INSTR monitorexit ;
        throw playresponsewrapper;
        Log.v("DfeProto", (new StringBuilder("Url does not match regexp: url=")).append(getUrl()).append(" / regexp=").append(s).toString());
        return;
    }

    private String makeCacheKey(String s)
    {
        StringBuilder stringbuilder = (new StringBuilder(256)).append(s).append("/account=");
        s = mApiContext.mAuthenticator.getAccount();
        if (s == null)
        {
            s = null;
        } else
        {
            s = ((Account) (s)).name;
        }
        return stringbuilder.append(s).toString();
    }

    private static com.android.volley.Cache.Entry parseCacheHeaders(NetworkResponse networkresponse)
    {
        com.android.volley.Cache.Entry entry;
        long l;
        entry = HttpHeaderParser.parseCacheHeaders(networkresponse);
        if (entry == null)
        {
            return null;
        }
        l = System.currentTimeMillis();
        String s = (String)networkresponse.headers.get("X-DFE-Soft-TTL");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        entry.softTtl = Long.parseLong(s) + l;
        s = (String)networkresponse.headers.get("X-DFE-Hard-TTL");
        if (s != null)
        {
            try
            {
                entry.ttl = Long.parseLong(s) + l;
            }
            catch (NumberFormatException numberformatexception)
            {
                PlayCommonLog.d("Invalid TTL: %s", new Object[] {
                    networkresponse.headers
                });
                entry.softTtl = 0L;
                entry.ttl = 0L;
            }
        }
        entry.ttl = Math.max(entry.ttl, entry.softTtl);
        return entry;
    }

    private com.google.android.finsky.protos.PlayResponse.PlayResponseWrapper parseWrapperAndVerifySignature(NetworkResponse networkresponse, boolean flag)
    {
_L2:
        networkresponse.headers.get("X-DFE-Signature-Response");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        return com.google.android.finsky.protos.PlayResponse.PlayResponseWrapper.parseFrom(readBytes(new GZIPInputStream(new ByteArrayInputStream(networkresponse.data))));
        com.google.android.finsky.protos.PlayResponse.PlayResponseWrapper playresponsewrapper = com.google.android.finsky.protos.PlayResponse.PlayResponseWrapper.parseFrom(networkresponse.data);
        return playresponsewrapper;
        InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception;
        invalidprotocolbuffernanoexception;
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        PlayCommonLog.d("Cannot parse response as PlayResponseWrapper proto.", new Object[0]);
_L4:
        return null;
        networkresponse;
        PlayCommonLog.w("IOException while manually unzipping request.", new Object[0]);
        continue; /* Loop/switch isn't completed */
        networkresponse;
        addMarker("signature-verification-failed");
        PlayCommonLog.e("Could not verify request: %s, exception %s", new Object[] {
            this, networkresponse
        });
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static byte[] readBytes(InputStream inputstream)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        copy(inputstream, bytearrayoutputstream);
        inputstream = bytearrayoutputstream.toByteArray();
        bytearrayoutputstream.close();
        return inputstream;
        inputstream;
        bytearrayoutputstream.close();
        throw inputstream;
    }

    private void stripForCache(com.google.android.finsky.protos.PlayResponse.PlayResponseWrapper playresponsewrapper, com.android.volley.Cache.Entry entry)
    {
        if (playresponsewrapper.preFetch.length <= 0 && playresponsewrapper.commands == null)
        {
            return;
        }
        Cache cache = mApiContext.mCache;
        long l = System.currentTimeMillis();
        com.google.android.finsky.protos.ResponseMessages.PreFetch aprefetch[] = playresponsewrapper.preFetch;
        int j = aprefetch.length;
        for (int i = 0; i < j; i++)
        {
            com.google.android.finsky.protos.ResponseMessages.PreFetch prefetch = aprefetch[i];
            com.android.volley.Cache.Entry entry1 = new com.android.volley.Cache.Entry();
            entry1.data = prefetch.response;
            entry1.etag = prefetch.etag;
            entry1.serverDate = entry.serverDate;
            entry1.ttl = prefetch.ttl + l;
            entry1.softTtl = prefetch.softTtl + l;
            cache.put(makeCacheKey(Uri.withAppendedPath(PlayDfeApi.BASE_URI, prefetch.url).toString()), entry1);
        }

        playresponsewrapper.preFetch = com.google.android.finsky.protos.ResponseMessages.PreFetch.emptyArray();
        playresponsewrapper.commands = null;
        entry.data = MessageNano.toByteArray(playresponsewrapper);
    }

    public final void deliverError(VolleyError volleyerror)
    {
        if (volleyerror instanceof AuthFailureError)
        {
            mApiContext.invalidateAuthToken();
        }
        if (!mResponseDelivered)
        {
            super.deliverError(volleyerror);
            return;
        } else
        {
            PlayCommonLog.d("Not delivering error response for request=[%s], error=[%s] because response already delivered.", new Object[] {
                this, volleyerror
            });
            return;
        }
    }

    public final volatile void deliverResponse(Object obj)
    {
        obj = (com.google.android.finsky.protos.PlayResponse.PlayResponseWrapper)obj;
        try
        {
            obj = NanoProtoHelper.getParsedResponseFromWrapper(((com.google.android.finsky.protos.PlayResponse.PlayResponseWrapper) (obj)).payload, com/google/android/finsky/protos/PlayResponse$PlayPayload, mResponseClass);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            PlayCommonLog.e("Null wrapper parsed for request=[%s]", new Object[] {
                this
            });
            deliverError(new ParseError(((Throwable) (obj))));
            return;
        }
        if (obj != null)
        {
            if (!mResponseDelivered)
            {
                mListener.onResponse(obj);
                mResponseDelivered = true;
                return;
            } else
            {
                PlayCommonLog.d("Not delivering second response for request=[%s]", new Object[] {
                    this
                });
                return;
            }
        } else
        {
            PlayCommonLog.e("Null parsed response for request=[%s]", new Object[] {
                this
            });
            deliverError(new VolleyError());
            return;
        }
    }

    public final String getCacheKey()
    {
        return makeCacheKey(super.getUrl());
    }

    public final Map getHeaders()
        throws AuthFailureError
    {
        Map map = mApiContext.getHeaders();
        Object obj = getRetryPolicy();
        String s = (new StringBuilder("timeoutMs=")).append(((RetryPolicy) (obj)).getCurrentTimeout()).toString();
        int i = ((RetryPolicy) (obj)).getCurrentRetryCount();
        obj = s;
        if (i > 0)
        {
            obj = (new StringBuilder()).append(s).append("; retryAttempt=").append(i).toString();
        }
        map.put("X-DFE-Request-Params", obj);
        return map;
    }

    public final String getUrl()
    {
        byte byte0 = 38;
        Object obj1 = super.getUrl();
        String s = (String)PlayG.ipCountryOverride.get();
        Object obj = obj1;
        char c;
        if (!TextUtils.isEmpty(s))
        {
            obj = (new StringBuilder()).append(((String) (obj1)));
            if (((String) (obj1)).indexOf('?') != -1)
            {
                c = '&';
            } else
            {
                c = '?';
            }
            obj = ((StringBuilder) (obj)).append(c).toString();
            obj = (new StringBuilder()).append(((String) (obj))).append("ipCountryOverride=").append(s).toString();
        }
        s = (String)PlayG.mccMncOverride.get();
        obj1 = obj;
        if (!TextUtils.isEmpty(s))
        {
            obj1 = (new StringBuilder()).append(((String) (obj)));
            if (((String) (obj)).indexOf('?') != -1)
            {
                c = '&';
            } else
            {
                c = '?';
            }
            obj = ((StringBuilder) (obj1)).append(c).toString();
            obj1 = (new StringBuilder()).append(((String) (obj))).append("mccmncOverride=").append(s).toString();
        }
        obj = obj1;
        if (((Boolean)PlayG.skipAllCaches.get()).booleanValue())
        {
            obj = (new StringBuilder()).append(((String) (obj1)));
            if (((String) (obj1)).indexOf('?') != -1)
            {
                c = '&';
            } else
            {
                c = '?';
            }
            obj = ((StringBuilder) (obj)).append(c).toString();
            obj = (new StringBuilder()).append(((String) (obj))).append("skipCache=true").toString();
        }
        obj1 = obj;
        if (((Boolean)PlayG.showStagingData.get()).booleanValue())
        {
            obj1 = (new StringBuilder()).append(((String) (obj)));
            if (((String) (obj)).indexOf('?') != -1)
            {
                c = '&';
            } else
            {
                c = '?';
            }
            obj = ((StringBuilder) (obj1)).append(c).toString();
            obj1 = (new StringBuilder()).append(((String) (obj))).append("showStagingData=true").toString();
        }
        obj = obj1;
        if (((Boolean)PlayG.prexDisabled.get()).booleanValue())
        {
            obj = (new StringBuilder()).append(((String) (obj1)));
            if (((String) (obj1)).indexOf('?') != -1)
            {
                c = byte0;
            } else
            {
                c = '?';
            }
            obj = ((StringBuilder) (obj)).append(c).toString();
            obj = (new StringBuilder()).append(((String) (obj))).append("p13n=false").toString();
        }
        return ((String) (obj));
    }

    protected final VolleyError parseNetworkError(VolleyError volleyerror)
    {
        VolleyError volleyerror1 = volleyerror;
        if (volleyerror instanceof ServerError)
        {
            volleyerror1 = volleyerror;
            if (volleyerror.networkResponse != null)
            {
                com.google.android.finsky.protos.PlayResponse.PlayResponseWrapper playresponsewrapper = parseWrapperAndVerifySignature(volleyerror.networkResponse, false);
                volleyerror1 = volleyerror;
                if (playresponsewrapper != null)
                {
                    volleyerror1 = handleServerCommands(playresponsewrapper).error;
                }
            }
        }
        return volleyerror1;
    }

    public final Response parseNetworkResponse(NetworkResponse networkresponse)
    {
        if (DEBUG)
        {
            boolean flag = false;
            int i = ((flag) ? 1 : 0);
            if (networkresponse.headers != null)
            {
                i = ((flag) ? 1 : 0);
                if (networkresponse.headers.containsKey("X-DFE-Content-Length"))
                {
                    i = Integer.parseInt((String)networkresponse.headers.get("X-DFE-Content-Length")) / 1024;
                }
            }
            PlayCommonLog.v("Parsed response for url=[%s] contentLength=[%d KB]", new Object[] {
                getUrl(), Integer.valueOf(i)
            });
        }
        com.google.android.finsky.protos.PlayResponse.PlayResponseWrapper playresponsewrapper = parseWrapperAndVerifySignature(networkresponse, false);
        Response response;
        if (playresponsewrapper == null)
        {
            response = Response.error(new ParseError(networkresponse));
        } else
        {
            if (PROTO_DEBUG)
            {
                logProtoResponse(playresponsewrapper);
            }
            Response response1 = handleServerCommands(playresponsewrapper);
            response = response1;
            if (response1 == null)
            {
                if (playresponsewrapper.serverMetadata != null)
                {
                    com.google.android.finsky.protos.ResponseMessages.ServerMetadata servermetadata = playresponsewrapper.serverMetadata;
                    if (servermetadata.hasLatencyMillis)
                    {
                        mServerLatencyMs = servermetadata.latencyMillis;
                    }
                }
                networkresponse = parseCacheHeaders(networkresponse);
                if (networkresponse != null)
                {
                    stripForCache(playresponsewrapper, networkresponse);
                }
                networkresponse = Response.success(playresponsewrapper, networkresponse);
                PlayCommonLog.logTiming("DFE response %s", new Object[] {
                    getUrl()
                });
                return networkresponse;
            }
        }
        return response;
    }

    static 
    {
        DEBUG = PlayCommonLog.DEBUG;
    }
}

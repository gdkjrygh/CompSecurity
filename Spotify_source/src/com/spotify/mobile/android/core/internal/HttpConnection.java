// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.core.internal;

import android.text.TextUtils;
import com.spotify.mobile.android.util.logging.Logger;
import dms;
import dmz;
import gry;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class HttpConnection
{

    private static final int kDelete = 8;
    private static final int kErrorClassHttp = 300;
    private static final int kErrorHttpAborted = 311;
    private static final int kErrorHttpBadRange = 305;
    private static final int kErrorHttpBadReply = 304;
    private static final int kErrorHttpBadTransferEncoding = 307;
    private static final int kErrorHttpConnectFail = 302;
    private static final int kErrorHttpConnectTimeout = 301;
    private static final int kErrorHttpFail = 309;
    private static final int kErrorHttpGzipDecode = 310;
    private static final int kErrorHttpInvalidUrl = 303;
    private static final int kErrorHttpTimeout = 308;
    private static final int kErrorHttpTooManyRedirects = 306;
    private static final int kErrorSuccess = 0;
    private static final int kGet = 1;
    private static final int kMethodFlagMask = 15;
    private static final int kPost = 2;
    private static final int kUpdate = 4;
    private String mContentType;
    private int mErrorCode;
    private int mFlags;
    private int mFrom;
    private HttpClient mHttpClient;
    private HttpParams mParams;
    private String mPostData;
    private HttpUriRequest mRequest;
    private Map mRequestHeaders;
    private HttpResponse mResponse;
    protected byte mResultData[];
    private int mTo;
    private String mUserAgent;
    private int nThis;

    public HttpConnection(int i)
    {
        mErrorCode = 0;
        mFlags = i;
        mHttpClient = new gry(((dms)dmz.a(dms)).a);
        mParams = new BasicHttpParams();
    }

    private native void notifyComplete();

    private int readBytes(byte abyte0[])
    {
        if (mResponse == null || mResponse.getEntity() == null)
        {
            return 0;
        }
        InputStream inputstream;
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte1[];
        inputstream = mResponse.getEntity().getContent();
        bytearrayoutputstream = new ByteArrayOutputStream();
        abyte1 = new byte[8192];
_L1:
        int i = inputstream.read(abyte1, 0, 8192);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        bytearrayoutputstream.write(abyte1, 0, i);
          goto _L1
        abyte0;
        Logger.b(abyte0, "", new Object[0]);
        mErrorCode = 309;
        mResponse.setEntity(null);
        return 0;
        System.arraycopy(bytearrayoutputstream.toByteArray(), 0, abyte0, 0, abyte0.length);
        i = bytearrayoutputstream.size();
        mResponse.setEntity(null);
        return i;
        abyte0;
        mResponse.setEntity(null);
        throw abyte0;
    }

    public void abort()
    {
        mRequest.abort();
        mErrorCode = 311;
    }

    public int getErrorCode()
    {
        return mErrorCode;
    }

    public String getLocation()
    {
        if (mRequest != null)
        {
            return mRequest.getURI().toString();
        } else
        {
            return "";
        }
    }

    public int getResourceSize()
    {
        if (mResponse == null || mResponse.getEntity() == null)
        {
            return 0;
        } else
        {
            return (int)mResponse.getEntity().getContentLength();
        }
    }

    public String getResponseHeader(String s)
    {
        if (mResponse != null)
        {
            s = mResponse.getFirstHeader(s);
            if (s != null)
            {
                return s.getValue();
            }
        }
        return "";
    }

    public int getResultCode()
    {
        return mResponse.getStatusLine().getStatusCode();
    }

    public byte[] getResultData()
    {
        int i;
        i = 0;
        if (mResultData != null)
        {
            return mResultData;
        }
        if (mResponse == null || mResponse.getEntity() == null)
        {
            return null;
        }
        InputStream inputstream;
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte1[];
        inputstream = mResponse.getEntity().getContent();
        bytearrayoutputstream = new ByteArrayOutputStream();
        abyte1 = new byte[8192];
_L1:
        int j = inputstream.read(abyte1, 0, 8192);
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        bytearrayoutputstream.write(abyte1, 0, j);
        i += j;
          goto _L1
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        byte abyte0[] = bytearrayoutputstream.toByteArray();
        mResponse.setEntity(null);
        return abyte0;
        mResponse.setEntity(null);
_L3:
        return null;
        Object obj;
        obj;
        mErrorCode = 309;
        mResponse.setEntity(null);
        if (true) goto _L3; else goto _L2
_L2:
        obj;
        mResponse.setEntity(null);
        throw obj;
    }

    public boolean isRequestStarted()
    {
        return mRequest != null;
    }

    public void openUrl(String s)
    {
        if ((mFlags & 0xf) == 0)
        {
            if (mPostData != null)
            {
                mFlags = mFlags | 2;
            } else
            {
                mFlags = mFlags | 1;
            }
        }
        if ((mFlags & 3) == 3)
        {
            if (!TextUtils.isEmpty(mPostData))
            {
                mFlags = mFlags & -2;
            } else
            {
                mFlags = mFlags & -3;
            }
        }
        mFlags & 0xf;
        JVM INSTR tableswitch 1 8: default 112
    //                   1 151
    //                   2 339
    //                   3 112
    //                   4 435
    //                   5 112
    //                   6 112
    //                   7 112
    //                   8 479;
           goto _L1 _L2 _L3 _L1 _L4 _L1 _L1 _L1 _L5
_L1:
        mErrorCode = 309;
        notifyComplete();
        return;
_L2:
        try
        {
            mRequest = new HttpGet(s);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Logger.a(illegalargumentexception, "Error when trying to create HttpGet(%s).", new Object[] {
                s
            });
            mErrorCode = 303;
            notifyComplete();
            return;
        }
_L7:
        if (mFrom != 0 || mTo != 0)
        {
            mRequest.setHeader("Range", String.format("bytes=%d-%d", new Object[] {
                Integer.valueOf(mFrom), Integer.valueOf(mTo)
            }));
        }
        if (mUserAgent != null)
        {
            mRequest.setHeader("User-Agent", mUserAgent);
        }
        if (mRequestHeaders != null)
        {
            java.util.Map.Entry entry;
            for (s = mRequestHeaders.entrySet().iterator(); s.hasNext(); mRequest.setHeader((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)s.next();
            }

        }
        break; /* Loop/switch isn't completed */
_L3:
        HttpPost httppost;
        try
        {
            httppost = new HttpPost(s);
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            Logger.a(illegalargumentexception1, "Error when trying to create HttpPost(%s).", new Object[] {
                s
            });
            mErrorCode = 303;
            notifyComplete();
            return;
        }
        mRequest = httppost;
        try
        {
            httppost.setEntity(new StringEntity(mPostData));
            if (mContentType != null)
            {
                mRequest.setHeader("Content-Type", mContentType);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            mErrorCode = 309;
            notifyComplete();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        try
        {
            mRequest = new HttpGet(s) {

                final HttpConnection this$0;

                public String getMethod()
                {
                    return "UPDATE";
                }

            
            {
                this$0 = HttpConnection.this;
                super(s);
            }
            };
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            Logger.a(illegalargumentexception2, "Error when trying to create UPDATE HttpGet(%s).", new Object[] {
                s
            });
            mErrorCode = 303;
            notifyComplete();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        try
        {
            mRequest = new HttpDelete(s);
        }
        catch (IllegalArgumentException illegalargumentexception3)
        {
            Logger.a(illegalargumentexception3, "Error when trying to create HttpDelete(%s).", new Object[] {
                s
            });
            mErrorCode = 303;
            notifyComplete();
            return;
        }
        if (true) goto _L7; else goto _L6
_L6:
        mRequest.setParams(mParams);
        (new Thread() {

            final HttpConnection this$0;

            public void run()
            {
                try
                {
                    mResponse = mHttpClient.execute(mRequest);
                    mResultData = getResultData();
                }
                catch (Exception exception)
                {
                    Logger.b(exception, "Exception on getting result data", new Object[0]);
                    mErrorCode = 309;
                }
                notifyComplete();
            }

            
            {
                this$0 = HttpConnection.this;
                super();
            }
        }).start();
        return;
    }

    public void setConnectTimeout(int i)
    {
        HttpConnectionParams.setConnectionTimeout(mParams, i);
    }

    public void setContentType(String s)
    {
        mContentType = s;
    }

    public void setPostData(String s)
    {
        mPostData = s;
    }

    public void setRequestHeader(String s, String s1)
    {
        if (mRequestHeaders == null)
        {
            mRequestHeaders = new HashMap();
        }
        mRequestHeaders.put(s, s1);
    }

    public void setRequestRange(int i, int j)
    {
        mFrom = i;
        mTo = j;
    }

    public void setTimeout(int i)
    {
        HttpConnectionParams.setSoTimeout(mParams, i);
    }

    public void setUserAgent(String s)
    {
        mUserAgent = s;
    }


/*
    static HttpResponse access$002(HttpConnection httpconnection, HttpResponse httpresponse)
    {
        httpconnection.mResponse = httpresponse;
        return httpresponse;
    }

*/




/*
    static int access$302(HttpConnection httpconnection, int i)
    {
        httpconnection.mErrorCode = i;
        return i;
    }

*/

}

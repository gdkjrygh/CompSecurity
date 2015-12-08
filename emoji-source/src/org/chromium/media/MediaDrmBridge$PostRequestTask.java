// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.os.AsyncTask;
import android.util.Log;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

// Referenced classes of package org.chromium.media:
//            MediaDrmBridge

private class mDrmRequest extends AsyncTask
{

    private static final String TAG = "PostRequestTask";
    private byte mDrmRequest[];
    private byte mResponseBody[];
    final MediaDrmBridge this$0;

    private byte[] postRequest(String s, byte abyte0[])
    {
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
        s = new HttpPost((new StringBuilder()).append(s).append("&signedRequest=").append(new String(abyte0)).toString());
        Log.d("PostRequestTask", (new StringBuilder()).append("PostRequest:").append(s.getRequestLine()).toString());
        int i;
        try
        {
            s.setHeader("Accept", "*/*");
            s.setHeader("User-Agent", "Widevine CDM v1.0");
            s.setHeader("Content-Type", "application/json");
            s = defaulthttpclient.execute(s);
            i = s.getStatusLine().getStatusCode();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        return EntityUtils.toByteArray(s.getEntity());
        Log.d("PostRequestTask", (new StringBuilder()).append("Server returned HTTP error code ").append(i).toString());
        return null;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient Void doInBackground(String as[])
    {
        mResponseBody = postRequest(as[0], mDrmRequest);
        if (mResponseBody != null)
        {
            Log.d("PostRequestTask", (new StringBuilder()).append("response length=").append(mResponseBody.length).toString());
        }
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        MediaDrmBridge.access$2000(MediaDrmBridge.this, mResponseBody);
    }

    public (byte abyte0[])
    {
        this$0 = MediaDrmBridge.this;
        super();
        mDrmRequest = abyte0;
    }
}

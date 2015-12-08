// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;

// Referenced classes of package com.conviva.utils:
//            Utils

private class <init>
    implements ResponseHandler
{

    final this._cls1 this$1;

    public volatile Object handleResponse(HttpResponse httpresponse)
        throws ClientProtocolException, IOException
    {
        return handleResponse(httpresponse);
    }

    public Void handleResponse(HttpResponse httpresponse)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        int i;
        byte abyte0[];
        try
        {
            i = httpresponse.getStatusLine().getStatusCode();
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            handleResponse(this._cls1.this, httpresponse, null);
            return null;
        }
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        httpresponse = httpresponse.getEntity().getContent();
        bytearrayoutputstream = new ByteArrayOutputStream();
        abyte0 = new byte[1024];
_L1:
        i = httpresponse.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        bytearrayoutputstream.write(abyte0, 0, i);
          goto _L1
        this._mth1(this._cls1.this, null, bytearrayoutputstream.toByteArray());
        return null;
        this._mth1(this._cls1.this, new Exception((new StringBuilder()).append("Status code in HTTP response is not OK: ").append(i).toString()), null);
        return null;
    }

    private ()
    {
        this$1 = this._cls1.this;
        super();
    }

    this._cls1(this._cls1 _pcls1_1)
    {
        this();
    }
}

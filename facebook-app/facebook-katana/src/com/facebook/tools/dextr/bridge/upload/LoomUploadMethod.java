// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.bridge.upload;

import com.facebook.http.entity.mime.apache.FormBodyPart;
import com.facebook.http.protocol.ApiMethod;
import com.facebook.http.protocol.ApiRequest;
import com.facebook.http.protocol.ApiRequestBuilder;
import com.facebook.http.protocol.ApiResponse;
import com.facebook.http.protocol.ApiResponseType;
import com.facebook.http.protocol.ProgressDataStreamBody;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.File;
import java.util.Arrays;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class LoomUploadMethod
    implements ApiMethod
{

    public LoomUploadMethod()
    {
    }

    private ApiRequest a(File file)
    {
        Object obj = new ProgressDataStreamBody(file, "application/x-gzip", file.getName(), new _cls1());
        file = Arrays.asList(new NameValuePair[] {
            new BasicNameValuePair("type", "loom")
        });
        obj = new FormBodyPart("file", ((com.facebook.http.entity.mime.apache.content.ContentBody) (obj)));
        return (new ApiRequestBuilder()).a("loomUpload").d("me/traces").c("POST").a(ApiResponseType.JSON).b(Arrays.asList(new FormBodyPart[] {
            obj
        })).a(file).a(com.facebook.http.protocol.ApiRequest.PostEntityType.MULTI_PART_ENTITY).A();
    }

    private static Boolean a(ApiResponse apiresponse)
    {
        boolean flag1 = false;
        apiresponse.i();
        JsonNode jsonnode = apiresponse.c();
        boolean flag = flag1;
        if (apiresponse.a() == 200)
        {
            flag = flag1;
            if (jsonnode.e("success"))
            {
                flag = flag1;
                if (jsonnode.b("success").a(false))
                {
                    flag = true;
                }
            }
        }
        return Boolean.valueOf(flag);
    }

    public final volatile ApiRequest a(Object obj)
    {
        return a((File)obj);
    }

    public final volatile Object a(Object obj, ApiResponse apiresponse)
    {
        return a(apiresponse);
    }

    private class _cls1
        implements com.facebook.http.protocol.CountingOutputStreamWithProgress.ProgressListener
    {

        final LoomUploadMethod a;

        public final void a(long l)
        {
        }

        _cls1()
        {
            a = LoomUploadMethod.this;
            super();
        }
    }

}

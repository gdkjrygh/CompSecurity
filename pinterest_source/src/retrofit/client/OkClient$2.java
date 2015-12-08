// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.client;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.ResponseBody;
import java.io.InputStream;
import retrofit.mime.TypedInput;

final class val.body
    implements TypedInput
{

    final ResponseBody val$body;

    public final InputStream in()
    {
        return val$body.d();
    }

    public final long length()
    {
        return val$body.b();
    }

    public final String mimeType()
    {
        MediaType mediatype = val$body.a();
        if (mediatype == null)
        {
            return null;
        } else
        {
            return mediatype.toString();
        }
    }

    eBody()
    {
        val$body = responsebody;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.util.List;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

// Referenced classes of package com.squareup.okhttp:
//            RequestBody, MediaType, Headers, MultipartBuilder

final class partBodies extends RequestBody
{

    private final ByteString boundary;
    private long contentLength;
    private final MediaType contentType;
    private final List partBodies;
    private final List partHeaders;

    private long writeOrCountBytes(BufferedSink bufferedsink, boolean flag)
    {
        long l1 = 0L;
        BufferedSink bufferedsink1;
        RequestBody requestbody;
        Object obj;
        int i;
        int j;
        int k;
        int l;
        long l2;
        if (flag)
        {
            bufferedsink = new Buffer();
            bufferedsink1 = bufferedsink;
        } else
        {
            bufferedsink1 = null;
        }
        k = partHeaders.size();
        i = 0;
        if (i >= k) goto _L2; else goto _L1
_L1:
        obj = (Headers)partHeaders.get(i);
        requestbody = (RequestBody)partBodies.get(i);
        bufferedsink.write(MultipartBuilder.access$000());
        bufferedsink.write(boundary);
        bufferedsink.write(MultipartBuilder.access$100());
        if (obj != null)
        {
            j = 0;
            for (l = ((Headers) (obj)).size(); j < l; j++)
            {
                bufferedsink.writeUtf8(((Headers) (obj)).name(j)).write(MultipartBuilder.access$200()).writeUtf8(((Headers) (obj)).value(j)).write(MultipartBuilder.access$100());
            }

        }
        obj = requestbody.contentType();
        if (obj != null)
        {
            bufferedsink.writeUtf8("Content-Type: ").writeUtf8(((MediaType) (obj)).toString()).write(MultipartBuilder.access$100());
        }
        l2 = requestbody.contentLength();
        if (l2 == -1L) goto _L4; else goto _L3
_L3:
        bufferedsink.writeUtf8("Content-Length: ").writeDecimalLong(l2).write(MultipartBuilder.access$100());
_L6:
        bufferedsink.write(MultipartBuilder.access$100());
        if (flag)
        {
            l1 = l2 + l1;
        } else
        {
            ((RequestBody)partBodies.get(i)).writeTo(bufferedsink);
        }
        bufferedsink.write(MultipartBuilder.access$100());
        i++;
        break MISSING_BLOCK_LABEL_31;
_L4:
        if (!flag) goto _L6; else goto _L5
_L5:
        bufferedsink1.clear();
        l2 = -1L;
_L8:
        return l2;
_L2:
        bufferedsink.write(MultipartBuilder.access$000());
        bufferedsink.write(boundary);
        bufferedsink.write(MultipartBuilder.access$000());
        bufferedsink.write(MultipartBuilder.access$100());
        l2 = l1;
        if (flag)
        {
            l2 = bufferedsink1.size();
            bufferedsink1.clear();
            return l1 + l2;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public long contentLength()
    {
        long l = contentLength;
        if (l != -1L)
        {
            return l;
        } else
        {
            long l1 = writeOrCountBytes(null, true);
            contentLength = l1;
            return l1;
        }
    }

    public MediaType contentType()
    {
        return contentType;
    }

    public void writeTo(BufferedSink bufferedsink)
    {
        writeOrCountBytes(bufferedsink, false);
    }

    public (MediaType mediatype, ByteString bytestring, List list, List list1)
    {
        contentLength = -1L;
        if (mediatype == null)
        {
            throw new NullPointerException("type == null");
        } else
        {
            boundary = bytestring;
            contentType = MediaType.parse((new StringBuilder()).append(mediatype).append("; boundary=").append(bytestring.utf8()).toString());
            partHeaders = Util.immutableList(list);
            partBodies = Util.immutableList(list1);
            return;
        }
    }
}

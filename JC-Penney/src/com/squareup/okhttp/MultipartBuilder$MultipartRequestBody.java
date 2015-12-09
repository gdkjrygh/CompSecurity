// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import c.f;
import c.i;
import c.k;
import com.squareup.okhttp.internal.Util;
import java.util.List;

// Referenced classes of package com.squareup.okhttp:
//            RequestBody, MediaType, Headers, MultipartBuilder

final class partBodies extends RequestBody
{

    private final k boundary;
    private long contentLength;
    private final MediaType contentType;
    private final List partBodies;
    private final List partHeaders;

    private long writeOrCountBytes(i j, boolean flag)
    {
        long l2 = 0L;
        i l;
        RequestBody requestbody;
        Object obj;
        int i1;
        int j1;
        int k1;
        int l1;
        long l3;
        if (flag)
        {
            j = new f();
            l = j;
        } else
        {
            l = null;
        }
        k1 = partHeaders.size();
        i1 = 0;
        if (i1 >= k1) goto _L2; else goto _L1
_L1:
        obj = (Headers)partHeaders.get(i1);
        requestbody = (RequestBody)partBodies.get(i1);
        j.c(MultipartBuilder.access$000());
        j.b(boundary);
        j.c(MultipartBuilder.access$100());
        if (obj != null)
        {
            j1 = 0;
            for (l1 = ((Headers) (obj)).size(); j1 < l1; j1++)
            {
                j.b(((Headers) (obj)).name(j1)).c(MultipartBuilder.access$200()).b(((Headers) (obj)).value(j1)).c(MultipartBuilder.access$100());
            }

        }
        obj = requestbody.contentType();
        if (obj != null)
        {
            j.b("Content-Type: ").b(((MediaType) (obj)).toString()).c(MultipartBuilder.access$100());
        }
        l3 = requestbody.contentLength();
        if (l3 == -1L) goto _L4; else goto _L3
_L3:
        j.b("Content-Length: ").k(l3).c(MultipartBuilder.access$100());
_L6:
        j.c(MultipartBuilder.access$100());
        if (flag)
        {
            l2 = l3 + l2;
        } else
        {
            ((RequestBody)partBodies.get(i1)).writeTo(j);
        }
        j.c(MultipartBuilder.access$100());
        i1++;
        break MISSING_BLOCK_LABEL_31;
_L4:
        if (!flag) goto _L6; else goto _L5
_L5:
        l.t();
        l3 = -1L;
_L8:
        return l3;
_L2:
        j.c(MultipartBuilder.access$000());
        j.b(boundary);
        j.c(MultipartBuilder.access$000());
        j.c(MultipartBuilder.access$100());
        l3 = l2;
        if (flag)
        {
            l3 = l.a();
            l.t();
            return l2 + l3;
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

    public void writeTo(i j)
    {
        writeOrCountBytes(j, false);
    }

    public (MediaType mediatype, k k1, List list, List list1)
    {
        contentLength = -1L;
        if (mediatype == null)
        {
            throw new NullPointerException("type == null");
        } else
        {
            boundary = k1;
            contentType = MediaType.parse((new StringBuilder()).append(mediatype).append("; boundary=").append(k1.a()).toString());
            partHeaders = Util.immutableList(list);
            partBodies = Util.immutableList(list1);
            return;
        }
    }
}

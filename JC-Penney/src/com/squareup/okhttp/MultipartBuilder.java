// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import c.k;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.squareup.okhttp:
//            MediaType, RequestBody, Headers

public final class MultipartBuilder
{

    public static final MediaType ALTERNATIVE = MediaType.parse("multipart/alternative");
    private static final byte COLONSPACE[] = {
        58, 32
    };
    private static final byte CRLF[] = {
        13, 10
    };
    private static final byte DASHDASH[] = {
        45, 45
    };
    public static final MediaType DIGEST = MediaType.parse("multipart/digest");
    public static final MediaType FORM = MediaType.parse("multipart/form-data");
    public static final MediaType MIXED = MediaType.parse("multipart/mixed");
    public static final MediaType PARALLEL = MediaType.parse("multipart/parallel");
    private final k boundary;
    private final List partBodies;
    private final List partHeaders;
    private MediaType type;

    public MultipartBuilder()
    {
        this(UUID.randomUUID().toString());
    }

    public MultipartBuilder(String s)
    {
        type = MIXED;
        partHeaders = new ArrayList();
        partBodies = new ArrayList();
        boundary = k.a(s);
    }

    private static StringBuilder appendQuotedString(StringBuilder stringbuilder, String s)
    {
        int i;
        int j;
        stringbuilder.append('"');
        i = 0;
        j = s.length();
_L6:
        char c;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        c = s.charAt(i);
        c;
        JVM INSTR lookupswitch 3: default 64
    //                   10: 77
    //                   13: 87
    //                   34: 97;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_97;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        stringbuilder.append(c);
_L7:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        stringbuilder.append("%0A");
          goto _L7
_L3:
        stringbuilder.append("%0D");
          goto _L7
        stringbuilder.append("%22");
          goto _L7
        stringbuilder.append('"');
        return stringbuilder;
    }

    public MultipartBuilder addFormDataPart(String s, String s1)
    {
        return addFormDataPart(s, null, RequestBody.create(null, s1));
    }

    public MultipartBuilder addFormDataPart(String s, String s1, RequestBody requestbody)
    {
        if (s == null)
        {
            throw new NullPointerException("name == null");
        }
        StringBuilder stringbuilder = new StringBuilder("form-data; name=");
        appendQuotedString(stringbuilder, s);
        if (s1 != null)
        {
            stringbuilder.append("; filename=");
            appendQuotedString(stringbuilder, s1);
        }
        return addPart(Headers.of(new String[] {
            "Content-Disposition", stringbuilder.toString()
        }), requestbody);
    }

    public MultipartBuilder addPart(Headers headers, RequestBody requestbody)
    {
        if (requestbody == null)
        {
            throw new NullPointerException("body == null");
        }
        if (headers != null && headers.get("Content-Type") != null)
        {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (headers != null && headers.get("Content-Length") != null)
        {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        } else
        {
            partHeaders.add(headers);
            partBodies.add(requestbody);
            return this;
        }
    }

    public MultipartBuilder addPart(RequestBody requestbody)
    {
        return addPart(null, requestbody);
    }

    public RequestBody build()
    {
        if (partHeaders.isEmpty())
        {
            throw new IllegalStateException("Multipart body must have at least one part.");
        } else
        {
            return new MultipartRequestBody(type, boundary, partHeaders, partBodies);
        }
    }

    public MultipartBuilder type(MediaType mediatype)
    {
        if (mediatype == null)
        {
            throw new NullPointerException("type == null");
        }
        if (!mediatype.type().equals("multipart"))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("multipart != ").append(mediatype).toString());
        } else
        {
            type = mediatype;
            return this;
        }
    }





    private class MultipartRequestBody extends RequestBody
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
            j.c(MultipartBuilder.DASHDASH);
            j.b(boundary);
            j.c(MultipartBuilder.CRLF);
            if (obj != null)
            {
                j1 = 0;
                for (l1 = ((Headers) (obj)).size(); j1 < l1; j1++)
                {
                    j.b(((Headers) (obj)).name(j1)).c(MultipartBuilder.COLONSPACE).b(((Headers) (obj)).value(j1)).c(MultipartBuilder.CRLF);
                }

            }
            obj = requestbody.contentType();
            if (obj != null)
            {
                j.b("Content-Type: ").b(((MediaType) (obj)).toString()).c(MultipartBuilder.CRLF);
            }
            l3 = requestbody.contentLength();
            if (l3 == -1L) goto _L4; else goto _L3
_L3:
            j.b("Content-Length: ").k(l3).c(MultipartBuilder.CRLF);
_L6:
            j.c(MultipartBuilder.CRLF);
            if (flag)
            {
                l2 = l3 + l2;
            } else
            {
                ((RequestBody)partBodies.get(i1)).writeTo(j);
            }
            j.c(MultipartBuilder.CRLF);
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
            j.c(MultipartBuilder.DASHDASH);
            j.b(boundary);
            j.c(MultipartBuilder.DASHDASH);
            j.c(MultipartBuilder.CRLF);
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

        public MultipartRequestBody(MediaType mediatype, k k1, List list, List list1)
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

}

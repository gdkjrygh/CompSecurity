// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package org.apache.http.entity.mime:
//            AbstractMultipartForm, FormBodyPart, Header, MinimalField

class HttpStrictMultipart extends AbstractMultipartForm
{

    private final List parts;

    public HttpStrictMultipart(String s, Charset charset, String s1, List list)
    {
        super(s, charset, s1);
        parts = list;
    }

    protected void formatMultipartHeader(FormBodyPart formbodypart, OutputStream outputstream)
    {
        for (formbodypart = formbodypart.getHeader().iterator(); formbodypart.hasNext(); writeField((MinimalField)formbodypart.next(), outputstream)) { }
    }

    public List getBodyParts()
    {
        return parts;
    }
}

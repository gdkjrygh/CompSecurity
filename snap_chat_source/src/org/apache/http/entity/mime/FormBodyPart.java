// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.content.AbstractContentBody;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.util.Args;

// Referenced classes of package org.apache.http.entity.mime:
//            Header, MinimalField

public class FormBodyPart
{

    private final ContentBody body;
    private final Header header = new Header();
    private final String name;

    public FormBodyPart(String s, ContentBody contentbody)
    {
        Args.notNull(s, "Name");
        Args.notNull(contentbody, "Body");
        name = s;
        body = contentbody;
        generateContentDisp(contentbody);
        generateContentType(contentbody);
        generateTransferEncoding(contentbody);
    }

    public void addField(String s, String s1)
    {
        Args.notNull(s, "Field name");
        header.addField(new MinimalField(s, s1));
    }

    protected void generateContentDisp(ContentBody contentbody)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("form-data; name=\"");
        stringbuilder.append(getName());
        stringbuilder.append("\"");
        if (contentbody.getFilename() != null)
        {
            stringbuilder.append("; filename=\"");
            stringbuilder.append(contentbody.getFilename());
            stringbuilder.append("\"");
        }
        addField("Content-Disposition", stringbuilder.toString());
    }

    protected void generateContentType(ContentBody contentbody)
    {
        Object obj;
        if (contentbody instanceof AbstractContentBody)
        {
            obj = ((AbstractContentBody)contentbody).getContentType();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            addField("Content-Type", ((ContentType) (obj)).toString());
            return;
        }
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append(contentbody.getMimeType());
        if (contentbody.getCharset() != null)
        {
            ((StringBuilder) (obj)).append("; charset=");
            ((StringBuilder) (obj)).append(contentbody.getCharset());
        }
        addField("Content-Type", ((StringBuilder) (obj)).toString());
    }

    protected void generateTransferEncoding(ContentBody contentbody)
    {
        addField("Content-Transfer-Encoding", contentbody.getTransferEncoding());
    }

    public ContentBody getBody()
    {
        return body;
    }

    public Header getHeader()
    {
        return header;
    }

    public String getName()
    {
        return name;
    }
}

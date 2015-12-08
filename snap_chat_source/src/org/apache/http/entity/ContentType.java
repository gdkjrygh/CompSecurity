// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.TextUtils;

public final class ContentType
    implements Serializable
{

    public static final ContentType APPLICATION_ATOM_XML;
    public static final ContentType APPLICATION_FORM_URLENCODED;
    public static final ContentType APPLICATION_JSON;
    public static final ContentType APPLICATION_OCTET_STREAM;
    public static final ContentType APPLICATION_SVG_XML;
    public static final ContentType APPLICATION_XHTML_XML;
    public static final ContentType APPLICATION_XML;
    public static final ContentType DEFAULT_BINARY;
    public static final ContentType DEFAULT_TEXT;
    public static final ContentType MULTIPART_FORM_DATA;
    public static final ContentType TEXT_HTML;
    public static final ContentType TEXT_PLAIN;
    public static final ContentType TEXT_XML;
    public static final ContentType WILDCARD = create("*/*", ((Charset) (null)));
    private final Charset charset;
    private final String mimeType;
    private final NameValuePair params[];

    ContentType(String s, Charset charset1)
    {
        mimeType = s;
        charset = charset1;
        params = null;
    }

    ContentType(String s, NameValuePair anamevaluepair[])
    {
        mimeType = s;
        params = anamevaluepair;
        s = getParameter("charset");
        if (!TextUtils.isBlank(s))
        {
            s = Charset.forName(s);
        } else
        {
            s = null;
        }
        charset = s;
    }

    public static ContentType create(String s, String s1)
    {
        if (!TextUtils.isBlank(s1))
        {
            s1 = Charset.forName(s1);
        } else
        {
            s1 = null;
        }
        return create(s, ((Charset) (s1)));
    }

    public static ContentType create(String s, Charset charset1)
    {
        s = ((String)Args.notBlank(s, "MIME type")).toLowerCase(Locale.US);
        Args.check(valid(s), "MIME type may not contain reserved characters");
        return new ContentType(s, charset1);
    }

    private static ContentType create(HeaderElement headerelement)
    {
        String s = headerelement.getName();
        headerelement = headerelement.getParameters();
        if (headerelement == null || headerelement.length <= 0)
        {
            headerelement = null;
        }
        return new ContentType(s, headerelement);
    }

    public static ContentType get(HttpEntity httpentity)
    {
        if (httpentity != null)
        {
            if ((httpentity = httpentity.getContentType()) != null && (httpentity = httpentity.getElements()).length > 0)
            {
                return create(httpentity[0]);
            }
        }
        return null;
    }

    private static boolean valid(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (c == '"' || c == ',' || c == ';')
            {
                return false;
            }
        }

        return true;
    }

    public final Charset getCharset()
    {
        return charset;
    }

    public final String getMimeType()
    {
        return mimeType;
    }

    public final String getParameter(String s)
    {
        Args.notEmpty(s, "Parameter name");
        if (params != null)
        {
            NameValuePair anamevaluepair[] = params;
            int j = anamevaluepair.length;
            int i = 0;
            while (i < j) 
            {
                NameValuePair namevaluepair = anamevaluepair[i];
                if (namevaluepair.getName().equalsIgnoreCase(s))
                {
                    return namevaluepair.getValue();
                }
                i++;
            }
        }
        return null;
    }

    public final String toString()
    {
        CharArrayBuffer chararraybuffer;
        chararraybuffer = new CharArrayBuffer(64);
        chararraybuffer.append(mimeType);
        if (params == null) goto _L2; else goto _L1
_L1:
        chararraybuffer.append("; ");
        BasicHeaderValueFormatter.INSTANCE.formatParameters(chararraybuffer, params, false);
_L4:
        return chararraybuffer.toString();
_L2:
        if (charset != null)
        {
            chararraybuffer.append("; charset=");
            chararraybuffer.append(charset.name());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        APPLICATION_ATOM_XML = create("application/atom+xml", Consts.ISO_8859_1);
        APPLICATION_FORM_URLENCODED = create("application/x-www-form-urlencoded", Consts.ISO_8859_1);
        APPLICATION_JSON = create("application/json", Consts.UTF_8);
        APPLICATION_OCTET_STREAM = create("application/octet-stream", ((Charset) (null)));
        APPLICATION_SVG_XML = create("application/svg+xml", Consts.ISO_8859_1);
        APPLICATION_XHTML_XML = create("application/xhtml+xml", Consts.ISO_8859_1);
        APPLICATION_XML = create("application/xml", Consts.ISO_8859_1);
        MULTIPART_FORM_DATA = create("multipart/form-data", Consts.ISO_8859_1);
        TEXT_HTML = create("text/html", Consts.ISO_8859_1);
        TEXT_PLAIN = create("text/plain", Consts.ISO_8859_1);
        TEXT_XML = create("text/xml", Consts.ISO_8859_1);
        DEFAULT_TEXT = TEXT_PLAIN;
        DEFAULT_BINARY = APPLICATION_OCTET_STREAM;
    }
}

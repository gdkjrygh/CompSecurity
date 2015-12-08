// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.message:
//            LineFormatter

public class BasicLineFormatter
    implements LineFormatter
{

    public static final BasicLineFormatter DEFAULT = new BasicLineFormatter();

    public BasicLineFormatter()
    {
    }

    public static final String formatHeader(Header header, LineFormatter lineformatter)
    {
        Object obj = lineformatter;
        if (lineformatter == null)
        {
            obj = DEFAULT;
        }
        return ((LineFormatter) (obj)).formatHeader(null, header).toString();
    }

    public static final String formatProtocolVersion(ProtocolVersion protocolversion, LineFormatter lineformatter)
    {
        Object obj = lineformatter;
        if (lineformatter == null)
        {
            obj = DEFAULT;
        }
        return ((LineFormatter) (obj)).appendProtocolVersion(null, protocolversion).toString();
    }

    public static final String formatRequestLine(RequestLine requestline, LineFormatter lineformatter)
    {
        Object obj = lineformatter;
        if (lineformatter == null)
        {
            obj = DEFAULT;
        }
        return ((LineFormatter) (obj)).formatRequestLine(null, requestline).toString();
    }

    public static final String formatStatusLine(StatusLine statusline, LineFormatter lineformatter)
    {
        Object obj = lineformatter;
        if (lineformatter == null)
        {
            obj = DEFAULT;
        }
        return ((LineFormatter) (obj)).formatStatusLine(null, statusline).toString();
    }

    public CharArrayBuffer appendProtocolVersion(CharArrayBuffer chararraybuffer, ProtocolVersion protocolversion)
    {
        if (protocolversion == null)
        {
            throw new IllegalArgumentException("Protocol version may not be null");
        }
        int i = estimateProtocolVersionLen(protocolversion);
        if (chararraybuffer == null)
        {
            chararraybuffer = new CharArrayBuffer(i);
        } else
        {
            chararraybuffer.ensureCapacity(i);
        }
        chararraybuffer.append(protocolversion.getProtocol());
        chararraybuffer.append('/');
        chararraybuffer.append(Integer.toString(protocolversion.getMajor()));
        chararraybuffer.append('.');
        chararraybuffer.append(Integer.toString(protocolversion.getMinor()));
        return chararraybuffer;
    }

    protected void doFormatHeader(CharArrayBuffer chararraybuffer, Header header)
    {
        String s = header.getName();
        header = header.getValue();
        int j = s.length() + 2;
        int i = j;
        if (header != null)
        {
            i = j + header.length();
        }
        chararraybuffer.ensureCapacity(i);
        chararraybuffer.append(s);
        chararraybuffer.append(": ");
        if (header != null)
        {
            chararraybuffer.append(header);
        }
    }

    protected void doFormatRequestLine(CharArrayBuffer chararraybuffer, RequestLine requestline)
    {
        String s = requestline.getMethod();
        String s1 = requestline.getUri();
        chararraybuffer.ensureCapacity(s.length() + 1 + s1.length() + 1 + estimateProtocolVersionLen(requestline.getProtocolVersion()));
        chararraybuffer.append(s);
        chararraybuffer.append(' ');
        chararraybuffer.append(s1);
        chararraybuffer.append(' ');
        appendProtocolVersion(chararraybuffer, requestline.getProtocolVersion());
    }

    protected void doFormatStatusLine(CharArrayBuffer chararraybuffer, StatusLine statusline)
    {
        int j = estimateProtocolVersionLen(statusline.getProtocolVersion()) + 1 + 3 + 1;
        String s = statusline.getReasonPhrase();
        int i = j;
        if (s != null)
        {
            i = j + s.length();
        }
        chararraybuffer.ensureCapacity(i);
        appendProtocolVersion(chararraybuffer, statusline.getProtocolVersion());
        chararraybuffer.append(' ');
        chararraybuffer.append(Integer.toString(statusline.getStatusCode()));
        chararraybuffer.append(' ');
        if (s != null)
        {
            chararraybuffer.append(s);
        }
    }

    protected int estimateProtocolVersionLen(ProtocolVersion protocolversion)
    {
        return protocolversion.getProtocol().length() + 4;
    }

    public CharArrayBuffer formatHeader(CharArrayBuffer chararraybuffer, Header header)
    {
        if (header == null)
        {
            throw new IllegalArgumentException("Header may not be null");
        }
        if (header instanceof FormattedHeader)
        {
            return ((FormattedHeader)header).getBuffer();
        } else
        {
            chararraybuffer = initBuffer(chararraybuffer);
            doFormatHeader(chararraybuffer, header);
            return chararraybuffer;
        }
    }

    public CharArrayBuffer formatRequestLine(CharArrayBuffer chararraybuffer, RequestLine requestline)
    {
        if (requestline == null)
        {
            throw new IllegalArgumentException("Request line may not be null");
        } else
        {
            chararraybuffer = initBuffer(chararraybuffer);
            doFormatRequestLine(chararraybuffer, requestline);
            return chararraybuffer;
        }
    }

    public CharArrayBuffer formatStatusLine(CharArrayBuffer chararraybuffer, StatusLine statusline)
    {
        if (statusline == null)
        {
            throw new IllegalArgumentException("Status line may not be null");
        } else
        {
            chararraybuffer = initBuffer(chararraybuffer);
            doFormatStatusLine(chararraybuffer, statusline);
            return chararraybuffer;
        }
    }

    protected CharArrayBuffer initBuffer(CharArrayBuffer chararraybuffer)
    {
        if (chararraybuffer != null)
        {
            chararraybuffer.clear();
            return chararraybuffer;
        } else
        {
            return new CharArrayBuffer(64);
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.impl.io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.LineParser;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

public abstract class AbstractMessageParser
    implements HttpMessageParser
{

    private static final int HEADERS = 1;
    private static final int HEAD_LINE = 0;
    private final List headerLines = new ArrayList();
    protected final LineParser lineParser;
    private final int maxHeaderCount;
    private final int maxLineLen;
    private HttpMessage message;
    private final SessionInputBuffer sessionBuffer;
    private int state;

    public AbstractMessageParser(SessionInputBuffer sessioninputbuffer, LineParser lineparser, HttpParams httpparams)
    {
        if (sessioninputbuffer == null)
        {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        sessionBuffer = sessioninputbuffer;
        maxHeaderCount = httpparams.getIntParameter("http.connection.max-header-count", -1);
        maxLineLen = httpparams.getIntParameter("http.connection.max-line-length", -1);
        if (lineparser == null)
        {
            lineparser = BasicLineParser.DEFAULT;
        }
        lineParser = lineparser;
        state = 0;
    }

    public static Header[] parseHeaders(SessionInputBuffer sessioninputbuffer, int i, int j, LineParser lineparser)
    {
        Object obj = lineparser;
        if (lineparser == null)
        {
            obj = BasicLineParser.DEFAULT;
        }
        return parseHeaders(sessioninputbuffer, i, j, ((LineParser) (obj)), ((List) (new ArrayList())));
    }

    public static Header[] parseHeaders(SessionInputBuffer sessioninputbuffer, int i, int j, LineParser lineparser, List list)
    {
        boolean flag = false;
        if (sessioninputbuffer == null)
        {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        if (lineparser == null)
        {
            throw new IllegalArgumentException("Line parser may not be null");
        }
        if (list == null)
        {
            throw new IllegalArgumentException("Header line list may not be null");
        }
        CharArrayBuffer chararraybuffer2 = null;
        CharArrayBuffer chararraybuffer = null;
        do
        {
            if (chararraybuffer == null)
            {
                chararraybuffer = new CharArrayBuffer(64);
            } else
            {
                chararraybuffer.clear();
            }
            if (sessioninputbuffer.readLine(chararraybuffer) != -1 && chararraybuffer.length() > 0)
            {
                if ((chararraybuffer.charAt(0) == ' ' || chararraybuffer.charAt(0) == '\t') && chararraybuffer2 != null)
                {
                    int k = 0;
                    do
                    {
                        if (k >= chararraybuffer.length())
                        {
                            break;
                        }
                        char c = chararraybuffer.charAt(k);
                        if (c != ' ' && c != '\t')
                        {
                            break;
                        }
                        k++;
                    } while (true);
                    if (j > 0 && (chararraybuffer2.length() + 1 + chararraybuffer.length()) - k > j)
                    {
                        throw new IOException("Maximum line length limit exceeded");
                    }
                    chararraybuffer2.append(' ');
                    chararraybuffer2.append(chararraybuffer, k, chararraybuffer.length() - k);
                } else
                {
                    list.add(chararraybuffer);
                    Object obj = null;
                    chararraybuffer2 = chararraybuffer;
                    chararraybuffer = obj;
                }
                if (i > 0 && list.size() >= i)
                {
                    throw new IOException("Maximum header count exceeded");
                }
            } else
            {
                sessioninputbuffer = new Header[list.size()];
                i = ((flag) ? 1 : 0);
                while (i < list.size()) 
                {
                    CharArrayBuffer chararraybuffer1 = (CharArrayBuffer)list.get(i);
                    try
                    {
                        sessioninputbuffer[i] = lineparser.parseHeader(chararraybuffer1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (SessionInputBuffer sessioninputbuffer)
                    {
                        throw new ProtocolException(sessioninputbuffer.getMessage());
                    }
                    i++;
                }
                return sessioninputbuffer;
            }
        } while (true);
    }

    public HttpMessage parse()
    {
        switch (state)
        {
        default:
            throw new IllegalStateException("Inconsistent parser state");

        case 0: // '\0'
            Header aheader[];
            HttpMessage httpmessage;
            try
            {
                message = parseHead(sessionBuffer);
            }
            catch (ParseException parseexception)
            {
                throw new ProtocolException(parseexception.getMessage(), parseexception);
            }
            state = 1;
            // fall through

        case 1: // '\001'
            aheader = parseHeaders(sessionBuffer, maxHeaderCount, maxLineLen, lineParser, headerLines);
            message.setHeaders(aheader);
            httpmessage = message;
            message = null;
            headerLines.clear();
            state = 0;
            return httpmessage;
        }
    }

    protected abstract HttpMessage parseHead(SessionInputBuffer sessioninputbuffer);
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.HeaderIterator;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.message:
//            BasicHeaderValueParser, ParserCursor, HeaderValueParser

public class BasicHeaderElementIterator
    implements HeaderElementIterator
{

    private CharArrayBuffer buffer;
    private HeaderElement currentElement;
    private ParserCursor cursor;
    private final HeaderIterator headerIt;
    private final HeaderValueParser parser;

    public BasicHeaderElementIterator(HeaderIterator headeriterator)
    {
        this(headeriterator, ((HeaderValueParser) (BasicHeaderValueParser.DEFAULT)));
    }

    public BasicHeaderElementIterator(HeaderIterator headeriterator, HeaderValueParser headervalueparser)
    {
        currentElement = null;
        buffer = null;
        cursor = null;
        if (headeriterator == null)
        {
            throw new IllegalArgumentException("Header iterator may not be null");
        }
        if (headervalueparser == null)
        {
            throw new IllegalArgumentException("Parser may not be null");
        } else
        {
            headerIt = headeriterator;
            parser = headervalueparser;
            return;
        }
    }

    private void bufferHeaderValue()
    {
        cursor = null;
        buffer = null;
        do
        {
            Object obj;
label0:
            {
                if (headerIt.hasNext())
                {
                    obj = headerIt.nextHeader();
                    if (!(obj instanceof FormattedHeader))
                    {
                        break label0;
                    }
                    buffer = ((FormattedHeader)obj).getBuffer();
                    cursor = new ParserCursor(0, buffer.length());
                    cursor.updatePos(((FormattedHeader)obj).getValuePos());
                }
                return;
            }
            obj = ((Header) (obj)).getValue();
            if (obj != null)
            {
                buffer = new CharArrayBuffer(((String) (obj)).length());
                buffer.append(((String) (obj)));
                cursor = new ParserCursor(0, buffer.length());
                return;
            }
        } while (true);
    }

    private void parseNextElement()
    {
        do
        {
label0:
            {
                if (headerIt.hasNext() || cursor != null)
                {
                    if (cursor == null || cursor.atEnd())
                    {
                        bufferHeaderValue();
                    }
                    if (cursor == null)
                    {
                        continue;
                    }
                    HeaderElement headerelement;
                    do
                    {
                        if (cursor.atEnd())
                        {
                            break label0;
                        }
                        headerelement = parser.parseHeaderElement(buffer, cursor);
                    } while (headerelement.getName().length() == 0 && headerelement.getValue() == null);
                    currentElement = headerelement;
                }
                return;
            }
            if (cursor.atEnd())
            {
                cursor = null;
                buffer = null;
            }
        } while (true);
    }

    public boolean hasNext()
    {
        if (currentElement == null)
        {
            parseNextElement();
        }
        return currentElement != null;
    }

    public final Object next()
    {
        return nextElement();
    }

    public HeaderElement nextElement()
    {
        if (currentElement == null)
        {
            parseNextElement();
        }
        if (currentElement == null)
        {
            throw new NoSuchElementException("No more header elements available");
        } else
        {
            HeaderElement headerelement = currentElement;
            currentElement = null;
            return headerelement;
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Remove not supported");
    }
}

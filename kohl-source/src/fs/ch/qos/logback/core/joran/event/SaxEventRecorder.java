// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.event;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.joran.spi.JoranException;
import fs.ch.qos.logback.core.joran.spi.Pattern;
import fs.ch.qos.logback.core.spi.ContextAware;
import fs.ch.qos.logback.core.spi.ContextAwareImpl;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.sax2.Driver;

// Referenced classes of package fs.ch.qos.logback.core.joran.event:
//            BodyEvent, EndEvent, SaxEvent, StartEvent

public class SaxEventRecorder extends DefaultHandler
    implements ContextAware
{

    private final ContextAwareImpl cai = new ContextAwareImpl(this);
    private Pattern globalPattern;
    private Locator locator;
    private List saxEventList;

    public SaxEventRecorder()
    {
        saxEventList = new ArrayList();
        globalPattern = new Pattern();
    }

    private Driver buildPullParser()
        throws JoranException
    {
        Driver driver = new Driver();
        Exception exception;
        try
        {
            driver.setFeature("http://xml.org/sax/features/validation", false);
        }
        catch (SAXNotSupportedException saxnotsupportedexception) { }
        driver.setFeature("http://xml.org/sax/features/namespaces", true);
        return driver;
        exception;
        addError("Parser configuration error occurred", exception);
        throw new JoranException("Parser configuration error occurred", exception);
    }

    private void handleError(String s, Throwable throwable)
        throws JoranException
    {
        addError(s, throwable);
        throw new JoranException(s, throwable);
    }

    public void addError(String s)
    {
        cai.addError(s);
    }

    public void addError(String s, Throwable throwable)
    {
        cai.addError(s, throwable);
    }

    public void addWarn(String s, Throwable throwable)
    {
        cai.addWarn(s, throwable);
    }

    public void characters(char ac[], int i, int j)
    {
        ac = new String(ac, i, j);
        SaxEvent saxevent = getLastEvent();
        if (saxevent instanceof BodyEvent)
        {
            ((BodyEvent)saxevent).append(ac);
        } else
        if (!isSpaceOnly(ac))
        {
            saxEventList.add(new BodyEvent(ac, getLocator()));
            return;
        }
    }

    public void endElement(String s, String s1, String s2)
    {
        String s3;
label0:
        {
            if (s2 != null)
            {
                s3 = s2;
                if (s2.length() != 0)
                {
                    break label0;
                }
            }
            s3 = s1;
        }
        saxEventList.add(new EndEvent(s, s1, s3, getLocator()));
        globalPattern.pop();
    }

    public void error(SAXParseException saxparseexception)
        throws SAXException
    {
        addError((new StringBuilder()).append("XML_PARSING - Parsing error on line ").append(saxparseexception.getLineNumber()).append(" and column ").append(saxparseexception.getColumnNumber()).toString(), saxparseexception);
    }

    public void fatalError(SAXParseException saxparseexception)
        throws SAXException
    {
        addError((new StringBuilder()).append("XML_PARSING - Parsing fatal error on line ").append(saxparseexception.getLineNumber()).append(" and column ").append(saxparseexception.getColumnNumber()).toString(), saxparseexception);
    }

    SaxEvent getLastEvent()
    {
        if (saxEventList.isEmpty())
        {
            return null;
        } else
        {
            int i = saxEventList.size();
            return (SaxEvent)saxEventList.get(i - 1);
        }
    }

    public Locator getLocator()
    {
        return locator;
    }

    public List getSaxEventList()
    {
        return saxEventList;
    }

    String getTagName(String s, String s1)
    {
        String s2;
label0:
        {
            if (s != null)
            {
                s2 = s;
                if (s.length() >= 1)
                {
                    break label0;
                }
            }
            s2 = s1;
        }
        return s2;
    }

    boolean isSpaceOnly(String s)
    {
        return s.trim().length() == 0;
    }

    public List recordEvents(InputSource inputsource)
        throws JoranException
    {
        Driver driver = buildPullParser();
        driver.setContentHandler(this);
        driver.setErrorHandler(this);
        driver.parse(inputsource);
        inputsource = saxEventList;
        return inputsource;
        inputsource;
        handleError(inputsource.getLocalizedMessage(), new SAXParseException(inputsource.getLocalizedMessage(), locator, inputsource));
_L2:
        throw new IllegalStateException("This point can never be reached");
        inputsource;
        handleError("I/O error occurred while parsing xml file", inputsource);
        continue; /* Loop/switch isn't completed */
        inputsource;
        throw new JoranException("Problem parsing XML document. See previously reported errors.", inputsource);
        inputsource;
        handleError("Unexpected exception while parsing XML document.", inputsource);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void recordEvents(InputStream inputstream)
        throws JoranException
    {
        recordEvents(new InputSource(inputstream));
    }

    public void setContext(Context context)
    {
        cai.setContext(context);
    }

    public void setDocumentLocator(Locator locator1)
    {
        locator = locator1;
    }

    public void startDocument()
    {
    }

    public void startElement(String s, String s1, String s2, Attributes attributes)
    {
        String s3;
        if (s2 == null || s2.length() == 0)
        {
            s3 = s1;
        } else
        {
            s3 = s2;
        }
        s2 = getTagName(s1, s2);
        globalPattern.push(s2);
        s2 = (Pattern)globalPattern.clone();
        saxEventList.add(new StartEvent(s2, s, s1, s3, attributes, getLocator()));
    }

    public void warning(SAXParseException saxparseexception)
        throws SAXException
    {
        addWarn((new StringBuilder()).append("XML_PARSING - Parsing warning on line ").append(saxparseexception.getLineNumber()).append(" and column ").append(saxparseexception.getColumnNumber()).toString(), saxparseexception);
    }
}

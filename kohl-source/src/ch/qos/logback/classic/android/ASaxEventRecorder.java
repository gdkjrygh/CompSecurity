// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.android;

import brut.androlib.res.decoder.AXmlResourceParser;
import fs.ch.qos.logback.core.joran.event.SaxEventRecorder;
import fs.ch.qos.logback.core.joran.spi.JoranException;
import java.util.List;
import org.xml.sax.InputSource;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.LocatorImpl;
import org.xmlpull.v1.XmlPullParser;

public class ASaxEventRecorder extends SaxEventRecorder
{
    static class StatePassFilter
    {

        private int _depth;
        private final String _states[];

        public boolean checkEnd(String s)
        {
            if (_depth > 0 && s.equals(_states[_depth - 1]))
            {
                _depth = _depth - 1;
            } else
            if (_depth == _states.length)
            {
                return true;
            }
            return false;
        }

        public boolean checkStart(String s)
        {
            if (_depth == _states.length)
            {
                return true;
            }
            if (s.equals(_states[_depth]))
            {
                _depth = _depth + 1;
            }
            return false;
        }

        public boolean passed()
        {
            return _depth == _states.length;
        }

        public void reset()
        {
            _depth = 0;
        }

        public transient StatePassFilter(String as[])
        {
            _depth = 0;
            String as1[] = as;
            if (as == null)
            {
                as1 = new String[0];
            }
            _states = as1;
        }
    }


    private String attrNameToWatch;
    private String attrWatchValue;
    private String elemNameToWatch;
    private StatePassFilter filter;
    private int holderForStartAndLength[];

    public ASaxEventRecorder()
    {
        holderForStartAndLength = new int[2];
        filter = new StatePassFilter(new String[0]);
        attrNameToWatch = null;
        elemNameToWatch = null;
        attrWatchValue = null;
    }

    private void characters(XmlPullParser xmlpullparser)
    {
        if (filter.passed())
        {
            super.characters(xmlpullparser.getTextCharacters(holderForStartAndLength), holderForStartAndLength[0], holderForStartAndLength[1]);
        }
    }

    private void checkForWatchedAttribute(XmlPullParser xmlpullparser)
    {
        if (elemNameToWatch != null && attrWatchValue == null && xmlpullparser.getName().equals(elemNameToWatch))
        {
            for (int i = 0; i < xmlpullparser.getAttributeCount(); i++)
            {
                if (xmlpullparser.getAttributeName(i).equals(attrNameToWatch))
                {
                    attrWatchValue = xmlpullparser.getAttributeValue(i);
                }
            }

        }
    }

    private void endElement(XmlPullParser xmlpullparser)
    {
        String s = xmlpullparser.getName();
        if (filter.checkEnd(s))
        {
            endElement(xmlpullparser.getNamespace(), s, s);
        }
    }

    private void startDocument(XmlPullParser xmlpullparser)
    {
        super.startDocument();
        super.setDocumentLocator(new LocatorImpl());
    }

    private void startElement(XmlPullParser xmlpullparser)
    {
        String s = xmlpullparser.getName();
        if (filter.checkStart(s))
        {
            AttributesImpl attributesimpl = new AttributesImpl();
            for (int i = 0; i < xmlpullparser.getAttributeCount(); i++)
            {
                attributesimpl.addAttribute(xmlpullparser.getAttributeNamespace(i), xmlpullparser.getAttributeName(i), xmlpullparser.getAttributeName(i), xmlpullparser.getAttributeType(i), xmlpullparser.getAttributeValue(i));
            }

            startElement(xmlpullparser.getNamespace(), s, s, ((org.xml.sax.Attributes) (attributesimpl)));
        }
        checkForWatchedAttribute(xmlpullparser);
    }

    public List recordEvents(InputSource inputsource)
        throws JoranException
    {
        inputsource = inputsource.getByteStream();
        if (inputsource == null)
        {
            throw new IllegalArgumentException("Input source must specify an input stream");
        }
        inputsource = new AXmlResourceParser(inputsource);
        attrWatchValue = null;
_L1:
        int i = inputsource.next();
label0:
        {
            if (i <= -1)
            {
                break MISSING_BLOCK_LABEL_99;
            }
            if (i != 0)
            {
                break label0;
            }
            try
            {
                filter.reset();
                startDocument(inputsource);
            }
            // Misplaced declaration of an exception variable
            catch (InputSource inputsource)
            {
                addError(inputsource.getMessage(), inputsource);
                throw new JoranException("Can't parse Android XML resource", inputsource);
            }
        }
          goto _L1
        if (1 != i)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        filter.reset();
        endDocument();
        return getSaxEventList();
        if (2 != i)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        startElement(inputsource);
          goto _L1
        if (3 != i) goto _L3; else goto _L2
_L2:
        endElement(inputsource);
          goto _L1
_L3:
        if (4 != i) goto _L1; else goto _L4
_L4:
        characters(inputsource);
          goto _L1
    }

    public transient void setFilter(String as[])
    {
        filter = new StatePassFilter(as);
    }
}

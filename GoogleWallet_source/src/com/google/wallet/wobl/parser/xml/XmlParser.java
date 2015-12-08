// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser.xml;

import com.google.common.base.Preconditions;
import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.exception.WoblParserException;
import java.io.IOException;
import java.io.Reader;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

// Referenced classes of package com.google.wallet.wobl.parser.xml:
//            XmlTag, XmlElement

public class XmlParser
{

    private static final XmlPullParserFactory XML_PULL_PARSER_FACTORY;
    private boolean haveWePeekedAtNextTag;
    private XmlPullParser xmlPullParser;

    public XmlParser(Reader reader)
        throws WoblParserException
    {
        Preconditions.checkNotNull(reader);
        try
        {
            xmlPullParser = XML_PULL_PARSER_FACTORY.newPullParser();
            xmlPullParser.setInput(reader);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            throw new WoblParserException("unable to start parser", reader);
        }
    }

    private XmlTag getNextTag()
        throws WoblParserException, WoblMalformedDocException
    {
        Object obj1;
        boolean flag;
        flag = true;
        obj1 = null;
        if (!haveWePeekedAtNextTag) goto _L2; else goto _L1
_L1:
        int i = xmlPullParser.getEventType();
_L13:
        haveWePeekedAtNextTag = false;
          goto _L3
_L10:
        Object obj;
        int j;
        if (i != 2)
        {
            flag = false;
        }
        obj = new XmlTag(flag, xmlPullParser.getName());
        j = xmlPullParser.getAttributeCount();
        i = 0;
_L5:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((XmlTag) (obj)).putAttribute(xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
        i++;
        if (true) goto _L5; else goto _L4
_L2:
        i = xmlPullParser.next();
        continue; /* Loop/switch isn't completed */
_L11:
        i = xmlPullParser.next();
          goto _L3
        obj;
_L8:
        throw new WoblParserException("Unable to start parser", ((Throwable) (obj)));
        obj;
_L7:
        throw new WoblMalformedDocException("Malformed doc:", ((Throwable) (obj)));
        obj;
        if (true) goto _L7; else goto _L6
_L6:
        obj;
        if (true) goto _L8; else goto _L3
_L3:
        obj = obj1;
        if (i == 1) goto _L4; else goto _L9
_L9:
        if (i != 2 && i != 3) goto _L11; else goto _L10
_L4:
        return ((XmlTag) (obj));
        if (true) goto _L13; else goto _L12
_L12:
    }

    public XmlElement generateXmlElementTree()
        throws WoblParserException, WoblMalformedDocException
    {
        Stack stack = new Stack();
        Stack stack1 = new Stack();
        Object obj;
        do
        {
            Object obj1 = getNextTag();
            obj = new XmlElement(((XmlTag) (obj1)));
            int i;
            if (((XmlTag) (obj1)).isStartTag())
            {
                XmlElement xmlelement = new XmlElement(((XmlTag) (obj1)));
                stack1.push(obj1);
                if (!stack.empty())
                {
                    ((XmlElement)stack.peek()).addChild(xmlelement);
                }
                stack.push(xmlelement);
            } else
            {
                stack1.pop();
                obj = (XmlElement)stack.pop();
                ((XmlElement) (obj)).setEndTag(((XmlTag) (obj1)));
            }
            try
            {
                i = xmlPullParser.next();
                haveWePeekedAtNextTag = true;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new WoblParserException("Unable to start parser", ((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new WoblMalformedDocException("Malformed doc:", ((Throwable) (obj)));
            }
            if (i == 4)
            {
                obj1 = xmlPullParser.getText();
                if (!((String) (obj1)).isEmpty() && !((String) (obj1)).trim().isEmpty())
                {
                    ((XmlElement)stack.peek()).addChild(XmlElement.newInternalTextElement(((String) (obj1))));
                }
            }
        } while (!stack1.empty());
        if (!stack.empty())
        {
            obj = String.valueOf(stack);
            throw new WoblMalformedDocException((new StringBuilder(String.valueOf(obj).length() + 22)).append("Some tags not closed: ").append(((String) (obj))).toString());
        } else
        {
            return ((XmlElement) (obj));
        }
    }

    static 
    {
        Exception exception;
        Object obj = null;
        XmlPullParserFactory xmlpullparserfactory = null;
        XmlPullParserFactory xmlpullparserfactory1;
        try
        {
            xmlpullparserfactory1 = XmlPullParserFactory.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            XML_PULL_PARSER_FACTORY = xmlpullparserfactory;
            return;
        }
        finally
        {
            XML_PULL_PARSER_FACTORY = ((XmlPullParserFactory) (obj));
        }
        xmlpullparserfactory = xmlpullparserfactory1;
        obj = xmlpullparserfactory1;
        xmlpullparserfactory1.setNamespaceAware(true);
        XML_PULL_PARSER_FACTORY = xmlpullparserfactory1;
        return;
        throw exception;
    }
}

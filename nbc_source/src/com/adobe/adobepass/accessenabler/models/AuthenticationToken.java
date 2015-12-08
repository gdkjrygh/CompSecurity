// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.models;

import com.adobe.adobepass.accessenabler.utils.Log;
import com.adobe.adobepass.accessenabler.utils.StringEscapeUtils;
import java.io.IOException;
import java.io.StringReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class AuthenticationToken
{
    public static final class TokenType extends Enum
    {

        private static final TokenType $VALUES[];
        public static final TokenType ANY;
        public static final TokenType AUTHN_PER_REQUESTOR;
        public static final TokenType NON_AUTHN_PER_REQUESTOR;

        public static TokenType valueOf(String s)
        {
            return (TokenType)Enum.valueOf(com/adobe/adobepass/accessenabler/models/AuthenticationToken$TokenType, s);
        }

        public static TokenType[] values()
        {
            return (TokenType[])$VALUES.clone();
        }

        static 
        {
            AUTHN_PER_REQUESTOR = new TokenType("AUTHN_PER_REQUESTOR", 0);
            NON_AUTHN_PER_REQUESTOR = new TokenType("NON_AUTHN_PER_REQUESTOR", 1);
            ANY = new TokenType("ANY", 2);
            $VALUES = (new TokenType[] {
                AUTHN_PER_REQUESTOR, NON_AUTHN_PER_REQUESTOR, ANY
            });
        }

        private TokenType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String LOG_TAG = "AuthenticationToken";
    private List authorizedResources;
    private String deviceId;
    private String expires;
    private String mvpdId;
    private String requestorId;
    private String samlNameId;
    private String sessionGuid;
    private String sessionIndex;
    private String xml;

    public AuthenticationToken(String s, boolean flag)
    {
        authorizedResources = new ArrayList();
        if (flag)
        {
            flag = preParse(s);
        } else
        {
            flag = parse(s);
        }
        if (!flag)
        {
            throw new RuntimeException("Error parsing authentication token.");
        } else
        {
            return;
        }
    }

    private String extractAuthorizedResources(String s)
    {
        int i = s.indexOf("<simpleAuthorizedResources>");
        int j = s.indexOf("</simpleAuthorizedResources>");
        if (i >= 0 && j > i)
        {
            return s.substring(i, "</simpleAuthorizedResources>".length() + j);
        } else
        {
            return null;
        }
    }

    private boolean parse(String s)
    {
        boolean flag1;
        flag1 = false;
        xml = s;
        Object obj = s.split("<signatureInfo>")[2];
        String s1 = extractAuthorizedResources(((String) (obj)));
        s = ((String) (obj));
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        s = ((String) (obj)).replace(s1, "");
        obj = parseXmlHelper(s);
        Node node = ((Document) (obj)).getElementsByTagName("simpleTokenRequestorID").item(0);
        boolean flag;
        flag = flag1;
        if (node == null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        requestorId = node.getFirstChild().getNodeValue();
        node = ((Document) (obj)).getElementsByTagName("simpleTokenMsoID").item(0);
        flag = flag1;
        if (node == null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        mvpdId = node.getFirstChild().getNodeValue();
        node = ((Document) (obj)).getElementsByTagName("simpleTokenAuthenticationGuid").item(0);
        flag = flag1;
        if (node == null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        sessionGuid = node.getFirstChild().getNodeValue();
        node = ((Document) (obj)).getElementsByTagName("simpleSamlSessionIndex").item(0);
        if (node == null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        sessionIndex = node.getFirstChild().getNodeValue();
        node = ((Document) (obj)).getElementsByTagName("simpleSamlNameID").item(0);
        if (node == null)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        samlNameId = node.getFirstChild().getNodeValue();
        node = ((Document) (obj)).getElementsByTagName("simpleTokenExpires").item(0);
        flag = flag1;
        if (node == null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        expires = node.getFirstChild().getNodeValue();
        obj = ((Document) (obj)).getElementsByTagName("simpleTokenFingerprint").item(0);
        flag = flag1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        deviceId = ((Node) (obj)).getFirstChild().getNodeValue();
        try
        {
            Log.d("AuthenticationToken", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("AuthenticationToken", s.toString());
            return false;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_388;
        }
        try
        {
            parsePreauthorizedRrsources(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            authorizedResources.clear();
            Log.e("AuthenticationToken", s.toString());
        }
        flag = true;
        return flag;
        s;
        Log.e("AuthenticationToken", s.toString());
        return false;
        s;
        Log.e("AuthenticationToken", s.toString());
        return false;
        s;
        Log.e("AuthenticationToken", s.toString());
        return false;
        Log.d("AuthenticationToken", "No preauthorized resources found on authentication token.");
        break MISSING_BLOCK_LABEL_334;
    }

    private void parsePreauthorizedRrsources(String s)
        throws IOException, SAXException, ParserConfigurationException
    {
        s = parseXmlHelper(s).getElementsByTagName("simpleAuthorizedResource");
        if (s != null)
        {
            int i = 0;
            int j = s.getLength();
            while (i < j) 
            {
                Node node = s.item(i).getAttributes().item(0);
                if (node != null && node.getNodeName().equals("simpleResourceID"))
                {
                    authorizedResources.add(node.getNodeValue());
                }
                i++;
            }
        }
    }

    private Document parseXmlHelper(String s)
        throws ParserConfigurationException, IOException, SAXException
    {
        DocumentBuilder documentbuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        InputSource inputsource = new InputSource();
        inputsource.setCharacterStream(new StringReader(s));
        s = documentbuilder.parse(inputsource);
        s.getDocumentElement().normalize();
        return s;
    }

    private boolean preParse(String s)
    {
        boolean flag = false;
        try
        {
            s = parseXmlHelper(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("AuthenticationToken", s.getMessage());
            return false;
        }
        s = s.getElementsByTagName("authnToken").item(0);
        if (s != null)
        {
            flag = parse(StringEscapeUtils.unescapeHtml(s.getFirstChild().getNodeValue()));
        }
        return flag;
    }

    public List getAuthorizedResources()
    {
        return authorizedResources;
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public String getExpires()
    {
        return expires;
    }

    public String getMvpdId()
    {
        return mvpdId;
    }

    public String getRequestorId()
    {
        return requestorId;
    }

    public String getSamlNameId()
    {
        return samlNameId;
    }

    public String getSessionGuid()
    {
        return sessionGuid;
    }

    public String getSessionIndex()
    {
        return sessionIndex;
    }

    public boolean hasAuthorizedResources()
    {
        return authorizedResources.size() > 0;
    }

    public boolean isValid()
    {
        Date date;
        try
        {
            date = (new SimpleDateFormat("yyyy/MM/dd HH:mm:ss zzz Z")).parse(expires);
        }
        catch (ParseException parseexception)
        {
            Log.e("AuthenticationToken", parseexception.toString());
            return false;
        }
        if (date.compareTo(Calendar.getInstance().getTime()) < 0)
        {
            Log.d("AuthenticationToken", "Found expired authentication token.");
            return false;
        } else
        {
            return true;
        }
    }

    public String toXml()
    {
        return xml;
    }
}

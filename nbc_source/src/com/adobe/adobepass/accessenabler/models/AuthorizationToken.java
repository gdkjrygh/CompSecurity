// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.models;

import com.adobe.adobepass.accessenabler.utils.Log;
import com.adobe.adobepass.accessenabler.utils.StringEscapeUtils;
import java.io.StringReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class AuthorizationToken
{

    private static final String AUTHZ_TOKEN_TAG = "authzToken";
    private static final String LOG_TAG = "AuthorizationToken";
    private String mvpdId;
    private String requestorId;
    private String resourceId;
    private String ttl;
    private String xml;

    public AuthorizationToken(String s, boolean flag)
    {
        if (flag)
        {
            flag = preParse(s);
        } else
        {
            flag = parse(s);
        }
        if (!flag)
        {
            throw new RuntimeException("Error parsing authorization token.");
        } else
        {
            return;
        }
    }

    private String extractResourceId(Node node)
    {
        Object obj;
        if (node == null || node.getChildNodes() == null)
        {
            obj = null;
        } else
        {
            obj = "";
            NodeList nodelist = node.getChildNodes();
            int i = 0;
            for (node = ((Node) (obj)); i < nodelist.getLength(); node = ((Node) (obj)))
            {
                Node node1 = nodelist.item(i);
                obj = node;
                if (node1 != null)
                {
                    obj = node;
                    if (node1.getNodeValue() != null)
                    {
                        obj = (new StringBuilder()).append(node).append(node1.getNodeValue()).toString();
                    }
                }
                i++;
            }

            obj = node;
            if (node.length() <= 0)
            {
                return null;
            }
        }
        return ((String) (obj));
    }

    private boolean parse(String s)
    {
        boolean flag1 = false;
        xml = s;
        s = StringEscapeUtils.unescapeHtml(s);
        Node node;
        boolean flag;
        try
        {
            s = s.split("<signatureInfo>")[2];
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("AuthorizationToken", s.toString());
            return false;
        }
        s = s.replaceAll("&", "&amp;");
        try
        {
            DocumentBuilder documentbuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            InputSource inputsource = new InputSource();
            inputsource.setCharacterStream(new StringReader(s));
            s = documentbuilder.parse(inputsource);
            s.getDocumentElement().normalize();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("AuthorizationToken", s.toString());
            return false;
        }
        try
        {
            node = s.getElementsByTagName("simpleTokenRequestorID").item(0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("AuthorizationToken", s.toString());
            return false;
        }
        flag = flag1;
        if (node == null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        requestorId = node.getFirstChild().getNodeValue();
        node = s.getElementsByTagName("simpleTokenResourceID").item(0);
        flag = flag1;
        if (node == null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        resourceId = extractResourceId(node);
        node = s.getElementsByTagName("simpleTokenTTL").item(0);
        flag = flag1;
        if (node == null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        ttl = node.getFirstChild().getNodeValue();
        s = s.getElementsByTagName("simpleTokenMsoID").item(0);
        flag = flag1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        mvpdId = s.getFirstChild().getNodeValue();
        flag = true;
        return flag;
    }

    private boolean preParse(String s)
    {
        boolean flag1 = false;
        boolean flag;
        try
        {
            DocumentBuilder documentbuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            InputSource inputsource = new InputSource();
            inputsource.setCharacterStream(new StringReader(s));
            s = documentbuilder.parse(inputsource);
            s.getDocumentElement().normalize();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("AuthorizationToken", s.getMessage());
            return false;
        }
        s = s.getElementsByTagName("authzToken").item(0);
        flag = flag1;
        if (s != null)
        {
            flag = flag1;
            if (parse(s.getFirstChild().getNodeValue()))
            {
                flag = true;
            }
        }
        return flag;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof AuthorizationToken))
        {
            return false;
        } else
        {
            return resourceId.equals(((AuthorizationToken)obj).getResourceId());
        }
    }

    public String getMvpdId()
    {
        return mvpdId;
    }

    public String getRequestorId()
    {
        return requestorId;
    }

    public String getResourceId()
    {
        return resourceId;
    }

    public String getTtl()
    {
        return ttl;
    }

    public boolean isValid()
    {
        Date date;
        try
        {
            date = (new SimpleDateFormat("yyyy/MM/dd HH:mm:ss zzz Z")).parse(ttl);
        }
        catch (ParseException parseexception)
        {
            Log.e("AuthorizationToken", parseexception.toString());
            return false;
        }
        if (date.compareTo(Calendar.getInstance().getTime()) < 0)
        {
            Log.d("AuthorizationToken", "Found expired authorization token.");
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

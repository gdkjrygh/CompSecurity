// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.models;

import com.adobe.adobepass.accessenabler.api.AccessEnablerContext;
import com.adobe.adobepass.accessenabler.utils.Log;
import com.adobe.adobepass.accessenabler.utils.Utils;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

// Referenced classes of package com.adobe.adobepass.accessenabler.models:
//            Mvpd, DeviceInfo

public class Requestor
{

    private static final String LOG_TAG = "Requestor";
    private final AccessEnablerContext context;
    private String id;
    private boolean isValid;
    private ArrayList mvpds;
    private String name;
    private String signedId;

    public Requestor(AccessEnablerContext accessenablercontext)
    {
        mvpds = new ArrayList();
        context = accessenablercontext;
    }

    private boolean parseMvpdNodes(Node node, ArrayList arraylist, String s)
    {
        if (node == null)
        {
            return false;
        }
        node = node.getChildNodes();
        for (int i = 0; i < node.getLength();)
        {
            Node node1 = node.item(i);
            boolean flag1 = false;
            boolean flag = true;
            if (!"mvpd".equals(node1.getNodeName()))
            {
                return false;
            }
            Object obj = Utils.getChildNodeTagByName(node1, "id");
            if (obj != null)
            {
                obj = ((Node) (obj)).getFirstChild().getNodeValue();
                Object obj1 = Utils.getChildNodeTagByName(node1, "displayName");
                if (obj1 != null)
                {
                    obj1 = ((Node) (obj1)).getFirstChild().getNodeValue();
                    Object obj2 = Utils.getChildNodeTagByName(node1, "logoUrl");
                    if (obj2 != null)
                    {
                        obj2 = ((Node) (obj2)).getFirstChild().getNodeValue();
                        Node node2 = Utils.getChildNodeTagByName(node1, "passiveAuthnEnabled");
                        if (node2 != null)
                        {
                            flag = node2.getFirstChild().getNodeValue().equalsIgnoreCase("true");
                        }
                        node1 = Utils.getChildNodeTagByName(node1, "authPerAggregator");
                        if (node1 != null)
                        {
                            flag1 = node1.getFirstChild().getNodeValue().equalsIgnoreCase("true");
                        }
                        arraylist.add(new Mvpd(((String) (obj)), ((String) (obj1)), ((String) (obj2)), s, flag1, flag));
                        i++;
                    } else
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }

        return true;
    }

    public String getId()
    {
        return id;
    }

    public boolean getIsValid()
    {
        return isValid;
    }

    public Mvpd getMvpd(String s)
    {
        if (s == null)
        {
            return null;
        }
        for (Iterator iterator = mvpds.iterator(); iterator.hasNext();)
        {
            Mvpd mvpd = (Mvpd)iterator.next();
            if (s.equals(mvpd.getId()))
            {
                return mvpd;
            }
        }

        return null;
    }

    public ArrayList getMvpds()
    {
        return mvpds;
    }

    public String getName()
    {
        return name;
    }

    public String getSignedId()
    {
        return signedId;
    }

    public boolean isMvpdValid(String s)
    {
        if (s != null)
        {
            Iterator iterator = mvpds.iterator();
            while (iterator.hasNext()) 
            {
                if (s.equals(((Mvpd)iterator.next()).getId()))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean parseConfigFromXml(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = new ArrayList();
        DocumentBuilder documentbuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        InputSource inputsource = new InputSource();
        inputsource.setCharacterStream(new StringReader(s));
        s = documentbuilder.parse(inputsource);
        s.getDocumentElement().normalize();
        Object obj1 = s.getElementsByTagName("device");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        if (((NodeList) (obj1)).getLength() <= 0)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        obj1 = ((Element)((NodeList) (obj1)).item(0)).getTextContent();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        context.getDeviceInfo().setDeviceType(((String) (obj1)));
        obj1 = s.getElementsByTagName("clientType");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        if (((NodeList) (obj1)).getLength() <= 0)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        obj1 = ((Element)((NodeList) (obj1)).item(0)).getTextContent();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        context.getDeviceInfo().setClientType(((String) (obj1)));
        obj1 = s.getElementsByTagName("os");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        if (((NodeList) (obj1)).getLength() <= 0)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        obj1 = ((Element)((NodeList) (obj1)).item(0)).getTextContent();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        context.getDeviceInfo().setOs(((String) (obj1)));
        s = s.getElementsByTagName("requestor").item(0);
        if (s == null) goto _L2; else goto _L1
_L1:
        obj1 = Utils.getChildNodeTagByName(s, "id");
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        Object obj2;
        obj1 = ((Node) (obj1)).getFirstChild().getNodeValue();
        obj2 = Utils.getChildNodeTagByName(s, "name");
        if (obj2 == null) goto _L6; else goto _L5
_L5:
        boolean flag2;
        obj2 = ((Node) (obj2)).getFirstChild().getNodeValue();
        flag2 = parseMvpdNodes(Utils.getChildNodeTagByName(s, "mvpds"), ((ArrayList) (obj)), s1);
        if (flag2) goto _L8; else goto _L7
_L7:
        flag2 = false;
_L16:
        this;
        JVM INSTR monitorexit ;
        return flag2;
        s;
        Log.e("Requestor", s.toString());
        flag2 = false;
        continue; /* Loop/switch isn't completed */
        s;
        Log.e("Requestor", s.toString());
        isValid = false;
        flag2 = false;
        continue; /* Loop/switch isn't completed */
_L8:
        setId(((String) (obj1)));
        setName(((String) (obj2)));
        s = ((ArrayList) (obj)).iterator();
_L14:
        if (!s.hasNext())
        {
            break MISSING_BLOCK_LABEL_543;
        }
        s1 = (Mvpd)s.next();
        boolean flag1 = false;
        obj = mvpds.iterator();
_L12:
        boolean flag = flag1;
        if (!((Iterator) (obj)).hasNext()) goto _L10; else goto _L9
_L9:
        if (!s1.equals((Mvpd)((Iterator) (obj)).next())) goto _L12; else goto _L11
_L11:
        Log.d("Requestor", (new StringBuilder()).append("MVPD already added: ").append(s1.getDisplayName()).toString());
        flag = true;
_L10:
        if (flag) goto _L14; else goto _L13
_L13:
        Log.d("Requestor", (new StringBuilder()).append("Added MVPD: ").append(s1.getDisplayName()).append(" with SP: ").append(s1.getSpUrl()).toString());
        mvpds.add(s1);
          goto _L14
        s;
        throw s;
        flag2 = true;
        continue; /* Loop/switch isn't completed */
_L4:
        flag2 = false;
        continue; /* Loop/switch isn't completed */
_L6:
        flag2 = false;
        continue; /* Loop/switch isn't completed */
_L2:
        flag2 = false;
        if (true) goto _L16; else goto _L15
_L15:
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setSignedId(String s)
    {
        signedId = s;
    }

    public void validate(boolean flag)
    {
        isValid = flag;
    }
}

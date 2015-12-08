// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RaptureXML;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class RXMLElement
{
    public static interface Block
    {

        public abstract void block(RXMLElement rxmlelement);
    }


    private Document _doc;
    private Node _node;

    public RXMLElement()
    {
    }

    public RXMLElement(File file)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj = null;
        obj1 = null;
        obj2 = null;
        DataInputStream datainputstream;
        byte abyte0[];
        abyte0 = new byte[(int)file.length()];
        datainputstream = new DataInputStream(new FileInputStream(file));
        datainputstream.readFully(abyte0);
        file = new String(abyte0);
        if (datainputstream != null)
        {
            try
            {
                datainputstream.close();
            }
            catch (IOException ioexception) { }
        }
        IOException ioexception1;
        try
        {
            _doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(file)));
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        if (_doc != null)
        {
            _node = _doc.getDocumentElement();
            if (_node == null)
            {
                _doc = null;
            }
        }
        return;
        file;
        datainputstream = obj2;
_L4:
        file = obj;
        if (datainputstream == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        try
        {
            datainputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            file = obj;
            break MISSING_BLOCK_LABEL_61;
        }
        file = obj;
        break MISSING_BLOCK_LABEL_61;
        file;
        datainputstream = obj1;
_L2:
        if (datainputstream != null)
        {
            try
            {
                datainputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception1) { }
        }
        throw file;
        file;
        if (true) goto _L2; else goto _L1
_L1:
        file;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public RXMLElement(String s)
    {
        if (s != null && !s.equals(""))
        {
            try
            {
                DocumentBuilderFactory documentbuilderfactory = DocumentBuilderFactory.newInstance();
                documentbuilderfactory.setNamespaceAware(true);
                _doc = documentbuilderfactory.newDocumentBuilder().parse(new InputSource(new StringReader(s)));
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            if (_doc != null)
            {
                _node = _doc.getDocumentElement();
                if (_node == null)
                {
                    _doc = null;
                    return;
                }
            }
        }
    }

    public RXMLElement(Node node)
    {
        _doc = null;
        _node = node;
    }

    public static RXMLElement elementFromFile(File file)
    {
        return new RXMLElement(file);
    }

    public static RXMLElement elementFromNode(Node node)
    {
        return new RXMLElement(node);
    }

    public static RXMLElement elementFromXMLString(String s)
    {
        return new RXMLElement(s);
    }

    public static String implode(String as[], String s)
    {
        String s1 = "";
        int i = 0;
        do
        {
            if (i >= as.length)
            {
                return s1;
            }
            String s2 = s1;
            if (i != 0)
            {
                s2 = (new StringBuilder(String.valueOf(s1))).append(s).toString();
            }
            s1 = (new StringBuilder(String.valueOf(s2))).append(as[i]).toString();
            i++;
        } while (true);
    }

    public String attribute(String s)
    {
        s = _node.getAttributes().getNamedItem(s);
        if (s == null)
        {
            s = "";
        } else
        {
            String s1 = s.getNodeValue();
            s = s1;
            if (s1 == null)
            {
                return "";
            }
        }
        return s;
    }

    public String attribute(String s, String s1)
    {
        s1 = _node.getAttributes().getNamedItemNS(s1, s).getNodeValue();
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        return s;
    }

    public double attributeAsDouble(String s)
    {
        return Double.parseDouble(attribute(s));
    }

    public double attributeAsDouble(String s, String s1)
    {
        return Double.parseDouble(attribute(s, s1));
    }

    public int attributeAsInt(String s)
    {
        return Integer.parseInt(attribute(s));
    }

    public int attributeAsInt(String s, String s1)
    {
        return Integer.parseInt(attribute(s, s1));
    }

    public RXMLElement child(String s)
    {
        String as[];
        int i;
        int j;
        if (_node == null)
        {
            return new RXMLElement();
        }
        as = s.split("\\.");
        s = _node;
        j = as.length;
        i = 0;
_L11:
        if (i < j) goto _L2; else goto _L1
_L1:
        Object obj = s;
_L10:
        String s1;
        if (obj != null)
        {
            return elementFromNode(((Node) (obj)));
        } else
        {
            return new RXMLElement();
        }
_L2:
        s1 = as[i];
        if (!s1.equals("*")) goto _L4; else goto _L3
_L3:
        obj = s.getFirstChild();
_L12:
        s = ((String) (obj));
        if (obj == null) goto _L6; else goto _L5
_L5:
        if (((Node) (obj)).getNodeType() != 1) goto _L8; else goto _L7
_L7:
        s = ((String) (obj));
_L6:
        obj = s;
        if (s == null) goto _L10; else goto _L9
_L9:
        i++;
          goto _L11
_L8:
        obj = ((Node) (obj)).getNextSibling();
          goto _L12
_L4:
        obj = s.getFirstChild();
_L15:
        s = ((String) (obj));
        if (obj == null) goto _L6; else goto _L13
_L13:
        s = ((String) (obj));
        if (((Node) (obj)).getNodeName().equals(s1)) goto _L6; else goto _L14
_L14:
        obj = ((Node) (obj)).getNextSibling();
          goto _L15
    }

    public RXMLElement child(String s, String s1)
    {
        String as[];
        int i;
        int j;
        if (_node == null)
        {
            return new RXMLElement();
        }
        as = s.split("\\.");
        s = _node;
        j = as.length;
        i = 0;
_L12:
        if (i < j) goto _L2; else goto _L1
_L1:
        Object obj = s;
_L11:
        String s2;
        if (obj != null)
        {
            return elementFromNode(((Node) (obj)).getFirstChild());
        } else
        {
            return new RXMLElement();
        }
_L2:
        s2 = as[i];
        if (!s2.equals("*")) goto _L4; else goto _L3
_L3:
        obj = s.getFirstChild();
_L13:
        s = ((String) (obj));
        if (obj == null) goto _L6; else goto _L5
_L5:
        s = ((String) (obj));
        if (((Node) (obj)).getNodeType() == 1) goto _L6; else goto _L7
_L7:
        if (!((Node) (obj)).getNamespaceURI().equals(s1)) goto _L9; else goto _L8
_L8:
        s = ((String) (obj));
_L6:
        obj = s;
        if (s == null) goto _L11; else goto _L10
_L10:
        i++;
          goto _L12
_L9:
        obj = ((Node) (obj)).getNextSibling();
          goto _L13
_L4:
        obj = s.getFirstChild();
_L16:
        s = ((String) (obj));
        if (obj == null) goto _L6; else goto _L14
_L14:
        if (((Node) (obj)).getNodeType() != 1 || ((Node) (obj)).getNodeName().equals(s2))
        {
            break; /* Loop/switch isn't completed */
        }
        s = ((String) (obj));
        if (!((Node) (obj)).getNamespaceURI().equals(s1)) goto _L6; else goto _L15
_L15:
        obj = ((Node) (obj)).getNextSibling();
          goto _L16
    }

    public ArrayList children(String s)
    {
        ArrayList arraylist = new ArrayList();
        Node node = _node.getFirstChild();
        do
        {
            if (node == null)
            {
                return arraylist;
            }
            if (node.getNodeName().equals(s))
            {
                arraylist.add(elementFromNode(node));
            }
            node = node.getNextSibling();
        } while (true);
    }

    public ArrayList children(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        Node node = _node.getFirstChild();
        do
        {
            if (node == null)
            {
                return arraylist;
            }
            if (node.getNodeName().replaceFirst("ns:", "").equals(s) && node.getNamespaceURI().equals(s1))
            {
                arraylist.add(elementFromNode(node));
            }
            node = node.getNextSibling();
        } while (true);
    }

    public ArrayList childrenWithRootXPath(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        Object obj = new ArrayList();
_L4:
        return ((ArrayList) (obj));
_L2:
        Object obj1 = XPathFactory.newInstance().newXPath();
        obj = null;
        try
        {
            s = (NodeList)((XPath) (obj1)).compile(s).evaluate(_node, XPathConstants.NODESET);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            s = ((String) (obj));
        }
        if (s == null)
        {
            return new ArrayList();
        }
        obj1 = new ArrayList();
        int i = 0;
        do
        {
            obj = obj1;
            if (i >= s.getLength())
            {
                continue;
            }
            obj = elementFromNode(s.item(i));
            if (obj != null)
            {
                ((ArrayList) (obj1)).add(obj);
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String description()
    {
        return text();
    }

    public boolean isValid()
    {
        return _node != null;
    }

    public void iterate(String s, Block block)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1;
        int i;
        obj1 = s.split("\\.");
        s = _node;
        i = 0;
_L13:
        if (i < obj1.length) goto _L4; else goto _L3
_L3:
        Object obj = s;
_L12:
        if (obj == null) goto _L1; else goto _L5
_L5:
        String as[];
        if (obj1.length > 0)
        {
            obj1 = obj1[obj1.length - 1];
        } else
        {
            obj1 = null;
        }
        if (((Node) (obj)).getNodeType() == 1)
        {
            block.block(elementFromNode(((Node) (obj))));
        }
        s = ((String) (obj));
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        s = ((String) (obj));
        if (!((String) (obj1)).equals("*")) goto _L7; else goto _L8
_L8:
        s = ((Node) (obj)).getNextSibling();
_L20:
        obj = s;
        if (s == null)
        {
            return;
        } else
        {
            break MISSING_BLOCK_LABEL_51;
        }
_L4:
        as = obj1[i];
        if (!as.equals("*")) goto _L10; else goto _L9
_L9:
        obj = s.getFirstChild();
        s = ((String) (obj));
        if (i < obj1.length - 1)
        {
            s = ((String) (obj));
            do
            {
                if (s.getNodeType() == 1)
                {
                    obj = elementFromNode(s);
                    int j = obj1.length - i - 1;
                    as = new String[j];
                    System.arraycopy(obj1, i + 1, as, 0, j);
                    ((RXMLElement) (obj)).iterate(implode(as, "."), block);
                }
                obj = s.getNextSibling();
                s = ((String) (obj));
            } while (obj != null);
            s = ((String) (obj));
        }
_L15:
        obj = s;
        if (s == null) goto _L12; else goto _L11
_L11:
        i++;
          goto _L13
_L10:
        obj = s.getFirstChild();
_L17:
        s = ((String) (obj));
        if (obj == null) goto _L15; else goto _L14
_L14:
        if (((Node) (obj)).getNodeType() != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        s = ((String) (obj));
        if (((Node) (obj)).getNodeName().equals(as)) goto _L15; else goto _L16
_L16:
        obj = ((Node) (obj)).getNextSibling();
          goto _L17
_L22:
        s = ((String) (obj));
        if (((Node) (obj)).getNodeType() != 1) goto _L7; else goto _L18
_L18:
        s = ((String) (obj));
        if (((Node) (obj)).getNodeName().equals(obj1)) goto _L20; else goto _L19
_L19:
        s = ((String) (obj));
_L7:
        obj = s.getNextSibling();
        if (obj != null) goto _L22; else goto _L21
_L21:
        s = ((String) (obj));
          goto _L20
    }

    public void iterateElements(ArrayList arraylist, Block block)
    {
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                return;
            }
            block.block((RXMLElement)arraylist.next());
        } while (true);
    }

    public void iterateWithRootXPath(String s, Block block)
    {
        iterateElements(childrenWithRootXPath(s), block);
    }

    public String tag()
    {
        return _node.getNodeName();
    }

    public String text()
    {
        if (_node == null)
        {
            return "";
        }
        Node node2 = _node;
        NodeList nodelist = node2.getChildNodes();
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        do
        {
            Node node;
            Node node1;
            if (i >= nodelist.getLength())
            {
                if (stringbuilder.toString().equals("") && node2.getNodeValue() != null && !node2.getNodeValue().equals(""))
                {
                    return node2.getNodeValue();
                } else
                {
                    return stringbuilder.toString();
                }
            }
            node1 = nodelist.item(i);
            node = node1;
            if (node1.getNodeType() == 1)
            {
                node = node1.getFirstChild();
            }
            if (node != null)
            {
                stringbuilder.append(node.getNodeValue());
            }
            i++;
        } while (true);
    }

    public double textAsDouble()
    {
        return Double.parseDouble(text());
    }

    public int textAsInt()
    {
        String s;
        if (text().equals(""))
        {
            s = "0";
        } else
        {
            s = text();
        }
        return Integer.parseInt(s);
    }
}

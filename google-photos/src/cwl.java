// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public final class cwl
{

    public final cwm a;
    public final cwm b;

    private cwl(cwm cwm1, cwm cwm2)
    {
        a = (cwm)b.a(cwm1, "videoQualityModel", null);
        b = (cwm)b.a(cwm2, "photoQualityModel", null);
    }

    public static cwl a(Resources resources)
    {
        b.v();
        try
        {
            DocumentBuilder documentbuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentbuilder.parse(resources.openRawResource(b.hZ));
            resources = documentbuilder.parse(resources.openRawResource(b.hX));
            resources = new cwl(a(document), a(((Document) (resources))));
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            throw new IOException("Couldn't load quality model", resources);
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            throw new IOException("Couldn't load quality model", resources);
        }
        return resources;
    }

    private static cwm a(Document document)
    {
        Object obj = document.getDocumentElement();
        if (!((Element) (obj)).getTagName().equals("quality_model"))
        {
            throw new RuntimeException("Quality model xml file is of incorrect format.");
        }
        document = new ArrayList();
        a(a(((Element) (obj)), "features"), ((List) (document)));
        obj = a(((Element) (obj)), "model");
        String s = ((Element) (obj)).getAttribute("type");
        if (s.equals("LinearModel"))
        {
            obj = a(((Element) (obj)));
            return new cwm(document, ((List) (obj)).subList(0, ((List) (obj)).size() - 1), ((Float)((List) (obj)).get(((List) (obj)).size() - 1)).floatValue());
        }
        document = String.valueOf(s);
        if (document.length() != 0)
        {
            document = "Unrecognized model type: ".concat(document);
        } else
        {
            document = new String("Unrecognized model type: ");
        }
        throw new RuntimeException(document);
    }

    private static List a(Element element)
    {
        ArrayList arraylist = new ArrayList();
        element = a(element, "weights").getAttribute("values").split(",");
        int j = element.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(Float.valueOf(Float.parseFloat(element[i])));
        }

        return arraylist;
    }

    private static Element a(Element element, String s)
    {
        element = element.getElementsByTagName(s);
        if (element.getLength() != 1)
        {
            int i = element.getLength();
            throw new RuntimeException((new StringBuilder(String.valueOf(s).length() + 56)).append("Model file doesn't have single ").append(s).append(" element :( ").append(i).append(" )").toString());
        } else
        {
            return (Element)element.item(0);
        }
    }

    private static void a(Element element, List list)
    {
        NodeList nodelist;
        int i;
        nodelist = element.getElementsByTagName("feature");
        i = 0;
_L5:
        if (i >= nodelist.getLength()) goto _L2; else goto _L1
_L1:
        Object obj = (Element)nodelist.item(i);
        if (b.ig == null)
        {
            b.ig = new HashMap();
            element = cdr.values();
            int k = element.length;
            for (int j = 0; j < k; j++)
            {
                Object obj1 = element[j];
                b.ig.put(((cdr) (obj1)).a, obj1);
            }

        }
        element = ((Element) (obj)).getElementsByTagName("function");
        Object obj2;
        cdp cdp1;
        cmm cmm;
        if (element.getLength() > 0)
        {
            element = (Element)element.item(0);
        } else
        {
            element = null;
        }
        cdp1 = new cdp(((Element) (obj)));
        obj = cdp1.a;
        obj2 = (cdr)b.ig.get(obj);
        if (obj2 == null)
        {
            element = String.valueOf(obj);
            if (element.length() != 0)
            {
                element = "Unrecognized feature name: ".concat(element);
            } else
            {
                element = new String("Unrecognized feature name: ");
            }
            throw new RuntimeException(element);
        }
        if (((cdr) (obj2)).c != cdq.a) goto _L4; else goto _L3
_L3:
        obj = ((cdr) (obj2)).b;
        element = b.a(element);
        element = new cdu(((cmm) (obj)), cdp1.c, cdp1.b, element);
_L10:
        list.add(element);
        i++;
          goto _L5
_L4:
        if (((cdr) (obj2)).c != cdq.b) goto _L7; else goto _L6
_L6:
        cmm = ((cdr) (obj2)).b;
        if (cdp1.d < 0) goto _L9; else goto _L8
_L8:
        obj2 = new cdh(cdp1.d);
        obj = b.a(element);
        element = ((Element) (obj2));
_L11:
        element = new cdt(cmm, cdp1.c, cdp1.b, element, ((cdk) (obj)));
          goto _L10
_L9:
        if (element != null)
        {
            throw new RuntimeException("No functions supported for float array");
        }
        break MISSING_BLOCK_LABEL_687;
_L7:
        if (((cdr) (obj2)).c == cdq.c)
        {
            cmm = ((cdr) (obj2)).b;
            if (cdp1.d >= 0)
            {
                obj2 = new cdj(cdp1.d);
                obj = b.a(element);
                element = ((Element) (obj2));
            } else
            if (element != null)
            {
                element = element.getAttribute("name");
                if (element.equals("entropyHSV"))
                {
                    element = new cde();
                    obj = null;
                } else
                if (element.equals("saturationHSV"))
                {
                    element = new cdm();
                    obj = null;
                } else
                {
                    element = String.valueOf(element);
                    if (element.length() != 0)
                    {
                        element = "Unsupported feature function: ".concat(element);
                    } else
                    {
                        element = new String("Unsupported feature function: ");
                    }
                    throw new RuntimeException(element);
                }
            } else
            {
                obj = null;
                element = null;
            }
            element = new cdv(cmm, cdp1.c, cdp1.b, element, ((cdk) (obj)));
        } else
        if (((cdr) (obj2)).c == cdq.d)
        {
            cmm = ((cdr) (obj2)).b;
            if (cdp1.e != null)
            {
                obj2 = new cdf(cdp1.e);
                obj = b.a(element);
                element = ((Element) (obj2));
            } else
            if (element != null)
            {
                element = element.getAttribute("name");
                if (element.equals("has_face"))
                {
                    element = new cdl();
                    obj = null;
                } else
                {
                    element = String.valueOf(element);
                    if (element.length() != 0)
                    {
                        element = "Unsupported feature function: ".concat(element);
                    } else
                    {
                        element = new String("Unsupported feature function: ");
                    }
                    throw new RuntimeException(element);
                }
            } else
            {
                obj = null;
                element = null;
            }
            element = new cds(cmm, cdp1.c, cdp1.b, element, ((cdk) (obj)));
        } else
        {
            throw new RuntimeException("Unsupported feature type.");
        }
          goto _L10
_L2:
        return;
        obj = null;
        element = null;
          goto _L11
    }
}

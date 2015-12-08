// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCard;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.io.html.HCardElement;
import ezvcard.io.json.JCardValue;
import ezvcard.io.json.JsonValue;
import ezvcard.io.xml.XCardElement;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.VCardProperty;
import ezvcard.util.ISOFormat;
import ezvcard.util.StringUtils;
import ezvcard.util.VCardDateFormatter;
import ezvcard.util.XmlUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

public abstract class VCardPropertyScribe
{
    protected static class DateWriter
    {

        private Date date;
        private boolean extended;
        private boolean hasTime;
        private boolean utc;

        public DateWriter extended(boolean flag)
        {
            extended = flag;
            return this;
        }

        public DateWriter time(boolean flag)
        {
            hasTime = flag;
            return this;
        }

        public DateWriter utc(boolean flag)
        {
            utc = flag;
            return this;
        }

        public String write()
        {
            ISOFormat isoformat;
            if (hasTime)
            {
                if (utc)
                {
                    if (extended)
                    {
                        isoformat = ISOFormat.UTC_TIME_EXTENDED;
                    } else
                    {
                        isoformat = ISOFormat.UTC_TIME_BASIC;
                    }
                } else
                if (extended)
                {
                    isoformat = ISOFormat.TIME_EXTENDED;
                } else
                {
                    isoformat = ISOFormat.TIME_BASIC;
                }
            } else
            if (extended)
            {
                isoformat = ISOFormat.DATE_EXTENDED;
            } else
            {
                isoformat = ISOFormat.DATE_BASIC;
            }
            return VCardDateFormatter.format(date, isoformat);
        }

        public DateWriter(Date date1)
        {
            hasTime = true;
            extended = false;
            utc = true;
            date = date1;
        }
    }

    public static class Result
    {

        private final VCardProperty property;
        private final List warnings;

        public VCardProperty getProperty()
        {
            return property;
        }

        public List getWarnings()
        {
            return warnings;
        }

        public Result(VCardProperty vcardproperty, List list1)
        {
            property = vcardproperty;
            warnings = list1;
        }
    }

    protected static class SemiStructuredIterator
    {

        private final Iterator it;

        public boolean hasNext()
        {
            return it.hasNext();
        }

        public String next()
        {
            if (!hasNext())
            {
                return null;
            }
            String s1 = (String)it.next();
            String s = s1;
            if (s1.length() == 0)
            {
                s = null;
            }
            return s;
        }

        public SemiStructuredIterator(Iterator iterator)
        {
            it = iterator;
        }
    }

    protected static class Splitter
    {

        private String delimiter;
        private int limit;
        private boolean removeEmpties;
        private String string;
        private boolean unescape;

        public Splitter limit(int i)
        {
            limit = i;
            return this;
        }

        public Splitter removeEmpties(boolean flag)
        {
            removeEmpties = flag;
            return this;
        }

        public List split()
        {
            String as[] = string.split((new StringBuilder()).append("\\s*(?<!\\\\)").append(Pattern.quote(delimiter)).append("\\s*").toString(), limit);
            ArrayList arraylist = new ArrayList(as.length);
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                String s1 = as[i];
                if (s1.length() != 0 || !removeEmpties)
                {
                    String s = s1;
                    if (unescape)
                    {
                        s = VCardPropertyScribe.unescape(s1);
                    }
                    arraylist.add(s);
                }
                i++;
            }
            return arraylist;
        }

        public Splitter unescape(boolean flag)
        {
            unescape = flag;
            return this;
        }

        public Splitter(String s, String s1)
        {
            removeEmpties = false;
            unescape = false;
            limit = -1;
            string = s;
            delimiter = s1;
        }
    }

    protected static class StructuredIterator
    {

        private final Iterator it;

        public boolean hasNext()
        {
            return it.hasNext();
        }

        public List nextComponent()
        {
            Object obj;
            if (!hasNext())
            {
                obj = new ArrayList(0);
            } else
            {
                List list1 = (List)it.next();
                obj = list1;
                if (list1.size() == 1)
                {
                    obj = list1;
                    if (((String)list1.get(0)).length() == 0)
                    {
                        return new ArrayList(0);
                    }
                }
            }
            return ((List) (obj));
        }

        public String nextString()
        {
            Object obj;
            if (hasNext())
            {
                if (!((List) (obj = (List)it.next())).isEmpty())
                {
                    String s = (String)((List) (obj)).get(0);
                    obj = s;
                    if (s.length() == 0)
                    {
                        obj = null;
                    }
                    return ((String) (obj));
                }
            }
            return null;
        }

        public StructuredIterator(Iterator iterator)
        {
            it = iterator;
        }
    }


    protected final Class clazz;
    protected final String propertyName;
    protected final QName qname;

    public VCardPropertyScribe(Class class1, String s)
    {
        this(class1, s, new QName(VCardVersion.V4_0.getXmlNamespace(), s.toLowerCase()));
    }

    public VCardPropertyScribe(Class class1, String s, QName qname1)
    {
        clazz = class1;
        propertyName = s;
        qname = qname1;
    }

    protected static DateWriter date(Date date1)
    {
        return new DateWriter(date1);
    }

    protected static Date date(String s)
    {
        return VCardDateFormatter.parse(s);
    }

    public static String escape(String s)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            StringBuilder stringbuilder = null;
            for (int i = 0; i < s.length();)
            {
                char c = s.charAt(i);
                StringBuilder stringbuilder1 = stringbuilder;
                if ("\\,;".indexOf(c) >= 0)
                {
                    stringbuilder1 = stringbuilder;
                    if (stringbuilder == null)
                    {
                        stringbuilder1 = new StringBuilder(s.length());
                        stringbuilder1.append(s.substring(0, i));
                    }
                    stringbuilder1.append('\\');
                }
                if (stringbuilder1 != null)
                {
                    stringbuilder1.append(c);
                }
                i++;
                stringbuilder = stringbuilder1;
            }

            if (stringbuilder != null)
            {
                return stringbuilder.toString();
            }
        }
        return s;
    }

    protected static void handlePrefParam(VCardProperty vcardproperty, VCardParameters vcardparameters, VCardVersion vcardversion, VCard vcard)
    {
        static class _cls4
        {

            static final int $SwitchMap$ezvcard$VCardVersion[];

            static 
            {
                $SwitchMap$ezvcard$VCardVersion = new int[VCardVersion.values().length];
                try
                {
                    $SwitchMap$ezvcard$VCardVersion[VCardVersion.V2_1.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$ezvcard$VCardVersion[VCardVersion.V3_0.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$ezvcard$VCardVersion[VCardVersion.V4_0.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls4..SwitchMap.ezvcard.VCardVersion[vcardversion.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 37
    //                   2 37
    //                   3 133;
           goto _L1 _L2 _L2 _L3
_L1:
        return;
_L2:
        vcardparameters.setPref(null);
        vcardversion = null;
        Iterator iterator = vcard.getProperties(vcardproperty.getClass()).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            vcard = (VCardProperty)iterator.next();
            Integer integer = vcard.getParameters().getPref();
            if (integer != null && (vcardversion == null || integer.intValue() < vcardversion.getParameters().getPref().intValue()))
            {
                vcardversion = vcard;
            }
        } while (true);
        if (vcardproperty == vcardversion)
        {
            vcardparameters.addType("pref");
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        vcardproperty = vcardproperty.getParameters().getTypes().iterator();
        do
        {
            if (!vcardproperty.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            vcardversion = (String)vcardproperty.next();
        } while (!"pref".equalsIgnoreCase(vcardversion));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L4
_L4:
        vcardparameters.removeType(vcardversion);
        vcardparameters.setPref(Integer.valueOf(1));
        return;
    }

    private static String jcardValueToString(JCardValue jcardvalue)
    {
        if (jcardvalue.getValues().size() > 1)
        {
            List list1 = jcardvalue.asMulti();
            if (!list1.isEmpty())
            {
                return list(list1);
            }
        }
        if (!jcardvalue.getValues().isEmpty() && ((JsonValue)jcardvalue.getValues().get(0)).getArray() != null)
        {
            List list2 = jcardvalue.asStructured();
            if (!list2.isEmpty())
            {
                return structured(list2.toArray());
            }
        }
        return escape(jcardvalue.asSingle());
    }

    protected static String list(Collection collection)
    {
        return StringUtils.join(collection, ",", new ezvcard.util.StringUtils.JoinCallback() {

            public void handle(StringBuilder stringbuilder, Object obj)
            {
                if (obj == null)
                {
                    return;
                } else
                {
                    stringbuilder.append(VCardPropertyScribe.escape(obj.toString()));
                    return;
                }
            }

        });
    }

    protected static transient String list(Object aobj[])
    {
        return list(((Collection) (Arrays.asList(aobj))));
    }

    protected static List list(String s)
    {
        if (s.length() == 0)
        {
            return new ArrayList(0);
        } else
        {
            return split(s, ",").unescape(true).split();
        }
    }

    protected static transient CannotParseException missingXmlElements(VCardDataType avcarddatatype[])
    {
        String as[] = new String[avcarddatatype.length];
        int i = 0;
        while (i < avcarddatatype.length) 
        {
            Object obj = avcarddatatype[i];
            if (obj == null)
            {
                obj = "unknown";
            } else
            {
                obj = ((VCardDataType) (obj)).getName().toLowerCase();
            }
            as[i] = ((String) (obj));
            i++;
        }
        return missingXmlElements(as);
    }

    protected static transient CannotParseException missingXmlElements(String as[])
    {
        as.length;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 109
    //                   1 116
    //                   2 148;
           goto _L1 _L2 _L3 _L4
_L1:
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Property value empty (no ");
        StringUtils.join(Arrays.asList(as).subList(0, as.length - 1), ", ", stringbuilder, new ezvcard.util.StringUtils.JoinCallback() {

            public volatile void handle(StringBuilder stringbuilder1, Object obj)
            {
                handle(stringbuilder1, (String)obj);
            }

            public void handle(StringBuilder stringbuilder1, String s)
            {
                stringbuilder1.append('<').append(s).append('>');
            }

        });
        stringbuilder.append(", or <").append(as[as.length - 1]).append("> elements found).");
        as = stringbuilder.toString();
_L6:
        return new CannotParseException(as);
_L2:
        as = "Property value empty.";
        continue; /* Loop/switch isn't completed */
_L3:
        as = (new StringBuilder()).append("Property value empty (no <").append(as[0]).append("> element found).").toString();
        continue; /* Loop/switch isn't completed */
_L4:
        as = (new StringBuilder()).append("Property value empty (no <").append(as[0]).append("> or <").append(as[1]).append("> elements found).").toString();
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected static SemiStructuredIterator semistructured(String s)
    {
        return semistructured(s, -1);
    }

    protected static SemiStructuredIterator semistructured(String s, int i)
    {
        return new SemiStructuredIterator(split(s, ";").unescape(true).limit(i).split().iterator());
    }

    protected static Splitter split(String s, String s1)
    {
        return new Splitter(s, s1);
    }

    protected static StructuredIterator structured(JCardValue jcardvalue)
    {
        return new StructuredIterator(jcardvalue.asStructured().iterator());
    }

    protected static StructuredIterator structured(String s)
    {
        Object obj = split(s, ";").split();
        s = new ArrayList(((List) (obj)).size());
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.add(list((String)((Iterator) (obj)).next()))) { }
        return new StructuredIterator(s.iterator());
    }

    protected static transient String structured(Object aobj[])
    {
        return StringUtils.join(Arrays.asList(aobj), ";", new ezvcard.util.StringUtils.JoinCallback() {

            public void handle(StringBuilder stringbuilder, Object obj)
            {
                if (obj == null)
                {
                    return;
                }
                if (obj instanceof Collection)
                {
                    stringbuilder.append(VCardPropertyScribe.list((Collection)obj));
                    return;
                } else
                {
                    stringbuilder.append(VCardPropertyScribe.escape(obj.toString()));
                    return;
                }
            }

        });
    }

    public static String unescape(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L8:
        return s;
_L2:
        StringBuilder stringbuilder;
        int i;
        boolean flag1;
        stringbuilder = null;
        flag1 = false;
        i = 0;
_L4:
        char c;
        StringBuilder stringbuilder1;
        boolean flag;
        if (i >= s.length())
        {
            continue; /* Loop/switch isn't completed */
        }
        c = s.charAt(i);
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder1 = stringbuilder;
        if (stringbuilder == null)
        {
            stringbuilder1 = new StringBuilder(s.length());
            stringbuilder1.append(s.substring(0, i - 1));
        }
        flag = false;
        if (c == 'n' || c == 'N')
        {
            stringbuilder1.append(StringUtils.NEWLINE);
        } else
        {
            stringbuilder1.append(c);
        }
_L5:
        i++;
        flag1 = flag;
        stringbuilder = stringbuilder1;
        if (true) goto _L4; else goto _L3
_L3:
        if (c == '\\')
        {
            flag = true;
            stringbuilder1 = stringbuilder;
        } else
        {
            flag = flag1;
            stringbuilder1 = stringbuilder;
            if (stringbuilder != null)
            {
                stringbuilder.append(c);
                flag = flag1;
                stringbuilder1 = stringbuilder;
            }
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
        if (stringbuilder == null) goto _L8; else goto _L7
_L7:
        return stringbuilder.toString();
    }

    protected VCardDataType _dataType(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _defaultDataType(vcardversion);
    }

    protected abstract VCardDataType _defaultDataType(VCardVersion vcardversion);

    protected VCardProperty _parseHtml(HCardElement hcardelement, List list1)
    {
        String s = escape(hcardelement.value());
        hcardelement = new VCardParameters();
        list1 = _parseText(s, null, VCardVersion.V3_0, hcardelement, list1);
        list1.setParameters(hcardelement);
        return list1;
    }

    protected VCardProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list1)
    {
        return _parseText(jcardValueToString(jcardvalue), vcarddatatype, VCardVersion.V4_0, vcardparameters, list1);
    }

    protected abstract VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list1);

    protected VCardProperty _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list1)
    {
        Object obj1 = null;
        Object obj2 = null;
        Element element = xcardelement.element();
        Iterator iterator = XmlUtils.toElementList(element.getChildNodes()).iterator();
        Object obj;
        VCardDataType vcarddatatype;
        do
        {
            obj = obj1;
            vcarddatatype = obj2;
            if (!iterator.hasNext())
            {
                break;
            }
            obj = (Element)iterator.next();
            if (!xcardelement.version().getXmlNamespace().equals(((Element) (obj)).getNamespaceURI()))
            {
                continue;
            }
            vcarddatatype = VCardDataType.get(((Element) (obj)).getLocalName());
            obj = ((Element) (obj)).getTextContent();
            break;
        } while (true);
        if (vcarddatatype == null)
        {
            obj = element.getTextContent();
        }
        return _parseText(escape(((String) (obj))), vcarddatatype, xcardelement.version(), vcardparameters, list1);
    }

    protected void _prepareParameters(VCardProperty vcardproperty, VCardParameters vcardparameters, VCardVersion vcardversion, VCard vcard)
    {
    }

    protected JCardValue _writeJson(VCardProperty vcardproperty)
    {
        return JCardValue.single(writeText(vcardproperty, VCardVersion.V4_0));
    }

    protected abstract String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion);

    protected void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        String s = writeText(vcardproperty, VCardVersion.V4_0);
        xcardelement.append(dataType(vcardproperty, VCardVersion.V4_0), s);
    }

    public final VCardDataType dataType(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _dataType(vcardproperty, vcardversion);
    }

    public final VCardDataType defaultDataType(VCardVersion vcardversion)
    {
        return _defaultDataType(vcardversion);
    }

    public Class getPropertyClass()
    {
        return clazz;
    }

    public String getPropertyName()
    {
        return propertyName;
    }

    public QName getQName()
    {
        return qname;
    }

    public final Result parseHtml(org.jsoup.nodes.Element element)
    {
        element = new HCardElement(element);
        ArrayList arraylist = new ArrayList(0);
        return new Result(_parseHtml(element, arraylist), arraylist);
    }

    public final Result parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters)
    {
        ArrayList arraylist = new ArrayList(0);
        jcardvalue = _parseJson(jcardvalue, vcarddatatype, vcardparameters, arraylist);
        jcardvalue.setParameters(vcardparameters);
        return new Result(jcardvalue, arraylist);
    }

    public final Result parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters)
    {
        ArrayList arraylist = new ArrayList(0);
        s = _parseText(s, vcarddatatype, vcardversion, vcardparameters, arraylist);
        s.setParameters(vcardparameters);
        return new Result(s, arraylist);
    }

    public final Result parseXml(Element element, VCardParameters vcardparameters)
    {
        ArrayList arraylist = new ArrayList(0);
        element = _parseXml(new XCardElement(element), vcardparameters, arraylist);
        element.setParameters(vcardparameters);
        return new Result(element, arraylist);
    }

    public final VCardParameters prepareParameters(VCardProperty vcardproperty, VCardVersion vcardversion, VCard vcard)
    {
        VCardParameters vcardparameters = new VCardParameters(vcardproperty.getParameters());
        _prepareParameters(vcardproperty, vcardparameters, vcardversion, vcard);
        return vcardparameters;
    }

    public final JCardValue writeJson(VCardProperty vcardproperty)
    {
        return _writeJson(vcardproperty);
    }

    public final String writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText(vcardproperty, vcardversion);
    }

    public final void writeXml(VCardProperty vcardproperty, Element element)
    {
        _writeXml(vcardproperty, new XCardElement(element));
    }
}

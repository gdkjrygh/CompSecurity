// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.html;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.io.EmbeddedVCardException;
import ezvcard.io.SkipMeException;
import ezvcard.io.scribe.RawPropertyScribe;
import ezvcard.io.scribe.ScribeIndex;
import ezvcard.io.scribe.VCardPropertyScribe;
import ezvcard.property.Address;
import ezvcard.property.Categories;
import ezvcard.property.Email;
import ezvcard.property.Impp;
import ezvcard.property.Label;
import ezvcard.property.Nickname;
import ezvcard.property.RawProperty;
import ezvcard.property.Source;
import ezvcard.property.Telephone;
import ezvcard.property.Url;
import ezvcard.util.HtmlUtils;
import ezvcard.util.StringUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HCardReader
{

    private Categories categories;
    private final String categoriesName;
    private VCard curVCard;
    private final String emailName;
    private Elements embeddedVCards;
    private ScribeIndex index;
    private Iterator it;
    private final List labels;
    private Nickname nickname;
    private String pageUrl;
    private final String telName;
    private final String urlPropertyName;
    private Elements vcardElements;
    private final List warnings;

    public HCardReader(File file)
        throws IOException
    {
        this(file, null);
    }

    public HCardReader(File file, String s)
        throws IOException
    {
        index = new ScribeIndex();
        warnings = new ArrayList();
        labels = new ArrayList();
        embeddedVCards = new Elements();
        urlPropertyName = index.getPropertyScribe(ezvcard/property/Url).getPropertyName().toLowerCase();
        categoriesName = index.getPropertyScribe(ezvcard/property/Categories).getPropertyName().toLowerCase();
        emailName = index.getPropertyScribe(ezvcard/property/Email).getPropertyName().toLowerCase();
        telName = index.getPropertyScribe(ezvcard/property/Telephone).getPropertyName().toLowerCase();
        pageUrl = s;
        if (s == null)
        {
            file = Jsoup.parse(file, null, "");
        } else
        {
            file = Jsoup.parse(file, null, s);
        }
        init(file, getAnchor(s));
    }

    public HCardReader(InputStream inputstream)
        throws IOException
    {
        this(inputstream, null);
    }

    public HCardReader(InputStream inputstream, String s)
        throws IOException
    {
        index = new ScribeIndex();
        warnings = new ArrayList();
        labels = new ArrayList();
        embeddedVCards = new Elements();
        urlPropertyName = index.getPropertyScribe(ezvcard/property/Url).getPropertyName().toLowerCase();
        categoriesName = index.getPropertyScribe(ezvcard/property/Categories).getPropertyName().toLowerCase();
        emailName = index.getPropertyScribe(ezvcard/property/Email).getPropertyName().toLowerCase();
        telName = index.getPropertyScribe(ezvcard/property/Telephone).getPropertyName().toLowerCase();
        pageUrl = s;
        if (s == null)
        {
            inputstream = Jsoup.parse(inputstream, null, "");
        } else
        {
            inputstream = Jsoup.parse(inputstream, null, s);
        }
        init(inputstream, getAnchor(s));
    }

    public HCardReader(Reader reader)
        throws IOException
    {
        this(reader, null);
    }

    public HCardReader(Reader reader, String s)
        throws IOException
    {
        index = new ScribeIndex();
        warnings = new ArrayList();
        labels = new ArrayList();
        embeddedVCards = new Elements();
        urlPropertyName = index.getPropertyScribe(ezvcard/property/Url).getPropertyName().toLowerCase();
        categoriesName = index.getPropertyScribe(ezvcard/property/Categories).getPropertyName().toLowerCase();
        emailName = index.getPropertyScribe(ezvcard/property/Email).getPropertyName().toLowerCase();
        telName = index.getPropertyScribe(ezvcard/property/Telephone).getPropertyName().toLowerCase();
        pageUrl = s;
        StringBuilder stringbuilder = new StringBuilder();
        char ac[] = new char[4096];
        do
        {
            int i = reader.read(ac);
            if (i == -1)
            {
                break;
            }
            stringbuilder.append(ac, 0, i);
        } while (true);
        reader = stringbuilder.toString();
        if (s == null)
        {
            reader = Jsoup.parse(reader);
        } else
        {
            reader = Jsoup.parse(reader, s);
        }
        init(reader, getAnchor(s));
    }

    public HCardReader(String s)
    {
        this(s, null);
    }

    public HCardReader(String s, String s1)
    {
        index = new ScribeIndex();
        warnings = new ArrayList();
        labels = new ArrayList();
        embeddedVCards = new Elements();
        urlPropertyName = index.getPropertyScribe(ezvcard/property/Url).getPropertyName().toLowerCase();
        categoriesName = index.getPropertyScribe(ezvcard/property/Categories).getPropertyName().toLowerCase();
        emailName = index.getPropertyScribe(ezvcard/property/Email).getPropertyName().toLowerCase();
        telName = index.getPropertyScribe(ezvcard/property/Telephone).getPropertyName().toLowerCase();
        pageUrl = s1;
        if (s1 == null)
        {
            s = Jsoup.parse(s);
        } else
        {
            s = Jsoup.parse(s, s1);
        }
        init(s, getAnchor(s1));
    }

    public HCardReader(URL url)
        throws IOException
    {
        index = new ScribeIndex();
        warnings = new ArrayList();
        labels = new ArrayList();
        embeddedVCards = new Elements();
        urlPropertyName = index.getPropertyScribe(ezvcard/property/Url).getPropertyName().toLowerCase();
        categoriesName = index.getPropertyScribe(ezvcard/property/Categories).getPropertyName().toLowerCase();
        emailName = index.getPropertyScribe(ezvcard/property/Email).getPropertyName().toLowerCase();
        telName = index.getPropertyScribe(ezvcard/property/Telephone).getPropertyName().toLowerCase();
        pageUrl = url.toString();
        init(Jsoup.parse(url, 30000), url.getRef());
    }

    private HCardReader(Element element, String s)
    {
        index = new ScribeIndex();
        warnings = new ArrayList();
        labels = new ArrayList();
        embeddedVCards = new Elements();
        urlPropertyName = index.getPropertyScribe(ezvcard/property/Url).getPropertyName().toLowerCase();
        categoriesName = index.getPropertyScribe(ezvcard/property/Categories).getPropertyName().toLowerCase();
        emailName = index.getPropertyScribe(ezvcard/property/Email).getPropertyName().toLowerCase();
        telName = index.getPropertyScribe(ezvcard/property/Telephone).getPropertyName().toLowerCase();
        pageUrl = s;
        vcardElements = new Elements(new Element[] {
            element
        });
        it = vcardElements.iterator();
    }

    private void addWarning(String s, String s1)
    {
        warnings.add((new StringBuilder()).append(s1).append(" property: ").append(s).toString());
    }

    private String getAnchor(String s)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = (new URL(s)).getRef();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private void init(Document document, String s)
    {
        Element element = null;
        if (s != null)
        {
            element = document.getElementById(s);
        }
        s = element;
        if (element == null)
        {
            s = document;
        }
        vcardElements = s.getElementsByClass("vcard");
        it = vcardElements.iterator();
    }

    private void visit(Element element)
    {
        Set set;
        Iterator iterator;
        set = element.classNames();
        iterator = set.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        String s;
        s = ((String)iterator.next()).toLowerCase();
        obj = s;
        if (urlPropertyName.equalsIgnoreCase(s))
        {
            Object obj1 = element.attr("href");
            obj = s;
            if (((String) (obj1)).length() > 0)
            {
                if (!set.contains(emailName) && ((String) (obj1)).matches("(?i)mailto:.*"))
                {
                    obj = emailName;
                } else
                {
label0:
                    {
                        if (set.contains(telName) || !((String) (obj1)).matches("(?i)tel:.*"))
                        {
                            break label0;
                        }
                        obj = telName;
                    }
                }
            }
        }
_L5:
        s = ((String) (obj));
        if ("category".equalsIgnoreCase(((String) (obj))))
        {
            s = categoriesName;
        }
        obj1 = index.getPropertyScribe(s);
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        if (!s.startsWith("x-")) goto _L4; else goto _L3
_L3:
        obj = new RawPropertyScribe(s);
        obj = ((VCardPropertyScribe) (obj)).parseHtml(element);
        for (obj1 = ((ezvcard.io.scribe.VCardPropertyScribe.Result) (obj)).getWarnings().iterator(); ((Iterator) (obj1)).hasNext(); addWarning((String)((Iterator) (obj1)).next(), s)) { }
        break MISSING_BLOCK_LABEL_340;
        obj;
        addWarning((new StringBuilder()).append("Property has requested that it be skipped: ").append(((SkipMeException) (obj)).getMessage()).toString(), s);
          goto _L4
        obj = index.getPropertyScribe(ezvcard/property/Impp);
        Object obj2 = ((VCardPropertyScribe) (obj)).parseHtml(element);
        curVCard.addProperty(((ezvcard.io.scribe.VCardPropertyScribe.Result) (obj2)).getProperty());
        obj2 = ((ezvcard.io.scribe.VCardPropertyScribe.Result) (obj2)).getWarnings().iterator();
        while (((Iterator) (obj2)).hasNext()) 
        {
            addWarning((String)((Iterator) (obj2)).next(), ((VCardPropertyScribe) (obj)).getPropertyName());
        }
          goto _L4
        obj;
        obj = s;
          goto _L5
        Object obj3 = ((ezvcard.io.scribe.VCardPropertyScribe.Result) (obj)).getProperty();
        if (!(obj3 instanceof Label)) goto _L7; else goto _L6
_L6:
        labels.add((Label)obj3);
          goto _L4
        CannotParseException cannotparseexception;
        cannotparseexception;
        obj3 = element.outerHtml();
        addWarning((new StringBuilder()).append("Property value could not be parsed.  Property will be saved as an extended property instead.").append(StringUtils.NEWLINE).append("  HTML: ").append(((String) (obj3))).append(StringUtils.NEWLINE).append("  Reason: ").append(cannotparseexception.getMessage()).toString(), s);
        cannotparseexception = new RawProperty(s, ((String) (obj3)));
_L10:
        curVCard.addProperty(cannotparseexception);
          goto _L4
_L7:
        if (!(obj3 instanceof Nickname))
        {
            break MISSING_BLOCK_LABEL_632;
        }
        cannotparseexception = (Nickname)obj3;
        if (nickname != null)
        {
            break MISSING_BLOCK_LABEL_612;
        }
        nickname = cannotparseexception;
        curVCard.addProperty(nickname);
          goto _L4
        EmbeddedVCardException embeddedvcardexception;
        embeddedvcardexception;
        if (HtmlUtils.isChildOf(element, embeddedVCards)) goto _L4; else goto _L8
_L8:
        obj3 = embeddedvcardexception.getProperty();
        embeddedVCards.add(element);
        cannotparseexception = new HCardReader(element, pageUrl);
        embeddedvcardexception.injectVCard(cannotparseexception.readNext());
        Iterator iterator1 = cannotparseexception.getWarnings().iterator();
_L11:
        cannotparseexception = ((CannotParseException) (obj3));
        if (!iterator1.hasNext()) goto _L10; else goto _L9
_L9:
        cannotparseexception = (String)iterator1.next();
        addWarning((new StringBuilder()).append("Problem unmarshalling nested vCard value: ").append(cannotparseexception).toString(), s);
          goto _L11
        nickname.getValues().addAll(cannotparseexception.getValues());
          goto _L4
        cannotparseexception = ((CannotParseException) (obj3));
        if (!(obj3 instanceof Categories)) goto _L10; else goto _L12
_L12:
        cannotparseexception = (Categories)obj3;
        if (categories != null)
        {
            break MISSING_BLOCK_LABEL_675;
        }
        categories = cannotparseexception;
        curVCard.addProperty(categories);
          goto _L4
        categories.getValues().addAll(cannotparseexception.getValues());
          goto _L4
        element;
        String s1;
        for (cannotparseexception = cannotparseexception.getWarnings().iterator(); cannotparseexception.hasNext(); addWarning((new StringBuilder()).append("Problem unmarshalling nested vCard value: ").append(s1).toString(), s))
        {
            s1 = (String)cannotparseexception.next();
        }

        throw element;
_L2:
        for (element = element.children().iterator(); element.hasNext(); visit((Element)element.next())) { }
        return;
        cannotparseexception;
        cannotparseexception = s;
          goto _L5
    }

    public ScribeIndex getScribeIndex()
    {
        return index;
    }

    public List getWarnings()
    {
        return new ArrayList(warnings);
    }

    public VCard readNext()
    {
        Object obj = null;
        do
        {
            if (!it.hasNext() || obj != null)
            {
                break;
            }
            Element element = (Element)it.next();
            obj = element;
            if (HtmlUtils.isChildOf(element, vcardElements))
            {
                obj = null;
            }
        } while (true);
        if (obj == null)
        {
            return null;
        }
        warnings.clear();
        labels.clear();
        nickname = null;
        categories = null;
        curVCard = new VCard();
        curVCard.setVersion(VCardVersion.V3_0);
        if (pageUrl != null)
        {
            curVCard.addSource(new Source(pageUrl));
        }
        for (obj = ((Element) (obj)).children().iterator(); ((Iterator) (obj)).hasNext(); visit((Element)((Iterator) (obj)).next())) { }
        obj = labels.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Label label = (Label)((Iterator) (obj)).next();
            boolean flag1 = true;
            Iterator iterator = curVCard.getAddresses().iterator();
            boolean flag;
            do
            {
                flag = flag1;
                if (!iterator.hasNext())
                {
                    break;
                }
                Address address = (Address)iterator.next();
                if (address.getLabel() != null || !address.getTypes().equals(label.getTypes()))
                {
                    continue;
                }
                address.setLabel((String)label.getValue());
                flag = false;
                break;
            } while (true);
            if (flag)
            {
                curVCard.addOrphanedLabel(label);
            }
        } while (true);
        return curVCard;
    }

    public void registerScribe(VCardPropertyScribe vcardpropertyscribe)
    {
        index.register(vcardpropertyscribe);
    }

    public void setScribeIndex(ScribeIndex scribeindex)
    {
        index = scribeindex;
    }
}

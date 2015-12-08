// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.io.html.HCardPage;
import ezvcard.io.html.HCardReader;
import ezvcard.io.json.JCardReader;
import ezvcard.io.json.JCardWriter;
import ezvcard.io.scribe.ScribeIndex;
import ezvcard.io.scribe.VCardPropertyScribe;
import ezvcard.io.text.VCardReader;
import ezvcard.io.text.VCardWriter;
import ezvcard.io.xml.XCardDocument;
import ezvcard.util.IOUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

// Referenced classes of package ezvcard:
//            VCard, VCardVersion

public class Ezvcard
{
    static abstract class ParserChain
    {

        final ScribeIndex index = new ScribeIndex();
        final Object this_ = this;
        List warnings;

        public abstract List all()
            throws IOException, SAXException;

        public abstract VCard first()
            throws IOException, SAXException;

        public Object register(VCardPropertyScribe vcardpropertyscribe)
        {
            index.register(vcardpropertyscribe);
            return this_;
        }

        public Object warnings(List list)
        {
            warnings = list;
            return this_;
        }

        ParserChain()
        {
        }
    }

    static abstract class ParserChainHtml extends ParserChain
    {

        String pageUrl;

        private HCardReader constructReader()
            throws IOException
        {
            HCardReader hcardreader = _constructReader();
            hcardreader.setScribeIndex(index);
            return hcardreader;
        }

        abstract HCardReader _constructReader()
            throws IOException;

        public List all()
            throws IOException
        {
            HCardReader hcardreader = constructReader();
            ArrayList arraylist = new ArrayList();
            do
            {
                VCard vcard = hcardreader.readNext();
                if (vcard != null)
                {
                    if (warnings != null)
                    {
                        warnings.add(hcardreader.getWarnings());
                    }
                    arraylist.add(vcard);
                } else
                {
                    return arraylist;
                }
            } while (true);
        }

        public VCard first()
            throws IOException
        {
            HCardReader hcardreader = constructReader();
            VCard vcard = hcardreader.readNext();
            if (warnings != null)
            {
                warnings.add(hcardreader.getWarnings());
            }
            return vcard;
        }

        public Object pageUrl(String s)
        {
            pageUrl = s;
            return this_;
        }

        ParserChainHtml()
        {
        }
    }

    public static class ParserChainHtmlReader extends ParserChainHtml
    {

        private final File file;
        private final Reader reader;
        private final URL url;

        HCardReader _constructReader()
            throws IOException
        {
            if (reader != null)
            {
                return new HCardReader(reader, pageUrl);
            }
            if (file != null)
            {
                return new HCardReader(file, pageUrl);
            } else
            {
                return new HCardReader(url);
            }
        }

        public volatile List all()
            throws IOException
        {
            return super.all();
        }

        public volatile VCard first()
            throws IOException
        {
            return super.first();
        }

        public ParserChainHtmlReader pageUrl(String s)
        {
            return (ParserChainHtmlReader)super.pageUrl(s);
        }

        public volatile Object pageUrl(String s)
        {
            return pageUrl(s);
        }

        public ParserChainHtmlReader register(VCardPropertyScribe vcardpropertyscribe)
        {
            return (ParserChainHtmlReader)super.register(vcardpropertyscribe);
        }

        public volatile Object register(VCardPropertyScribe vcardpropertyscribe)
        {
            return register(vcardpropertyscribe);
        }

        public ParserChainHtmlReader warnings(List list)
        {
            return (ParserChainHtmlReader)super.warnings(list);
        }

        public volatile Object warnings(List list)
        {
            return warnings(list);
        }

        private ParserChainHtmlReader(File file1)
        {
            reader = null;
            file = file1;
            url = null;
        }


        private ParserChainHtmlReader(Reader reader1)
        {
            reader = reader1;
            file = null;
            url = null;
        }


        private ParserChainHtmlReader(URL url1)
        {
            reader = null;
            file = null;
            url = url1;
        }

    }

    public static class ParserChainHtmlString extends ParserChainHtml
    {

        private final String html;

        HCardReader _constructReader()
        {
            return new HCardReader(html, pageUrl);
        }

        public List all()
        {
            List list;
            try
            {
                list = super.all();
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException(ioexception);
            }
            return list;
        }

        public VCard first()
        {
            VCard vcard;
            try
            {
                vcard = super.first();
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException(ioexception);
            }
            return vcard;
        }

        public ParserChainHtmlString pageUrl(String s)
        {
            return (ParserChainHtmlString)super.pageUrl(s);
        }

        public volatile Object pageUrl(String s)
        {
            return pageUrl(s);
        }

        public ParserChainHtmlString register(VCardPropertyScribe vcardpropertyscribe)
        {
            return (ParserChainHtmlString)super.register(vcardpropertyscribe);
        }

        public volatile Object register(VCardPropertyScribe vcardpropertyscribe)
        {
            return register(vcardpropertyscribe);
        }

        public ParserChainHtmlString warnings(List list)
        {
            return (ParserChainHtmlString)super.warnings(list);
        }

        public volatile Object warnings(List list)
        {
            return warnings(list);
        }

        private ParserChainHtmlString(String s)
        {
            html = s;
        }

    }

    static abstract class ParserChainJson extends ParserChain
    {

        final boolean closeWhenDone;

        private JCardReader constructReader()
            throws IOException
        {
            JCardReader jcardreader = _constructReader();
            jcardreader.setScribeIndex(index);
            return jcardreader;
        }

        abstract JCardReader _constructReader()
            throws IOException;

        public List all()
            throws IOException
        {
            JCardReader jcardreader = constructReader();
            Object obj = new ArrayList();
_L1:
            VCard vcard = jcardreader.readNext();
            if (vcard == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            if (warnings != null)
            {
                warnings.add(jcardreader.getWarnings());
            }
            ((List) (obj)).add(vcard);
              goto _L1
            obj;
            if (closeWhenDone)
            {
                IOUtils.closeQuietly(jcardreader);
            }
            throw obj;
            if (closeWhenDone)
            {
                IOUtils.closeQuietly(jcardreader);
            }
            return ((List) (obj));
        }

        public VCard first()
            throws IOException
        {
            JCardReader jcardreader = constructReader();
            VCard vcard;
            vcard = jcardreader.readNext();
            if (warnings != null)
            {
                warnings.add(jcardreader.getWarnings());
            }
            if (closeWhenDone)
            {
                IOUtils.closeQuietly(jcardreader);
            }
            return vcard;
            Exception exception;
            exception;
            if (closeWhenDone)
            {
                IOUtils.closeQuietly(jcardreader);
            }
            throw exception;
        }

        private ParserChainJson(boolean flag)
        {
            closeWhenDone = flag;
        }

    }

    public static class ParserChainJsonReader extends ParserChainJson
    {

        private final File file;
        private final InputStream in;
        private final Reader reader;

        JCardReader _constructReader()
            throws IOException
        {
            if (in != null)
            {
                return new JCardReader(in);
            }
            if (file != null)
            {
                return new JCardReader(file);
            } else
            {
                return new JCardReader(reader);
            }
        }

        public volatile List all()
            throws IOException
        {
            return super.all();
        }

        public volatile VCard first()
            throws IOException
        {
            return super.first();
        }

        public ParserChainJsonReader register(VCardPropertyScribe vcardpropertyscribe)
        {
            return (ParserChainJsonReader)super.register(vcardpropertyscribe);
        }

        public volatile Object register(VCardPropertyScribe vcardpropertyscribe)
        {
            return register(vcardpropertyscribe);
        }

        public ParserChainJsonReader warnings(List list)
        {
            return (ParserChainJsonReader)super.warnings(list);
        }

        public volatile Object warnings(List list)
        {
            return warnings(list);
        }

        private ParserChainJsonReader(File file1)
        {
            super(true);
            in = null;
            reader = null;
            file = file1;
        }


        private ParserChainJsonReader(InputStream inputstream)
        {
            super(false);
            in = inputstream;
            reader = null;
            file = null;
        }


        private ParserChainJsonReader(Reader reader1)
        {
            super(false);
            in = null;
            reader = reader1;
            file = null;
        }

    }

    public static class ParserChainJsonString extends ParserChainJson
    {

        private final String json;

        JCardReader _constructReader()
        {
            return new JCardReader(json);
        }

        public List all()
        {
            List list;
            try
            {
                list = super.all();
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException(ioexception);
            }
            return list;
        }

        public VCard first()
        {
            VCard vcard;
            try
            {
                vcard = super.first();
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException(ioexception);
            }
            return vcard;
        }

        public ParserChainJsonString register(VCardPropertyScribe vcardpropertyscribe)
        {
            return (ParserChainJsonString)super.register(vcardpropertyscribe);
        }

        public volatile Object register(VCardPropertyScribe vcardpropertyscribe)
        {
            return register(vcardpropertyscribe);
        }

        public ParserChainJsonString warnings(List list)
        {
            return (ParserChainJsonString)super.warnings(list);
        }

        public volatile Object warnings(List list)
        {
            return warnings(list);
        }

        private ParserChainJsonString(String s)
        {
            super(false);
            json = s;
        }

    }

    static abstract class ParserChainText extends ParserChain
    {

        boolean caretDecoding;
        final boolean closeWhenDone;

        private VCardReader constructReader()
            throws IOException
        {
            VCardReader vcardreader = _constructReader();
            vcardreader.setScribeIndex(index);
            vcardreader.setCaretDecodingEnabled(caretDecoding);
            return vcardreader;
        }

        abstract VCardReader _constructReader()
            throws IOException;

        public List all()
            throws IOException
        {
            VCardReader vcardreader = constructReader();
            Object obj = new ArrayList();
_L1:
            VCard vcard = vcardreader.readNext();
            if (vcard == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            if (warnings != null)
            {
                warnings.add(vcardreader.getWarnings());
            }
            ((List) (obj)).add(vcard);
              goto _L1
            obj;
            if (closeWhenDone)
            {
                IOUtils.closeQuietly(vcardreader);
            }
            throw obj;
            if (closeWhenDone)
            {
                IOUtils.closeQuietly(vcardreader);
            }
            return ((List) (obj));
        }

        public Object caretDecoding(boolean flag)
        {
            caretDecoding = flag;
            return this_;
        }

        public VCard first()
            throws IOException
        {
            VCardReader vcardreader = constructReader();
            VCard vcard;
            vcard = vcardreader.readNext();
            if (warnings != null)
            {
                warnings.add(vcardreader.getWarnings());
            }
            if (closeWhenDone)
            {
                IOUtils.closeQuietly(vcardreader);
            }
            return vcard;
            Exception exception;
            exception;
            if (closeWhenDone)
            {
                IOUtils.closeQuietly(vcardreader);
            }
            throw exception;
        }

        private ParserChainText(boolean flag)
        {
            caretDecoding = true;
            closeWhenDone = flag;
        }

    }

    public static class ParserChainTextReader extends ParserChainText
    {

        private final File file;
        private final Reader reader;

        VCardReader _constructReader()
            throws IOException
        {
            if (reader != null)
            {
                return new VCardReader(reader);
            } else
            {
                return new VCardReader(file);
            }
        }

        public volatile List all()
            throws IOException
        {
            return super.all();
        }

        public ParserChainTextReader caretDecoding(boolean flag)
        {
            return (ParserChainTextReader)super.caretDecoding(flag);
        }

        public volatile Object caretDecoding(boolean flag)
        {
            return caretDecoding(flag);
        }

        public volatile VCard first()
            throws IOException
        {
            return super.first();
        }

        public ParserChainTextReader register(VCardPropertyScribe vcardpropertyscribe)
        {
            return (ParserChainTextReader)super.register(vcardpropertyscribe);
        }

        public volatile Object register(VCardPropertyScribe vcardpropertyscribe)
        {
            return register(vcardpropertyscribe);
        }

        public ParserChainTextReader warnings(List list)
        {
            return (ParserChainTextReader)super.warnings(list);
        }

        public volatile Object warnings(List list)
        {
            return warnings(list);
        }

        private ParserChainTextReader(File file1)
        {
            super(true);
            reader = null;
            file = file1;
        }


        private ParserChainTextReader(Reader reader1)
        {
            super(false);
            reader = reader1;
            file = null;
        }

    }

    public static class ParserChainTextString extends ParserChainText
    {

        private final String text;

        VCardReader _constructReader()
        {
            return new VCardReader(text);
        }

        public List all()
        {
            List list;
            try
            {
                list = super.all();
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException(ioexception);
            }
            return list;
        }

        public ParserChainTextString caretDecoding(boolean flag)
        {
            return (ParserChainTextString)super.caretDecoding(flag);
        }

        public volatile Object caretDecoding(boolean flag)
        {
            return caretDecoding(flag);
        }

        public VCard first()
        {
            VCard vcard;
            try
            {
                vcard = super.first();
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException(ioexception);
            }
            return vcard;
        }

        public ParserChainTextString register(VCardPropertyScribe vcardpropertyscribe)
        {
            return (ParserChainTextString)super.register(vcardpropertyscribe);
        }

        public volatile Object register(VCardPropertyScribe vcardpropertyscribe)
        {
            return register(vcardpropertyscribe);
        }

        public ParserChainTextString warnings(List list)
        {
            return (ParserChainTextString)super.warnings(list);
        }

        public volatile Object warnings(List list)
        {
            return warnings(list);
        }

        private ParserChainTextString(String s)
        {
            super(false);
            text = s;
        }

    }

    static abstract class ParserChainXml extends ParserChain
    {

        private XCardDocument constructDocument()
            throws SAXException, IOException
        {
            XCardDocument xcarddocument = _constructDocument();
            xcarddocument.setScribeIndex(index);
            return xcarddocument;
        }

        abstract XCardDocument _constructDocument()
            throws IOException, SAXException;

        public List all()
            throws IOException, SAXException
        {
            XCardDocument xcarddocument = constructDocument();
            List list = xcarddocument.parseAll();
            if (warnings != null)
            {
                warnings.addAll(xcarddocument.getParseWarnings());
            }
            return list;
        }

        public VCard first()
            throws IOException, SAXException
        {
            XCardDocument xcarddocument = constructDocument();
            VCard vcard = xcarddocument.parseFirst();
            if (warnings != null)
            {
                warnings.addAll(xcarddocument.getParseWarnings());
            }
            return vcard;
        }

        ParserChainXml()
        {
        }
    }

    public static class ParserChainXmlDom extends ParserChainXml
    {

        private final Document document;

        XCardDocument _constructDocument()
        {
            return new XCardDocument(document);
        }

        public List all()
        {
            List list;
            try
            {
                list = super.all();
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException(ioexception);
            }
            catch (SAXException saxexception)
            {
                throw new RuntimeException(saxexception);
            }
            return list;
        }

        public VCard first()
        {
            VCard vcard;
            try
            {
                vcard = super.first();
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException(ioexception);
            }
            catch (SAXException saxexception)
            {
                throw new RuntimeException(saxexception);
            }
            return vcard;
        }

        public ParserChainXmlDom register(VCardPropertyScribe vcardpropertyscribe)
        {
            return (ParserChainXmlDom)super.register(vcardpropertyscribe);
        }

        public volatile Object register(VCardPropertyScribe vcardpropertyscribe)
        {
            return register(vcardpropertyscribe);
        }

        public ParserChainXmlDom warnings(List list)
        {
            return (ParserChainXmlDom)super.warnings(list);
        }

        public volatile Object warnings(List list)
        {
            return warnings(list);
        }

        private ParserChainXmlDom(Document document1)
        {
            document = document1;
        }

    }

    public static class ParserChainXmlReader extends ParserChainXml
    {

        private final File file;
        private final InputStream in;
        private final Reader reader;

        XCardDocument _constructDocument()
            throws IOException, SAXException
        {
            if (in != null)
            {
                return new XCardDocument(in);
            }
            if (file != null)
            {
                return new XCardDocument(file);
            } else
            {
                return new XCardDocument(reader);
            }
        }

        public volatile List all()
            throws IOException, SAXException
        {
            return super.all();
        }

        public volatile VCard first()
            throws IOException, SAXException
        {
            return super.first();
        }

        public ParserChainXmlReader register(VCardPropertyScribe vcardpropertyscribe)
        {
            return (ParserChainXmlReader)super.register(vcardpropertyscribe);
        }

        public volatile Object register(VCardPropertyScribe vcardpropertyscribe)
        {
            return register(vcardpropertyscribe);
        }

        public ParserChainXmlReader warnings(List list)
        {
            return (ParserChainXmlReader)super.warnings(list);
        }

        public volatile Object warnings(List list)
        {
            return warnings(list);
        }

        private ParserChainXmlReader(File file1)
        {
            in = null;
            reader = null;
            file = file1;
        }


        private ParserChainXmlReader(InputStream inputstream)
        {
            in = inputstream;
            reader = null;
            file = null;
        }


        private ParserChainXmlReader(Reader reader1)
        {
            in = null;
            reader = reader1;
            file = null;
        }

    }

    public static class ParserChainXmlString extends ParserChainXml
    {

        private final String xml;

        XCardDocument _constructDocument()
            throws SAXException
        {
            return new XCardDocument(xml);
        }

        public List all()
            throws SAXException
        {
            List list;
            try
            {
                list = super.all();
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException(ioexception);
            }
            return list;
        }

        public VCard first()
            throws SAXException
        {
            VCard vcard;
            try
            {
                vcard = super.first();
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException(ioexception);
            }
            return vcard;
        }

        public ParserChainXmlString register(VCardPropertyScribe vcardpropertyscribe)
        {
            return (ParserChainXmlString)super.register(vcardpropertyscribe);
        }

        public volatile Object register(VCardPropertyScribe vcardpropertyscribe)
        {
            return register(vcardpropertyscribe);
        }

        public ParserChainXmlString warnings(List list)
        {
            return (ParserChainXmlString)super.warnings(list);
        }

        public volatile Object warnings(List list)
        {
            return warnings(list);
        }

        private ParserChainXmlString(String s)
        {
            xml = s;
        }

    }

    static abstract class WriterChain
    {

        final Object this_ = this;
        final Collection vcards;

        WriterChain(Collection collection)
        {
            vcards = collection;
        }
    }

    public static class WriterChainHtml extends WriterChain
    {

        public String go()
        {
            StringWriter stringwriter = new StringWriter();
            try
            {
                go(((Writer) (stringwriter)));
            }
            catch (IOException ioexception) { }
            return stringwriter.toString();
        }

        public void go(File file)
            throws IOException
        {
            Object obj = null;
            file = new FileWriter(file);
            go(((Writer) (file)));
            IOUtils.closeQuietly(file);
            return;
            Exception exception;
            exception;
            file = obj;
_L2:
            IOUtils.closeQuietly(file);
            throw exception;
            exception;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void go(OutputStream outputstream)
            throws IOException
        {
            go(((Writer) (new OutputStreamWriter(outputstream))));
        }

        public void go(Writer writer)
            throws IOException
        {
            HCardPage hcardpage = new HCardPage();
            for (Iterator iterator = vcards.iterator(); iterator.hasNext(); hcardpage.add((VCard)iterator.next())) { }
            hcardpage.write(writer);
        }

        private WriterChainHtml(Collection collection)
        {
            super(collection);
        }

    }

    public static class WriterChainJson extends WriterChain
    {

        boolean indent;
        final ScribeIndex index;
        boolean prodId;
        boolean versionStrict;

        private void go(JCardWriter jcardwriter)
            throws IOException
        {
            jcardwriter.setAddProdId(prodId);
            jcardwriter.setIndent(indent);
            jcardwriter.setVersionStrict(versionStrict);
            jcardwriter.setScribeIndex(index);
            for (Iterator iterator = vcards.iterator(); iterator.hasNext(); jcardwriter.flush())
            {
                jcardwriter.write((VCard)iterator.next());
            }

            break MISSING_BLOCK_LABEL_78;
            Exception exception;
            exception;
            jcardwriter.closeJsonStream();
            throw exception;
            jcardwriter.closeJsonStream();
            return;
        }

        public String go()
        {
            StringWriter stringwriter = new StringWriter();
            try
            {
                go(((Writer) (stringwriter)));
            }
            catch (IOException ioexception) { }
            return stringwriter.toString();
        }

        public void go(File file)
            throws IOException
        {
            boolean flag = true;
            if (vcards.size() <= 1)
            {
                flag = false;
            }
            file = new JCardWriter(file, flag);
            go(((JCardWriter) (file)));
            IOUtils.closeQuietly(file);
            return;
            Exception exception;
            exception;
            IOUtils.closeQuietly(file);
            throw exception;
        }

        public void go(OutputStream outputstream)
            throws IOException
        {
            boolean flag = true;
            if (vcards.size() <= 1)
            {
                flag = false;
            }
            go(new JCardWriter(outputstream, flag));
        }

        public void go(Writer writer)
            throws IOException
        {
            boolean flag = true;
            if (vcards.size() <= 1)
            {
                flag = false;
            }
            go(new JCardWriter(writer, flag));
        }

        public WriterChainJson indent(boolean flag)
        {
            indent = flag;
            return (WriterChainJson)this_;
        }

        public WriterChainJson prodId(boolean flag)
        {
            prodId = flag;
            return (WriterChainJson)this_;
        }

        public WriterChainJson register(VCardPropertyScribe vcardpropertyscribe)
        {
            index.register(vcardpropertyscribe);
            return (WriterChainJson)this_;
        }

        public WriterChainJson versionStrict(boolean flag)
        {
            versionStrict = flag;
            return (WriterChainJson)this_;
        }

        private WriterChainJson(Collection collection)
        {
            super(collection);
            prodId = true;
            versionStrict = true;
            indent = false;
            index = new ScribeIndex();
        }

    }

    public static class WriterChainText extends WriterChain
    {

        boolean caretEncoding;
        final ScribeIndex index;
        boolean prodId;
        VCardVersion version;
        boolean versionStrict;

        private void go(VCardWriter vcardwriter)
            throws IOException
        {
            vcardwriter.setAddProdId(prodId);
            vcardwriter.setCaretEncodingEnabled(caretEncoding);
            vcardwriter.setVersionStrict(versionStrict);
            vcardwriter.setScribeIndex(index);
            for (Iterator iterator = vcards.iterator(); iterator.hasNext(); vcardwriter.flush())
            {
                VCard vcard = (VCard)iterator.next();
                if (version == null)
                {
                    VCardVersion vcardversion1 = vcard.getVersion();
                    VCardVersion vcardversion = vcardversion1;
                    if (vcardversion1 == null)
                    {
                        vcardversion = VCardVersion.V3_0;
                    }
                    vcardwriter.setTargetVersion(vcardversion);
                }
                vcardwriter.write(vcard);
            }

        }

        public WriterChainText caretEncoding(boolean flag)
        {
            caretEncoding = flag;
            return (WriterChainText)this_;
        }

        public String go()
        {
            StringWriter stringwriter = new StringWriter();
            try
            {
                go(((Writer) (stringwriter)));
            }
            catch (IOException ioexception) { }
            return stringwriter.toString();
        }

        public void go(File file)
            throws IOException
        {
            go(file, false);
        }

        public void go(File file, boolean flag)
            throws IOException
        {
            if (version == null)
            {
                file = new VCardWriter(file, flag);
            } else
            {
                file = new VCardWriter(file, flag, version);
            }
            go(((VCardWriter) (file)));
            IOUtils.closeQuietly(file);
            return;
            Exception exception;
            exception;
            IOUtils.closeQuietly(file);
            throw exception;
        }

        public void go(OutputStream outputstream)
            throws IOException
        {
            if (version == null)
            {
                outputstream = new VCardWriter(outputstream);
            } else
            {
                outputstream = new VCardWriter(outputstream, version);
            }
            go(((VCardWriter) (outputstream)));
        }

        public void go(Writer writer)
            throws IOException
        {
            writer = new VCardWriter(writer);
            writer.setTargetVersion(version);
            go(((VCardWriter) (writer)));
        }

        public WriterChainText prodId(boolean flag)
        {
            prodId = flag;
            return (WriterChainText)this_;
        }

        public WriterChainText register(VCardPropertyScribe vcardpropertyscribe)
        {
            index.register(vcardpropertyscribe);
            return (WriterChainText)this_;
        }

        public WriterChainText version(VCardVersion vcardversion)
        {
            version = vcardversion;
            return (WriterChainText)this_;
        }

        public WriterChainText versionStrict(boolean flag)
        {
            versionStrict = flag;
            return (WriterChainText)this_;
        }

        private WriterChainText(Collection collection)
        {
            super(collection);
            prodId = true;
            versionStrict = true;
            caretEncoding = false;
            index = new ScribeIndex();
        }

    }

    public static class WriterChainXml extends WriterChain
    {

        int indent;
        final ScribeIndex index;
        boolean prodId;
        boolean versionStrict;

        private XCardDocument createXCardDocument()
        {
            XCardDocument xcarddocument = new XCardDocument();
            xcarddocument.setAddProdId(prodId);
            xcarddocument.setVersionStrict(versionStrict);
            xcarddocument.setScribeIndex(index);
            for (Iterator iterator = vcards.iterator(); iterator.hasNext(); xcarddocument.add((VCard)iterator.next())) { }
            return xcarddocument;
        }

        public Document dom()
        {
            return createXCardDocument().getDocument();
        }

        public String go()
        {
            StringWriter stringwriter = new StringWriter();
            try
            {
                go(((Writer) (stringwriter)));
            }
            catch (TransformerException transformerexception) { }
            return stringwriter.toString();
        }

        public void go(File file)
            throws IOException, TransformerException
        {
            createXCardDocument().write(file, indent);
        }

        public void go(OutputStream outputstream)
            throws TransformerException
        {
            createXCardDocument().write(outputstream, indent);
        }

        public void go(Writer writer)
            throws TransformerException
        {
            createXCardDocument().write(writer, indent);
        }

        public WriterChainXml indent(int i)
        {
            indent = i;
            return (WriterChainXml)this_;
        }

        public WriterChainXml prodId(boolean flag)
        {
            prodId = flag;
            return (WriterChainXml)this_;
        }

        public WriterChainXml register(VCardPropertyScribe vcardpropertyscribe)
        {
            index.register(vcardpropertyscribe);
            return (WriterChainXml)this_;
        }

        public WriterChainXml versionStrict(boolean flag)
        {
            versionStrict = flag;
            return (WriterChainXml)this_;
        }

        private WriterChainXml(Collection collection)
        {
            super(collection);
            prodId = true;
            versionStrict = true;
            indent = -1;
            index = new ScribeIndex();
        }

    }


    public static final String URL;
    public static final String VERSION;

    private Ezvcard()
    {
    }

    public static ParserChainTextReader parse(File file)
    {
        return new ParserChainTextReader(file);
    }

    public static ParserChainTextReader parse(InputStream inputstream)
    {
        return parse(((Reader) (new InputStreamReader(inputstream))));
    }

    public static ParserChainTextReader parse(Reader reader)
    {
        return new ParserChainTextReader(reader);
    }

    public static ParserChainTextString parse(String s)
    {
        return new ParserChainTextString(s);
    }

    public static ParserChainHtmlReader parseHtml(File file)
    {
        return new ParserChainHtmlReader(file);
    }

    public static ParserChainHtmlReader parseHtml(InputStream inputstream)
    {
        return parseHtml(((Reader) (new InputStreamReader(inputstream))));
    }

    public static ParserChainHtmlReader parseHtml(Reader reader)
    {
        return new ParserChainHtmlReader(reader);
    }

    public static ParserChainHtmlReader parseHtml(URL url)
    {
        return new ParserChainHtmlReader(url);
    }

    public static ParserChainHtmlString parseHtml(String s)
    {
        return new ParserChainHtmlString(s);
    }

    public static ParserChainJsonReader parseJson(File file)
    {
        return new ParserChainJsonReader(file);
    }

    public static ParserChainJsonReader parseJson(InputStream inputstream)
    {
        return new ParserChainJsonReader(inputstream);
    }

    public static ParserChainJsonReader parseJson(Reader reader)
    {
        return new ParserChainJsonReader(reader);
    }

    public static ParserChainJsonString parseJson(String s)
    {
        return new ParserChainJsonString(s);
    }

    public static ParserChainXmlDom parseXml(Document document)
    {
        return new ParserChainXmlDom(document);
    }

    public static ParserChainXmlReader parseXml(File file)
    {
        return new ParserChainXmlReader(file);
    }

    public static ParserChainXmlReader parseXml(InputStream inputstream)
    {
        return new ParserChainXmlReader(inputstream);
    }

    public static ParserChainXmlReader parseXml(Reader reader)
    {
        return new ParserChainXmlReader(reader);
    }

    public static ParserChainXmlString parseXml(String s)
    {
        return new ParserChainXmlString(s);
    }

    public static WriterChainText write(Collection collection)
    {
        return new WriterChainText(collection);
    }

    public static transient WriterChainText write(VCard avcard[])
    {
        return write(((Collection) (Arrays.asList(avcard))));
    }

    public static WriterChainHtml writeHtml(Collection collection)
    {
        return new WriterChainHtml(collection);
    }

    public static transient WriterChainHtml writeHtml(VCard avcard[])
    {
        return writeHtml(((Collection) (Arrays.asList(avcard))));
    }

    public static WriterChainJson writeJson(Collection collection)
    {
        return new WriterChainJson(collection);
    }

    public static transient WriterChainJson writeJson(VCard avcard[])
    {
        return writeJson(((Collection) (Arrays.asList(avcard))));
    }

    public static WriterChainXml writeXml(Collection collection)
    {
        return new WriterChainXml(collection);
    }

    public static transient WriterChainXml writeXml(VCard avcard[])
    {
        return writeXml(((Collection) (Arrays.asList(avcard))));
    }

    static 
    {
        InputStream inputstream;
        InputStream inputstream1;
        inputstream1 = null;
        inputstream = null;
        InputStream inputstream2 = ezvcard/Ezvcard.getResourceAsStream("/ez-vcard.properties");
        inputstream = inputstream2;
        inputstream1 = inputstream2;
        Properties properties = new Properties();
        inputstream = inputstream2;
        inputstream1 = inputstream2;
        properties.load(inputstream2);
        inputstream = inputstream2;
        inputstream1 = inputstream2;
        VERSION = properties.getProperty("version");
        inputstream = inputstream2;
        inputstream1 = inputstream2;
        URL = properties.getProperty("url");
        IOUtils.closeQuietly(inputstream2);
        return;
        IOException ioexception;
        ioexception;
        inputstream1 = inputstream;
        throw new RuntimeException(ioexception);
        Exception exception;
        exception;
        IOUtils.closeQuietly(inputstream1);
        throw exception;
    }
}

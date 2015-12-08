// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.Utf8;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.util.Iso639;
import com.mp4parser.iso14496.part30.XMLSubtitleSampleEntry;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SMPTETTTrackImpl extends AbstractTrack
{
    private static class TextTrackNamespaceContext
        implements NamespaceContext
    {

        public String getNamespaceURI(String s)
        {
            if (s.equals("ttml"))
            {
                return "http://www.w3.org/ns/ttml";
            }
            if (s.equals("smpte"))
            {
                return "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt";
            } else
            {
                return null;
            }
        }

        public String getPrefix(String s)
        {
            if (s.equals("http://www.w3.org/ns/ttml"))
            {
                return "ttml";
            }
            if (s.equals("http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt"))
            {
                return "smpte";
            } else
            {
                return null;
            }
        }

        public Iterator getPrefixes(String s)
        {
            return Arrays.asList(new String[] {
                "ttml", "smpte"
            }).iterator();
        }

        private TextTrackNamespaceContext()
        {
        }

        TextTrackNamespaceContext(TextTrackNamespaceContext texttracknamespacecontext)
        {
            this();
        }
    }


    public static final String SMPTE_TT_NAMESPACE = "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt";
    XMLSubtitleSampleEntry XMLSubtitleSampleEntry;
    boolean containsImages;
    SampleDescriptionBox sampleDescriptionBox;
    private long sampleDurations[];
    List samples;
    SubSampleInformationBox subSampleInformationBox;
    TrackMetaData trackMetaData;

    public transient SMPTETTTrackImpl(File afile[])
    {
        Object obj;
        DocumentBuilder documentbuilder;
        int i;
        long l;
        super(afile[0].getName());
        trackMetaData = new TrackMetaData();
        sampleDescriptionBox = new SampleDescriptionBox();
        XMLSubtitleSampleEntry = new XMLSubtitleSampleEntry();
        samples = new ArrayList();
        subSampleInformationBox = new SubSampleInformationBox();
        sampleDurations = new long[afile.length];
        obj = DocumentBuilderFactory.newInstance();
        ((DocumentBuilderFactory) (obj)).setNamespaceAware(true);
        documentbuilder = ((DocumentBuilderFactory) (obj)).newDocumentBuilder();
        obj = null;
        i = 0;
        l = 0L;
_L9:
        if (i >= afile.length)
        {
            trackMetaData.setLanguage(Iso639.convert2to3(((String) (obj))));
            XMLSubtitleSampleEntry.setNamespace("http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt");
            XMLSubtitleSampleEntry.setSchemaLocation("http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt");
            final Object finalXml;
            final File file;
            com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry subsampleentry;
            Object obj1;
            final Object pix;
            Object obj2;
            String s;
            int j;
            long l1;
            if (containsImages)
            {
                XMLSubtitleSampleEntry.setAuxiliaryMimeTypes("image/png");
            } else
            {
                XMLSubtitleSampleEntry.setAuxiliaryMimeTypes("");
            }
            sampleDescriptionBox.addBox(XMLSubtitleSampleEntry);
            trackMetaData.setTimescale(30000L);
            trackMetaData.setLayer(65535);
            return;
        }
        file = afile[i];
        subsampleentry = new com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry();
        subSampleInformationBox.getEntries().add(subsampleentry);
        subsampleentry.setSampleDelta(1L);
        obj1 = documentbuilder.parse(file);
        finalXml = getLanguage(((Document) (obj1)));
        if (obj == null)
        {
            obj = finalXml;
        } else
        if (!((String) (obj)).equals(finalXml))
        {
            throw new RuntimeException("Within one Track all sample documents need to have the same language");
        }
        pix = XPathFactory.newInstance();
        finalXml = new TextTrackNamespaceContext(null);
        pix = ((XPathFactory) (pix)).newXPath();
        ((XPath) (pix)).setNamespaceContext(((NamespaceContext) (finalXml)));
        l1 = latestTimestamp(((Document) (obj1)));
        sampleDurations[i] = l1 - l;
        finalXml = (NodeList)((XPath) (pix)).compile("/ttml:tt/ttml:body/ttml:div/@smpte:backgroundImage").evaluate(obj1, XPathConstants.NODESET);
        pix = new HashMap();
        obj1 = new HashSet();
        j = 0;
_L10:
        if (j < ((NodeList) (finalXml)).getLength()) goto _L2; else goto _L1
_L1:
        obj1 = new ArrayList(((Collection) (obj1)));
        Collections.sort((List)obj1);
        finalXml = ((Collection) (obj1)).iterator();
        j = 1;
_L11:
        if (((Iterator) (finalXml)).hasNext()) goto _L4; else goto _L3
_L3:
        if (((Collection) (obj1)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_750;
        }
        finalXml = new String(streamToByteArray(new FileInputStream(file)));
        pix = ((HashMap) (pix)).entrySet().iterator();
_L12:
        if (((Iterator) (pix)).hasNext()) goto _L6; else goto _L5
_L5:
        pix = new ArrayList();
        samples.add(new _cls1());
        obj2 = new com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry.SubsampleEntry();
        ((com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry.SubsampleEntry) (obj2)).setSubsampleSize(Utf8.utf8StringLengthInBytes(((String) (finalXml))));
        subsampleentry.getSubsampleEntries().add(obj2);
        finalXml = ((Collection) (obj1)).iterator();
_L13:
        if (((Iterator) (finalXml)).hasNext()) goto _L8; else goto _L7
_L7:
        i++;
        l = l1;
          goto _L9
_L2:
        ((Collection) (obj1)).add(((NodeList) (finalXml)).item(j).getNodeValue());
        j++;
          goto _L10
_L4:
        obj2 = (String)((Iterator) (finalXml)).next();
        s = ((String) (obj2)).substring(((String) (obj2)).lastIndexOf("."));
        ((HashMap) (pix)).put(obj2, (new StringBuilder("urn:dece:container:subtitleimageindex:")).append(j).append(s).toString());
        j++;
          goto _L11
_L6:
        obj2 = (java.util.Map.Entry)((Iterator) (pix)).next();
        finalXml = ((String) (finalXml)).replace((CharSequence)((java.util.Map.Entry) (obj2)).getKey(), (CharSequence)((java.util.Map.Entry) (obj2)).getValue());
          goto _L12
_L8:
        obj1 = (String)((Iterator) (finalXml)).next();
        obj1 = new File(file.getParentFile(), ((String) (obj1)));
        ((List) (pix)).add(obj1);
        obj2 = new com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry.SubsampleEntry();
        ((com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry.SubsampleEntry) (obj2)).setSubsampleSize(((File) (obj1)).length());
        subsampleentry.getSubsampleEntries().add(obj2);
          goto _L13
        samples.add(new _cls2());
          goto _L7
    }

    public static long earliestTimestamp(Document document)
    {
        Object obj = XPathFactory.newInstance();
        TextTrackNamespaceContext texttracknamespacecontext = new TextTrackNamespaceContext(null);
        obj = ((XPathFactory) (obj)).newXPath();
        ((XPath) (obj)).setNamespaceContext(texttracknamespacecontext);
        int i;
        long l;
        try
        {
            document = (NodeList)((XPath) (obj)).compile("//*[@begin]").evaluate(document, XPathConstants.NODESET);
        }
        // Misplaced declaration of an exception variable
        catch (Document document)
        {
            throw new RuntimeException(document);
        }
        l = 0L;
        i = 0;
        if (i >= document.getLength())
        {
            return l;
        }
        l = Math.min(toTime(document.item(i).getAttributes().getNamedItem("begin").getNodeValue()), l);
        i++;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_52;
        }
    }

    public static String getLanguage(Document document)
    {
        return document.getDocumentElement().getAttribute("xml:lang");
    }

    public static long latestTimestamp(Document document)
    {
        Object obj1 = XPathFactory.newInstance();
        Object obj = new TextTrackNamespaceContext(null);
        obj1 = ((XPathFactory) (obj1)).newXPath();
        ((XPath) (obj1)).setNamespaceContext(((NamespaceContext) (obj)));
        int i;
        long l;
        long l1;
        try
        {
            document = (NodeList)((XPath) (obj1)).compile("//*[@begin]").evaluate(document, XPathConstants.NODESET);
        }
        // Misplaced declaration of an exception variable
        catch (Document document)
        {
            throw new RuntimeException(document);
        }
        l = 0L;
        i = 0;
        if (i >= document.getLength())
        {
            return l;
        }
        obj = document.item(i);
        obj1 = ((Node) (obj)).getAttributes().getNamedItem("begin").getNodeValue();
        if (((Node) (obj)).getAttributes().getNamedItem("dur") == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        l1 = toTime(((String) (obj1)));
        l1 = toTime(((Node) (obj)).getAttributes().getNamedItem("dur").getNodeValue()) + l1;
_L1:
        l = Math.max(l1, l);
        i++;
        break MISSING_BLOCK_LABEL_52;
label0:
        {
            if (((Node) (obj)).getAttributes().getNamedItem("end") == null)
            {
                break label0;
            }
            l1 = toTime(((Node) (obj)).getAttributes().getNamedItem("end").getNodeValue());
        }
          goto _L1
        throw new RuntimeException("neither end nor dur attribute is present");
        break MISSING_BLOCK_LABEL_52;
    }

    private byte[] streamToByteArray(InputStream inputstream)
    {
        byte abyte0[] = new byte[8096];
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        do
        {
            int i = inputstream.read(abyte0);
            if (-1 == i)
            {
                return bytearrayoutputstream.toByteArray();
            }
            bytearrayoutputstream.write(abyte0, 0, i);
        } while (true);
    }

    static long toTime(String s)
    {
        Object obj = Pattern.compile("([0-9][0-9]):([0-9][0-9]):([0-9][0-9])([\\.:][0-9][0-9]?[0-9]?)?").matcher(s);
        if (((Matcher) (obj)).matches())
        {
            String s1 = ((Matcher) (obj)).group(1);
            String s2 = ((Matcher) (obj)).group(2);
            String s3 = ((Matcher) (obj)).group(3);
            obj = ((Matcher) (obj)).group(4);
            s = ((String) (obj));
            if (obj == null)
            {
                s = ".000";
            }
            s = s.replace(":", ".");
            long l = Long.parseLong(s1);
            long l1 = Long.parseLong(s2);
            double d = Long.parseLong(s3) * 1000L + (l * 60L * 60L * 1000L + l1 * 60L * 1000L);
            return (long)(Double.parseDouble((new StringBuilder("0")).append(s).toString()) * 1000D + d);
        } else
        {
            throw new RuntimeException((new StringBuilder("Cannot match ")).append(s).append(" to time expression").toString());
        }
    }

    public void close()
    {
    }

    public String getHandler()
    {
        return "subt";
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        return sampleDescriptionBox;
    }

    public long[] getSampleDurations()
    {
        long al[] = new long[sampleDurations.length];
        int i = 0;
        do
        {
            if (i >= al.length)
            {
                return al;
            }
            al[i] = (sampleDurations[i] * trackMetaData.getTimescale()) / 1000L;
            i++;
        } while (true);
    }

    public List getSamples()
    {
        return samples;
    }

    public SubSampleInformationBox getSubsampleInformationBox()
    {
        return subSampleInformationBox;
    }

    public TrackMetaData getTrackMetaData()
    {
        return trackMetaData;
    }


    private class _cls1
        implements Sample
    {

        final SMPTETTTrackImpl this$0;
        private final String val$finalXml;
        private final List val$pix;

        public ByteBuffer asByteBuffer()
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            try
            {
                writeTo(Channels.newChannel(bytearrayoutputstream));
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException(ioexception);
            }
            return ByteBuffer.wrap(bytearrayoutputstream.toByteArray());
        }

        public long getSize()
        {
            long l = Utf8.convert(finalXml).length;
            Iterator iterator = pix.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    return l;
                }
                l = ((File)iterator.next()).length() + l;
            } while (true);
        }

        public void writeTo(WritableByteChannel writablebytechannel)
        {
            Iterator iterator;
            writablebytechannel.write(ByteBuffer.wrap(Utf8.convert(finalXml)));
            iterator = pix.iterator();
_L2:
            if (!iterator.hasNext())
            {
                return;
            }
            FileInputStream fileinputstream = new FileInputStream((File)iterator.next());
            byte abyte0[] = new byte[8096];
            do
            {
                int i = fileinputstream.read(abyte0);
                if (-1 == i)
                {
                    continue;
                }
                writablebytechannel.write(ByteBuffer.wrap(abyte0, 0, i));
            } while (true);
            if (true) goto _L2; else goto _L1
_L1:
        }

        _cls1()
        {
            this$0 = SMPTETTTrackImpl.this;
            finalXml = s;
            pix = list;
            super();
        }
    }


    private class _cls2
        implements Sample
    {

        final SMPTETTTrackImpl this$0;
        private final File val$file;

        public ByteBuffer asByteBuffer()
        {
            ByteBuffer bytebuffer;
            try
            {
                bytebuffer = ByteBuffer.wrap(streamToByteArray(new FileInputStream(file)));
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException(ioexception);
            }
            return bytebuffer;
        }

        public long getSize()
        {
            return file.length();
        }

        public void writeTo(WritableByteChannel writablebytechannel)
        {
            Channels.newOutputStream(writablebytechannel).write(streamToByteArray(new FileInputStream(file)));
        }

        _cls2()
        {
            this$0 = SMPTETTTrackImpl.this;
            file = file1;
            super();
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.text;

import ezvcard.VCard;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.io.EmbeddedVCardException;
import ezvcard.io.SkipMeException;
import ezvcard.io.scribe.RawPropertyScribe;
import ezvcard.io.scribe.ScribeIndex;
import ezvcard.io.scribe.VCardPropertyScribe;
import ezvcard.parameter.Encoding;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Address;
import ezvcard.property.Label;
import ezvcard.property.RawProperty;
import ezvcard.property.VCardProperty;
import ezvcard.util.IOUtils;
import ezvcard.util.StringUtils;
import ezvcard.util.org.apache.commons.codec.DecoderException;
import ezvcard.util.org.apache.commons.codec.net.QuotedPrintableCodec;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// Referenced classes of package ezvcard.io.text:
//            VCardRawReader

public class VCardReader
    implements Closeable
{
    private class VCardDataStreamListenerImpl
        implements VCardRawReader.VCardDataStreamListener
    {

        private EmbeddedVCardException embeddedVCardException;
        private final List labels;
        private VCard root;
        final VCardReader this$0;
        private final LinkedList vcardStack;

        public void beginComponent(String s)
        {
            if ("VCARD".equalsIgnoreCase(s))
            {
                s = new VCard();
                s.setVersion(VCardVersion.V2_1);
                vcardStack.add(s);
                if (root == null)
                {
                    root = s;
                }
                if (embeddedVCardException != null)
                {
                    embeddedVCardException.injectVCard(s);
                    embeddedVCardException = null;
                    return;
                }
            }
        }

        public void endComponent(String s)
        {
            if (!vcardStack.isEmpty() && "VCARD".equalsIgnoreCase(s))
            {
                s = (VCard)vcardStack.removeLast();
                Iterator iterator = labels.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Label label = (Label)iterator.next();
                    boolean flag1 = true;
                    Iterator iterator1 = s.getAddresses().iterator();
                    boolean flag;
                    do
                    {
                        flag = flag1;
                        if (!iterator1.hasNext())
                        {
                            break;
                        }
                        Address address = (Address)iterator1.next();
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
                        s.addOrphanedLabel(label);
                    }
                } while (true);
                if (vcardStack.isEmpty())
                {
                    throw new VCardRawReader.StopReadingException();
                }
            }
        }

        public void invalidLine(String s)
        {
            if (vcardStack.isEmpty())
            {
                return;
            } else
            {
                addWarning((new StringBuilder()).append("Skipping malformed line: \"").append(s).append("\"").toString());
                return;
            }
        }

        public void invalidVersion(String s)
        {
            if (vcardStack.isEmpty())
            {
                return;
            } else
            {
                addWarning((new StringBuilder()).append("Ignoring invalid version value: ").append(s).toString(), "VERSION");
                return;
            }
        }

        public void readProperty(String s, String s1, VCardParameters vcardparameters, String s2)
        {
            VCard vcard1;
            VCardVersion vcardversion;
            String s6;
            if (vcardStack.isEmpty())
            {
                return;
            }
            if (embeddedVCardException != null)
            {
                embeddedVCardException.injectVCard(null);
                embeddedVCardException = null;
            }
            vcard1 = (VCard)vcardStack.getLast();
            vcardversion = vcard1.getVersion();
            handleNamelessParameters(vcardparameters);
            handleQuotedMultivaluedTypeParams(vcardparameters);
            s6 = decodeQuotedPrintable(s1, vcardparameters, s2);
            Object obj = index.getPropertyScribe(s1);
            s2 = ((String) (obj));
            if (obj == null)
            {
                s2 = new RawPropertyScribe(s1);
            }
            obj = vcardparameters.getValue();
            if (obj == null)
            {
                obj = s2.defaultDataType(vcardversion);
            } else
            {
                vcardparameters.setValue(null);
            }
            vcardparameters = s2.parseText(s6, ((VCardDataType) (obj)), vcardversion, vcardparameters);
            for (s2 = vcardparameters.getWarnings().iterator(); s2.hasNext(); addWarning(((String) (obj)), s1))
            {
                obj = (String)s2.next();
            }

            break MISSING_BLOCK_LABEL_230;
            s;
            addWarning((new StringBuilder()).append("Property has requested that it be skipped: ").append(s.getMessage()).toString(), s1);
            return;
            s2 = vcardparameters.getProperty();
            s2.setGroup(s);
            vcardparameters = s2;
            if (s2 instanceof Label)
            {
                labels.add((Label)s2);
                return;
            }
            break MISSING_BLOCK_LABEL_344;
            vcardparameters;
            addWarning((new StringBuilder()).append("Property value could not be parsed.  Property will be saved as an extended property instead.").append(StringUtils.NEWLINE).append("  Value: ").append(s6).append(StringUtils.NEWLINE).append("  Reason: ").append(vcardparameters.getMessage()).toString(), s1);
            vcardparameters = new RawProperty(s1, s6);
            vcardparameters.setGroup(s);
_L2:
            vcard1.addProperty(vcardparameters);
            return;
            s2;
            vcardparameters = s2.getProperty();
            if (s6.length() == 0 || vcardversion == VCardVersion.V2_1)
            {
                embeddedVCardException = s2;
                continue; /* Loop/switch isn't completed */
            }
            s = new VCardReader(VCardPropertyScribe.unescape(s6));
            VCard vcard = s.readNext();
            if (vcard == null)
            {
                break MISSING_BLOCK_LABEL_415;
            }
            s2.injectVCard(vcard);
            String s3;
            for (s2 = s.getWarnings().iterator(); s2.hasNext(); addWarning((new StringBuilder()).append("Problem unmarshalling nested vCard value: ").append(s3).toString(), s1))
            {
                s3 = (String)s2.next();
            }

            IOUtils.closeQuietly(s);
            continue; /* Loop/switch isn't completed */
            s2;
            String s4;
            for (s2 = s.getWarnings().iterator(); s2.hasNext(); addWarning((new StringBuilder()).append("Problem unmarshalling nested vCard value: ").append(s4).toString(), s1))
            {
                s4 = (String)s2.next();
            }

            IOUtils.closeQuietly(s);
            if (true) goto _L2; else goto _L1
_L1:
            vcardparameters;
            String s5;
            for (s2 = s.getWarnings().iterator(); s2.hasNext(); addWarning((new StringBuilder()).append("Problem unmarshalling nested vCard value: ").append(s5).toString(), s1))
            {
                s5 = (String)s2.next();
            }

            IOUtils.closeQuietly(s);
            throw vcardparameters;
        }

        public void readVersion(VCardVersion vcardversion)
        {
            if (vcardStack.isEmpty())
            {
                return;
            } else
            {
                ((VCard)vcardStack.getLast()).setVersion(vcardversion);
                return;
            }
        }


        private VCardDataStreamListenerImpl()
        {
            this$0 = VCardReader.this;
            super();
            labels = new ArrayList();
            vcardStack = new LinkedList();
        }

    }


    private ScribeIndex index;
    private final VCardRawReader reader;
    private final List warnings;

    public VCardReader(File file)
        throws FileNotFoundException
    {
        this(((Reader) (new FileReader(file))));
    }

    public VCardReader(InputStream inputstream)
    {
        this(((Reader) (new InputStreamReader(inputstream))));
    }

    public VCardReader(Reader reader1)
    {
        warnings = new ArrayList();
        index = new ScribeIndex();
        reader = new VCardRawReader(reader1);
    }

    public VCardReader(String s)
    {
        this(((Reader) (new StringReader(s))));
    }

    private void addWarning(String s)
    {
        addWarning(s, null);
    }

    private void addWarning(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Line ").append(reader.getLineNum());
        if (s1 != null)
        {
            stringbuilder.append(" (").append(s1).append(" property)");
        }
        stringbuilder.append(": ").append(s);
        warnings.add(stringbuilder.toString());
    }

    private String decodeQuotedPrintable(String s, VCardParameters vcardparameters, String s1)
    {
        if (vcardparameters.getEncoding() != Encoding.QUOTED_PRINTABLE)
        {
            return s1;
        }
        vcardparameters.setEncoding(null);
        QuotedPrintableCodec quotedprintablecodec = new QuotedPrintableCodec();
        vcardparameters = vcardparameters.getCharset();
        if (vcardparameters == null)
        {
            String s2;
            UnsupportedEncodingException unsupportedencodingexception;
            try
            {
                vcardparameters = quotedprintablecodec.decode(s1);
            }
            // Misplaced declaration of an exception variable
            catch (VCardParameters vcardparameters)
            {
                addWarning("Property value was marked as \"quoted-printable\", but it could not be decoded.  Treating the value as plain text.", s);
                return s1;
            }
            return vcardparameters;
        }
        s2 = quotedprintablecodec.decode(s1, vcardparameters);
        return s2;
        unsupportedencodingexception;
        addWarning((new StringBuilder()).append("The specified charset is not supported.  Using default charset instead: ").append(vcardparameters).toString(), s);
        vcardparameters = quotedprintablecodec.decode(s1);
        return vcardparameters;
    }

    private void handleNamelessParameters(VCardParameters vcardparameters)
    {
        Iterator iterator = vcardparameters.get(null).iterator();
        while (iterator.hasNext()) 
        {
            String s1 = (String)iterator.next();
            String s;
            if (VCardDataType.find(s1) != null)
            {
                s = "VALUE";
            } else
            if (Encoding.find(s1) != null)
            {
                s = "ENCODING";
            } else
            {
                s = "TYPE";
            }
            vcardparameters.put(s, s1);
        }
        vcardparameters.removeAll(null);
    }

    private void handleQuotedMultivaluedTypeParams(VCardParameters vcardparameters)
    {
        Iterator iterator = vcardparameters.getTypes().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (s.contains(","))
            {
                vcardparameters.removeTypes();
                String as[] = s.split(",");
                int j = as.length;
                int i = 0;
                while (i < j) 
                {
                    vcardparameters.addType(as[i]);
                    i++;
                }
            }
        } while (true);
    }

    public void close()
        throws IOException
    {
        reader.close();
    }

    public ScribeIndex getScribeIndex()
    {
        return index;
    }

    public List getWarnings()
    {
        return new ArrayList(warnings);
    }

    public boolean isCaretDecodingEnabled()
    {
        return reader.isCaretDecodingEnabled();
    }

    public VCard readNext()
        throws IOException
    {
        if (reader.eof())
        {
            return null;
        } else
        {
            warnings.clear();
            VCardDataStreamListenerImpl vcarddatastreamlistenerimpl = new VCardDataStreamListenerImpl();
            reader.start(vcarddatastreamlistenerimpl);
            return vcarddatastreamlistenerimpl.root;
        }
    }

    public void registerScribe(VCardPropertyScribe vcardpropertyscribe)
    {
        index.register(vcardpropertyscribe);
    }

    public void setCaretDecodingEnabled(boolean flag)
    {
        reader.setCaretDecodingEnabled(flag);
    }

    public void setScribeIndex(ScribeIndex scribeindex)
    {
        index = scribeindex;
    }






}

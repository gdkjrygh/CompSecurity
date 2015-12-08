// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.json;

import ezvcard.VCard;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.io.EmbeddedVCardException;
import ezvcard.io.SkipMeException;
import ezvcard.io.scribe.RawPropertyScribe;
import ezvcard.io.scribe.ScribeIndex;
import ezvcard.io.scribe.VCardPropertyScribe;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.RawProperty;
import ezvcard.property.VCardProperty;
import ezvcard.util.IOUtils;
import ezvcard.util.StringUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package ezvcard.io.json:
//            JCardRawReader, JCardValue

public class JCardReader
    implements Closeable
{
    private class JCardDataStreamListenerImpl
        implements JCardRawReader.JCardDataStreamListener
    {

        final JCardReader this$0;
        private VCard vcard;
        private boolean versionFound;

        public void beginVCard()
        {
            vcard = new VCard();
            vcard.setVersion(VCardVersion.V4_0);
        }

        public void readProperty(String s, String s1, VCardParameters vcardparameters, VCardDataType vcarddatatype, JCardValue jcardvalue)
        {
            obj = ((ezvcard.io.scribe.VCardPropertyScribe.Result) (obj)).getProperty();
            ((VCardProperty) (obj)).setGroup(s);
            s = ((String) (obj));
_L2:
            vcard.addProperty(s);
            return;
            if ("version".equalsIgnoreCase(s1))
            {
                versionFound = true;
                if (VCardVersion.valueOfByStr(jcardvalue.asSingle()) != VCardVersion.V4_0)
                {
                    addWarning((new StringBuilder()).append("Version must be \"").append(VCardVersion.V4_0.getVersion()).append("\"").toString(), s1);
                }
                return;
            }
            VCardPropertyScribe vcardpropertyscribe = index.getPropertyScribe(s1);
            Object obj = vcardpropertyscribe;
            if (vcardpropertyscribe == null)
            {
                obj = new RawPropertyScribe(s1);
            }
            try
            {
                obj = ((VCardPropertyScribe) (obj)).parseJson(jcardvalue, vcarddatatype, vcardparameters);
                String s2;
                for (Iterator iterator = ((ezvcard.io.scribe.VCardPropertyScribe.Result) (obj)).getWarnings().iterator(); iterator.hasNext(); addWarning(s2, s1))
                {
                    s2 = (String)iterator.next();
                }

                break MISSING_BLOCK_LABEL_189;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                addWarning((new StringBuilder()).append("Property has requested that it be skipped: ").append(s.getMessage()).toString(), s1);
                return;
            }
            catch (CannotParseException cannotparseexception)
            {
                vcardparameters = (new RawPropertyScribe(s1)).parseJson(jcardvalue, vcarddatatype, vcardparameters).getProperty();
                vcardparameters.setGroup(s);
                s = (String)((RawProperty)vcardparameters).getValue();
                addWarning((new StringBuilder()).append("Property value could not be parsed.  Property will be saved as an extended property instead.").append(StringUtils.NEWLINE).append("  Value: ").append(s).append(StringUtils.NEWLINE).append("  Reason: ").append(cannotparseexception.getMessage()).toString(), s1);
                s = vcardparameters;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                addWarning("Property will not be unmarshalled because jCard does not supported embedded vCards.", s1);
                return;
            }
            while (false) ;
            if (true) goto _L2; else goto _L1
_L1:
        }



        private JCardDataStreamListenerImpl()
        {
            this$0 = JCardReader.this;
            super();
            vcard = null;
            versionFound = false;
        }

    }


    private ScribeIndex index;
    private final JCardRawReader reader;
    private final List warnings;

    public JCardReader(File file)
        throws FileNotFoundException
    {
        this(IOUtils.utf8Reader(file));
    }

    public JCardReader(InputStream inputstream)
    {
        this(IOUtils.utf8Reader(inputstream));
    }

    public JCardReader(Reader reader1)
    {
        index = new ScribeIndex();
        warnings = new ArrayList();
        reader = new JCardRawReader(reader1);
    }

    public JCardReader(String s)
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

    public VCard readNext()
        throws IOException
    {
        VCard vcard = null;
        if (!reader.eof())
        {
            warnings.clear();
            JCardDataStreamListenerImpl jcarddatastreamlistenerimpl = new JCardDataStreamListenerImpl();
            reader.readNext(jcarddatastreamlistenerimpl);
            VCard vcard1 = jcarddatastreamlistenerimpl.vcard;
            vcard = vcard1;
            if (vcard1 != null)
            {
                vcard = vcard1;
                if (!jcarddatastreamlistenerimpl.versionFound)
                {
                    addWarning("No \"version\" property found.");
                    return vcard1;
                }
            }
        }
        return vcard;
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

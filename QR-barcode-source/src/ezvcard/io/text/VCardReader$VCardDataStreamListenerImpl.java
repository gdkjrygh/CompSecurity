// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.text;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.io.EmbeddedVCardException;
import ezvcard.io.SkipMeException;
import ezvcard.io.scribe.RawPropertyScribe;
import ezvcard.io.scribe.ScribeIndex;
import ezvcard.io.scribe.VCardPropertyScribe;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Address;
import ezvcard.property.Label;
import ezvcard.property.RawProperty;
import ezvcard.property.VCardProperty;
import ezvcard.util.IOUtils;
import ezvcard.util.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package ezvcard.io.text:
//            VCardReader

private class <init>
    implements <init>
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
                throw new t>();
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
            VCardReader.access$700(VCardReader.this, (new StringBuilder()).append("Skipping malformed line: \"").append(s).append("\"").toString());
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
            VCardReader.access$600(VCardReader.this, (new StringBuilder()).append("Ignoring invalid version value: ").append(s).toString(), "VERSION");
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
        VCardReader.access$200(VCardReader.this, vcardparameters);
        VCardReader.access$300(VCardReader.this, vcardparameters);
        s6 = VCardReader.access$400(VCardReader.this, s1, vcardparameters, s2);
        Object obj = VCardReader.access$500(VCardReader.this).getPropertyScribe(s1);
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
        vcardparameters = s2.parseText(s6, ((ezvcard.VCardDataType) (obj)), vcardversion, vcardparameters);
        for (s2 = vcardparameters._mth0().iterator(); s2.hasNext(); VCardReader.access$600(VCardReader.this, ((String) (obj)), s1))
        {
            obj = (String)s2.next();
        }

        break MISSING_BLOCK_LABEL_230;
        s;
        VCardReader.access$600(VCardReader.this, (new StringBuilder()).append("Property has requested that it be skipped: ").append(s.getMessage()).toString(), s1);
        return;
        s2 = vcardparameters._mth0();
        s2.setGroup(s);
        vcardparameters = s2;
        if (s2 instanceof Label)
        {
            labels.add((Label)s2);
            return;
        }
        break MISSING_BLOCK_LABEL_344;
        vcardparameters;
        VCardReader.access$600(VCardReader.this, (new StringBuilder()).append("Property value could not be parsed.  Property will be saved as an extended property instead.").append(StringUtils.NEWLINE).append("  Value: ").append(s6).append(StringUtils.NEWLINE).append("  Reason: ").append(vcardparameters.getMessage()).toString(), s1);
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
        for (s2 = s.getWarnings().iterator(); s2.hasNext(); VCardReader.access$600(VCardReader.this, (new StringBuilder()).append("Problem unmarshalling nested vCard value: ").append(s3).toString(), s1))
        {
            s3 = (String)s2.next();
        }

        IOUtils.closeQuietly(s);
        continue; /* Loop/switch isn't completed */
        s2;
        String s4;
        for (s2 = s.getWarnings().iterator(); s2.hasNext(); VCardReader.access$600(VCardReader.this, (new StringBuilder()).append("Problem unmarshalling nested vCard value: ").append(s4).toString(), s1))
        {
            s4 = (String)s2.next();
        }

        IOUtils.closeQuietly(s);
        if (true) goto _L2; else goto _L1
_L1:
        vcardparameters;
        String s5;
        for (s2 = s.getWarnings().iterator(); s2.hasNext(); VCardReader.access$600(VCardReader.this, (new StringBuilder()).append("Problem unmarshalling nested vCard value: ").append(s5).toString(), s1))
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


    private ()
    {
        this$0 = VCardReader.this;
        super();
        labels = new ArrayList();
        vcardStack = new LinkedList();
    }

    vcardStack(vcardStack vcardstack)
    {
        this();
    }
}

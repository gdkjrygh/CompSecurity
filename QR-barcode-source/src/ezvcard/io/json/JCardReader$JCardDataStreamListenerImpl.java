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
import ezvcard.util.StringUtils;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package ezvcard.io.json:
//            JCardReader, JCardValue

private class <init>
    implements <init>
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
        obj = ((ezvcard.io.scribe.ard) (obj)).ard();
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
                JCardReader.access$300(JCardReader.this, (new StringBuilder()).append("Version must be \"").append(VCardVersion.V4_0.getVersion()).append("\"").toString(), s1);
            }
            return;
        }
        VCardPropertyScribe vcardpropertyscribe = JCardReader.access$400(JCardReader.this).getPropertyScribe(s1);
        Object obj = vcardpropertyscribe;
        if (vcardpropertyscribe == null)
        {
            obj = new RawPropertyScribe(s1);
        }
        try
        {
            obj = ((VCardPropertyScribe) (obj)).parseJson(jcardvalue, vcarddatatype, vcardparameters);
            String s2;
            for (Iterator iterator = ((ezvcard.io.scribe.is._cls0) (obj))._mth0().iterator(); iterator.hasNext(); JCardReader.access$300(JCardReader.this, s2, s1))
            {
                s2 = (String)iterator.next();
            }

            break MISSING_BLOCK_LABEL_189;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            JCardReader.access$300(JCardReader.this, (new StringBuilder()).append("Property has requested that it be skipped: ").append(s.getMessage()).toString(), s1);
            return;
        }
        catch (CannotParseException cannotparseexception)
        {
            vcardparameters = (new RawPropertyScribe(s1)).parseJson(jcardvalue, vcarddatatype, vcardparameters)._mth0();
            vcardparameters.setGroup(s);
            s = (String)((RawProperty)vcardparameters).getValue();
            JCardReader.access$300(JCardReader.this, (new StringBuilder()).append("Property value could not be parsed.  Property will be saved as an extended property instead.").append(StringUtils.NEWLINE).append("  Value: ").append(s).append(StringUtils.NEWLINE).append("  Reason: ").append(cannotparseexception.getMessage()).toString(), s1);
            s = vcardparameters;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            JCardReader.access$300(JCardReader.this, "Property will not be unmarshalled because jCard does not supported embedded vCards.", s1);
            return;
        }
        while (false) ;
        if (true) goto _L2; else goto _L1
_L1:
    }



    private ()
    {
        this$0 = JCardReader.this;
        super();
        vcard = null;
        versionFound = false;
    }

    versionFound(versionFound versionfound)
    {
        this();
    }
}

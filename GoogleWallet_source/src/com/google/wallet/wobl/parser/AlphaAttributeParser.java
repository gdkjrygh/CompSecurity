// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.common.base.Optional;
import com.google.common.base.Strings;
import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.parser.reporter.ReportLevel;
import com.google.wallet.wobl.parser.reporter.Reporter;
import com.google.wallet.wobl.parser.xml.XmlAttribute;
import com.google.wallet.wobl.parser.xml.XmlElement;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AbstractAttributeParser, WoblParser, Attributes

class AlphaAttributeParser extends AbstractAttributeParser
{

    public static final float MAX_ALPHA = 1F;
    public static final float MIN_ALPHA = 0F;

    public AlphaAttributeParser(WoblParser woblparser)
    {
        super(woblparser);
    }

    public static Optional parse(String s)
        throws WoblMalformedDocException
    {
        if (Strings.isNullOrEmpty(s))
        {
            return Optional.absent();
        }
        float f;
        Optional optional;
        try
        {
            f = Float.valueOf(s).floatValue();
        }
        catch (NumberFormatException numberformatexception)
        {
            Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "Invalid alpha value: %s", new Object[] {
                s
            });
            return Optional.absent();
        }
        if (f <= 1.0F && f >= 0.0F)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "Invalid alpha value: %s", new Object[] {
            s
        });
        return Optional.absent();
        optional = Optional.of(Float.valueOf(f));
        return optional;
    }

    public void applyAttributesToIr(IntermediateRepresentation intermediaterepresentation, XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        xmlelement = Attributes.resolve("alpha", xmlelement, getWoblParser().getMetadata());
        if (xmlelement != null)
        {
            intermediaterepresentation.setAlpha(parse(xmlelement.getString()));
        }
    }
}
